public class WeeklySalary
{
    public static int calculate(int[] hours)
    {
        int salary =0;

        for (int i=0; i<hours.length; i++)
        {
            int salaryPerDay =getSalaryFromDay(hours[i],i);
            if (i<=4)
            {
                salary=salary+salaryPerDay;
            }
            else
            {
                salaryPerDay= salaryPerDay*2;
                salary = salary+salaryPerDay;
            }
        }
        return salary;
    }


    private static int getSalaryFromDay (int hoursInOneDay, int salaryPerDay )
    {

        if (hoursInOneDay<=8)
        {

            salaryPerDay=hoursInOneDay*10;
        }
        else
        {
            int additionalHours=hoursInOneDay-8;
            int additionalHoursSalary = additionalHours*15;
            salaryPerDay =80+additionalHoursSalary;
        }


        return salaryPerDay;
    }
}






    /*public static int calculate(int[] hours) {

            int res = 0;
            for (int i = 0; i < hours.length; i++) {
                int hour = hours[i];
                int  money = hour > 8 ? ((hour - 8) * 15 + 80) : hour * 10;

                if (i >= 5) {
                    money *= 2;
                }
                res += money;
            }
            return res;
        }




    private static int getSalaryFromDay(int hoursInOneDay) {
        int salaryPerDay;

        if (hoursInOneDay <= 8) {
            salaryPerDay = hoursInOneDay * 10;
        }
        if (hoursInOneDay > 8)
        {
            int additionalHours = hoursInOneDay - 8;
            int additionalHoursSalary = additionalHours * 15;
            salaryPerDay = 8 * 10 + additionalHoursSalary;
        }
        else return salaryPerDay;

    }

}*/





    /*public static int calculate(int[] hours)
{
    hours = new int [7];

    int s;

    if (int i<=4)
    {

        if (hours <= 8)
        {
            return s = hours  * 10;
        }

        if (hours> 8)
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

        if (hours> 8)
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
}


package ru.job4j.condition;

public class WeeklySalary
{
    public static int calculate(int[] hours)
   {

      int salary =0;

      for ( int i=0; i = hours.length; i++)
      {
        int salaryPerDay = int getSalaryPerDay(hours [i];i);
     		if (i<=1)
                 {
                   salary=salary+salaryPerDay;
                 }
                 else
                            {
                              salaryPerDay= salaryPerDay*2;
                              salary = salary+salaryPerDay;
                            }
        }
  }


      private static getSalaryPerDay (int hoursPerDay)
      {
        int salaryPerDay;
       	if (int hoursInOneDay<=8){
         salaryPerDay=hoursPerDay*10;
        }
        if (8<hoursInOneDay<24)
        {
          int additionalHours=hoursInOneDay-8;
          int additionalHoursSalary = additionalHours*15;
          salaryPerDay =8*10+additionalHoursSalary;
        }
        else return salaryPerDay;

      }

     */
