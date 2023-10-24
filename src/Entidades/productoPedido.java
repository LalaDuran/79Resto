
package Entidades;

public class productoPedido {
    
    private Producto producto;
    private int cantPedida;
    private Pedido pedido;
    private double precio;


    public productoPedido() {
    }

    public productoPedido(Producto producto, int cantPedida, Pedido pedido, double precio) {
        this.producto = producto;
        this.cantPedida = cantPedida;
        this.pedido = pedido;
        this.precio = precio;
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
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
