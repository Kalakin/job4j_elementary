package ru.job4j.checkstyle;

public class Broken {
    private int size = 10;

    String name;

    public String surname;

    public static final String NEWVALUE = "";

    Broken() { }

    void echo() { }

    void method(int a, int b, int c) {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}