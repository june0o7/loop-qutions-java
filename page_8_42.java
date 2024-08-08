import java.io.*;

public class page_8_42 {
    public static boolean checkautomorphic(int p)
    {
        String ps = String.valueOf(p);
        int b = p*p;
        // System.out.println(b);
        // System.out.println(b%(Math.pow(10,ps.length())));
        if (p==b%(Math.pow(10,ps.length()))) {
            // System.out.println(p +" is automorphic number.");
            return true;
            
        }else{ 
    // System.out.println(p + " is not automorphic");
return false;        
}


    }
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        int p = Integer.parseInt(br.readLine());
        // String ps = String.valueOf(p);
        int c = 0;
        for(int i = 2 ; i < p ; i++)
        {
            if (p % i == 0)
            {
                c++;
                break;
            }
            
        }
        if (c==0) {
            System.out.println(p+"is prime.");

            
        }else
        System.out.println(p +" is not prime.");


    //     int b = p*p;
    //     // System.out.println(b);
    //     // System.out.println(b%(Math.pow(10,ps.length())));
    //     if (p==b%(Math.pow(10,ps.length()))) {
    //         System.out.println(p +" is automorphic number.");
            
    //     }else
    // System.out.println(p + " is not automorphic");
     if ( checkautomorphic(p)) {
        System.out.println("automorphic");
     }else
     System.out.println("not automorphic");
        

    }
    
}
