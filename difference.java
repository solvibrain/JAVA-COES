public class difference {
        public static void main(int p,int r, int t){
            double si, ci, amt ,diff;
            si=p*r*t/100;
            amt=r*(Math.pow(1+r/100,t));
            ci=amt-p;
            diff=ci-si;
            System.out.println(ci);
            System.out.println(si);
            System.out.println(diff);
        }
}//why in main function we cannot input the arguement . 
