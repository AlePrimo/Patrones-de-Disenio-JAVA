package com.builder.domain;

public class Contact {

    private String contactName;
    private Phone contactPhone;
    private Adress contactAdress;


    public Contact() {
    }

    public Contact(String contactName, Phone contactPhone, Adress contactAdress) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactAdress = contactAdress;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Phone getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(Phone contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Adress getContactAdress() {
        return contactAdress;
    }

    public void setContactAdress(Adress contactAdress) {
        this.contactAdress = contactAdress;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "contactName='" + contactName + '\'' +
                ", contactPhone=" + contactPhone +
                ", contactAdress=" + contactAdress +
                '}';
    }



}
