package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstDigit;
        int secondDigit;

        System.out.println("Enter your first Digit: ");
        firstDigit = input.nextInt();
        System.out.println("Enter your second Digit: ");
        secondDigit = input.nextInt();

        if (firstDigit == secondDigit){
            if (secondDigit == firstDigit);
            System.out.println("It is a Palindrome");
        }



      if (firstDigit != secondDigit && secondDigit != firstDigit){
          System.out.println("Sorry it is not a Palindrome");
      }
    }



}
