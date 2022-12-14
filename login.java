package project3.orderman.invoice.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rohena Black
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
            
    public login() {
        initComponents();
        this.setLocationRelativeTo(null); // Center form in screen
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFormLeftJPanel = new javax.swing.JPanel();
        companyNameJLabel = new javax.swing.JLabel();
        developersJLabel = new javax.swing.JLabel();
        technocratsAddressJLabel = new javax.swing.JLabel();
        technocratsNumJLabel = new javax.swing.JLabel();
        technocratsEmailJLabel = new javax.swing.JLabel();
        loginImgJLabel = new javax.swing.JLabel();
        loginFormRightJPanel = new javax.swing.JPanel();
        minimizeLoginFormJLabel = new javax.swing.JLabel();
        LoginJLabel = new javax.swing.JLabel();
        UserNameJLabel = new javax.swing.JLabel();
        UserNameJTextField = new javax.swing.JTextField();
        PasswordJLabel = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        createNewAccJLabel = new javax.swing.JLabel();
        createNewAccJLabel1 = new javax.swing.JLabel();
        closeLoginFormJLabel1 = new javax.swing.JLabel();
        LoginPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginFormLeftJPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginFormLeftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        companyNameJLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        companyNameJLabel.setForeground(new java.awt.Color(255, 195, 0));
        companyNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyNameJLabel.setText("CLOTHED UNDER GRACE");
        loginFormLeftJPanel.add(companyNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 570, -1));

        developersJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        developersJLabel.setText("?? 2022 Order Management System. All rights reserved | Designed by Technocrats");
        loginFormLeftJPanel.add(developersJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 359, 570, -1));

        technocratsAddressJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        technocratsAddressJLabel.setText("UWI Mona, Kingston 7.");
        loginFormLeftJPanel.add(technocratsAddressJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 381, 570, -1));

        technocratsNumJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        technocratsNumJLabel.setText("+1 876 1234567 | +1 876 9876543");
        loginFormLeftJPanel.add(technocratsNumJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 403, 570, -1));

        technocratsEmailJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        technocratsEmailJLabel.setText("technocrats@gmail.com ");
        loginFormLeftJPanel.add(technocratsEmailJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 425, 570, -1));

        loginImgJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project3/orderman/invoice/login/loginImg2.png"))); // NOI18N
        loginFormLeftJPanel.add(loginImgJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 80, 281, 261));

        getContentPane().add(loginFormLeftJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 460));

        loginFormRightJPanel.setBackground(new java.awt.Color(255, 195, 0));
        loginFormRightJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeLoginFormJLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        minimizeLoginFormJLabel.setForeground(new java.awt.Color(255, 255, 255));
        minimizeLoginFormJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLoginFormJLabel.setText("-");
        minimizeLoginFormJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLoginFormJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLoginFormJLabelMouseClicked(evt);
            }
        });
        loginFormRightJPanel.add(minimizeLoginFormJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -10, 30, 40));

        LoginJLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginJLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginJLabel.setText("LOGIN");
        loginFormRightJPanel.add(LoginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 378, -1));

        UserNameJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameJLabel.setText("Username");
        loginFormRightJPanel.add(UserNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 120, 70, -1));

        UserNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameJTextFieldActionPerformed(evt);
            }
        });
        loginFormRightJPanel.add(UserNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 145, 300, 40));

        PasswordJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PasswordJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJLabel.setText("Password");
        loginFormRightJPanel.add(PasswordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 210, 74, -1));

        loginJButton.setForeground(new java.awt.Color(255, 195, 0));
        loginJButton.setText("LOGIN");
        loginJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        loginFormRightJPanel.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 336, 125, 32));

        createNewAccJLabel.setForeground(new java.awt.Color(255, 255, 255));
        createNewAccJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createNewAccJLabel.setText("Click here to create a new account");
        createNewAccJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNewAccJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewAccJLabelMouseClicked(evt);
            }
        });
        loginFormRightJPanel.add(createNewAccJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 403, 390, -1));

        createNewAccJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        createNewAccJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createNewAccJLabel1.setText("Forgot password?");
        createNewAccJLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginFormRightJPanel.add(createNewAccJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        closeLoginFormJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeLoginFormJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        closeLoginFormJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLoginFormJLabel1.setText("X");
        closeLoginFormJLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLoginFormJLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLoginFormJLabel1MouseClicked(evt);
            }
        });
        loginFormRightJPanel.add(closeLoginFormJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 37, 30));
        loginFormRightJPanel.add(LoginPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 240, 300, 40));

        getContentPane().add(loginFormRightJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 390, 460));

        setSize(new java.awt.Dimension(958, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeLoginFormJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLoginFormJLabelMouseClicked
        this.setState(login.ICONIFIED);
        
    }//GEN-LAST:event_minimizeLoginFormJLabelMouseClicked

    private void UserNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameJTextFieldActionPerformed

    private void closeLoginFormJLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLoginFormJLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLoginFormJLabel1MouseClicked

    private void createNewAccJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewAccJLabelMouseClicked
        registerForm rgf= new registerForm(); //When clicked, registration form pops up
        rgf.setVisible(true); 
        rgf.pack();
        rgf.setLocationRelativeTo(null); //centers form
        rgf.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        this.dispose(); //closes login form when registration form pops up
    }//GEN-LAST:event_createNewAccJLabelMouseClicked

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        String username= UserNameJTextField.getText();
        String password= String.valueOf(LoginPasswordField.getPassword());
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username/Password should not be empty!", "Error- Empty Field", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Start login process
            userLogin(username, password);
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginJLabel;
    private javax.swing.JPasswordField LoginPasswordField;
    private javax.swing.JLabel PasswordJLabel;
    private javax.swing.JLabel UserNameJLabel;
    private javax.swing.JTextField UserNameJTextField;
    private javax.swing.JLabel closeLoginFormJLabel1;
    private javax.swing.JLabel companyNameJLabel;
    private javax.swing.JLabel createNewAccJLabel;
    private javax.swing.JLabel createNewAccJLabel1;
    private javax.swing.JLabel developersJLabel;
    private javax.swing.JPanel loginFormLeftJPanel;
    private javax.swing.JPanel loginFormRightJPanel;
    private javax.swing.JLabel loginImgJLabel;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel minimizeLoginFormJLabel;
    private javax.swing.JLabel technocratsAddressJLabel;
    private javax.swing.JLabel technocratsEmailJLabel;
    private javax.swing.JLabel technocratsNumJLabel;
    // End of variables declaration//GEN-END:variables
    
    private void userLogin(String username, String password){
        Connection dbconn= myConnection.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st= (PreparedStatement)
                    dbconn.prepareStatement("Select * from users WHERE username = ? AND password = ?");
            
            
            
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res= st.executeQuery();
            if(res.next()){
                //Display homepage/dashboard after logging in.
                dispose();
                Dashboard d= new Dashboard();
                d.setTitle("Dashboard");
                d.setVisible(true);
            }
            else{
                System.out.println("username " + username);
                System.out.println("password " + password);
                JOptionPane.showMessageDialog(this, "Username/Password not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The connection is not available");
        }
    }
}
