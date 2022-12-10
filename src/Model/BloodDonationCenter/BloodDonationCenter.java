package Model.BloodDonationCenter;

import Model.Patient.Patient;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devikaboddu
 */
public class BloodDonationCenter {
    private String bloodDonationCenterName;
    private String bloodDonationCenterAddress;
    private String bloodDonationCenterPhone;
    private String bloodDonationCenterEmailAddress;
    private ArrayList<Patient> bloodRequestedPatients;
    ArrayList<BloodType> bloodDetailsList;
    
    public BloodDonationCenter() {
        bloodRequestedPatients = new ArrayList<>();
        bloodRequestedPatients = bloodRequestedPatients == null ? new ArrayList<>() : bloodRequestedPatients;
    }
    
    public String getBloodDonationCenterName() {
        return bloodDonationCenterName;
    }

    public void setBloodDonationCenterName(String bloodDonationCenterName) {
        this.bloodDonationCenterName = bloodDonationCenterName;
    }

    public String getBloodDonationCenterAddress() {
        return bloodDonationCenterAddress;
    }

    public void setBloodDonationCenterAddress(String bloodDonationCenterAddress) {
        this.bloodDonationCenterAddress = bloodDonationCenterAddress;
    }

    public String getBloodDonationCenterPhone() {
        return bloodDonationCenterPhone;
    }

    public void setBloodDonationCenterPhone(String bloodDonationCenterPhone) {
        this.bloodDonationCenterPhone = bloodDonationCenterPhone;
    }

    public String getBloodDonationCenterEmailAddress() {
        return bloodDonationCenterEmailAddress;
    }

    public void setBloodDonationCenterEmailAddress(String bloodDonationCenterEmailAddress) {
        this.bloodDonationCenterEmailAddress = bloodDonationCenterEmailAddress;
    }

    public ArrayList<Patient> getBloodRequestedPatients() {
        return bloodRequestedPatients;
    }

    public void setBloodRequestedPatients(ArrayList<Patient> bloodRequestedPatients) {
        this.bloodRequestedPatients = bloodRequestedPatients;
    }

    public ArrayList<BloodType> getBloodDetailsList() {
        return bloodDetailsList;
    }

    public void setBloodDetailsList(ArrayList<BloodType> bloodTypeRecord) {
        this.bloodDetailsList = bloodTypeRecord;
    }
   
    public void AddTreatedPatientList(Patient patient)
    {
        bloodRequestedPatients.add(patient);
    }
}
