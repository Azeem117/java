public class testing {
    static{
        System.out.println("In Static block ");
    }

    {
        System.out.println("In init block");

    }
    public static void main(String[] args) {
        Cars myCab = new Cars("Black",4);
        System.out.println("Hello PSVM");

    }
    
}
