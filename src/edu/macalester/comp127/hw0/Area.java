package edu.macalester.comp127.hw0;

/**
 * @author Shilad Sen
 */
public class Area {
    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */
    public static double getSquareArea(double sideLength) {
        // TODO: replace me with the correct formula
        double area = sideLength * sideLength;
        //return sideLength * 1.0 * 42 +13;
        return area;
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        // TODO: replace me with the correct formula
        double area = 3.1415926535 * radius * radius;
        return area;
    }

}
