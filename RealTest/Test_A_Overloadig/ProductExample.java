package RealTest.Test_A_Overloadig;

public class ProductExample {
    public static void main(String[] args) {
        Product p1 = new Product("삼각김밥");
        Product p2 = new Product("컵라면", 1500);

        System.out.println("p1: " + p1.name + ", " + p1.price);
        System.out.println("p2: " + p2.name + ", " + p2.price);

        
    }
}
