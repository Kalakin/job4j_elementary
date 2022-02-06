package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 2;
        while (ivan * month > nik * month) {
            month--;
            ivan *= 3;
        }
        return month;
    }
}
