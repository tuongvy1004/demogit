package bookmanagement;

import NhaNam.HoaDon;

import java.util.Date;

public class Customer {
    private int cusId;
    private String name;
    private int phoneNumber;
    private String Email;
    private Date dateOfBirth;
    private String typeOfCustomer;
    private HoaDon bill;

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public HoaDon getBill() {
        return bill;
    }

    public void setBill(HoaDon bill) {
        this.bill = bill;
    }
}
