import java.util.*; // Эта программа демонстрирует консольный ввод


public class Try5 {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        // получить первую вводимую строку
        System.out.println("Как тебя зовут?");
        String name = in.nextLine();
        //получить вторую строку
        System.out.println("Сколько тебе лет?");
        int age = in.nextInt();
        //Вывести результат на консоль
        System.out.println(
                "Привет, " + name + ". В следующем году тебе будет " + (age + 1));



        // округление 8 целых, 2 после запятой
        //double x = 10000.0/3.0;
        //System.out.printf("%8.2,",x); другой метод того же, но добавляем с флагами отделения тысяч
        System.out.printf("%,.2f", 10000.0 / 3.0);

        System.out.printf("%1$s %2$s %2$te, %2$tY", "Текущая дата", new Date());// текущая дата
    }

}
