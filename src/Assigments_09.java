import java.util.Scanner;

public class Assigments_09 {
    public static void main(String[] args) {
        //9- To find Armstrong Number between two given number.
        System.out.println("Enter two numbers to check which of them is an Armstrong number!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int Num2 = input.nextInt();

        for (int i = Num1; i <= Num2; i++) {
            int sum = 0;
            int num = i;
            int noOfDigits = 0;

            // Count the number of digits
            while (num > 0) {
                num = num / 10;
                noOfDigits++;
            }

            // Reset num to the original value
            num = i;

            // Calculate the sum of powered digits
            while (num > 0) {
                int lastDigit = num % 10;
                sum += Math.pow(lastDigit, noOfDigits);
                num = num / 10;
            }

            // Check if the number is an Armstrong number
            if (sum == i) {
                System.out.println(i + " is an Armstrong Number.");
            }
        }
    }
}
