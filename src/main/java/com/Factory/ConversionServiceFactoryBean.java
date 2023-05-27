package com.Factory;

import org.springframework.core.convert.converter.Converter;

import javax.xml.transform.Source;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ConversionServiceFactoryBean implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        Date date = null;
        if(source == null){
            throw new RuntimeException("请传入数据");
        }else{
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try{
                date = df.parse(source);

            } catch (ParseException e) {
                df = new SimpleDateFormat("yyyy/MM/dd");
                try{
                    date = df.parse(source);
                }catch (ParseException e1){
                    System.out.println("数据转换类型出错");
                    e1.printStackTrace();
                }


            }
        }
        return date;
    }
}
