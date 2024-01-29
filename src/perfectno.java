import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int N = sc.nextInt();
        int sum=0;;

        for(int i =1; i<=N/2; i++){
            if(N%i==0){
                System.out.print(i+" ");
                sum=sum+i;


            }
        }
        if(N==sum){
            System.out.println(N+ " is perfect number");
        }
        else{
            System.out.println(N+" is not perfect number ");
        }

    }
}
