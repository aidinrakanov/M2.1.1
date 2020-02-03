package com.company;

import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName(" Hitler");
        d1.setBreed(" Pudel");
        d1.setShelter(new Shelter(" Псарня", " Токтогула"));
        d1.setColour(COLOUR.BLACK);


        Shelter shelter = new Shelter(" Собакен", " Frunze");
        Dog d2 = new Dog(" Stalin", "Pitbull", COLOUR.GRAY, shelter);

        Dog d3 = new Dog(" Ben laden", " Haski", COLOUR.WHITE, shelter, " Сидеть, лежать, ищи, лапу");

        System.out.println(d1.getInfo());
        d1.makeVoice(" gaw gaw", 2);

        System.out.println(d2.getInfo());
        d2.makeVoice(2);

        System.out.println(d3.getInfo());
        d3.makeVoice(" vov-vov");
    }
}
