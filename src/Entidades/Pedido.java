package Entidades;

import java.sql.Timestamp;
import java.util.*;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private List <Producto> productos;
    private Mesero mesero;
    private boolean entregado;
    private boolean cobrado;
    private Timestamp fecha_hora;

    public Pedido() {
    }

    public Pedido(Mesa mesa, List Producto, Mesero mesero, boolean entregado, boolean cobrado, Timestamp fecha_hora) {
        this.mesa = mesa;
        this.productos = new ArrayList<>();
        this.mesero = mesero;
        this.entregado = entregado;
        this.cobrado = cobrado;
        this.fecha_hora = fecha_hora;
    }

    public Pedido(int idPedido, Mesa mesa, List Producto, Mesero mesero, boolean entregado, boolean cobrado,Timestamp fecha_hora) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.productos = new ArrayList<>();
        this.mesero = mesero;
        this.entregado = entregado;
        this.cobrado = cobrado;
        this.fecha_hora = fecha_hora;
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

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    public Timestamp getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Timestamp fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "Pedido " +idPedido;
    }
    
}
