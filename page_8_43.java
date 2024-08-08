import java.util.*;


public class page_8_43 {

    // static void bubbleSort(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 // swap arr[j] and arr[j+1]
    //                 System.out.println(arr[j]);
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
     
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[10];
        System.out.println("Enter  10 numbers:");
        // int l = arr[0];
        int largest = 0 ;
        int slargest = 0 ;
        
        for (int i=0;i<10;i++){
        int n = sc.nextInt();
         if (n>largest) {
            slargest=largest;
            largest = n;
            
         } else if (n>slargest && n<largest) {
             slargest = n;
            
         }
        }

        // for (int i=0;i<arr.length;i++) 
        //     arr[i] = sc.nextInt();


            // for(int i= 1 ; i<arr.length; i++)
            // {
            //     if (arr[i]>l) {
            //         lar= l;
            //         l = arr[i] ;
                    
                    
            //     }

            // }
            System.out.println(" second largest: " + slargest  );
    }
    

}
