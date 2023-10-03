
package pkg79resto;

import AccesoADatos.MeseroData;
import Entidades.Mesero;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Mesero mesero = new Mesero(2,"Lujan","Jaun",44489201,true);
        MeseroData md = new MeseroData();
        
//        md.guardarMesero(mesero);
        md.modificarMesero(mesero);
    }
    
}
