// в программе демнострируется статические методы

public class Try11 {
    public  static void main (String[]args)
    {
        //заполнить массив staff тремя объектами типа Employee
        Employee1 [] staff = new Employee1[3];

        staff [0] = new Employee1("Tom", 40000);
        staff [1] = new Employee1("Dick", 60000);
        staff [2] = new Employee1("Harry", 65000);
        // вывести данные обо всех объектах типа Employee
        for (Employee1 e:staff)
        {
            e.setId ();
            System.out.println ("Имя "+e.getName() + ",id = "
            + e.getId () + ",продажи = " + e.getSalary());
        }
        int n = Employee1.getNextId(); //вызвать статический метод
        System.out.println("Следующий доступный id =" + n);
    }
}
class Employee1
{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee1 (String n, double s){
        name = n;
        salary = s;
        id = 0;
    }
    public String getName ()
    {
        return  name;
    }
    public double getSalary ()
    {
        return salary;
    }
    public int getId ()
    {
     return id;
    }
    public void setId ()
    {
        id = nextId; // установить следующий доступный идентификатор
        nextId++;
    }
    public static int getNextId()
    {
        return nextId; //вщзвратить статической поле
    }
    public static void main (String [] args) {
        Employee1 e = new Employee1("Harry", 50000);
        System.out.println(e.getName()+ " " + e.getSalary());
    }
}