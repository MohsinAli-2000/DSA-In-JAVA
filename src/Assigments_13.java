import java.util.Scanner;

public class Assigments_13 {
    public static void main(String[] args) {
        // Reverse A String In Java
        System.out.print("Enter a string and i will reverse it: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        char[] stringArray = userInput.toCharArray();
        String reverseString = "";
        for (int i = userInput.length() - 1; i >= 0 ; i--) {
            reverseString += stringArray[i];

        }
        System.out.println("The reverse of your string is: " + reverseString);
    }
}
