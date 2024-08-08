import java.util.*;

public class page_9_53 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // for (int i = 2; i <= Math.sqrt(num); i++) {

            for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void pf( int num) {
        
        for(int i = 2; i<=num ; i++) {
        while (num % i == 0 ) {
                //  System.out.println(i);
                 if (isPrime(i)) {
                    System.out.println(i);
                    
                 }
                 else
                 break;
                
                    // num/=i;  
                    break;
        }
        
        
        
    }
}
    public static void main(String[] args)
    {
        
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pf(num);
        sc.close();
    }
    
}
