package com.builder;


import com.builder.domain.Adress;
import com.builder.domain.Employee;
import com.builder.domain.Phone;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee.EmployeeBuilder()
                .setName("Pepe")
                .setAge(24)
                .setGender("binario")
                .setAdress("Coco 1234","paponia","culete","cp1406")
                .setPhones("11654897","4521","movil")
                .setContacts("tio juan",
                        new Phone("254897","456","fijo"),
                        new Adress("portela 724","bs as","argentina","25417"))
                .build();


        System.out.println(employee);








    }










}