import java.io.*; 
/**
 * page_5_17
 */
public class page_5_17 {

    

public static void main(String[] args)throws IOException {

     BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
    System.out.println("Enter the 10 element in array : ");
    int arr[]=new int[10];
    for(int i=0;i<10;i++){
        arr[i]=Integer.parseInt(br.readLine() );
    
    }
    System.out.println(".........................");
    int k;
    boolean j = true;
for(k=0;k<arr.length;k++)
{
    if (arr[k]!=arr[0]) {
         j = false;
         
         break;
        
    }
    System.out.println("step "+k );
    
}
if (j) {
    System.out.println("all the elements are same : @");
    
}else
System.out.println("all the elements are not same: ");

    // while (arr[0] == arr[k]) {

    //     k++;
    //     System.out.println("all entered number are same.........");
        
    // }

    

            
}
} 