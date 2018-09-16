package com.xp.anqa;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by 井小普 on 2018/5/2.
 * 时间格式化工具类
 */

public class DateUtils {
    @SuppressLint("SimpleDateFormat")
    public static String dateToString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        return df.format(date);
    }
}
