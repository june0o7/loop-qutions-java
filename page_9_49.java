import java.util.*;
public class page_9_49 {
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int  n = sc.nextInt();
        double s = 0.0;

        System.out.println("enter a : ");
            int a = sc.nextInt();

            for(double i = 2.0 ; i<= n ; i++)
            {
                s+= (a/i);
                System.out.println(a+" / "+i +" :"+s);

            }
    }
    
}
