package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class DealershipFileManager{

    public static ArrayList<Vehicle> vehicles;
    static {
        try {
            vehicles = getVehicles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Vehicle> getVehicles() throws IOException {
        var vehicle = new ArrayList<Vehicle>();

        var bufferedReader = new BufferedReader(new FileReader("vehicles.csv"));
        String input;
        bufferedReader.readLine();
        while ((input = bufferedReader.readLine()) != null) {

            String[] tokens = input.split(Pattern.quote("|"));
            vehicle.add(new Vehicle(
                    Integer.parseInt(tokens[0]),
                    Integer.parseInt(tokens[1]),
                    tokens[2],
                    tokens[3],
                    tokens[4],
                    tokens[5],
                    Integer.parseInt(tokens[6]),
                    Double.parseDouble(tokens[7])));
        }
        bufferedReader.close();
        return vehicle;

    }
    public static void writeVehiclesToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vehicles.csv"))) {
            // Write header (if needed)
            writer.write("D & B Used Cars|111 Old Benbrook Rd|817-555-5555\n");

            for (Vehicle vehicle : vehicles) {
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
    }
}
