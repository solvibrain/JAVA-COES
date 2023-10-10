import java.util.Scanner;

public class perfect_number {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,a=1,sum=0;
        System.out.println("Enter the Number for the Perfect NUbmer is or Not : ");
        num=in.nextInt();
        while(a<num){
            if(num%a==0)
            sum+=a;
            a++;
        }
        if(sum==num)
        System.out.println("Numbe is Perfect Number  : ");
        else
        System.out.println("Number is not a Perfect Number: ");

    }
}
