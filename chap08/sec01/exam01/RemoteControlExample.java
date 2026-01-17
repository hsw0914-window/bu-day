package chap08.sec01.exam01;

import chap08.sec01.exam01.entity.Audio;
import chap08.sec01.exam01.entity.Television;
import chap08.sec01.exam01.iface.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
    }
    
}
