import java.util.Scanner;

public class checking_Niven_Number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num,sum=0,r,p;
        System.out.println("Enter the Number  : "); //Taking input in the  programme.
        num=in.nextInt();//using syntax for inputing in the programme.
        p=num;//storing num in the another variable because num is going to update in the loop.
        while(num!=0){
            r=num%10;
            sum+=r;
            num=num/10;
            /*  System.out.println(r); This is simply to check waht is happening in the loop
            System.out.println(sum);
            System.out.println(num);*/

        }

        if(p%sum==0)//checking condition for checking Niven Number.
        {
            System.out.println("Given Numbe is Niven Number: ");
        }
        else
        {
            System.out.println("Given Number is not the Nien Number.");
        }
    }
}
