package com.sapiens.springDemo;

public class Contact {

    String primary_mobile;
    String Secondary_mobile;
    String emergency_number;
    String email;
    String off_email;

    public String getPrimary_mobile() {
        return primary_mobile;
    }

    public void setPrimary_mobile(String primary_mobile) {
        this.primary_mobile = primary_mobile;
    }

    public String getSecondary_mobile() {
        return Secondary_mobile;
    }

    public void setSecondary_mobile(String secondary_mobile) {
        Secondary_mobile = secondary_mobile;
    }

    public String getEmergency_number() {
        return emergency_number;
    }

    public void setEmergency_number(String emergency_number) {
        this.emergency_number = emergency_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOff_email() {
        return off_email;
    }

    public void setOff_email(String off_email) {
        this.off_email = off_email;
    }
}
