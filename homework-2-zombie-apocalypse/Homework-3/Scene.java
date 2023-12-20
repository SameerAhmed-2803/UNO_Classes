public class Scene {
    //Scene data --> accessible only within this class since labeled private.
    private static String image;
    private static int width = 500;
    private static int height = 375;

    //Draws scene
    public static void draw(){
        StdDraw.picture(width/2, height/2, image);
    }

    public static void start(){
        //Setup canvas data (size & scale)
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0.0, width);
        StdDraw.setYscale(height, 0.0);
        image = "assets/background.png";
    }
    public static int getWidth(){
        return width;
    }
    public static int getHeight(){
        return height;
    }
}
