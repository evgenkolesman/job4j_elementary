
package ru.job4j;
public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        int outt = Converter.rubleToDollar (in);
        boolean passed = expected == out;
        boolean passedd = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed + "Евро");
        System.out.println("140 rubles are 2. Test result : " + passedd + "Доллары");
    }
}
