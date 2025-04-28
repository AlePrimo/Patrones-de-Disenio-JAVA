package org.example.normalFactory.models;

import org.example.normalFactory.Vehicle;

public class MotorCycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("----> Run Moto");
    }

    @Override
    public void stop() {
        System.out.println("----> Stop Moto");
    }
}
