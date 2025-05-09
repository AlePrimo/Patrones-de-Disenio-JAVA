package org.example.adapter;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.model.Person;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileAdapter implements InputFile{

//PARA PODER TRABAJAR CON ARCHIVOS EXCEL ES NECESARIO DESCARGAR EN EL POM LA DEPENDENCIA DE APACHE POI
// Y ASI PODER UTILIZAR LAS CLASES DE ESA DEPENDENCIA CON SUS METODOS

    @Override
    public List<Person> readFile(InputStream inputStream) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheetAt(0);
            List<Person> people = new ArrayList<>();

            for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){
                Row row = sheet.getRow(i);
                int cell = row.getFirstCellNum();

               Person person = new Person();
               person.setName(String.valueOf(row.getCell(cell)));
               person.setLastName(String.valueOf(row.getCell(++cell)));
               person.setAge( (int) row.getCell(++cell).getNumericCellValue());

               people.add(person);

            }

            workbook.close();
            return people;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }





}
