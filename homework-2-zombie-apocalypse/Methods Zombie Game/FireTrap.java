import java.awt.Rectangle;
public class FireTrap {
    
    private static String image;
    private static int width;
    private static int height;
    private static int x;
    private static int y;

    public static void draw() {
        StdDraw.picture(x + width, y + height, image);
    }

    public static void start() {
        image = "assets/Fire_Trap.png";
        width = 64;
        height = 76;
        x = (int)(Math.random() * 700);
        y = (int)(Math.random() * 445);
    }
    public static void update(){
        Traps.topLimit();
        Traps.bottomLimit();
        Traps.leftLimit();
        Traps.rightLimit();
    }
    public static boolean isTouching(){
        Rectangle trapBox = new Rectangle(FireTrap.x,FireTrap.y,17,17);
        Rectangle playerBox = new Rectangle(Player.getX(),Player.getY(),43,43);
        boolean isTouching;

        if(playerBox.intersects(trapBox)){
            isTouching = true;
        }
        else{
            isTouching = false;
        }
        return isTouching;
    }
    public static void topLimit() {
        if (y == -65) {
            y = -55;
        }
    }

    public static void bottomLimit() {
        if (y == 455) {
            y = 445;
        }
    }

    public static void leftLimit() {
        if (x == 0) {
            x = 10;
        }
    }

    public static void rightLimit() {
        if (x == 710) {
            x = 700;
        }
    }
    
    public static double getX(){
        return x;
    }
    public static double getY(){
        return y;
    }
}
