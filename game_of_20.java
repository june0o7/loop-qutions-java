import java.util.*;

public class game_of_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = 0 , p2= 0 , i = 1;
        while (p1<20 && p2<20) {
            
        
        System.out.println("round :" +i+ "\np1 press enter to roll the dice");
        sc.nextLine();
         p1 += new Random().nextInt(1,6);
         
        System.out.println("p2 press enter to roll the dice");
        sc.nextLine();
        p2 += new Random().nextInt(1,6); 
        System.out.println("score board : \n p1 : "+ p1 + "\n p2: " + p2 );
        i++;
        System.out.println("...............................\n");
        }
        if (p1 == 20){
            System.out.println("\nCongratulations! Player one has won the game!");
        }else{
            System.out.println("\nPlayer two has won the game!");
        }
    }
    
}
