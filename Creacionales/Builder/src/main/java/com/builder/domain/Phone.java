package com.builder.domain;

public class Phone {

    private String phoneNumber;
    private String extension;
    private String phoneType;


    public Phone() {
    }

    public Phone(String phoneNumber, String extension, String phoneType) {
        this.phoneNumber = phoneNumber;
        this.extension = extension;
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", extension='" + extension + '\'' +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }


}
