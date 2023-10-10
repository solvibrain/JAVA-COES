import java.util.Scanner;

public class sum_of_element{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the size of the array that you want to create: ");
        a=sc.nextInt();
        float m[]=new float[a];
        for(int i=0;i<5;i++){
            m[i]=sc.nextFloat();
        }
        float sum=0;
        for(int i=0;i<5;i++){
            sum=sum+m[i];
        }

        System.out.println("Sum of the element in the array is "+sum);



    }
}

