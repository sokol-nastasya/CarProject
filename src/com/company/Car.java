package com.company;

public class Car {

    public void start(){

        System.out.println("Start car");
    }
    public void stop(){
        System.out.println("Stop car!");

    }
    public int drive(int howlong){
        int instance;
        instance = howlong * 60;
        System.out.println("Проехал " + instance + " км");
        return instance;
    }
}
