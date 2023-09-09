import java.util.Scanner;

public class factorial {

    public void factorial(){
        Scanner input =new Scanner(System.in);


        System.out.print("Please enter the number you want to get the factorial : ");
        int factorial_number =input.nextInt();
        System.out.print("\n");

        int result =1;
        for (int i=1 ; i<=factorial_number;i++){

            result *= i;

        }

        System.out.print("Result :" + result);



    }




}
