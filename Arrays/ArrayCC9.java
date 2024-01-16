// pairs in an array
import java.util.*;
public class ArrayCC9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements:");
        n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();

        
        }
        int tp=0;
        System.out.println("pair are");
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")"+" ");
                 tp++;


            }
            System.out.println();
        }
        System.out.println("total pairs"+tp);
        
        
    }
    
}
