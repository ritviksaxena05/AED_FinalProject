/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Employee.Employee;
import Model.Roles.Admin;
import Model.User.User;
/**
 *
 * @author ramya
 */
public class Configuration {
    public static EcoModel configure() {
        EcoModel system = EcoModel.getInstance();
        System.out.println("existing employees --"+system.getEmployeeDirectory());
        Employee employee = system.getEmployeeDirectory().createEmployee("Ramya");
        User ua = system.getUserAccountDirectory().createUser("sysadmin", "sysadmin", employee, new Admin());
        return system;
    }
}
