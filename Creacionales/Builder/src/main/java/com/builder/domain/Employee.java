package com.builder.domain;

import com.builder.IBuilder;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private Adress adress;
    private List<Phone> phones;
    private List<Contact> contacts;

    public Employee() {
    }

    public Employee(String name, int age,
                    String gender,
                    Adress adress,
                    List<Phone> phones,
                    List<Contact> contacts) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        this.phones = phones;
        this.contacts = contacts;
    }




    public static class EmployeeBuilder implements IBuilder {


        private String name;
        private int age;
        private String gender;
        private Adress adress;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAdress(Adress adress){
            this.adress = adress;
            return this;
        }

        public EmployeeBuilder setAdress(String direction, String city, String country, String postalCode){
            this.adress = new Adress(direction,city,country,postalCode);
            return this;
        }


        public EmployeeBuilder setPhones(Phone phone){
            this.phones.add(phone);
            return this;
        }

        public EmployeeBuilder setPhones(String phoneNumber, String extension,String phoneType ){
            this.phones.add(new Phone(phoneNumber, extension,phoneType));
            return this;
        }


        public EmployeeBuilder setContacts(Contact contact){
            this.contacts.add(contact);
            return this;
        }

        public EmployeeBuilder setContacts(String contactName, Phone contactPhone, Adress contactAdress){
            this.contacts.add(new Contact(contactName,contactPhone,contactAdress));
            return this;
        }


        @Override
        public Employee build() {

            return new Employee(name,age,gender,adress,phones,contacts);
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "\n, name='" + name + '\'' +
                "\n, age=" + age +
                "\n, gender='" + gender + '\'' +
                "\n, adress=" + adress +
                "\n, phones=" + phones +
                "\n, contacts=" + contacts +
                "}";
    }
}
