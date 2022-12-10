/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Ambulance.AmbulanceDirectory;
import Model.Doctor.DoctorDirectory;
import Model.Laboratory.Laboratory;
import Model.Roles.Admin;
import Model.Pharmacy.Pharmacy;
import Model.Roles.Role;
import Model.BloodDonationCenter.BloodDonationCenter;
import Model.Cop.Cop;
import java.util.ArrayList;
import Model.Patient.PatientDirectory;
import Model.Ambulance.AmbulanceDirectory;
import Model.Roles.Role;
import Model.BloodDonationCenter.BloodDonationCenter;
import Model.InsuranceAuthority.InsuranceDirectory;

/**
 *
 * @author ramya
 */
public class EcoModel extends OrganizationModel {
    private static EcoModel business;
    private Laboratory laboratory;
    private InsuranceDirectory insuranceDirectory;
    private DoctorDirectory doctorDirectory;
    private BloodDonationCenter bloodDonationCenter;
    private Pharmacy pharmacy;
    private AmbulanceDirectory ambulanceDirectory;
    private PatientDirectory patDirectory;
    private Cop copRecords;

    public void setCop(Cop cop) {
        this.copRecords = cop;
    }

    public Cop getCop() {
        return copRecords =(copRecords == null)? new Cop() : copRecords;
    }


    private EcoModel()
    {
        super(null);
    }
    
    public PatientDirectory getPatDirectory() {
        return patDirectory = (patDirectory == null) ? new PatientDirectory() : patDirectory;
    }

    public void setPatDirectory(PatientDirectory patDirectory) {
        this.patDirectory = patDirectory;
    }
    
    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Laboratory getLaboratory() {
        return laboratory = (laboratory == null)? new Laboratory() : laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }

    public static EcoModel getBusiness() {
        return business;
    }

    public static void setBusiness(EcoModel business) {
        EcoModel.business = business;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory = (insuranceDirectory == null)? new InsuranceDirectory() : insuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory insuranceDirectory) {
        this.insuranceDirectory = insuranceDirectory;
    }

    public BloodDonationCenter getBloodDonationCenter() {
        return bloodDonationCenter = (bloodDonationCenter == null) ? new BloodDonationCenter() : bloodDonationCenter;
    }

    public void setBloodDonationCenter(BloodDonationCenter bloodDonationCenter) {
        this.bloodDonationCenter = bloodDonationCenter;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory = (ambulanceDirectory == null) ? new AmbulanceDirectory() : ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
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


    
    public boolean checkIfUserIsUnique(String userName)
    {
       return false;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new Admin());
        return roleList;
    }       
}