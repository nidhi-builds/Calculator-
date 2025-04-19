/*
Name: Nidhi Pandit
PRN: 23070126081
Batch: B1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        System.out.println("------ Welcome to Java Calculator ------");

        do {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result = " + add.addition(num1, num2));
                        break;

                    case 2:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result = " + subtract.sub(num1, num2));
                        break;

                    case 3:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result = " + multiply.mul(num1, num2));
                        break;

                    case 4:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result = " + division.divide(num1, num2));
                        break;

                    case 5:
                        System.out.print("Enter number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result = " + square.Square(num1));
                        break;

                    case 6:
                        System.out.print("Enter number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result = " + cube.Cube(num1));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result = " + squareRoot.sqrt(num1));
                        break;

                    case 8:
                        System.out.println("Exiting Calculator. Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);

        scanner.close();
    }
}
