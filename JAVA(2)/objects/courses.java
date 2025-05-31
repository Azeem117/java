public class courses {
    static int maximumCap = 100;
    String courseName ;
    int enrollments;

    courses(String courseName){
        this.courseName = courseName;
    }

    String[] enrolledStudents = new String[maximumCap];

    
    static void maximumCapacity(int maximumCap){
        courses.maximumCap = maximumCap;

    }   
    
    void enrolling(String name){
        enrolledStudents[enrollments] = name;
        enrollments++;

    }

    void unenroll(String name){
        System.out.println("Student removed");
        enrollments--;
    }
    
}
