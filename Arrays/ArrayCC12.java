//max  subarray sum(prefix array method)
import java.util.*;
public class ArrayCC12 {
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
    System.out.println("All pairs are:");
    int tps=0;
    int sum=0;
    int max_sum=Integer.MIN_VALUE;//assigning max_sum to -infinty
    int prefix[]=new int[numbers.length];
    prefix[0]=numbers[0];
    for(int i=1;i<numbers.length;i++){
        prefix[i]=prefix[i-1]+numbers[i];


    }
    

    
    for(int i=0;i<n;i++){
        int start=i;//to declare new start
        for(int j=i+1;j<n;j++){
            int end=j;//to declare new end
            sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            
            if(max_sum<sum){
                max_sum=sum;
            }
            // System.out.println(max_sum);

                System.out.println("the sum of this subarray is:"+sum);
            System.out.println();
            tps++;
            //System.out.println("the sum of this subarray is:"+sum);

        }
        System.out.println();

    }
    System.out.println("totals subaarays are:"+tps);
    System.out.println("the max sum of an subarray is :"+max_sum);
    
    
}
    

    
}
