import java.util.*;

// do-while цикл демонстрация
public class Try6_1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько денег можно откладывать каждый год?");
        double payment = in.nextDouble();
        System.out.print("Процентаная ставка %?");
        double Rate = in.nextDouble();

        double balance = 0;
        int years =0;
        String input;
        //обновить остаток по счету пока,
        // работник не будет готов выйти на покой
        do {
            //добавить ежегодный взнос, проценты
            balance += payment;
            double interest = balance * Rate / 100;
            balance += interest;
            years++;
            //выводим текущий остаток по счету
            System.out.printf("После %d твои накопления составят %,.2f%n", years, balance);
            System.out.println("Вы готовы выйти на пенсию? Да (Y)/Нет(N)");
            input = in.next();
        }
        while (input.equals ("N"));

    }
}
