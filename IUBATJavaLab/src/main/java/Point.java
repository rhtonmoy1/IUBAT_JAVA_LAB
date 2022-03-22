/**
 * XP-5-Super class
 * @author Tonmoy
 */
public class Point {
    
    int x;
    int y;
    
  Point(int a,int b){
      x = a;
      y = b;
  }
  
    @Override
  public String toString(){
     String s = "x: "+ x + "y: "+ y;
     return s;
  }
    
    public static void main(String[] args) {
            Circle obj = new Circle();
            Circle(5,5,5);
           getArea(5);
           getCircumference(5);
    }
    
}
