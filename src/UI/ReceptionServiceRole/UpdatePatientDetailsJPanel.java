/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ReceptionServiceRole;

import Model.EcoModel;
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author devikaboddu
 */
public class UpdatePatientDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePatientDetailsJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoModel ecoSystem;
    User userAccount;
    Patient patient;

    public UpdatePatientDetailsJPanel(JPanel userProcessContainer, EcoModel system, User user, Patient patient) {
        initComponents();
        this.userAccount = user;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.patient = patient;

        GenderComboBox.removeAllItems();
        GenderComboBox.addItem("Male");
        GenderComboBox.addItem("Female");
        GenderComboBox.addItem("Other");

        BloodGroupComboBox.removeAllItems();
        BloodGroupComboBox.addItem("A+");
        BloodGroupComboBox.addItem("A-");
        BloodGroupComboBox.addItem("B+");
        BloodGroupComboBox.addItem("B-");
        BloodGroupComboBox.addItem("O+");
        BloodGroupComboBox.addItem("O-");
        BloodGroupComboBox.addItem("AB+");
        BloodGroupComboBox.addItem("AB-");

        txtAddress.setText(patient.getpAddress());
        BloodGroupComboBox.setSelectedItem(patient.getpBloodType());
        txtDOB.setDate(patient.getPdob());
        txtEmail.setText(patient.getpEmailAddress());
        txtFirstName.setText(patient.getpFirstName());
        GenderComboBox.setSelectedItem(patient.getpGender());
        txtHealthInsuranceID.setText(patient.getpHealthInsuranceID());
        txtInjuryType.setText(patient.getpInjuryType());
        txtLastName.setText(patient.getpLastName());
        txtPhoneNumber.setText(patient.getpPhoneNo());
        txtUserName.setText(patient.getpUserName());
        txtAccidentLocation.setText(patient.getpAccidentLocation());
        if (patient.getpInsuranceStatus() != null) {
            if (patient.getpInsuranceStatus().equals("Insurance")) {
                jRadioInsurance.setSelected(true);
                jRadioCash.setSelected(false);
            } else {
                jRadioCash.setSelected(true);
                jRadioInsurance.setSelected(false);
            }
        }
        ImageIcon ii = new ImageIcon(patient.getpImageUrl());
        Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        lblPhotoImage.setIcon(new ImageIcon(image));

        
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
        lblPatientFirstName = new javax.swing.JLabel();
        lblUpdatePatient = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        txtHealthInsuranceID = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtInjuryType = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        lblRestaurantName4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jRadioCash = new javax.swing.JRadioButton();
        jRadioInsurance = new javax.swing.JRadioButton();
        btnBrowse = new javax.swing.JButton();
        lblPhotoImage = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblPaymentMethod = new javax.swing.JLabel();
        GenderComboBox = new javax.swing.JComboBox<>();
        BloodGroupComboBox = new javax.swing.JComboBox<>();
        lblAccidentLocation = new javax.swing.JLabel();
        txtAccidentLocation = new javax.swing.JTextField();
        txtDOB = new com.toedter.calendar.JDateChooser();
        lblErrorLname = new javax.swing.JLabel();
        lblErrorFname = new javax.swing.JLabel();
        lblErrorHId = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorInjury = new javax.swing.JLabel();
        lblErrorUserName = new javax.swing.JLabel();
        lblErrorAccidentLocation = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSubmit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(9, 145, 143));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        jPanel1.add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lblUpdatePatient.setBackground(new java.awt.Color(255, 255, 255));
        lblUpdatePatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        lblUpdatePatient.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdatePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdatePatient.setText("Update Patient Details");
        jPanel1.add(lblUpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 280, 50));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 30));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        jPanel1.add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, 30));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        jPanel1.add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setText("Insurance Id");
        jPanel1.add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        txtHealthInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceIDActionPerformed(evt);
            }
        });
        txtHealthInsuranceID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHealthInsuranceIDKeyReleased(evt);
            }
        });
        jPanel1.add(txtHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 210, 30));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        jPanel1.add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 40));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 210, 30));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Mobile Number");
        jPanel1.add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 30));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 210, 30));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        jPanel1.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email Address");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 200, 30));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        jPanel1.add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        txtInjuryType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInjuryTypeKeyReleased(evt);
            }
        });
        jPanel1.add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 220, 30));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        jPanel1.add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        lblRestaurantName4.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantName4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblRestaurantName4.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantName4.setText("UserName");
        jPanel1.add(lblRestaurantName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        txtUserName.setEditable(false);
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 180, 40));

        btnSubmit.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, 170, 50));

        jRadioCash.setBackground(new java.awt.Color(255, 255, 255));
        jRadioCash.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jRadioCash.setText("Cash ");
        jRadioCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCashActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        jRadioInsurance.setBackground(new java.awt.Color(255, 255, 255));
        jRadioInsurance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jRadioInsurance.setText("Insurance ");
        jRadioInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInsuranceActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        btnBrowse.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(9, 145, 143));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, 40));
        jPanel1.add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 170, 160));

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoto.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoto.setText("Update Photo");
        jPanel1.add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));

        lblPaymentMethod.setBackground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPaymentMethod.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod.setText("Payment ");
        jPanel1.add(lblPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(GenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 200, 30));

        BloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BloodGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(BloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 210, 30));

        lblAccidentLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblAccidentLocation.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAccidentLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblAccidentLocation.setText("Accident Place");
        jPanel1.add(lblAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        txtAccidentLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccidentLocationActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 210, 30));
        jPanel1.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 200, 30));

        lblErrorLname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorLname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 180, 30));

        lblErrorFname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorFname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 180, 30));

        lblErrorHId.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorHId.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorHId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 190, 30));

        lblErrorPhone.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 180, 26));

        lblErrorAddress.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 180, 26));

        lblErrorEmail.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 200, 26));

        lblErrorInjury.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorInjury.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 150, 26));

        lblErrorUserName.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorUserName.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 170, 26));

        lblErrorAccidentLocation.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAccidentLocation.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 190, 26));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 10));

        btnSubmit1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit1.setText("Back");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 50, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtFirstName.getText());
        if (!match.matches()) {
            lblErrorFname.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorFname.setText(null);
        }
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtLastName.getText());
        if (!match.matches()) {
            lblErrorLname.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorLname.setText(null);
        }
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtHealthInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceIDActionPerformed

    private void txtHealthInsuranceIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtHealthInsuranceID.getText());
        if (!match.matches()) {
            lblErrorHId.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorHId.setText(null);
        }
    }//GEN-LAST:event_txtHealthInsuranceIDKeyReleased

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtAddress.getText());
        if (!match.matches()) {
            lblErrorAddress.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9 +()-]{10,18}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPhoneNumber.getText());
        if (!match.matches()) {
            lblErrorPhone.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorPhone.setText(null);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtEmail.getText());
        if (!match.matches()) {
            lblErrorEmail.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorEmail.setText(null);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void txtInjuryTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInjuryTypeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtInjuryType.getText());
        if (!match.matches()) {
            lblErrorInjury.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorInjury.setText(null);
        }
    }//GEN-LAST:event_txtInjuryTypeKeyReleased

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtUserName.getText());
        if (!match.matches()) {
            lblErrorUserName.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorUserName.setText(null);
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if ((lblErrorFname.getText() == null || lblErrorFname.getText().equals(""))
            && (lblErrorLname.getText() == null || lblErrorLname.getText().equals(""))
            && (lblErrorAddress.getText() == null || lblErrorAddress.getText().equals(""))
            && (lblErrorEmail.getText() == null || lblErrorEmail.getText().equals(""))
            && (lblErrorHId.getText() == null || lblErrorHId.getText().equals(""))
            && (lblErrorInjury.getText() == null || lblErrorInjury.getText().equals(""))
            && (lblErrorPhone.getText() == null || lblErrorPhone.getText().equals(""))
            && (lblErrorUserName.getText() == null || lblErrorUserName.getText().equals(""))) {
            patient.setpFirstName(txtFirstName.getText());
            patient.setpLastName(txtLastName.getText());
            patient.setpAge(CalculateAge(txtDOB.getDate(), java.util.Calendar.getInstance().getTime()));
            patient.setpGender((String) GenderComboBox.getSelectedItem());
            patient.setpHealthInsuranceID(txtHealthInsuranceID.getText());
            patient.setpAddress(txtAddress.getText());
            patient.setpPhoneNo(txtPhoneNumber.getText());
            patient.setpEmailAddress(txtEmail.getText());
            patient.setPdob(txtDOB.getDate());
            patient.setpInjuryType(txtInjuryType.getText());
            patient.setpBloodType((String) BloodGroupComboBox.getSelectedItem());
            patient.setpUserName(txtUserName.getText());
            patient.setpAccidentLocation(txtAccidentLocation.getText());
            if (jRadioInsurance.isSelected()) {
                patient.setpInsuranceStatus("Insurance");
            } else {
                patient.setpInsuranceStatus("Cash");
            }
            JOptionPane.showMessageDialog(null, "Update Complete.");

            ReceptionWorkAreaJPanel receptionWorkAreaJPanel = new ReceptionWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("Reception Work Area", receptionWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username is not Unique and Please Fill Correct Details");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    public int CalculateAge(Date birthDate, Date currentDate) {
        // validate inputs ...                                                                               
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2 - d1) / 10000;
        return age;
    }
    private void jRadioCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCashActionPerformed
        // TODO add your handling code here:
        jRadioCash.setSelected(true);
        jRadioInsurance.setSelected(false);
    }//GEN-LAST:event_jRadioCashActionPerformed

    private void jRadioInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInsuranceActionPerformed
        // TODO add your handling code here:
        jRadioCash.setSelected(false);
        jRadioInsurance.setSelected(true);
    }//GEN-LAST:event_jRadioInsuranceActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            patient.setpImageUrl(selectedImagePath);

            ImageIcon ii = new ImageIcon(selectedImagePath);
            //Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lblPhotoImage.getWidth(), lblPhotoImage.getHeight(), Image.SCALE_SMOOTH);
            lblPhotoImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void GenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboBoxActionPerformed

    private void BloodGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupComboBoxActionPerformed

    private void txtAccidentLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccidentLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccidentLocationActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BloodGroupComboBox;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioCash;
    private javax.swing.JRadioButton jRadioInsurance;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAccidentLocation;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorAccidentLocation;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFname;
    private javax.swing.JLabel lblErrorHId;
    private javax.swing.JLabel lblErrorInjury;
    private javax.swing.JLabel lblErrorLname;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblErrorUserName;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPaymentMethod;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JLabel lblRestaurantName4;
    private javax.swing.JLabel lblUpdatePatient;
    private javax.swing.JTextField txtAccidentLocation;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHealthInsuranceID;
    private javax.swing.JTextField txtInjuryType;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
