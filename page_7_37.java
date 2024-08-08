import java.io.*;

public class page_7_37 {
    public static boolean kaprekar(int a){
        int b = a*a;
        String s= String.valueOf(b);
        
        int sum = 0 ;
        // for(int i = 0 ; i<s.length(); i++)
        while (b!=0) 
            
        
        {
            if (s.length()%2==0) 
                
             {
                
                sum+=b%Math.pow(10, s.length()/2);
                
                b/=(Math.pow(10, s.length()/2 ));
               }else
            {
                
               
               
                sum+=b%Math.pow(10, (s.length()+1)/2);
               
                b/=(Math.pow(10, (s.length()+1)/2 ));
                
                

            }
                       
        }
        System.out.println(sum);
        
        if (sum==a) {
            return true;
            
        }else
        return false;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number: ");
        int a = Integer.parseInt(br.readLine());
        if (kaprekar(a)) {
            System.out.println(a + " is kaprekar number");
            
        }else
        System.out.println(a + " is not kaprekar ");

        

    }
    
}

