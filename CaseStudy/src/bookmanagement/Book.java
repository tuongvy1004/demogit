package bookmanagement;

import NhaNam.KhachHang;

import java.util.Date;

public class Book extends Product{
    private String pulisher;
    private int year;
    private String composer;
    private Date date;
    private int reprint;
    private Customer customer;

    public String getPulisher() {
        return pulisher;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getReprint() {
        return reprint;
    }

    public void setReprint(int reprint) {
        this.reprint = reprint;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void showInformation() {
        System.out.println("Show information about books");
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
            percent=0.1d;
        return percent;
    }
}
