import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String toParse = "2023-03-01T13:00:00Z";
        System.out.println("offset: " + dateTime(toParse));
        OffsetDateTime dateTime = dateTime(toParse);
        System.out.println("data: " + toDate(dateTime));
    }

    public static OffsetDateTime dateTime (String string) {
        OffsetDateTime dateTime = OffsetDateTime.parse(string);
        return dateTime;
    }

    public static String toDate (OffsetDateTime dateTime) {
        String date = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));
        return date;
    }
}