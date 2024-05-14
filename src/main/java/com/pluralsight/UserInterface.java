package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public final String FILE_NAME = "dealership.csv";

    private Dealership dealership;

   // public UserInterface(Dealership dealership) {
     // this.dealership = dealership;
    //  }
    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
       this.dealership = dealershipFileManager.getDealerShip();


    }
    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }

    public void display() {
        init();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Dealership");
            System.out.println("Choose an option:");
            System.out.println("P)  Get Vehicle by Price");
            System.out.println("M)  Get Vehicle by Make and Model");
            System.out.println("Y)  Get Vehicle by Year");
            System.out.println("C)  Get Vehicle by Color");
            System.out.println("O)  Get Vehicle by Mileage");
            System.out.println("T)  Get Vehicle by Type");
            System.out.println("V)  Get All Vehicle ");
            System.out.println("A)  Add Vehicle");
            System.out.println("R)  Remove Vehicle");
            System.out.println("X) Exit");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "P":
                    processGetByPriceRequest(scanner);
                    break;
                case "M":
                    processGetByMakeModelRequest(scanner);
                    break;
                case "Y":
                    processGetByYearRequest(scanner);
                    break;
                case "C":
                    processGetByColorRequest(scanner);
                    break;
                case "O":
                    processGetByMileageRequest(scanner);
                    break;
                case "T":
                    processGetByVehicleTypeRequest(scanner);
                    break;
                case "V":
                    processGetAllRequest(getDealership());
                    break;
                case "A":
                    processAddVehicleRequest(scanner);
                    break;
                case "R":
                    processRemoveVehicleRequest();
                    break;
                case "X":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

        scanner.close();


    }


    public void processGetByPriceRequest(Scanner scanner) {
        System.out.println("Enter the minimum vehicle price");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the maximum vehicle price");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("These are the vehicles within your range: ");
        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest(Scanner scanner) {
        System.out.println("Enter the make of the vehicle");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the vehicle");
        String model = scanner.nextLine();
        System.out.println("These are the vehicles with the make and model ");
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));

    }

    public void processGetByYearRequest(Scanner scanner) {
        System.out.println("Enter the minimum year: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the maximum year: ");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("These are the vehicles within your range: ");
        displayVehicles(dealership.getVehiclesByYear(min, max));

    }

    public void processGetByColorRequest(Scanner scanner) {
        System.out.println("Enter the color of the vehicles");
        String color = scanner.nextLine();
        System.out.println("These are the vehicles with that color: ");
        displayVehicles(dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest(Scanner scanner) {
        System.out.println("Enter the minimum mileage: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the maximum mileage: ");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("These are the vehicles within your range: ");
        displayVehicles(dealership.getVehiclesByMileage(min, max));

    }

    public void processGetByVehicleTypeRequest(Scanner scanner) {
        System.out.println("Enter the type of the vehicles");
        String type = scanner.nextLine();
        System.out.println("These are the vehicles of that type: ");
        displayVehicles(dealership.getVehiclesByType(type));

    }

    public void processGetAllRequest(Dealership dealership) {
       List<Vehicle> allVehicles = dealership.getAllVehicle();
        System.out.println("These are all of the vehicles: ");
        displayVehicles(allVehicles);
    }

    public void processAddVehicleRequest(Scanner scanner) {
        System.out.println("Enter a unique VIN:");
         int vin = scanner.nextInt();
        System.out.println("Enter Year of the vehicle:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Make:");
        String make = scanner.nextLine();
        System.out.println("Enter the Model:");
        String model = scanner.nextLine();
        System.out.println("Enter the Vehicle Type:");
        String vehicleType = scanner.nextLine();
        System.out.println("Enter Color:");
        String color = scanner.nextLine();
        System.out.println("Enter Odometer:");
        int odometer = scanner.nextInt();
        System.out.println("Enter Price:");
        double price = scanner.nextDouble();
        dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.write(vin + "|" + year + "|" + make + "|" + model + "|" + vehicleType + "|" + odometer + "|" + price);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error");

        }

    }

    public void processRemoveVehicleRequest() {
        System.out.println("Enter the VIN of the vehicle you want to remove:");


    }


}
