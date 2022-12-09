/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Insurance;

import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class Insurance {
    private String nameOftheInsuranceCompany;
    private String insuranceCompanyAddress;
    private String insuranceCompanyNumber;
    private String insuranceCompanyEmailId;
    private ArrayList<Patient> labRecordsList;

    public String getNameOftheInsuranceCompany() {
        return nameOftheInsuranceCompany;
    }

    public void setNameOftheInsuranceCompany(String nameOftheInsuranceCompany) {
        this.nameOftheInsuranceCompany = nameOftheInsuranceCompany;
    }

    public String getInsuranceCompanyAddress() {
        return insuranceCompanyAddress;
    }

    public void setInsuranceCompanyAddress(String insuranceCompanyAddress) {
        this.insuranceCompanyAddress = insuranceCompanyAddress;
    }

    public String getInsuranceCompanyNumber() {
        return insuranceCompanyNumber;
    }

    public void setInsuranceCompanyNumber(String insuranceCompanyNumber) {
        this.insuranceCompanyNumber = insuranceCompanyNumber;
    }

    public String getInsuranceCompanyEmailId() {
        return insuranceCompanyEmailId;
    }

    public void setInsuranceCompanyEmailId(String insuranceCompanyEmailId) {
        this.insuranceCompanyEmailId = insuranceCompanyEmailId;
    }

    public ArrayList<Patient> getLabRecordsList() {
        return labRecordsList;
    }

    public void setLabRecordsList(ArrayList<Patient> labRecordsList) {
        this.labRecordsList = labRecordsList;
    }

}
