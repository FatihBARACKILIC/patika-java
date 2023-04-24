public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000)
            return this.salary * .03;
        return 0;
    }

    public double bonus() {
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        return 0;
    }


    public double raiseSalary() {
        if (this.hireYear > 2012)
            return this.salary * .05;
        else if (this.hireYear > 2007)
            return this.salary * .1;
        else
            return this.salary * .15;
    }

    public String toString() {
        String employeeInfo = "";
        double tax = this.tax();
        double bonus = this.bonus();
        double raisedSalary = this.raiseSalary();
        employeeInfo += "Name: " + this.name + "\n";
        employeeInfo += "Salary: " + this.salary + "₺\n";
        employeeInfo += "Work Hours: " + this.workHours + "\n";
        employeeInfo += "Hire Year: " + this.hireYear + "\n";
        employeeInfo += "Tax: " + tax + "₺\n";
        employeeInfo += "Bonus: " + bonus + "₺\n";
        employeeInfo += "Salary Raise: " + raisedSalary + "₺\n";
        employeeInfo += "Salary with Tax and Bonus: " + (this.salary - tax + bonus) + "₺\n";
        employeeInfo += "Total Salary: " + (this.salary + raisedSalary + "₺");
        return employeeInfo;
    }

}
