/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author morena
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        //Abre la ventana del menú en el centro
        this.setLocationRelativeTo(null);

        //Impide que se modifique el tamaño de la ventana
        this.setResizable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        ABMmesas = new javax.swing.JMenuItem();
        listadoMesas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ABMproductos = new javax.swing.JMenuItem();
        listadoProductos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ABMPedidos = new javax.swing.JMenuItem();
        listadoPedidos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        ABMmeseros = new javax.swing.JMenuItem();
        listadoMeseros = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 535));

        escritorio.setPreferredSize(new java.awt.Dimension(1000, 1055));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        jMenu2.setText("Mesas");

        ABMmesas.setText("ABM  de Mesas");
        ABMmesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABMmesasActionPerformed(evt);
            }
        });
        jMenu2.add(ABMmesas);

        listadoMesas.setText("Listado de Mesas");
        listadoMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoMesasActionPerformed(evt);
            }
        });
        jMenu2.add(listadoMesas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Productos");

        ABMproductos.setText("ABM de Productos");
        ABMproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABMproductosActionPerformed(evt);
            }
        });
        jMenu3.add(ABMproductos);

        listadoProductos.setText("Listado de Productos");
        listadoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoProductosActionPerformed(evt);
            }
        });
        jMenu3.add(listadoProductos);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Pedidos");

        ABMPedidos.setText("ABM de Pedidos");
        ABMPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABMPedidosActionPerformed(evt);
            }
        });
        jMenu5.add(ABMPedidos);

        listadoPedidos.setText("Listado de Pedidos");
        listadoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoPedidosActionPerformed(evt);
            }
        });
        jMenu5.add(listadoPedidos);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Staff");

        ABMmeseros.setText("ABM de Meseros");
        ABMmeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABMmeserosActionPerformed(evt);
            }
        });
        jMenu6.add(ABMmeseros);

        listadoMeseros.setText("Listado de Meseros");
        listadoMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoMeserosActionPerformed(evt);
            }
        });
        jMenu6.add(listadoMeseros);

        jMenuBar1.add(jMenu6);

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ABMmesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABMmesasActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ABMMesas abmmesas = new ABMMesas(); //instancia la ventana (aún invis.)
        abmmesas.setVisible(true); //la hace visible
        escritorio.add(abmmesas); //la agrega al escritorio
        escritorio.moveToFront(abmmesas); //la abre y trae adelante
    }//GEN-LAST:event_ABMmesasActionPerformed

    private void listadoMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoMesasActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ListadoMesas lmesas = new ListadoMesas(); //instancia la ventana (aún invis.)
        lmesas.setVisible(true); //la hace visible
        escritorio.add(lmesas); //la agrega al escritorio
        escritorio.moveToFront(lmesas); //la abre y trae adelante
    }//GEN-LAST:event_listadoMesasActionPerformed

    private void ABMproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABMproductosActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ABMProductos abmprod = new ABMProductos(); //instancia la ventana (aún invis.)
        abmprod.setVisible(true); //la hace visible
        escritorio.add(abmprod); //la agrega al escritorio
        escritorio.moveToFront(abmprod); //la abre y trae adelante
    }//GEN-LAST:event_ABMproductosActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        //Llama al método para cerrar la aplicación completa
        cerrar();
    }//GEN-LAST:event_salirMouseClicked

    private void listadoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoProductosActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ListadoProductos lprod = new ListadoProductos(); //instancia la ventana (aún invis.)
        lprod.setVisible(true); //la hace visible
        escritorio.add(lprod); //la agrega al escritorio
        escritorio.moveToFront(lprod); //la abre y trae adelante
    }//GEN-LAST:event_listadoProductosActionPerformed

    private void ABMPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABMPedidosActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ABMPedidos abmped = new ABMPedidos(); //instancia la ventana (aún invis.)
        abmped.setVisible(true); //la hace visible
        escritorio.add(abmped); //la agrega al escritorio
        escritorio.moveToFront(abmped); //la abre y trae adelante
    }//GEN-LAST:event_ABMPedidosActionPerformed

    private void listadoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoPedidosActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ListadoPedidos lped = new ListadoPedidos(); //instancia la ventana (aún invis.)
        lped.setVisible(true); //la hace visible
        escritorio.add(lped); //la agrega al escritorio
        escritorio.moveToFront(lped); //la abre y trae adelante
    }//GEN-LAST:event_listadoPedidosActionPerformed

    private void ABMmeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABMmeserosActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ABMMeseros abmmeseros = new ABMMeseros(); //instancia la ventana (aún invis.)
        abmmeseros.setVisible(true); //la hace visible
        escritorio.add(abmmeseros); //la agrega al escritorio
        escritorio.moveToFront(abmmeseros); //la abre y trae adelante
    }//GEN-LAST:event_ABMmeserosActionPerformed

    private void listadoMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoMeserosActionPerformed
        escritorio.removeAll(); //para que cierre las ventanas que pudieran estar abiertas
        escritorio.repaint(); //para que lo redibuje
        ListadoMeseros lmeseros = new ListadoMeseros(); //instancia la ventana (aún invis.)
        lmeseros.setVisible(true); //la hace visible
        escritorio.add(lmeseros); //la agrega al escritorio
        escritorio.moveToFront(lmeseros); //la abre y trae adelante
    }//GEN-LAST:event_listadoMeserosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ABMPedidos;
    private javax.swing.JMenuItem ABMmesas;
    private javax.swing.JMenuItem ABMmeseros;
    private javax.swing.JMenuItem ABMproductos;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listadoMesas;
    private javax.swing.JMenuItem listadoMeseros;
    private javax.swing.JMenuItem listadoPedidos;
    private javax.swing.JMenuItem listadoProductos;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables

    public void cerrar() {
        //Establece los nombre de los dos botones del JOptionPane
        String botones[] = {"Cerrar", "Cancelar"};

        //Asigna el JOptionPane a una variable y si elige 'si'...
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicación?", "Salir", 0, 0, null, botones, this);

        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}