package ru.job4j;
public class FIT {
    public static double manWeight(short height) {
        double rsl = ((height-100)*1.15);
        return rsl;
    }
    public static double womanWeight(short height) {
        double rsl = ((height-110)*1.15);
        return rsl;
    }
    public static void main(String[] args) {
        short height = 187;
        double man = FIT.manWeight(height);
        System.out.println("Man 187 is " + man);
    }

}
