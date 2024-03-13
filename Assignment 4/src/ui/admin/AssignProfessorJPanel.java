/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.CourseSchedule.CourseOffer;
import model.Persona.Faculty.FacultyDirectory;
import model.Persona.Faculty.FacultyProfile;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class AssignProfessorJPanel extends javax.swing.JPanel {

        JPanel workArea;
        CourseOffer co;
        FacultyDirectory fD;
    /**
     * Creates new form AssignProfessorJPanel
     */
    public AssignProfessorJPanel(JPanel workArea, CourseOffer co, FacultyDirectory fD) {
        
        this.workArea = workArea;
        this.co = co;
        this.fD = fD;
        initComponents();
        txtName.setText(co.getSubjectCourse().getName());
        txtNumber.setText(co.getCourseNumber());
        txtRoom.setText(co.getRoomNumber());
            
        
        populateComboBox();
        
    }
    private void backAction() {
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //workArea.remove(this);
        CourseScheduleJPanel cs = (CourseScheduleJPanel) component;
        cs.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }

    
    private void populateComboBox(){
        for(FacultyProfile f : fD.getTeacherlist()){
           facultyComboBox.addItem(f.getPerson().getPersonId());
       }
        if(co.getFacultyProfile()!=null){
            facultyComboBox.setSelectedItem(co.getFacultyProfile().getPerson().getPersonId());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        txtRoom = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        lblProfessor = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        facultyComboBox = new javax.swing.JComboBox<>();

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Assign Professor");

        lblRoom.setText("Room Number");

        lblName.setText("Name:");

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNumber.setEditable(false);

        lblNumber.setText("Number:");

        lblProfessor.setText("Professor ID:");

        saveButton.setBackground(new java.awt.Color(102, 255, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblNumber)
                            .addComponent(lblProfessor)
                            .addComponent(lblRoom))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRoom)
                                .addComponent(txtNumber)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(44, 44, 44)
                        .addComponent(lblNumber)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProfessor)
                            .addComponent(facultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(lblRoom))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       if(!txtRoom.getText().equals("")){
            co.setRoomNumber(txtRoom.getText());
        }
        if(facultyComboBox.getSelectedIndex()!= 0){
            co.assignAsTeacher(fD.findTeachingFaculty(facultyComboBox.getSelectedItem().toString()));
        }
        JOptionPane.showMessageDialog(this,"Course Offer Updated");
        backAction();
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> facultyComboBox;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblProfessor;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtRoom;
    // End of variables declaration//GEN-END:variables
}