/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Laboratory;

import Model.EcoModel;
import Model.Laboratory.LaboratoryTests;
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikaboddu
 */
public class LaboratoryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LaboratoryWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoModel ecosystem;
    private User userAccount;
    private LaboratoryTests t;
    
    public LaboratoryWorkAreaJPanel(JPanel userProcessContainer, User account, EcoModel business) {
        
        initComponents();
        System.out.println("with in LabWorkAreaJPanel");
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.userAccount = account;
        populatePatientTable1();
        populatePatientTable();
    }

    
        private void populatePatientTable1() {
        DefaultTableModel model = (DefaultTableModel) managePatientTable1.getModel();
        model.setRowCount(0);
        for (Patient patient : this.ecosystem.getLaboratory().getLaboratoryRecordsList()) {
            Object[] row = new Object[7];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge();
            row[4] = patient.getpEmailAddress();
            row[5] = patient.getpLabStatus();
            row[6] = patient;
            if(!patient.getpLabStatus().equals("Delivered")){
            model.addRow(row);}

        }
    }
    private void populatePatientTable() {
            DefaultTableModel model = (DefaultTableModel) managePatientTable2.getModel();
            model.setRowCount(0);
            for (Patient patient : this.ecosystem.getLaboratory().getLaboratoryRecordsList()) {
                Object[] row = new Object[7];
                row[0] = patient.getpFirstName();
                row[1] = patient.getpLastName();
                row[2] = patient.getpHealthInsuranceID();
                row[3] = patient.getpAge();
                row[4] = patient.getpEmailAddress();
                row[5] = patient.getpLabStatus();
                row[6] = patient;
                if(patient.getpLabStatus().equals("Delivered")){
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        managePatientTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        managePatientTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 145, 143));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laboratory Center");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 350, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 1295, 10));

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(9, 145, 143));
        jButton1.setText("Available Tests Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 50));

        managePatientTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        managePatientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "HealthId", "Age", "Email", "LabStatus", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(managePatientTable1);
        if (managePatientTable1.getColumnModel().getColumnCount() > 0) {
            managePatientTable1.getColumnModel().getColumn(6).setMinWidth(0);
            managePatientTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
            managePatientTable1.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 800, 170));

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(9, 145, 143));
        jButton2.setText("View Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 185, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Past Requests");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 163, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current Requests");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 185, 25));

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(9, 145, 143));
        jButton3.setText("View Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 170, 53));

        managePatientTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        managePatientTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "HealthId", "Age", "Email", "LabStatus", "Obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane6.setViewportView(managePatientTable2);
        if (managePatientTable2.getColumnModel().getColumnCount() > 0) {
            managePatientTable2.getColumnModel().getColumn(6).setMinWidth(0);
            managePatientTable2.getColumnModel().getColumn(6).setPreferredWidth(0);
            managePatientTable2.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 800, 137));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/lab_40x40 (1).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LaboratoryCRUDtestsJPanel doctorRequestLabTestJPanel = new LaboratoryCRUDtestsJPanel(userProcessContainer, userAccount,ecosystem);
        userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = managePatientTable1.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) managePatientTable1.getValueAt(selectedRowIndex, 6);
            LaboratoryRequestedTestsJPanel doctorRequestLabTestJPanel = new LaboratoryRequestedTestsJPanel(userProcessContainer, userAccount,patient,ecosystem);
            userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = managePatientTable2.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) managePatientTable2.getValueAt(selectedRowIndex, 6);
            LaboratoryRequestedTestsJPanel doctorRequestLabTestJPanel = new LaboratoryRequestedTestsJPanel(userProcessContainer, userAccount,patient,ecosystem);
            userProcessContainer.add("Past Lab Tests", doctorRequestLabTestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable managePatientTable1;
    private javax.swing.JTable managePatientTable2;
    // End of variables declaration//GEN-END:variables
}
