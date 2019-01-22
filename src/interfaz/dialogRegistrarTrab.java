package interfaz;

import clases.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class dialogRegistrarTrab extends javax.swing.JDialog {
    
    private Trabajador t = null;
    
    public Trabajador getTrabajador() { return t; }
    
    public void setTrabajador(Trabajador t) {
        this.t = t;
        jTextCargo.setText(t.getCargo());
        jTextDireccion.setText(t.getDireccion());
        jTextNombrApellido.setText(t.getNombre());
        jTextNroCedula.setText(t.getCedula());
        jTextSalario.setText(String.valueOf(t.getSalariobase()));
        if (t instanceof TrabajadorFijo) {
            jLabelTiempo.setText("Anos de Trabajo:"); //tbd
            jSpinnerATrabajo.setValue(((TrabajadorFijo) t).getTiempoServicio());            
        } else if (t instanceof TrabajadorAPrueba) {
            jLabelTiempo.setText("Horas extra:");
            jSpinnerATrabajo.setValue(((TrabajadorAPrueba) t).getHorasExtra());
        }     
    }
    
    public void limpiarTexto () {
        jTextCargo.setText(null);
        jTextDireccion.setText(null);
        jTextNombrApellido.setText(null);
        jTextNroCedula.setText(null);
        jTextSalario.setText(null);
        jSpinnerATrabajo.setValue(0);
    }

    public dialogRegistrarTrab(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Toolkit screen = Toolkit.getDefaultToolkit();
	Dimension d = screen.getScreenSize();
        int x = ((int)screen.getScreenSize().getWidth()  - getWidth())  / 2;
        int y = ((int)screen.getScreenSize().getHeight() - getHeight()) / 2;
	setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelTiempo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextNombrApellido = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextCargo = new javax.swing.JTextField();
        jTextNroCedula = new javax.swing.JTextField();
        jTextSalario = new javax.swing.JTextField();
        jComboBoxTipoTrab = new javax.swing.JComboBox<>();
        jSpinnerATrabajo = new javax.swing.JSpinner();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar un trabajador");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE TRABAJADOR");

        jLabel2.setText("Numero de cedula:");

        jLabel3.setText("Nombres y Apellidos:");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Cargo:");

        jLabel6.setText("Salario base:");

        jLabelTiempo.setText("Anos de Trabajo:");

        jLabel8.setText("Tipo de Trabajador:");

        jComboBoxTipoTrab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fijo", "A Prueba" }));
        jComboBoxTipoTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTrabActionPerformed(evt);
            }
        });

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-guardar.png"))); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-limpiar.png"))); // NOI18N
        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-salir.png"))); // NOI18N
        jButtonSalir.setText("SALIR");
        jButtonSalir.setToolTipText("");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabelTiempo))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNombrApellido)
                                .addComponent(jTextDireccion)
                                .addComponent(jTextCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jTextNroCedula, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerATrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNombrApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxTipoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTiempo)
                            .addComponent(jSpinnerATrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGuardar)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonSalir))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Si es un trabajador existente (tiene campos ya llenos dentro del dialog), se toman los valores de esos campos y se los escribe en fichero,
       de no ser asi, se crea un nuevo Trabajador y si es Fijo o Temporal dependera del valor que toma del jSpinner   */
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (t != null) {
            t.setNombre(jTextNombrApellido.getText());
            t.setCedula(jTextNroCedula.getText());
            t.setDireccion(jTextDireccion.getText());
            t.setCargo(jTextCargo.getText());
            t.setSalariobase((int) Double.parseDouble(jTextSalario.getText()));
            if (t instanceof TrabajadorFijo) {
                ((TrabajadorFijo)t).setTiempoServicio((int) jSpinnerATrabajo.getValue());
                JOptionPane.showMessageDialog(null, "Se modifico la entrada de Trabajador FIJO");
            } else {
                ((TrabajadorAPrueba)t).setHorasExtra((int) jSpinnerATrabajo.getValue());
                JOptionPane.showMessageDialog(null, "Se modifico la entrada de Trabajador A PRUEBA"); 
            }
            setVisible(false);
        } else if (jComboBoxTipoTrab.getSelectedItem() == "Fijo") {     
            t = new TrabajadorFijo((int) jSpinnerATrabajo.getValue(), jTextNombrApellido.getText(), 
                    jTextNroCedula.getText(), jTextDireccion.getText(), jTextCargo.getText(), Double.parseDouble(jTextSalario.getText()));
            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Trabajador FIJO");
        } else {
            t = new TrabajadorAPrueba((int) jSpinnerATrabajo.getValue(), jTextNombrApellido.getText(),
                    jTextNroCedula.getText(), jTextDireccion.getText(), jTextCargo.getText(), Double.parseDouble(jTextSalario.getText()));
            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Trabajador A PRUEBA");
        }
        setVisible(false);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBoxTipoTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTrabActionPerformed
        if (jComboBoxTipoTrab.getSelectedItem() == "Fijo") {
            jLabelTiempo.setText("Anos de Trabajo:"); //tbd
        } else {
            jLabelTiempo.setText("Horas extra:");
        }
    }//GEN-LAST:event_jComboBoxTipoTrabActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarTexto();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(dialogRegistrarTrab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarTrab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarTrab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarTrab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogRegistrarTrab dialog = new dialogRegistrarTrab(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxTipoTrab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JSpinner jSpinnerATrabajo;
    private javax.swing.JTextField jTextCargo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombrApellido;
    private javax.swing.JTextField jTextNroCedula;
    private javax.swing.JTextField jTextSalario;
    // End of variables declaration//GEN-END:variables
}
