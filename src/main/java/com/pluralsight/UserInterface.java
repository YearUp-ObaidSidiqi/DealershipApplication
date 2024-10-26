package com.pluralsight;

public  class UserInterface {

    public static void main(String[] args) {

        DealershipFileManager.ReadVehiclesFromCSV();
        //Dealership.getAllVehicles();
        Dealership.addVehicle(1252,2024,"BMW", "M3", "sedan","white", 250, 65000);
        System.out.println("\n \n \n \n \n ");
        // Dealership.getAllVehicles();
        // Dealership.getVehiclesByMake("bmw");
        // Dealership.getVehiclesByYear(2010,2015);
        // Dealership.getVehiclesByPrice(10000,15000);


    }




}
