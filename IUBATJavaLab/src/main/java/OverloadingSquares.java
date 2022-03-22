/**
 * XP-3
 * @author Tonmoy
 */

public class OverloadingSquares {
    
    void squares(float x){
        System.out.println("Square of a number: "+Math.pow(x,2));
    }
        void squares(float x,float y){
        System.out.println("Square of a number: "+x*y);
    }
        void squares(double x){
        System.out.println("Square of a number: "+x*x);
    }

    public static void main(String[] args) {
        OverloadingSquares OS = new OverloadingSquares();
        OS.squares(5);
        OS.squares(5,5);
        OS.squares(5);
    }
    
}
