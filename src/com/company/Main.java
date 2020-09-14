package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CarOwner carOwner = new CarOwner();
        carOwner.start();
        carOwner.drive(12);
        carOwner.drive(2);
        carOwner.stop();
        JamesBondCar bondCar = new JamesBondCar();
        bondCar.drive(12);
    }
}
