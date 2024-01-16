//linear search
import java.util.*;

public class ArrayCC5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]={1,2,3,4,5};
        int flag=0;
        System.out.println("enter the number to be searched ");
        int key= sc.nextInt();
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                flag=1;
                System.out.println("the number is found at index :"+i);
                
            }
        }
        if(flag==0){
            System.out.println("the number is not found.");
        }

    }
    
}
