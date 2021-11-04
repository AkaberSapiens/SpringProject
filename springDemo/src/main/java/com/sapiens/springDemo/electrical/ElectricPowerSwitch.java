package com.sapiens.springDemo.electrical;

public class ElectricPowerSwitch implements Switch{

    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = true;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }
    }

    public static void main(String[] args) {
        Switchable switchableTV = new TV();
        Switch tvPowerSwitch = new ElectricPowerSwitch(switchableTV);
        tvPowerSwitch.press();
        tvPowerSwitch.press();

        Switchable switchableRefrigerator = new Refrigerator();
        Switch refrigeratorPowerSwitch = new ElectricPowerSwitch(switchableRefrigerator);
        refrigeratorPowerSwitch.press();
        refrigeratorPowerSwitch.press();

        Switchable switchableCooler = new Cooler();
        Switch coolerPowerSwitch = new ElectricPowerSwitch(switchableCooler);
        coolerPowerSwitch.press();
        coolerPowerSwitch.press();

        Switchable switchableAC = new AC();
        Switch ACPowerSwitch = new ElectricPowerSwitch(switchableAC);
        ACPowerSwitch.press();
        ACPowerSwitch.press();

        Switchable switchableLight = new Light();
        Switch lightPowerSwitch = new ElectricPowerSwitch(switchableLight);
        lightPowerSwitch.press();
        lightPowerSwitch.press();


    }

}
