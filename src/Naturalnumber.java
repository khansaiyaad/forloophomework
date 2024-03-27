import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a natural number: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Sum of above numbers is: ");
        for(int i=0;i<=num;i++){
            sum=sum+i;
        } System.out.println(sum);
    }
}
