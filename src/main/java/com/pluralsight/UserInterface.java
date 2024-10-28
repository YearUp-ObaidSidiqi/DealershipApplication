package com.pluralsight;

import java.io.IOException;

public  class UserInterface {

     Dealership dealership;

     public UserInterface() throws IOException {


         dealership = DealershipFileManager.ReadVehiclesFromCSV();
     }

    public static void main(String[] args) throws IOException {

    }

    void displayAllVehicles(){

    }

    void displayVehicle(Vehicle v){
        System.out.println(v.getYear() + v.getMake() + v.getModel());
    }



}
