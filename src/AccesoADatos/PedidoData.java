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
        String sql = "INSERT INTO pedido (idMesa,idMesero,cobrado,fecha_hora,entregado) VALUES (?,?,?,?,?)";
        

       // ProductoData pd = new ProductoData();

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el 
            //idPedido que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2, pedido.getMesero().getIdMesero());

            ps.setBoolean(3, false);
            ps.setTimestamp(4, pedido.getFecha_hora());
            ps.setBoolean(5, false);

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el idPedido generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();
            //           Timestamp timestamp = rs.getTimestamp("tu_campo_datetime");
            //Asignamos el id generado 
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido guardado");
            }
            //         }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
    }
     public void modificarPedido(Pedido p) {

        String sql = "UPDATE pedido SET idMesa=?, idMesero=?,cobrado=?, fecha_hora=?, entregado=? WHERE idPedido = ?";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setInt(1, p.getMesa().getIdMesa());
            ps.setInt(2, p.getMesero().getIdMesero());
            ps.setBoolean(3, p.isCobrado());
            ps.setTimestamp(4,p.getFecha_hora());
            ps.setBoolean(5, p.isEntregado());
            ps.setInt(6, p.getIdPedido());
            
            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido modificado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }

    }

    public void cobrar(int id) {
        String sql = "UPDATE pedido SET cobrado = 1 WHERE idPedido = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido cobrado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
    }
    
    

    public void entregar(int id) {
        String sql = "UPDATE pedido SET entregado = 1 WHERE idPedido = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido Entregado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
    }
    
    
    public void eliminarPedido(int id) {
        String sql = "DELETE FROM pedido WHERE idPedido = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido cancelado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
    }
    
    public List<Pedido> listarPedidos() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idPedido,idMesa,idMesero,cobrado,fecha_hora, entregado FROM pedido";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos mesaABuscar y seteamos
                Pedido pedidoABuscar = new Pedido();
                MesaData md = new MesaData();
                MeseroData mesero = new MeseroData();
                pedidoABuscar.setIdPedido(rs.getInt("idPedido"));
                pedidoABuscar.setMesa(md.buscarMesaPorID(rs.getInt("idMesa")));
                pedidoABuscar.setMesero(mesero.buscarMeseroPorID(rs.getInt("idMesero")));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                pedidoABuscar.setFecha_hora(rs.getTimestamp("fecha_hora"));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));

                //Agregamos la mesa al arraylist
                pedidos.add(pedidoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return pedidos;
    }

    public List<Pedido> listarPedidosCobrados() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idPedido,idMesa,idMesero,cobrado,fecha_hora, entregado FROM pedido WHERE cobrado = 1";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Pedido> pedidosCobrados = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos mesaABuscar y seteamos
                Pedido pedidoABuscar = new Pedido();
                MesaData md = new MesaData();
                MeseroData mesero = new MeseroData();
                
                pedidoABuscar.setIdPedido(rs.getInt("idPedido"));
                pedidoABuscar.setMesa(md.buscarMesaPorID(rs.getInt("idMesa")));
                pedidoABuscar.setMesero(mesero.buscarMeseroPorID(rs.getInt("idMesero")));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                pedidoABuscar.setFecha_hora(rs.getTimestamp("fecha_hora"));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));

                //Agregamos la mesa al arraylist
                pedidosCobrados.add(pedidoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return pedidosCobrados;
    }

    public List<Pedido> listarPedidosPendientesDeCobro() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idPedido,idMesa,idMesero,cobrado,fecha_hora, entregado FROM pedido WHERE cobrado = 0";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Pedido> pedidosNoCobrados = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos mesaABuscar y seteamos
                Pedido pedidoABuscar = new Pedido();
                MesaData md = new MesaData();
                MeseroData mesero = new MeseroData();
                
                pedidoABuscar.setIdPedido(rs.getInt("idPedido"));
                pedidoABuscar.setMesa(md.buscarMesaPorID(rs.getInt("idMesa")));
                pedidoABuscar.setMesero(mesero.buscarMeseroPorID(rs.getInt("idMesero")));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                pedidoABuscar.setFecha_hora(rs.getTimestamp("fecha_hora"));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));

                //Agregamos la mesa al arraylist
                pedidosNoCobrados.add(pedidoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return pedidosNoCobrados;
    }
    
    public List<Pedido> listarPedidosEliminados() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idPedido,idMesa,idMesero,cobrado,fecha_hora, entregado FROM pedido WHERE estado = 0";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Pedido> pedidosEliminados = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos mesaABuscar y seteamos
                Pedido pedidoABuscar = new Pedido();
                MesaData md = new MesaData();
                MeseroData mesero = new MeseroData();
                
                pedidoABuscar.setIdPedido(rs.getInt("idPedido"));
                pedidoABuscar.setMesa(md.buscarMesaPorID(rs.getInt("idMesa")));
                pedidoABuscar.setMesero(mesero.buscarMeseroPorID(rs.getInt("idMesero")));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                pedidoABuscar.setFecha_hora(rs.getTimestamp("fecha_hora"));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));

                //Agregamos la mesa al arraylist
                pedidosEliminados.add(pedidoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return pedidosEliminados;
    }
    
    public List<Pedido> listarPedidosPorMesaYFecha(Mesa mesa, Timestamp fechaInicial, Timestamp fechaFinal) {
        String sql = "SELECT idPedido,idMesero,cobrado,entregado FROM pedido WHERE idMesa = ? AND fecha_hora BETWEEN ? AND ?";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Pedido> pedidosPorMesaYFecha = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, mesa.getIdMesa());
            ps.setTimestamp(2, fechaInicial);
            ps.setTimestamp(3, fechaFinal);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos pedidoABuscar y seteamos
                Pedido pedidoABuscar = new Pedido();
                MesaData md = new MesaData();
                MeseroData mesero = new MeseroData();
                
                pedidoABuscar.setIdPedido(rs.getInt("idPedido"));
                pedidoABuscar.setMesero(mesero.buscarMeseroPorID(rs.getInt("idMesero")));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                
                //Agregamos el pedido al arraylist
                pedidosPorMesaYFecha.add(pedidoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return pedidosPorMesaYFecha;
    }
    
    public List<Pedido> listarPedidosPorMesero(Mesero mesero) {
        String sql = "SELECT idPedido,idMesa,cobrado,entregado FROM pedido WHERE idMesero = ?";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Pedido> pedidosPorMesero = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, mesero.getIdMesero());

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos pedidoABuscar y seteamos
                Pedido pedidoABuscar = new Pedido();
                MesaData mesaD = new MesaData();
                
                pedidoABuscar.setIdPedido(rs.getInt("idPedido"));
                pedidoABuscar.setMesa(mesaD.buscarMesaPorID(rs.getInt("idMesa")));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                
                //Agregamos el pedido al arraylist
                pedidosPorMesero.add(pedidoABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return pedidosPorMesero;
    }
    
    public void agregarProductos(Producto prod) {

        Pedido pedido = new Pedido();

        listaDeProductos.add(prod);

    }

    public void sacarProductos(Producto prod) {

        listaDeProductos.remove(prod);

    }

    public Pedido buscarPedidoPorID(int id) {
        String sql = "SELECT idMesa,idMesero,cobrado,fecha_hora,entregado FROM pedido WHERE idPedido = ?  ";
        //Creamos un pedido en null para setearlo luego
        Pedido pedidoABuscar = null;
        MesaData mesaD = new MesaData();
        MeseroData meseroD = new MeseroData();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos pedidoABuscar y seteamos
                pedidoABuscar = new Pedido();
                pedidoABuscar.setIdPedido(id);
                pedidoABuscar.setMesa(mesaD.buscarMesaPorID(rs.getInt("idMesa")));
                pedidoABuscar.setMesero(meseroD.buscarMeseroPorID(rs.getInt("idMesero")));
                pedidoABuscar.setCobrado(rs.getBoolean("cobrado"));
                pedidoABuscar.setFecha_hora(rs.getTimestamp("fecha_hora"));
                pedidoABuscar.setEntregado(rs.getBoolean("entregado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe pedido con ese ID");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'pedido'");
        }
        return pedidoABuscar;
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
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
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
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return productos;
    }
}
