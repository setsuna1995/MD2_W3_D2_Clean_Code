public class Cylinder {
   private static double getBaseArea (int radius) {
       return  Math.PI * radius * radius;
    }
    private static double getPerimeter (double radius){
       return  2 * Math.PI  * radius;
    }
    public static double getVolume(int radius, int height){
double baseArea = getBaseArea(radius);
double perimeter = getPerimeter(radius);
        return perimeter * height + 2 * baseArea;
    }

}
