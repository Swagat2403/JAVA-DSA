//passing array as function argument
import java.util.*;
public class ArrayCC4{
    
    public static void update(int marks[],int nonchangeable){
        for(int i=0;i<marks.length;i++){
            nonchangeable=10;
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks[]={99,98,100};
        int changeable=5;
        
        //call by refrence
        update(marks,changeable);
        System.out.println(changeable);//did not change . is not calledeby refrence
        for(int i=0;i<marks.length;i++){
            
          System.out.println(marks[i]);
        }
    }
        
        


    }

