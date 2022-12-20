/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoModel;
import Model.User.User;
import UI.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author devikaboddu
 */
public class Admin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, EcoModel system) {
         return new SystemAdminWorkAreaJPanel(userProcessContainer, user, system);
    }
}
