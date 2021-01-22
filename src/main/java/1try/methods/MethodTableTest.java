package methods;
import java.lang.reflect.*;

/* В этой программе демонстрируется применение рефлексии
для вызова метода
 */

public class MethodTableTest
{
    public static void main (String [] args) throws Exception
    {
        // получить указатели на методы square (), sqrt()
        Method square =
                MethodTableTest.class.getMethod ("square", double.class);
        Method sqrt= Math.class.getMethod("sqrt", double.class);
        //вывести значения x и y в табличном виде

        printTable(1,10,10,square);
        printTable (1,10,10, sqrt);
    }
    /* возвращает квадрат числа
     @param x Число
     @return x Квадрат числа
     */
    public static double square ( double x)
    {
        return x*x;
    }
    /* Выводит в табличном виде значения x и y указанного метода
   @param Нижняя граница значения x
   @param Верхняя граница занчения x
   @param n Количество строк в таблице
   @param f Метод получающий и возвращаящий
   значения типа double
     */
    public static void printTable(double from, double to, int n, Method f)
    {
        // вывести сигнатуру методав в заголовке таблицы
        System.out.println(f);
        double dx =(to-from)/(n-1);
        for (double x = from; x<= to; x+=dx)
        {
            try
            {
                double y = (Double)f.invoke(null,x);
                System.out.printf("%10.4f | %10.4f%n", x,y);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

