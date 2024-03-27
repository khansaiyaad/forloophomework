import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter any operator(+,*,-,/): ");
        char x =sc.next().charAt(0);
        System.out.println("Enter number: ");
        int num2 =sc.nextInt();
        switch (x){                                             //switch will check for suitable case and return result.
            case '*':
                System.out.println("result: "+(num1*num2));
                break;
            case '-':
                System.out.println("result: "+(num1-num2));
                break;
            case'+':
                System.out.println("result: "+(num1+num2));
                break;
            case '/':
                System.out.println("reuslt: "+(num1/num2));
                break;
            default:
                System.out.println("invalid entry");
        }
    }
}
