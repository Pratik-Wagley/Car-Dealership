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

    public Vehicle getVehiclesByPrice(double min, double max) {
        return null;
    }

    public Vehicle getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public Vehicle getVehiclesByYear(int min, int max) {
        return null;
    }

    public Vehicle getVehiclesByColor(String color) {
        return null;
    }

    public Vehicle getVehiclesByMileage(int min, int max) {
        return null;
    }

    public Vehicle getVehiclesByType(String vehicleType) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicle() {
        ArrayList<Vehicle> allVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            allVehicles.add(vehicle);
            return allVehicles;
        }
        return null;
    }

    public void addVehicle(Vehicle vehicle) {

    }
    public void removeVehicle(Vehicle vehicle) {

    }

}