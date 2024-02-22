//print number in decreasing order

public class CC1{
    public static void printnumber(int n){
        if(n>=1){
         System.out.print(n+" ");
         printnumber(n-1);
        }
    }
    public static void main(String[] args) {
        int n =10;
        printnumber(n);

        
    }
}
