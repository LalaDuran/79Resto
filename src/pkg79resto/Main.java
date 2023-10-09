
package pkg79resto;

import AccesoADatos.*;
import Entidades.*;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Mesero mesero = new Mesero(2,"Lujan","Jaun",44489201,true);
        MeseroData md = new MeseroData();
        ProductoData pd = new ProductoData();
        PedidoData pedData = new PedidoData();
        MesaData mesaData = new MesaData();
        
     
//        md.modificarMesero(mesero);
    
   Producto panchito = new Producto("Panchito",3,500,true);
    Producto salame = new Producto("Salame",4,700,true);
//    pd.guardarProducto(panchito);
//
    pedData.agregarProductos(panchito);
   pedData.agregarProductos(salame);
//    pd.guardarProducto(salame);
    Mesa mesa1 = new Mesa(2,true,8,true);
    mesaData.guardarMesa(mesa1);
//       md.guardarMesero(mesero);
//    
   Pedido inicial = new Pedido(mesa1,pedData.listarProductosPedidos(),mesero,SituacionPedido.PENDIENTE,false);
   Pedido dos = new Pedido(mesa1,pedData.listarProductosPedidos(),mesero,SituacionPedido.PENDIENTE,false);
   productoPedido p= new productoPedido();
       
//    
    pedData.guardarPedido(inicial,p);
    
    
    
    
    
    }
    
    
    
}
