public class Divisibleby3and5 {
    public static void main(String[] args) {
        System.out.println("numbers divisible by 3 are: ");
        for(int i=1;i<100;i++) {                    //will print numbers divisible by 3
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
            System.out.println("numbers divisible by 5 are: ");
            for(int i=1;i<100;i++){                 //will print numbers divisible by5
                if(i%5==0)
                    System.out.println(i);
        }
        }

}
