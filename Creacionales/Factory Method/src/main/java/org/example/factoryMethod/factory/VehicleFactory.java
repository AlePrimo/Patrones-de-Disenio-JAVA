package org.example.factoryMethod.factory;

import org.example.factoryMethod.Vehicle;

public abstract class VehicleFactory {
    //ESTA CLASE ABSTRACTA NO SE PUEDE INSTANCIAR POR LO QUE
    // OBLIGA A CREAR SUBCLASES FACTORY QUE HEREDEN DE ELLA  PARA CADA TIPO DE SUBCLASE
    //DIFERENTE (CarFactory etc etc)


    public abstract Vehicle createVehicle();




}
