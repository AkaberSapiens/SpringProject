package com.sapiens.springDemo.SetterDI;

public class DynamicMQMessaging implements  Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending Dynamic message Service");
    }
}
