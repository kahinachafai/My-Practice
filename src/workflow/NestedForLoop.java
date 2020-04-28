package workflow;

import java.util.Scanner;

public class NestedForLoop<num> {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int rowNumber = input.nextInt();

        for (int i = 1; i <= rowNumber; i++) {


            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            System.out.println(" ");
        }






            Scanner input5= new Scanner( System.in);

        System.out.println(" enter num");
        int num = input5.nextInt();
        for(int i = 1; i <=num; i++) {
            for (int j = i; j >=5; j--) {
                System.out.print(j + " ");

            }
            System.out.println();


        }


    }


}