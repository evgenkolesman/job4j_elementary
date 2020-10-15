import java.util.Scanner;

public class Try6 {                            // Пенсия retirement
    public static void main (String[] args) {
        // прочитать вводные данные
        Scanner in = new Scanner (System.in);
        System.out.print ("Сколько надо денег для пенсии?");
        double goal = in.nextDouble();
        System.out.print(
                "Сколько денег ты вносишь каждый день?");
        double payment = in.nextDouble();
        System.out.print(
                "Процентная ставка %?");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        // обновить остаток на счету
        // пока не достигнута заданная сумма

        while (balance < goal){
         //добавить ежегодный взнос и проценты
        balance += payment;
        double interest = balance*interestRate/100;
        balance += interest;
        years++;
        }
        System.out.println("Можно уйти на пенсию в "+years+" лет." );
    }
}
