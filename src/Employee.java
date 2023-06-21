public class Employee {
    private String fullName;
    private int department;
    private double salary;
    static int counter = 1;
    private int id;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public String toString() {
        return "Id " + this.id + " Имя  " + this.fullName + " Отдел " + this.department + " Заработная плата " + this.salary;
    }
}


