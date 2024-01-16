//Trapping rainwater problem
import java.util.*;
public class ArrayCC14 {
    public static int trapwater(int arr[]){
        int n=arr.length;
        //calculate the left max bound -arr
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        //calculate the right max bound -arr
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
int trapwater=0;
        //loop
        for(int i=0;i<n;i++){
            //water lvl=min(left max,right max)
            int waterlvl=Math.min(leftmax[i],rightmax[i]);
              //trap water =(water lvl-bar height )*width
            trapwater+=waterlvl-arr[i];

        }
        return trapwater;
        
       
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    int n;
    System.out.println("enter the number of bars:");
    n=sc.nextInt();
    int numbers[]=new int[n];
    System.out.println("Enter the height of bars:");
    for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();

    
    }
    int trapwat=trapwater(numbers); 
    System.out.println("the trapwater is:"+trapwat);
}

    
}
