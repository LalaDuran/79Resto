package Entidades;

import java.util.*;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private List <Producto> productos;
    private Mesero mesero;
    private SituacionPedido situacion;
    private boolean estado;

    public Pedido() {
    }

    public Pedido(Mesa mesa, List Producto, Mesero mesero, SituacionPedido situacion, boolean estado) {
        this.mesa = mesa;
        this.productos = new ArrayList<>();
        this.mesero = mesero;
        this.situacion = situacion;
        this.estado = estado;
    }

    public Pedido(int idPedido, Mesa mesa, List Producto, Mesero mesero,SituacionPedido situacion, boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.productos = new ArrayList<>();
        this.mesero = mesero;
        this.situacion = situacion;
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

    public List getProductos() {
        return productos;
    }

    public void setProductos(List productos) {
        this.productos = productos;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public SituacionPedido getSituacion() {
        return situacion;
    }

    public void setSituacion(SituacionPedido situacion) {
        this.situacion = situacion;
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
