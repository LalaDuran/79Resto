
package Vistas;

import AccesoADatos.*;
import Entidades.*;
import javax.swing.JOptionPane;


public class CobranzaEntrega extends javax.swing.JInternalFrame {

 
    public CobranzaEntrega() {
        initComponents();
        
        cargarPedidos();
        
        PedidoData ppd = new PedidoData();
        Pedido p = ppd.buscarPedidoPorID((Integer) jcbIDPedido.getSelectedItem());
        
        if (p.isCobrado()) {
            jbCobrar.setEnabled(false);
        }
        if (p.isEntregado()) {
            jbEntregar.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbIDPedido = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbEntregar = new javax.swing.JButton();
        jbCobrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();

        jLabel1.setText("COBRANZA Y ENTREGA DE PEDIDOS");

        jcbIDPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbIDPedidoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Buscar por Id Pedido");

        jbEntregar.setText("ENTREGAR");
        jbEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntregarActionPerformed(evt);
            }
        });

        jbCobrar.setText("COBRAR");
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Total: ");

        jtfTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbIDPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbCobrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jbEntregar)
                .addGap(59, 59, 59)
                .addComponent(jbSalir)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbIDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCobrar)
                    .addComponent(jbEntregar)
                    .addComponent(jbSalir))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbIDPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbIDPedidoItemStateChanged

        int id = (int) jcbIDPedido.getSelectedItem();
        PedidoData pd = new PedidoData();
        ProductoPedidoData ppd = new ProductoPedidoData();
        Pedido p = pd.buscarPedidoPorID(id);

        double total = 0;

        total = ppd.calcularTotal(id);
        if (p.isCobrado()) {
            jbCobrar.setEnabled(false);
        } else {
            jbCobrar.setEnabled(true);
        }

        if (p.isEntregado()) {
            jbEntregar.setEnabled(false);
        } else {
            jbEntregar.setEnabled(true);
        }
        jtfTotal.setText(String.valueOf(total));
        
    }//GEN-LAST:event_jcbIDPedidoItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        //Invisibiliza, deselecciona y cierra la ventana
        this.dispose();
       
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed

        PedidoData pd = new PedidoData();
        pd.cobrar((int) jcbIDPedido.getSelectedItem());
        
    }//GEN-LAST:event_jbCobrarActionPerformed

    private void jbEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntregarActionPerformed

        PedidoData pd = new PedidoData();
        pd.entregar((int) jcbIDPedido.getSelectedItem());
        
    }//GEN-LAST:event_jbEntregarActionPerformed

    public void cargarPedidos() {

        PedidoData pd = new PedidoData();

        for (Pedido aux : pd.listarPedidos()) {
            jcbIDPedido.addItem(aux.getIdPedido());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbEntregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Integer> jcbIDPedido;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
