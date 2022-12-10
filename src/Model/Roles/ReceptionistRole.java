/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.User.User;
import Model.EcoModel;
import javax.swing.JPanel;
import UI.ReceptionServiceRole.ReceptionWorkAreaJPanel;
/**
 *
 * @author ramya
 */
public class ReceptionistRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, EcoModel business) {
        System.out.println("inside create work area for reception");
        return new ReceptionWorkAreaJPanel(userProcessContainer, user, business);
}
}
