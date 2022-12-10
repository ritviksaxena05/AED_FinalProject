/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Roles.Role;
import Model.User.UserDirectory;
import Model.Employee.EmployeeDirectory;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public abstract class OrganizationModel {
    private String OrganisationName;
    private EmployeeDirectory empDirectory;
    private UserDirectory userDirectory;
    private int organisationID;
    private static int counter = 0;

    public enum Type {
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");

        private final String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public OrganizationModel(String name) {
        
        this.OrganisationName = name;
        this.empDirectory = new EmployeeDirectory();
        this.userDirectory = new UserDirectory();
        this.organisationID = counter;
        ++counter;
    }

    public OrganizationModel() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserDirectory getUserAccountDirectory() {
        return this.userDirectory;
    }

    public int getOrganizationID() {
        return this.organisationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return this.empDirectory;
    }

    public String getOrganisationName() {
        return this.OrganisationName;
    }

    public void setOrganisationName(String name) {
        this.OrganisationName = name;
    }

    @Override
    public String toString() {
        return this.OrganisationName;
    }
    
    
}
