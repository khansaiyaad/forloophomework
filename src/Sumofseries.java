import java.util.Scanner;import java.io.*;

public class Sumofseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        double sum = 1;                             //series starts with 1+ ...so sum =1
        if (num > 0){                           //to check if input is positive number
            for (float i = 1; i <= num; i++) {              //add numbers in loop 1/1+1/2+1/3+1/4...1/n
                sum = sum + 1/i;
            }
        System.out.println(sum);
    }
        else{
            System.out.println("invalid number");

        }
    }
}
