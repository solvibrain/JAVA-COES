import java.util.Scanner;

public class calculating_squareroot {
    public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int n;
            n=in.nextInt();
            if(n<0){
                System.out.println("you have entered the wrong input :");
                 System.out.println("Enter the valid input : ");
                // System.exit(0);
             
            }
            System.out.println("The Squareroot of the given number is "+Math.sqrt(n));
    }
}
