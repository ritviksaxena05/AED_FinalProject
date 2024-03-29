/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DocAdmin;

import Model.EcoModel;
import Model.Doctor.Doctor;
import Model.User.User;
import javax.swing.JPanel;
import Model.Patient.Patient;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.CardLayout;


/**
 *
 * @author ramya
 */
public class DocAdminAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocAdminAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoModel ecoSystem;
    User userAccount;

    public DocAdminAreaJPanel(JPanel userProcessContainer, User account, EcoModel system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        populateNetworkTable();
        populatePatientTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Doctor Doctor : ecoSystem.getDoctorDirectory().getDoctorList()) {

            Object[] row = new Object[9];
            row[0] = Doctor.getdocFirstName();
            row[1] = Doctor.getdocLastName();
            row[2] = Doctor.getdocWorkID();
            row[3] = Doctor.getdocExperience();
            row[4] = Doctor.getdocAge();
            row[5] = Doctor.getdocGender();
            row[6] = Doctor.getdocEmail();
            row[7] = Doctor;
            model.addRow(row);

        }
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPatDirectory().getPatientList()) {

            Object[] row = new Object[8];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpInjuryType();
            row[3] = patient.getpBloodType();
            row[4] = patient.getpAge();
            row[5] = patient.getpGender();
            row[6] = patient.getpEmailAddress();
            row[7] = patient;
            model.addRow(row);

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

        lblManageCustomers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        btnCreateDoctor = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        dBtn4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssignDoctor1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 145, 143));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageCustomers.setBackground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("Assign Patients to Doctors");
        add(lblManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 720, -1));

        DoctorTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Health ID", "Experience", "Age", "Gender", "Email", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);
        if (DoctorTable.getColumnModel().getColumnCount() > 0) {
            DoctorTable.getColumnModel().getColumn(7).setMinWidth(0);
            DoctorTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            DoctorTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 840, 191));

        btnCreateDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnCreateDoctor.setForeground(new java.awt.Color(9, 145, 143));
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });
        add(btnCreateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 180, 40));

        upBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        upBtn.setForeground(new java.awt.Color(9, 145, 143));
        upBtn.setText("Update");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 180, 40));

        dBtn4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        dBtn4.setForeground(new java.awt.Color(9, 145, 143));
        dBtn4.setText("Delete");
        dBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtn4ActionPerformed(evt);
            }
        });
        add(dBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 180, 40));

        PatientTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Email", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PatientTable);
        if (PatientTable.getColumnModel().getColumnCount() > 0) {
            PatientTable.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 830, 193));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, 40));

        btnAssignDoctor1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAssignDoctor1.setForeground(new java.awt.Color(9, 145, 143));
        btnAssignDoctor1.setText("Assign Doctor");
        btnAssignDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDoctor1ActionPerformed(evt);
            }
        });
        add(btnAssignDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 180, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctors");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/pat_40x40.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/Doc.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 50, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1434, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateNewDocJPanel createDoctor = new CreateNewDocJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Add Doctor", createDoctor);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = DoctorTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Doctor d = (Doctor) DoctorTable.getValueAt(selectedRow, 7);
            UpdateCurrentDocJPanel updateDoc = new UpdateCurrentDocJPanel(userProcessContainer, userAccount, ecoSystem, d);
            userProcessContainer.add("Update Doctor", updateDoc);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_upBtnActionPerformed

    private void dBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtn4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = DoctorTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Doctor: " + DoctorTable.getValueAt(selectedRow, 0) + " ??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Doctor p = (Doctor) DoctorTable.getValueAt(selectedRow, 7);

                ecoSystem.getDoctorDirectory().deleteDoctor(p);
                populateNetworkTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient");
        }
    }//GEN-LAST:event_dBtn4ActionPerformed

    private void btnAssignDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDoctor1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PatientTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) PatientTable.getValueAt(selectedRowIndex, 7);
            AssignDocToPatientJPanel displayPatientInfoJPanel = new AssignDocToPatientJPanel(userProcessContainer, userAccount, ecoSystem, patient);
            userProcessContainer.add("Display Patient", displayPatientInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAssignDoctor1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton btnAssignDoctor1;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton dBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblManageCustomers;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
