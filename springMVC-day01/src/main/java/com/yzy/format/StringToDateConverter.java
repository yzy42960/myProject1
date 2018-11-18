package com.yzy.format;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String s) {
        if (s==null){
            return null;
        }
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date =null;
        try {
           date=dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
