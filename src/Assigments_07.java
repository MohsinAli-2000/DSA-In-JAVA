import java.util.Scanner;

public class Assigments_07 {
    public static void main(String[] args) {
        //7- To calculate Fibonacci Series up to n numbers.
        System.out.print("Enter the number n and i will print fibonacci series up to n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= n ; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
