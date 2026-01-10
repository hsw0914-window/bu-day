package RealTest_0110.Test_A_SingleTon;

public class Company {                                          // 정적 필드
    private static Company instance = new Company();

    private Company(){}                                         // 생성자

    public static Company getInstance(){                        // 정적 메소드
        return instance;
    }
    
}
