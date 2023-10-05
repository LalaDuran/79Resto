
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
//    pd.guardarProducto(panchito);
    pedData.agregarProductos(panchito);
    Mesa mesa1 = new Mesa(2,true,8);
    mesaData.guardarMesa(mesa1);
//       md.guardarMesero(mesero);
    
    Pedido inicial = new Pedido(mesa1,pd.listarProducto(),mesero,SituacionPedido.PENDIENTE,false);
    
    pedData.guardarPedido(inicial);
    
    
    }
    
    
    
}
