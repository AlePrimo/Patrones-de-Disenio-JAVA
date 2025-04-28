package org.singleton;


/**
REGLAS PARA IMPLEMENTAR UN PATRON SINGLETON :

 1-Debemos tener un constructor vacio PRIVADO!!
 2-Debemos tener un atributo privado estatico
 3-Debemos tener un metodo estatico que devuelva la instancia
 */

public class DataBaseConnector {

    //ATRIBUTO PRIVADO Y ESTATICO
    private static DataBaseConnector dataBaseConnector;

    //CONSTRUCTOR PRIVADO VACIO QUE RESTRINGE LA CREACION DE OBJETOS
    private DataBaseConnector() {
        System.out.println("Creating object");
    }

    //METODO ESTATICO QUE DEVUELVE LA INSTANCIA DEL OBJETO
    public static synchronized DataBaseConnector getInstance(){ //EL SYNCHRONIZED ES PARA QUE SI TENEMOS
        //VARIOS HILOS EN NUESTRA APLICACION LLAMANDO AL METODO, SIGA CREANDOSE UNA SOLA INSTANCIA U OBJETO

        //VALIDAMOS QUE EL OBJETO NO EXISTA
        if(dataBaseConnector == null){
            dataBaseConnector = new DataBaseConnector(); //CREAMOS EL OBJETO SI NO EXISTE
            // SINO SALIMOS DEL IF Y LO RETORNAMOS DIRECTAMENTE
        }
        return dataBaseConnector; //RETORNAMOS EL OBJETO
    }



    public void connectDataBase(){
        System.out.println("Connecting database = " + dataBaseConnector);
    }

public void disconnectDataBase(){
    System.out.println("Disconnecting DataBase = " + dataBaseConnector);
}

}
