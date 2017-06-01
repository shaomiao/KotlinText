package com.project.kotlintext;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author shaomiao
 * @Date 2017/5/31
 * @Time 9:53
 */

public class Test {

    public static void main(String args[]) {
        System.out.println("Hello World!");

        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "HH:mm");
        Date date = new Date();
//        System.out.println(dateFormat.format(date));
        if (date.getHours() < 30) {
            date.setMinutes(0);
        } else if (date.getHours() > 30) {
            date.setMinutes(30);
        }
        while (true) {
            date = time(date);
            System.out.println(dateFormat.format(date));
            if (date.getHours() == 0) {
                break;
            }
        }


//        Calendar rightNow = Calendar.getInstance();
//        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
////        Date date = new Date();
//        if (hour<30) {
//            rightNow.set(Calendar.MINUTE, 0);
//        } else if (hour>30) {
////            date.setMinutes(30);
//            rightNow.set(Calendar.MINUTE,30);
//        }
//
//        for(int i = 0 ;i <100;i++) {
//            rightNow = time(rightNow);
////            System.out.println(rightNow);
//            System.out.println(rightNow.get(Calendar.HOUR_OF_DAY)+":"+rightNow.get(Calendar.MINUTE));
//            if (hour==0) {
//                break;
//            }
//        }

    }

    private static Calendar time(Calendar date) {
        long curren = date.getTimeInMillis();
        curren += 30 * 60 * 1000;

//        Date da = new Date(curren);
        Calendar c9 = Calendar.getInstance();

        c9.setTimeInMillis(curren);
        return c9;
    }

    private static Date time(Date date) {
        long curren = date.getTime();
        curren += 30 * 60 * 1000;
        Date da = new Date(curren);
        return da;
    }

    private static void time() {
        long curren = System.currentTimeMillis();
        curren += 30 * 60 * 1000;
        Date da = new Date(curren);
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "HH:mm");
        System.out.println(dateFormat.format(da));
    }
}
