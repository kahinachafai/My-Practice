package homeWork3;

public class GreatestNumber {


    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 55;
        int num3 = 65;

        if (num1 >= num2 && num1 >= num3) {


            System.out.println("largest num is " + num1);

        }
        else if (num2 >= num1 && num2 >= num3) {


            System.out.println("largest num is " + num2);


        }
          else
             System.out.println("largest num is " + num3);

    }
}