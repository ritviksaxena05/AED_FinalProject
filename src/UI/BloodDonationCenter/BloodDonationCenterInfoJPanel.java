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

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 227));

        Nametxt.setText("HUSKY BLOOD BANK");
        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametxtActionPerformed(evt);
            }
        });

        Addrlbl.setBackground(new java.awt.Color(0, 0, 0));
        Addrlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addrlbl.setForeground(new java.awt.Color(255, 102, 102));
        Addrlbl.setText("Address");

        Addrtxt.setText("North Eastern University");
        Addrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddrtxtActionPerformed(evt);
            }
        });

        PhNumlbl.setBackground(new java.awt.Color(0, 0, 0));
        PhNumlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhNumlbl.setForeground(new java.awt.Color(255, 102, 102));
        PhNumlbl.setText("Phone Number");

        PhNumtxt.setText("8579087561");
        PhNumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhNumtxtActionPerformed(evt);
            }
        });

        Emaillbl.setBackground(new java.awt.Color(0, 0, 0));
        Emaillbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emaillbl.setForeground(new java.awt.Color(255, 102, 102));
        Emaillbl.setText("Email");

        Emailtxt.setText("neu.bloodBank@gmail.com");
        Emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtxtActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BLOOD BANK INFORMATION");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BloodDonationCenter/blood-bank.png"))); // NOI18N

        Namelbl.setBackground(new java.awt.Color(0, 0, 0));
        Namelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Namelbl.setForeground(new java.awt.Color(255, 102, 102));
        Namelbl.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Namelbl)
                                .addGap(150, 150, 150)
                                .addComponent(Addrlbl)
                                .addGap(99, 99, 99)
                                .addComponent(PhNumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(Addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(PhNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(Emaillbl)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhNumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addrlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}