public class Game {
    private static boolean gameOver = false;
    private static int score = 0;
    public static void main(String[] args){
        start();    //Start game
        while(gameOver == false){
            update();   //update game
            render();   //render game
        }
    }
    public static void addScore(){
        score++;
    }
    public static void render(){
        Scene.draw();       //draw scene
        Enemy.draw();       //draw enemy
        Player.draw();      //draw player
        StdDraw.text(64, 32, "Score: " + score);
        StdDraw.show(100);   
    }

    public static void update(){
        Enemy.update();     //update enemy
        //check for input
        Player.update();    //update player
    }

    public static void start(){
        //setup all game data
        Scene.start();
        Enemy.start();
        Player.start();
    }
}
