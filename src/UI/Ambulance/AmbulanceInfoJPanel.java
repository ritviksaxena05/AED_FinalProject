/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ambulance;

import Model.Ambulance.Ambulance;
import Model.EcoModel;
import Model.User.User;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devikaboddu
 */
public class AmbulanceInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceInfoJPanel
     */
    
    private final JPanel userProcessContainer;
    private final EcoModel ecoSystem;
    User userAccount;
    public AmbulanceInfoJPanel(JPanel userProcessContainer, EcoModel system, User account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
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
        lblDriverFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblDriverLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblVehicleNumber = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
        lblDriverAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblErrorLname = new javax.swing.JLabel();
        lblErrorFname = new javax.swing.JLabel();
        lblErrorAge = new javax.swing.JLabel();
        lblErrorVNumber = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDriverFirstName1 = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JTextField();
        lblDriverLastName1 = new javax.swing.JLabel();
        txtLastName1 = new javax.swing.JTextField();
        lblVehicleNumber1 = new javax.swing.JLabel();
        txtVehicleNumber1 = new javax.swing.JTextField();
        lblDriverAge1 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        btnSubmit1 = new javax.swing.JButton();
        lblErrorLname1 = new javax.swing.JLabel();
        lblErrorFname1 = new javax.swing.JLabel();
        lblErrorAge1 = new javax.swing.JLabel();
        lblErrorVNumber1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnSetFree1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(9, 145, 143));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD AMBULANCE AND DRIVER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 1080, 70));

        lblDriverFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDriverFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverFirstName.setText("Enter Driver First Name :");
        jPanel1.add(lblDriverFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

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
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 280, 30));

        lblDriverLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDriverLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverLastName.setText("Enter Driver Last Name :");
        jPanel1.add(lblDriverLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

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
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 280, 30));

        lblVehicleNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblVehicleNumber.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblVehicleNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblVehicleNumber.setText("Ambulance Vehicle Number : ");
        jPanel1.add(lblVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        txtVehicleNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleNumberActionPerformed(evt);
            }
        });
        txtVehicleNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 280, 30));

        lblDriverAge.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverAge.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDriverAge.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverAge.setText("Enter Driver Age :");
        jPanel1.add(lblDriverAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 280, 30));

        btnSubmit.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 133, 43));

        lblErrorLname.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorLname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorLname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 255, 26));

        lblErrorFname.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorFname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorFname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 255, 26));

        lblErrorAge.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorAge.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAge.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 255, 26));

        lblErrorVNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorVNumber.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorVNumber.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorVNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 255, 26));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1434, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/ambulance_gif_40 (1).gif"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(560, 340));
        jLabel3.setMinimumSize(new java.awt.Dimension(560, 340));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 600, 390));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD AMBULANCE AND DRIVER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 1080, 70));

        lblDriverFirstName1.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverFirstName1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDriverFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverFirstName1.setText("Enter Driver First Name :");
        jPanel1.add(lblDriverFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));
        jPanel1.add(txtFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 280, 30));

        lblDriverLastName1.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverLastName1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDriverLastName1.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverLastName1.setText("Enter Driver Last Name :");
        jPanel1.add(lblDriverLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));
        jPanel1.add(txtLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 280, 30));

        lblVehicleNumber1.setBackground(new java.awt.Color(255, 255, 255));
        lblVehicleNumber1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblVehicleNumber1.setForeground(new java.awt.Color(255, 255, 255));
        lblVehicleNumber1.setText("Ambulance Vehicle Number : ");
        jPanel1.add(lblVehicleNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));
        jPanel1.add(txtVehicleNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 280, 30));

        lblDriverAge1.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverAge1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDriverAge1.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverAge1.setText("Enter Driver Age :");
        jPanel1.add(lblDriverAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));
        jPanel1.add(txtAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 280, 30));

        btnSubmit1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(9, 145, 143));
        btnSubmit1.setText("Submit");
        jPanel1.add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 133, 43));

        lblErrorLname1.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorLname1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorLname1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorLname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 255, 26));

        lblErrorFname1.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorFname1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorFname1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorFname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 255, 26));

        lblErrorAge1.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorAge1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAge1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 255, 26));

        lblErrorVNumber1.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorVNumber1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorVNumber1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblErrorVNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 255, 26));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1434, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/ambulance_gif_40 (1).gif"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(560, 340));
        jLabel4.setMinimumSize(new java.awt.Dimension(560, 340));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 600, 390));

        btnSetFree1.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        btnSetFree1.setForeground(new java.awt.Color(9, 145, 143));
        btnSetFree1.setText("Back");
        btnSetFree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetFree1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSetFree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtVehicleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleNumberActionPerformed

    private void txtVehicleNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtVehicleNumber.getText());
        if (!match.matches()) {
            lblErrorVNumber.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorVNumber.setText(null);
        }
    }//GEN-LAST:event_txtVehicleNumberKeyReleased

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{2,3}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtAge.getText());
        if (!match.matches()) {
            lblErrorAge.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handlinglblErrorFnamere:
        if ((lblErrorFname.getText() == null || lblErrorFname.getText().equals(""))
            && (lblErrorLname.getText() == null || lblErrorLname.getText().equals(""))
            && (lblErrorAge.getText() == null || lblErrorAge.getText().equals(""))
            && (lblErrorVNumber.getText() == null || lblErrorVNumber.getText().equals(""))) {
            Ambulance ambulance = new Ambulance();
            ambulance.setDriverFirstName(txtFirstName.getText());
            ambulance.setDriverLastName(txtLastName.getText());
            ambulance.setDriverAge(Integer.parseInt(txtAge.getText()));
            ambulance.setVehicleNo(txtVehicleNumber.getText());
            ambulance.setStatus("Ambulance Available");
            ecoSystem.getAmbulanceDirectory().createAmbulance(ambulance);
            JOptionPane.showMessageDialog(null, "Profile Created");

            AmbulanceWorkAreaJPanel ambulanceWorkAreaJPanel = new AmbulanceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("Add Patient", ambulanceWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill All Details Correctly");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnSetFree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetFree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetFree1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetFree1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDriverAge;
    private javax.swing.JLabel lblDriverAge1;
    private javax.swing.JLabel lblDriverFirstName;
    private javax.swing.JLabel lblDriverFirstName1;
    private javax.swing.JLabel lblDriverLastName;
    private javax.swing.JLabel lblDriverLastName1;
    private javax.swing.JLabel lblErrorAge;
    private javax.swing.JLabel lblErrorAge1;
    private javax.swing.JLabel lblErrorFname;
    private javax.swing.JLabel lblErrorFname1;
    private javax.swing.JLabel lblErrorLname;
    private javax.swing.JLabel lblErrorLname1;
    private javax.swing.JLabel lblErrorVNumber;
    private javax.swing.JLabel lblErrorVNumber1;
    private javax.swing.JLabel lblVehicleNumber;
    private javax.swing.JLabel lblVehicleNumber1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JTextField txtVehicleNumber1;
    // End of variables declaration//GEN-END:variables
}
