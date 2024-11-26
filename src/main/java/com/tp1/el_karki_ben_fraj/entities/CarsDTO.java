package com.tp1.el_karki_ben_fraj.entities;

import java.util.Date;

public class CarsDTO {
    private String plateNumber;
    private String brand;
    private int price;
    private boolean isRent;
    private String dateOfRent;

    public CarsDTO(int price, String brand, String plateNumber) {
        this.price = price;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.isRent = false;
        this.dateOfRent = null;
    }

    public CarsDTO() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public String getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }
}
