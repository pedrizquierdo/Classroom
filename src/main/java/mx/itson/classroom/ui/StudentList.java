/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.classroom.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.classroom.entities.Student;
import mx.itson.classroom.persistence.StudentDAO;
import mx.itson.classroom.persistence.SubmissionDAO;

/**
 *
 * @author luismorellb
 */
public class StudentList extends javax.swing.JFrame {

    /**
     * Creates new form StudentList
     */
    public StudentList() {
        initComponents();
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
        tblStudents = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnAssignment = new javax.swing.JButton();
        btnSubmission = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Name", "Email", "id colt"
            }
        ));
        jScrollPane1.setViewportView(tblStudents);

        btnAdd.setText("Add student");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("STUDENTS SECTION");

        btnSelect.setText("Select student");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnAssignment.setText("Go to Assignment");
        btnAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignmentActionPerformed(evt);
            }
        });

        btnSubmission.setText("Go to Submission");
        btnSubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmissionActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete student");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit student");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssignment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmission)))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSelect)
                    .addComponent(btnAssignment)
                    .addComponent(btnSubmission))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        loadStudents();
        tblStudents.removeColumn(tblStudents.getColumnModel().getColumn(0));
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        StudentForm form = new StudentForm(this, true);
        form.setVisible(true);
        
        loadStudents();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        
        int selectedRow = tblStudents.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select a student from the table.");
        return;
    }

    // Convertir la fila seleccionada en un índice de modelo
    int modelRow = tblStudents.convertRowIndexToModel(selectedRow);
    DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();

    // Obtener el ID del estudiante seleccionado y su nombre
    int studentId = (int) model.getValueAt(modelRow, 0); // ID del estudiante
    String studentName = (String) model.getValueAt(modelRow, 1); // Nombre del estudiante

    // Obtener las submissions realizadas por este estudiante
    List<Object[]> submissions = SubmissionDAO.getSubmissionsByStudent(studentId);

    // Construir el mensaje con la información de las submissions
    StringBuilder message = new StringBuilder();
    message.append("Student: ").append(studentName).append("\n\n");

    if (submissions.isEmpty()) {
        message.append("No submissions found.");
    } else {
        message.append("Assignments Submitted:\n");
        for (Object[] submission : submissions) {
            message.append("Assignment: ").append(submission[0]) // Título del assignment
                    .append(" | File Name: ").append(submission[1]) // file_name
                    .append("\n");
        }
    }

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(this, message.toString(), "Student Submission Details", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignmentActionPerformed
        AssignmentList assignmentList = new AssignmentList();
        assignmentList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssignmentActionPerformed

    private void btnSubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmissionActionPerformed
        SubmissionList submissionList = new SubmissionList();
        submissionList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmissionActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblStudents.getSelectedRow();
        int idStudent = Integer.parseInt(tblStudents.getModel().getValueAt(selectedRow, 0).toString());
            Student s = new Student();
                s.setId(idStudent);
        
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el registro?", "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
        if (StudentDAO.delete(s)) {
            JOptionPane.showMessageDialog(this, "El registro se eliminó con éxito", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
            loadStudents();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        StudentForm form = new StudentForm(this, true);
                form.setVisible(true);

                    loadStudents();
    }//GEN-LAST:event_btnEditActionPerformed

    private void loadStudents(){
        List<Student> students = StudentDAO.getAll();
        DefaultTableModel modelo = (DefaultTableModel)tblStudents.getModel();
        modelo.setRowCount(0);
        
        for(Student s: students ){
            modelo.addRow(new Object[] {
            s.getId(),
            s.getName(),
            s.getEmail(),
            s.getId_colt()
            });
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAssignment;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSubmission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    // End of variables declaration//GEN-END:variables
}
