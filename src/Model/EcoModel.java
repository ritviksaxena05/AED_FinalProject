/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Ambulance.AmbulanceDirectory;
import Model.BloodDonationCenter.BloodDonationCenter;
import Model.Cop.Cop;
import Model.Doctor.DoctorDirectory;
import Model.InsuranceAuthority.InsuranceDirectory;
import Model.Laboratory.Laboratory;
import Model.Patient.PatientDirectory;
import Model.Pharmacy.Pharmacy;
import Model.Roles.Admin;
import Model.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public class EcoModel extends OrganizationModel {
    
    private static EcoModel business;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private AmbulanceDirectory ambulanceDirectory;
    private BloodDonationCenter bloodBank;
    private Laboratory lab;
    private Pharmacy pharmacy;
    private InsuranceDirectory insuranceDirectory;
    private Cop policeRecords;

    
    
    public static EcoModel getInstance()
    {
        if(business==null)
        {
            business=new EcoModel();
        }
        
        return business;
    }

    public static EcoModel getBusiness() {
        return business;
    }

    public static void setBusiness(EcoModel business) {
        EcoModel.business = business;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory = (patientDirectory == null) ? new PatientDirectory() : patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory = (doctorDirectory == null) ? new DoctorDirectory() : doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory = (ambulanceDirectory == null) ? new AmbulanceDirectory() : ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public BloodDonationCenter getBloodBank() {
        return bloodBank = (bloodBank == null) ? new BloodDonationCenter() : bloodBank;
    }

    public void setBloodBank(BloodDonationCenter bloodBank) {
        this.bloodBank = bloodBank;
    }

    public Laboratory getLab() {
        return lab = (lab == null)? new Laboratory() : lab;
    }

    public void setLab(Laboratory lab) {
        this.lab = lab;
    }
    
    public Pharmacy getPharmacy() {
        return pharmacy = (pharmacy == null)? new Pharmacy() : pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
    
    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory = (insuranceDirectory == null)? new InsuranceDirectory() : insuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory insuranceDirectory) {
        this.insuranceDirectory = insuranceDirectory;
    }

    public Cop getPoliceRecords() {
        return policeRecords = (policeRecords == null)? new Cop() : policeRecords;
    }

    public void setPoliceRecords(Cop policeRecords) {
        this.policeRecords = policeRecords;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
//        TODO: UNCOMMENT
        roleList.add(new Admin());
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
        
}
