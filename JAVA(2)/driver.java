public class driver {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.drive();
        System.out.println(myCar.tellFuel());
        //myCar.defineCar();
        Cars swift = new Cars();
        swift.getFuel(7);
        swift.start();
        swift.drive();
    }
    
}
