package com.sapiens.springDemo.SetterDI;

public class ActiveMQMessaging implements  Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending Active message Service");
    }
}
