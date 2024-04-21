import java.util.Scanner;

public class Assigments_10 {
    // Area Of Circle Java Program
        //Now as we know that area of the circle is πr2.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = pi * radius * radius;
        System.out.println("The area of the circle is " + area);
    }




}
