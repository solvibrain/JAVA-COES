import java.util.Scanner;

public class checking_armstrong_Numer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,r,sum=0,p;
        System.out.println("Enter the Number to Checking that Number is Armstrong or Not :");
        n=in.nextInt();
        p=n;
        while(n!=0){
            r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        if(sum==p)
        System.out.println("Number is Armstrong Number.");
        else
        System.out.println("Number is nOt Armstrong Number. ");
    }

}
