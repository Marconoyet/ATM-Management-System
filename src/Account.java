
import java.awt.Dimension;
import java.awt.Toolkit;
import java.security.MessageDigest;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.security.NoSuchAlgorithmException;
import java.lang.Throwable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 ,size.height/2 - getHeight()/2 );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jCredit_card = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jGender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jpass = new javax.swing.JTextField();
        jLast_Name = new javax.swing.JTextField();
        jFrist_Name = new javax.swing.JTextField();
        jAmount = new javax.swing.JTextField();
        jMICR_NO = new javax.swing.JTextField();
        jAccount_Type = new javax.swing.JComboBox<>();
        jMobile_No = new javax.swing.JTextField();
        jAccount = new javax.swing.JTextField();
        jNational = new javax.swing.JTextField();
        JAddress = new javax.swing.JTextField();
        jEmail_Address = new javax.swing.JTextField();
        jDate_Of_Birth = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jCheque_NO = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCheque_NO1 = new javax.swing.JTextField();
        Account = new javax.swing.JLabel();
        jWarn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\Icons\\16116.png")); // NOI18N
        jButton3.setText("Back ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(440, 640, 140, 50);

        jCredit_card.setEditable(false);
        jCredit_card.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jCredit_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCredit_cardActionPerformed(evt);
            }
        });
        jPanel1.add(jCredit_card);
        jCredit_card.setBounds(120, 160, 250, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 290, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Account Type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 530, 130, 70);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\Icons\\delete-sign--v2.png")); // NOI18N
        jButton2.setText("Clear ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(630, 640, 150, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\Icons\\13732.png")); // NOI18N
        jButton1.setText("Create");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(257, 640, 150, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(" Credit-card");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 150, 110, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Mobile No");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 440, 110, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Frist name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 160, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nationality");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(500, 400, 100, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("MICR No");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 220, 71, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 490, 90, 30);

        jAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jAddress.setText("Address");
        jPanel1.add(jAddress);
        jAddress.setBounds(500, 530, 100, 70);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Date Of Brith");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(494, 340, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Amount");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 480, 90, 70);

        jGender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        jPanel1.add(jGender);
        jGender.setBounds(120, 490, 250, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Last name");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(500, 210, 100, 50);

        jpass.setEditable(false);
        jpass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        jPanel1.add(jpass);
        jpass.setBounds(120, 290, 250, 30);

        jLast_Name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLast_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLast_NameActionPerformed(evt);
            }
        });
        jPanel1.add(jLast_Name);
        jLast_Name.setBounds(610, 220, 250, 30);

        jFrist_Name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jFrist_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrist_NameActionPerformed(evt);
            }
        });
        jPanel1.add(jFrist_Name);
        jFrist_Name.setBounds(610, 160, 250, 30);

        jAmount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmountActionPerformed(evt);
            }
        });
        jPanel1.add(jAmount);
        jAmount.setBounds(610, 500, 250, 30);

        jMICR_NO.setEditable(false);
        jMICR_NO.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMICR_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICR_NOActionPerformed(evt);
            }
        });
        jPanel1.add(jMICR_NO);
        jMICR_NO.setBounds(120, 220, 250, 30);

        jAccount_Type.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jAccount_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Current account ", "Savings account", "Salary account", "Fixed deposit account", "Recurring deposit account" }));
        jAccount_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccount_TypeActionPerformed(evt);
            }
        });
        jPanel1.add(jAccount_Type);
        jAccount_Type.setBounds(120, 550, 250, 30);

        jMobile_No.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMobile_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMobile_NoActionPerformed(evt);
            }
        });
        jPanel1.add(jMobile_No);
        jMobile_No.setBounds(610, 450, 250, 30);

        jAccount.setEditable(false);
        jAccount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccountActionPerformed(evt);
            }
        });
        jPanel1.add(jAccount);
        jAccount.setBounds(120, 430, 250, 30);

        jNational.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jNational.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNationalActionPerformed(evt);
            }
        });
        jPanel1.add(jNational);
        jNational.setBounds(610, 400, 250, 30);

        JAddress.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAddressActionPerformed(evt);
            }
        });
        jPanel1.add(JAddress);
        JAddress.setBounds(610, 550, 250, 30);

        jEmail_Address.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jEmail_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmail_AddressActionPerformed(evt);
            }
        });
        jPanel1.add(jEmail_Address);
        jEmail_Address.setBounds(610, 280, 250, 30);
        jPanel1.add(jDate_Of_Birth);
        jDate_Of_Birth.setBounds(610, 340, 250, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Email Address");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(490, 270, 110, 50);

        jCheque_NO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheque_NO.setText("Cheque NO");
        jPanel1.add(jCheque_NO);
        jCheque_NO.setBounds(10, 360, 110, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Pictures\\Screenshots\\Screenshot (1462).png")); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-20, 30, 450, 100);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Thank You For Dealing with us");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(498, 44, 540, 70);

        jCheque_NO1.setEditable(false);
        jCheque_NO1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jCheque_NO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheque_NO1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheque_NO1);
        jCheque_NO1.setBounds(120, 360, 250, 30);

        Account.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Account.setText("Account_id");
        jPanel1.add(Account);
        Account.setBounds(17, 432, 120, 30);

        jWarn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jWarn.setForeground(new java.awt.Color(255, 0, 51));
        jWarn.setText("You must save credit card and password numbers");
        jPanel1.add(jWarn);
        jWarn.setBounds(550, 110, 400, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\Icons\\house-money-background-extended.jpg")); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 1060, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     *
     * @param password
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String hashPassword(String password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] b = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b1 : b){
            sb.append(Integer.toHexString(b1 & 0xff).toString());
        }
        return sb.toString();
    }
    public String Crypto(String pass){
        char[] ch = pass.toCharArray();
        String crypt = "";
        for (char c : ch){
            c += 10;
            crypt += c;
        }
        return  crypt;   
    }
     public String DeCrypto(String pass){
        char[] ch = pass.toCharArray();
        String crypt = "";
        for (char c : ch){
            c -= 10;
            crypt += c;
        }
        return  crypt;   
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jFrist_Name.setText("");
       jLast_Name.setText("");
       jAmount.setText("");
       jEmail_Address.setText("");
       jNational.setText("");
       jMobile_No.setText("");
       JAddress.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCredit_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCredit_cardActionPerformed
      
    }//GEN-LAST:event_jCredit_cardActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        Authentication obj = new Authentication();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLast_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLast_NameActionPerformed
        jLast_Name.setText("Ahmed");
    }//GEN-LAST:event_jLast_NameActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void jFrist_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrist_NameActionPerformed
     
    }//GEN-LAST:event_jFrist_NameActionPerformed

    private void jAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmountActionPerformed

    private void jMICR_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICR_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICR_NOActionPerformed

    private void jAccount_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccount_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAccount_TypeActionPerformed

    private void jMobile_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMobile_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMobile_NoActionPerformed

    private void jAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAccountActionPerformed

    private void jNationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNationalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNationalActionPerformed

    private void JAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAddressActionPerformed

    private void jEmail_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmail_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmail_AddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
   
    
    try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?serverTimezone=UTC","root","root");
        PreparedStatement stmt= con.prepareStatement(" insert into accountt (credit_card, MICR_NO, Cheque_NO, pass, Frist_Name, Last_Name, Gender, Account_type, Amount, Email_address, Address, Date_Of_Birth, Nationality, Mobile_No, Account_Id, Adminstrator) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"); 
        PreparedStatement stmt1 = con.prepareStatement("select client_id from accountt");
        ResultSet res_id = stmt1.executeQuery();
        /*String Frist_Name = jFrist_Name.getText();
        String Last_Name = jLast_Name.getText();
        String gender = jGender.getSelectedItem().toString();
        String Account_type = jAccount_Type.getSelectedItem().toString();
        String Amount = jAmount.getText();
        String Email_Address = jEmail_Address.getText();
        String Address = JAddress.getText();
        String Date_Of_Birth;
        Date_Of_Birth = ((JTextField)jDate_Of_Birth.getDateEditor().getUiComponent()).getText();
        String Nationality = jNational.getText();
        String Mobile_No = jMobile_No.getText();
        JOptionPane.showMessageDialog(null,Mobile_No );*/
        
        stmt.setString(1,Crypto(jCredit_card.getText()));
        stmt.setString(2,Crypto(jMICR_NO.getText()));
        stmt.setString(3,Crypto(jCheque_NO1.getText()));
        stmt.setString(4,hashPassword(jpass.getText()));
        stmt.setString(5, jFrist_Name.getText());
        stmt.setString(6, jLast_Name.getText());
        stmt.setString(7, jGender.getSelectedItem().toString());
        stmt.setString(8, jAccount_Type.getSelectedItem().toString());
        stmt.setString(9, jAmount.getText());
        stmt.setString(10, jEmail_Address.getText());
        stmt.setString(11, JAddress.getText());
        stmt.setString(12, ((JTextField)jDate_Of_Birth.getDateEditor().getUiComponent()).getText());
        stmt.setString(13, jNational.getText());
        stmt.setString(14, jNational.getText());
        stmt.setString(15, Crypto(jAccount.getText()));
        stmt.setString(16,"Yes");
        while (res_id.next()){
            
            String[] results_id = {res_id.getString(1)};
            
                if (results_id.length >= 1){
                    stmt.setString(16,"NO");
                }
                else{
                    stmt.setString(16,"Yes");
                }
                
           }
      
        
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Your account is created successfully :) ");
        Authentication2 auth2 = new Authentication2();
        auth2.setVisible(true);
        auth2.jWelcome.setText("Now, you can Login " + jFrist_Name.getText()+ " " + jLast_Name.getText() );
        auth2.jCard.setText(jCredit_card.getText());
        auth2.jpas.setText(jpass.getText());
        this.setVisible(false);
        
    }
    catch(Exception e){
    
        JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jCheque_NO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheque_NO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheque_NO1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JTextField JAddress;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JTextField jAccount;
    private javax.swing.JComboBox<String> jAccount_Type;
    private javax.swing.JLabel jAddress;
    private javax.swing.JTextField jAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jCheque_NO;
    public static javax.swing.JTextField jCheque_NO1;
    public static javax.swing.JTextField jCredit_card;
    private com.toedter.calendar.JDateChooser jDate_Of_Birth;
    private javax.swing.JTextField jEmail_Address;
    private javax.swing.JTextField jFrist_Name;
    private javax.swing.JComboBox<String> jGender;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLast_Name;
    public static javax.swing.JTextField jMICR_NO;
    private javax.swing.JTextField jMobile_No;
    private javax.swing.JTextField jNational;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jWarn;
    public static javax.swing.JTextField jpass;
    // End of variables declaration//GEN-END:variables
}
