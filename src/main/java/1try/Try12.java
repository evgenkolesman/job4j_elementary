// в этой программе демонстрируется  передача параметров в Java

public class Try12 {
    public  static void main (String[] args)
    {
        //Тест 1: методы не могут видоизменять числовые параметры
        System.out.println("Тестируем утроение значения: ");
        double percent = 10;
        System.out.println( "До : процент =" + percent);
        tripleValue (percent);
        System.out.println("После: процент = " + percent);

        // Тест 2 : методы могут изменять состояние объектов, передаваемых в качестве параметров
        System.out.println("\nTesting тройное Значение:");
        Employee2 harry = new Employee2 ("Harry", 50000);
        System.out.println("До : значение =" + harry.getSalary());
        tripleSalary (harry);
        System.out.println("После: значение = "+ harry.getSalary());

        //Тест 3: методы не могут присоединять новые объекты к объектным параметрам
        System.out.println("\nTesting swap: ");
        Employee2 a= new Employee2 ("Alice", 70000);
        Employee2 b = new Employee2 ("Bob", 60000);
        System.out.println("До : " + a.getName ());
        System.out.println("До : " + b.getName ());
        swap (a,b);
        System.out.println("После: " + a.getName ());
        System.out.println("После: " + b.getName ());
    }
    public static void tripleValue (double x) // не сработает
    {
        x= x*3;
        System.out.println("Завершение метода: x = "+ x);
    }
    public static void tripleSalary (Employee2 x ) // сработает
    {
        x.raiseSalary(200);
        System.out.println("Завершение метода: x = " +x.getSalary ());
    }
    public static void swap (Employee2 x, Employee2 y)
    {
        Employee2 temp = x;
        x=y;
        y= temp;
        System.out.println(" Завершение метода: x = "+x.getName ());
        System.out.println ("Завершение метода: y = " + y.getName ());
    }
}
class Employee2
{
    private String name;
    private double salary;

    public Employee2 (String n, double s)
    {
        name = n;
        salary = s;
    }
    public String getName ()
    {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary (double byPercent)
    {
        double raise = salary*byPercent/100;
        salary +=raise;
    }
}