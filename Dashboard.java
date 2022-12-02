package project3.orderman.invoice.login;

/**
 *
 * @author Rohena Black
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null); // Center form in screen
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabelOrder = new javax.swing.JLabel();
        jLabel_Inven = new javax.swing.JLabel();
        jLabelCustomer = new javax.swing.JLabel();
        jPanel_logOut = new javax.swing.JPanel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_CloseWindow = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabelbusName = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(209, 209, 209));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(255, 195, 0));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrder.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelOrder.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOrder.setText("Order");
        jLabelOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOrderMouseClicked(evt);
            }
        });
        sidePanel.add(jLabelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 150, -1));

        jLabel_Inven.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel_Inven.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Inven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Inven.setText("Inventory");
        jLabel_Inven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Inven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_InvenMouseClicked(evt);
            }
        });
        sidePanel.add(jLabel_Inven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, -1));

        jLabelCustomer.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCustomer.setText("Customer");
        jLabelCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCustomerMouseClicked(evt);
            }
        });
        sidePanel.add(jLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, -1));

        jPanel_logOut.setBackground(new java.awt.Color(132, 103, 11));
        jPanel_logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setText("Log Out");
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_logOutLayout = new javax.swing.GroupLayout(jPanel_logOut);
        jPanel_logOut.setLayout(jPanel_logOutLayout);
        jPanel_logOutLayout.setHorizontalGroup(
            jPanel_logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel_logOutLayout.setVerticalGroup(
            jPanel_logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_logOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogOut)
                .addContainerGap())
        );

        sidePanel.add(jPanel_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project3/orderman/invoice/login/profileIcon.png"))); // NOI18N
        sidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 80));

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 600));

        jPanel_Header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_CloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_CloseWindow.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_CloseWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseWindow.setText("X");
        jLabel_CloseWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseWindowMouseClicked(evt);
            }
        });

        jLabelMinimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(686, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CloseWindow)
                    .addComponent(jLabelMinimize))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        mainPanel.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 760, 40));

        centerPanel.setBackground(new java.awt.Color(209, 209, 209));
        centerPanel.setLayout(new java.awt.CardLayout());

        p1.setBackground(new java.awt.Color(209, 209, 209));

        jLabelbusName.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabelbusName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbusName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelbusName.setText("CLOTHED UNDER GRACE ORDER MANAGEMENT SYSTEM");

        jLabelWelcome.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcome.setText("WELCOME TO");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project3/orderman/invoice/login/homeIcon.png"))); // NOI18N

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelbusName, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabelWelcome)
                .addGap(18, 18, 18)
                .addComponent(jLabelbusName)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        centerPanel.add(p1, "card2");

        mainPanel.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 760, 560));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jLabel_InvenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_InvenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_InvenMouseClicked

    private void jLabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCustomerMouseClicked

    private void jLabelOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOrderMouseClicked
        // TODO add your handling code here:
        //Open customer JFrame with print invoice button
        customer cf= new customer(); //When clicked, registration form pops up
        cf.setVisible(true); 
        cf.pack();
        cf.setLocationRelativeTo(null); //centers form
        cf.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        this.dispose(); //closes login form when registration form pops up
        
    }//GEN-LAST:event_jLabelOrderMouseClicked

    private void jLabel_CloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseWindowMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseWindowMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(Dashboard.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelOrder;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JLabel jLabel_CloseWindow;
    private javax.swing.JLabel jLabel_Inven;
    private javax.swing.JLabel jLabelbusName;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_logOut;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
