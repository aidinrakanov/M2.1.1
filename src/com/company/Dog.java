package com.company;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog() {
    }

    public Dog(String name, String breed, COLOUR colour, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColour(colour);
    }

    public Dog(String name, String breed, COLOUR colour, Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColour(colour);
        super.setShelter(shelter);
    }

    void makeVoice(String voice, int number) {

        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(String voice) {
        System.out.println(voice);
    }

    void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("ГАВ ГАВ");
        }
    }

    @Override
    public String getInfo() {
        return "Имя" + " собаки:" + getName() + " порода: " + getBreed() + " комманда: " + getCommands() + super.getInfo();
    }
}
