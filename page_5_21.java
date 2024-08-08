import java.util.*;
/**
 * page_5_21
 */
public class page_5_21 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x : " );
        int x = sc.nextInt();
        System.out.println("Enter the n : " ) ;
        int n = sc.nextInt()  ;
        double z = 0.0;

       
    

        for(int i = 1 ; i<=n ; i++ ){
            
            z+=(Math.pow(x, i)/i);
        System.out.println(z);


        }
       

    }
}