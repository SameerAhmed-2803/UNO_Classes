public class Game {
    private static boolean gameOver;
    public static void main(String[] args){
        start();
        while(gameOver == false){
            update();
            render();
        }
    }
    public static void render(){
        Scene.draw();
        Player.draw();
        Hud.draw();
        Enemy.draw();
        Enemy2.draw();
        SafeZone.draw();
        Traps.draw();
        SpikeTrap.draw();
        FireTrap.draw();
        Food.draw();

        StdDraw.show(100);
    }
    public static void update(){
        Player.update();
        Enemy.update();
        Enemy2.update();
        Traps.update();
        SpikeTrap.update();
        FireTrap.update();
        Food.update();
    }
    public static void start(){
        Scene.start();
        Player.start();
        Enemy.start();
        Enemy2.start();
        Traps.start();
        SpikeTrap.start();
        FireTrap.start();
        Food.start();
    }
    public static void setGameOver(boolean gameOver){
        Game.gameOver = gameOver;
    }
}
