import java.util.Scanner;
/**
 *
 * @author pandi
 */

public class factor {

     public static void main(String[] args) {
        
           Scanner hack =new Scanner(System.in);  //hack is scanner variable name
           System.out.println("Enter the number: ");
           int n=hack.nextInt();  //n is input variable 
             for(int i=1;i<=n;i++)
               {
                    if (n%i==0) {
                       System.out.println(i);
                    }   
               }
     }
}
          
