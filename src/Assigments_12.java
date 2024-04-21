import java.util.Scanner;

public class Assigments_12 {
    public static void main(String[] args) {
        // Sum Of N Numbers
        System.out.println("Program to find the sum of N numbers!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find sum: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of the given number is: " + sum);
    }
}
