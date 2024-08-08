import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class page_7_34 {
    public static boolean armstrong(int n) 
    {
        String s = String.valueOf(n);
        int arm = n;
        int sum = 0;
        //  do{
            // int r = n % 10;
            // System.out.println(r);
            // sum+=(Math.pow(r,3));
            // System.out.println(sum);
            // n/=10;
            // System.out.println(n);
            
            
        // } while {
        //     n!=0;
           

        // }

        for (int i = 0 ; i < s.length(); i++)  {
            int r = n % 10;
            System.out.println(r);
            sum+=(Math.pow(r,s.length()));
            System.out.println(sum);
            n/=10;
            System.out.println(n);

            
        }
        System.out.println(".............");
        System.out.println(n);
        System.out.println(sum);
        System.out.println(arm);
        if (arm==sum) {
            return true;
            
        }
        else
        return false;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number : ");
        int  num = Integer.parseInt(br.readLine());
        if (armstrong(num)) {
            System.out.println(num + " is an Armstrong number");
            
        }else
        System.out.println(num + " is not an Armstrong number");
        
    }
    
}
