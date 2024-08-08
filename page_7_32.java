import java.io.*;

public class page_7_32 {
    public static boolean check(int a)
    {
        String s = String .valueOf(a);
        boolean b = false;
       for(int i = 0 ; i< s.length();i++)
       {
        int j = a%10;
        System.out.println(j);
        if (j%2==0) {
            b=true; 
             

            
        }else
        { 
        b=false;
        break;
        }  
        a/=10;

       }
if (b) {
    return true;
}else
return false;

    }

    public static void main(String[] args)throws IOException {
        System.out.println("enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (check(a)) {
            System.out.println(a + " all digit is even");
            
        }else
        System.out.println(a+ " not all digit is even");
        

    }
    
}
