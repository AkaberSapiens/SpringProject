package com.sapiens.springMVC.productsDemo.model;

public class Product {
    private int id;
    private String name;
    private String batchName;
    private double price;
    private int noOfProduct;

    public Product(int id, String name, String batchName, double price, int noOfProduct) {
        this.id = id;
        this.name = name;
        this.batchName = batchName;
        this.price = price;
        this.noOfProduct = noOfProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfProduct() {
        return noOfProduct;
    }

    public void setNoOfProduct(int noOfProduct) {
        this.noOfProduct = noOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batchName='" + batchName + '\'' +
                ", price=" + price +
                ", noOfProduct=" + noOfProduct +
                '}';
    }
}
