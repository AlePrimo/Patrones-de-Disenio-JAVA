package org.example.adapter;

import org.example.model.Person;

import java.io.InputStream;
import java.util.List;

public interface InputFile {

    //INTERFAZ QUE RECIBE CUALQUIER TIPO DE ARCHIVO Y LO LEE A TRAVES DEL METODO READFILE
    List<Person> readFile(InputStream inputStream);


}
