/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;


import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class ListPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListPersonJPanel
     */
    private JPanel workAreaJPanel;
    private PersonDirectory personDirectory;
    
    public ListPersonJPanel(PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First_Name", "Last_Name", "Work_City", "Work_Zip_Code", "Home_City", "Home_Zip_Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblPerson.getModel();
        dtm.setRowCount(0);
        
        Object[] row1 = new Object[]{"Abhisek", "Prakash", "Jamican Plain", "845427", "Delhi", "845424"};
        dtm.addRow(row1);
        
        Object[] row2 = new Object[]{"Sanjitha", "Chitti", "Richardason", "896789", "Hyderabad", "625413"};
        dtm.addRow(row2);
        
        Object[] row3 = new Object[]{"Aditya", "Prakash", "Deharadun", "546787", "Jaipur", "456783"};
        dtm.addRow(row3);
        
        Object[] row4 = new Object[]{"Punam", "Sharma", "Motihari", "878783", "Dhaka", "838485"};
        dtm.addRow(row4);
        
        Object[] row5 = new Object[]{"Kamlesh", "Kumar", "Motihari", "878783", "Dhaka", "838485"};
        dtm.addRow(row5);
        Object[] row6 = new Object[]{"Rahul", "Raj", "Banglore", "062503", "Motihari", "838485"};
        dtm.addRow(row6);
        for(Person person: personDirectory.getPersonList()){
            Object[] row = new Object[6];
            row[0] = person;
            row[1] = person.getLastName();
            row[2] = person.getWorkCity();
            row[3] = person.getWorkZipCode();
            row[4] = person.getHomeCity();
            row[5] = person.getHomeZipCode();
            
            dtm.addRow(row);
            
        }
    }
}

