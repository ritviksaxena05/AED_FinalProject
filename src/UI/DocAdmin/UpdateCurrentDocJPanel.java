/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DocAdmin;

import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Doctor.Doctor;
import javax.swing.ImageIcon;
import Model.Patient.Patient;
import Model.EcoModel;
import javax.swing.JPanel;
import Model.User.User;
import Model.Roles.DoctorUser;
import java.awt.CardLayout;

/**
 *
 * @author ramya
 */
public class UpdateCurrentDocJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCurrentDocJPanel
     */
    private final JPanel userWorkArea;
    private final EcoModel ecoModel;
    User userAccount;
    Doctor doc;
    
    public UpdateCurrentDocJPanel(JPanel userArea, User user, EcoModel ecoSystemModel, Doctor doctor) {
        initComponents();
        
        this.userWorkArea = userArea;
        this.userAccount = user;
        this.ecoModel = ecoSystemModel;
        this.doc=doctor;
        txtDocFirstName.setText(doc.getdocFirstName());
        txtDocLastName.setText(doc.getdocLastName());
        txtDocUserName.setText(doc.getdocUserName());
        txtDocAddress.setText(doc.getdocAddress());
        txtDocAge.setText(Integer.toHexString(doc.getdocAge()));
        txtDocGender.setText(doc.getdocGender());
        //txtDateOfBirth.setText(d.getDateofBirth());
        txtDocID.setText(doc.getdocWorkID());
        txtDocEmail.setText(doc.getdocEmail());
        txtDocExperience.setText(doc.getdocExperience());
        txtDocContactNo.setText(doc.getdocContactNumber());
        txtDocSpecialist.setText(doc.getdocSpecialization());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        lblUpdateDoctor = new javax.swing.JLabel();
        txtDocFirstName = new javax.swing.JTextField();
        lblDocLastName = new javax.swing.JLabel();
        txtDocLastName = new javax.swing.JTextField();
        lblDocAge = new javax.swing.JLabel();
        txtDocAge = new javax.swing.JTextField();
        lblDocGender = new javax.swing.JLabel();
        txtDocGender = new javax.swing.JTextField();
        lblDocId = new javax.swing.JLabel();
        txtDocID = new javax.swing.JTextField();
        lbldocContactNo = new javax.swing.JLabel();
        txtDocContactNo = new javax.swing.JTextField();
        lblDocEmail = new javax.swing.JLabel();
        txtDocEmail = new javax.swing.JTextField();
        lblDocSpecialist = new javax.swing.JLabel();
        txtDocSpecialist = new javax.swing.JTextField();
        lblDocAddress = new javax.swing.JLabel();
        txtDocAddress = new javax.swing.JTextField();
        lblDocExperience = new javax.swing.JLabel();
        txtDocExperience = new javax.swing.JTextField();
        txtDocUserName = new javax.swing.JTextField();
        lblDocUserName = new javax.swing.JLabel();
        btnDocUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSubmit1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 145, 143));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFirstName.setBackground(new java.awt.Color(0, 0, 0));
        lblFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setText("First Name");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 113, -1));

        lblUpdateDoctor.setBackground(new java.awt.Color(255, 255, 255));
        lblUpdateDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblUpdateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateDoctor.setText("Update Doctor");
        add(lblUpdateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 280, -1));

        txtDocFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocFirstNameActionPerformed(evt);
            }
        });
        add(txtDocFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, 30));

        lblDocLastName.setBackground(new java.awt.Color(0, 0, 0));
        lblDocLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblDocLastName.setText("Last Name");
        add(lblDocLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 101, -1));

        txtDocLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocLastNameActionPerformed(evt);
            }
        });
        add(txtDocLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 190, 30));

        lblDocAge.setBackground(new java.awt.Color(0, 0, 0));
        lblDocAge.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocAge.setForeground(new java.awt.Color(255, 255, 255));
        lblDocAge.setText("Age");
        add(lblDocAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 40, -1));

        txtDocAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocAgeActionPerformed(evt);
            }
        });
        add(txtDocAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 190, 30));

        lblDocGender.setBackground(new java.awt.Color(255, 255, 255));
        lblDocGender.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocGender.setForeground(new java.awt.Color(255, 255, 255));
        lblDocGender.setText("Gender");
        add(lblDocGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, -1));

        txtDocGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocGenderActionPerformed(evt);
            }
        });
        add(txtDocGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 190, 30));

        lblDocId.setBackground(new java.awt.Color(255, 255, 255));
        lblDocId.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocId.setForeground(new java.awt.Color(255, 255, 255));
        lblDocId.setText("Doctor Work ID");
        add(lblDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        txtDocID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIDActionPerformed(evt);
            }
        });
        add(txtDocID, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 185, 33));

        lbldocContactNo.setBackground(new java.awt.Color(255, 255, 255));
        lbldocContactNo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lbldocContactNo.setForeground(new java.awt.Color(255, 255, 255));
        lbldocContactNo.setText("Conatct Number");
        add(lbldocContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 160, 30));

        txtDocContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocContactNoActionPerformed(evt);
            }
        });
        add(txtDocContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 190, 30));

        lblDocEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblDocEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblDocEmail.setText("Email");
        add(lblDocEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        txtDocEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocEmailActionPerformed(evt);
            }
        });
        add(txtDocEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 190, 30));

        lblDocSpecialist.setBackground(new java.awt.Color(255, 255, 255));
        lblDocSpecialist.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocSpecialist.setForeground(new java.awt.Color(255, 255, 255));
        lblDocSpecialist.setText("Specialist");
        add(lblDocSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, 30));

        txtDocSpecialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocSpecialistActionPerformed(evt);
            }
        });
        add(txtDocSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 190, 30));

        lblDocAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblDocAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblDocAddress.setText("Address");
        add(lblDocAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 80, -1));

        txtDocAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocAddressActionPerformed(evt);
            }
        });
        add(txtDocAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 190, 30));

        lblDocExperience.setBackground(new java.awt.Color(255, 255, 255));
        lblDocExperience.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocExperience.setForeground(new java.awt.Color(255, 255, 255));
        lblDocExperience.setText("Experience");
        add(lblDocExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 110, 30));

        txtDocExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocExperienceActionPerformed(evt);
            }
        });
        add(txtDocExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 190, 30));

        txtDocUserName.setEditable(false);
        txtDocUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocUserNameActionPerformed(evt);
            }
        });
        add(txtDocUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 190, 33));

        lblDocUserName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDocUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblDocUserName.setText("Username");
        add(lblDocUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 115, 33));

        btnDocUpdate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnDocUpdate.setForeground(new java.awt.Color(9, 145, 143));
        btnDocUpdate.setText("Update");
        btnDocUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocUpdateActionPerformed(evt);
            }
        });
        add(btnDocUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/steth_45x46.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 50, 50));

        btnSubmit1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit1.setText("Back");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1434, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocLastNameActionPerformed

    private void txtDocAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocAgeActionPerformed

    private void txtDocGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocGenderActionPerformed

    private void txtDocIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIDActionPerformed

    private void txtDocContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocContactNoActionPerformed

    private void txtDocEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocEmailActionPerformed

    private void txtDocSpecialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocSpecialistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocSpecialistActionPerformed

    private void txtDocAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocAddressActionPerformed

    private void txtDocExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocExperienceActionPerformed

    private void txtDocUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocUserNameActionPerformed

    private void btnDocUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocUpdateActionPerformed
        // TODO add your handling code here:
        doc.setdocFirstName(txtDocFirstName.getText());
        doc.setdocLastName(txtDocLastName.getText());
        doc.setdocAge(Integer.parseInt( txtDocAge.getText()));
        doc.setdocGender(txtDocGender.getText());
        doc.setdocWorkID(txtDocID.getText());
        doc.setdocAddress(txtDocAddress.getText());
        doc.setdocContactNumber(txtDocContactNo.getText());
        //doctor.setDateofBirth(txtDateOfBirth.getText());
        doc.setdocEmail(txtDocEmail.getText());
        doc.setdocSpecialization(txtDocSpecialist.getText());
        doc.setdocExperience(txtDocExperience.getText());
        //d.setUserName(txtUsername.getText());
        JOptionPane.showMessageDialog(null, "Update Complete.");

    }//GEN-LAST:event_btnDocUpdateActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        DocAdminAreaJPanel docJPanel = new DocAdminAreaJPanel(userWorkArea,userAccount,ecoModel);
        userWorkArea.add("Doctor Workarea", docJPanel);
        CardLayout layout = (CardLayout) userWorkArea.getLayout();
        layout.next(userWorkArea);
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void txtDocFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocFirstNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocUpdate;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDocAddress;
    private javax.swing.JLabel lblDocAge;
    private javax.swing.JLabel lblDocEmail;
    private javax.swing.JLabel lblDocExperience;
    private javax.swing.JLabel lblDocGender;
    private javax.swing.JLabel lblDocId;
    private javax.swing.JLabel lblDocLastName;
    private javax.swing.JLabel lblDocSpecialist;
    private javax.swing.JLabel lblDocUserName;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblUpdateDoctor;
    private javax.swing.JLabel lbldocContactNo;
    private javax.swing.JTextField txtDocAddress;
    private javax.swing.JTextField txtDocAge;
    private javax.swing.JTextField txtDocContactNo;
    private javax.swing.JTextField txtDocEmail;
    private javax.swing.JTextField txtDocExperience;
    private javax.swing.JTextField txtDocFirstName;
    private javax.swing.JTextField txtDocGender;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtDocLastName;
    private javax.swing.JTextField txtDocSpecialist;
    private javax.swing.JTextField txtDocUserName;
    // End of variables declaration//GEN-END:variables
}
