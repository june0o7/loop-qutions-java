import java.io.*;

// import java.util.*;

public class page_7_36 {

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
        if (tests(s)) {
            System.out.println("YES");
            
        }else System.out.println("no");
    }
    
}
