package chap08.sec01.exam01;

import chap08.sec01.exam01.entity.SmartTelevision;
import chap08.sec01.exam01.iface.RemoteControl;
import chap08.sec01.exam01.iface.Searchable;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
        
    }
    
}
