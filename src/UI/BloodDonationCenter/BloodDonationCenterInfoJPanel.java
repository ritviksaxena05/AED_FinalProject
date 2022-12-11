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
public class BloodDonationCenterInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodDonationCenterInfoJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoModel ecoModel;
    User userAccount;
    
    public BloodDonationCenterInfoJPanel(JPanel userProcessContainer, User account, EcoModel ecoModel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoModel = ecoModel;
        this.userAccount = account;
        Nametxt.setEnabled(true);
        Addrtxt.setEnabled(true);
        PhNumtxt.setEnabled(true);
        Emailtxt.setEnabled(true);
    }
    
    public void setTextFields() {

        Nametxt.setText(ecoModel.getBloodDonationCenter().getBloodDonationCenterName());
        Addrtxt.setText(ecoModel.getBloodDonationCenter().getBloodDonationCenterAddress());
        PhNumtxt.setText(ecoModel.getBloodDonationCenter().getBloodDonationCenterPhone());
        Emailtxt.setText(ecoModel.getBloodDonationCenter().getBloodDonationCenterEmailAddress());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nametxt = new javax.swing.JTextField();
        Addrlbl = new javax.swing.JLabel();
        Addrtxt = new javax.swing.JTextField();
        PhNumlbl = new javax.swing.JLabel();
        PhNumtxt = new javax.swing.JTextField();
        Emaillbl = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Namelbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(128, 206, 206));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nametxt.setText("HUSKY BLOOD BANK");
        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametxtActionPerformed(evt);
            }
        });
        add(Nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 144, 30));

        Addrlbl.setBackground(new java.awt.Color(0, 0, 0));
        Addrlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Addrlbl.setForeground(new java.awt.Color(255, 255, 255));
        Addrlbl.setText("Address");
        add(Addrlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, 30));

        Addrtxt.setText("North Eastern University");
        Addrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddrtxtActionPerformed(evt);
            }
        });
        add(Addrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 144, 30));

        PhNumlbl.setBackground(new java.awt.Color(0, 0, 0));
        PhNumlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        PhNumlbl.setForeground(new java.awt.Color(255, 255, 255));
        PhNumlbl.setText("Phone Number");
        add(PhNumlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 30));

        PhNumtxt.setText("8579087561");
        PhNumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhNumtxtActionPerformed(evt);
            }
        });
        add(PhNumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 144, 30));

        Emaillbl.setBackground(new java.awt.Color(0, 0, 0));
        Emaillbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Emaillbl.setForeground(new java.awt.Color(255, 255, 255));
        Emaillbl.setText("Email");
        add(Emaillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 80, 30));

        Emailtxt.setText("neu.bloodBank@gmail.com");
        Emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtxtActionPerformed(evt);
            }
        });
        add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 170, 30));

        jPanel2.setBackground(new java.awt.Color(9, 145, 143));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/blood-test.png"))); // NOI18N
        jLabel1.setText("BLOOD BANK INFORMATION");
        jLabel1.setToolTipText("");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(9, 145, 143));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1294, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 240, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 200, -1, -1));

        Namelbl.setBackground(new java.awt.Color(0, 0, 0));
        Namelbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Namelbl.setForeground(new java.awt.Color(255, 255, 255));
        Namelbl.setText("Name");
        add(Namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/blood-bank (1).png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void NametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametxtActionPerformed

    private void AddrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddrtxtActionPerformed

    private void PhNumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhNumtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhNumtxtActionPerformed

    private void EmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailtxtActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        BloodDonationCenterWorkAreaJPanel bloodDonationCenterWorkAreaJPanel = new BloodDonationCenterWorkAreaJPanel(userProcessContainer, userAccount, ecoModel);
        userProcessContainer.add("Display Treated Patient", bloodDonationCenterWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addrlbl;
    private javax.swing.JTextField Addrtxt;
    private javax.swing.JLabel Emaillbl;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JLabel PhNumlbl;
    private javax.swing.JTextField PhNumtxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
