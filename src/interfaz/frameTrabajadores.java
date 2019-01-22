/*
Se desea implementar una interfaz sencilla que permita la entrada de datos de los trabajadores de una empresa X.
De cada trabajador se desea almacenar su nombre, número de cédula, salario
base y direccion particular y el cargo que ocupa dentro de la entidad.
Se conoce además que existen dos tipos de trabajadores, los fijos y los que estan
a prueba. De los trabajadores fijos se sabe la cantidad de años de servicio
para pagar un plus del 0.02% de su salario base por cada año de la organización.
En el caso de los trabajadores de prueba (por contratar) se almacenan las horas extras para
aumentar su salario a razón de $5 por cada hora acumulada.

- Genere una interfaz gráfica simple que permita la entrada de tabajadores
- Permita que el programa almacene y lea la información registrada desde un fichero
- Permita eliminar un registro o modificarlo almacenando los cambios en el fichero
- Muestre en pantalla constantemente la cantidad de trabajadores total, el salario total de la Empresa y 
  la cantidad de trabajadores por tipo asi como la suma del salario por cada tipo de trabajador.
 */
package interfaz;

import clases.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frameTrabajadores extends javax.swing.JFrame {
    
    AbsListModelTrab listmTrabajadores = new AbsListModelTrab();
    
    public frameTrabajadores() {
        initComponents();
        Toolkit screen = Toolkit.getDefaultToolkit();
	Dimension d = screen.getScreenSize();
        int x = ((int)screen.getScreenSize().getWidth()  - getWidth())  / 2;
        int y = ((int)screen.getScreenSize().getHeight() - getHeight()) / 2;
	setLocation(x, y);
        listmTrabajadores.addTrabajador(new TrabajadorAPrueba(3, "Alberto Lopez", "0927472423", "Alborada 4ta Etapa", "Jefe de Ventas", 2000));
        jListTrabajadores.setModel(listmTrabajadores);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTrabajadores = new javax.swing.JList<>();
        jButtonCargar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCantTrabTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSalarioTotalEmpresa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCantTrabFijos = new javax.swing.JLabel();
        jLabelCantTrabPrueba = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelSalarioTrabFijos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelSalarioTrabPrueba = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista trabajadores");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE TRABAJADORES");
        jLabel1.setToolTipText("");

        jScrollPane1.setToolTipText("");

        jScrollPane1.setViewportView(jListTrabajadores);

        jButtonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-cargarinformacion.png"))); // NOI18N
        jButtonCargar.setText("Cargar");
        jButtonCargar.setToolTipText("");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-guardar2.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setToolTipText("");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-nuevo2-png.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setToolTipText("");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-modificar2.png"))); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.setToolTipText("");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-eliminar.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setToolTipText("");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-salir.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad de trabajadores en total:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Salario total de la empresa:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Trabajadores fijos:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Trabajadores a prueba:");

        jLabelCantTrabPrueba.setText("---");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Salario Total:");

        jLabelSalarioTrabFijos.setText("---");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Salario total:");

        jLabelSalarioTrabPrueba.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCantTrabTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalarioTotalEmpresa)))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalarioTrabFijos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCantTrabFijos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalarioTrabPrueba)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCantTrabPrueba)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabelCantTrabFijos))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabelCantTrabTotal)
                                .addComponent(jLabel5)
                                .addComponent(jLabelCantTrabPrueba)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabelSalarioTotalEmpresa)
                            .addComponent(jLabelSalarioTrabPrueba))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabelSalarioTrabFijos))
                        .addContainerGap())))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("INFORMACION GENERAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(390, 390, 390)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(703, 703, 703))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCargar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        dialogRegistrarTrab dialog = new dialogRegistrarTrab(this, true);
        dialog.setVisible(true);
        
        if (dialog.getTrabajador() != null)
            listmTrabajadores.addTrabajador(dialog.getTrabajador());
        
        dialog.dispose();
        calcularTotales();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        listmTrabajadores.cargarDatos();
        jListTrabajadores.repaint();    
        calcularTotales();
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void calcularTotales() {
        jLabelCantTrabTotal.setText(String.valueOf(listmTrabajadores.getSize()));
        jLabelCantTrabFijos.setText(String.valueOf(listmTrabajadores.getSizeTrabFijos()));
        jLabelCantTrabPrueba.setText(String.valueOf(listmTrabajadores.getSizeTrabPrueba()));
        
        jLabelSalarioTrabPrueba.setText(String.valueOf(listmTrabajadores.getTotalSalarioTrabPrueba()));
        jLabelSalarioTrabFijos.setText(String.valueOf(listmTrabajadores.getTotalSalarioTrabFijo()));
        jLabelSalarioTotalEmpresa.setText(String.valueOf(listmTrabajadores.getTotalSalarioEmp()));
    }     
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
            listmTrabajadores.guardarDatos();
            JOptionPane.showMessageDialog(null, "Guardado satisfactoriamente.", "GUARDADO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        dialogRegistrarTrab dialog = new dialogRegistrarTrab(this, true);
        dialog.setTrabajador((Trabajador)listmTrabajadores.getElementAt(jListTrabajadores.getSelectedIndex()));    /////

        dialog.setVisible(true);  
        
        jListTrabajadores.repaint();
           
        dialog.dispose();
        calcularTotales();
        //JOptionPane.showMessageDialog(null, "No se puede modificar ninguna entrada porque la lista esta vacia", "ERROR", JOptionPane.INFORMATION_MESSAGE);  
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        JFrame frameConfirmar = new JFrame();
        String[] opcion = new String[2];
        opcion[0] = "Si";
        opcion[1] = "No";
        int confirmar = JOptionPane.showOptionDialog(frameConfirmar.getContentPane(),"¿Desea eliminar al trabajador seleccionado?","Confirmar", 0,JOptionPane.INFORMATION_MESSAGE, null, opcion, null);
        if (confirmar == 0) {
            listmTrabajadores.delTrabajador(jListTrabajadores.getSelectedIndex());
            calcularTotales();
        }    
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        JFrame frameConfirmar = new JFrame();
        String[] opcion = new String[2];
        opcion[0] = "Si";
        opcion[1] = "No";
        int confirmar = JOptionPane.showOptionDialog(frameConfirmar.getContentPane(),"¿Desea salir del programa?","Confirmar", 0,JOptionPane.INFORMATION_MESSAGE, null, opcion, null);
        
        if (confirmar == 0)
            System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTrabajadores().setVisible(true);
            }
        });
    }
    
    class AbsListModelTrab extends AbstractListModel {

        private ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
            
        public void addTrabajador(Trabajador t) {
            listaTrabajadores.add(t);
            this.fireIntervalAdded(this, getSize(), getSize() + 1);   
        }
    
        public void delTrabajador(int i) {
            listaTrabajadores.remove(i);
            this.fireIntervalAdded(this, getSize(), getSize() + 1);   
        }
        
        public double getTotalSalarioEmp () {
            double TotalSalarioEmp = 0;
            for (int i = 0; i < listmTrabajadores.getSize(); ++i) {
                TotalSalarioEmp += listmTrabajadores.listaTrabajadores.get(i).totalSalario();
            }
            return TotalSalarioEmp;
        }
        
        public double getTotalSalarioTrabPrueba () {
            double SalarioTotalTrabPrueba = 0;
            for (int i = 0; i < listmTrabajadores.getSize(); ++i) { 
                if (listmTrabajadores.getElementAt(i) instanceof TrabajadorAPrueba)
                    SalarioTotalTrabPrueba += listmTrabajadores.listaTrabajadores.get(i).totalSalario();
            }
            return SalarioTotalTrabPrueba;
        }
        
        public double getTotalSalarioTrabFijo () {
            double SalarioTotalTrabFijo = 0;
            for (int i = 0; i < listmTrabajadores.getSize(); i++) {
                if (listmTrabajadores.getElementAt(i) instanceof TrabajadorFijo)
                    SalarioTotalTrabFijo += listmTrabajadores.listaTrabajadores.get(i).totalSalario();
            }
            return SalarioTotalTrabFijo;
        }
        
        public int getSizeTrabFijos() {
            int TrabFijos = 0;
            for (int i = 0; i < listaTrabajadores.size(); i++) {
                if (listmTrabajadores.listaTrabajadores.get(i) instanceof TrabajadorFijo)
                    TrabFijos++;             
            }
            return TrabFijos;
        }
        
        public int getSizeTrabPrueba () {
            int TrabPrueba = 0;
            for (int i = 0; i < listaTrabajadores.size(); i++) {
                if (listmTrabajadores.listaTrabajadores.get(i) instanceof TrabajadorAPrueba)
                    TrabPrueba++;
            }
            return TrabPrueba;
        }
        
        @Override
        public int getSize() {
            return listaTrabajadores.size();
        }

        @Override
        public Object getElementAt(int i) {
            try {
                return listaTrabajadores.get(i);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "No se puede modificar ninguna entrada porque la lista esta vacia", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            return listaTrabajadores.get(i);
        }
      
    
        public void guardarDatos() { 
            try {
                ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("src/clases/ficheroInfoTrabajadores.dat"));
                outStream.writeObject(listaTrabajadores);
                outStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    
        public void cargarDatos() { 
            try {
                FileInputStream file = new FileInputStream("src/clases/ficheroInfoTrabajadores.dat"); 
                ObjectInputStream inputStream = new ObjectInputStream(file);
                listaTrabajadores = (ArrayList<Trabajador>) inputStream.readObject();
                inputStream.close();
                this.fireIntervalAdded(this, getSize(), getSize() + 1);               
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCantTrabFijos;
    private javax.swing.JLabel jLabelCantTrabPrueba;
    private javax.swing.JLabel jLabelCantTrabTotal;
    private javax.swing.JLabel jLabelSalarioTotalEmpresa;
    private javax.swing.JLabel jLabelSalarioTrabFijos;
    private javax.swing.JLabel jLabelSalarioTrabPrueba;
    private javax.swing.JList<String> jListTrabajadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
