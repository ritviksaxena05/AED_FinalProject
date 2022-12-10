/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cop;

import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class Cop {
    private String copDepartmentName;
    private String copUserName;
    private String address;
    private ArrayList<Patient> policeRecordsList;

    public Cop() {
        policeRecordsList = new ArrayList<>();
    }

    public String getDepartmentName() {
        return copDepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.copDepartmentName = departmentName;
    }

    public String getUserName() {
        return copUserName;
    }

    public void setUserName(String userName) {
        this.copUserName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Patient> getPoliceRecordsList() {
        return policeRecordsList;
    }

    public void setPoliceRecordsList(ArrayList<Patient> policeRecordsList) {
        this.policeRecordsList = policeRecordsList;
    }
    public void addtoRecord(Patient patient)
    {
      /*  for(Patient p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        policeRecordsList.add(patient);
    }
}
