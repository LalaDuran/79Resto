/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.MeseroData;
import Entidades.Mesero;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author Faustino
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        jPanel1.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        nombretxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        dnitxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelRegistrar = new javax.swing.JPanel();
        registrarbtn = new javax.swing.JLabel();
        panelVolver = new javax.swing.JPanel();
        volverbtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(370, 604));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(325, 604));

        nombretxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        nombretxt.setForeground(java.awt.Color.gray);
        nombretxt.setText("Ingrese su nombre");
        nombretxt.setBorder(null);
        nombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretxtMousePressed(evt);
            }
        });
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        apellidotxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        apellidotxt.setForeground(java.awt.Color.gray);
        apellidotxt.setText("Ingrese su apellido");
        apellidotxt.setBorder(null);
        apellidotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidotxtMousePressed(evt);
            }
        });

        dnitxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        dnitxt.setForeground(java.awt.Color.gray);
        dnitxt.setText("Ingrese su dni");
        dnitxt.setBorder(null);
        dnitxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dnitxtMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesero200.png"))); // NOI18N

        panelRegistrar.setBackground(new java.awt.Color(255, 82, 17));

        registrarbtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        registrarbtn.setText("  Registrar");
        registrarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelVolver.setBackground(new java.awt.Color(255, 82, 17));

        volverbtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        volverbtn.setText("    Volver");
        volverbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelVolverLayout = new javax.swing.GroupLayout(panelVolver);
        panelVolver.setLayout(panelVolverLayout);
        panelVolverLayout.setHorizontalGroup(
            panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVolverLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(volverbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelVolverLayout.setVerticalGroup(
            panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(panelVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVolverLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(volverbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MESERO/A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombretxt)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2)
                            .addComponent(dnitxt)
                            .addComponent(apellidotxt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(panelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(dnitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void registrarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarbtnMouseClicked

        MeseroData meseroD = new MeseroData();

        try {
            //creamos las variables y asignamos los valores tipeados en la vista
            

            if (apellidotxt.getText().equals("Ingrese su apellido") || nombretxt.equals("Ingrese su nombre") || dnitxt.equals("Ingrese su dni")) {
                JOptionPane.showMessageDialog(null, "Complete los campos");
            } else {
                if (!validarString(apellidotxt.getText().trim()) || !validarString(nombretxt.getText().trim())) {
                    JOptionPane.showMessageDialog(null, "Los campos apellido y nombre solo aceptan letras.");
                    
                } else {
                    String apellidoAGuardar = apellidotxt.getText();
                String nombreAGuardar = nombretxt.getText();
                int dniAGuardar = Integer.parseInt(dnitxt.getText());
                boolean activoAGuardar = true;

                
                //Instanciamos un mesero con los parámetros anteriores
                Mesero m = new Mesero(apellidoAGuardar, nombreAGuardar, dniAGuardar, activoAGuardar);

                //declaramos una variable bandera por si ya existe el id tipeado en vista
                boolean existeID = false;

                //Recorremos la lista de meseros existentes
                for (Mesero existingMesero : meseroD.listarMesero()) {

                    if (existingMesero.getDni() == m.getDni()) {
                        //Si existe el mesero, seteamos el id para poder acceder al método modificar; si no existe se activa la bandera más abajo 

                        existeID = true;
                        break;
                    }
                }
                //Si existe el mesero usa el método modificarMesero; si no, guardarMesero
                if (existeID == true) {
                    JOptionPane.showMessageDialog(null, "El mesero ya esta registrado.");
                } else {
                    meseroD.guardarMesero(m);
                }
                }
                
            }

            //Limpiamos los textField luego de registrar.    
            apellidotxt.setText("Ingrese su apellido");
            apellidotxt.setForeground(Color.gray);

            dnitxt.setText("Ingrese su dni");
            dnitxt.setForeground(Color.gray);

            nombretxt.setText("Ingrese su nombre");
            nombretxt.setForeground(Color.gray);

        } catch (NullPointerException ex) {
            //Si algún campo está vacío
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } catch (NumberFormatException ex) {
            //Si no usa números enteros en todos los campos
            JOptionPane.showMessageDialog(null, "El campo dni solo admite numeros");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_registrarbtnMouseClicked

    public static boolean validarString(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    private void volverbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbtnMouseClicked

        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_volverbtnMouseClicked

    private void nombretxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxtMousePressed

        if (nombretxt.getText().equals("Ingrese su nombre")) {

            nombretxt.setText("");
            nombretxt.setForeground(Color.black);

        }
        if (String.valueOf(apellidotxt.getText()).isEmpty()) {
            apellidotxt.setText("Ingrese su apellido");
            apellidotxt.setForeground(Color.gray);

        }
        if (dnitxt.getText().isEmpty()) {
            dnitxt.setText("Ingrese su dni");
            dnitxt.setForeground(Color.gray);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtMousePressed

    private void apellidotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidotxtMousePressed

        if (apellidotxt.getText().equals("Ingrese su apellido")) {

            apellidotxt.setText("");
            apellidotxt.setForeground(Color.black);

        }
        if (nombretxt.getText().isEmpty()) {
            nombretxt.setText("Ingrese su nombre");
            nombretxt.setForeground(Color.gray);

        }
        if (dnitxt.getText().isEmpty()) {
            dnitxt.setText("Ingrese su dni");
            dnitxt.setForeground(Color.gray);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidotxtMousePressed

    private void dnitxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dnitxtMousePressed

        if (dnitxt.getText().equals("Ingrese su dni")) {

            dnitxt.setText("");
            dnitxt.setForeground(Color.black);

        }
        if (nombretxt.getText().isEmpty()) {
            nombretxt.setText("Ingrese su nombre");
            nombretxt.setForeground(Color.gray);

        }
        if (apellidotxt.getText().isEmpty()) {
            apellidotxt.setText("Ingrese su apellido");
            apellidotxt.setForeground(Color.gray);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dnitxtMousePressed

    private void volverbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbtnMouseEntered

        panelVolver.setBackground(new Color(255, 127, 79));
        // TODO add your handling code here:
    }//GEN-LAST:event_volverbtnMouseEntered

    private void volverbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbtnMouseExited
        panelVolver.setBackground(new Color(255, 84, 25));  
        // TODO add your handling code here:
    }//GEN-LAST:event_volverbtnMouseExited

    private void registrarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarbtnMouseEntered
       panelRegistrar.setBackground(new Color(255, 127, 79));
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarbtnMouseEntered

    private void registrarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarbtnMouseExited
        panelRegistrar.setBackground(new Color(255, 84, 25)); 
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarbtnMouseExited

    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField dnitxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JPanel panelVolver;
    private javax.swing.JLabel registrarbtn;
    private javax.swing.JLabel volverbtn;
    // End of variables declaration//GEN-END:variables
}
