package com.pluralsight;
import java.io.*;
import java.util.regex.Pattern;


public class DealershipFileManager{



    public static void ReadVehiclesFromCSV()  {

        try {
            var bufferedReader = new BufferedReader(new FileReader("vehicles.csv"));
            String input;
            bufferedReader.readLine();
            while ((input = bufferedReader.readLine()) != null) {

                String[] tokens = input.split(Pattern.quote("|"));

                Dealership.addVehicle(
                        Integer.parseInt(tokens[0]),  //int VIN
                        Integer.parseInt(tokens[1]), // int year
                        tokens[2],                  // make
                        tokens[3],
                        tokens[4],
                        tokens[5],
                        Integer.parseInt(tokens[6]),
                        Double.parseDouble(tokens[7]));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("***ERROR!! ArrayList<Vehicles>");
            System.out.println(e.getMessage());
        }
    }
   /* public static void writeVehiclesToCSV(Dealership dealership) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vehicles.csv"))) {
            // Write header (if needed)
            writer.write("D & B Used Cars|111 Old Benbrook Rd|817-555-5555\n");

            for (Vehicle vehicle : dealership.vehicle ) {
                String line = String.format("%s|%s|%s|%s|%s|%s|%s|%.2f\n",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                writer.write(line);
            }
        } catch (IOException e) {
            System.out.println("***ERROR!! Writing to CSV");
            System.out.println(e.getMessage());
        }
    }*/
}
