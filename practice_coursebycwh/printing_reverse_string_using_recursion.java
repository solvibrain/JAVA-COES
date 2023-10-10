 public class printing_reverse_string_using_recursion{
    public static void printrev(String str, int indx){
        if(indx==0){
            System.out.println("Char at index with reverseing is "+ str.charAt(indx));
            return ;
        }
        
        System.out.println("Char at index with reversing is "+str.charAt(indx));
        printrev(str, indx-1);
    }
    
    public static void main(String[] args) {
         String str="Rupesh";
         printrev(str, str.length()-1);
    }
}