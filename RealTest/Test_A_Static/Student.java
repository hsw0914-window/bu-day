package RealTest.Test_A_Static;

public class Student {
    
    String name;
    static int totalCount = 0;

    Student(String name){
        this.name = name;
        ++totalCount;
    }

    void displayInfo(){
        System.out.println("학생의 이름 : " + this.name);
    }
    static void showTotalCount(){
        System.out.println("총 학생 수 : " + totalCount);
    }


}
