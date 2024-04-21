import java.util.Scanner;

public class Assigments_11 {
    public static void main(String[] args) {
        // Calculating the factorial of a number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to find the factorial of it: ");
        int n = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;

        }
        System.out.println("The factorial of " + n + " is " + factorial);

    }
}
