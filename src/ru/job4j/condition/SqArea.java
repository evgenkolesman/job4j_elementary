package ru.job4j.condition;
public class SqArea {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double square(int p, int k) {
    double rsl = p / Math.pow(2 * (k + 1), 2) * k;
    return rsl;
}
    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}

