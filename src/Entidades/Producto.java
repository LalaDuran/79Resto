package Entidades;

public class Producto {

    private int idProducto;
    private String nombre;
    private int cant_stock;
    private double precio;
    private boolean estado;

    public Producto() {
    }

    public Producto(String nombre, int cant_stock, double precio, boolean estado) {
        this.nombre = nombre;
        this.cant_stock = cant_stock;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto(int idProducto, String nombre, int cant_stock, double precio, boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cant_stock = cant_stock;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_stock() {
        return cant_stock;
    }

    public void setCant_stock(int cant_stock) {
        this.cant_stock = cant_stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idProducto + " - " + nombre + ", $" + precio;
    }
    
}
