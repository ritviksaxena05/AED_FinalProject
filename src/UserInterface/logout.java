/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;


import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Model.EcoModel;
import Model.Patient.PatientBills; //Changed the name to patientBills pls don't change as of now
import Model.Patient.Patient;
import Model.User.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author ramya
 */

public class Logout extends javax.swing.JPanel{
    JPanel userMainContainer;
    private javax.swing.JLabel jLabel1;


    public Logout(JPanel userContainer) {
        initComponents();
        this.userMainContainer = userContainer; 
        
    }  
     @SuppressWarnings("unchecked")
    private void initComponents() {
//        JPanel jPanel2 = new JPanel();
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        
//        jPanel2.setLayout(jPanel2Layout);
         JLabel jLabel3 = new JLabel("Hospital Management");
//        jPanel2Layout.setHorizontalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addGap(334, 334, 334)
//                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(281, Short.MAX_VALUE))
//        );
//        jPanel2Layout.setVerticalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
//                .addContainerGap(44, Short.MAX_VALUE)
//                .addComponent(jLabel3)
//                .addGap(39, 39, 39))
//        );
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/hospital.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
                
        );//678,580
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
}
