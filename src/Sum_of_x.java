import java.util.Scanner;

public class Sum_of_x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1-20 to find the sum");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){            //will add numbers until the input digit
            sum=sum+i;
        }
        System.out.println("sum: "+sum);


    }
}
