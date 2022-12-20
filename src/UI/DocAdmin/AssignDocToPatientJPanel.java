/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DocAdmin;


import Model.Doctor.Doctor;
import java.text.SimpleDateFormat;
import Model.EcoModel;
import java.awt.CardLayout;
import java.awt.Image;
import Model.EcoModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import UI.Ambulance.DisplayPatientJPanel;
import Model.User.User;
import javax.swing.table.DefaultTableModel;
import Model.Patient.Patient;
import Model.User.User;
import javax.swing.JPanel;

/**
 *
 * @author ramya
 */
public class AssignDocToPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDocToPatientJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoModel ecoSystem;
    private final Patient patient;
    User userAccount;

    public AssignDocToPatientJPanel(JPanel userProcessContainer, User account, EcoModel system, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        this.patient = patient;
        populateNetworkTable();
        populatePatientInfo();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhoneNumber = new javax.swing.JTextField();
        txtInjuryType = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        lblPhoneNumber5 = new javax.swing.JLabel();
        lblPatientFirstName = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        txtDateOfAdmit = new javax.swing.JTextField();
        txtPatientStatus = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        lblPatientPhone = new javax.swing.JLabel();
        lblDisplayPatient = new javax.swing.JLabel();
        lblAddress4 = new javax.swing.JLabel();
        btnAssignDoctor = new javax.swing.JButton();
        lblPatientStatus = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        lblPhotoImage = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 145, 143));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 190, 30));

        txtInjuryType.setEditable(false);
        txtInjuryType.setBackground(new java.awt.Color(255, 255, 255));
        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 190, 30));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        lblPhoneNumber5.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber5.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setText("Date of Admit ");
        add(lblPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 20));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, 30));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txtFirstName.setEditable(false);
        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 190, 30));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, 20));

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 70));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 190, 30));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        txtBloodGroup.setEditable(false);
        txtBloodGroup.setBackground(new java.awt.Color(255, 255, 255));
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });
        add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 190, 30));

        txtDateOfAdmit.setEditable(false);
        txtDateOfAdmit.setBackground(new java.awt.Color(255, 255, 255));
        txtDateOfAdmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfAdmitActionPerformed(evt);
            }
        });
        add(txtDateOfAdmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 190, 30));

        txtPatientStatus.setEditable(false);
        txtPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientStatusActionPerformed(evt);
            }
        });
        add(txtPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 190, 30));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        lblDisplayPatient.setBackground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblDisplayPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPatient.setText("Patient Details");
        add(lblDisplayPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 280, 70));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, 20));

        btnAssignDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAssignDoctor.setForeground(new java.awt.Color(9, 145, 143));
        btnAssignDoctor.setText("Assign Doctor");
        btnAssignDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDoctorActionPerformed(evt);
            }
        });
        add(btnAssignDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, 48));

        lblPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setText("Patient Status");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, 20));

        txtGender.setEditable(false);
        txtGender.setBackground(new java.awt.Color(255, 255, 255));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 190, 30));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, 20));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 190, 30));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 30));

        DoctorTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Health ID", "Experience", "Age", "Gender", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 870, 170));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 200, 200));

        btnBack.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(9, 145, 143));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available doctors");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 360, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 23, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/steth_45x46.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 50, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1434, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtDateOfAdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfAdmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfAdmitActionPerformed

    private void txtPatientStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientStatusActionPerformed

    private void btnAssignDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDoctorActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = DoctorTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {

            Doctor doctor = (Doctor) DoctorTable.getValueAt(selectedRowIndex, 0);
            System.out.println("doctor details ---"+doctor);
            System.out.println("patient details ---"+this.patient);
            ecoSystem.getDoctorDirectory().addTreatedPatient(doctor, this.patient);

            JOptionPane.showMessageDialog(null, "Doctor Assigned", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnAssignDoctorActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        DocAdminAreaJPanel doctorAdminWorkArea = new DocAdminAreaJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Admin Work Panel", doctorAdminWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Doctor Doctor : ecoSystem.getDoctorDirectory().getDoctorList()) {

            Object[] row = new Object[9];
            row[0] = Doctor;
            row[1] = Doctor.getdocLastName();
            row[2] = Doctor.getdocWorkID();
            row[3] = Doctor.getdocAddress();
            row[4] = Doctor.getdocAge();
            row[5] = Doctor.getdocGender();
            row[6] = Doctor.getdocEmail();

            model.addRow(row);

        }
}

     private void populatePatientInfo() {
        
        txtFirstName.setText(patient.getpFirstName());
        txtLastName.setText(patient.getpLastName());
        txtAge.setText(Integer.toString(patient.getpAge()));
        txtGender.setText(patient.getpGender());
        txtAddress.setText(patient.getpAddress());
        txtPhoneNumber.setText(patient.getpPhoneNo());
        txtEmail.setText(patient.getpEmailAddress());
        if(patient.getPdob()!= null)
        {
            txtDateOfBirth.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
        }
        if(patient.getpDateOfAdmit()!= null)
        {
            txtDateOfAdmit.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
        }
        
        txtInjuryType.setText(patient.getpInjuryType());
        txtBloodGroup.setText(patient.getpBloodType());
        txtPatientStatus.setText(patient.getpStatus());
        
        ImageIcon ii = new ImageIcon(patient.getpImageUrl());
        Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        lblPhotoImage.setIcon(new ImageIcon(image));


    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton btnAssignDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
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
