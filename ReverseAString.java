import java.util.Scanner;
import java.util.ArrayList;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInputReversed = "";

        System.out.println("Type something and press enter: ");
        String userInput = sc.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            String currentLetter = userInput.substring(userInput.length() - (i + 1), userInput.length() - i);
            userInputReversed += currentLetter;
        }
        System.out.println(userInputReversed);
    }
}
