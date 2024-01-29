import java.util.Scanner;

public class monthlypayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal loan amount : ");
        int p = sc.nextInt();
        System.out.println("enter the year : ");
        int Y =sc.nextInt();
        System.out.println("enter the rate of interest ");
        int R = sc.nextInt();
        int n = 12*Y ;
        int r = R/12*100;
        int X= (int) (1-(Math.pow((1+r),-n)));
        int payment =p*r/X;
        System.out.println("Monthly payment required over a year is : "+payment);
    }

}
