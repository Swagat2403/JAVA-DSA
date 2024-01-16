//max subarray sum(kadane algorithm)
//TC O(n)

import java.util.Scanner;

public class ArrayCC13 {
    public static void kadane(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
            
        }
        System.out.println("the max subarry sum is :"+ms);
    }
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
    
    kadane(numbers);
}
    
}
