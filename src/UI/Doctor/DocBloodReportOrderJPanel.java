/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import javax.swing.JOptionPane;
import java.awt.CardLayout;
import Model.User.User;
import Model.EcoModel;
import Model.Patient.Patient;
import Model.User.User;
import javax.swing.JPanel;

/**
 *
 * @author ramya
 */
public class DocBloodReportOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocBloodReportOrderJPanel
     */
    private User userAccount;
    private JPanel userWorkArea;
    private Patient patient;
    private EcoModel ecoModel;
    
    public DocBloodReportOrderJPanel(JPanel userArea, User accountUser, EcoModel ecoSystemModel, Patient patient) {
        initComponents();
        this.userAccount = accountUser;
        this.userWorkArea = userArea;
        this.patient = patient;
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

        lblOrderBloodTest = new javax.swing.JLabel();
        boxBloodRequestQuantity = new javax.swing.JComboBox<>();
        lblSelectBloodQuantity = new javax.swing.JLabel();
        btnRequestBlood = new javax.swing.JButton();
        btnBackBloodReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderBloodTest.setBackground(new java.awt.Color(255, 255, 255));
        lblOrderBloodTest.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblOrderBloodTest.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderBloodTest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrderBloodTest.setText("Request Blood");
        add(lblOrderBloodTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 60));

        boxBloodRequestQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBloodRequestQuantityActionPerformed(evt);
            }
        });
        add(boxBloodRequestQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 180, 40));

        lblSelectBloodQuantity.setBackground(new java.awt.Color(255, 255, 255));
        lblSelectBloodQuantity.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblSelectBloodQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectBloodQuantity.setText("Select Blood Bag Quantity");
        add(lblSelectBloodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 40));

        btnRequestBlood.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRequestBlood.setForeground(new java.awt.Color(0, 0, 102));
        btnRequestBlood.setText("Process Request");
        btnRequestBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestBloodActionPerformed(evt);
            }
        });
        add(btnRequestBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 197, 30));

        btnBackBloodReq.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBackBloodReq.setForeground(new java.awt.Color(0, 0, 102));
        btnBackBloodReq.setText("<< BACK");
        btnBackBloodReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackBloodReqActionPerformed(evt);
            }
        });
        add(btnBackBloodReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 128, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void boxBloodRequestQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBloodRequestQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxBloodRequestQuantityActionPerformed

    private void btnRequestBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestBloodActionPerformed
        // TODO add your handling code here:

        if (!((String) boxBloodRequestQuantity.getSelectedItem()).equals("Select Quantity")) {

            patient.setpBloodBankStatus("Requested");
            patient.setpBloodBagQuantity((String) boxBloodRequestQuantity.getSelectedItem());

            JOptionPane.showMessageDialog(null, "Blood Request Sent", "Information Message", JOptionPane.INFORMATION_MESSAGE);
            DocTreatPatientJPanel doctorVisit = new DocTreatPatientJPanel(userWorkArea, userAccount, ecoModel, patient);
            userWorkArea.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userWorkArea.getLayout();
            layout.next(userWorkArea);
        }
    }//GEN-LAST:event_btnRequestBloodActionPerformed

    private void btnBackBloodReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackBloodReqActionPerformed
        // TODO add your handling code here:
        DocTreatPatientJPanel doctorVisit = new DocTreatPatientJPanel(userWorkArea, userAccount, ecoModel, patient);
        userWorkArea.add("Visit Doctor", doctorVisit);
        CardLayout layout = (CardLayout) userWorkArea.getLayout();
        layout.next(userWorkArea);
    }//GEN-LAST:event_btnBackBloodReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxBloodRequestQuantity;
    private javax.swing.JButton btnBackBloodReq;
    private javax.swing.JButton btnRequestBlood;
    private javax.swing.JLabel lblOrderBloodTest;
    private javax.swing.JLabel lblSelectBloodQuantity;
    // End of variables declaration//GEN-END:variables
}
