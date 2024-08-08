import java.util.*;
public class page_9_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("enter the a : ");
        int a = sc.nextInt() ;
        double s = 0.0;
        double c = 2.0;
        double b = 1.0;
        
       

        for(int i = 1 ; i<=n ; i++)

        {

            System.out.println("count of i : "+ i);
            System.out.println(a );
            System.out.println(b);
            System.out.println(c);
            s+= (a+b)/c;
            c+=2.0;
            b+=2.0;
            System.out.println("total : " + s);

        }
    }
    
    
}
