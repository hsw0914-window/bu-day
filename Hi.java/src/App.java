
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 N을 입력하세요: ");
        int N = scanner.nextInt();

        for( int i = 1; i<=N; i++){
            if( i % 7 == 0 && i % 11 == 0){
                System.out.println("7과 11의 공배수");
            } else if (i % 7 == 0){
                System.out.println("7의 배수");
            } else if ( i % 11 == 0){
                System.out.println("11의 배수");
            } else {
                System.out.println("일반숫자");
            }
        }
    }
}
