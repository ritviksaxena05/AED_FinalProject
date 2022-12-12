/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Patient;

import Model.EcoModel;
import Model.Patient.Patient;
import Model.Patient.PatientBills;
import Model.User.User;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikaboddu
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoModel ecoSystem;
    User userAccount;

    public PatientWorkAreaJPanel(JPanel userProcessContainer, User account, EcoModel business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = business;
        this.userAccount = account;
        populatePatientInfo();
        populateBillTable();
    }
    private void populatePatientInfo() {
        for (Patient patient : ecoSystem.getPatDirectory().getPatientList()) {
            if (userAccount.getUserName().equals(patient.getpUserName())) {
                txtFirstName.setText(patient.getpFirstName());
                txtLastName.setText(patient.getpLastName());
                txtAge.setText(Integer.toString(patient.getpAge()));
                txtGender.setText(patient.getpGender());
                txtAddress.setText(patient.getpAddress());
                txtPhoneNumber.setText(patient.getpPhoneNo());
                txtEmail.setText(patient.getpEmailAddress());
                txtDateOfBirth.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
                txtDateOfAdmit.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getpDateOfAdmit()));
                txtInjuryType.setText(patient.getpInjuryType());
                txtBloodGroup.setText(patient.getpBloodType());
                txtPatientStatus.setText(patient.getpStatus());

//                ImageIcon ii = new ImageIcon(patient.getpImageUrl());
//                Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
//                lblPhotoImage.setIcon(new ImageIcon(image));
            }

        }

    }
    private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTalble.getModel();

        model.setRowCount(0);
        for (Patient patient : ecoSystem.getPatDirectory().getPatientList()) {
            if (userAccount.getUserName().equals(patient.getpUserName())) {
                for (PatientBills b : patient.getpBills()) {

                    Object[] row = new Object[7];
                    row[0] = b.getName();
                    row[1] = b.getOrgType();
                    row[2] = b.getAmount();
                    model.addRow(row);

                }
            }
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

        jSeparator1 = new javax.swing.JSeparator();
        lblDisplayPatient = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPatientStatus = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPatientAddress = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPatientStatus = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientLastName = new javax.swing.JLabel();
        lblPatientPhone = new javax.swing.JLabel();
        txtInjuryType = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        lblPhoneNumber5 = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        lblPatientFirstName = new javax.swing.JLabel();
        lblPhotoImage = new javax.swing.JLabel();
        lblPatientGender = new javax.swing.JLabel();
        txtDateOfAdmit = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTalble = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 1300, 20));

        lblDisplayPatient.setBackground(new java.awt.Color(0, 153, 204));
        lblDisplayPatient.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblDisplayPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPatient.setText("WELCOME");
        add(lblDisplayPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 1394, 73));

        txtFirstName.setEditable(false);
        txtFirstName.setBackground(new java.awt.Color(204, 204, 204));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 150, -1));

        lblPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setText("Patient Status");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setBackground(new java.awt.Color(204, 204, 204));
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, -1));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(204, 204, 204));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 150, -1));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 150, -1));

        txtPatientStatus.setEditable(false);
        txtPatientStatus.setBackground(new java.awt.Color(204, 204, 204));
        txtPatientStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientStatusActionPerformed(evt);
            }
        });
        add(txtPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 150, -1));

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPhoto.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoto.setText("Photo");
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 260, -1, -1));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        txtInjuryType.setEditable(false);
        txtInjuryType.setBackground(new java.awt.Color(204, 204, 204));
        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, 150, -1));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, -1, -1));

        lblPhoneNumber5.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPhoneNumber5.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setText("Date of Admit ");
        add(lblPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, -1, -1));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 150, -1));

        txtBloodGroup.setEditable(false);
        txtBloodGroup.setBackground(new java.awt.Color(204, 204, 204));
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });
        add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 150, -1));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        lblPhotoImage.setBackground(new java.awt.Color(255, 255, 255));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 110, 140, 136));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        txtDateOfAdmit.setEditable(false);
        txtDateOfAdmit.setBackground(new java.awt.Color(204, 204, 204));
        txtDateOfAdmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfAdmitActionPerformed(evt);
            }
        });
        add(txtDateOfAdmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 150, -1));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 150, -1));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        txtGender.setEditable(false);
        txtGender.setBackground(new java.awt.Color(204, 204, 204));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 150, -1));

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 150, -1));

        BillTalble.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BillTalble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BillTalble);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 1260, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/Patient.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 470, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtPatientStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientStatusActionPerformed

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtDateOfAdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfAdmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfAdmitActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTalble;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDisplayPatient;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoneNumber5;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtDateOfAdmit;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtInjuryType;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPatientStatus;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
