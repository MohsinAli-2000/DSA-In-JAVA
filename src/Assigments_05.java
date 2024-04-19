import java.util.Scanner;

public class Assigments_05 {
    public static void main(String[] args) {
        //5- Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers & i will give you a larger one!");
        System.out.print("Enter the first number: ");
        double Num1 = input.nextDouble();
        System.out.print("Enter the first number: ");
        double Num2 = input.nextDouble();
        if(Num1 > Num2){
            System.out.println(Num1 + " is the larger one.");
        }else{
            System.out.println(Num2 + " is the larger one");
        }

    }
}
