import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to get the table: ");
        int num=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));  //prints each multiple of the input digit.
        }
    }
}
