
import java.util.Scanner;

public class FarenToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f,c;
        System.out.print("Enter f : ");
        f = sc.nextFloat();
        c = (f-32)*5/9;
        System.out.println("Celcius : "+c);
    }
}