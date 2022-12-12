/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Pharmacy;

import Model.User.User;
import java.awt.CardLayout;
import Model.Pharmacy.Prescription;
import Model.EcoModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class PharmacyDisplayCRUDJpanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyDisplayCRUDJpanel
     */
    JPanel userProcessContainer;
    EcoModel ecoModel;
    User user;
    Prescription m;
    public PharmacyDisplayCRUDJpanel(JPanel userProcessContainer, User user, EcoModel ecoModel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoModel = ecoModel;
        this.user = user;
        populatetablePrescription();
    }
    
    private void populatetablePrescription() {
        DefaultTableModel model = (DefaultTableModel) tableTests.getModel();

        model.setRowCount(0);

        for (Prescription t : ecoModel.getPharmacy().getPrescriptionList()) {

            
                Object[] row = new Object[4];                
                row[0] = t;
                row[1] = t.getMedUsage();
                row[2] =t.getMedQuantity();
                row[3] = t.getMedPrice();
                model.addRow(row);
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

        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTests = new javax.swing.JTable();
        lblName2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtUsage = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblName3 = new javax.swing.JLabel();
        dBtn = new javax.swing.JButton();
        conBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPharmWorkArea1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(128, 206, 206));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(128, 206, 206));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/add (1).png"))); // NOI18N
        btnSubmit.setText("Add Medicine");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 190, 40));

        tableTests.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tableTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Med Name", "Med Usage", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 788, 186));

        lblName2.setBackground(new java.awt.Color(0, 0, 0));
        lblName2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setText("Price");
        add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 30));

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 144, 30));
        add(txtUsage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 144, 30));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 144, 30));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Medicine Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));

        lblName1.setBackground(new java.awt.Color(0, 0, 0));
        lblName1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Medicine Usage");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 144, 30));

        lblName3.setBackground(new java.awt.Color(0, 0, 0));
        lblName3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblName3.setForeground(new java.awt.Color(255, 255, 255));
        lblName3.setText("Quantity");
        add(lblName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, 30));

        dBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dBtn.setForeground(new java.awt.Color(128, 206, 206));
        dBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/delete (1).png"))); // NOI18N
        dBtn.setText("Delete");
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });
        add(dBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 190, 43));

        conBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        conBtn.setForeground(new java.awt.Color(128, 206, 206));
        conBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/download.png"))); // NOI18N
        conBtn.setText("Save Update");
        conBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtnActionPerformed(evt);
            }
        });
        add(conBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 190, 43));

        upBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        upBtn.setForeground(new java.awt.Color(128, 206, 206));
        upBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/update (1).png"))); // NOI18N
        upBtn.setText("Update");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 188, 40));

        jPanel2.setBackground(new java.awt.Color(9, 145, 143));

        lblPharmWorkArea1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblPharmWorkArea1.setForeground(new java.awt.Color(255, 255, 255));
        lblPharmWorkArea1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPharmWorkArea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/pills.png"))); // NOI18N
        lblPharmWorkArea1.setText("Pharmacy");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(9, 145, 143));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321)
                .addComponent(lblPharmWorkArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPharmWorkArea1)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 100));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 170, 30));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtName.getText().equals("") || txtUsage.getText().equals("")|| txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        } else {
            Prescription m = new Prescription();
            m.setName(txtName.getText());
            m.setMedQuantity(Integer.parseInt(txtQuantity.getText()));
            m.setMedUsage(txtUsage.getText());
            m.setMedPrice(Integer.parseInt(txtPrice.getText()));
            ecoModel.getPharmacy().createPrescription(m);

            populatetablePrescription();

        }

        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPrice.getText());
        if (!match.matches() )
        {
            jLabel3.setText("Please input correct data. HINT: number");
        }
        else
        {
            jLabel3.setText(null);
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtQuantity.getText());
        if (!match.matches() )
        {
            jLabel2.setText("Please input correct data. HINT: number");
        } else
        {
            jLabel2.setText(null);
        }
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Medicine: "+tableTests.getValueAt(selectedRow, 0)+" ??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                Prescription p = (Prescription) tableTests.getValueAt(selectedRow, 0);
                ecoModel.getPharmacy().deletePrescription(p);
                populatetablePrescription();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select a Customer to delete!");
        }
    }//GEN-LAST:event_dBtnActionPerformed

    private void conBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtnActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String uname=txtUsage.getText();
        String password=txtPrice.getText();
        String quantity= txtQuantity.getText();
        if(name.equalsIgnoreCase("")||uname.equalsIgnoreCase("")||password.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Pls, Fill data Correctly!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            ecoModel.getPharmacy().updatePrescription(m,name,uname,Integer.parseInt(password),Integer.parseInt(quantity));
            populatetablePrescription();
        }
        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_conBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        //Tests p = (Tests) tableTests.getValueAt(selectedRow, 0);
        if(selectedRow>=0){
            m = (Prescription) tableTests.getValueAt(selectedRow, 0);
            txtName.setText(m.getName());
            txtUsage.setText(m.getMedUsage());
            txtPrice.setText(Integer.toString(m.getMedPrice()));
            txtQuantity.setText(Integer.toString(m.getMedQuantity()));
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }//GEN-LAST:event_upBtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        PharmacyJPanel bill = new PharmacyJPanel(userProcessContainer,user,ecoModel);
        userProcessContainer.add("Pharmacy Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton conBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblPharmWorkArea1;
    private javax.swing.JTable tableTests;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUsage;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
