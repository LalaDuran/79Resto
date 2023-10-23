package Vistas;

import AccesoADatos.*;
import Entidades.*;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ABMPedidos extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            if (c == 3) {
                return true;
            } else {
                return false;
            }

        }
    };

    public ABMPedidos() {
        initComponents();

        //Carga los ID Mesas al jComboBox
        cargarIDMesas();

        //Carga los meseros al jComboBox
        cargarMeseros();

        //Inhabilita los botones 'Nuevo' y 'Eliminar'
        jbLimpiar.setEnabled(false);
        jbEliminar.setEnabled(false);

        //para que por defecto el JDateChooser muestre la fecha de hoy
        Calendar fechaActual = new GregorianCalendar();
        jdcFechaYHora.setCalendar(fechaActual);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfIDPedido = new javax.swing.JTextField();
        jcbIDMesa = new javax.swing.JComboBox<>();
        jcbMesero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jdcFechaYHora = new com.toedter.calendar.JDateChooser();
        btnAgregProd = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setText("ABM DE PEDIDOS");

        jLabel2.setText("Id Pedido");

        jLabel3.setText("Id Mesa");

        jLabel4.setText("Mesero");

        jLabel6.setText("Fecha y Hora");

        jcbIDMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIDMesaActionPerformed(evt);
            }
        });

        jcbMesero.setEditable(true);
        jcbMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeseroActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        btnAgregProd.setText("Agregar Productos");
        btnAgregProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(367, 367, 367))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jbLimpiar)
                        .addGap(45, 45, 45)
                        .addComponent(jbEliminar)
                        .addGap(50, 50, 50)
                        .addComponent(jbGuardar)
                        .addGap(47, 47, 47)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfIDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbMesero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbIDMesa, 0, 248, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregProd)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jdcFechaYHora, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfIDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbIDMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jdcFechaYHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnAgregProd)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbLimpiar)
                        .addComponent(jbEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbSalir)
                        .addComponent(jbGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        //Invisibiliza, deselecciona y cierra la ventana
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpia la pantalla para cargar un pedido nuevo
        jtfIDPedido.setText("");
        jbLimpiar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        //Si no completa el campo 'ID Pedido'
        if (jtfIDPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo 'ID Pedido'");

        } else {
            try {
                //Asignamos a una variable el dato ingresado en la vista
                int idPedidoBuscado = Integer.parseInt(jtfIDPedido.getText());

                //Instanciamos un pedido y pedidoData para usar luego
                PedidoData pedidoD = new PedidoData();
                Pedido pedidoBuscado = new Pedido();
                MeseroData md = new MeseroData();

                //Buscamos un pedido por su id usando buscar de pedidoData
                pedidoBuscado = pedidoD.buscarPedidoPorID(idPedidoBuscado);

                //Mostramos en la vista los datos del pedido encontrado
                jtfIDPedido.setText(Integer.toString(pedidoBuscado.getIdPedido()));
                jcbIDMesa.setSelectedItem(pedidoBuscado.getMesa().getIdMesa());
                jcbMesero.setSelectedItem(pedidoBuscado.getMesero());

                //Habilitamos los botones 'Limpiar' y 'Eliminar'
                jbLimpiar.setEnabled(true);
                jbEliminar.setEnabled(true);

            } catch (NumberFormatException nfe) {
                //si ingresa letras o símbolos
                JOptionPane.showMessageDialog(this, "Ingrese sólo números");
                jtfIDPedido.setText("");
            } catch (NullPointerException npe) {
                //si no existe pedido con ese id en la vista, salta el JOptionPane del método
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbIDMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIDMesaActionPerformed
        //Utilizamos el cambio de mesa para borrar la consulta anterior
        borrarFilas();


    }//GEN-LAST:event_jcbIDMesaActionPerformed

    private void jcbMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeseroActionPerformed
        //Utilizamos el cambio de mesa para borrar la consulta anterior
        borrarFilas();

    }//GEN-LAST:event_jcbMeseroActionPerformed

    private void btnAgregProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregProdActionPerformed

        if (jtfIDPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo ID Pedido");
        } else {
            ABMproductospedidos pp = new ABMproductospedidos();
            MenuPrincipal.escritorio.add(pp);

            pp.setVisible(true);
            pp.moveToFront();
        }


    }//GEN-LAST:event_btnAgregProdActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (jtfIDPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo 'ID Pedido'");

        } else {
            try {
                //Instanciamos pedido y pedidoData para usar luego
                Pedido p = new Pedido();
                PedidoData pedidoD = new PedidoData();

                //Creamos una variable con el ID tipeado en la vista
                int IDPedidoAEliminar = Integer.parseInt(jtfIDPedido.getText());

                //Buscamos el pedido con ese id y lo enviamos a los pedidos ya creado
                p = pedidoD.buscarPedidoPorID(IDPedidoAEliminar);

                //Eliminamos la mesa llamando al método eliminarMesa de mesaData
                pedidoD.eliminarPedido(p.getIdPedido());

                //Limpiamos los campos de la vista
                jtfIDPedido.setText("");
                jcbMesero.setSelectedItem(null);
                jcbIDMesa.setSelectedItem(null);

            } catch (NumberFormatException ex) {
                //Si no tipea un documento en la vista
                JOptionPane.showMessageDialog(null, "Ingrese un ID Pedido");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        //Instanciamos *Datas para usar luego
        PedidoData pedidoD = new PedidoData();
        MesaData mesaD = new MesaData();
        MeseroData meseroD = new MeseroData();

        try {
            //creamos las variables y asignamos los valores tipeados en la vista
            //     int idPedidoAGuardar = Integer.parseInt(jtfIDPedido.getText());
            Mesa mesaAGuardar = mesaD.buscarMesaPorID((Integer) jcbIDMesa.getSelectedItem());
            List<Producto> prods = null; //aún no ha sido definido
            Mesero meseroAGuardar = (Mesero) jcbMesero.getSelectedItem();

            boolean entregadoAGuardar = false;
            boolean cobradoAGuardar = false;
            // getting the system date 
            Date diaEnVista = jdcFechaYHora.getDate();
            // getting the object of the Timestamp class
            Timestamp diaAGuardar = new Timestamp(diaEnVista.getTime());
            //Instanciamos un pedido con los parámetros anteriores
            Pedido p = new Pedido(mesaAGuardar, prods, meseroAGuardar, entregadoAGuardar, cobradoAGuardar, diaAGuardar);

            //declaramos una variable bandera por si ya existe el id tipeado en vista
            boolean existeID = false;

            //Recorremos la lista de pedidos existentes
            for (Pedido existingPedido : pedidoD.listarPedidos()) {

                if (existingPedido.getIdPedido() == Integer.parseInt(jtfIDPedido.getText())) {
                    //Si existe el producto, seteamos el id para poder acceder al método modificar; si no existe se activa la bandera más abajo 
                    p.setIdPedido(pedidoD.buscarPedidoPorID(Integer.parseInt(jtfIDPedido.getText())).getIdPedido());
                    existeID = true;
                    break;
                }
            }
            //Si ya existe el pedido puede tener productos asociados, o no, y si no existe no tiene productos asociados. Para ambos casos usamos guardarPedido con productos asociados en null 

            JOptionPane.showConfirmDialog(null, "Pedido guardado");
            if (existeID == true) {
                pedidoD.modificarPedido(p);
            } else {
                pedidoD.guardarPedido(p);

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

            // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregProd;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Integer> jcbIDMesa;
    private javax.swing.JComboBox<Mesero> jcbMesero;
    private com.toedter.calendar.JDateChooser jdcFechaYHora;
    public static javax.swing.JTextField jtfIDPedido;
    // End of variables declaration//GEN-END:variables

//    private void armarTabla() {
//        //Agregamos las cabeceras a la tabla
//        modelo.addColumn("id");
//        modelo.addColumn("nombre");
//        modelo.addColumn("precio");
//        modelo.addColumn("cantidad");
//
//        Seteamos el modelo a la tabla
//        jtTablaProductosPedidos.setModel(modelo);
//
//        //Impedimos el reordenamiento de la cabecera
//        jtTablaProductosPedidos.getTableHeader().setReorderingAllowed(false);
//
//        //para centrar las celdas del encabezado
//        DefaultTableCellRenderer header = (DefaultTableCellRenderer) jtTablaProductosPedidos.getTableHeader().getDefaultRenderer();
//        header.setHorizontalAlignment(SwingConstants.CENTER);
//
//        //para centrar los datos de la primera columna
//        DefaultTableCellRenderer tcr0 = new DefaultTableCellRenderer();
//        tcr0.setHorizontalAlignment(SwingConstants.CENTER);
//        jtTablaProductosPedidos.getColumnModel().getColumn(0).setCellRenderer(tcr0);
//
//    }
    private void borrarFilas() {
        //Evita la repetición de las filas en la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void cargarIDMesas() {
        //Cargamos los IDMesas al jComboBox
        MesaData mesaD = new MesaData();

        for (Mesa aux : mesaD.listarMesa()) {
            jcbIDMesa.addItem(aux.getIdMesa());
        }
    }

    private void cargarMeseros() {
        //Cargamos los meseros al jComboBox
        MeseroData meseroD = new MeseroData();

        for (Mesero aux : meseroD.listarMesero()) {
            jcbMesero.addItem(aux);

        }
    }
}
// private void cargarProductos() {
//        //Cargamos los productos al jComboBox
//        ProductoData prodData = new ProductoData();
//
//        for (Producto aux : prodData.listarProducto()) {
//            cbProductos.addItem(aux);
//        }
//    }

//     private void cargarTablaProductos(){
//         
//         ProductoData prodD = new ProductoData();
//         
//         //Listamos los productos en la tabla
//        for (Producto aux : prodD.listarProducto()) {
//            modelo.addRow(new Object[]{aux.getIdProducto(),aux.getNombre(), aux.getPrecio(), spinner.getValue()});
//        }

