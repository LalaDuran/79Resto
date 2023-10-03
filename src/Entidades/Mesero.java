package Entidades;

public class Mesero {

    private int idMesero;
    private String apellido;
    private String nombre;
    private int dni;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(String apellido, String nombre, int dni, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
    }

    public Mesero(int idMesero, String apellido, String nombre, int dni, boolean estado) {
        this.idMesero = idMesero;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesera/o " + idMesero + '\n'+ apellido + ", " + nombre + " - " + dni + ", est. " + estado;
    }
    

}
