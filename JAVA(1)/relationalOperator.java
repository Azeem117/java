
import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to driving license portal");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Age : ");
        n = sc.nextInt();
        if(n>=18){
            System.out.println("Eligible for Driving");

        }
        else{
            System.out.println("Beta cycle chlao");
        }
    }
}
