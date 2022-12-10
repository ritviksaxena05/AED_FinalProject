/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Cop;

import Model.EcoModel;
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ritvik
 */
public class CopPastInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CopPastInfo
     */
    
    JPanel userProcessContainer;
    Patient patient;
    EcoModel ecoModel;
    User account;
    
    public CopPastInfoJPanel(JPanel userProcessContainer, EcoModel ecoModel, Patient p,User account) {
        initComponents();
        this.ecoModel = ecoModel;
        this.userProcessContainer = userProcessContainer;
        this.patient = p;
        this.account = account;
        FNametxt.setText(p.getpFirstName());
        LNametxt.setText(p.getpLastName());
        Addrtxt.setText(p.getpAddress());
        try{
        SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
        Agetxt.setText((input.format(p.getPdob())));
        }
        catch(Exception e){}
        Gendertxt.setText(p.getpGender());
        HealthInsIDtxt.setText(p.getpHealthInsuranceID());
        PhNumtxt.setText(p.getpPhoneNo());
        Locationtxt.setText(p.getpAccidentLocation());
        PoliceVertxt.setText(p.getpPoliceStatus());
        
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PatientFNamelbl = new javax.swing.JLabel();
        FNametxt = new javax.swing.JTextField();
        PatientLNamelbl = new javax.swing.JLabel();
        LNametxt = new javax.swing.JTextField();
        PatientAddrlbl = new javax.swing.JLabel();
        Addrtxt = new javax.swing.JTextField();
        HealthInsIDtxt = new javax.swing.JTextField();
        PatientHealthInsIDlbl = new javax.swing.JLabel();
        Agelbl = new javax.swing.JLabel();
        Agetxt = new javax.swing.JTextField();
        Genderlbl = new javax.swing.JLabel();
        Gendertxt = new javax.swing.JTextField();
        Locationlbl = new javax.swing.JLabel();
        PhNumlbl = new javax.swing.JLabel();
        PhNumtxt = new javax.swing.JTextField();
        Locationtxt = new javax.swing.JTextField();
        PoliceVerlbl = new javax.swing.JLabel();
        PoliceVertxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PERSON INFORMATION");

        PatientFNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientFNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientFNamelbl.setText("First Name");

        FNametxt.setEditable(false);

        PatientLNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientLNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientLNamelbl.setText("Last Name");

        LNametxt.setEditable(false);
        LNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNametxtActionPerformed(evt);
            }
        });

        PatientAddrlbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientAddrlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientAddrlbl.setText("Address");

        Addrtxt.setEditable(false);
        Addrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddrtxtActionPerformed(evt);
            }
        });

        HealthInsIDtxt.setEditable(false);
        HealthInsIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInsIDtxtActionPerformed(evt);
            }
        });

        PatientHealthInsIDlbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientHealthInsIDlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientHealthInsIDlbl.setText("InsuranceID");

        Agelbl.setBackground(new java.awt.Color(255, 255, 255));
        Agelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Agelbl.setText("DOB");

        Agetxt.setEditable(false);
        Agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgetxtActionPerformed(evt);
            }
        });

        Genderlbl.setBackground(new java.awt.Color(255, 255, 255));
        Genderlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Genderlbl.setText("Gender");

        Gendertxt.setEditable(false);

        Locationlbl.setBackground(new java.awt.Color(255, 255, 255));
        Locationlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Locationlbl.setText("Accident Location");

        PhNumlbl.setBackground(new java.awt.Color(255, 255, 255));
        PhNumlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhNumlbl.setText("Phone Number");

        PhNumtxt.setEditable(false);

        Locationtxt.setEditable(false);
        Locationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationtxtActionPerformed(evt);
            }
        });

        PoliceVerlbl.setBackground(new java.awt.Color(255, 255, 255));
        PoliceVerlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceVerlbl.setText("Police Verification");

        PoliceVertxt.setEditable(false);

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PatientHealthInsIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HealthInsIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(PatientLNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(PatientAddrlbl)
                            .addGap(71, 71, 71)
                            .addComponent(Addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PatientFNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(FNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Genderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PhNumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(PhNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Locationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(327, 327, 327))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PoliceVerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(PoliceVertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PatientFNamelbl))
                            .addComponent(FNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PatientLNamelbl))
                            .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Agelbl))
                            .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Genderlbl))
                            .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PatientAddrlbl))
                            .addComponent(Addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PatientHealthInsIDlbl))
                            .addComponent(HealthInsIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PhNumlbl))
                            .addComponent(PhNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Locationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(PoliceVerlbl))
                    .addComponent(PoliceVertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNametxtActionPerformed

    private void AddrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddrtxtActionPerformed

    private void HealthInsIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthInsIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HealthInsIDtxtActionPerformed

    private void AgetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgetxtActionPerformed

    private void LocationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationtxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        CopWorkAreaJPanel bill = new CopWorkAreaJPanel(userProcessContainer,account,ecoModel);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addrtxt;
    private javax.swing.JLabel Agelbl;
    private javax.swing.JTextField Agetxt;
    private javax.swing.JTextField FNametxt;
    private javax.swing.JLabel Genderlbl;
    private javax.swing.JTextField Gendertxt;
    private javax.swing.JTextField HealthInsIDtxt;
    private javax.swing.JTextField LNametxt;
    private javax.swing.JLabel Locationlbl;
    private javax.swing.JTextField Locationtxt;
    private javax.swing.JLabel PatientAddrlbl;
    private javax.swing.JLabel PatientFNamelbl;
    private javax.swing.JLabel PatientHealthInsIDlbl;
    private javax.swing.JLabel PatientLNamelbl;
    private javax.swing.JLabel PhNumlbl;
    private javax.swing.JTextField PhNumtxt;
    private javax.swing.JLabel PoliceVerlbl;
    private javax.swing.JTextField PoliceVertxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
