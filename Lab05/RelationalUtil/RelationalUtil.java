public class RelationalUtil {
    public static boolean isIncreasing(int x, int y, int z){
        return ((x < y) && (y < z));
    }
    public static boolean isDecreasing(int x, int y, int z){
        return ((x > y) && (y > z));
    }
    public static boolean isBetween(int x, int y, int z){
        return ((x <= y) && (y <= z));
    }
    public static boolean isPositive(int x){
        return (x > 0);
    }
    public static boolean isNegative(int x){
        return (x < 0);
    }
    public static boolean overlaps(int min1, int max1, int min2, int max2){
        return((min1 <= max2) && (min2 <= max1));
    }
}
