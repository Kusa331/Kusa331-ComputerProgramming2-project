
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author noel
 */
public class Officialregistration extends javax.swing.JFrame {

    /**
     * Creates new form Officialregistration
     */
    public Officialregistration() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rButton = new javax.swing.JButton();
        fName2 = new javax.swing.JTextField();
        mName2 = new javax.swing.JTextField();
        lName2 = new javax.swing.JTextField();
        bPosition = new javax.swing.JTextField();
        bDay2 = new javax.swing.JTextField();
        aAge2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbGender2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(848, 585));
        setMinimumSize(new java.awt.Dimension(848, 585));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("OFFICIAL REGISTRATION");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("BARANGAY INFORMATION SYSTEMS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(284, 284, 284))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 75);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        rButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rButton.setForeground(new java.awt.Color(51, 255, 0));
        rButton.setText("REGISTER OFFICIAL");
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });
        jPanel3.add(rButton);
        rButton.setBounds(463, 323, 138, 23);
        jPanel3.add(fName2);
        fName2.setBounds(330, 40, 237, 22);
        jPanel3.add(mName2);
        mName2.setBounds(330, 80, 237, 22);

        lName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lName2ActionPerformed(evt);
            }
        });
        jPanel3.add(lName2);
        lName2.setBounds(330, 120, 237, 22);

        bPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPositionActionPerformed(evt);
            }
        });
        jPanel3.add(bPosition);
        bPosition.setBounds(330, 160, 237, 22);

        bDay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDay2ActionPerformed(evt);
            }
        });
        jPanel3.add(bDay2);
        bDay2.setBounds(330, 200, 237, 22);
        jPanel3.add(aAge2);
        aAge2.setBounds(330, 240, 237, 22);

        jLabel2.setText("First Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(240, 50, 57, 16);

        jLabel3.setText("Middle Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(230, 80, 72, 16);

        jLabel4.setText("Last Name");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(250, 120, 56, 16);

        jLabel5.setText("Position");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(260, 160, 43, 16);

        jLabel6.setText("Birthday");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(260, 200, 44, 16);

        jLabel7.setText("Age");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(280, 240, 21, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("Example: MM/DD/YYYY");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(580, 210, 126, 16);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("or directs a group of people, organization,");

        jLabel12.setText("or community towards achieving a common");

        jLabel13.setText("goal or vision.");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tip:");

        jLabel10.setText("A leader is a person who guides, influences,");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(330, 370, 246, 110);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\noel\\Downloads\\Davao_City_Ph_official_seal (1).png")); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 6, 120, 120);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Gender");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(260, 280, 38, 16);

        cbGender2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Terrorist" }));
        jPanel3.add(cbGender2);
        cbGender2.setBounds(330, 280, 140, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 70, 850, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lName2ActionPerformed

    private void bPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPositionActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
        String firstname2 = fName2.getText();
        String middlename2 = mName2.getText();
        String lastname2 = lName2.getText();
        String position = bPosition.getText();
        String birthday2 = bDay2.getText();
        String age2 = aAge2.getText();
        String gender2 =(String)cbGender2.getSelectedItem();
        if (firstname2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your firstname.", "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (middlename2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your middlename.", "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (lastname2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your lastname.", "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (position.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please specify your position.", "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (birthday2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your birthday.", "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (age2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your age.", "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String documentsPath = System.getProperty("user.home") + File.separator + "Documents";
        File userFolder = new File(documentsPath + File.separator + "RegisteredOfficials");
        if (!userFolder.exists()) {
            userFolder.mkdirs();
        }

        try {
            FileWriter writer = new FileWriter(userFolder.getAbsolutePath() + File.separator + "officials.txt", true);
            writer.write(firstname2 + "," + lastname2 + "," + middlename2 + "," + position + "," + birthday2 + "," + age2 + "," + gender2 + "\n");
            writer.close();
            this.dispose();
            new Homepage().setVisible(true);
            JOptionPane.showMessageDialog(this, "Official registered successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_rButtonActionPerformed

    private void bDay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDay2ActionPerformed

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
            java.util.logging.Logger.getLogger(Officialregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Officialregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Officialregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Officialregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Officialregistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aAge2;
    private javax.swing.JTextField bDay2;
    private javax.swing.JTextField bPosition;
    private javax.swing.JComboBox<String> cbGender2;
    private javax.swing.JTextField fName2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lName2;
    private javax.swing.JTextField mName2;
    private javax.swing.JButton rButton;
    // End of variables declaration//GEN-END:variables
}
