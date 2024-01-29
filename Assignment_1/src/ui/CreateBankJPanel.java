/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.BankAccount;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class CreateBankJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateBankJPanel
     */
    BankAccount bankaccount;
    public CreateBankJPanel(BankAccount bankaccount) {
        initComponents();
        this.bankaccount = bankaccount;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblAccountHolderName = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        lblDebtAmount = new javax.swing.JLabel();
        lblCreditAmount = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountHolderName = new javax.swing.JTextField();
        txtAccountType = new javax.swing.JTextField();
        txtDebtAmount = new javax.swing.JTextField();
        txtCreditAmount = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Bank Account");

        lblAccountHolderName.setText("Account Holder Name:");

        lblAccountType.setText("Account Type:");

        lblDebtAmount.setText("Debt Amount:");

        lblCreditAmount.setText("Credit Amount:");

        lblAccountNumber.setText("Account Number:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(143, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccountType, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAccountHolderName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDebtAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreditAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAccountNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAccountHolderName, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(txtAccountType)
                            .addComponent(txtDebtAmount)
                            .addComponent(txtCreditAmount)
                            .addComponent(txtAccountNumber))
                        .addGap(146, 146, 146)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountHolderName)
                    .addComponent(txtAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountType)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDebtAmount)
                    .addComponent(txtDebtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreditAmount)
                    .addComponent(txtCreditAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        bankaccount.setAccountHolderName(txtAccountHolderName.getText());
        bankaccount.setAccountNumber(txtAccountNumber.getText());
        bankaccount.setAccountType(txtAccountType.getText());
        bankaccount.setCreditAmount(txtCreditAmount.getText());
        bankaccount.setDebtAmount(txtDebtAmount.getText());
        
        JOptionPane.showMessageDialog(this, "Bank Account Information Saved.");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel lblAccountHolderName;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblCreditAmount;
    private javax.swing.JLabel lblDebtAmount;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAccountHolderName;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAccountType;
    private javax.swing.JTextField txtCreditAmount;
    private javax.swing.JTextField txtDebtAmount;
    // End of variables declaration//GEN-END:variables
}