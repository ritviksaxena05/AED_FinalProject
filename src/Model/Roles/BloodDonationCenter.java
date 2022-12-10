/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoModel;
import Model.User.User;
import UI.BloodDonationCenter.BloodDonationCenterWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author devikaboddu
 */
public class BloodDonationCenter extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, EcoModel business) {
        return new BloodDonationCenterWorkAreaJPanel(userProcessContainer, user, business);
    }
}
