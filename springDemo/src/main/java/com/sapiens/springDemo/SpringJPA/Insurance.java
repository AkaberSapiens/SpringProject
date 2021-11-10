package com.sapiens.springDemo.SpringJPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Insurance {

    @Id
    private int id;
    private String type;
    private String validTill;
    private int premium;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", validTill='" + validTill + '\'' +
                ", premium=" + premium +
                '}';
    }
}
