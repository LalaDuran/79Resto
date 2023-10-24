/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.MeseroData;
import AccesoADatos.PedidoData;
import AccesoADatos.ProductoPedidoData;
import Entidades.Mesero;
import Entidades.Pedido;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faustino
 */
public class CobranzaPorMesero extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public CobranzaPorMesero() {
        initComponents();
        cargarMeseros();
        armarTabla();

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
        jTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jcbIDMesero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPedidos = new javax.swing.JTable();
        jBuscar = new javax.swing.JButton();

        jTitle.setText("Cobranza por mesero");

        jLabel1.setText("ID Mesero");

        jLabel2.setText("Fecha");

        jcbIDMesero.setToolTipText("");

        jtTablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTablaPedidos);

        jBuscar.setText("Listar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jcbIDMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTitle)
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbIDMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBuscar)
                .addGap(107, 107, 107))
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

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
       try{
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dia1 = sdf.format(jFecha.getDate());
        int id = (Integer) jcbIDMesero.getSelectedItem();
        PedidoData pd = new PedidoData();
        ProductoPedidoData ppd = new ProductoPedidoData();
        borrarFilas();
        for (Pedido aux : pd.listarPedidos()) {

            String dia2 = sdf.format(aux.getFecha_hora());
            double total = ppd.calcularTotal(aux.getIdPedido());

            if (aux.getMesero().getIdMesero() == id && dia1.equals(dia2) && aux.isCobrado()) {
                modelo.addRow(new Object[]{aux.getIdPedido(), aux.getMesa().getIdMesa(), total});

            }
        }
       } catch(NullPointerException ex){
           JOptionPane.showMessageDialog(null, "Seleccione una fecha");
       }
        
      

        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitle;
    private javax.swing.JComboBox<Integer> jcbIDMesero;
    private javax.swing.JTable jtTablaPedidos;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {
        //Agregamos las cabeceras a la tabla
        modelo.addColumn("ID Pedido");
        modelo.addColumn("ID mesa");
        modelo.addColumn("Total");

        //Seteamos el modelo a la tabla
        jtTablaPedidos.setModel(modelo);

        //Impedimos el reordenamiento de la cabecera
        jtTablaPedidos.getTableHeader().setReorderingAllowed(false);

        //para centrar las celdas del encabezado
        DefaultTableCellRenderer header = (DefaultTableCellRenderer) jtTablaPedidos.getTableHeader().getDefaultRenderer();
        header.setHorizontalAlignment(SwingConstants.CENTER);

        //para centrar los datos de la primera columna
        DefaultTableCellRenderer tcr0 = new DefaultTableCellRenderer();
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPedidos.getColumnModel().getColumn(0).setCellRenderer(tcr0);

        //para centrar los datos de la segunda columna
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtTablaPedidos.getColumnModel().getColumn(1).setCellRenderer(tcr0);

    }

    private void borrarFilas() {
        //Evita la repetición de las filas en la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void cargarMeseros() {
        //Cargamos los meseros al jComboBox
        MeseroData meseroD = new MeseroData();

        for (Mesero aux : meseroD.listarMesero()) {
            jcbIDMesero.addItem(aux.getIdMesero());

        }
    }
}
