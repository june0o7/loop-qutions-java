import java.io.*;

/**
 * page_5_20
 */
public class page_5_20 {

    public static void main(String[] args) throws IOException {
    int s = 0 , t= 0  , u = 0 , x=0  ;
    double y = 0 , z=0 , zz = 0;
    System.out.println("20 / (i) : \n");

    for(int i = 1 ; i<10 ; i++)
    {
        s+=i*(i+1);
        System.out.println(s);

    }
    System.out.println("  ............................\n 20 / (ii) \n" );
    

        for(int j = 1 ; j<10 ; j+=2 ){
            t+=j*(j+1);
        System.out.println(t);


        }


        System.out.println("  ............................\n 20 / (iii) \n" );
    

        for(int j = 1 ; j<10 ; j++ ){
            u+=j*(j+2);
        System.out.println(u);


        }


        System.out.println("  ............................\n 20 / (iv) \n" );
    

        for(int j = 1 ; j<20 ; j+=2 ){
            x+=j-(j+1);
        System.out.println(x);


        }

        System.out.println("  ............................\n 20 / (v) \n" );
    

        for(int w = 1 ; w<=10 ; w++ ){
            y+=(1.0/w);
        System.out.println(y);


        }

        System.out.println("  ............................\n 20 / (vi) \n" );
    

        for(int w = 1 ; w<10 ; w++ ){
            z+=(w/(w+1.0));
        System.out.println(z);


        }


        System.out.println("  ............................\n 20 / (vii) \n" );
    

        for(int w = 1 ; w<=10 ; w++ )
        
        {
           // zz+=(w/(w+1.0));

           if (w%2==0) {
            zz-=1.0/(w);
            
           }
           else
           zz+=1.0/(w);
        System.out.println(zz);


        }
      
 
  



}
}