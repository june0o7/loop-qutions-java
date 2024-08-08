import java.util.*;
import java.io.*;
public class page_8_40 {
    public static boolean isPalindrome(String str) {
    for(int  i = 0; i<str.length()-1;i++) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
    }
    return true;
    
    }
    public static void main(String[] args) {
        //palindrome
        Scanner sc = new Scanner (System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("enter the number : ");
        String str = sc.nextLine();
        int st = Integer.valueOf(str);
        int sum=0;
        
        
        if(isPalindrome(str))
            System.out.println("The string is a palindrome");
        else  
            System.out.println("The string is not a palindrome");

            for(int i = 1 ; i<st ; i++)
            {
                if (st%i==0) {
                    sum+=i;
                    
                }
                
                

            }
            if (sum==st) {
                System.out.println("perfect.....");
                
            }else
            System.out.println("not perfect......");
    }
    
}
