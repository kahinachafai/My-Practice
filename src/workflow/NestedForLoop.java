package workflow;

import java.util.Scanner;

public class NestedForLoop {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int rowNumber = input.nextInt();

        for (int i = 1; i <= rowNumber; i++) {


            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }


        }


    Scanner input2= new Scanner(System.in);
        System.out.println("Enter a letter");
         int letter= input.nextInt();
          for(int i=1; i<= letter; i++) {

              for (int j = 1; j <= i; j++) {


                  System.out.print(j + " ");
              }

              System.out.println();


          }



    }








}


