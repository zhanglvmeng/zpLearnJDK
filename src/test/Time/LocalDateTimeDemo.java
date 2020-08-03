package test.Time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import static java.time.ZoneId.SHORT_IDS;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
//        testLocalDate();
//        testLambda();
//        testLocalTime();
//        testInstant();
//        testLocalDate();
        testClockAndSystemCurrentTime();
    }

    public static void testLambda() {
        int[] result = Arrays.stream(new int[]{1, 3,2,4,5,6,7,8,2}).distinct().sorted().toArray();
        System.out.println(Arrays.toString(result));
    }

    public static void testLocalDate() {
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth());
//        System.out.println(firstDayOfThisMonth);
//        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
//        System.out.println(lastDayOfThisMonth);

//        // 获取默认时区的LocalDate
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        System.out.println(now.getYear());
//        System.out.println(now.getMonthValue());
//        System.out.println(now.getDayOfYear());
//        System.out.println(now.getDayOfMonth());
//        System.out.println(now.getDayOfWeek());
//
//        // 获取指定时区的LocalDate
//        LocalDate now2 = LocalDate.now(ZoneId.of(SHORT_IDS.get("CTT")));
//        System.out.println(now2);
//
//        System.out.println(now2.equals(now));
//
//        // 获取指定日期的localDate
        LocalDate now3 = LocalDate.now();
//        System.out.println(now3.getYear());
//        System.out.println(now3.getMonthValue());
//        System.out.println(now3.getDayOfYear());
//        System.out.println(now3.getDayOfMonth());
//        System.out.println(now3.getDayOfWeek());

        System.out.println(now3.plus(1, ChronoUnit.WEEKS));
//        // MonthDay
//        MonthDay monthDay = MonthDay.from(now3);
//        MonthDay monthDay1 = MonthDay.of(1,1);
//        if (monthDay.equals(monthDay1)) {
//            System.out.println("happy the same day");
//        } else {
//            System.out.println("not same");
//        }

    }

    public static void testLocalTime() {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.get(ChronoField.MONTH_OF_YEAR));

    }

    public static void testInstant() {
        Instant i = Instant.now();
        System.out.println(i.toEpochMilli());
        System.out.println(i.toString());
        Instant plus2hour = i.with(ChronoField.INSTANT_SECONDS, 12);
        System.out.println(plus2hour.toEpochMilli());
        System.out.println(plus2hour.toString());
    }

    public static void testClock() {
        LocalDate l = LocalDate.now();
        l.isLeapYear();
        Clock c = Clock.systemUTC();
        System.out.println(Clock.systemUTC().millis());
        System.out.println(System.currentTimeMillis());
        System.out.println(c.millis());
        System.out.println(System.currentTimeMillis() - c.millis());
    }

    public static void testClockAndSystemCurrentTime() {
        int times=Integer.MAX_VALUE;

        long start = System.currentTimeMillis();
        for (long i = 0; i < times; i++) {
            SystemClock.millisClock().now();
        }
        long end = System.currentTimeMillis();

        System.out.println("SystemClock Time:" + (end - start) + "毫秒");

        long start2 = System.currentTimeMillis();
        for (long i = 0; i < times; i++) {
            System.currentTimeMillis();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("SystemCurrentTimeMillis Time:" + (end2 - start2) + "毫秒");
    }


}
