
import java.util.Scanner;

public class Book {
    String Title;
    String Author;
    String isbn;
    static int totalBook;
    boolean isBorrowed;
    String nameOfBorrower;
    Static {
        totalBook = 0;
    }
    
    

    public void borrowBook(String name ){
        Scanner s = new Scanner(System.in);
        this.nameOfBorrower = name;
        int n;
        System.out.print("Enter Number of books to be borrowed : ");
        n = s.nextInt();
        System.out.print("Book Have Been Given");
        totalBook -= n;

    }
    public void returnBook(int noOfBookToReturn){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of books to be returned : " );
        noOfBookToReturn = sc.nextInt();
        totalBook += noOfBookToReturn;
        System.out.print("Books Have Been Returned");
    }
    public static void getTotalBooks(){
        System.out.print("Total Number of Books In Library are : "+totalBook);

    }
    // public void searchBook(String Title,String Author){
    //     System.out.print("isbn of the following book is "+isbn);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
