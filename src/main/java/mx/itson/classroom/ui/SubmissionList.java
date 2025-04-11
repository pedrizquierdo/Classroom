/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.classroom.ui;

import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import mx.itson.classroom.entities.Assignment;
import mx.itson.classroom.entities.Submission;
import mx.itson.classroom.persistence.SubmissionDAO;

/**
 *
 * @author luismorellb
 */
public class SubmissionList extends javax.swing.JFrame {

    /**
     * Creates new form SubmissionList
     */
    public SubmissionList() {
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
        tblSubmissions = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnAssignment = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblSubmissions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Date", "File name", "Student", "Assignment"
            }
        ));
        jScrollPane1.setViewportView(tblSubmissions);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("SUBMISSION SECTION");

        btnSelect.setText("Check delivery");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnAdd.setText("Add submission");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAssignment.setText("Go to Assignment");
        btnAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignmentActionPerformed(evt);
            }
        });

        btnStudent.setText("Go to Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete submission");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit submission");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssignment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStudent))
                            .addComponent(jLabel1))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(btnAssignment)
                    .addComponent(btnStudent))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        
        int selectedRow = tblSubmissions.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select a submission from the table.");
        return;
    }

    // Convertir la fila seleccionada en un índice de modelo
    int modelRow = tblSubmissions.convertRowIndexToModel(selectedRow);
    DefaultTableModel model = (DefaultTableModel) tblSubmissions.getModel();

    // Obtener los datos de la fila seleccionada
    int submissionId = (int) model.getValueAt(modelRow, 0); // ID de la submission
    Date submissionDate = (Date) model.getValueAt(modelRow, 1); // Fecha de la submission
    String assignmentTitle = (String) model.getValueAt(modelRow, 4); // Título del assignment

    // Obtener el assignment relacionado con esta submission
    Assignment assignment = SubmissionDAO.getAssignmentBySubmission(submissionId); // Asegúrate de que este método esté disponible

    // Obtener la fecha límite del assignment
    Date dueDate = assignment.getDue_date();

    // Verificar si la submission fue entregada a tiempo
    boolean isOnTime = !submissionDate.after(dueDate);

    // Crear el mensaje a mostrar
    String message = (isOnTime) ? "The submission for \"" + assignmentTitle + "\" was delivered on time."
                                : "The submission for \"" + assignmentTitle + "\" was delivered late.";

    // Mostrar el mensaje en un JOptionPane con el icono de reloj
    JOptionPane.showMessageDialog(this, message, "Submission Status", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        SubmissionForm form = new SubmissionForm(this, true);
        form.setVisible(true);
        
        loadSubmissions();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        loadSubmissions();
        tblSubmissions.removeColumn(tblSubmissions.getColumnModel().getColumn(0));
    }//GEN-LAST:event_formWindowOpened

    private void btnAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignmentActionPerformed
        AssignmentList assignmentList = new AssignmentList();
        assignmentList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssignmentActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        StudentList studentList = new StudentList(); 
        studentList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        int selectedRow = tblSubmissions.getSelectedRow();
        int idSubmission = Integer.parseInt(tblSubmissions.getModel().getValueAt(selectedRow, 0).toString());
            Submission s = new Submission();
                s.setId(idSubmission);
        
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el registro?", "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
        if (SubmissionDAO.delete(s)) {
            JOptionPane.showMessageDialog(this, "El registro se eliminó con éxito", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
            loadSubmissions();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void loadSubmissions(){
        List<Submission> submissions = SubmissionDAO.getAll();
        DefaultTableModel modelo = (DefaultTableModel)tblSubmissions.getModel();
        modelo.setRowCount(0);
        
        for(Submission s: submissions ){
            modelo.addRow(new Object[] {
            s.getId(),
            s.getDate(),
            s.getFile_name(),
            s.getStudent().getName(),
            s.getAssignment().getTitle()
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
            java.util.logging.Logger.getLogger(SubmissionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmissionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmissionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmissionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmissionList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAssignment;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSubmissions;
    // End of variables declaration//GEN-END:variables
}
