package UI.Cop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
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
public class CopPersonalInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CopPersonalInfo
     */
    
    JPanel userProcessContainer;
    Patient patient;
    EcoModel ecoModel;
    User account;
    
    public CopPersonalInfoJPanel(JPanel userProcessContainer, EcoModel ecoModel, Patient p,User account) {
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
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 227));

        PatientFNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientFNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientFNamelbl.setForeground(new java.awt.Color(255, 102, 102));
        PatientFNamelbl.setText("First Name");

        FNametxt.setEditable(false);
        FNametxt.setBackground(new java.awt.Color(255, 255, 255));

        PatientLNamelbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientLNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientLNamelbl.setForeground(new java.awt.Color(255, 102, 102));
        PatientLNamelbl.setText("Last Name");

        LNametxt.setEditable(false);
        LNametxt.setBackground(new java.awt.Color(255, 255, 255));
        LNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNametxtActionPerformed(evt);
            }
        });

        PatientAddrlbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientAddrlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientAddrlbl.setForeground(new java.awt.Color(255, 102, 102));
        PatientAddrlbl.setText("Address");

        Addrtxt.setEditable(false);
        Addrtxt.setBackground(new java.awt.Color(255, 255, 255));
        Addrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddrtxtActionPerformed(evt);
            }
        });

        HealthInsIDtxt.setEditable(false);
        HealthInsIDtxt.setBackground(new java.awt.Color(255, 255, 255));
        HealthInsIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInsIDtxtActionPerformed(evt);
            }
        });

        PatientHealthInsIDlbl.setBackground(new java.awt.Color(255, 255, 255));
        PatientHealthInsIDlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientHealthInsIDlbl.setForeground(new java.awt.Color(255, 102, 102));
        PatientHealthInsIDlbl.setText("InsuranceID");

        Agelbl.setBackground(new java.awt.Color(255, 255, 255));
        Agelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Agelbl.setForeground(new java.awt.Color(255, 102, 102));
        Agelbl.setText("DOB");

        Agetxt.setEditable(false);
        Agetxt.setBackground(new java.awt.Color(255, 255, 255));
        Agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgetxtActionPerformed(evt);
            }
        });

        Genderlbl.setBackground(new java.awt.Color(255, 255, 255));
        Genderlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Genderlbl.setForeground(new java.awt.Color(255, 102, 102));
        Genderlbl.setText("Gender");

        Gendertxt.setEditable(false);
        Gendertxt.setBackground(new java.awt.Color(255, 255, 255));

        Locationlbl.setBackground(new java.awt.Color(255, 255, 255));
        Locationlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Locationlbl.setForeground(new java.awt.Color(255, 102, 102));
        Locationlbl.setText("Accident Location");

        PhNumlbl.setBackground(new java.awt.Color(255, 255, 255));
        PhNumlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhNumlbl.setForeground(new java.awt.Color(255, 102, 102));
        PhNumlbl.setText("Phone Number");

        PhNumtxt.setEditable(false);
        PhNumtxt.setBackground(new java.awt.Color(255, 255, 255));

        Locationtxt.setEditable(false);
        Locationtxt.setBackground(new java.awt.Color(255, 255, 255));
        Locationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationtxtActionPerformed(evt);
            }
        });

        PoliceVerlbl.setBackground(new java.awt.Color(255, 255, 255));
        PoliceVerlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceVerlbl.setForeground(new java.awt.Color(255, 102, 102));
        PoliceVerlbl.setText("Police Verification");

        PoliceVertxt.setEditable(false);
        PoliceVertxt.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Cop/personal-information.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(50, 206, 45));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Approve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 75, 76));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Agelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(Genderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(445, 445, 445)
                                .addComponent(Addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HealthInsIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientHealthInsIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(PatientFNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(PatientLNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(PatientAddrlbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(242, 242, 242)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Locationtxt)
                                    .addComponent(Locationlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PhNumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(PoliceVerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PoliceVertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientHealthInsIDlbl)
                    .addComponent(PatientFNamelbl)
                    .addComponent(PatientLNamelbl)
                    .addComponent(PatientAddrlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthInsIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agelbl)
                    .addComponent(Genderlbl)
                    .addComponent(PhNumlbl)
                    .addComponent(Locationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PoliceVertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PoliceVerlbl))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LocationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationtxtActionPerformed

    private void AgetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgetxtActionPerformed

    private void HealthInsIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthInsIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HealthInsIDtxtActionPerformed

    private void AddrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddrtxtActionPerformed

    private void LNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNametxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        patient.setpPoliceStatus("Verified");
        CopWorkAreaJPanel bill = new CopWorkAreaJPanel(userProcessContainer,account,ecoModel);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        patient.setpPoliceStatus("Rejected");
        CopWorkAreaJPanel bill = new CopWorkAreaJPanel(userProcessContainer,account,ecoModel);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}