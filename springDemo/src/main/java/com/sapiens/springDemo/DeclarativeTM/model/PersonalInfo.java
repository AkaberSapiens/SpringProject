package com.sapiens.springDemo.DeclarativeTM.model;

public class PersonalInfo {

    private int id;
    private String address;
    private String contact;
    private String email_ID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail_ID() {
        return email_ID;
    }

    public void setEmail_ID(String email_ID) {
        this.email_ID = email_ID;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email_ID='" + email_ID + '\'' +
                '}';
    }
}
