import java.util.*;

/**
 * page_7_38
 */
public class page_7_38 {

     public static void main(String[] args) {
        gcd gcd = new gcd();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt() , b = sc.nextInt();
        int c= gcd.calculateGCD(a,b);
        System.out.println(c);
        int lcm = (a*b)/c;
        System.out.println(lcm);



     }
}