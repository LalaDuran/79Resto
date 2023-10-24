package Vistas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class EscritorioPersonalizado extends JDesktopPane {

    private BufferedImage img;

    public EscritorioPersonalizado() {
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/Images/bar_1.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, 1000, 600, this);
    }

}
