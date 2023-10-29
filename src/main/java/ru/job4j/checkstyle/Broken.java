package ru.job4j.checkstyle;

public class Broken {
    private int size = 10;

    private String name;

    private String surname;

    public static final String NEWVALUE = "";

    public Broken() { }

    public void echo() { }

    public void method(int a, int b, int c) {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}