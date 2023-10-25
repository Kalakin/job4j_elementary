package ru.job4j.checkstyle;

public class Broken {
    private int size = 10;

    public String surname;

    String name;

    Broken() { }

    void echo() { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c) {
    }

    public static final String NEWVALUE = "";
}