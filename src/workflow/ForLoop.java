package workflow;

import java.util.Enumeration;
import java.util.Scanner;

public class ForLoop {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter your number");
        num = input.nextInt();

        for (int i = num; i < 5; i++) {


            System.out.println("num: " + i);



        }
          int age;
        System.out.println("enter your age");
        age=input.nextInt();

        for(int i= age; i<=25; i++){

            System.out.println("golden age is "+ age);
        }







    }
}


