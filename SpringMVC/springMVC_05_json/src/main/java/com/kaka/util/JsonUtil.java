package com.kaka.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @Author : kaka
 * @Date: 2021-10-13 17:22
 */
public class JsonUtil {

    public static String getJson(Object object){
        return getJson(object, "yyyy-MM-dd HH:mm:ss");
    }


    public static String getJson(Object object, String dateFormat){
        ObjectMapper mapper = new ObjectMapper();
        //使用ObjectMapper来格式化
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义时间格式
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        mapper.setDateFormat(format);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
