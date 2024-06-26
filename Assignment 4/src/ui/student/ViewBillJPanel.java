/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.student;

import javax.swing.table.DefaultTableModel;
import model.CourseCatalog.Course;
import model.CourseSchedule.CourseOffer;
import model.CourseSchedule.SeatAssignment;
import model.Persona.Transcript;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class ViewBillJPanel extends javax.swing.JPanel {
Transcript t;
String selectedSemester;
    /**
     * Creates new form ViewBillJPanel
     */
    public ViewBillJPanel(Transcript t) {
        
        this.t = t;
        initComponents();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblCourses = new javax.swing.JTable();
        semesterJLabel = new javax.swing.JLabel();
        viewBillJLabel = new javax.swing.JLabel();
        semesterComboBox = new javax.swing.JComboBox<>();
        totalPriceSemesterJLabel = new javax.swing.JLabel();

        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Class Name", "Total Credits", "Credit Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblCourses);

        semesterJLabel.setText("Semester");

        viewBillJLabel.setText("View Bill ");

        semesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboBoxActionPerformed(evt);
            }
        });

        totalPriceSemesterJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceSemesterJLabel.setText("Total Price for Semester :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewBillJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semesterJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totalPriceSemesterJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBillJLabel)
                    .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterJLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(totalPriceSemesterJLabel)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void semesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboBoxActionPerformed
      Object o = semesterComboBox.getSelectedItem();
       if(o!=null){
        selectedSemester = semesterComboBox.getSelectedItem().toString();
        refreshTable();
       }
       
    }//GEN-LAST:event_semesterComboBoxActionPerformed
        private void populateComboBox(){
        semesterComboBox.removeAllItems();
        for(String semester: t.getCourseloadlist().keySet()){
            semesterComboBox.addItem(semester);
        }
        semesterComboBox.setSelectedItem(selectedSemester);
    }
        public void refreshTable() {
        populateComboBox();
        DefaultTableModel model = (DefaultTableModel)tblCourses.getModel();
        model.setRowCount(0);
        
        for(SeatAssignment sa : t.getCourseLoadBySemester(selectedSemester).getSeatAssignments()) {
            Object row[] = new Object[4];
            Course c = sa.getAssociatedCourse();
            
            row[0] = c.getName();
            row[1] = c.getCredits();
            row[2] = c.getCreditPrice();
            row[3] = c.getCoursePrice();
            
            model.addRow(row);
        }
        totalPriceSemesterJLabel.setText("Total Price For Semester : " + t.getCourseLoadBySemester(selectedSemester).getSemesterSpend());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JComboBox<String> semesterComboBox;
    private javax.swing.JLabel semesterJLabel;
    private javax.swing.JTable tblCourses;
    private javax.swing.JLabel totalPriceSemesterJLabel;
    private javax.swing.JLabel viewBillJLabel;
    // End of variables declaration//GEN-END:variables
}
