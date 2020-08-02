package test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatCase {
    //1、创建单例实例
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        //2、创建多个线程，并启动
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    try {
                        //3、使用单例日期实例解析文本
                        System.out.println(sdf.parse("2017-12-13 15:17:27"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            //4、启动线程
            thread.start();
        }
    }
}
