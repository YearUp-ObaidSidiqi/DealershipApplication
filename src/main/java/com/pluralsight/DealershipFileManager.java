package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
public class DealershipFileManager{


    public static ArrayList<Vehicle> getVehicles() throws IOException {
        var vehicle = new ArrayList<Vehicle>();
        var bufferedReader = new BufferedReader(new FileReader("vehicles.csv"));
        String input;
        bufferedReader.readLine();
        while ((input = bufferedReader.readLine()) != null) {
            String[] tokens = input.split(Pattern.quote("|"));
            vehicle.add(new Vehicle(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[2], tokens[3], tokens[4], tokens[5], Integer.parseInt(tokens[6]), Double.parseDouble(tokens[7])));
        }
        bufferedReader.close();
        return vehicle;
    }
}
