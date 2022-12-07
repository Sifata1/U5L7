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
        String t = title.toLowerCase();
        String proper = "";
        String first = title.substring(0,1).toUpperCase();
        for (int i =1; i < title.length(); i++) {
            String letter = String.valueOf(t.charAt(i));
            if (letter.equals(" ")) {
                String cap = t.substring(i,i+2).toUpperCase();
                proper+= cap;
                i++;
            } else {
                proper+= letter;
            }
        }
        return first + proper;
    }
}
