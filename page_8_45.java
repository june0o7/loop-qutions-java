import java.io.*;
import java.util.*;

public class page_8_45 {

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

        // System.out.println("enter the size of the list : ");
        // int n = Integer.parseInt(br.readLine());
        int[] arr= new int[100];
        int q=0 ;
        boolean u = true;
        System.out.println("press zero to initiate.....");
        while (true) {
            System.out.print("Enter element "+(q+1)+" :");
            //String s=br.readLine();
            int num=Integer.parseInt(br.readLine());
            if(num!=0){
                arr[q]=num;
                q++;
                
            }else
             break;
           
            
        }
// show(arr);
        // for(int i=0;i<100;i++)  // to take input from user and store it in array
        // {
        //     System.out.print("Enter element "+(i+1)+" :");
        //     //String s=br.readLine();
        //     arr[i]=Integer.parseInt(br.readLine());
        // }


int sumofpeven = 0;
int sumofpodd = 0;
int sumofn = 0;

        for(int i=0;i<arr.length;i++)   {
            // for(int i : arr.length)   {
            if (arr[i]>0 && arr[i]%2==0) {
                sumofpeven += arr[i];
            } else if (arr[i] > 0 && arr[i] %  2 != 0){
                sumofpodd += arr[i];
            }else
            sumofn += arr[i];
             
                
            }

            
            System.out.println("sum of all negative numbers : "+ sumofn);
            System.out.println("sum of all positive odd numbers : "+ sumofpodd);
            System.out.println("sum of all positive even numbers : "+ sumofpeven);
        }


        
    }
    


