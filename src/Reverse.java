import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be reversed: ");
        int number=sc.nextInt();
        int reverse = 0;

        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;              //checking the remainder
            reverse = reverse * 10 + remainder;           //reverse is initialised to 0 and * by 10 to get the reverse.
        }
        System.out.println("The reverse of the number is: " + reverse);

    }
}


