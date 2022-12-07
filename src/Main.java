public class Main
{
    public static void printKmAndMiles(double miles, double km) {
        System.out.println(RaceUtility.milesToKm(miles));
        System.out.println(RaceUtility.kmToMiles(km));
    }

    public static void printProperTitle(String title) {
        System.out.println(RaceUtility.makeProper(title));
    }

    public static void main(String[] args)
    {
        double miles1 = 13.85;
        double km1 = 40;
        Main.printKmAndMiles(miles1,km1);

        double miles2 = 26.42;
        double km2 = 3.5;
        Main.printKmAndMiles(miles2,km2);

        double miles3 = 5;
        double km3 = 20.50;
        Main.printKmAndMiles(miles3,km3);

        double miles4 = 0;
        double km4 = 0;
        Main.printKmAndMiles(miles4,km4);

        String title = "welcome to the marathon!";
        Main.printProperTitle(title);

        title = "It's TIME for THE 5k!";
        Main.printProperTitle(title);

        title = "runners, take your marks...";
        Main.printProperTitle(title);

        title = "2 MILES TO GO!";
        Main.printProperTitle(title);

        title = "water break in 0.5 miles";
        Main.printProperTitle(title);
    }
}
