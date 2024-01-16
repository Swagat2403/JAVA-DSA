//largest  and smallest in the array
import java.util.*;
public class ArrayCC6 {
    public static int  getLargest(int number[]){
        int largest=Integer.MIN_VALUE;// -infinity
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];

            }
        }
        return largest;

    }
    public static int getSmallest(int number[]){
        int smallest=Integer.MAX_VALUE;// -infinity
        for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={1,2,3,4,5};
        int largest=getLargest(numbers);
        int small=getSmallest(numbers);
        System.out.println("the largest numbers in the array is "+largest);
        System.out.println("the smallest number in array is "+small);



    }

    
}
