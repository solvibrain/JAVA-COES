

import java.util.Scanner;

public class finding_occurence_using_reccurence {
    public static int first = -1;
    public static int last= -1;
    public static void finoccurence(String str,int ids,char element){
        if(ids==str.length()){
            System.out.println("First occurnce of the character is "+ first);
            System.out.println("Last occurnce of the character is "+ last);
            return ;
        }
        char currcharacter=str.charAt(ids);
        if(currcharacter==element){
            if(first==-1){
                first=ids;
            }
            else{
                last=ids;
            }
        }

        finoccurence(str, ids+1, element);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String that you want to find in the String : ");
        char element=in.next().charAt(0);
        String str="My Name is RuPesh Mishra and I am greatest man ever born on the earth .";
        finoccurence(str, 0, element);
    }
}
