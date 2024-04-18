import java.util.Scanner;

public class Assignments_03 {
    //3- Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to JAVA programming!, Here you can find the interest on loan amount.");
        System.out.print("Enter the principal amount: ");
        double prinicpalAmount = input.nextDouble();
        System.out.print("Enter the time period (in-years) for which loan is being given: ");
        double time = input.nextDouble();
        System.out.print("Enter the rate of interest percentage: ");
        double interestPercentage = input.nextDouble();
        double finalInterest = (prinicpalAmount * time * interestPercentage) / 100;
        System.out.println("Your total interest on this amount is " + finalInterest);
    }
}
