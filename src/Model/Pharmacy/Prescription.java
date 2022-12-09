/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pharmacy;

import java.util.Date;
/**
 *
 * @author ramya
 */
public class Prescription {
    private int medPrice;
    private String Name;
    private int medQuantity;
    private Date expiryDate;
    private String medUsage;

    public int getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(int medPrice) {
        this.medPrice = medPrice;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMedQuantity() {
        return medQuantity;
    }

    public void setMedQuantity(int medQuantity) {
        this.medQuantity = medQuantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getMedUsage() {
        return medUsage;
    }

    public void setMedUsage(String medUsage) {
        this.medUsage = medUsage;
    }
    
    
}
