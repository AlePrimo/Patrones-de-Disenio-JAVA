package org.example.adapter;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.example.model.Person;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class CsvFileAdapter implements InputFile{

    //PARA PODER TRABAJAR CON ARCHIVOS DE TEXTO CSV HAY QUE DESCARGAR LA DEPENDENCIA "OPENCSV"


    @Override
    public List<Person> readFile(InputStream inputStream) {


        Reader reader = new InputStreamReader(inputStream);

        ColumnPositionMappingStrategy<Person> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Person.class);
        strategy.setColumnMapping("name","lastName","age");

        CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
                .withMappingStrategy(strategy)
                .withType(Person.class)
                .withSeparator(';')
                .withSkipLines(1)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<Person> personList = csvToBean.parse();
        return personList;




    }




}
