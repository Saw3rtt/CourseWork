public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Employee employee1 = new Employee("Мишин Богдан Антонович", 1, 250);
        Employee employee2 = new Employee("Чернов Федор Гордеевич", 4, 450);
        Employee employee3 = new Employee("Лаврентьев Севастьян Даниилович", 3, 870);
        Employee employee4 = new Employee("Быков Владимир Евсеевич", 2, 960);
        Employee employee5 = new Employee("Сидоров Владимир Тимурович", 5, 1500);
        Employee employee6 = new Employee("Логинов Нелли Егорович", 3, 1100);
        Employee employee7 = new Employee("Стрелков Аввакуум Геннадиевич", 4, 1000);
        Employee employee8 = new Employee("Беляев Оскар Владленович", 2, 900);
        Employee employee9 = new Employee("Исаев Лаврентий Демьянович", 5, 700);
        Employee employee10 = new Employee("Егоров Юстиниан Альбертович", 1, 650);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;
        //вывод всех работников
        showEmployees(employees);

        double sum = getSalarySum(employees);
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum);

        Employee max = getMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + max.getFullName());

        Employee min = getMinSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + min.getFullName());

        double average = getAverageSalary(employees);
        System.out.println("Среднее значение зарплат = " + average);

        showFullNames(employees);
    }

    public static void showEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double getSalarySum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary(Employee[] employees) {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public static Employee getMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public static double getAverageSalary(Employee[] employees) {
        double sum = getSalarySum(employees);
        return sum / employees.length;
    }

    public static void showFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("ФИО : " + employee.getFullName());
        }
    }
}

