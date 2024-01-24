package cz.spsmb.sec.generics.utils;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class DateTimeUtils {
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
    public static DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_TIME;
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;

    public static <T extends Temporal> String format(T date) {
        if (!date.isSupported(ChronoField.YEAR)) {
            return timeFormatter.format(date);
        } else if (date.isSupported(ChronoField.HOUR_OF_DAY)) {
            return dateTimeFormatter.format(date);
        } else {
            return dateFormatter.format(date);
        }
    }
}
