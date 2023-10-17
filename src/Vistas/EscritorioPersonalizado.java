/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author Faustino
 */
public class EscritorioPersonalizado extends JDesktopPane{
     private BufferedImage img;
     
     public EscritorioPersonalizado() {
        try {                           
            img = ImageIO.read(getClass().getResourceAsStream("/Images/bar_1.png"));            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0,1000,600,this);
     }
    
}
