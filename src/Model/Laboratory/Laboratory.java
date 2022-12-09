/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Laboratory;

import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class Laboratory {
    private String lab;
    private String email;
    private ArrayList<LaboratoryTests> testList;
    private ArrayList<Patient> laboratoryRecordsList;

    public Laboratory() {
        testList = new ArrayList<>();
        laboratoryRecordsList = new ArrayList<>();
    }
    public void AddTreatedPatientList(Patient patient)
    {
      /*  for(Patient p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        laboratoryRecordsList.add(patient);
    }
    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<LaboratoryTests> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<LaboratoryTests> testList) {
        this.testList = testList;
    }

    public ArrayList<Patient> getLaboratoryRecordsList() {
        return laboratoryRecordsList;
    }

    public void setLaboratoryRecordsList(ArrayList<Patient> labRecordsList) {
        this.laboratoryRecordsList = laboratoryRecordsList;
    }
        public LaboratoryTests createTest(LaboratoryTests t) {
        //Tests bloodRecord = new Tests();
        testList.add(t);
        return t;
    }
    public void deleteTests(LaboratoryTests p){
        testList.remove(p);
    }
    public void updateTests(LaboratoryTests t,String name,String username, int password){
       
        t.setLabTestName(name);
        t.setLabTestUsage(username);
        t.setLabTestprice(password);
    }
}
