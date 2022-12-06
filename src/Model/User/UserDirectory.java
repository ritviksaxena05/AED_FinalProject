/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.User;

import Model.Roles.Role;
import Model.employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public class UserDirectory {
    private final ArrayList<User> userList;
    
    public UserDirectory() {
        userList = new ArrayList();
    }
    
      public User createUser(String uName, String pwd, Employee employee, Role r) {
        User user = new User();
        user.setRole(r);
        user.setPassword(pwd);
        user.setUsername(uName);
        user.setEmployee(employee);
        userList.add(user);
        System.out.println("----Creating user ----");
        System.out.println("----user name----"+uName);
        System.out.println("----user password----"+pwd);
        System.out.println("----user role----"+r);
        return user;
    }
    
    public boolean checkIfUsernameIsUnique(String uName) {
        for (User u : userList) {
            if (u.getUsername().equals(uName)) {
                return false;
            }
        }
        return true;
    }
    
    public void deleteUser(String uName){       
        for (User u : userList) {
            if (u.getUsername().equals(uName)) {
                userList.remove(u);
                break;
            }
        }
    }
}
