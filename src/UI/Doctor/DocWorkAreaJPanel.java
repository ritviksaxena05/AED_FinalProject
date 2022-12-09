/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Model.EcoModel;
import Model.Patient.Patient;
import Model.Doctor.Doctor;
import Model.User.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import UI.DocAdmin.DoctorAdminAreaJPanel;

/**
 *
 * @author ramya
 */
public class DocWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorArea
     */
    private final JPanel userArea;
    private final EcoModel ecoModel;
    User userAccount;

    public DocWorkAreaJPanel(JPanel userProcessArea, User account, EcoModel ecoModel) {
        initComponents();
        this.userArea = userProcessArea;
        this.ecoModel = ecoModel;
        this.userAccount = account;
        populateCurrentPatientTable();
        populateOldPatientTable();
//        TODO: UNCOMMENT
//        populatePatientTable();
//        populatePatientTable1();
    }
    
    private void populateCurrentPatientTable() {
        try{
        DefaultTableModel model = (DefaultTableModel) tablePatientDetail.getModel();
        model.setRowCount(0);
        for (Doctor doctor : ecoModel.getDoctorDirectory().getDoctorList()) {
            if (doctor.getdocUserName().equals(userAccount.getUsername())) {
                for (Patient patient : doctor.getTreatedPatients()) 
                {
                    Object[] row = new Object[8];
                    row[0] = patient.getpFirstName();
                    row[1] = patient.getpLastName();
                    row[2] = patient.getpInjuryType();
                    row[3] = patient.getpBloodType();
                    row[4] = patient.getpAge();
                    row[5] = patient.getpGender();
                    row[6] = patient.getpStatus();
                    row[7] = patient;
                    if(!patient.getpStatus().equals("Discharged")){
                    model.addRow(row);}
                }
            }
        }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("error message ---"+e.getMessage());
            System.out.println("no patients yet");
        }
    }
    private void populateOldPatientTable() {
        try{
        DefaultTableModel model = (DefaultTableModel) tablePreviousPatientDetail.getModel();

        model.setRowCount(0);

        for (Doctor doctor : ecoModel.getDoctorDirectory().getDoctorList()) {
            if (doctor.getdocUserName().equals(userAccount.getUsername())) {
                for (Patient patient : doctor.getTreatedPatients()) 
                {
                    Object[] row = new Object[8];
                    row[0] = patient.getpFirstName();
                    row[1] = patient.getpLastName();
                    row[2] = patient.getpInjuryType();
                    row[3] = patient.getpBloodType();
                    row[4] = patient.getpAge();
                    row[5] = patient.getpGender();
                    row[6] = patient.getpStatus();
                    row[7] = patient;
                    if(patient.getpStatus().equals("Discharged")){
                    model.addRow(row);}
                }
            }
        }
        }
        catch(Exception e){
            System.out.println("no patients yet");
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
        lblDocArea = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatientDetail = new javax.swing.JTable();
        btnVisitPatient = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePreviousPatientDetail = new javax.swing.JTable();
        lblPreviousPatient = new javax.swing.JLabel();
        lblPatientAssigned = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDocArea.setBackground(new java.awt.Color(0, 0, 102));
        lblDocArea.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblDocArea.setForeground(new java.awt.Color(255, 255, 255));
        lblDocArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocArea.setText("Doctor WorkArea");
        jPanel1.add(lblDocArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 330, -1));

        tablePatientDetail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tablePatientDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Status", "obj"
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
        jScrollPane2.setViewportView(tablePatientDetail);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 740, 191));

        btnVisitPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnVisitPatient.setForeground(new java.awt.Color(0, 0, 102));
        btnVisitPatient.setText("Visit");
        btnVisitPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitPatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisitPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 120, 44));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 1404, 10));

        tablePreviousPatientDetail.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        tablePreviousPatientDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Status", "obj"
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
        jScrollPane3.setViewportView(tablePreviousPatientDetail);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 730, 191));

        lblPreviousPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPreviousPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblPreviousPatient.setText("My Old Patients History");
        jPanel1.add(lblPreviousPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 230, 34));

        lblPatientAssigned.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAssigned.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAssigned.setText("My Current Patients");
        jPanel1.add(lblPatientAssigned, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/doc.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisitPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablePatientDetail.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) tablePatientDetail.getValueAt(selectedRowIndex, 7);
            if(patient.getpStatus().equals("Doctor Visiting")){
                JOptionPane.showMessageDialog(null, "Patient is in visit.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                patient.setpStatus("Doctor Visiting");
                DocTreatPatientJPanel doctorVisit = new DocTreatPatientJPanel(userArea, userAccount, ecoModel, patient);
                userArea.add("Visit Doctor", doctorVisit);
                CardLayout layout = (CardLayout) userArea.getLayout();
                layout.next(userArea);
            }
        }

    }//GEN-LAST:event_btnVisitPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisitPatient;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDocArea;
    private javax.swing.JLabel lblPatientAssigned;
    private javax.swing.JLabel lblPreviousPatient;
    private javax.swing.JTable tablePatientDetail;
    private javax.swing.JTable tablePreviousPatientDetail;
    // End of variables declaration//GEN-END:variables
}