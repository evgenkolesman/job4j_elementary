import projects.job4j_elementary.src.1try.Try10.* ; //импортируем класс Employee 3;
import static java.lang.System.*;

public class Try14 {
    public static void main (String []args)
    {
        //вводим импортируемый класс без полного имени
        Employee harry = new Employee("Harry Hacker", 50000,1989,10,1);
        harry.raiseSallary (5);
        // здесь не нужно писать полное System.out так как используется оператор static.import
        out.println ("Имя = " + harry.getName() + ",значение = " + harry.getSalary());
    }
}
