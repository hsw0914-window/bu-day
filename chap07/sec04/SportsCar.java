package chap07.sec04;

public class SportsCar extends Car {
    @Override
    public void speepUp{
        speed += 10;
    }
    
    @Override
    public void stop(){
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
}
