package com.sapiens.springDemo.SetterDI;

public class StaticMQMessaging implements Messaging {
    @Override
    public void sendMessage() {
        System.out.println("Sending Static message Service");
    }

}
