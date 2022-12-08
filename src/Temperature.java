public class Temperature
{
    private double highTemp;
    private double lowTemp;
    private String tempScale;
    public static final int FREEZING_TEMP_F = 32;
    private static double highestTrackedTempF = 0;
    private double lowestTrackedTempF = 0;

    public double getHighTemp() {
        return highTemp;
    }

    public double getLowTemp() {
        return lowTemp;
    }

    public String getTempScale() {
        return tempScale;
    }

    public static double getHighestTrackedTempF() {
        return highestTrackedTempF;
    }

    public double getLowestTrackedTempF() {
        return lowestTrackedTempF;
    }

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = high;
        lowTemp = low;

        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }

        if (scale.equals("F")) {
          if (high > highestTrackedTempF)  highestTrackedTempF = high;
          if (low < lowestTrackedTempF) lowestTrackedTempF = low;
        }

        if (scale.equals("C")) {
            double convertLow = convertCtoF(low);
            double convertHigh = convertCtoF(high);

            if (convertHigh > highestTrackedTempF)  highestTrackedTempF = convertHigh;
            if (convertLow < lowestTrackedTempF) lowestTrackedTempF = convertLow;
        }

    }

    public static boolean belowFreezing() {

    }
    // 1. Add your two static methods here:
    public static double convertCtoF(double temp) {
        return (temp * (double) 9/5) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * (double) 5/9;
    }

    // 2. Add your two instance methods here:
    public void changeToC() {
        if (tempScale.equals("F")) {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            tempScale = "C";
        }
    }

    public void changeToF() {
        if (tempScale.equals("C")) {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }


    // 3. Add your private static helper rounding "utility" method here:
    private static double roundToNearestTenth(double num) {
        double r  = Math.round((num * 10)/10);
        return r;
    }



    // 4. Complete the toString method below (using your static helper method)
    //    so it returns a String that prints like:

    //    High Temperature: 67.4 F (or C)
    //    Low Temperature: 58.3 F (or C)

    public String toString()
    {
        String high = "High Temperature: " + roundToNearestTenth(highTemp) + " " + tempScale;
        String low = "Low Temperature: " + roundToNearestTenth(lowTemp) + " " + tempScale;
        return high + "\n" + low;
    }
}

