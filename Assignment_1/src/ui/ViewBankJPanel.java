/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.BankAccount;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class ViewBankJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBankJPanel
     */
    BankAccount bankaccount;
    public ViewBankJPanel(BankAccount bankaccount) {
        initComponents();
        this.bankaccount = bankaccount;
        displayBankAccount();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreditAmount = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        lblAccountNumber = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtAccountHolderName = new javax.swing.JTextField();
        lblAccountHolderName = new javax.swing.JLabel();
        txtAccountType = new javax.swing.JTextField();
        lblAccountType = new javax.swing.JLabel();
        txtDebtAmount = new javax.swing.JTextField();
        lblDebtAmount = new javax.swing.JLabel();
        txtCreditAmount = new javax.swing.JTextField();

        lblCreditAmount.setText("Credit Amount:");

        lblAccountNumber.setText("Account Number:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Bank Account");

        lblAccountHolderName.setText("Account Holder Name:");

        lblAccountType.setText("Account Type:");

        lblDebtAmount.setText("Debt Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblAccountHolderName)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDebtAmount)
                                .addGap(18, 18, 18)
                                .addComponent(txtDebtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAccountType)
                                .addGap(18, 18, 18)
                                .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(lblAccountNumber)
                            .addGap(18, 18, 18)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(lblCreditAmount)
                            .addGap(18, 18, 18)
                            .addComponent(txtCreditAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountHolderName)
                    .addComponent(txtAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDebtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDebtAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCreditAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreditAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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

    private void displayBankAccount() {
        
        txtAccountHolderName.setText(bankaccount.getAccountHolderName());
        txtAccountType.setText(bankaccount.getAccountType());
        txtDebtAmount.setText(bankaccount.getDebtAmount());
        txtCreditAmount.setText(bankaccount.getCreditAmount());
        txtAccountNumber.setText(bankaccount.getAccountNumber());
    }
}
