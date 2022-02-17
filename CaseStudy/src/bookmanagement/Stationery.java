package bookmanagement;

import NhaNam.KhachHang;

public class Stationery extends Product{
    private String nation;
    private String brand;
    private String supplier;
    private String manualInstruction;
    private String material;
    private int size;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
            percent=0.01d;
        }
        else if(customer.getTypeOfCustomer() == "VIP 1"){
            percent=0.03d;
        }
        else
            percent=0.07d;
        return percent;
    }
}
