public class thisKey {
    float fuelInLit;

    public void start(){
        if(fuelInLit==0){
            System.out.println("Out Of Fuel , Cannot start");
        }else if(fuelInLit<5){
            System.out.println("Car - Reserve Mode,Refuel");
        }else{
            System.out.println("Car Is Driving ,bhuhhhhh...");
            fuelInLit--;
        }
    }
    public static void main(String[] args) {
        Cars myCar = new Cars();


    }
    
}
