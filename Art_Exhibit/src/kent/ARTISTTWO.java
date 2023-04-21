


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import table.arttable;


/**
 *
 * @author kentj
 */
public class ARTISTTWO extends javax.swing.JFrame {

    /**
     * Creates new form ARTISTTWO
     */
    public ARTISTTWO() {
        initComponents();
       
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Aid = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        Bdate = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Artist_ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 70, -1));

        Aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AidActionPerformed(evt);
            }
        });
        jPanel1.add(Aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 350, -1));

        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 350, -1));

        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });
        jPanel1.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 350, -1));

        Bdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdateActionPerformed(evt);
            }
        });
        jPanel1.add(Bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 350, -1));

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 350, -1));
        jPanel1.add(pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 350, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("BACK TO MENU");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, 30));

        jLabel5.setText("Birthdate:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 60, -1));

        jLabel6.setText("Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 70, -1));

        jLabel3.setText("Firstname:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 70, -1));

        jLabel7.setText("PhoneNumber:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 80, -1));

        jLabel4.setText("Lastname:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("SHOW ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 100, 40));

        jLabel8.setFont(new java.awt.Font("Akira Expanded", 1, 12)); // NOI18N
        jLabel8.setText("PLEASE FILLOUT TO ENTER THE ARTIST");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kentj\\Downloads\\artistic.new kamot.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         String URL = "jdbc:derby://localhost:1527/C:/DERBY/ArtEdb";
        String query = "UPDATE ARTIST SET Firstname =?, Lastname=?, Birthdate=?, Address=?, Phonenumber=? WHERE Artist_ID =?";
        
       
        try {
            Connection con = DriverManager.getConnection(URL);
            PreparedStatement ps = con.prepareStatement(query);
            
          
            ps.setString(1, Fname.getText());
            ps.setString(2, Lname.getText());
            ps.setString(3, Bdate.getText());
            ps.setString(4, Address.getText());
            ps.setString(5, pno.getText());
            ps.setString(6, Aid.getText());
            
            int a = ps.executeUpdate();
            if (a==1){
                
                Aid.setText("");
                Fname.setText("");
                Lname.setText("");
                Bdate.setText("");
                Address.setText("");
                pno.setText("");
                Aid.requestFocus();
               
                
                 JOptionPane.showMessageDialog(null,"Updated Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Failed");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ARTIST bbm = new ARTIST();
        bbm.show();
        dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String URL = "jdbc:derby://localhost:1527/C:/DERBY/ArtEdb";
        String query = "insert into ARTIST(Artist_ID, Firstname, Lastname, Birthdate, Address, Phonenumber )Values(?,?,?,?,?,?)";
        
       
        try {
            Connection con = DriverManager.getConnection(URL);
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, Aid.getText());
            ps.setString(2, Fname.getText());
            ps.setString(3, Lname.getText());
            ps.setString(4, Bdate.getText());
            ps.setString(5, Address.getText());
            ps.setString(6, pno.getText());
            
            int a = ps.executeUpdate();
            if (a==1){
                
                Aid.setText("");
                Fname.setText("");
                Lname.setText("");
                Bdate.setText("");
                Address.setText("");
                pno.setText("");
                Aid.requestFocus();
               
                
                 JOptionPane.showMessageDialog(null,"Added Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Failed");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void BdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BdateActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          String URL = "jdbc:derby://localhost:1527/C:/DERBY/ArtEdb";
        String query = "Delete from ARTIST where ARTIST_ID =?  ";
        
       
        try {
            Connection con = DriverManager.getConnection(URL);
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, Aid.getText());
            
            int a = ps.executeUpdate();
            if (a==1){
                
                Aid.setText("");
               
                
                 JOptionPane.showMessageDialog(null,"deleted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Failed");
        }
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        arttable table = new arttable();
        table.show();
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void AidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AidActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

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
            java.util.logging.Logger.getLogger(ARTISTTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ARTISTTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ARTISTTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ARTISTTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ARTISTTWO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Aid;
    private javax.swing.JTextField Bdate;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pno;
    // End of variables declaration//GEN-END:variables
}
