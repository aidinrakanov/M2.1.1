package com.company;

import java.util.Random;

public class Pet {

    private int age = generateDefaultAge();
    private Shelter shelter;
    private COLOUR colour;


    private int generateDefaultAge() {
        Random r = new Random();
        return r.nextInt(20);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public COLOUR getColour() {
        return colour;
    }

    public void setColour(COLOUR colour) {
        this.colour = colour;
    }

    public String getInfo() {
        return " Питомец {" +
                "возраст: " + age +
                ", приют: " + shelter.getName() + " " + shelter.getAdress() +
                ", цвет: " + colour +
                '}';
    }


}
