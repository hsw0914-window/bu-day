package chap05.sec03;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args){
        Week today = null;
        
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1:
                today = Week.SUNDAY;
                System.out.println("일요일");
                break;
            case 2:
                today = Week.MONDAY;
                System.out.println("월요일");
                break;
            case 3:
                today = Week.TUESDAY;
                System.out.println("화요일");
                break;
            case 4:
                today = Week.WEDNESDAY;
                System.out.println("수요일");
                break;
            case 5:
                today = Week.THURSDAY;
                System.out.println("목요일");
                break;
            case 6:
                today = Week.FRIDAY;
                System.out.println("금요일");
                break;
            case 7:
                today = Week.SATURDAY;
                System.out.println("토요일");
                break;
            
        }

        System.out.println("오늘 요일: " + today);

        if(today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부합니다.");
        }
    }
    
}
