/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author manik-pc
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        condoc = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Reg. ID No :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Submission Date :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 104, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Patient Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Father Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(16, 220, 84, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Sex :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 280, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Age :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 350, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Phone No :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 60, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Address :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 120, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Consulting Doctor :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 190, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Room No :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(350, 254, 100, 40);
        getContentPane().add(idno);
        idno.setBounds(130, 50, 150, 40);
        getContentPane().add(date);
        date.setBounds(130, 100, 140, 30);
        getContentPane().add(name);
        name.setBounds(130, 150, 140, 40);
        getContentPane().add(fathername);
        fathername.setBounds(130, 220, 140, 40);
        getContentPane().add(sex);
        sex.setBounds(130, 280, 140, 40);
        getContentPane().add(age);
        age.setBounds(130, 340, 140, 40);
        getContentPane().add(phoneno);
        phoneno.setBounds(470, 60, 150, 30);
        getContentPane().add(address);
        address.setBounds(470, 110, 150, 40);
        getContentPane().add(condoc);
        condoc.setBounds(470, 180, 150, 40);
        getContentPane().add(roomno);
        roomno.setBounds(470, 250, 150, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(463, 343, 120, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Patient Information");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(190, 0, 310, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/doctors-hospital-corridor-nurse-pushing-gurney-stretcher-bed-male-senior-female-patient-32154012.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        insearch kp=new insearch();
        kp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
       conn = Sqlite.ConnectDB();
    }  
       public Connection conn=null;
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }
    public javax.swing.JTextField address;
    public javax.swing.JTextField age;
    public javax.swing.JTextField condoc;
    public javax.swing.JTextField date;
    public javax.swing.JTextField fathername;
    public javax.swing.JTextField idno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField name;
    public javax.swing.JTextField phoneno;
    public javax.swing.JTextField roomno;
    public javax.swing.JTextField sex;
}
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField condoc;
    private javax.swing.JTextField date;
    private javax.swing.JTextField fathername;
    private javax.swing.JTextField idno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField roomno;
    private javax.swing.JTextField sex;
    // End of variables declaration//GEN-END:variables
}*/
