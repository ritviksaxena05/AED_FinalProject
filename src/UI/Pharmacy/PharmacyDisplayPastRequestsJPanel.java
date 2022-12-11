/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Pharmacy;

import Model.EcoModel;
import Model.Patient.Patient;
import javax.swing.JPanel;
import Model.Patient.PatientBills;
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ritvik
 */
public class PharmacyDisplayPastRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyDisplayPastRequestsJPanel
     */
    
    Patient p;
    JPanel userProcessContainer;
    User user;
    EcoModel ecoModel;
    
    public PharmacyDisplayPastRequestsJPanel(JPanel userProcessContainer, User account, Patient p,EcoModel ecoModel) {

        initComponents();
        this.user = user;
        this.ecoModel = ecoModel;
        this.userProcessContainer = userProcessContainer;
        this.p = p;
        FName.setText("Customer Name: "+p.getpFirstName()+" "+p.getpLastName());
        populateBillTable();
    }
    
    private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        model.setRowCount(0);

        for (PatientBills b : p.getpBills()) {

            Object[] row = new Object[7];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
            row[3] = b.getStatus();
            row[4] = b.getResult();

            if(b.getOrgType().equals("Pharmacy")&&b.getStatus().equals("Delivered")){

            model.addRow(row);}
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        FName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(128, 206, 206));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BillTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BillTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 891, 244));

        FName.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        add(FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 284, 380, 60));

        jPanel2.setBackground(new java.awt.Color(9, 145, 143));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/pills.png"))); // NOI18N
        jLabel1.setText("Past Patient Request");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(521, 521, 521))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/pharmacy (1).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel FName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
