package com.company;

public class JamesBondCar extends Car{
    @Override
    public int drive(int howlong){
        int distance = howlong * 180;
        System.out.println("Машина Бонда проехала " + distance + "км");
        return distance;
    }

}
