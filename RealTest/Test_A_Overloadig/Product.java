package RealTest.Test_A_Overloadig;

public class Product {
    String name;
    int price = 1000;

    Product(String name){
        this(name, 1000);
    }
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    
}
