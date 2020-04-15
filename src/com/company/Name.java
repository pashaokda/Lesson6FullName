package com.company;

public class Name {
    public static void main(String[] args) {
        Main student = new Main("Шевелев", "Павел", "Сергеевич");
        String fullName = student.getFullName();
        System.out.println(fullName);
    }
}