import java.util.*;
public class using_random_variable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number that you want the random nuber til that value: ");
        n=in.nextInt();
        int r=(int)(Math.random()*n)+1;
        System.out.println("random value is "+r);

    }
}
