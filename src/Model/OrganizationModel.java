/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Roles.Role;
import Model.User.UserDirectory;
import Model.employee.EmployeeDirectory;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public abstract class OrganizationModel {
    private String name;
    private int id;
    private static int counter = 0;
    private UserDirectory userDirectory;
    private EmployeeDirectory employeeDirectory;
    
    public OrganizationModel(String name) {        
        this.id = counter;
        this.name = name;
        this.userDirectory = new UserDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        ++counter;
    }

    public OrganizationModel() {

    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public UserDirectory getUserDirectory() {
        return this.userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        OrganizationModel.counter = counter;
    }
    
    
}
