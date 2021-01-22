package lambda;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer ;

//Применение лямбда-выражений

public class LambdaTest
{
    public static void main (String[] args)
    {
        String [] planets = { "Меркурий", "Венера", "Земля",
                "Марс", "Юпитер", "Сатурн", "Уран","Плутон"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Отсортированно в афавитной последовательности:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Отсортировано по длине: ");
        Arrays.sort(planets, (first, second) -> first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer t= new Timer(1000, event ->
                System.out.println("Время: "+ new Date()));
        t.start();
        //выполнять программу до тех пор пока пользовательне кликнет "ОК"
        JOptionPane.showMessageDialog(null, "Покинуть программу?");
        System.exit(0);

    }
}
