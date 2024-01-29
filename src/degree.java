import java.util.Scanner;

public class degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select the option 1:celcius to faranheit or 2 : farenheit to celcius ");
        int option  = sc.nextInt();
        switch(option){

            case 1 :
                System.out.println("enter the temperature in celcius ");
                int Cel = sc.nextInt();
                int F = (Cel* 9/5) + 32;
                System.out.println("converted temperature to Farenheit is "+F);
                break;
            case 2:
                System.out.println("enter the temperature in farenheit ");
                int Far =sc.nextInt();

                int C = (Far-32) *5/9;
                System.out.println("converted temperature to celcius is "+C);
                break;
            default:
                System.out.println("Invalid input ");
        }
    }
}
