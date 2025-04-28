package org.singleton;




public class Main {
    public static void main(String[] args) {


        DataBaseConnector dataBaseConnector = DataBaseConnector.getInstance();

        System.out.println("dataBaseConnector = " + dataBaseConnector);


        //  AUNQUE VUELVA A CREAR UN OBJETO CON EL METODO GETINSTANCE , LO UNICO QUE VA A PASAR
        //ES QUE VAMOS A TENER DOS VARIABLES QUE APUNTEN AL MISMO OBJETO EN MEMORIA
        DataBaseConnector dataBaseConnector1 = DataBaseConnector.getInstance();
        System.out.println("dataBaseConnector1 = " + dataBaseConnector1);
        

        //AUNQUE LLAMEMOS AL METODO CONNECTDATABASE DESDE DISTINTAS VARIABLES SIEMPRE
        // VAN A APUNTAR AL MISMO OBJETO

        dataBaseConnector.connectDataBase();
        dataBaseConnector1.connectDataBase();



        }
    }
