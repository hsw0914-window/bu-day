package chap07.sec02.exam02;

public class HankookTire extends Tire {
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    @Override
    public boolean roll(){
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
