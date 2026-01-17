package chap06.sec04.exam02;

public class Computer {
    int sum1(int[] values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    int sum2(int ... values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    public double areaCircle(double r){
        return 3.14159 * r * r;
    }
    
}
