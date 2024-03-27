import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("month is JANUARY"); break;
            case 2:

            case 3:
                System.out.println("month is MARCH"); break;
            case 4:
                System.out.println("month is APRIL"); break;
            case 5:
                System.out.println("month is MAY"); break;
            case 6:
                System.out.println("month is JUNE"); break;
            case 7:
                System.out.println("month is JULY"); break;
            case 8:
                System.out.println("month is AUGUST"); break;
            case 9:
                System.out.println("month is SEPTEMBER"); break;
            case 10:
                System.out.println("month is OCTOBER"); break;
            case 11:
                System.out.println("month is NOVEMBER"); break;
            case 12:
                System.out.println("month is DECEMBER"); break;
            default:
                System.out.println("invalid entry");





        }
    }
}
