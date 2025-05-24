package Presentacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class frmAgendaINS extends javax.swing.JDialog {

    public frmAgendaINS(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
    }
public void mostrar() {
    // Configura cualquier otra inicialización necesaria para el formulario
    // y luego muestra el formulario
    this.setVisible(true);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFldNombre = new javax.swing.JTextField();
        txtFldTelefono = new javax.swing.JTextField();
        txtFldCorreo = new javax.swing.JTextField();
        txtFldOrganizacion = new javax.swing.JTextField();
        txtFldEtiquetas = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Klingon = new javax.swing.JRadioButton();
        Freddy = new javax.swing.JRadioButton();
        Spock = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        Borg = new javax.swing.JRadioButton();

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("NOMBRE");

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("ID");

        txtFldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNombreActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(102, 0, 0));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Klingon.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-cabeza-de-klingon-48.png")); // NOI18N
        Klingon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlingonActionPerformed(evt);
            }
        });

        Freddy.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-five-nights-at-freddys-48.png")); // NOI18N
        Freddy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreddyActionPerformed(evt);
            }
        });

        Spock.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-cabeza-de-vulcano-48.png")); // NOI18N
        Spock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpockActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("NOMBRE");

        jLabel10.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("TELEFONO");

        jLabel11.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("CORREO(se pone \",\" en lugar de punto)");

        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("ETIQUETAS(para separar etiquetas se pone \";\")");

        jLabel13.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("ORGANIZACION");

        jLabel14.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("AVATAR");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        Borg.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\icons8-cabeza-de-borg-48.png")); // NOI18N
        Borg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtFldNombre)
                    .addComponent(txtFldCorreo)
                    .addComponent(txtFldOrganizacion)
                    .addComponent(txtFldEtiquetas)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Freddy)
                        .addGap(45, 45, 45)
                        .addComponent(Klingon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Spock)
                        .addGap(32, 32, 32)
                        .addComponent(Borg)
                        .addGap(42, 42, 42))
                    .addComponent(txtFldTelefono)
                    .addComponent(txtID)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnAceptar)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelar)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(txtFldOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFldEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(28, 28, 28)
                        .addComponent(Spock))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Borg)
                            .addComponent(Freddy)
                            .addComponent(Klingon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNombreActionPerformed
public void actualizarTabla() {
    LlenarTabla("", "", "", "", "");
    frmAgenda agenda = (frmAgenda) SwingUtilities.getWindowAncestor(this);
agenda.actualizarTabla();

}

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       String ID = txtID.getText();
    String Nombre = txtFldNombre.getText();
    String Telefono = txtFldTelefono.getText();
    String Correo = txtFldCorreo.getText();
    String Organizacion = txtFldOrganizacion.getText();
    String Etiquetas = txtFldEtiquetas.getText();

    // Validación de campos obligatorios
    if (Nombre.isEmpty() || Telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nombre y Teléfono son campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        File archivo = new File("usuariosAgenda.cnf");
        FileWriter fw = new FileWriter(archivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String linea = ID + "." + Nombre + "." + Telefono + "." + Correo + "." + Organizacion + "." + Etiquetas;

        bw.write(linea);
        bw.newLine();
        bw.close();
        fw.close();

        JOptionPane.showMessageDialog(this, "Usuario agregado correctamente.");
        
        // Limpia los campos después de agregar
        txtID.setText("");
        txtFldNombre.setText("");
        txtFldTelefono.setText("");
        txtFldCorreo.setText("");
        txtFldOrganizacion.setText("");
        
        // Actualiza la tabla en frmAgenda
        frmAgenda agenda = (frmAgenda) SwingUtilities.getWindowAncestor(this);
       
        
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al agregar usuario.", "Error", JOptionPane.ERROR_MESSAGE);
    
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

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void BorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorgActionPerformed
       Borg.setText("Borg");
    }//GEN-LAST:event_BorgActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frmAgendaINS dialog = new frmAgendaINS(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton Borg;
    private javax.swing.JRadioButton Freddy;
    private javax.swing.JRadioButton Klingon;
    private javax.swing.JRadioButton Spock;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFldCorreo;
    private javax.swing.JTextField txtFldEtiquetas;
    private javax.swing.JTextField txtFldNombre;
    private javax.swing.JTextField txtFldOrganizacion;
    private javax.swing.JTextField txtFldTelefono;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private void LlenarTabla(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
