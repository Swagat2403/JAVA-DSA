//reverse an array 
import java.util.*;
public class ArrayCC8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements:");
        n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("ENter the elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();

        
        }
        
        int start=0;
        int last=n-1;
        System.out.println("Given array:");
        for(int i=0;i<n;i++){
           System.out.print(numbers[i]+" ");
        
        }
        System.out.println();
        while(start<=last){
            int temp;
            temp= numbers[start];
            numbers[start]=numbers[last];
            numbers[last]=temp;
            start=start+1;
            last=last-1;

        }
        System.out.println("the reversed array is :");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
         
         }
        

        
    }
    
}
