//print subarray
import java.util.*;
public class ArrayCC10 {
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

        
        for(int i=0;i<n;i++){
            int sum=0;
            int start=i;//to declare new start

            for(int j=i+1;j<n;j++){
                int end=j;//to declare new end
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");//to print numbers
                    sum+=numbers[k];

                }
                 System.out.println("the sum of this subarray is:"+sum);
                System.out.println();
                tps++;
                //System.out.println("the sum of this subarray is:"+sum);

            }
            System.out.println();

        }
        System.out.println("totals subaarays are:"+tps);
        
        
    }
    
}
