import java.io.*;

public class page_6_31 {
    public static void main(String[] args)throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        
        System.out.println("enter the number : ");
        int  n = Integer.parseInt(br.readLine());
        String str = String .valueOf(n);
        for(int  i  = 0 ; i <= str.length();i++)
        {
         a=n%10;
         System.out.println(a);
            if (a%2==0) {
                n/=10;
                System.out.println(n);
            }
            // else if (str.length()==1) {
            //     if (condition) {
                    
            //     }
                
            // }
            else
            continue;

        }
// System.out.println(n);
        
    }
    
}
