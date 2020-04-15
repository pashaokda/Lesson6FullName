package com.company;

public class Main {

    private String firstName;
    private String middleName;
    private String lastName;

    public Main(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        return new StringBuilder().append("Имя студента ").append(lastName).append(" ")
                .append(firstName).append(" ").append(middleName).append(".").toString();

    }
}
