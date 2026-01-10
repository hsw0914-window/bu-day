package RealTest_0110.Test_A_SingleTon;

public class CompanyExample {
    public static void main(String[] args) {
        
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        if( c1 == c2 ){
            System.out.println("같은 Company 객체입니다.");
        } else {
            System.out.println("다른 Company 객체입니다.");
        }
    }
    
}
