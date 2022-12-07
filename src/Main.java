public class Main
{
    public static void main(String[] args)
    {
        double miles1 = 13.85;
        double miles2 = 26.42;

        double km1 = 40;
        double km2 = 3.5;

        System.out.println(RaceUtility.milesToKm(miles1));
        System.out.println(RaceUtility.milesToKm(miles2));

        System.out.println(RaceUtility.kmToMiles(km1));
        System.out.println(RaceUtility.kmToMiles(km2));

        String title = "welcome to the marathon!";
        System.out.println(RaceUtility.makeProper(title));

        String title2 = "It's TIME for THE 5k!";
        System.out.println(RaceUtility.makeProper(title2));
    }
}
