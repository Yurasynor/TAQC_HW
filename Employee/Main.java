package Employee;

import Employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Yuriy", 1, 2000);
        employees[1] = new ContractEmployee("Igor", 500, 2, 2);
        employees[2] = new SalariedEmployee("Ivan", 1, 1000);
        employees[3] = new ContractEmployee("Petro", 300, 4, 1);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        Employee.sortEmployees(employees);
    }

}