package chapter05;

import java.util.Calendar;

public class Code05_09 {
    public static void main(String[] args){
        Calendar calender=Calendar.getInstance();

        int day=calender.get(Calendar.DAY_OF_WEEK);     //DAY_OF_WEEK: 0~6

        char daych = 0;
        switch(day){
            case 1:
                daych='일';
                break;
            case Calendar.MONDAY:
                daych='월';
                break;
            case Calendar.TUESDAY:
                daych='화';
                break;
            case 4:
                daych='수';
                break;
            case 5:
                daych='목';
                break;
            case 6:
                daych='금';
                break;
            case 7:
                daych='토';
                break;
        }
        System.out.printf("오늘은 %c요일입니다",daych);
    }
}
