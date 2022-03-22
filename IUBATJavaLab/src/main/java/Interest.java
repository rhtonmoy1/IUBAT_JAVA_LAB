
import java.util.Scanner;

/**
 * XP-1
 * @author Tonmoy
 */
public class Interest {


    public static void main(String[] args) {
        
        int P;
        int R;
        int N;
   
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter amount, rate interest of interest and number of years:");

   
    P = myObj.nextInt();


    R = myObj.nextInt();
    N = myObj.nextInt();
    
    double SI = (P*R*N)/100;

    System.out.println("amount: " + P);
    System.out.println("rate of interest: " + R);
    System.out.println("number of years: " + N);
    System.out.println("simple interest:" +SI);
    }
    
}
