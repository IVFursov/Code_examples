package com.company.homework2;

public class Rabbit extends Animals {
    @Override
    public String say(){
        String voice = getName() + ": ";
        if (feeding) {
            sleeping = false;
            System.out.println(getName() + " сейчас ест");
            return voice;
        } else if (sleeping){
            System.out.println(getName() + " сейчас спит");
        }
        if (!sleeping) {
            return voice;
        }
        return "";
    }

}


