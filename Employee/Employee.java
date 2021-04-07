package Employee;

public abstract class Employee implements CalculatePay {

    int id = 0;
    private String name;
    static int idCounter;

    public Employee(String name) {

        this.name = name;
        idCounter++;
        id = idCounter;
    }

    public static void sortEmployees(Employee[] employees) {
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    tmp = employees[i];

                    employees[i] = employees[j];

                    employees[j] = tmp;
                }
            }
        }
        System.out.println("Sorted employees in descending:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "[id = " + id + ", name=" + name + ",salary =" + calculatePay() + "]";
    }

}