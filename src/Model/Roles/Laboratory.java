package Model.Roles;

import Model.EcoModel;
import Model.User.User;
import UI.Laboratory.LaboratoryWorkAreaJPanel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devikaboddu
 */
public class Laboratory extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, EcoModel business) {
        System.out.println("inside createWork Area for Lab");
        return new LaboratoryWorkAreaJPanel(userProcessContainer, user, business);
    }
}
