// spiral matrix

import java.util.*;
public class CC2 {
    public static void spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
         
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //left
            for(int i=endrow-1;i>startrow;i--)//here (i!>=startrow)
            {
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;


        };

        


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n =sc.nextInt(); 
        System.out.println("enter the number of columns");
        int m =sc.nextInt();
        int matrix[][]=new int [n][m];
        System.out.println("enter the numbers :");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            matrix[i][j]= sc.nextInt();
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
         System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        spiral(matrix);

        
    }
    
}
