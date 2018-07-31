package com.management.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: management
 * @description: 时间格式与字符串转化工具
 * @author: xw
 * @create: 2018-07-31 18:53
 */
public class TimeTool {
    public static Date stringToTime(String time){
        /*将字符串时间格式转化为Date时间类型*/
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try{
            Date newTime = new Date();
            newTime = dateFormat.parse(time);
            return newTime;
        }catch (ParseException e){
            e.printStackTrace();
            return null;
        }
    }

    public static String timetoString(Date date){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(date);
    }

}
