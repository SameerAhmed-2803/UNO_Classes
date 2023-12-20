public class Enemy {
    private static String image;
    private static int width;
    private static int height;
    private static double x;
    private static double y;
    private static long time;

    public static void draw(){
        StdDraw.picture(x+width/2, y+height/2, image);
    }

    public static void start(){
        image = "assets/target.png";
        width = 32;
        height = 32;
        x = Math.random() * Scene.getWidth() - width;
        y = Math.random() * Scene.getHeight() - height;
        time = System.currentTimeMillis();
    }
    public static void move(){
        x = Math.random() * Scene.getWidth() - width;
        y = Math.random() * Scene.getHeight() - height;
        time = System.currentTimeMillis();
    }
    public static void update(){
        long now = System.currentTimeMillis();
        if(now - time > 1000){
            Enemy.move();
        }
        if(Enemy.isTouching() && Player.isAttacking()){
            Enemy.move();
            Game.addScore();
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
    public static boolean isTouchingX(){
        return Player.getLeft() <= Enemy.getRight() && Enemy.getLeft() <= Player.getRight();
    }
    public static boolean isTouchingY(){
        return Player.getTop() <= Enemy.getBottom() && Enemy.getTop() <= Player.getBottom();
    }
    public static boolean isTouching(){
        return isTouchingX() && isTouchingY();
    }
}
