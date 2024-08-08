import java.util.*;
//)
public class page_9_47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int x = new Random().nextInt(50);
    System.out.print("ente the value of y :");

    int y = sc.nextInt();
    System.out.println("the value of x: " + x);
    int z = ((x*x)+(y*y))/(x+y);
    System.out.println(z);
        
    }
    
    
}
