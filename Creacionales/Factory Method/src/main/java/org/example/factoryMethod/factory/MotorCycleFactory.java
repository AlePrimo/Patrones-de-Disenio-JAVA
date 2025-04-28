package org.example.factoryMethod.factory;

import org.example.factoryMethod.Vehicle;
import org.example.factoryMethod.models.MotorCycle;

public class MotorCycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
}
