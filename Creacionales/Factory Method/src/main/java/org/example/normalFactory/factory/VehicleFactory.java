package org.example.normalFactory.factory;

import org.example.normalFactory.Vehicle;
import org.example.normalFactory.models.Car;
import org.example.normalFactory.models.MotorCycle;
import org.example.normalFactory.models.Plane;
import org.example.normalFactory.models.Truck;

public class VehicleFactory {


    public Vehicle createVehicle(String typeOfVehicle){

        if(typeOfVehicle.equalsIgnoreCase("car")){
            return new Car();
        }

        if ((typeOfVehicle.equalsIgnoreCase("MotorCycle"))){
            return new MotorCycle();
        }


        if (typeOfVehicle.equalsIgnoreCase("Truck")){
            return new Truck();
        }

        if (typeOfVehicle.equalsIgnoreCase("Plane")){
            return new Plane();
        }


        return  null;
    }




}
