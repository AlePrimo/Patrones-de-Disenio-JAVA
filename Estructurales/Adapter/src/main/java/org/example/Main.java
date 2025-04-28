package org.example;

import org.example.adapter.*;
import org.example.model.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {


    // AQUI DEFINIMOS LA RUTA (PATH) DONDE VA A ESTAR EL ARCHIVO A LEER , EL FILE.SEPARATOR EQUIVALDRIA A UN BARRA INCLINADA O SLASH PERO
    // LA DIFERENCIA ES QUE SIRVE PARA CUALQUIER SISTEMA OPERATIVO

    private static final String path =
                    "src" + File.separator +
                    "main" + File.separator +
                    "resources" + File.separator +
                    "files" + File.separator;


    public static void main(String[] args) throws FileNotFoundException {

      // READ EXCELL

//        InputFile excellFileAdapter = new ExcelFileAdapter();  //Instanciamos el adaptador para leer archivos excell
//        FileAdapter fileAdapter = new FileAdapter(excellFileAdapter);  //Instanciamos el objeto que contiene el metodo para leer archivos
//        InputStream inputStream = new FileInputStream(path + "Book 1.xlsx" ); //Creamos el archivo de entrada
//        List<Person> people = fileAdapter.readFile(inputStream); //LLamamos al metodo que lee los archivos

       // System.out.println(people);

        //READ CSV

//        InputFile csvFileAdapter = new CsvFileAdapter();
//        FileAdapter fileAdapter1 = new FileAdapter(csvFileAdapter);
//        InputStream inputStream1 = new FileInputStream(path + "archivoCSV.txt");
//        List<Person> personList = fileAdapter1.readFile(inputStream1);
//
//        System.out.println(personList);


        //READ JSON

        InputFile jsonFileAdapter = new JsonFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(jsonFileAdapter);
        InputStream inputStream = new FileInputStream(path + "JsonFile.json");
        List<Person> people = fileAdapter.readFile(inputStream);

        System.out.println(people);




    }
}