package objects;


public class Book {
    String Title;
    String Author;
    String isbn;
    static int totalBook;
    boolean isBorrowed;
    String nameOfBorrower;
    // {
    //     totalBook = 0;
    // }
    Book(String isbn,String Title,String Author){
        this.isbn = isbn;
        this.Title = Title;
        this.Author = Author;

    }
    {
        totalBook++;
    }
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }


    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book Is Already borrowed");
        }else{
            this.isBorrowed =true;
            System.out.println("Enjoy the book");
        }
    }
    
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Book is returned\nHope you enjoyed it");
        }else{
            System.out.println("This book is Already in library");
        }
    }
    public static int getTotalBooks(){
        return totalBook;

    }
    // public void searchBook(String Title,String Author){
    //     System.out.print("isbn of the following book is "+isbn);
    // }
    public static void main(String[] args) {
        Book java = new Book("1","Java","Prashat sir");
        Book clang = new Book("2");
        System.out.println(getTotalBooks());
        java.borrowBook();
        System.out.println("Enjoy "+java.Title);
        
        clang.borrowBook();
        java.borrowBook();
        clang.returnBook();
        clang.returnBook();
    }
}
