import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lowerlimit: ");
        int i=sc.nextInt();                                     // input for lower limit
        System.out.println("Enter the upper limit: ");
        int j=sc.nextInt();                                         //input for upper limit
    for( int a=i;a<=j;a++){                       //print numbers between the lower and upper limit

        System.out.println(a);

    }

    }
}