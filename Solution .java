import java.util.*;
    class Solution {
        public static String minRemoveToMakeValid(String s) {
            int o = 0;
            // char s =  " ( ";
            // char t =  " ) ";
            for(int i = 0;i<s.length() ; i++)
            {
                char ch = s.charAt(i);
                if(ch == 40)
                {
                    o++;
                }
                else if (ch== 41)
                {
                    o--;
                }
            }
            
        }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the string :");
            String str=scanner.nextLine();
            System.out.println("The minimum removal to make valid is: "+minRemoveToMakeValid(str));
        
        }
    }
   
    

