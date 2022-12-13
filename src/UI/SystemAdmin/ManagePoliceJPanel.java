/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

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
public class ManagePoliceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePoliceJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoModel ecoSystem;
    User userAccount;
    
    public ManagePoliceJPanel(JPanel userProcessContainer, EcoModel system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
       // populateNetworkTable();
        
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
        btnSubmit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSubmit1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 145, 143));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageCustomers.setBackground(new java.awt.Color(119, 197, 147));
        lblManageCustomers.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManageCustomers.setText("                      Manage Police");
        add(lblManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 700, 70));

        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit.setText("BACK");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, 40));

        lblPassword.setBackground(new java.awt.Color(0, 0, 0));
        lblPassword.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, 30));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 172, 40));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 172, 37));

        lblUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Username");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 30));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, 30));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 172, 38));

        btnSubmit1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        SystemAdminWorkAreaJPanel patientBillJPanel = new SystemAdminWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        Patient patient = new Patient();
        String name = txtName.getText();
        String uname = txtUserName.getText();
        String password = txtPassword.getText();
        if(name.equals("") || uname.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saved Details Successfully!");

        }

        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnSubmit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel lblManageCustomers;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
