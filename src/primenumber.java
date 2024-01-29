import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        int count = 0;

        if (N > 1) {
            for (int i = 1; i <= (N); i++) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not prime");
            }
        } else {
            System.out.println("Invalid input: Prime numbers start from 2");
        }
    }
}
