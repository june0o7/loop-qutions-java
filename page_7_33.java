import java.io.*;
import java.util.Calendar;


public class page_7_33 {
    public static void main(String[] args)throws  IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("enter the  number: ");
        // int a = Integer.parseInt(br.readLine());
        // String s = String.valueOf(a);
        // int c,d,e,f,g;
        // boolean bool = false;
        // for(int i = 0 ; i <s.length() ; i++)
        // {
        //     c= a%10;
        //     a/=10;
        //     d = a%10;
        //     if (c>d) {
        //         bool = true;
                
        //     }
        //     else{
        //         bool = false;
        //         break;
        //     }


        // }
        // if (bool) {
        //     System.out.println( "The entered number is in ascending order// choto theke boro");
        // }else{
        //     System.out.println("The entered number is not in ascending order");
        // }
        int day = 27; // Example day
        // int month = Calendar.JANUARY; // Example month (January is 0)
        int month = 4;
        int year = 2022; // Example year

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); 

        System.out.print("Today's date is: ");
        System.out.println(day + "/" + (month+1) + "/" + year);
    }
    
}
