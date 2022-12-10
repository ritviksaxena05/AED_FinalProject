/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.User.User;
import Model.EcoModel;
import UI.Pharmacy.PharmacyJPanel;
import javax.swing.JPanel;
/**
 *
 * @author ramya
 */
public class PharmacistRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, EcoModel business) {
        return new PharmacyJPanel(userProcessContainer, user, business);
    }
}
