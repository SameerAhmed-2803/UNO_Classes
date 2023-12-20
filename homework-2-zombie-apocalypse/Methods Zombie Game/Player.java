import java.awt.Rectangle;
public class Player {
    // Player Data
    private static String image;
    private static int width;
    private static int height;
    private static int x;
    private static int y;
    public static boolean isAttacking;
    private static int food = 100;
    private static String idle;
    private static String dash;
    private static String sprite;
    // Character link: https://deadrevolver.itch.io/pixel-prototype-player-sprites

    public static void draw() {
        StdDraw.picture(x + width / 2, y + height / 2, sprite);
        StdDraw.text(150, 20, "X: " + x);
        StdDraw.text(150, 50, "Y: " + y);
    }

    public static void update() {
        Player.move();
        Player.topLimit();
        Player.bottomLimit();
        Player.leftLimit();
        Player.rightLimit();
        if(Food.isTouching() == true && food <= 200){
            food += 50;
        }
        else if(food > 200){
            food = 200;
        }
        if (SafeZone.isTouching() == true) {
            Game.setGameOver(true);
        }
        else if(Traps.isTouching() || SpikeTrap.isTouching() || FireTrap.isTouching() == true) {
            Game.setGameOver(true);
        }
        else if(Enemy.isTouching() == true || Enemy2.isTouching() == true){
            Game.setGameOver(true);
        }
        else if(food == 0){
            Game.setGameOver(true);
        }
    }

    public static void start() {
        idle = "assets/1.gif";
        dash = "assets/Run.gif";
        sprite = idle;
        width = 92;
        height = 67;
        x = 10;
        y = -15;
        isAttacking = false;
        Rectangle playerBox = new Rectangle(x, y, width, height);
    }

    public static void move() {
        if (StdDraw.hasNextKeyTyped()) {
            char key = StdDraw.nextKeyTyped();
            if (key == 'w') {
                moveUp();
                food--;
                sprite = dash;
            } else if (key == 's') {
                moveDown();
                food--;
                sprite = dash;
            } else if (key == 'a') {
                moveLeft();
                food--;
                sprite = dash;
            } else if (key == 'd') {
                moveRight();
                food--;
                sprite = dash;
            }
        } else {
            sprite = idle;
        }

    }

    public static int moveUp() {
        y -= 10;
        return y;
    }

    public static int moveDown() {
        y += 10;
        return y;
    }

    public static int moveLeft() {
        x -= 10;
        return x;
    }

    public static int moveRight() {
        x += 10;
        return x;
    }

    public static int getFood() {
        return food;
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

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }
    public static int getWidth(){
        return width;
    }
    public static int getHeight(){
        return height;
    }
}
