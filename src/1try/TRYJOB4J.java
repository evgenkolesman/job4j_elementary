public class TRYJOB4J {
    public static void main(String[] args) {

        weekHours[] week = new weekHours[7];

        for (weekHours i : week)
         i.weekHours (7);

        for (weekHours i : week)
            System.out.println(x.weekHours());
    }
}
class weekHours {
    int h;
    int s;
    int n;

    public boolean weekHours(int x) {
        if (n <= 5) {

            if (h <= 8) {
                s = h * 10;
            }
            if (h > 8) {
                s = h * 10 + (h - 8) * 15;
            }
        }

        else if (h <= 8)
        {
            {
                s = h * 10 * 2;
            }
            if (h > 8) {
                s = (h * 10 + (h - 8) * 15) * 2;
            }
        }
    return x;
    }
}
/*package ru.job4j.condition;

public class WeeklySalary
{
    public static int calculate(int[] hours)
   {
      hours = new int [7];
      int s;
      if (i<=4)
      {

        if (hours <= 8)
        {
                return s = hours  * 10;
        }

        if (h > 8)
        {
                return s = hours  * 10 + (hours  - 8) * 15;
         }

       }

        if (i>4)
        {
          if (hours  <= 8)
          {
            return s = hours  * 10 * 2;
            }

            if (hours > 8)
            {
                return s = (hours  * 10 + (hours  - 8) * 15) * 2;
            }

        }

      return 0;
    }
}*/