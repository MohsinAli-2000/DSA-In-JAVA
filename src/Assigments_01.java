import java.util.Scanner;

public class Assigments_01 {
    // 1- Write a program to print whether a number is even or odd, also take input from the user.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer to check whether its Even or Odd : ");
        int userInput = input.nextInt();
        if(userInput % 2 == 0){
            System.out.println("The given Number " + userInput + " is an even number.");
        }else{
            System.out.println("The given Number " + userInput + " is an odd number.");
        }

    }
}
