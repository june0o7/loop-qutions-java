import java.io.*;

// import java.util.*;

public class TEST {

    public static boolean tests(int n)
    {
        int sum = 0 ;
        int m = n;
        // System.out.println("yo");
    
        while (n!=0) {
            sum+=n%10;
            n/=10;
            
        }
        if (m%sum==0) return true;
        return false; 
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine()); 
<<<<<<< HEAD
        if (tests(s)) {
            System.out.println("YES");
            
        }else System.out.println("no my name is rajdeep ");
=======
        System.out.println("i have commited");
>>>>>>> 1f1d052 (i have commited)
    }
    
}
