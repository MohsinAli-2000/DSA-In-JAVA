import java.util.Scanner;

public class Assigments_08 {
    public static void main(String[] args) {
        //8- To find out whether the given String is Palindrome or not.

        System.out.print("Enter a String to check whether it is palindrome or not: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String reversedInput = "";
        for (int i = userInput.length() - 1; i >= 0 ; i--) {
            reversedInput += userInput.charAt(i);
        }
        if (reversedInput.equals(userInput)){
            System.out.println("The given string is a Palindrome!");
        }else{
            System.out.println("The given String is NOT a Palindrome.");
        }


    }
}
