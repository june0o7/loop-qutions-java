import java.util.*;

//evil number.....
public class page_9_52 {
    public static boolean isEvilNumber(int n){
            int c = 0;
            while (n>0) {
                int rm = n%2;
<<<<<<< HEAD
                return true;

                
            }
            return false;
=======

                
            }
>>>>>>> 1f1d052 (i have commited)
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         System.out.print ("enter the number : "    );
        int n = sc.nextInt();
        if (isEvilNumber(n)) 
            System.out.println("The given number is an evil number");
        else
            System.out.println("The given number is not an evil number");
    
    }
    
}
