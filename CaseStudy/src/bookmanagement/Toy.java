package bookmanagement;

import NhaNam.KhachHang;

public class Toy extends Product{
    private String nation;
    private String brand;
    private String supplier;
    private String manualInstruction;
    private Customer customer;

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getManualInstruction() {
        return manualInstruction;
    }

    public void setManualInstruction(String manualInstruction) {
        this.manualInstruction = manualInstruction;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void showInformation() {

    }

    @Override
    public double discount() {
        double percent;

        if(customer.getTypeOfCustomer() == "Normal"){
            percent=0.02d;
        }
        else if(customer.getTypeOfCustomer() == "VIP 1"){
            percent=0.05d;
        }
        else
            percent=0.07d;
        return percent;
    }
}
