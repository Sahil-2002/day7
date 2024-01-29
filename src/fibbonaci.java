import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till where you want to display the fibbonaci series : ");
        int N = sc.nextInt();
        System.out.print("1 1 ");
        int a=1,b=1, k=0;
        while (k<=N){

            k=a+b;
            if(k>=N){
                break;
            }
            System.out.print(k+" ");

            a=b;
            b=k;


        }


    }

}

