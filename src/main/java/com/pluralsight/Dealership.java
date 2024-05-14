package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> vehiclesByPrice = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                vehiclesByPrice.add(vehicle);
            }
        }
        return vehiclesByPrice;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> vehiclesByMM = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equals(make) && vehicle.getModel().equals(model)) {
                vehiclesByMM.add(vehicle);
            }
        }
        return vehiclesByMM;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        List<Vehicle> vehiclesByYear = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                vehiclesByYear.add(vehicle);
            }
        }
        return vehiclesByYear;

    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> vehiclesByColor = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equals(color)) {
                vehiclesByColor.add(vehicle);
            }
        }
        return vehiclesByColor;


    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> vehiclesByMileage = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                vehiclesByMileage.add(vehicle);
            }
        }
        return vehiclesByMileage;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equals(vehicleType)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;

    }

    public List<Vehicle> getAllVehicle() {
       List<Vehicle> allVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            allVehicles.add(vehicle);
        }
        return allVehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);

    }
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);

    }

}