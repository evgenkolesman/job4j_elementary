package projects.job4j_elementary.src;
//классы из этого файла входят в указанный пакет
import java.time.*;
// операторы import следуют после оператора package
public class Try15 {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Try15(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
