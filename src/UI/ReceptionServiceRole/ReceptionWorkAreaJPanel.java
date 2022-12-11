/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ReceptionServiceRole;

import Model.EcoModel;
import javax.swing.JPanel;
import Model.Patient.Patient;
import Model.User.User;
import UI.Ambulance.AmbulanceWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikaboddu
 */
public class ReceptionWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionWorkAreaJPanel
     */
    
    private final JPanel userProcessContainer;

    private final EcoModel ecoSystem;
    User userAccount;

    public ReceptionWorkAreaJPanel(JPanel userProcessContainer, User account, EcoModel system) {

        initComponents();
        System.out.println("inside Reception work area");
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        System.out.println("existing patients in the portal ---");
        for (Patient patient : ecoSystem.getPatDirectory().getPatientList()) {
            System.out.println("patient---"+patient.getpFirstName());
        }
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        for (Patient patient : ecoSystem.getPatDirectory().getPatientList()) {
            Object[] row = new Object[11];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge(); 
            row[4] = patient.getpEmailAddress();
            row[5] = patient.getpStatus();
            row[6] = patient;
            if(!patient.getpStatus().equals("Discharged")){
            model.addRow(row);}
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

        jPanel1 = new javax.swing.JPanel();
        createPatBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        billPatBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        updateAmbulRecBtn = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createPatBtn.setBackground(new java.awt.Color(0, 153, 204));
        createPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        createPatBtn.setForeground(new java.awt.Color(255, 255, 255));
        createPatBtn.setText("Create New Patient");
        createPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 260, 42));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 160, 80));

        patientTable.setBackground(new java.awt.Color(0, 153, 204));
        patientTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        patientTable.setForeground(new java.awt.Color(255, 255, 255));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Insurance Id", "Age", "Email Id", "Status", "Ob"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(6).setMinWidth(0);
            patientTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            patientTable.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 920, 640));

        billPatBtn.setBackground(new java.awt.Color(0, 153, 204));
        billPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        billPatBtn.setForeground(new java.awt.Color(255, 255, 255));
        billPatBtn.setText("Bill the Patient");
        billPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billPatBtnActionPerformed(evt);
            }
        });
        jPanel1.add(billPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 260, 42));

        delBtn.setBackground(new java.awt.Color(0, 153, 204));
        delBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBtn.setText("Delete Patient");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        jPanel1.add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 260, 42));

        updateAmbulRecBtn.setBackground(new java.awt.Color(0, 153, 204));
        updateAmbulRecBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        updateAmbulRecBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateAmbulRecBtn.setText("Ambulance Record");
        updateAmbulRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAmbulRecBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateAmbulRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 260, 42));

        btnUpdate1.setBackground(new java.awt.Color(0, 153, 204));
        btnUpdate1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Update Patient");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, 260, 42));

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Discharged Patients");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 710, 260, 42));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current Patients List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Perform an action");

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Discharge a Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(352, 352, 352)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 280, 810));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1257, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatBtnActionPerformed
        // TODO add your handling code here:
        try{
            CreatePatientJPanel createPatient = new CreatePatientJPanel(userProcessContainer, ecoSystem, userAccount);
            userProcessContainer.add("Add Patient", createPatient);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }catch(Exception e){
            System.out.println("exception due to---"+e.getMessage());
        }

    }//GEN-LAST:event_createPatBtnActionPerformed

    private void billPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billPatBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {

            Patient patient = (Patient) patientTable.getValueAt(selectedRow, 6);
            PatientBillJPanel patientBillJPanel = new PatientBillJPanel(userProcessContainer, patient,userAccount,ecoSystem);
            userProcessContainer.add("Patient Bill", patientBillJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            populateNetworkTable();

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_billPatBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete User: " + "??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Patient p = (Patient) patientTable.getValueAt(selectedRow, 6);
                //System.out.print(p.getGender());
                ecoSystem.getUserAccountDirectory().deleteUser(p.getpUserName());
                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                ecoSystem.getPatDirectory().deletePatient(p);
                populateNetworkTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void updateAmbulRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAmbulRecBtnActionPerformed
        // TODO add your handling code here:
        try{
            System.out.println("ambulance record button clicked");
            AmbulanceWorkAreaJPanel ambulanceWAJPanel = new AmbulanceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            //AmbulanceWorkAreaJPanel ambulanceWorkAreaJPanel = new AmbulanceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("AmbulanceWorkArea", ambulanceWAJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("exception due to---"+e.getMessage());
        }

    }//GEN-LAST:event_updateAmbulRecBtnActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {

            Patient patient = (Patient) patientTable.getValueAt(selectedRow, 6);
            UpdatePatientDetailsJPanel ambulanceWorkAreaJPanel = new UpdatePatientDetailsJPanel(userProcessContainer, ecoSystem, userAccount, patient);
            userProcessContainer.add("Discharge", ambulanceWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DisplayPatientPastRecordsJPanel pastRecords = new DisplayPatientPastRecordsJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Past Records", pastRecords);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PatientDischargeJPanel receptionDischarge = new PatientDischargeJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Discharge", receptionDischarge);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billPatBtn;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton createPatBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton updateAmbulRecBtn;
    // End of variables declaration//GEN-END:variables
}
