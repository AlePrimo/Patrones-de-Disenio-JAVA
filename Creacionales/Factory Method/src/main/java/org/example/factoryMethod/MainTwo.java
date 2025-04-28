package org.example.factoryMethod;

import org.example.factoryMethod.factory.MotorCycleFactory;
import org.example.factoryMethod.factory.PlaneFactory;
import org.example.factoryMethod.factory.TruckFactory;
import org.example.factoryMethod.models.Plane;


public class MainTwo {

    public static void main(String[] args) {



        Vehicle moto = new MotorCycleFactory().createVehicle();

        moto.start();

        // NUEVAMENTE SI TENEMOS UNA SUBCLASES CON METODOS EXCLUSIVOS DE LA MISMA DEBEMOS INSTANCIARLA COMO TAL Y CASTEAR LO QUE DEVUELVE EL METODO CREATE
        Plane plane = (Plane) new PlaneFactory().createVehicle();

        plane.fly();

        Vehicle camion = new TruckFactory().createVehicle();

        camion.stop();









    }
}
