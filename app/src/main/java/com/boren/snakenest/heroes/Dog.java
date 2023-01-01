package com.boren.snakenest.heroes;

public class Dog{

    private String name = "Dog";
    private int helth = 7;
    private int strength = 7;
    private int agility = 6;
    private int armor = 8;
    private int luck = 5;

    public Dog ()  {

    }

    public Dog(String name, int helth, int strength, int agility, int armor, int luck) {
        this.name = name;
        this.helth = helth;
        this.strength = strength;
        this.agility = agility;
        this.armor = armor;
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", helth=" + helth +
                ", strength=" + strength +
                ", agility=" + agility +
                ", armor=" + armor +
                ", luck=" + luck +
                '}';
    }
}
