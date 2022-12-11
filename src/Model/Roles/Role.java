/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EcoModel;
import Model.User.User;
import javax.swing.JPanel;

/**
 *
 * @author ramya
 */
public abstract class Role {
    
    public enum RoleType {
        DoctorAdmin("DoctorAdmin"),
        Patient("Patient"),
        SysAdmin("Sysadmin");

        private final String value;
 
        @Override
        public String toString() {
            return value;
        }
        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            User user,
            EcoModel system);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
