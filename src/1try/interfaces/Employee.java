package interfaces;

public class Employee implements Comparable<Employee>
    {
    private String name;
    private double salary;
    public Employee (String name, double salary)
        {
        this.name = name;
        this.salary = salary;
        }
        public String getName()
        {
            return name;
        }
        public double getSalary()
        {
            return salary;
        }
        public void raiseSalary (double byPercent)
        {
            double raise = salary*byPercent/100;
            salary+=raise;
        }
        /** Сравнивает работников по зарплате"
         * @param other другой объетк типа Employee
         * @return отрицательное значениеб если зарплата данного
         * работника меньше чем у другоого работника;
         * нулевое значение если их зарплаты одинаковы;
         * а иначе положительное значение
         */
        public int compareTo (Employee other)
        {
            return Double.compare(salary, other.salary);
        }

        public void setHireDay(int i, int i1, int i2) {
        }
    }

