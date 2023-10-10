
package AccesoADatos;

import Entidades.Mesa;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class MesaData {
    
    //atributo común a todos los Data
    private Connection con = null;
    
    public MesaData() {
        //inicializa la variable con
        con = Conexion.getConexion();
    }
    
    public void guardarMesa(Mesa mesa) {
        String sql = "INSERT INTO mesa (capacidad,estado,numero) VALUES (?,?,?)";

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el 
            //idMesa que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, true);
            ps.setInt(3,mesa.getNumero());

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el id_alumno generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();

            //Asignamos el id generado 
            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa guardada");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesa'");
        }
    }
    
    public void modificarMesa(Mesa mesa) {
        String sql = "UPDATE mesa SET capacidad = ?, numero = ?, estado = ?, ocupada = ? WHERE idMesa = ?";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setInt(1, mesa.getCapacidad());
            ps.setInt(2, mesa.getNumero());
            ps.setBoolean(3,mesa.isEstado());
            ps.setBoolean(4,mesa.isOcupada());
            ps.setInt(5, mesa.getIdMesa());
            
            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa modificada");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesa'");
        }
    }
    
    public void eliminarMesa(int id) {
        String sql = "UPDATE mesa SET estado = 0 WHERE idMesa = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa ocupada");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesa'");
        }
    }
    
    
    public Mesa buscarMesaPorID(int id) {
        String sql = "SELECT capacidad,estado,numero,ocupada FROM mesa WHERE idMesa = ?  ";
        //Creamos una mesa en null para setearla luego
        Mesa mesaABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos mesaABuscar y seteamos
                mesaABuscar = new Mesa();
                mesaABuscar.setIdMesa(id);
                mesaABuscar.setCapacidad(rs.getInt("capacidad"));
                mesaABuscar.setEstado(rs.getBoolean("estado"));
                mesaABuscar.setOcupada(rs.getBoolean("ocupada"));
                mesaABuscar.setNumero(rs.getInt("numero"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe mesa con ese ID");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesa'");
        }
        return mesaABuscar;
    }
    
    public List<Mesa> listarMesa() {
        //Sacamos 'estado' del WHERE igual que método anterior
        String sql = "SELECT idMesa,capacidad,estado,numero,ocupada FROM mesa ";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos mesaABuscar y seteamos
                Mesa mesaABuscar = new Mesa();
                mesaABuscar.setIdMesa(rs.getInt("idMesa"));
                mesaABuscar.setCapacidad(rs.getInt("capacidad"));
                mesaABuscar.setEstado(rs.getBoolean("estado"));
                mesaABuscar.setOcupada(rs.getBoolean("ocupada"));
                mesaABuscar.setNumero(rs.getInt("numero"));

                //Agregamos la mesa al arraylist
                mesas.add(mesaABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'mesa'");
        }
        return mesas;
    }
}
