package com.windsing.tech_point.about_date;

import java.util.Calendar;
import java.util.Date;

public class AboutDate {

    public static void main(String[] args) {
        Date date = new Date(2022, 8, 4);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 158);
        System.out.println(calendar.getTime());
    }
}
