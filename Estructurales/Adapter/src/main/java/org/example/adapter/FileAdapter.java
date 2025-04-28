package org.example.adapter;

import org.example.model.Person;

import java.io.InputStream;
import java.util.List;

public class FileAdapter {

    // ESTA CLASE RECIBE UN OBJETO DEL TIPO INPUTFILE QUE ES LA INTERFAZ QUE CONTIENE EL METODO PARA LEER CUALQUIER TIPO DE ARCHIVO

    private InputFile inputFile;

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }


    //ESTE METODO RECIBE COMO PARAMETRO UN ARCHIVO CUALQUIERA Y LLAMA AL METODO DE LECTURA DEL OBJETO INTERFAZ INPUTFILE
    public List<Person> readFile(InputStream inputStream){
        return inputFile.readFile(inputStream);
    }







}
