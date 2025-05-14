
import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter dimensions of triangle");
        Scanner sc = new Scanner(System.in);
        float b,h;
        System.out.print("Enter Height of Triangle : ");
        h = sc.nextInt();
        System.out.print("Enter Base of Triangle : ");
        b = sc.nextInt();
        float A;
        A =(float) ( 0.5*b*h);
        System.out.println("Area is : "+A);
        
    }
    
}
