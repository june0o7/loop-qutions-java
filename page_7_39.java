import java.util.*;

//HCF
public class page_7_39 {

    public static void hcf(int a, int b) {
        if (b==0) 
        {
            System.out.println("HCF is "+a); 
            
        }else
        hcf(b, a%b);
            
   
        }
    public static void main(String[] args) {
        System.out.println("enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.print("The HCF of "+a+" and "+b+ " is :");
        hcf(a,b);
        
    }
    
}
