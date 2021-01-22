public class Main  {

    public static void main(String[] args) {
        int salary = 0;
        int[] hours = {8, 8, 8, 10, 10, 8, 10};

        for (int i = 0; i < hours.length; i++) {
            int salaryPerDay = gefSalaryFromDay1(hours[i], i);
            if(i <= 4) {
                salary = salary + salaryPerDay;
            } else {
                //В выходные двойния оплата
                salaryPerDay = 2*salaryPerDay;
                salary = salary + salaryPerDay;
            }

            //В массиве счет идет с 0, а дни недели считаются с 1, поэтому добавляем ко дню недели 1
            int dayOfWeek = i + 1;
            System.out.println("Зарплата для дня номером \"" + dayOfWeek + "\" составила " + salaryPerDay + " dollars");

        }

        System.out.println("Зарплата за все дни составила \"" + salary + "\"  dollars");
    }

    private static int gefSalaryFromDay1(int hoursInOneDay, int numberOfDay) {
        int salaryPerDay;
        if(hoursInOneDay <= 8) {
            salaryPerDay = 8 * 10;
        } else if(hoursInOneDay > 24) {
            System.out.println("Для дня с номером \"" + numberOfDay + "\" указано количество часов, более 24, считаем как 24 часа");
            salaryPerDay = 8*10 + 16*15;
        } else {
            int additionalHours = hoursInOneDay - 8;
            int additionalHoursSalary = additionalHours*15;
            salaryPerDay = 8*10 + additionalHoursSalary;
        }

        return salaryPerDay;
    }
}

