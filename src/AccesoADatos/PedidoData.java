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

    public void guardarPedido(Pedido pedido, productoPedido pp) {
        String sql = "INSERT INTO pedido (idMesa,idMesero,cobrado,fecha_hora) VALUES (?,?,?,?)";
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
 //           Timestamp timestamp = rs.getTimestamp("tu_campo_datetime");
            //Asignamos el id generado 
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido guardado");
            }

            // Ejecutamos el sql2 para darle contenido al pedido
    //        for (Producto aux : listarProductoPedidoPorIdDePedido(pedido.getIdPedido())) {
                try {
                   
                    PreparedStatement ps2 = con.prepareStatement(sql2);
                    //Asignamos los valores a los parámetros dinámicos 
                    ps2.setInt(1, pp.getProducto().getIdProducto());
// usados para corroborar la eficiencia   System.out.println(aux.getIdProducto());
                    ps2.setInt(2, pp.getCantPedida());
                    ps2.setInt(3, pedido.getIdPedido());
//                System.out.println(pedido.getIdPedido());

                    //Ejecutamos el comando SQL
                    ps2.executeUpdate();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");

                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    JOptionPane.showMessageDialog(null, "Error: lista vacía");
                }
   //         }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
    }
    
    

    public void agregarProductos(Producto prod) {

        listaDeProductos.add(prod);

    }
    
    public void sacarProductos(Producto prod){
        
        listaDeProductos.remove(prod);
        
    }

    public List<Producto> listarProductoPedidoPorIdDePedido(int id) {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT * FROM productospedidos WHERE idPedido = ?";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Producto> productos = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos alumnoABuscar y seteamos
                Producto productoABuscar = new Producto();
                productoABuscar.setIdProducto(rs.getInt("idProducto"));
       //         System.out.println(rs.getInt("idProducto"));
                ;

                //Agregamos el alumno al arraylist
                productos.add(productoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'productospedidos'");
        }
        return productos;
    }

    public List<Producto> listarProductosPedidos() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT * FROM productospedidos";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Producto> productos = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos alumnoABuscar y seteamos
                Producto productoABuscar = new Producto();
                productoABuscar.setIdProducto(rs.getInt("idProducto"));
                System.out.println(rs.getInt("idProducto"));
                ;

                //Agregamos el alumno al arraylist
                productos.add(productoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'productospedidos'");
        }
        return productos;
    }
}
