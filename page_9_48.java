import java.io.*;

public class page_9_48 {
    public static void main(String[] args)throws IOException{
        System.out.println("48/a");
        int sum = 0;
        for(int i = 2; i<=20 ; i+=4)
        {
            sum+=i-(i+2);
            System.out.println(i);
            System.out.println(sum);


        }
        System.out.println("48/b");
        double a=0.0;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in ));
        System.out.println("enter the value of x : ");
        double x =  Integer.parseInt(br.readLine());
        for(int i = 2; i<=20; i+=3 ){
            System.out.println(i);
            a+=x/i;
            System.out.println(a);


        }

    }
    
}
