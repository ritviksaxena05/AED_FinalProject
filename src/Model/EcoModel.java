/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Doctor.DoctorDirectory;
import Model.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public class EcoModel extends OrganizationModel {
    private static EcoModel business;
    private DoctorDirectory doctorDirectory;

    public static EcoModel getBusiness() {
        return business;
    }

    public static void setBusiness(EcoModel business) {
        EcoModel.business = business;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public static EcoModel getInstance()
    {
        if(business==null)
        {
            business=new EcoModel();
        }
        
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
//        TODO: UNCOMMENT
//        roleList.add(new Administrator());
        return roleList;
    }
    private EcoModel()
    {
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName)
    {
       return false;
    }

    public Object getUserAccountDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
