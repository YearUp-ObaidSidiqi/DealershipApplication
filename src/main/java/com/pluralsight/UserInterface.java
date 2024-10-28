package com.pluralsight;

import java.io.IOException;

public  class UserInterface {

     Dealership dealership;

    public UserInterface() throws IOException {
         dealership = DealershipFileManager.ReadVehiclesFromCSV("vehicles.csv");
     }

    void displayAllVehicles(){
        for ( Vehicle v :dealership.getAllVehicles()){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByMake(String make){
        for ( Vehicle v :dealership.getVehiclesByMake(make)){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByModel(String model){
        for ( Vehicle v :dealership.getVehiclesByModel(model)){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByMakeModel(String make, String model){
        for ( Vehicle v :dealership.getVehicleByMakeModel(make, model)){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByType(String type){
        for ( Vehicle v :dealership.getVehiclesByType(type)){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByColor(String color){
        for ( Vehicle v :dealership.getVehiclesByColor(color)){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByYear(int min, int max){
        for ( Vehicle v :dealership.getVehiclesByYear(min, max)){
            System.out.println(v.getEncodedString());
        }
    }
    void displayVehiclesByPrice(int min, int max){
        for ( Vehicle v :dealership.getVehiclesByPrice(min, max)){
            System.out.println(v.getEncodedString());
        }
    }

    void displayMenu (){
        intro();
        mainMenu();
        int i = Utilities.PromptForInt("Please select an option (1, 2, 3, 4, 5, 6, 7, 8, 9, 99): ");






    }

    void mainMenu(){
        String menu = """
                ┌───────────────────────────────────────────────────────────────────┐
                │                 Please select from the following choices:         │
                │                                                                   │
                │                1 - Find vehicles within a price range             │
                │                2 - Find vehicles by make / model                  │
                │                3 - Find vehicles by year range                    │
                │                4 - Find vehicles by color                         │
                │                5 - Find vehicles by mileage range                 │
                │                6 - Find vehicles by type (car, truck, SUV, van)   │
                │                7 - List ALL vehicles                              │
                │                8 - Add a vehicle                                  │
                │                9 - Remove a vehicle                               │
                │               99 - Quit                                           │
                │                                                                   │
                └───────────────────────────────────────────────────────────────────┘
                                   >>> """;
        System.out.println(menu);
    }
    void intro (){
        String intro = """
                ┌───────────────────────────────────────────────────────────────────┐
                │            Welcome to the QPL Vehicle Management System           │
                │         Here, you can search, add, and manage vehicle data        │
                │       efficiently. Please select an option from the menu below.   │
                └───────────────────────────────────────────────────────────────────┘
                """;
    }



}
