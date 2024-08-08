import java.io.*; 
/**
 * page_5_18
 */
public class page_5_18 {

    

public static void main(String[] args)throws IOException {

     BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
    System.out.println("Enter the 10 element in array : ");
    int arr[]=new int[10];
    for(int i=0;i<10;i++){
        arr[i]=Integer.parseInt(br.readLine() );
    
    }
    System.out.println(".........................");
    int k ;
    boolean j = true;
for(k=0;k<arr.length-1;k++)
{
    if (arr[k]>arr[k+1]) {
         j = false;
         
         break;
        
    }
    System.out.println("step "+k );
    
}
if (j) {
    System.out.println("all the elements are in ascending order: @");
    
}else
System.out.println("all the elements are not in order at all......: ");

   

    

            
}
} 