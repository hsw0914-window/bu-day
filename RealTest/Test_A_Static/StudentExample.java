package RealTest_0110.Test_A_Static;

public class StudentExample {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동");
        Student student2 = new Student("김철수");
        Student student3 = new Student("이영희");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        Student.showTotalCount();

        
        
    



    }
    
}
