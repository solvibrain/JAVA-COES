import java.util.Scanner;

public class gcd {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num1,num2;
        double d,gcd=0;
        System.out.println("Enter two number : ");
        num1=in.nextInt();
        num2=in.nextInt();
        d=Math.min(num1, num2);
        for(int i=1;i<d;i++)
        {
            if(num1%i==0 && num2%i==0)
            gcd=i;
        }
        System.out.println("Gcd of the two number is :"+ gcd);


    }
}
