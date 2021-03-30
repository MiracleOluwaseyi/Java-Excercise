package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {
        double GPA1;
        double GPA2;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your Online CGPA Calculator");
        System.out.println("Enter your GPA1: ");
        GPA1 = input.nextDouble();

        System.out.println("Enter your GPA2: ");
        GPA2 = input.nextDouble();

        double average = (GPA1 + GPA2) / 2;

        System.out.println("Your CGPA is " + GPA1 + " " + GPA2 + " is " + average);

        if (average <= 5.0) {
            System.out.println("If you have Good Grade");


            //   else
            System.out.println("If your CGPA is Less than 1.0, Please get ready to go back home");

        }
        //int [] c = new int[12];
        //System.out.println(c);
    }
}

