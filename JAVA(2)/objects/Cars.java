
import java.util.Scanner;

public class Cars {
    int noOfWheels;
    String colour;
    String name; 
    int noOfSeats;
    static int onOfCarsSold;
    float fuel;
    //parametrized constructor
    public Cars(String colour,int noOfWheels) {
        this.colour = colour;
        

    }
    public Cars(){
         colour = "BLACK";
     }
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
    //part one of understanding
    // public void start(){
    //     if(fuel ==0){
    //         System.out.println("Car is out of fuel");
    //     }
    //     else if(fuel<5){
    //         System.out.println("Car is in Reserved mode ");
    //         fuel--;
    //         //drive();
    //     }
    //     else {
    //         System.out.println("Car is starting......bruhhhh...... ");
    //         fuel--;
    //         //drive();
    //     }
    // }
    
    // part 2nd
    public Cars start(){
        if(fuel ==0){
            System.out.println("Car is out of fuel");
        }
        else if(fuel<5){
            System.out.println("Car is in Reserved mode ");
            fuel--;
            //drive();
        }
        else {
            System.out.println("Car is starting......bruhhhh...... ");
            fuel--;
            //drive();
        }
        return this;
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

    static{
      onOfCarsSold =2;
        System.out.println("In Static Block");
        
    }
  
  
    {
        onOfCarsSold++;
        System.out.println("In {} Block");
   }
   
   
   
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        System.out.println("Hello");
    }
    
}
//improved code
// import java.util.Scanner;

// public class Cars {
//     // Constants
//     private static final String DEFAULT_COLOR = "BLACK";
//     private static final int MIN_FUEL_FOR_NORMAL_OPERATION = 5;

//     // Static variables
//     private static int carsSold = 0;

//     // Instance variables
//     private String color;
//     private String name;
//     private int numberOfWheels;
//     private int numberOfSeats;
//     private float fuelLevel;

//     // Static initialization block
//     static {
//         carsSold = 2;  // Initial cars sold
//         System.out.println("Static initialization: Cars class loaded");
//     }

//     // Instance initialization block (runs before each constructor)
//     {
//         carsSold++;
//         System.out.println("New car instance being created");
//     }

//     // Constructors
//     public Cars() {
//         this(DEFAULT_COLOR, 4);  // Default to black color and 4 wheels
//     }

//     public Cars(String color, int numberOfWheels) {
//         this.color = color;
//         this.numberOfWheels = numberOfWheels;
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         System.out.println("Cars class demonstration");
//     }

//     // User input method
//     public void defineCar() {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter name of car: ");
//         this.name = sc.nextLine();
        
//         System.out.print("Enter color of car: ");
//         this.color = sc.nextLine();
        
//         System.out.print("Enter number of wheels: ");
//         this.numberOfWheels = sc.nextInt();
        
//         System.out.print("Enter number of seats: ");
//         this.numberOfSeats = sc.nextInt();
//     }

//     // Car operation methods
//     public Cars start() {
//         if (fuelLevel == 0) {
//             System.out.println("Car is out of fuel");
//         } 
//         else if (fuelLevel < MIN_FUEL_FOR_NORMAL_OPERATION) {
//             System.out.println("Car is in reserve mode");
//             fuelLevel--;
//         } 
//         else {
//             System.out.println("Car is starting... vroom vroom...");
//             fuelLevel--;
//         }
//         return this;
//     }

//     public void drive() {
//         while (fuelLevel > 0) {
//             System.out.println("Car is driving");
//             fuelLevel--;
//         }
//         System.out.println("Out of fuel!");
//     }

//     // Fuel management methods
//     public void addFuel(float amount) {
//         if (amount > 0) {
//             fuelLevel += amount;
//             System.out.println("Added " + amount + " units of fuel");
//         }
//     }

//     public float checkFuelLevel() {
//         return fuelLevel;
//     }

//     // Getters and setters
//     public String getColor() {
//         return color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getNumberOfWheels() {
//         return numberOfWheels;
//     }

//     public void setNumberOfWheels(int numberOfWheels) {
//         this.numberOfWheels = numberOfWheels;
//     }

//     public int getNumberOfSeats() {
//         return numberOfSeats;
//     }

//     public void setNumberOfSeats(int numberOfSeats) {
//         this.numberOfSeats = numberOfSeats;
//     }

//     public static int getCarsSold() {
//         return carsSold;
//     }
// }