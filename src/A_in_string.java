import java.util.Scanner;

public class A_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to count number of 'a':");
        String s1= sc.next();
        int count=0;
        for(int i=0;i<s1.length();i++){    //loop through the string given and if char==a it will increment count
            if(s1.charAt(i)=='a')
                count=count=1;
        }
        System.out.println("number of 'a': "+count);
    }
}
