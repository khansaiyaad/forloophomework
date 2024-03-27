import java.util.Scanner;

public class Sum_naturalnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find sum of natural numbers: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;++i){                //sum=n*(n+1)/2
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
