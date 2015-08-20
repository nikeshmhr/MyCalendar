package com.nikesh.mycalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMaker {

    private final int currentYear = new GregorianCalendar().get(Calendar.YEAR);
    private final int currentMonth = new GregorianCalendar().get(Calendar.MONTH);
    private final Calendar calendar;
    private int today;
    private int firstDay;
    private int lastDay;

    public CalendarMaker() {
        calendar = new GregorianCalendar();
        today = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        firstDay = calendar.get(Calendar.DAY_OF_WEEK);
        firstDay = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 27; i <= 32; i++) {
            calendar.set(Calendar.DAY_OF_MONTH, i);
            int j = calendar.get(Calendar.DAY_OF_MONTH);
            if (i > j) {
                lastDay = i - 1;
                break;
            }
            System.out.println("i = " + i + " j = " + j);
        }
        //System.out.println("First day = " + this.firstDay);
        System.out.println("lastday = " + this.lastDay);
    }

    public int getMonth() {
        return this.currentMonth;
    }

    public int getFirstDay() {
        return this.firstDay;
    }

    public int getToday() {
        return this.today;
    }

    public int getNextDay() {
        calendar.set(Calendar.DAY_OF_MONTH, today + 1);
        today = calendar.get(Calendar.DAY_OF_MONTH);
        if (today > 1) {
            return today;
        } else {
            return -1;
        }
    }

    public int getLastDay() {
        return this.lastDay;
    }
    public int getYear(){
        return this.currentYear;
    }
    /*
     public static void main(String[] args){
     new CalendarMaker();
     }
     */

}
