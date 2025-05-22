
import java.util.Scanner;

public class Cars {
    int noOfWheels;
    String colour;
    String name; 
    int noOfSeats;
    float fuel;
    public void defineCar(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of car : ");
        name = sc.nextLine();
        System.out.print("Enter colour of car : ");
        colour = sc.nextLine();
        System.out.print("Enter no of wheels : ");
        noOfWheels = sc.nextInt();
        System.out.print("Enter no of seats : ");
        noOfSeats = sc.nextInt();
        System.out.print("Enter no of wheels : ");
        
    }
    public void start(){
        if(fuel ==0){
            System.out.println("Car is out of fuel");
        }
        else if(fuel<5){
            System.out.println("Car is in Reserved mode ");
            fuel--;
            drive();
        }
        else {
            System.out.println("Car is starting......bruhhhh...... ");
            fuel--;
            drive();
        }
    }
    public void drive(){
        // fuel =10;
        while(fuel>0)
        {
        System.out.println("Car is Driving");
        fuel--;
        }
    }
    public void getFuel(float n){
        fuel+=n;
    }
    public float tellFuel(){
        return fuel;
    }
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        System.out.println("Hello");
    }
    
}
