import java.util.Scanner;

public class Assigments_04 {
    // 4- Take in two numbers and an operator (Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        System.out.println("Input two number and choose an operator form (+, -, *, /) to perform calculation! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double Number1 = input.nextDouble();
        System.out.print("Enter the Second number: ");
        double Number2 = input.nextDouble();
        System.out.print("Choose an operator of +,-, *, or /: ");
        input.nextLine();
        String operator = input.nextLine();
        if (operator.equals("+")) {
            System.out.println("The sum of your number is:" + " " + (Number1 + Number2));
        }else if (operator.equals("-")) {
            System.out.println("The difference of your numbers is: " + (Number1 - Number2));
        } else if (operator.equals("*")) {
            System.out.println("The product of your numbers is: " + (Number1 * Number2));
        } else if (operator.equals("/")) {
            if (Number2 != 0) {
                System.out.println("The division of your numbers is: " + (Number1 / Number2));
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator! Please choose from +, -, *, or /.");
        }

    }
}
