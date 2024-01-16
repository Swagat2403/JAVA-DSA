//binary search
import java.util.*;

public class ArrayCC7 {
    public static  int binarySearch(int arr[],int key){
       // int start =arr[0];
       // int end =arr[arr.length-1];
       int start =0;
       int end =arr.length;

        while(start<=end){
            int mid;
            mid=(start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
                

            }
            else if(arr[mid]<key){
                start =mid +1;
               

            }
            


        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key =5;
         int value=binarySearch(arr, key);
         if(value!=-1){
            System.out.println("the key is found at index :"+value);

         }
         else{
            System.out.println("the key is not found.");
         }
        

    }

    
}
