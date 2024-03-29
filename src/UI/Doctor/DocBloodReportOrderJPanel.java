/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Model.EcoModel;
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devikaboddu
 */
public class DocBloodReportOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocBloodReportOrderJPanel
     */
    private JPanel userProcessContainer;
    private EcoModel ecosystem;
    private User userAccount;
    private Patient patient;

    public DocBloodReportOrderJPanel(JPanel userProcessContainer, User account, EcoModel ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.patient = patient;
        BloodRequestQuantityBox.addItem("Select Quantity");
        BloodRequestQuantityBox.addItem("1");
        BloodRequestQuantityBox.addItem("2");
        BloodRequestQuantityBox.addItem("3");
        BloodRequestQuantityBox.addItem("4");
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
        BloodRequestQuantityBox = new javax.swing.JComboBox<>();
        lblRequestBloodQuantity = new javax.swing.JLabel();
        btnProcessRequest = new javax.swing.JButton();
        Request1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 145, 143));
        setForeground(new java.awt.Color(9, 145, 143));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request Blood");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 280, -1));

        BloodRequestQuantityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodRequestQuantityBoxActionPerformed(evt);
            }
        });
        add(BloodRequestQuantityBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 162, 180, 40));

        lblRequestBloodQuantity.setBackground(new java.awt.Color(255, 255, 255));
        lblRequestBloodQuantity.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblRequestBloodQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblRequestBloodQuantity.setText("Select Blood Bag Quantity");
        add(lblRequestBloodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 260, 40));

        btnProcessRequest.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnProcessRequest.setForeground(new java.awt.Color(9, 145, 143));
        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });
        add(btnProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 197, 40));

        Request1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        Request1.setForeground(new java.awt.Color(9, 145, 143));
        Request1.setText("BACK");
        Request1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request1ActionPerformed(evt);
            }
        });
        add(Request1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 128, 42));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/blood_test_40x40.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void BloodRequestQuantityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodRequestQuantityBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodRequestQuantityBoxActionPerformed

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:

        if (!((String) BloodRequestQuantityBox.getSelectedItem()).equals("Select Quantity")) {

            patient.setpBloodBankStatus("Requested");
            patient.setpBloodBagQuantity((String) BloodRequestQuantityBox.getSelectedItem());

            JOptionPane.showMessageDialog(null, "Blood Request Sent", "Information Message", JOptionPane.INFORMATION_MESSAGE);
            DocTreatPatientJPanel doctorVisit = new DocTreatPatientJPanel(userProcessContainer, userAccount, ecosystem, patient);
            userProcessContainer.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void Request1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request1ActionPerformed
        // TODO add your handling code here:
        DocTreatPatientJPanel doctorVisit = new DocTreatPatientJPanel(userProcessContainer, userAccount, ecosystem, patient);
        userProcessContainer.add("Visit Doctor", doctorVisit);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Request1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BloodRequestQuantityBox;
    private javax.swing.JButton Request1;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRequestBloodQuantity;
    // End of variables declaration//GEN-END:variables
}
