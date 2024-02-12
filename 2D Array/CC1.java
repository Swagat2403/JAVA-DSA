//creation of 2D Array

import java.util.*;
public class CC1 {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("foun the key at ("+i+","+j+")");
                return true;
            }
            }
            
            
        }
        System.out.println("key not found!!");
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        
        //input 
        System.out.println("Enter 9 numbers:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            matrix[i][j]= sc.nextInt();
            }
            
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
         System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println("enter the number to be searched");
        int  key= sc.nextInt();
        search(matrix, key);

        

    }
    
}
