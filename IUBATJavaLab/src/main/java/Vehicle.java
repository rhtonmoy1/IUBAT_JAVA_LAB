/**
 * XP-2
 * @author Tonmoy
 */
public class Vehicle {

    int no_of_wheel;
    int no_of_seats;
    String vehicle_color;
    String vehicle_model;
    Vehicle(String model, String color, int wheel, int seats){
        
        vehicle_model = model;
        vehicle_color = color;
        no_of_wheel = wheel;
        no_of_seats = seats;
        
    }
    
    public void display(){
        System.out.print("Description");
        System.out.println("\n******************");
        System.out.println("Vehicle Model:"+vehicle_model);
        System.out.println("Vehicle Color:"+vehicle_color);
        System.out.println("It has "+no_of_wheel+" wheels");
        System.out.println("It has "+no_of_seats+" seats\n");
    }
    public static void main(String[] args) {

        Vehicle car = new Vehicle("Premio","Black",4,5);
        Vehicle bike = new Vehicle("FZS V3","Red",2,2);
        System.out.print("Car ");
        car.display();
        System.out.print("Bike ");
        bike.display();
 
    }
    
}
