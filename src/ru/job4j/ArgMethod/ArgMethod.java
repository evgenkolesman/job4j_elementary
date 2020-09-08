package ru.job4j.ArgMethod;
import static java.lang.System.*;
public class ArgMethod {
    public static int func1(int x) {
        int y = (x * x) + 1;
        return y;
    }
        public static void main(String[] args) {
            int result = ArgMethod.func1(100);
            System.out.println(result);
        }
    }