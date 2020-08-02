package test.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterCase {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    System.out.println(LocalDate.parse("2020-01-16 15:17:27", formatter));
                }
            });
            thread.start();
        }
    }

}
