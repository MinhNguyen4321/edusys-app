package com.edusys.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MinIT
 */
public class XDate {

    static SimpleDateFormat formatter = new SimpleDateFormat();

    public static Date toDate(String dateStr, String pattern) {
        try {
            formatter.applyPattern(pattern);
            return formatter.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(Date date, String pattern) {
        formatter.applyPattern(pattern);
        return formatter.format(date);
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
}
