/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Patient;

import BusinessModel.Patient.PatientBills;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author devikaboddu
 */
public class Patient {
    
    private String patientUserName;
    private String patientFirstName;
    private String patientLastName;
    private String patientGender;
    private String patientImageUrl;
    private int patientAge;
    private Date patientdob;
    private String patientAddress;
    private String patientEmailAddress;
    private String patientPhoneNo;
    private String patientHealthInsuranceID;
    private String patientBloodType;
    private String patientInjuryType;
    private Date patientDateOfAdmit;
    private String patientAccidentLocation;
    private String patientStatus;
    private String patientBloodBagQuantity;
    private String patientInsuranceStatus;
    private String patientLabStatus;
    private String patientPharmaStatus;
    private String patientBloodBankStatus;
    private String patientPoliceStatus;
    private boolean patientIsConcentFormSigned;
    private ArrayList<PatientBills> patientBills;

    public Patient() {
    }

    public Patient(String pUserName) {
        this.patientUserName = pUserName;
        patientBills = new ArrayList<>();
    }
    
    
    public String getpUserName() {
        return patientUserName;
    }

    public void setpUserName(String pUserName) {
        this.patientUserName = pUserName;
    }

    public String getpFirstName() {
        return patientFirstName;
    }

    public void setpFirstName(String pFirstName) {
        this.patientFirstName = pFirstName;
    }

    public String getpLastName() {
        return patientLastName;
    }

    public void setpLastName(String pLastName) {
        this.patientLastName = pLastName;
    }

    public String getpGender() {
        return patientGender;
    }

    public void setpGender(String pGender) {
        this.patientGender = pGender;
    }

    public String getpImageUrl() {
        return patientImageUrl;
    }

    public void setpImageUrl(String pImageUrl) {
        this.patientImageUrl = pImageUrl;
    }

    public int getpAge() {
        return patientAge;
    }

    public void setpAge(int pAge) {
        this.patientAge = pAge;
    }

    public Date getPdob() {
        return patientdob;
    }

    public void setPdob(Date pdob) {
        this.patientdob = pdob;
    }

    public String getpAddress() {
        return patientAddress;
    }

    public void setpAddress(String pAddress) {
        this.patientAddress = pAddress;
    }

    public String getpEmailAddress() {
        return patientEmailAddress;
    }

    public void setpEmailAddress(String pEmailAddress) {
        this.patientEmailAddress = pEmailAddress;
    }

    public String getpPhoneNo() {
        return patientPhoneNo;
    }

    public void setpPhoneNo(String pPhoneNo) {
        this.patientPhoneNo = pPhoneNo;
    }

    public String getpHealthInsuranceID() {
        return patientHealthInsuranceID;
    }

    public void setpHealthInsuranceID(String pHealthInsuranceID) {
        this.patientHealthInsuranceID = pHealthInsuranceID;
    }

    public String getpBloodType() {
        return patientBloodType;
    }

    public void setpBloodType(String pBloodType) {
        this.patientBloodType = pBloodType;
    }

    public String getpInjuryType() {
        return patientInjuryType;
    }

    public void setpInjuryType(String pInjuryType) {
        this.patientInjuryType = pInjuryType;
    }

    public Date getpDateOfAdmit() {
        return patientDateOfAdmit;
    }

    public void setpDateOfAdmit(Date pDateOfAdmit) {
        this.patientDateOfAdmit = pDateOfAdmit;
    }

    public String getpAccidentLocation() {
        return patientAccidentLocation;
    }

    public void setpAccidentLocation(String pAccidentLocation) {
        this.patientAccidentLocation = pAccidentLocation;
    }

    public String getpStatus() {
        return patientStatus;
    }

    public void setpStatus(String pStatus) {
        this.patientStatus = pStatus;
    }

    public String getpBloodBagQuantity() {
        return patientBloodBagQuantity;
    }

    public void setpBloodBagQuantity(String pBloodBagQuantity) {
        this.patientBloodBagQuantity = pBloodBagQuantity;
    }

    public String getpInsuranceStatus() {
        return patientInsuranceStatus;
    }

    public void setpInsuranceStatus(String pInsuranceStatus) {
        this.patientInsuranceStatus = pInsuranceStatus;
    }

    public String getpLabStatus() {
        return patientLabStatus;
    }

    public void setpLabStatus(String pLabStatus) {
        this.patientLabStatus = pLabStatus;
    }

    public String getpPharmaStatus() {
        return patientPharmaStatus;
    }

    public void setpPharmaStatus(String pPharmaStatus) {
        this.patientPharmaStatus = pPharmaStatus;
    }

    public String getpBloodBankStatus() {
        return patientBloodBankStatus;
    }

    public void setpBloodBankStatus(String pBloodBankStatus) {
        this.patientBloodBankStatus = pBloodBankStatus;
    }

    public String getpPoliceStatus() {
        return patientPoliceStatus;
    }

    public void setpPoliceStatus(String pPoliceStatus) {
        this.patientPoliceStatus = pPoliceStatus;
    }

    public boolean ispIsConcentFormSigned() {
        return patientIsConcentFormSigned;
    }

    public void setpIsConcentFormSigned(boolean pIsConcentFormSigned) {
        this.patientIsConcentFormSigned = pIsConcentFormSigned;
    }

    public ArrayList<PatientBills> getpBills() {
        return patientBills;
    }

    public void setpBills(ArrayList<PatientBills> pBills) {
        this.patientBills = pBills;
    }
    
    public void addbill(PatientBills bill){
        patientBills.add(bill);
    } 
     public float totalBill() {
        float total =0;
           for(PatientBills b:patientBills){
               total =  total + b.getAmount();
        }
        return total;
    }
           
    
}
