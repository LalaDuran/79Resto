package AccesoADatos;

import Entidades.Producto;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ProductoData {

    //atributo común a todos los Data
    private Connection con = null;

    public ProductoData() {
        //inicializa la variable con
        con = Conexion.getConexion();
    }

    public void guardarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombre,cant_stock,precio,estado) VALUES (?,?,?,?)";

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el 
            //id que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCant_stock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, true);

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el id generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();

            //Asignamos el id generado 
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto guardado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'producto'");
        }
    }

    public void modificarProducto(Producto prod) {
        String sql = "UPDATE producto SET nombre = ?, cant_stock = ?, precio = ?, estado = ? WHERE idProducto = ?";

        System.out.println("hola");
        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setString(1, prod.getNombre());
            ps.setInt(2, prod.getCant_stock());
            ps.setDouble(3, prod.getPrecio());
            ps.setBoolean(4, prod.isEstado());
            ps.setInt(5, prod.getIdProducto());

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

    public void eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado = 0, cant_stock = 0 WHERE idProducto = ? ";

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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'producto'");
        }
    }

    
    public Producto buscarProductoPorID(int id) {
        String sql = "SELECT nombre, cant_stock, precio, estado FROM producto WHERE idProducto = ?";
        
        //Creamos un producto en null para setearlo luego
        Producto productoABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos productoABuscar y seteamos
                productoABuscar = new Producto();
                
                productoABuscar.setIdProducto(id);
                productoABuscar.setNombre(rs.getString("nombre"));
                productoABuscar.setCant_stock(rs.getInt("cant_stock"));
                productoABuscar.setPrecio(rs.getDouble("precio"));
                productoABuscar.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe producto con ese ID");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'producto'");
        }
        return productoABuscar;
    }

    
    public List<Producto> listarProducto() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idProducto, nombre, cant_stock, precio, estado FROM producto ";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Producto> productos = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos productoABuscar y seteamos
                Producto productoABuscar = new Producto();
                
                productoABuscar.setIdProducto(rs.getInt("idProducto"));
                productoABuscar.setNombre(rs.getString("nombre"));
                productoABuscar.setCant_stock(rs.getInt("cant_stock"));
                productoABuscar.setPrecio(rs.getDouble("precio"));
                productoABuscar.setEstado(rs.getBoolean("estado"));

                //Agregamos el producto al arraylist
                productos.add(productoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'producto'");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return productos;
    }
}
