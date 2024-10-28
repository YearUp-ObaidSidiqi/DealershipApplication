package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

   static  ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();

   final static String name = "D & B Used Cars";
   final static String address = "111 Old Benbrook Rd";
   final static String phone = "817-555-5555";

    public static void addVehicle(int VIN, int Year, String Make, String Model, String Type, String Color, int Odometer, double Price) {
        vehicle.add(new Vehicle(VIN, Year, Make, Model, Type, Color, Odometer, Price));
    }
    public static void removeVehicle(int VIN) {
        Vehicle vehicleToRemove = null;

        // Search for the vehicle with the specified VIN
        for (Vehicle vehicle : vehicle) {
            if (vehicle.getVin() == VIN) {
                vehicleToRemove = vehicle;
                break;
            }
        }

        // Remove the vehicle if it was found
        if (vehicleToRemove != null) {
            vehicle.remove(vehicleToRemove);
            System.out.println("Vehicle with VIN " + VIN + " removed.");
        } else {
            System.out.println("Vehicle with VIN " + VIN + " not found.");

        }
    }
    public static void getAllVehicles() {
        for (Vehicle vehicle : vehicle){

            String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                    vehicle.getVin(),
                    vehicle.getYear(),
                    vehicle.getMake(),
                    vehicle.getModel(),
                    vehicle.getVehicleType(),
                    vehicle.getColor(),
                    vehicle.getOdometer(),
                    vehicle.getPrice());
            System.out.println(line);
        }
    }
    public static void getVehiclesByMake(String Make){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getMake().equalsIgnoreCase(Make)){
            String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                    vehicle.getVin(),
                    vehicle.getYear(),
                    vehicle.getMake(),
                    vehicle.getModel(),
                    vehicle.getVehicleType(),
                    vehicle.getColor(),
                    vehicle.getOdometer(),
                    vehicle.getPrice());
            System.out.println(line);}
        }
    }
    public static void getVehiclesByModel(String Model){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getModel().equalsIgnoreCase(Model)){
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                System.out.println(line);}
        }
    }
    public static void getVehicleByMakeModel(String Make, String Model){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getModel().equalsIgnoreCase(Model) && vehicle.getMake().equalsIgnoreCase(Make)){
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                System.out.println(line);}
        }
    }
    public static void getVehiclesByType(String Type){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getVehicleType().equalsIgnoreCase(Type)){
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                System.out.println(line);}
        }
    }
    public static void getVehiclesByColor(String Color){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getColor().equalsIgnoreCase(Color)){
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                System.out.println(line);}
        }
    }
    public static void getVehiclesByYear(int minYear, int maxYear){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getYear()> minYear && vehicle.getYear()< maxYear){
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                System.out.println(line);}
        }
    }
    public static void getVehiclesByPrice(int minPrice, int maxPrice){
        for (Vehicle vehicle : vehicle){
            if (vehicle.getPrice()> minPrice && vehicle.getPrice()< maxPrice){
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                System.out.println(line);}
        }
    }



}
