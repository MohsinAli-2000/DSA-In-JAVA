import java.util.Scanner;

public class Assigments_02 {
    public static void main(String[] args) {
        // 2- Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name & i will greet you : ");
        String userName = input.nextLine();
        System.out.println("Hi " + userName.toUpperCase() + ", Welcome in JAVA programming!");
    }
}
