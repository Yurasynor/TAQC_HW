package Number;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // first task

        System.out.println("Task 1");

        System.out.println("Enter first number");
        float f1 = scanner.nextFloat();
        System.out.println("Enter second number");
        float f2 = scanner.nextFloat();
        System.out.println("Enter third number");
        float f3 = scanner.nextFloat();

        Number numbers1 = new Number(f1, f2, f3);

        numbers1.numberInRange(f1);
        numbers1.numberInRange(f2);
        numbers1.numberInRange(f3);

        // second task
        System.out.println("Task 2");

        System.out.println("Enter first number");
        float n1 = scanner.nextInt();
        System.out.println("Enter second number");
        float n2 = scanner.nextInt();
        System.out.println("Enter third number");
        float n3 = scanner.nextInt();

        Number numbers2 = new Number(n1, n2, n3);

        numbers2.max();

        numbers2.min();

        // Error

        System.out.println("Task 3");

        Number numbers3 = new Number();
        numbers3.errorNumber();
    }
}

