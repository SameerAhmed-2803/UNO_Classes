public class Scene {
    private static String image;
    private static int width = 800;
    private static int height = 600;

    // Drawing the scene
    public static void draw() {
        StdDraw.picture(width / 2, height / 2, image);
    }

    public static void start() {
        // Setting up the canvas
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0.0, width);
        StdDraw.setYscale(height, 0.0);
        image = "assets/Dungeon Floor.png";
        
        
        // background link:
        // https://drunkenzebrastudio.files.wordpress.com/2011/12/topwall.png
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
