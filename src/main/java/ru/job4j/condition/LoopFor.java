package ru.job4j.condition;

public class LoopFor {
    public static void main(String[] args) {
        int i;
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен:" + i);
    }
}

