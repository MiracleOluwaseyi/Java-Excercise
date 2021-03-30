package Practice;

import java.util.Scanner;

/*
public class NameDisplay{
    public static double main(double amount)
    {
        // write the body of this method.
        return amount;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount $: ");
        double amount = input.nextDouble();
        System.out.println("Naira: ");
        System.out.print(convert(amount));
        input.close();
    }
}

*/

public class NameDisplay {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 15) {
            System.out.println(count % 2 == 1 ? "***" : "+++++");
            ++count;
        }      // end while
    }       // end main
}