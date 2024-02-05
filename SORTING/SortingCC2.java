import java.util.*;
public class SortingCC2 {
    public static void InsertionSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minPos=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }

            }
            //swap 
            int temp;
            temp=arr[minPos];
            arr[minPos]=arr[turn];
            arr[turn]=temp;
            
        }
        
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the numbers.");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          
          
          InsertionSort(arr);
          printArray(arr);

    }
    
    
}
