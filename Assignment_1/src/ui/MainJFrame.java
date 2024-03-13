/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.BankAccount;
import model.HomeAddress;
import model.LocalAddress;
import model.Person;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Person person;
    HomeAddress homeaddress;
    LocalAddress localaddress;
    BankAccount bankaccount;
    public MainJFrame() {
        initComponents();
        person = new Person();
        homeaddress = new HomeAddress();
        localaddress = new LocalAddress();
        bankaccount = new BankAccount();
        getContentPane().setBackground(java.awt.Color.lightGray);
        
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
        jButton1 = new javax.swing.JButton();
        splitPane = new javax.swing.JSplitPane();
        workArea = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnCreateHome = new javax.swing.JButton();
        btnViewHome = new javax.swing.JButton();
        btnCreateLocal = new javax.swing.JButton();
        btnViewLocal = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        btnViewAccount = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workArea);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("    Personal Profile ");

        btnCreate.setText("Create Person");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View Person");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCreateHome.setText("Create Home Address");
        btnCreateHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHomeActionPerformed(evt);
            }
        });

        btnViewHome.setText("View Home Address");
        btnViewHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHomeActionPerformed(evt);
            }
        });

        btnCreateLocal.setText("Create Local Address");
        btnCreateLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLocalActionPerformed(evt);
            }
        });

        btnViewLocal.setText("View Local Address");
        btnViewLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLocalActionPerformed(evt);
            }
        });

        btnCreateAccount.setText("Create Bank Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnViewAccount.setText("View Bank Account");
        btnViewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCreateHome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewHome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnCreateAccount, btnCreateHome, btnCreateLocal, btnView, btnViewAccount, btnViewHome, btnViewLocal});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(222, 222, 222))
        );

        splitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPanel = new CreateJPanel(person);
        splitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(person);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCreateHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHomeActionPerformed
        // TODO add your handling code here:
        CreateHomeJPanel createPanel = new CreateHomeJPanel(homeaddress);
        splitPane.setRightComponent(createPanel);
        
        
    }//GEN-LAST:event_btnCreateHomeActionPerformed

    private void btnViewHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHomeActionPerformed
        // TODO add your handling code here:
       ViewHomeJPanel viewPanel = new ViewHomeJPanel(homeaddress);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewHomeActionPerformed

    private void btnCreateLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLocalActionPerformed
        // TODO add your handling code here:
        CreateLocalJPanel createPanel = new CreateLocalJPanel(localaddress);
        splitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreateLocalActionPerformed

    private void btnViewLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLocalActionPerformed
        // TODO add your handling code here:
        ViewLocalJPanel viewPanel = new ViewLocalJPanel(localaddress);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewLocalActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        CreateBankJPanel createPanel = new CreateBankJPanel(bankaccount);
        splitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnViewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccountActionPerformed
        // TODO add your handling code here:
        ViewBankJPanel viewPanel = new ViewBankJPanel(bankaccount);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewAccountActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnCreateHome;
    private javax.swing.JButton btnCreateLocal;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewAccount;
    private javax.swing.JButton btnViewHome;
    private javax.swing.JButton btnViewLocal;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
