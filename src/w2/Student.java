package w2;

/**
 *
 * @author Oecophylla
 */
public class Student {
    String fName;
    String lName;
    int stuId;
    String stuStatus;
    
    public Student(String fName, String lName, int stdId, String stdStat) {
        this.fName = fName;
        this.lName = lName;
        stuId = stdId;
        stuStatus = stdStat;
    }
    
    public void showStudent() {
        System.out.printf("Student Name: %s %s \n", fName, lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
    
    public static void main(String[] args) {
        Student std = new Student("Lisa", "Palombo", 123456789, "Active");
        std.showStudent();
    }
}
