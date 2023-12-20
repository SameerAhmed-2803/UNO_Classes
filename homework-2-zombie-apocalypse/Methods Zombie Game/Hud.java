public class Hud {
    public static void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(50, 20, "Food: " + Player.getFood());
    }
}
