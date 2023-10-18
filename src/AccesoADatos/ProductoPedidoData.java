/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Producto;
import Entidades.productoPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Faustino
 */
public class ProductoPedidoData {

    private Connection con = null;

    public ProductoPedidoData() {
        //inicializa la variable con
        con = Conexion.getConexion();
    }

    public void agregarProductos(productoPedido pp) {

        String sql2 = "INSERT INTO productosPedidos (idProducto,cantidadPedida,idPedido) VALUES (?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql2);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setInt(1, pp.getProducto().getIdProducto());

            ps.setInt(2, pp.getCantPedida());
            ps.setInt(3, pp.getPedido().getIdPedido());
            

            //Ejecutamos el comando SQL
            ps.executeUpdate();
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'productospedidos'");

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            JOptionPane.showMessageDialog(null, "Error: lista vacía");
        }
        
    }
    
    public void modificarProdPed(productoPedido pp){
        
        String sql = "UPDATE productospedidos SET cantidadPedida = ? WHERE idProducto = ? AND idPedido = ?";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setInt(1, pp.getCantPedida());
            ps.setInt(2, pp.getProducto().getIdProducto());
            ps.setInt(3, pp.getPedido().getIdPedido());
            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'producto'");
        }
        
    }
    
    public void eliminarProductoPedido(int id) {
        String sql = "DELETE FROM productospedidos WHERE idProducto = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'productospedidos'");
        }
    }
    
     public List<productoPedido> listarProductoPedidoPorIdDePedido(int id) {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT * FROM productospedidos WHERE idPedido = ?";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<productoPedido> productos = new ArrayList<>();
        ProductoData pd = new ProductoData();
        PedidoData pedD = new PedidoData();
        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos alumnoABuscar y seteamos
                productoPedido productoABuscar = new productoPedido();
                productoABuscar.setProducto(pd.buscarProductoPorID(rs.getInt("idProducto")));
                productoABuscar.setPedido(pedD.buscarPedidoPorID(rs.getInt("idPedido")));
                productoABuscar.setCantPedida(rs.getInt("cantidadPedida"));
       //         System.out.println(rs.getInt("idProducto"));
                ;

                //Agregamos el alumno al arraylist
                productos.add(productoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'productospedidos'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return productos;
    }

}
