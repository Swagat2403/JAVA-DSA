// Diagnol sum in matrix
import java.util.*;
public class CC3 {
    public static void diagnol_sum(int matrix[][]){
        int diagnolsum=0;
        
        //optimized code
        for(int i=0;i<matrix.length;i++){
            diagnolsum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                diagnolsum+=matrix[i][matrix.length-i-1];

            }
        }
        System.out.println("the diagnol sum is :"+diagnolsum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers of rows:");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int matrix[][]=new int[n][m];
       
        
        //input 
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            matrix[i][j]= sc.nextInt();
            }
            
        }
        //output
        System.out.println("the following matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
         System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        diagnol_sum(matrix);
        
    }
    
}
