package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public static String FILE_NAME = "dealership.csv";
    public static Dealership dealership;

    public Dealership getDealerShip(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership = new Dealership(name, address, phone);
                   // System.out.println(line);
                }
                if (parts.length == 8) {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                   dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                   // System.out.println(line);
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error");
        } catch (IOException e) {
            System.out.println("Could not read line");
        }
        return dealership;
    }
    public void saveDealerShip(Dealership dealership){


    }


}
