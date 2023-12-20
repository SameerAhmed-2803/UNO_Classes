public class SafeZone {
    private static int x = 400;
    private static int width = 20;
    private static int y = 445;

    public static void draw() {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(x, 580, width, 25);
    }
    public static boolean isTouching(){
        boolean isTouching;
        if(Player.getX() == 350 && Player.getY() == SafeZone.y){
            isTouching = true;
        }
        else{
            isTouching = false;
        }
        return isTouching;
    }
}