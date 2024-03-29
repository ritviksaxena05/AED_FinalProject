/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.User;

import Model.Roles.Role;
import Model.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public class UserDirectory {
    private final ArrayList<User> userList;

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public UserDirectory() {
        userList = new ArrayList();
    }
    
      public User createUser(String uName, String pwd, Employee employee, Role r) {
        User user = new User();
        user.setUserRole(r);
        user.setUserPassword(pwd);
        user.setUserName(uName);
        user.setEmployee(employee);
        userList.add(user);
        System.out.println("----Creating user ----");
        System.out.println("----user name----"+uName);
        System.out.println("----user password----"+pwd);
        System.out.println("----user role----"+r);
        return user;
    }
    
    public boolean checkIfUsernameIsUnique(String uName) {
        for (User ul : userList) {
            if (ul.getUserName().equals(uName)) {
                return false;
            }
        }
        return true;
    }
    
    public void deleteUser(String uName){       
        for (User ul : userList) {
            if (ul.getUserName().equals(uName)) {
                userList.remove(ul);
                break;
            }
        }
    }
    
    public User userAuthorization(String username, String password) {
        System.out.println("username ---"+ username);
          System.out.println("password ---"+password);
        for (User ul : userList) {
            System.out.println("username ---"+ ul.getUserName());
          System.out.println("password ---"+ul.getUserPassword());
            if (ul.getUserName().equals(username) && ul.getUserPassword().equals(password)) {
                return ul;
            }
        }
        return null;
    }
}
