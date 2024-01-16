    //Max subarray sum(brute force)
    //will use the same code from ArrayCC9 and will modify for this Q
    import java.util.*;
    public class ArrayCC11 {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements:");
        n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();

        
        }
        System.out.println("All pairs are:");
        int tps=0;
        int sum=0;
        
        int max_sum=Integer.MIN_VALUE;//assigning max_sum to -infinty

        
        for(int i=0;i<n;i++){
            int start=i;//to declare new start
            for(int j=i+1;j<n;j++){
                int end=j;//to declare new end
                sum=0;//to reset the sum again to zero else it will carry the previos sum also
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");//to print numbers
                    sum=sum+numbers[k];


                }
                if(max_sum<sum){
                    max_sum=sum;
                }
                // System.out.println(max_sum);

                    System.out.println("the sum of this subarray is:"+sum);
                System.out.println();
                tps++;
                //System.out.println("the sum of this subarray is:"+sum);

            }
            System.out.println();

        }
        System.out.println("totals subaarays are:"+tps);
        System.out.println("the max sum of an subarray is :"+max_sum);
        
        
    }
        
    }
