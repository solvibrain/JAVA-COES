public class for_each_loop {
    public static void main(String[] args) {
        int m[]={78,34,64,25,64,23,756};
        char c[]={'e','g','a','g','e'};
        // Traversing an array using the most simplest method using a for loop.
        
        for(int i=0;i<m.length-1;i++){
            System.out.println(m[i]);
        }

        // Traversing an aray using the for-each loop
        System.out.println(
"*******************************************************************"
        );
        for(int e:m){
            System.out.println(e);
        }
        // Travesing an array of character containing element
        for(char e:c){
            System.out.println(e);
        }
    }
}
// Basic Syntax for using for-each loopis
/*for(datatypeofarray anyvariable:nameof_an_array){
    System.out.println(any_variable);
}*/