import java.util.*;


public class page_8_41 {

    public static void gcd(int a, int b) { 
        if (b==0) 
        {
            System.out.println("gcd is "+a); 
            
        }else
        gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c ;
        boolean x = true;
        
        while(x){
        System.out.println("1. terminate buzz operation\n2.calculate GCD\n3.exit");
        System.out.print("Enter choice :");
        c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("1");
                System.out.println("enter the number : ");
                int n = sc.nextInt();
                if (n%7==0 || n%10 == 7)
                {
                    System.out.println("buzz");
                }
                else
                System.out.println("not buzz");
                break;
        

                case 2:
                System.out.println("2");
                System.out.println("enter two number to calculate gcd :");
                int a=sc.nextInt(),b=sc.nextInt();
                gcd(a, b);
                break;  
                
                case 3:
                x=false;
                System.out.println("thank you for using our service!");
                break;
            default:
                break;
        }

    }


       
        // System.out.println("gcd of "+a+" and "+b+" is " + (gcd(a, b)));

    }
    
}
