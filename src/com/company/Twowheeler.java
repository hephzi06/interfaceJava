package com.company;

public class Twowheeler  implements IVechicle{
    String Id;
    String type;



    public Twowheeler(String id, String type){
        this.Id = id;
        this.type = type;
    }

    @Override
    public void brake() {
        System.out.println("zooommmmmmmm");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + type);
    }

    @Override
    public void start(){
        System.out.println("Starting the " + type);
    }
    public void displayDetails(){
        System.out.println("Vechicle No" + stateId + " " + Id);
        System.out.println("Vechicle Type " + type);
    }
}
