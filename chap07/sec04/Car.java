package chap07.sec04;

public class Car {
    public int speed;

    public void speedp() {
        speed +=1;
    }

    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
    
}
