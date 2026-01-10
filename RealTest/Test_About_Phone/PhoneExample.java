package RealTest_0110.Test_About_Phone;

public class PhoneExample {
    public static void main(String[] args) {
        Phone myPhone = new Phone("아이폰16", "화이트", 1250000);
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
        System.out.println("가격: " + myPhone.price + "원");
    }
    
}
