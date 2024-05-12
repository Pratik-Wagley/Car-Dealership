package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {
    private Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    private void init(Dealership dealership) {
       this.dealership = DealershipFileManager.getDealerShip();

    }
    private Vehicle displayVehicles(Dealership dealership) {
        for (Vehicle vehicle : dealership.getVehicles()) {
            return vehicle;
        }
        return null;
    }

    public static void display() {


    }


    public static void processGetByPriceRequest() {

    }

    public static void processGetByMakeModelRequest() {

    }

    public static void processGetByYearRequest() {

    }

    public static void processGetByColorRequest() {

    }

    public static void processGetByMileageRequest() {

    }

    public static void processGetByVehicleTypeRequest() {

    }

    public static Vehicle processGetAllRequest(Dealership dealership) {
       ArrayList<Vehicle> all = dealership.getAllVehicle();
       //reminder: working on this currently
    }

    public static void processAddVehicleRequest() {

    }

    public static void processRemoveVehicleRequest() {

    }


}
