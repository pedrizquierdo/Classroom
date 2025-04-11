/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.classroom.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.classroom.entities.Assignment;
import mx.itson.classroom.persistence.AssignmentDAO;
import mx.itson.classroom.persistence.SubmissionDAO;

/**
 *
 * @author luismorellb
 */
public class AssignmentList extends javax.swing.JFrame {

    /**
     * Creates new form AssignmentList
     */
    public AssignmentList() {
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

        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssignments = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnSubmission = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ASSIGNMENTS SECTION");

        btnSelect.setText("Select assignment");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tblAssignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Title", "Description", "Due date"
            }
        ));
        jScrollPane1.setViewportView(tblAssignments);

        btnAdd.setText("Add asignment");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnStudent.setText("Go to Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnSubmission.setText("Go to Submission");
        btnSubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmissionActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete assignment");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit assignment");
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmission))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect)
                    .addComponent(btnAdd)
                    .addComponent(btnStudent)
                    .addComponent(btnSubmission))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        
        int selectedRow = tblAssignments.getSelectedRow();

        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select assignment from table.");
        return;
        }

        int modelRow = tblAssignments.convertRowIndexToModel(selectedRow);
        DefaultTableModel model = (DefaultTableModel) tblAssignments.getModel();

        int assignmentId = (int) model.getValueAt(modelRow, 0);
        String assignmentTitle = (String) model.getValueAt(modelRow, 1);

        // Obtener la cantidad de submissions
        int count = SubmissionDAO.countByAssignment(assignmentId);

        // Obtener los nombres de los estudiantes
        List<String> studentNames = SubmissionDAO.getStudentNamesByAssignment(assignmentId);

        // Construir el mensaje
        StringBuilder message = new StringBuilder();
        message.append("Assignment \"").append(assignmentTitle).append("\" has ").append(count).append(" submission(s).\n\n");
               

        if (studentNames.isEmpty()) {
            message.append("No students have submitted yet.");
            } else {
                message.append("Students who submitted:\n");
                for (String name : studentNames) {
                message.append("- ").append(name).append("\n");
    }
}

// Mostrar el mensaje
JOptionPane.showMessageDialog(this, message.toString(), "Assignment Details", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        AssignmentForm form = new AssignmentForm(this, true);
        form.setVisible(true);
        
        loadAssignments();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        loadAssignments();
        tblAssignments.removeColumn(tblAssignments.getColumnModel().getColumn(0));
        
    }//GEN-LAST:event_formWindowOpened

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        StudentList studentList = new StudentList(); 
        studentList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnSubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmissionActionPerformed
        SubmissionList submissionList = new SubmissionList();
        submissionList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmissionActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int selectedRow = tblAssignments.getSelectedRow();
        int idAssignment = Integer.parseInt(tblAssignments.getModel().getValueAt(selectedRow, 0).toString());
            Assignment a = new Assignment();
                a.setId(idAssignment);
        
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el registro?", "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
        if (AssignmentDAO.delete(a)) {
            JOptionPane.showMessageDialog(this, "El registro se eliminó con éxito", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
            loadAssignments();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        AssignmentForm form = new AssignmentForm(this, true);
                form.setVisible(true);

                    loadAssignments();
    }//GEN-LAST:event_btnEditActionPerformed

    private void loadAssignments(){
        List<Assignment> assignments = AssignmentDAO.getAll();
        DefaultTableModel modelo = (DefaultTableModel)tblAssignments.getModel();
        modelo.setRowCount(0);
        
        for(Assignment a: assignments ){
            modelo.addRow(new Object[] {
            a.getId(),
            a.getTitle(),
            a.getDescription(),
            a.getDue_date()
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
            java.util.logging.Logger.getLogger(AssignmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnSubmission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAssignments;
    // End of variables declaration//GEN-END:variables
}
