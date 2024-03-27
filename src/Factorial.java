import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find factorial: ");
        int num = sc.nextInt();
        int x=1;
        for(int i=1;i<=num;i++){
            x=x*i;          //x*x-1*x-2*x-3....x*1
        }
        System.out.println("factorial: "+x);
    }
}
