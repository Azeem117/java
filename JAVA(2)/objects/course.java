class course {
    //instance variable
    String course_name;
    String enrolled_student;
    int id;
    //static variable
    static int maxCapacity;

    //inctance method
    void enrollStudent(String name,int id){
        this.enrolled_student = name;
        this.id = id;
    }
    void unenrollStudent(String name , int id){
        this.enrolled_student = "Removed";
        this.id = 0;

    }
    static void setMaxCapacity(int capacity){
        course.maxCapacity = capacity;

    }
    public static void main(String[] args) {
        course azeem = new course();
        azeem.enrollStudent("Md Azeem",117);
        System.out.println(azeem.enrolled_student);
        System.out.println(azeem.id);
        azeem.unenrollStudent("Azeem",117);
        System.out.println(azeem.enrolled_student);
        System.out.println(azeem.id);
        azeem.maxCapacity = 15;
    }
}
