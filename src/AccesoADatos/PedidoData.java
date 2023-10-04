package AccesoADatos;

import Entidades.Pedido;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;

public class PedidoData {

    //atributo común a todos los Data
    private Connection con = null;

    public PedidoData() {
        //inicializa la variable con
        con = Conexion.getConexion();
    }

    public void guardarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedido (idMesa,idMesero,estado) VALUES (?,?,?)";
        String sql2 = "INSERT INTO productosPedidos (idProducto,cantidad,idPedido) VALUES (?,?,?)";

        List<Producto> productos = new ArrayList<>();

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el 
            //idPedido que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setBoolean(3, true);

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el id_alumno generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();

            // Ejecutamos el sql2 para darle contenido al pedido
            for (Producto aux : productos) {
                try {
                    //Prepara el comando SQL2 con RETURN GENERATED KEYS para que devuelva el id que es generado autoincremental
                    PreparedStatement ps2 = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
                    //Asignamos los valores a los parámetros dinámicos 
                    ps2.setInt(1, aux.getIdProducto());
                    ps2.setInt(2, aux.getCantidad());
                    //ps2.setInt(3, aux.g) 
                    //Ejecutamos el comando SQL
                    ps2.executeUpdate();

                    //Recuperamos el id_alumno generado autoincremental
                    ResultSet rs2 = ps2.getGeneratedKeys();

                    //Asignamos el id generado 
                    if (rs2.next()) {
                        pedido.setIdPedido(rs.getInt(1));
                        JOptionPane.showMessageDialog(null, "Pedido guardado");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");

                }
            }
                //Asignamos el id generado 
                if (rs.next()) {
                    pedido.setIdPedido(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Pedido guardado");
                }

                //Liberamos recursos
                ps.close();
                

            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
        }

    }
