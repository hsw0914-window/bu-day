package chap06.sec05.exam03;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    static Singleton getInstance(){
        return singleton;
    }
    
}
