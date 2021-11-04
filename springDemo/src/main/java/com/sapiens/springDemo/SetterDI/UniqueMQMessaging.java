package com.sapiens.springDemo.SetterDI;

public class UniqueMQMessaging implements  Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending Unique message Service");
    }
}
