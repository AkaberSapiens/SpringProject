package com.sapiens.springDemo.electrical;

public class Cooler implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Cooler is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Cooler is turned off");
    }
}
