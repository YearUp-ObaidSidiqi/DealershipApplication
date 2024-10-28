package com.pluralsight;

public class Vehicle {

    private int vin;
    private int year;
    private String make;
    private String Model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.Model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    public int getVin() {
        return vin;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return Model;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public int getOdometer() {
        return odometer;
    }
    public String getEncodedString(){
        String line;
        return line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                this.getVin(),
                this.getYear(),
                this.getMake(),
                this.getModel(),
                this.getVehicleType(),
                this.getColor(),
                this.getOdometer(),
                this.getPrice());
    }
}
