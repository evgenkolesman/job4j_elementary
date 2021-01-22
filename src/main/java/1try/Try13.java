import java.util.*;
// Конструирование объектов
public class Try13 {
    public static void main(String[] args) {
        // заполнить массив staff тремя объектами типа Employee
        Employee3[] staff = new Employee3[3];
        staff[0] = new Employee3("Harry", 40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();

    // вывести данные обо всех объектах типа Employee
    for(    Employee3 e :staff)
            System.out.println("Имя ="+e.getName()+", Id = "
            + e.getId ()+", значение ="+e.getSalary());
    }
}
final class Employee3
{
    private  static int nextId;
    private  static int id;
    private String name = " ";// инициализация поля экземпляра
    private  double salary;

    // статический блок инициализация
    static
    {
        Random generator = new Random ();
        // задать произвольное значение 0-999 в поле nextId
        nextId = generator.nextInt(10000);

    }
    //блок инициализации объекта
    {
        id = nextId;
        nextId++;
    }
    // три перегружаемых конструктора
    public Employee3 ( String n, double s)
    {
        name= n;
        salary = s;
    }
    public Employee3 (double s)
    {
        //вызвать конструктор Employee (String, double)
        this ("Employee3 #" + nextId,s);
    }
    // конструктор без аргументов
    public Employee3 ()
    {
        //поле name инициализируется пустой строкой ""
        // поле salary не объявляется, а ему присваивается ноль
        // поле id объявлется в блоке инициализации
    }
    public String getName()
    {
        return  name;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getId ()
    {
        return id;
    }

}
