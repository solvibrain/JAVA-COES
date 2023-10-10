

import java.util.Scanner;

public class findduplicate_using_recurence {
    public static boolean map[]=new boolean[26];

    public static void removeduplicate(String str, int indx, String newstring){
        if(indx==str.length()){
            System.out.println("New String without the duplication of the character is "+newstring);
            return;
        }
        char currcharacter=str.charAt(indx);
        if(map[currcharacter-'a']){
            removeduplicate(str, indx+1, newstring);
        }
        else{
            newstring +=currcharacter;
            map[currcharacter-'a']=true;
            removeduplicate(str, indx+1, newstring);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String : ");
        String str=in.nextLine();
        removeduplicate(str, 0, "");
    }
}
