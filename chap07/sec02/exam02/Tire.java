package chap07.sec02.exam02;

public class Tire {
    public int maxRotation;
    public int accumulatedRatation;
    public String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }
    
    public boolean roll() {
        ++accumulatedRatation;
        if(accumulatedRatation < maxRotation) {
            System.out.println( location + "Tire 수명: " + (maxRotation-accumulatedRatation) + "회");
            return true;
        } else {
            System.out.println("***"+ location + "Tire 펑크 ***");
            return false;
        }
    }
}
