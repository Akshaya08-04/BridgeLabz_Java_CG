package CoreProgramming.Extras.BuiltInFunctions;
import java.time.ZonedDateTime;
import java.time.ZoneId;

class TimeZones {
    public static void main(String[] args) {

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT: " + gmt);
        System.out.println("Current Time in IST: " + ist);
        System.out.println("Current Time in PST: " + pst);
    }
}
