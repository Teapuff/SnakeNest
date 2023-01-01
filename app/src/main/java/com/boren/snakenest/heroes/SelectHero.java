package com.boren.snakenest.heroes;

import java.util.Random;
import java.util.Scanner;

public class SelectHero {

    public YourStat selectHero (YourStat yourStat) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input){
            case 1:
                yourStat = pickedHero();
                break;
            case 2:
                yourStat = randomHero();
                break;
            default:
                System.out.println("Please select 1 or 2");
                break;
        }
        return yourStat;
    }

    public YourStat pickedHero(){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Chinchilla chinchilla = new Chinchilla();
        YourStat yourStat = new YourStat();

        System.out.println("The heroes are: \n" + cat.toString() + "\n" + dog.toString()+ "\n" + chinchilla.toString());
        System.out.println("Who is your Hero?");
        System.out.println("Cat (1)" + "\n" + "Dog (2)" + "\n" + "Chinchilla (3)");


        Scanner scan = new Scanner(System.in);
        int hero = scan.nextInt();

        switch (hero) {
            case 1:
                yourStat.setName(cat.getName());
                yourStat.setHelth(cat.getHelth());
                yourStat.setStrength(cat.getStrength());
                yourStat.setAgility(cat.getAgility());
                yourStat.setArmor(cat.getArmor());
                yourStat.setLuck(cat.getLuck());
                break;
            case 2:
                yourStat.setName(dog.getName());
                yourStat.setHelth(dog.getHelth());
                yourStat.setStrength(dog.getStrength());
                yourStat.setAgility(dog.getAgility());
                yourStat.setArmor(dog.getArmor());
                yourStat.setLuck(dog.getLuck());
                break;
            case 3:
                yourStat.setName(chinchilla.getName());
                yourStat.setHelth(chinchilla.getHelth());
                yourStat.setStrength(chinchilla.getStrength());
                yourStat.setAgility(chinchilla.getAgility());
                yourStat.setArmor(chinchilla.getArmor());
                yourStat.setLuck(chinchilla.getLuck());
                break;
            default:
                System.out.println("No hero was choose");
                pickedHero();
                break;
        }

       return yourStat;
    }

    public YourStat randomHero(){

        Random rand = new Random();
        int randHero = rand.nextInt(2) + 1;
        YourStat yourStat = new YourStat();

        switch (randHero) {
            case 1:
                Cat cat = new Cat();
                System.out.println(cat.toString());
                yourStat.setName(cat.getName());
                yourStat.setHelth(cat.getHelth());
                yourStat.setStrength(cat.getStrength());
                yourStat.setAgility(cat.getAgility());
                yourStat.setArmor(cat.getArmor());
                yourStat.setLuck(cat.getLuck());
                break;
            case 2:
                Dog dog = new Dog();
                System.out.println(dog.toString());
                yourStat.setName(dog.getName());
                yourStat.setHelth(dog.getHelth());
                yourStat.setStrength(dog.getStrength());
                yourStat.setAgility(dog.getAgility());
                yourStat.setArmor(dog.getArmor());
                yourStat.setLuck(dog.getLuck());
                break;
            case 3:
                Chinchilla chinchilla = new Chinchilla();
                System.out.println(chinchilla.toString());
                yourStat.setName(chinchilla.getName());
                yourStat.setHelth(chinchilla.getHelth());
                yourStat.setStrength(chinchilla.getStrength());
                yourStat.setAgility(chinchilla.getAgility());
                yourStat.setArmor(chinchilla.getArmor());
                yourStat.setLuck(chinchilla.getLuck());
                break;
        }

        return yourStat;
    }
}

