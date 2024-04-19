import java.util.Scanner;

public class Assigments_06 {
    public static void main(String[] args) {
        //6- Input currency in rupees and output in USD.
        System.out.println("Input currency in Pkr and i will convert that in to USD dollars");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in pkr: ");
        double pkrAmount = input.nextDouble();
        double usdRate = 278.45;
        double usdAmount = pkrAmount/usdRate;
        System.out.println(pkrAmount + " Pkr is equal to " + usdAmount);
    }
}
