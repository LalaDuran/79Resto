package Entidades;

import java.util.List;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private List <Producto> productos;
    private Mesero mesero;
    private boolean estado;

    public Pedido() {
    }

    public Pedido(Mesa mesa, List Producto, Mesero mesero, boolean estado) {
        this.mesa = mesa;
        this.Producto = Producto;
        this.mesero = mesero;
        this.estado = estado;
    }

    public Pedido(int idPedido, Mesa mesa, List Producto, Mesero mesero, boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.Producto = Producto;
        this.mesero = mesero;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List getProducto() {
        return Producto;
    }

    public void setProducto(List Productos) {
        this.Producto = Productos;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido "+ idPedido + " - mesa " + mesa + " - mesera/o " + mesero + ", est. " + estado;
    }
    
}
