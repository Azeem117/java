
import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {
        int age;
        boolean gender;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Are you s female (T/F) :  ");
        gender = sc.nextBoolean();
        if(age<5) {
            System.out.println("75% Discount");
        }
        else if(gender) {
            System.out.println("50% discount");
        }
        else if(age>60&& !gender) {
            System.out.println("25% Discount");

        }
        else{
            System.out.println("No Discount");
        }
        

    }
    
}