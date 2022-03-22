/**
 * XP-5-Subclass
 * @author Tonmoy
 */
public class Circle extends Point{
    double r;
    double pi= 3.1416;
    
    void Circle(int x, int y,double r){
        System.out.println("Circle Center: ("+x+", "+y+") Radius: "+r);
        
    }
    
   void getArea(double r){
        double area = pi*r*r;
        System.out.println("Area of the Circle: "+area);
    }
    
   void getCircumference(double r){
   
       double cf = 2*pi*r;
       System.out.println("CircumFerence: "+cf);
   }
   
    @Override
    public String toString(){
     String s = "x: "+ x + "y: "+ y +"r: "+r;
     return s;
   
   }
    
    }
    