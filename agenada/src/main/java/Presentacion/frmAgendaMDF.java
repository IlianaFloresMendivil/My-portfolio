package Presentacion;

import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class frmAgendaMDF extends javax.swing.JDialog {

    public String ID, Nombre, Telefono, Correo, Organizacion, Etiquetas;

    public frmAgendaMDF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void llenar() {

        txtFldNombre1.setText(Nombre);
        txtFldTelefono1.setText(Telefono);
        txtFldCorreo1.setText(Correo);
        txtFldOrganizacion1.setText(Organizacion);
        txtFldEtiquetas1.setText(Etiquetas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Avatares = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtFldTelefono1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFldCorreo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFldOrganizacion1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFldEtiquetas1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFldNombre1 = new javax.swing.JTextField();
        Klingon = new javax.swing.JRadioButton();
        Freddy = new javax.swing.JRadioButton();
        Spock = new javax.swing.JRadioButton();
        BorgQ = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        jLabel3.setText("Telefono");

        btnCancelar.setText("cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo(se pone \",\" en lugar de punto");

        jLabel5.setText("Organizacion");

        jLabel6.setText("Etiquetas");

        jLabel7.setText("Avatar");

        btnAceptar.setText("aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        txtFldNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNombre1ActionPerformed(evt);
            }
        });

        Avatares.add(Klingon);
        Klingon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-cabeza-de-klingon-48.png")); // NOI18N
        Klingon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlingonActionPerformed(evt);
            }
        });

        Avatares.add(Freddy);
        Freddy.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-five-nights-at-freddys-48.png")); // NOI18N
        Freddy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreddyActionPerformed(evt);
            }
        });

        Avatares.add(Spock);
        Spock.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-cabeza-de-vulcano-48.png")); // NOI18N
        Spock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpockActionPerformed(evt);
            }
        });

        BorgQ.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-cabeza-de-borg-48.png")); // NOI18N
        Avatares.add(BorgQ);
        BorgQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorgQActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Freddy)
                                .addGap(128, 128, 128)
                                .addComponent(Spock)
                                .addGap(41, 41, 41)
                                .addComponent(BorgQ))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFldNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFldTelefono1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFldCorreo1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFldOrganizacion1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFldEtiquetas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Klingon)
                            .addComponent(btnAceptar))
                        .addGap(39, 39, 39)
                        .addComponent(btnCancelar)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BorgQ)
                            .addComponent(Spock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldOrganizacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldEtiquetas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Freddy)
                            .addComponent(Klingon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        File archivo = new File("usuariosAgenda.cnf");
    
    if (archivo.exists() && archivo.canRead()) {
        try {
            String nuevo = "";
            String linea;
            String editado = txtID.getText() + "." + txtFldNombre1.getText() + "." + txtFldTelefono1.getText() + "." + txtFldCorreo1.getText() + "." + txtFldOrganizacion1.getText() + "." + txtFldEtiquetas1.getText();
            
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    String[] datos = linea.split("\\.");
                    if (datos.length > 0 && ID.equals(datos[0].trim())) {
                        nuevo += editado + "\n";
                    } else {
                        nuevo += linea + "\n";
                    }
                }
            }
            
            br.close();
            fr.close();
            
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nuevo);
            bw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(this, "Se editó correctamente");
            this.dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void KlingonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlingonActionPerformed
        Klingon.setText("Klingon");
    }//GEN-LAST:event_KlingonActionPerformed

    private void FreddyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreddyActionPerformed
        Freddy.setText("Freddy");
    }//GEN-LAST:event_FreddyActionPerformed

    private void SpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpockActionPerformed
        Spock.setText("Spock");
    }//GEN-LAST:event_SpockActionPerformed

    private void BorgQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorgQActionPerformed
        BorgQ.setText("Borg");
    }//GEN-LAST:event_BorgQActionPerformed

    private void txtFldNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNombre1ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(frmAgendaMDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgendaMDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgendaMDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgendaMDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frmAgendaMDF dialog = new frmAgendaMDF(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup Avatares;
    private javax.swing.JButton BorgQ;
    private javax.swing.JRadioButton Freddy;
    private javax.swing.JRadioButton Klingon;
    private javax.swing.JRadioButton Spock;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtFldCorreo1;
    private javax.swing.JTextField txtFldEtiquetas1;
    private javax.swing.JTextField txtFldNombre1;
    private javax.swing.JTextField txtFldOrganizacion1;
    private javax.swing.JTextField txtFldTelefono1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private void addWindowListaner(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
