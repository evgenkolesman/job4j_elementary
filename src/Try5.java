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
                "Привет, " + name + ". В следующем году тебе будет " +(age+1));

    }
}
