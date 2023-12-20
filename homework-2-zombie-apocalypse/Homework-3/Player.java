public class Player {
    //Player Data
    private static String image;
    private static int width;
    private static int height;
    private static double x;
    private static double y;
    private static boolean isAttacking;

    public static void draw(){
        StdDraw.picture(x + width /2, y + height / 2, image);
    }
    public static void start(){
        image = "assets/aimer.png";
        width = 32;
        height = 32;
        x = Scene.getWidth()/2;
        y = Scene.getHeight()/2;
        isAttacking = false;
    }
    public static void move(){
        x = StdDraw.mouseX() - width/2;
        y = StdDraw.mouseY() - height/2;
    }
    public static void update(){
        move();
        attack();
    }
    public static void attack(){
        if(StdDraw.mousePressed()){
            isAttacking = true;
        }
        else{
            isAttacking = false;
        }
    }
    public static double getLeft(){
        return x;
    }
    public static double getTop(){
        return y;
    }
    public static double getBottom(){
        return y + height;
    }
    public static double getRight(){
        return x + width;
    }
    public static boolean isAttacking(){
        return isAttacking;
    }
}
