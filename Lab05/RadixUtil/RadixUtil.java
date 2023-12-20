public class RadixUtil {
    public static int base2(String binary) {
        parseInt(binary);
        int result = (int) (Math.log(binary) / Math.log(2));
        return result;
    }

    public static String base2(int decimal) {
        int result = (int) (Math.log(decimal) / Math.log(2));
        toString(result);
        return result;
    }
    public static int base8(String octal) {
        parseInt(octal);
        int result = (int) (Math.log(octal) / Math.log(8));
        return result;
    }

    public static String base8(int decimal) {
        int result = (int) (Math.log(decimal) / Math.log(8));
        toString(result);
        return result;
    }
    public static int base16(String hexadecimal) {
        parseInt(hexadecimal);
        int result = (int) (Math.log(hexadecimal) / Math.log(2));
        return result;
    }

    public static String base16(int decimal) {
        int result = (int) (Math.log(decimal) / Math.log(2));
        toString(result);
        return result;
    }
}
