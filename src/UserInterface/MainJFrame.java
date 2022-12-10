/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import Model.DBUtil.DBUtil;
import Model.EcoModel;
import Model.Roles.DoctorAdmin;
import Model.Roles.DoctorUser;
import Model.User.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Model.Pharmacy.Pharmacy;
import Model.Ambulance.Ambulance;
//import Model.BloodDonationCenter.BloodDonationCenter;
import Model.Roles.AmbulanceDriver;
import Model.Roles.Cop;
import Model.Roles.BloodDonationCenter;
import Model.Roles.InsuranceAuthority;

import Model.Roles.Laboratory;
import Model.Roles.ReceptionistRole;
/** 
 *
 * @author ramya
 */
public class MainJFrame extends javax.swing.JFrame {
    private final DBUtil dBUtil = DBUtil.getInstance();
    private final EcoModel system;
    /**
     * Creates new form NewJFrame
     */
    public MainJFrame() {
        initComponents();
        system = dBUtil.retrieveSystem();
        this.setSize(1300, 900);
        system.getUserDirectory().createUser("doctor", "doctor", null, new DoctorUser());
        system.getUserDirectory().createUser("docadmin", "docadmin", null, new DoctorAdmin());
        system.getUserDirectory().createUser("ambulance", "ambulance", null, new AmbulanceDriver());
        system.getUserDirectory().createUser("police", "police", null, new Cop());
        system.getUserDirectory().createUser("bloodbank", "bloodbank", null, new BloodDonationCenter());
        system.getUserDirectory().createUser("lab", "lab", null, new Laboratory());   
        //system.getUserDirectory().createUser("insurance", "insurance", null, new InsuranceAuthority());
        system.getUserDirectory().createUser("reception", "reception", null, new ReceptionistRole());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panelLogin = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtUserNameInput = new javax.swing.JTextField();
        pwdInput = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        appLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelWorkArea = new javax.swing.JPanel();
        homeDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setBackground(new java.awt.Color(0, 0, 102));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 102));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 35));

        txtUserNameInput.setFont(new java.awt.Font("Noto Sans Kannada", 2, 14)); // NOI18N
        txtUserNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameInputActionPerformed(evt);
            }
        });
        panelLogin.add(txtUserNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 118, 35));

        pwdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdInputActionPerformed(evt);
            }
        });
        panelLogin.add(pwdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 118, 35));

        lblUserName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Username");
        panelLogin.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        panelLogin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 108, -1));
        panelLogin.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 231, -1, -1));

        btnLogout.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 102));
        btnLogout.setText("Logout");
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        panelLogin.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 120, 35));

        appLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/logo_130x130.png"))); // NOI18N
        panelLogin.add(appLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, 130));
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 50, 40));

        jSplitPane1.setLeftComponent(panelLogin);

        panelWorkArea.setBackground(new java.awt.Color(255, 255, 255));
        panelWorkArea.setLayout(new java.awt.CardLayout());

        homeDisplay.setBackground(new java.awt.Color(0, 153, 204));
        homeDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/dribbble_2.gif"))); // NOI18N
        panelWorkArea.add(homeDisplay, "card2");

        jSplitPane1.setRightComponent(panelWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1295, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            User user = system.getUserAccountDirectory().userAuthorization(txtUserNameInput.getText(), pwdInput.getText());
            CardLayout layout = (CardLayout) panelWorkArea.getLayout();
            System.out.println("role of user ---"+user.getUserRole());
            panelWorkArea.add(user.getUserRole().createWorkArea(panelWorkArea, user, system));
            layout.next(panelWorkArea);
            btnLogout.setEnabled(true);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Username/Password is wrong!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameInputActionPerformed

    private void pwdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdInputActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        txtUserNameInput.setEnabled(true);
        pwdInput.setEnabled(true);
        btnLogin.setEnabled(true);
        txtUserNameInput.setText("");
        pwdInput.setText("");

        Logout ua = new Logout(panelWorkArea);
        panelWorkArea.add("logout", ua);
        CardLayout layout = (CardLayout) panelWorkArea.getLayout();
        layout.next(panelWorkArea);
        dBUtil.storeSystem(system);

    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLogo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel homeDisplay;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelWorkArea;
    private javax.swing.JPasswordField pwdInput;
    private javax.swing.JTextField txtUserNameInput;
    // End of variables declaration//GEN-END:variables
}
