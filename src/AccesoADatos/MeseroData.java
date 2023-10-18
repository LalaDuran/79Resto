package AccesoADatos;

import Entidades.Mesa;
import Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MeseroData {

    //atributo común a todos los Data
    private Connection con = null;

    public MeseroData() {
        //inicializa la variable con
        con = Conexion.getConexion();
    }

    public void guardarMesero(Mesero mesero) {
        String sql = "INSERT INTO mesero (apellido,nombre,dni,estado) VALUES (?,?,?,?)";

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el 
            //idMesa que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setString(1, mesero.getApellido());
            ps.setString(2, mesero.getNombre());
            ps.setInt(3, mesero.getDni());
            ps.setBoolean(4, true);

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el id_alumno generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();

            //Asignamos el id generado 
            if (rs.next()) {
                mesero.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesera/o guardada/o");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        } catch (NullPointerException ex){
            
        }
    }

    public void modificarMesero(Mesero mesero) {
        String sql = "UPDATE mesero SET apellido = ?, nombre = ?, dni = ?, estado = ? WHERE idMesero = ?";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setString(1, mesero.getApellido());
            ps.setString(2, mesero.getNombre());
            ps.setInt(3, mesero.getDni());
            ps.setBoolean(4, mesero.isEstado());
            ps.setInt(5, mesero.getIdMesero());

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesera/o modificada/o");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        }
    }

    public void eliminarMesero(int id) {
        String sql = "UPDATE mesero SET estado = 0 WHERE idMesero = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesera/o eliminada/o");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        }
    }

    public void actualizarMesero(int id) {
        String sql = "UPDATE mesero SET estado = 1 "
                + "WHERE idMesero = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesera/o actualizada/o");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
    }

    public Mesero buscarMeseroPorID(int id) {
        String sql = "SELECT apellido, nombre, dni, estado FROM mesero WHERE idMesero = ?";
        //Creamos un mesero en null para setearlo luego
        Mesero meseroABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos alumnoABuscar y seteamos
                meseroABuscar = new Mesero();
                meseroABuscar.setIdMesero(id);
                meseroABuscar.setApellido(rs.getString("apellido"));
                meseroABuscar.setNombre(rs.getString("nombre"));
                meseroABuscar.setDni(rs.getInt("dni"));
                meseroABuscar.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe mesera/o con ese ID");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return meseroABuscar;
    }

    public Mesero buscarMeseroPorDni(int dni) {
        //Sacamos 'estado' de WHERE para poder visualizar activos y no activos
        String sql = "SELECT idMesero, dni, apellido, nombre, estado FROM mesero WHERE dni = ? ";

        //Creamos un mesero en null para setearlo luego
        Mesero meseroABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, dni);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos alumnoABuscar y seteamos
                meseroABuscar = new Mesero();
                meseroABuscar.setIdMesero(rs.getInt("idMesero"));
                //Tambien se puede poner alumnoABuscar.setDni(dni); porque lo tenemos por parametro.
                meseroABuscar.setDni(rs.getInt("dni"));
                meseroABuscar.setApellido(rs.getString("apellido"));
                meseroABuscar.setNombre(rs.getString("nombre"));
                meseroABuscar.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe mesera/o con ese DNI");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return meseroABuscar;
    }
    
    public List<Mesero> listarMesero() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idMesero, dni, apellido, nombre, estado FROM mesero ";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Mesero> meseros = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos alumnoABuscar y seteamos
                Mesero meseroABuscar = new Mesero();
                meseroABuscar.setIdMesero(rs.getInt("idMesero"));
                meseroABuscar.setDni(rs.getInt("dni"));
                meseroABuscar.setApellido(rs.getString("apellido"));
                meseroABuscar.setNombre(rs.getString("nombre"));
                meseroABuscar.setEstado(rs.getBoolean("estado"));

                //Agregamos el alumno al arraylist
                meseros.add(meseroABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesero'");
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor conectese a la base de datos");
        }
        return meseros;
    }
    
    
    
    
}
