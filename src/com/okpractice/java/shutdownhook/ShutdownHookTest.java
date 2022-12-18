package com.okpractice.java.shutdownhook;

import java.util.Date;

public class ShutdownHookTest {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.err.println("Exiting at "+ new Date());
            }
        });
        while(true){
            Thread.sleep(1000);
            i++;
            System.out.println("Counter value: "+i);
        }
    }
}
