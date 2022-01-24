package ru.job4j.condition;

public class TrgArea { public static double area(double a, double b, double c) {
    double first = a + b + c;
    double second = first / 2;
    double three = second - a;
    double four = second - b;
    double five = second - c;
    double six = three * four * five;
    double seven = second * six;
    double eight = Math.sqrt(seven);
    return eight;
}

    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + rsl);
    }
}
