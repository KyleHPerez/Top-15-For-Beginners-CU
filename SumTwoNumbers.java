import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = scr.nextDouble();
        System.out.println("Enter another number: ");
        double b = scr.nextDouble();

        double sum = a + b;

        System.out.println("The sum of your numbers is: " + sum);
        scr.close();
    }
}
