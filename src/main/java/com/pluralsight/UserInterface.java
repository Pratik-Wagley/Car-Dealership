package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

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



    }


    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllRequest(Dealership dealership) {
       List<Vehicle> allVehicles = dealership.getAllVehicle();
       displayVehicles(allVehicles);
    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }


}
