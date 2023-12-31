package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ABMproductospedidos extends javax.swing.JInternalFrame {

    Color naranja = new Color(255, 84, 25);
    
    private final DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            if (c == 3) {
                return true;
            } else {
                return false;
            }
        }
    };

    public ABMproductospedidos() {
        initComponents();
        
        armarTabla();
        cargarProductos();
        cargarPedidos();

        //para que al abrir la ventana 'recuerde' el pedido del ABM Pedido (public+static ambos)
        PedidoData pData = new PedidoData();
        jcbPedidos.setSelectedItem(pData.buscarPedidoPorID(Integer.parseInt(ABMPedidos.jtfIDPedido.getText())));

        jPanel1.setBackground(Color.WHITE);
        jPanel2.setBackground(naranja);

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
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbPedidos = new javax.swing.JComboBox<>();
        jcbProductos = new javax.swing.JComboBox<>();
        spinner = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductosPedidos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 500));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Pedido");

        jcbPedidos.setEditable(true);
        jcbPedidos.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jcbPedidos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPedidosItemStateChanged(evt);
            }
        });

        jcbProductos.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        spinner.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(60, 63, 65));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setRolloverEnabled(true);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carritoX48.png"))); // NOI18N
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jtProductosPedidos.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jtProductosPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProductosPedidos);

        btnEliminar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(60, 63, 65));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrarPro.png"))); // NOI18N
        btnEliminar.setText("RETIRAR");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setRolloverEnabled(true);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrarProX48.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(60, 63, 65));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarPro.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setRolloverEnabled(true);
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarProX48.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARRITO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jcbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        ProductoPedidoData ppd = new ProductoPedidoData();
        productoPedido pp = new productoPedido();
        Pedido p = (Pedido) jcbPedidos.getSelectedItem();

        int cantidad = (Integer) spinner.getValue();

        pp.setPedido(p);
        pp.setCantPedida(cantidad);
        pp.setProducto((Producto) jcbProductos.getSelectedItem());
        pp.setPrecio(pp.getProducto().getPrecio() * pp.getCantPedida());
        
        ppd.agregarProductos(pp);
        
        borrarFilas();
        
        //Listamos los productos en la tabla
        for (productoPedido aux : ppd.listarProductoPedidoPorIdDePedido(p.getIdPedido())) {
            modelo.addRow(new Object[]{aux.getPedido().getIdPedido(), aux.getProducto().getIdProducto(), aux.getProducto().getNombre(), aux.getCantPedida(), aux.getPrecio()});
        }
      
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Invisibiliza, deselecciona y cierra la ventana
        this.dispose();
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        ProductoPedidoData pd = new ProductoPedidoData();
        Pedido p = (Pedido) jcbPedidos.getSelectedItem();
        
        if (jtProductosPedidos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            int filaSel = jtProductosPedidos.getSelectedRow();
            int prod = (int) jtProductosPedidos.getValueAt(filaSel, 1);
            
            pd.eliminarProductoPedido(prod);
            
            borrarFilas();

            //Listamos los productos en la tabla
            for (productoPedido aux : pd.listarProductoPedidoPorIdDePedido(p.getIdPedido())) {
                modelo.addRow(new Object[]{aux.getPedido().getIdPedido(), aux.getProducto().getIdProducto(), aux.getProducto().getNombre(), aux.getCantPedida(), aux.getPrecio()});
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ProductoPedidoData pd = new ProductoPedidoData();
        productoPedido pp = new productoPedido();
        Pedido p = (Pedido) jcbPedidos.getSelectedItem();

        if (jtProductosPedidos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            int filaSel = jtProductosPedidos.getSelectedRow();

            String valor = (String) jtProductosPedidos.getValueAt(filaSel, 3);
            
            try {
                //Pasamos valor de String a double
                int cant = Integer.parseInt(valor);

                //Llamamos al método que actualizará 
                pp.setPedido(p);
                pp.setCantPedida(cant);
                pp.setProducto((Producto) jcbProductos.getSelectedItem());
                pd.modificarProdPed(pp);
                
                borrarFilas();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "La celda debe contener un número");
            }

            //Listamos los productos en la tabla
            for (productoPedido aux : pd.listarProductoPedidoPorIdDePedido(p.getIdPedido())) {
                modelo.addRow(new Object[]{aux.getPedido().getIdPedido(), aux.getProducto().getIdProducto(), aux.getProducto().getNombre(), aux.getCantPedida(),aux.getPrecio()});
            }
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jcbPedidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPedidosItemStateChanged
       
        try{
            ProductoPedidoData ppd = new ProductoPedidoData();
        productoPedido pp = new productoPedido();
        Pedido p = (Pedido) jcbPedidos.getSelectedItem();

        pp.setProducto((Producto) jcbProductos.getSelectedItem());

        borrarFilas();

        for (productoPedido aux : ppd.listarProductoPedidoPorIdDePedido(p.getIdPedido())) {
            modelo.addRow(new Object[]{aux.getPedido().getIdPedido(), aux.getProducto().getIdProducto(), aux.getProducto().getNombre(), aux.getCantPedida(), aux.getPrecio()});
        }
        } catch(NullPointerException ex){
            
        }
        

        
    }//GEN-LAST:event_jcbPedidosItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<Pedido> jcbPedidos;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JTable jtProductosPedidos;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables

   private void armarTabla() {
        //Agregamos las cabeceras a la tabla
        modelo.addColumn("Pedido");
        modelo.addColumn("Id Producto");
        modelo.addColumn("Producto");
        modelo.addColumn("cantidad");
        modelo.addColumn("SubTotal");

        //Seteamos el modelo a la tabla
        jtProductosPedidos.setModel(modelo);

        //Impedimos el reordenamiento de la cabecera
        jtProductosPedidos.getTableHeader().setReorderingAllowed(false);

        //para centrar las celdas del encabezado
        DefaultTableCellRenderer header = (DefaultTableCellRenderer) jtProductosPedidos.getTableHeader().getDefaultRenderer();
        header.setHorizontalAlignment(SwingConstants.CENTER);

        //para centrar los datos de la primera columna
        DefaultTableCellRenderer tcr0 = new DefaultTableCellRenderer();
        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
        jtProductosPedidos.getColumnModel().getColumn(0).setCellRenderer(tcr0);

    }

    private void cargarProductos() {
        //Cargamos los productos al jComboBox
        ProductoData prodData = new ProductoData();

        for (Producto aux : prodData.listarProducto()) {
            jcbProductos.addItem(aux);
        }
    }

    private void cargarPedidos() {
        //Cargamos los productos al jComboBox
        PedidoData pedData = new PedidoData();

        for (Pedido aux : pedData.listarPedidos()) {
            jcbPedidos.addItem(aux);
        }
    }

   private void borrarFilas() {
        //Evita la repetición de las filas en la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
   
}
