import java.io.*;

public class page_5_19 {
    public static void main(String[] args) throws IOException {
        int a,e=0,o=0;
        System.out.println("enter the number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<=a ;i++){
           if (i % 2 == 0){
            System.out.println("even  : " + i);
            e+=i;
            }else{
                System.out.println(i+" is odd");
                o+=i;
            }
        }
System.out.println("sum of even is: "+e+"\n sum of odd number: "+o);
    
}
}