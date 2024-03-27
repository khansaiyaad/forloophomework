import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int numTerms = sc.nextInt();

        System.out.println("Fibonacci series up to " + numTerms + " terms:");
        for (int i = 1; i <= numTerms; i++) {               //calls fibonacci method
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {                    //prints 1 and adds previous number to give the next number.
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

