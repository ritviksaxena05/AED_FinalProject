/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoModel;
import Model.User.User;
import UI.DocAdmin.DoctorAdminAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ramya
 */
public class DoctorAdmin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, EcoModel system) {
        System.out.println("inside doctors admin role---");
        return new DoctorAdminAreaJPanel(userProcessContainer, user, system);
    }    
}
