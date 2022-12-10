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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/assets/dribbble_2.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
}
