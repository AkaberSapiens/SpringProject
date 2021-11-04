package com.sapiens.springDemo.electrical;

public class Light implements  Switchable{
    @Override
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off");
    }
}
