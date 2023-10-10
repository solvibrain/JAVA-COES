

import java.util.Scanner;

public class adding_element_after_checking_condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sum=0;
        int a;
        System.out.println("Enter the number of Element want to be entered");
        a=sc.nextInt();
        int num[]=new int[a];
        for(int i=0;i<a;i++){
            num[i]=sc.nextInt();

        }
        for(int e:num){
            if(e%3==0 || e%5==0){
                sum=sum+e;
            }
            }

        System.out.println("Sum of the element is "+ sum);    
        }
    }

