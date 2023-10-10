import java.util.*;
public class average_using_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the marks of the student: ");
        a=sc.nextInt();
        float m[]=new float[a];
        for(int i=0;i<5;i++){
            m[i]=sc.nextFloat();
        }
        float sum=0;
        for(int i=0;i<5;i++){
            sum=sum+m[i];
        }

        System.out.println("Average of the Student Marks is"+sum/m.length);


    }
    
}
