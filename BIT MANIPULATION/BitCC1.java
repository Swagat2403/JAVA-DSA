//even or odd
import java.util.*;
public class BitCC1{
    public static void oddOrEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            //even number 
            System.out.println("the munber is even");

        }
        else{
            System.out.println("the number is odd.");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        oddOrEven(n);
        
    }

}