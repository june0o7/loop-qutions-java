import java.io.*;

public class page_7_35 {

    public static boolean trimorphic(int a){
        String s = String.valueOf(a);
        int b = a*a*a;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(b%(Math.pow(10, s.length())));
        if (a==(b%(Math.pow(10, s.length())))) {
            return true;
            
        }else
        return false;
    }
    public static boolean triautomorphic(int a){
        String s = String.valueOf(a);
        int b = 3*a*a;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(b%(Math.pow(10, s.length())));
        if (a==(b%(Math.pow(10, s.length())))) {
            return true;
            
        }else
        return false;
    }
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        page_8_42 automorphic = new page_8_42();
        
        System.out.println("enter the number : ");
        int a = Integer.parseInt(br.readLine());
        automorphic.checkautomorphic(a);
        if (automorphic.checkautomorphic(a)) {
            System.out.println(a+ " is automorphic");
            
        }
        else System.out.println(a +" is not automorphic");

        if (trimorphic(a)) {
            System.out.println(a + " is trimorphic");
            
        }else
        System.out.println(a+ "is not trimorphic");

        if (triautomorphic(a)) {
            System.out.println(a+" is triautomorphic");
            
        }else
        System.out.println(a + " is not triautomorphic");
    }
    
}
