public class driver {
    String name;
    String DOL;
    static int minAge;
    int age;
    public boolean isAllowedToDrive(){
        return this.age>=minAge;
    }
    public static void main(String[] args) {
        // Cars myCar = new Cars();
        // myCar.drive();
        // System.out.println(myCar.tellFuel());
        // // myCar.defineCar();
        // Cars swift = new Cars();
        // swift.getFuel(7);
        // swift.start();
        // swift.drive();
        // // swift.start().drive();
        // driver myDriver = new driver();
        // myDriver.DOL = "1/JAN/2025";
        // System.out.println(minAge);
        Cars audi = new Cars("Black",4);
        audi.getFuel(8);
        audi.start().drive();
        Cars thar  = new Cars();
        thar.start().drive();
        
    }
    
}
