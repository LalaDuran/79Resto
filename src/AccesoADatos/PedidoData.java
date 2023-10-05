package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class PedidoData {

    //atributo común a todos los Data
    private Connection con = null;
    private List<Producto> listaDeProductos = new ArrayList<>();
    

    public PedidoData() {
        //inicializa la variable con
        con = Conexion.getConexion();
        
    }

    public void guardarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedido (idMesa,idMesero,cobrado) VALUES (?,?,?)";
        String sql2 = "INSERT INTO productosPedidos (idProducto,cantidadPedida,idPedido) VALUES (?,?,?)";

        ProductoData pd = new ProductoData();

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

             //Asignamos el id generado 
            if (rs.next()) {
                    pedido.setIdPedido(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Pedido guardado");
                }
            // Ejecutamos el sql2 para darle contenido al pedido
            for (Producto aux : listaDeProductos ) {
                try {
                    //Prepara el comando SQL2 con RETURN GENERATED KEYS para que devuelva el id que es generado autoincremental
                    PreparedStatement ps2 = con.prepareStatement(sql2);
                    //Asignamos los valores a los parámetros dinámicos 
                    ps2.setInt(1, aux.getIdProducto());
                    System.out.println(aux.getIdProducto());
                    ps2.setInt(2, aux.getCant_stock());
                    ps2.setInt(3, pedido.getIdPedido());
                    System.out.println(pedido.getIdPedido());
                    
                    
                    //Ejecutamos el comando SQL
                    ps2.executeUpdate();

//                    //Recuperamos el id_alumno generado autoincremental
//                    ResultSet rs2 = ps2.getGeneratedKeys();
//
//                    //Asignamos el id generado 
//                    if (rs2.next()) {
////                        pedido.setIdPedido(rs2.getInt(1));
//                        JOptionPane.showMessageDialog(null, "Pedido guardado");
//                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
                
                } catch (ArrayIndexOutOfBoundsException aioobe){
                    JOptionPane.showMessageDialog(null,"Error: lista vacía");
        }
            }
               
                

                //Liberamos recursos
                ps.close();
                

            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
    }

    public void agregarProductos(Producto prod){
        
        listaDeProductos.add(prod);
        
        
    }
     public List<Producto> listarProductoPedido() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idProducto FROM ";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Producto> productos = new ArrayList<>();

       
        return productos;
    }

    }
    
    

