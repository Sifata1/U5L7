import java.util.Locale;

public class RaceUtility
{
    // write your utility class here!
    public static double milesToKm(double miles) {
        return (miles * 1.60934);
    }

    public static double kmToMiles(double km) {
        return (km / 1.60934) ;
    }

    public static String makeProper(String title) {
        String proper = "";
        String space = " ";
        String firstLetter = String.valueOf(title.charAt(1));
        firstLetter = firstLetter.toLowerCase(Locale.ROOT);

        for (int i = 1; title.charAt(i) == " "; i++) {
            if () {

            }
        }
        return proper;


    }
}
