package Practice;

import java.util.Scanner;
import java.util.Random;

class Machine {
    int num1, num2, ans, att;
    int score = 0;
    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    public void sumGenerator(){
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);
        ans = num1 + num2;

        System.out.println(num1 +  " + " + num2 );
    }//sumGenerator Method

    public void answerGetter_score(){
        att = in.nextInt();
        if(att == ans){
            score = score + 1;
            System.out.println("Correct");
            System.out.println("Score is currently: " + score + "/5");
        }else{
            score = score - 1;
            System.out.println("Incorrect");
            System.out.println("Score is currently: " + score + "/5");
        }//else
    }//answer Getter method
}//machine class


