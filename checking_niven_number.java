import java.util.Scanner;

public class checking_niven_number {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num,d,sum=0,p;
        System.out.println("Enter the number for which you want to check Niven : ");
        num=in.nextInt();
        p=num;
        while(num!=0)
        {
            d=num%10;
            sum+=d;
            num=num/10;
        }
        if(p%sum==0)
        {
            System.out.println("Given number is Niven .");

        }
        else
        {
            System.out.println("Given number isn not a Niven number .");
        }
    }
}
