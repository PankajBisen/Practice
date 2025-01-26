package java_practice.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateFormate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String dateTimeFormatter = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM, yyyy  HH:mm:ss"));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd MMM, yyyy  HH:mm:ss", Locale.ENGLISH);
        LocalDateTime parse = LocalDateTime.parse(dateTimeFormatter, dateTimeFormatter1);
        System.out.println(parse);
    }
}
