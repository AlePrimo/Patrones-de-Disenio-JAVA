package com.builder.domain;

public class Adress {

    private String direction;
    private String city;
    private String country;
    private String postalCode;

    public Adress() {
    }

    public Adress(String direction, String city, String country, String postalCode) {
        this.direction = direction;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    @Override
    public String toString() {
        return "Adress{" +
                "direction='" + direction + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }



}
