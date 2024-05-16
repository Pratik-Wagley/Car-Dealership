package com.pluralsight;

import java.io.*;

public class DealershipFileManager {
    public final String FILE_NAME = "dealership.csv";
    public Dealership dealership;

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
                    //System.out.println(line);
                }
               else if (parts.length == 8) {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                   dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                    //System.out.println(line);
                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }
            br.close();
        } catch (FileNotFoundException | NumberFormatException e) {
            System.err.println("Error");
        } catch (IOException e) {
            System.out.println("Could not read line");
        }
        return dealership;
    }
    public void saveDealerShip(Dealership dealership){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            for (Vehicle vehicle : dealership.getAllVehicle()) {
                bw.write(vehicle.getVin() + "|" + vehicle.getYear() + "|" +  vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error");

        }

    }


}
