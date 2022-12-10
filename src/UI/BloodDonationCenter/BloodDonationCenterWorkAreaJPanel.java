/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BloodDonationCenter;

import Model.BloodDonationCenter.BloodDonationCenter;
import Model.EcoModel;
import Model.Patient.PatientBills;
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ritvik
 */
public class BloodDonationCenterWorkAreaJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form BloodDonationCenterWorkAreaJPanel
     */
    
    private final JPanel userProcessContainer;
    private final EcoModel ecoModel;
    User user;
    BloodDonationCenter bloodDonationCenter;
    Patient billPatient;
    
    public BloodDonationCenterWorkAreaJPanel(JPanel userProcessContainer, User account, EcoModel ecoModel) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoModel = ecoModel;
        this.user = account;
        this.billPatient = null;
        BloodReqStBox.addItem("Select Status");
        BloodReqStBox.addItem("Blood Delivered");
        BloodReqStBox.addItem("Unavailable");
        populatePatientTable();
    }
    
    private void populatePatientTable() {
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        btnTreatedPatientList = new javax.swing.JButton();
        btnBloodBankInfo = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        BloodReqStBox = new javax.swing.JComboBox<>();
        ProcessReqbtn = new javax.swing.JButton();

        PatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "HealthId", "First", "Last", "Age", "Address", "Email", "Request Status", "Blood Quantity", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PatientTable);

        BillTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(BillTable);

        btnTreatedPatientList.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnTreatedPatientList.setForeground(new java.awt.Color(0, 153, 204));
        btnTreatedPatientList.setText("Show Treated Patient List");
        btnTreatedPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatedPatientListActionPerformed(evt);
            }
        });

        btnBloodBankInfo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnBloodBankInfo.setForeground(new java.awt.Color(0, 153, 204));
        btnBloodBankInfo.setText("Blood Bank Information");
        btnBloodBankInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloodBankInfoActionPerformed(evt);
            }
        });

        lblCommunity.setBackground(new java.awt.Color(255, 255, 255));
        lblCommunity.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunity.setText("Blood Request Status");

        BloodReqStBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodReqStBoxActionPerformed(evt);
            }
        });

        ProcessReqbtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        ProcessReqbtn.setForeground(new java.awt.Color(0, 153, 204));
        ProcessReqbtn.setText("Process Request");
        ProcessReqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessReqbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(BloodReqStBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(ProcessReqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnTreatedPatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBloodBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodReqStBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(ProcessReqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTreatedPatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBloodBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTreatedPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatedPatientListActionPerformed
        // TODO add your handling code here:
        TreatedPatientJPanel treatedPatiPatientTableeatedPatientJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Display Treated Patient", treatedPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTreatedPatientListActionPerformed

    private void btnBloodBankInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloodBankInfoActionPerformed
        // TODO add your handling code here:
        BloodBankInfoJPanel bloodBankInfoJPanel = new BloodBankInfoJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Blood Bank Information", bloodBankInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBloodBankInfoActionPerformed

    private void BloodReqStBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodReqStBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodReqStBoxActionPerformed

    private void ProcessReqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessReqbtnActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = ManagePatientTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Patient patient = (Patient) ManagePatientTable.getValueAt(selectedRowIndex, 9);

            for (Patient p : ecoSystem.getPatientDirectory().getPatientList()) {
                if (patient.getpUserName().equals(p.getpUserName())) {
                    if (!((String) BloodReqStBox.getSelectedItem()).equals("Select Status")) {
                        p.setpBloodBankStatus((String) BloodReqStBox.getSelectedItem());
                        billPatient = p;
                        if (p.getpBloodBankStatus().equals("Blood Delivered")) {
                            for (int bloodBag = 0; bloodBag < Integer.parseInt(billPatient.getpBloodBagQuantity()); bloodBag++) {
                                ecoSystem.getPatientDirectory().AddBill(billPatient, "Blood Charges", "Blood Bank", "");
                                ecoSystem.getBloodBank().AddTreatedPatientList(billPatient);
                            }
                        }
                        break;
                    }
                }
            }

            populatePatientTable();
            populateBillTable();

        }

    }//GEN-LAST:event_ProcessReqbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JComboBox<String> BloodReqStBox;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton ProcessReqbtn;
    private javax.swing.JButton btnBloodBankInfo;
    private javax.swing.JButton btnTreatedPatientList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCommunity;
    // End of variables declaration//GEN-END:variables
}