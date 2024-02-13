//search element in a sorted array
import java.util.*;
public class CC4 {
    public static boolean search(int matrix[][],int key){
        //method 1

        // int row=0;
        // int col=matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==key){
        //         System.out.println("the number is found at :("+ row +","+col+")"); 
        //         return true ;
        //     }
        //     else if(matrix[row][col]>key){
        //         col--;
        //     }
        //     else{

        //         row++;
        //     }
            
        // }
        
        //method 2

        
        int row =matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                         System.out.println("the number is found at :("+ row +","+col+")"); 
                         return true ;
                     }
                     else if(matrix[row][col]<key){
                         col++;
                     }
                     else{
                        row--;
        
                         ;
                    }
            
        }

        System.out.println("key not found!!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
        {15,25,35,45},{27,29,37,48},{32,33,39,30}};
        int key = 33;
        search(matrix,key);
        
    }
    
}
