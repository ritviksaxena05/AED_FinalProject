/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Cop;

import Model.EcoModel;
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
public class CopWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CopWorkAreaJPanel
     */
    JPanel userProcessContainer;
    User account;
    EcoModel ecoModel;
    public CopWorkAreaJPanel(JPanel userProcessContainer, User account, EcoModel business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoModel = business;
        this.account = account;
        loadPatientTable();
        loadPatientTable1();
        
    }
        private void loadPatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoModel.getCop().getPoliceRecordsList()) {

            Object[] row = new Object[8];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();           
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge();
            row[4] = patient.getpAddress();
            row[5] = patient.getpEmailAddress();
            row[6] = patient.getpPoliceStatus();
            row[7] = patient;
            if(patient.getpPoliceStatus().equals("Verifying")){
            model.addRow(row);}

        }
    }
        
        private void loadPatientTable1() {
        DefaultTableModel model = (DefaultTableModel) PatientTable1.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoModel.getCop().getPoliceRecordsList()) {

            Object[] row = new Object[8];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge();
            row[4] = patient.getpAddress();
            row[5] = patient.getpEmailAddress();
            row[6] = patient.getpPoliceStatus();
            row[7] = patient;
            if(!patient.getpPoliceStatus().equals("Verifying")){
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        PatientTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERSON INFORMATION");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        setBackground(new java.awt.Color(128, 206, 206));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "HealthId", "Age", "Address", "Email", "Police Verification", "obj"
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
        jScrollPane3.setViewportView(PatientTable);
        if (PatientTable.getColumnModel().getColumnCount() > 0) {
            PatientTable.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 1180, 140));

        PatientTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PatientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "HealthId", "Age", "Address", "Email", "Police Verification", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(PatientTable1);
        if (PatientTable1.getColumnModel().getColumnCount() > 0) {
            PatientTable1.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1190, 191));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(9, 145, 143));
        jButton1.setText("View Details of Verification");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 316, 37));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(9, 145, 143));
        jButton2.setText("View Details of Previous Records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 310, 39));

        jPanel3.setBackground(new java.awt.Color(9, 145, 143));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/policeman.png"))); // NOI18N
        jLabel2.setText("POLICE DEPARTMENT");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1272, -1));

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VERIFICATION REQUEST");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 334, 21));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PREVIOUS RECORDS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 313, 21));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = PatientTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            Patient d = (Patient) PatientTable.getValueAt(selectedRow, 7);
            CopPersonalInfoJPanel bill = new CopPersonalInfoJPanel(userProcessContainer,ecoModel, d,account);
            userProcessContainer.add("Police Person Info", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = PatientTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            Patient d = (Patient) PatientTable1.getValueAt(selectedRow, 7);
            //d.get
            CopPastInfoJPanel bill = new CopPastInfoJPanel(userProcessContainer,ecoModel, d,account);
            userProcessContainer.add("Past Info", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTable;
    private javax.swing.JTable PatientTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
