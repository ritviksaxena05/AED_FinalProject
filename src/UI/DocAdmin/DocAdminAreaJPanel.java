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
    User userAccount;
    private final JPanel userWorkArea;
    private final EcoModel ecoModel;
    
    public DocAdminAreaJPanel(JPanel userArea, User accountUser, EcoModel ecoSystemModel) {
        initComponents();

        populateTableAllDoctor();
        populateTableAllPatient();
        this.userAccount = accountUser;
        this.userWorkArea = userArea;
        this.ecoModel = ecoSystemModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAssignDocToPatient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllDoctors = new javax.swing.JTable();
        btnCreateNewDoctor = new javax.swing.JButton();
        btnUpdateDoctor = new javax.swing.JButton();
        btnDeleteDoctor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAllPatients = new javax.swing.JTable();
        lblAllPatients = new javax.swing.JLabel();
        btnAssignDocToPatient = new javax.swing.JButton();
        lblAllDoctors = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1227, 722));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAssignDocToPatient.setBackground(new java.awt.Color(255, 255, 255));
        lblAssignDocToPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblAssignDocToPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblAssignDocToPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAssignDocToPatient.setText("Assign Patients to Doctors");
        jPanel1.add(lblAssignDocToPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 720, -1));

        tableAllDoctors.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tableAllDoctors.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableAllDoctors);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 850, 191));

        btnCreateNewDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnCreateNewDoctor.setForeground(new java.awt.Color(0, 153, 204));
        btnCreateNewDoctor.setText("Create Doctor");
        btnCreateNewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateNewDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, 210, 50));

        btnUpdateDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnUpdateDoctor.setForeground(new java.awt.Color(0, 153, 204));
        btnUpdateDoctor.setText("Update");
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, 210, 40));

        btnDeleteDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnDeleteDoctor.setForeground(new java.awt.Color(0, 153, 204));
        btnDeleteDoctor.setText("Delete");
        btnDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 210, 40));

        tableAllPatients.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        tableAllPatients.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableAllPatients);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 850, 193));

        lblAllPatients.setBackground(new java.awt.Color(0, 153, 204));
        lblAllPatients.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblAllPatients.setForeground(new java.awt.Color(255, 255, 255));
        lblAllPatients.setText("Patients");
        jPanel1.add(lblAllPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, 40));

        btnAssignDocToPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAssignDocToPatient.setForeground(new java.awt.Color(0, 153, 204));
        btnAssignDocToPatient.setText("Assign Doctor");
        btnAssignDocToPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDocToPatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssignDocToPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, 220, 50));

        lblAllDoctors.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblAllDoctors.setForeground(new java.awt.Color(255, 255, 255));
        lblAllDoctors.setText("Doctors");
        jPanel1.add(lblAllDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, 40));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 50, 40));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2641, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTableAllPatient() {
        DefaultTableModel model = (DefaultTableModel) tableAllPatients.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoModel.getPatDirectory().getPatientList()) {

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
    
    private void populateTableAllDoctor() {
        DefaultTableModel model = (DefaultTableModel) tableAllDoctors.getModel();

        model.setRowCount(0);

        for (Doctor Doctor : ecoModel.getDoctorDirectory().getDoctorList()) {

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
    
    private void btnCreateNewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewDoctorActionPerformed
        // TODO add your handling code here:
        CreateNewDocJPanel createDoctor = new CreateNewDocJPanel(userWorkArea, userAccount, ecoModel);
        userWorkArea.add("Add Doctor", createDoctor);
        CardLayout layout = (CardLayout) userWorkArea.getLayout();
        layout.next(userWorkArea);
    }//GEN-LAST:event_btnCreateNewDoctorActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableAllDoctors.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Doctor d = (Doctor) tableAllDoctors.getValueAt(selectedRow, 7);
            UpdateCurrentDocJPanel updateDoc = new UpdateCurrentDocJPanel(userWorkArea, userAccount, ecoModel, d);
            userWorkArea.add("Update Doctor", updateDoc);
            CardLayout layout = (CardLayout) userWorkArea.getLayout();
            layout.next(userWorkArea);
        }
    }//GEN-LAST:event_btnUpdateDoctorActionPerformed

    private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoctorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableAllDoctors.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Doctor: " + tableAllDoctors.getValueAt(selectedRow, 7) + " ??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Doctor p = (Doctor) tableAllDoctors.getValueAt(selectedRow, 7);

                ecoModel.getDoctorDirectory().deleteDoctor(p);
                populateTableAllDoctor();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient");
        }
    }//GEN-LAST:event_btnDeleteDoctorActionPerformed

    private void btnAssignDocToPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDocToPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tableAllPatients.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) tableAllPatients.getValueAt(selectedRowIndex, 7);
            AssignDocToPatientJPanel displayPatientInfoJPanel = new AssignDocToPatientJPanel(userWorkArea, userAccount, ecoModel, patient);
            userWorkArea.add("Display Patient", displayPatientInfoJPanel);
            CardLayout layout = (CardLayout) userWorkArea.getLayout();
            layout.next(userWorkArea);
        }
    }//GEN-LAST:event_btnAssignDocToPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDocToPatient;
    private javax.swing.JButton btnCreateNewDoctor;
    private javax.swing.JButton btnDeleteDoctor;
    private javax.swing.JButton btnUpdateDoctor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAllDoctors;
    private javax.swing.JLabel lblAllPatients;
    private javax.swing.JLabel lblAssignDocToPatient;
    private javax.swing.JTable tableAllDoctors;
    private javax.swing.JTable tableAllPatients;
    // End of variables declaration//GEN-END:variables
}
