/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Faustino
 */
public class productoPedido {
    
    private Producto producto;
    private int cantPedida;
    private Pedido pedido;

    public productoPedido() {
    }

    public productoPedido(Producto producto, int cantPedida, Pedido pedido) {
        this.producto = producto;
        this.cantPedida = cantPedida;
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantPedida() {
        return cantPedida;
    }

    public void setCantPedida(int cantPedida) {
        this.cantPedida = cantPedida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
