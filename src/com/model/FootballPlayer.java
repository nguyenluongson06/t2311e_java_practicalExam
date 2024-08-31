package com.model;

public class FootballPlayer extends HomoSapiens {
    int shirtNumber;
    String position;

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public FootballPlayer() {
        super();
        shirtNumber = 0;
        position = "";
    }

    public FootballPlayer(String name, float height, float weight, int age, int shirtNumber, String position) {
        super(name, height, weight, age);
        this.shirtNumber = shirtNumber;
        this.position = position;
    }

    public void shoot(){
        System.out.println(this.name + " is shooting a ball");
    }

    public void pass(FootballPlayer target){
        System.out.println(this.name + " is passing to " + target.name);
    }
}
