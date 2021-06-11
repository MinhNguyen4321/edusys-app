package com.edusys.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
    
    public static boolean isDate(String dateStr, String pattern){
        try {
            formatter.applyPattern(pattern);
            formatter.setLenient(false);
            formatter.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    public static int getAge(String birthDateStr){
        if (birthDateStr != null) {
            LocalDate birthDate = LocalDate.parse(birthDateStr, 
                    DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            return Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }
}
