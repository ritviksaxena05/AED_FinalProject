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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(128, 206, 206));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientFNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientFNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientFNamelbl.setForeground(new java.awt.Color(255, 255, 255));
        PatientFNamelbl.setText("First Name:");
        add(PatientFNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 116, -1));

        FNametxt.setEditable(false);
        FNametxt.setBackground(new java.awt.Color(255, 255, 255));
        FNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNametxtActionPerformed(evt);
            }
        });
        add(FNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 180, 31));

        PatientLNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientLNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientLNamelbl.setForeground(new java.awt.Color(255, 255, 255));
        PatientLNamelbl.setText("Last Name:");
        add(PatientLNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 116, -1));

        LNametxt.setEditable(false);
        LNametxt.setBackground(new java.awt.Color(255, 255, 255));
        LNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNametxtActionPerformed(evt);
            }
        });
        add(LNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 180, 31));

        PatientAddrlbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientAddrlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientAddrlbl.setForeground(new java.awt.Color(255, 255, 255));
        PatientAddrlbl.setText("Address: ");
        add(PatientAddrlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        Addrtxt.setEditable(false);
        Addrtxt.setBackground(new java.awt.Color(255, 255, 255));
        Addrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddrtxtActionPerformed(evt);
            }
        });
        add(Addrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 180, 31));

        HealthInsIDtxt.setEditable(false);
        HealthInsIDtxt.setBackground(new java.awt.Color(255, 255, 255));
        HealthInsIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInsIDtxtActionPerformed(evt);
            }
        });
        add(HealthInsIDtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 180, 31));

        PatientHealthInsIDlbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientHealthInsIDlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientHealthInsIDlbl.setForeground(new java.awt.Color(255, 255, 255));
        PatientHealthInsIDlbl.setText("Insurance ID:");
        add(PatientHealthInsIDlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 128, -1));

        Agelbl.setBackground(new java.awt.Color(255, 255, 255));
        Agelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Agelbl.setForeground(new java.awt.Color(255, 255, 255));
        Agelbl.setText("DOB:");
        add(Agelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 90, -1));

        Agetxt.setEditable(false);
        Agetxt.setBackground(new java.awt.Color(255, 255, 255));
        Agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgetxtActionPerformed(evt);
            }
        });
        add(Agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 180, 31));

        Genderlbl.setBackground(new java.awt.Color(255, 255, 255));
        Genderlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Genderlbl.setForeground(new java.awt.Color(255, 255, 255));
        Genderlbl.setText("Gender:");
        add(Genderlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 98, -1));

        Gendertxt.setEditable(false);
        Gendertxt.setBackground(new java.awt.Color(255, 255, 255));
        Gendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GendertxtActionPerformed(evt);
            }
        });
        add(Gendertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 180, 31));

        Locationlbl.setBackground(new java.awt.Color(255, 255, 255));
        Locationlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Locationlbl.setForeground(new java.awt.Color(255, 255, 255));
        Locationlbl.setText("Accident Location:");
        add(Locationlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 167, 18));

        PhNumlbl.setBackground(new java.awt.Color(255, 255, 255));
        PhNumlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhNumlbl.setForeground(new java.awt.Color(255, 255, 255));
        PhNumlbl.setText("Phone Number:");
        add(PhNumlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 150, -1));

        PhNumtxt.setEditable(false);
        PhNumtxt.setBackground(new java.awt.Color(255, 255, 255));
        add(PhNumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 180, 31));

        Locationtxt.setEditable(false);
        Locationtxt.setBackground(new java.awt.Color(255, 255, 255));
        Locationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationtxtActionPerformed(evt);
            }
        });
        add(Locationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 180, 31));

        PoliceVerlbl.setBackground(new java.awt.Color(255, 255, 255));
        PoliceVerlbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PoliceVerlbl.setForeground(new java.awt.Color(255, 255, 255));
        PoliceVerlbl.setText("Police Verification:");
        add(PoliceVerlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 240, -1));

        PoliceVertxt.setEditable(false);
        PoliceVertxt.setBackground(new java.awt.Color(255, 255, 255));
        add(PoliceVertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 180, 31));

        jPanel2.setBackground(new java.awt.Color(9, 145, 143));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/man.png"))); // NOI18N
        jLabel1.setText("PERSON INFORMATION");
        jLabel1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(9, 145, 143));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/medical-record.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));
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

    private void FNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNametxtActionPerformed

    private void GendertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GendertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GendertxtActionPerformed


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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
