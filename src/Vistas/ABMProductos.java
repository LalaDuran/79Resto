/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.*;
import Entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author morena
 */
public class ABMProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ABMProductos
     */
    public ABMProductos() {
        initComponents();
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfIDProducto = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jrbHabilitado = new javax.swing.JRadioButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbStockCritico = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setText("ABM DE PRODUCTOS");

        jLabel2.setText("Id Producto");

        jLabel3.setText("Nombre");

        jLabel4.setText("Stock");

        jLabel5.setText("Precio");

        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jrbHabilitado.setText("Habilitado");

        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jrbStockCritico.setText("Stock Critico");

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jtfStock)
                            .addComponent(jtfPrecio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jrbHabilitado)
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEliminar)
                            .addComponent(jrbStockCritico))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jbLimpiar)
                .addGap(49, 49, 49)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbStockCritico)
                    .addComponent(jrbHabilitado))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
         //Invisibiliza, deselecciona y cierra la ventana
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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
            int idProdAGuardar = Integer.parseInt(jtfIDProducto.getText());
            String nombreAGuardar = jtfNombre.getText();
            int stockAGuardar = Integer.parseInt(jtfStock.getText());
            double precioAGuardar = Double.parseDouble(jtfPrecio.getText());
            boolean habAGuardar = jrbHabilitado.isSelected();
            boolean stockCriticoAGuardar = jrbStockCritico.isSelected();

            //Instanciamos un producto con los parámetros anteriores
            Producto p = new Producto(idProdAGuardar,nombreAGuardar,stockAGuardar,precioAGuardar,habAGuardar);

            //declaramos una variable bandera por si ya existe el id tipeado en vista
            boolean existeID = false;

            //Recorremos la lista de productos existentes
            for (Producto existingProd : prodD.listarProducto()) {

                if (existingProd.getIdProducto() == p.getIdProducto()) {
                    //Si existe el producto, seteamos el id para poder acceder al método modificar; si no existe se activa la bandera más abajo 
                    p.setIdProducto(prodD.buscarProductoPorID(p.getIdProducto()).getIdProducto());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbHabilitado;
    private javax.swing.JRadioButton jrbStockCritico;
    private javax.swing.JTextField jtfIDProducto;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfStock;
    // End of variables declaration//GEN-END:variables
}
