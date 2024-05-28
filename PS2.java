import java.util.*;
public class PS2 {
    // write a function to print the sum of all odd numbers from 1 to n.

     static int sum_odd_n(int n){
        if(n==1)
           return 1;
           if(n<=0)
            return 0;
            
         int c=n,sum=0;
         if(c==n){
            sum=n*2-1;
         }   
         return sum+sum_odd_n(n-1);
     }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int r = sum_odd_n(count);
        System.out.println(r);
    }
    
}
