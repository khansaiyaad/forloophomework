import java.util.Scanner;



        public class Primenumber {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number to check if it's prime: ");
                int number = scanner.nextInt();

                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }

            public static boolean isPrime(int number) {
                if (number <= 1) {                  //0 & 1 are not prime numbers
                    return false;
                }
                if (number <= 3) {                  //2 & 3 are prime numbers
                    return true;
                }
                if (number % 2 == 0 || number % 3 == 0) {       //numbers divisible by 2or3 are not prime numbers
                    return false;
                }
                for (int i = 5; i * i <= number; i = i + 6) {
                    if (number % i == 0 || number % (i + 2) == 0) {
                        return false;                                   //if num divisible by i or i+2 the its not a prime number
                    }
                }
                return true;
            }
        }

