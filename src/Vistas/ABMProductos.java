
package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.awt.Color;
import javax.swing.JOptionPane;


public class ABMProductos extends javax.swing.JInternalFrame {


    Color naranja = new Color(255, 84, 25);
    
    public ABMProductos() {
        initComponents();
        
        jPanel1.setBackground(Color.WHITE);
        panelTitle.setBackground(naranja);
        Title.setForeground(Color.WHITE);
        
        //Inhabilita los botones 'Nuevo' y 'Eliminar'
        jbLimpiar.setEnabled(false);
        jbEliminar.setEnabled(false);
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
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jtfIDProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbHabilitado = new javax.swing.JRadioButton();
        jrbStockCritico = new javax.swing.JRadioButton();
        panelTitle = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jbEliminar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(60, 63, 65));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrarPro.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setContentAreaFilled(false);
        jbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEliminar.setRolloverEnabled(true);
        jbEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrarProX48.png"))); // NOI18N
        jbEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(60, 63, 65));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarPro.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.setContentAreaFilled(false);
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGuardar.setRolloverEnabled(true);
        jbGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarProX48.png"))); // NOI18N
        jbGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(60, 63, 65));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoPro.png"))); // NOI18N
        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.setContentAreaFilled(false);
        jbLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLimpiar.setPreferredSize(new java.awt.Dimension(104, 39));
        jbLimpiar.setRolloverEnabled(true);
        jbLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoProX48.png"))); // NOI18N
        jbLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jtfIDProducto.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jtfIDProducto.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Id Producto");

        jtfNombre.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jtfNombre.setBorder(null);

        jtfStock.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jtfStock.setBorder(null);

        jtfPrecio.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jtfPrecio.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Stock");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Precio");

        jrbHabilitado.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jrbHabilitado.setText("Habilitado");

        jrbStockCritico.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jrbStockCritico.setText("Stock Critico");

        panelTitle.setPreferredSize(new java.awt.Dimension(362, 64));

        Title.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("PRODUCTOS");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupaGato.png"))); // NOI18N
        jbBuscar.setContentAreaFilled(false);
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.setPreferredSize(new java.awt.Dimension(64, 64));
        jbBuscar.setRolloverEnabled(true);
        jbBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupaGatoGrande.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Title))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 381, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jrbHabilitado)
                                .addGap(102, 102, 102)
                                .addComponent(jrbStockCritico)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addComponent(jtfPrecio)
                                    .addComponent(jSeparator2)
                                    .addComponent(jtfNombre))
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbHabilitado)
                    .addComponent(jrbStockCritico))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(256, 256, 256))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
       //Limpia la pantalla para cargar un producto nuevo
        jtfIDProducto.setText("");
        jtfNombre.setText("");
        jtfStock.setText("");
        jtfPrecio.setText("");
        jrbHabilitado.setSelected(true);
        jrbStockCritico.setSelected(false);
        jbLimpiar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
         //Instanciamos productoData para usar luego
        ProductoData prodD = new ProductoData();

        try {
            //creamos las variables y asignamos los valores tipeados en la vista
      //      int idProdAGuardar = Integer.parseInt(jtfIDProducto.getText());
            String nombreAGuardar = jtfNombre.getText();
            int stockAGuardar = Integer.parseInt(jtfStock.getText());
            double precioAGuardar = Double.parseDouble(jtfPrecio.getText());
            boolean habAGuardar = jrbHabilitado.isSelected();
            boolean stockCriticoAGuardar = jrbStockCritico.isSelected();

            //Instanciamos un producto con los parámetros anteriores
            Producto p = new Producto(nombreAGuardar,stockAGuardar,precioAGuardar,habAGuardar);

            //declaramos una variable bandera por si ya existe el id tipeado en vista
            boolean existeID = false;

            //Recorremos la lista de productos existentes
            for (Producto existingProd : prodD.listarProducto()) {

                if (existingProd.getIdProducto() == Integer.parseInt(jtfIDProducto.getText())) {
                    //Si existe el producto, seteamos el id para poder acceder al método modificar; si no existe se activa la bandera más abajo 
                    p.setIdProducto(prodD.buscarProductoPorID(Integer.parseInt(jtfIDProducto.getText())).getIdProducto());
                    existeID = true;
                  
                    break;
                }
            }
            //Si existe el producto usa el método modificarProducto; si no, guardarProducto
            if (existeID == true) {
                prodD.modificarProducto(p);
            } else {
                prodD.guardarProducto(p);
            }

            //Habilitamos los botones 'Eliminar' y 'Limpiar'
            jbEliminar.setEnabled(true);
            jbLimpiar.setEnabled(true);

        } catch (NullPointerException ex) {
            //Si algún campo está vacío
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } catch (NumberFormatException ex) {
            //Si no usa números enteros en todos los campos
            JOptionPane.showMessageDialog(null, "Use sólo números enteros");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        //Si no completa el campo 'ID Producto'
        if (jtfIDProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo 'ID Producto'");

        } else {
            try {
                //Asignamos a una variable el dato ingresado en la vista
                int idProdBuscado = Integer.parseInt(jtfIDProducto.getText());

                //Instanciamos un producto y productoData para usar luego
                ProductoData prodD = new ProductoData();
                Producto prodBuscado = new Producto();

                //Buscamos un producto por su id usando buscar de productoData
                prodBuscado = prodD.buscarProductoPorID(idProdBuscado);

                //Mostramos en la vista los datos del producto encontrado
                jtfIDProducto.setText(Integer.toString(prodBuscado.getIdProducto()));
                jtfNombre.setText(prodBuscado.getNombre());
                jtfStock.setText(Integer.toString(prodBuscado.getCant_stock()));
                jtfPrecio.setText(Double.toString(prodBuscado.getPrecio()));
                jrbHabilitado.setSelected(prodBuscado.isEstado());
              
                
                if (prodBuscado.getCant_stock()<10){
                    jrbStockCritico.setSelected(true);
                }

                //Habilitamos los botones 'Limpiar' y 'Eliminar'
                jbLimpiar.setEnabled(true);
                jbEliminar.setEnabled(true);

            } catch (NumberFormatException nfe) {
                //si ingresa letras o símbolos
                JOptionPane.showMessageDialog(this, "Ingrese sólo números");
                jtfIDProducto.setText("");
            } catch (NullPointerException npe) {
                //si no existe alumno con el dni tipeado en la vista, salta el JOptionPane del método buscarAlumnoPorDni
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //Si el campo ID Producto está vacío
        if (jtfIDProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo 'ID Producto'");

        } else {
            try {
                //Instanciamos producto y productoData para usar luego
                Producto p = new Producto();
                ProductoData prodD = new ProductoData();

                //Creamos una variable con el ID tipeado en la vista
                int IDProdAEliminar = Integer.parseInt(jtfIDProducto.getText());

                //Buscamos el producto con ese id y lo enviamos al producto ya creado
                p = prodD.buscarProductoPorID(IDProdAEliminar);

                //Eliminamos el producto llamando al método eliminarProducto de productoData
                prodD.eliminarProducto(p.getIdProducto());

                //Limpiamos los campos de la vista
                jtfIDProducto.setText("");
                jtfNombre.setText("");
                jtfStock.setText("");
                jtfPrecio.setText("");
                jrbHabilitado.setSelected(false);

            } catch (NumberFormatException ex) {
                //Si no tipea un documento en la vista
                JOptionPane.showMessageDialog(null, "Ingrese un ID Producto");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //Invisibiliza, deselecciona y cierra la ventana
        this.dispose();
        
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JRadioButton jrbHabilitado;
    private javax.swing.JRadioButton jrbStockCritico;
    private javax.swing.JTextField jtfIDProducto;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfStock;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables
}
