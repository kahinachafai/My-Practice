public class WhileLoop {


    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 28;
        while (num1 > 17) {
            System.out.println(" He is young");
            num1--;
        }

        System.out.println("********");

        while (num1 < 25) {
            System.out.println("He is happy");
            num1++;
        }

//nested  while
         int a= 25;
        int c=20;
        while (a>20) {

            System.out.println("He is young");

            a--;
        }

        while (c<24) {

            System.out.println("Happy mood");
            c++;


        }


    }

}
