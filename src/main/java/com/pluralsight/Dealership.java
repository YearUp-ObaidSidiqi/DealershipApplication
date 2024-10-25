package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    String name;
    String address;
    String phone;

    static ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }



    public static void addVehicle(){
        inventory.add(new Vehicle(12345,2020,"BMW","M5", "Sedan", "White", 345, 85000));
    }

    public static   void getAllVehicles (){
        for ( Vehicle vehicle: inventory){
            System.out.println(vehicle);
        }
    }

    public static void main(String[] args) {
        addVehicle();
        getAllVehicles();
    }


}




