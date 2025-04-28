package org.example.normalFactory;


import org.example.normalFactory.factory.VehicleFactory;
import org.example.normalFactory.models.Car;

import org.example.normalFactory.models.Plane;

public class Main {
    public static void main(String[] args) {


        //INSTANCIAMOS UN OBJETO DE TIPO FACTORY
        VehicleFactory vehicleFactory = new VehicleFactory();


        // A PARTIR DE ESE OBJETO FACTORY PODEMOS CREAR OBJETOS DE TIPO VEHICLE QUE SEGUN EL PARAMETRO QUE LE DEMOS AL METODO CREATE
        // IMPLEMENTARAN LOS METODOS SEGUN EL COMPORTAMIENTO DE CADA SUBCLASE (CAR, TRUCK , MOTORCYCLE ETC).
        //OJO!!!! NO SE IMPLEMENTARAN LOS METODOS QUE SEAN ESPECIFICOS DE UNA SUBCLASE EN PARTICULAR A NO SER QUE HAGAMOS EL CASTEO DE
        // LA CLASE GENERICA VEHICLE  A LA SUBCLASE ESPECIFICA DEL OBJETO QUE QUEREMOS CREAR.


         // EN ESTE CASO CASTEAMOS A CAR EL OBJETO VEHICLE QUE DEVUELVE EL METODO CREATE
        Car autito = (Car) vehicleFactory.createVehicle("car");

        autito.start();



        Vehicle moto = vehicleFactory.createVehicle("MOTORCYCLE");

        moto.stop();

        // IMPORTANTE!!!  SI NOSOTROS CREAMOS UN OBJETO GENERICO VEHICLE CON EL METODO CREATE , SOLO PODREMOS ACCEDER A LOS METODOS QUE SEAN DE ESA CLASE
        // SI LAS SUBCLASES TIENEN METODOS PROPIOS NO PODREMOS ACCEDER A ELLAS , POR LO TANTO SI QUEREMOS EVITAR ERRORES DEBERIAMOS ESPECIFICAR EL TIPO DE SUBCLASE
        // Y LUEGO HACER EL CASTEO

        Plane avion = (Plane) vehicleFactory.createVehicle("Plane");

        avion.fly();










    }
}