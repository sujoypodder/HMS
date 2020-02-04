/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;



import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author manik-pc
 */
public class insearch extends javax.swing.JFrame {

    /**
     * Creates new form insearch
     */
    public insearch() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Patient Reg.ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(54, 110, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Patient Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 190, 120, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 110, 170, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 190, 170, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 280, 140, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 290, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/IMG_0016.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-190, -60, 800, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       idno = jTextField1.getText();
       name = jTextField2.getText();
       
       
       
        ResultSet rs=null;
        PreparedStatement ps=null;
        String query=new String();
        
        query="select idno,date,name,fathername,sex,age,phoneno,address,condocname,roomno from patientreg2 ";
        try{
          ps=conn.prepareStatement(query);
          rs=ps.executeQuery();
          int flag=0;
          while(rs.next()){
              if(rs.getString("name").equals(name) && rs.getString("idno").equals(idno))
              {System.out.print("mmmmmm");
                  a=rs.getString("idno");
                  b=rs.getString("date");
                  c=rs.getString("name");
                  d=rs.getString("fathername");
                  e=rs.getString("sex");
                  g=rs.getString("age");
                  h=rs.getString("phoneno");
                  i=rs.getString("address");
                  j=rs.getString("condocname");
                  m=rs.getString("roomno");
                  
                  Search f=new Search();
                  this.setVisible(false);
                  f.setVisible(true);
                  
                  //******************show the patient information**************
                  //************************************************************
                  
                  f.idno.setText(a);
                  f.date.setText(b);
                  f.name.setText(c);
                  f.fathername.setText(d);
                  f.sex.setText(e);
                  f.age.setText(g);
                  f.phoneno.setText(h);
                  f.address.setText(i);
                  f.condoc.setText(j);
                  
                  f.roomno.setText(m);
                  
                  
                  flag=1;
              }
          }
          if(flag==0)
          {
              JOptionPane.showMessageDialog(null,"DON'T MATCH WITH PATIENT NAME & ID\nPLS TRY AGAIN");
          }
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"PLS TRY AGAIN");
      }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        conn = Sqlite.ConnectDB();
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
       Login lg=new Login();
       lg.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public Connection conn =null;
    public String idno = new String();
    public String a = new String();
    public String b = new String();
    public String c = new String();
    public String d = new String();
    public String e = new String();
    public String g = new String();
    public String h = new String();
    public String i = new String();
    public String j = new String();
    public String k = new String();
    public String l = new String();
    public String m = new String();
    public String n = new String();
    public String name = new String();
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
            java.util.logging.Logger.getLogger(insearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
