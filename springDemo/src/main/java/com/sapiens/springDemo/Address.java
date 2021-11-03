package com.sapiens.springDemo;

public class Address {
    String city;
    String state;
    String country;
    int pincode;
    int po_box;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPo_box() {
        return po_box;
    }

    public void setPo_box(int po_box) {
        this.po_box = po_box;
    }


}
