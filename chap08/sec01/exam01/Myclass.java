package chap08.sec01.exam01;

import chap08.sec01.exam01.entity.Television;
import chap08.sec01.exam01.entity.Audio;
import chap08.sec01.exam01.iface.RemoteControl;

public class Myclass {

    RemoteControl rc = new Television();
    
    Myclass(){

    }

    Myclass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);

    }

    void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }
}
