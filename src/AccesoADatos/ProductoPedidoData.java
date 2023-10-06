/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;

/**
 *
 * @author Faustino
 */
public class ProductoPedidoData {
    
    private Connection con = null;

    public ProductoPedidoData() {
        //inicializa la variable con
        con = Conexion.getConexion();
    }
    
    
    
}
