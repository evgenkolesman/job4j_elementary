import java.util.*;
//программа работы с массивами

public class Try7 {
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Сколько тебе надо ввести номеров?");
        int k= in.nextInt();
        System.out.print("Какое наиболее крупное занчение ты можешь записать?");
        int n = in.nextInt();

        //заполнить массив числами от 1,2,3...n
        int[] numbers =new int [n];
        for (int i=0; i< numbers.length; i++)
        numbers [i] = i+1;
        //выбрать k номеров и ввести их во второй массив;
        int result [] = new int [k];
        for (int i=0; i< result.length; i++)
        {
            //получить случайный индекс от 0 до n-1
            int r = (int) (Math.random() * n);
            //выбрать элемент из произвольного места,
            result [i] = numbers[n-1];
            n--;
        }
        //вывести отсортированный массив
        Arrays.sort(result);
        System.out.println(
                "Введи комбинацию! Станешь богатым!");
        for (int r : result)
            System.out.println(r);
    }
}
