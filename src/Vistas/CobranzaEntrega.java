/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriana
 */
public class CobranzaEntrega extends javax.swing.JInternalFrame {

    /**
     * Creates new form CobranzaEntrega
     */
    public CobranzaEntrega() {
        initComponents();
        cargarPedidos();
        jPanel1.setBackground(Color.WHITE);
        jPanel2.setBackground(ABMPedidos.naranja);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbIDPedido = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jbCobrar = new javax.swing.JButton();
        jbEntregar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("COBRANZA Y ENTREGA DE PEDIDOS");

        jbSalir.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closebtn.png"))); // NOI18N
        jbSalir.setContentAreaFilled(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Buscar por Id Pedido");

        jcbIDPedido.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jcbIDPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbIDPedidoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Total: ");

        jtfTotal.setEditable(false);
        jtfTotal.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        jbCobrar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jbCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagar.png"))); // NOI18N
        jbCobrar.setText("COBRAR");
        jbCobrar.setContentAreaFilled(false);
        jbCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCobrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCobrar.setRolloverEnabled(true);
        jbCobrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagarX48.png"))); // NOI18N
        jbCobrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });

        jbEntregar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jbEntregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/elamigo.png"))); // NOI18N
        jbEntregar.setText("ENTREGAR");
        jbEntregar.setContentAreaFilled(false);
        jbEntregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEntregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEntregar.setRolloverEnabled(true);
        jbEntregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/elamigoX48.png"))); // NOI18N
        jbEntregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jbCobrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEntregar)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbIDPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbIDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jbCobrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEntregar)))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbIDPedidoItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
        // TODO add your handling code here:
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbEntregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Integer> jcbIDPedido;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
