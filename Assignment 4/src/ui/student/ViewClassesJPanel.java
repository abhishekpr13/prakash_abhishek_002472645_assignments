/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.student;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.CourseCatalog.Course;
import model.CourseSchedule.SeatAssignment;
import model.Persona.StudentProfile;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class ViewClassesJPanel extends javax.swing.JPanel {
StudentProfile s;
JPanel workArea;
String selectedSemester;
    /**
     * Creates new form ViewClassesJPanel
     */
    public ViewClassesJPanel(JPanel workArea,StudentProfile s) {
        this.s = s;
        this.workArea = workArea;
        initComponents();
        refreshTable();
    }
    
    
    private void populateComboBox(){
        
        semesterComboBox.removeAllItems();
        for(String semester: s.getTranscript().getCourseloadlist().keySet()){
            semesterComboBox.addItem(semester);
        }
        semesterComboBox.setSelectedItem(selectedSemester);
    }
        public void refreshTable() {
        populateComboBox();
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        
        for(SeatAssignment sa : s.getTranscript().getCourseLoadBySemester(selectedSemester).getSeatAssignments()) {
            Object row[] = new Object[4];
            Course c = sa.getAssociatedCourse();
            
            row[0] = c.getName();
            row[1] = sa.getGrade();
            row[2] = sa.getCourseOffer().getFacultyProfile().getPerson().getPersonId();
            row[3] = sa.getCourseOffer().getRoomNumber();
            
            model.addRow(row);
        }
        averageGPAJLabel.setText("Average GPA For Semester : " + s.getTranscript().getCourseLoadBySemester(selectedSemester).getAverageGPA());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        viewClassJLabel = new javax.swing.JLabel();
        semesterComboBox = new javax.swing.JComboBox<>();
        semesterJLabel = new javax.swing.JLabel();
        averageGPAJLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Class Name", "Grade", "Professor", "Room Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        viewClassJLabel.setText("View Classes");

        semesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboBoxActionPerformed(evt);
            }
        });

        semesterJLabel.setText("Semester");

        averageGPAJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        averageGPAJLabel.setText("Average GPA :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewClassJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(semesterJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(averageGPAJLabel)
                .addGap(61, 476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(averageGPAJLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewClassJLabel)
                            .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semesterJLabel))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void semesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboBoxActionPerformed
     Object o = semesterComboBox.getSelectedItem();
       if(o!=null){
        selectedSemester = semesterComboBox.getSelectedItem().toString();
        refreshTable();
       }
    }//GEN-LAST:event_semesterComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageGPAJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> semesterComboBox;
    private javax.swing.JLabel semesterJLabel;
    private javax.swing.JLabel viewClassJLabel;
    // End of variables declaration//GEN-END:variables
}
