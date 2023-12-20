import java.awt.Rectangle;
public class Enemy {
    private static String image;
    private static int width;
    private static int height;
    private static int x;
    private static int y;
    private static long time;

    public static void draw() {
        StdDraw.picture(x + width / 2, y + height / 2, image, width, height);
    }

    public static void start() {
        image = "assets/idle.gif";
        width = 49;
        height = 72;
        x = (int)(Math.random() * 700);
        y = (int)(Math.random() * 445);
        time = System.currentTimeMillis();
    }

    public static void move() {
        int dx = ((int)(Math.random() * 3) - 1) * width;
        int dy = (((int)(Math.random() * 3) - 1)) * height;
        if(dx + x <= 0 || dx + x >= Scene.getWidth() - width){
            dx *= -1;
        }
        if(dy + y <= 0 || dy + y >= Scene.getHeight() - height){
            dy *= -1;
        }
        x += dx;
        y += dy;
        time = System.currentTimeMillis();
    }

    public static void update() {
        long now = System.currentTimeMillis();
        if (now - time > 250) {
            Enemy.move();
        }
        Enemy.topLimit();
        Enemy.bottomLimit();
        Enemy.leftLimit();
        Enemy.rightLimit();
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
    public static int getX(){
        return x;
    }
    public static int getY(){
        return y;
    }

    public static boolean isTouching(){
        Rectangle enemyBox = new Rectangle(Enemy.x,Enemy.y,43,43);
        Rectangle playerBox = new Rectangle(Player.getX(),Player.getY(),43,43);
        boolean isTouching;

        if(playerBox.intersects(enemyBox)){
            isTouching = true;
        }
        else{
            isTouching = false;
        }
        return isTouching;
    }
}
