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
public class Logout {
    JPanel userMainContainer;
 
    public Logout(JPanel userContainer) {
        initComponents();
        this.userMainContainer = userContainer; 
        
    }
    
    private javax.swing.JLabel jLabel1;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
