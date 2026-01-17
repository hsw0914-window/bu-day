package chap08.sec01.exam01;

import chap08.sec01.exam01.entity.Audio;
import chap08.sec01.exam01.entity.Television;



public class MyclassExample {
    public static void main(String[] args) {
        System.out.println("----------------");

        Myclass myClass1 = new Myclass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)--------------");

        Myclass myClass2 = new Myclass(new Audio());

        System.out.println("3)--------------");

        Myclass myClass3 = new Myclass();
        myClass3.methodA();

        System.out.println("4)--------------");
        Myclass myClass4 = new Myclass();
        myClass4.methodB(new Television());








    }
    
}
