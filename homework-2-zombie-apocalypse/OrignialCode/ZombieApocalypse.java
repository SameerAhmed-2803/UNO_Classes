/*
* Zombie Apocalypse A Roguelike Survival Game
* Author: Sameer Ahmed
*/
import java.util.Scanner;

public class ZombieApocalypse{
    public static void main(String[] args){
    // Setup Game Data
    String ANSI_Green = "\u001B[32m";
    String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    String ANSI_Reset = "\u001B[0m";
    String ANSI_BLACK = "\u001B[30m";
    Scanner input = new Scanner(System.in);
    int foodCount = 10;
    boolean noFood = false;
    int mealX = (int) (Math.random() * 10);     //Lines 17-25 Are all of the food items that stop you from dying of hunger
    int mealY = (int) (Math.random() * 10);
    String mealTile = ("\uD83E\uDD59");         //Meal is a food item that more than fill you back up.
    String foodTile1 = "\uD83E\uDD6B";
    int foodX1 = (int) (Math.random() * 5);
    int foodY1 = (int) (Math.random() * 5);
    String foodTile2 = "\uD83E\uDD6B";
    int foodX2 = (int) (Math.random() * 7);
    int foodY2 = (int) (Math.random() * 7);
    boolean gameOver = false;
    boolean key = false;
    int colSize = 10;
    int rowSize = 10;
    String floorTile = ". ";
    int playerX = 0;
    int playerY = 0;
    String playerTile = "\uD83E\uDDCD";
    int exitX = colSize - 1;
    int exitY = rowSize - 1;
    String exitTile = "\uD83C\uDFDA";           //Unicode characters that adds a broken down  house skin to exit
    int zombieX1 = 5;
    int zombieY1 = 5;
    String zombieTile1 = "\uD83E\uDDDF";         //Unicode characters that add a zombie emoji
    int zombieX2 = 9;
    int zombieY2 = 3;
    String zombieTile2 = "\uD83E\uDDDF";
    int keyY =(int) (Math.random() * 10);
    int keyX =(int) (Math.random() * 10);
    String keyTile = "\uD83D\uDDDD ";
    int fireX = (int) (Math.random() * 9);
    int fireY = (int) (Math.random() * 9);
    String fireTile = "\uD83D\uDD25";
    int fireX2 = (int) (Math.random() * 4);
    int fireY2 = (int) (Math.random() * 4);
    String fireTile2 = "\uD83D\uDD25";
    int fireX3 = (int) (Math.random() * 7);
    int fireY3 = (int) (Math.random() * 7);
    String fireTile3 = "\uD83D\uDD25";
    // Main Game Loop
    while(gameOver == false){
    // 1. Draw Game Scene 
    System.out.printf("Food left = %d bites\n", foodCount);
    for(int y = 0; y < rowSize; y++){           //Start outer for-loop (rows)                                       
        for(int x = 0; x < colSize; x++){       //Start inner for-loop (columns)
            if(playerX == 10){                                              //The following two if else statements are made so
                System.out.print("\nYou can't go outside of the map!\n");   //the player can't leave the play area
                playerX = rowSize - 1;
            }
            else if(playerX == -1){
                System.out.print("\nYou can't go outside the map!\n");
                playerX = 0;
            }
            if(playerY == 10){
                System.out.print("\nYou can't go outside of the map!\n");
                playerY = colSize - 1;
            }
            else if(playerY == -1){
                System.out.print("\nYou can't go outside of the map!\n");
                playerY = 0;
            }
            if(x == playerX && y == playerY){   //If this grid coord is player's position
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + playerTile + ANSI_Reset);   //...print player tile.
            }
            else if(x == exitX && y == exitY){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + exitTile + ANSI_Reset);
            }
            else if(x == zombieX1 && y == zombieY1){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + zombieTile1 + ANSI_Reset);
            }
            else if(x == zombieX2 && y == zombieY2){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + zombieTile2 + ANSI_Reset);
            }
            else if (x == keyX && y == keyY){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + keyTile + ANSI_Reset);
            }
            else if(x == fireX && y == fireY){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + fireTile + ANSI_Reset);
            }
            else if(x == fireX2 && y == fireY2){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + fireTile2 + ANSI_Reset);
            }
            else if(x == fireX3 && y == fireY3){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + fireTile3 + ANSI_Reset);
            }
            else if(x == foodX1 && y == foodY1){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + foodTile1 + ANSI_Reset);
            }
            else if(x == foodX2 && y == foodY2){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + foodTile2 + ANSI_Reset);
            }
            else if(x == mealX && y == mealY){
                System.out.print(ANSI_GREEN_BACKGROUND + ANSI_Green + mealTile + ANSI_Reset);
            }
            else{                                                                                 //else
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_BLACK + floorTile + ANSI_Reset);        //Draw floor tile
            }
        }                                       //End inner for-loop (x-axis)
        System.out.print("\n");                 //New line for next row
    }                                           //End outer for-loop (y-axis)
    // 2. Get Player Input 
    String choice = input.nextLine();
    // 3. Execute Player Action
    if(choice.equals("w")){
        playerY--;
        System.out.println("\033[H\033[2J");
    }
    else if(choice.equals("s")){
        playerY++;
        System.out.println("\033[H\033[2J");
    }
    else if(choice.equals("d")){
        playerX++;
        System.out.println("\033[H\033[2J");
    }
    else if(choice.equals("a")){
        playerX--;
        System.out.println("\033[H\033[2J");
    }
    if(playerX == foodX1 && playerY == foodY1){
        foodCount += 5;
        foodTile1 = ANSI_GREEN_BACKGROUND + ANSI_BLACK + floorTile + ANSI_Reset;
    }
    else if(playerX == foodX2 && playerY == foodY2){
        foodCount += 5;
        foodTile2 = ANSI_GREEN_BACKGROUND + ANSI_BLACK + floorTile + ANSI_Reset;
    }
    else if(playerX == mealX && playerY == mealY){
        foodCount += 10;
        mealTile = ANSI_GREEN_BACKGROUND + ANSI_BLACK + floorTile + ANSI_Reset;

    }
    if(foodCount == 0){
        noFood = true; 
    }
    else if(foodCount != 0){
        foodCount--;
    }
    
    // 4. Check Win Condition
    if(playerX == keyX && playerY == keyY){                                 //Added feature where if the player doesn't get the key the game won't end.
        key = true;
        System.out.println("You got the key, now find the safe zone!");
        keyTile = ANSI_GREEN_BACKGROUND + ANSI_BLACK + floorTile + ANSI_Reset;
    }
    if(playerX == exitX && playerY == exitY && key == true){
        gameOver = true;
        System.out.println("You survived the day and made it to a safe zone!");
    }
    else if(playerX == exitX && playerY == exitY && key == false){
        System.out.println("To enter the safe zone you need to find the key!");
    }
    
    
    // 5. Execute Monster Action 
    int zombieChoice = (int) (Math.random() * 4 );
    int zombieChoice2 = (int) (Math.random() * 4 );
    if (zombieChoice == 0){
        zombieX1 = (zombieX1 + 1) % colSize;
    }
    else if(zombieChoice == 1){
        zombieX1 = --zombieX1 >= 0 ? zombieX1 : (colSize - 2);
    }
    else if(zombieChoice == 2){
        zombieY1 = --zombieY1 >= 0 ? zombieY1 : (rowSize - 2);
    }
    else if(zombieChoice == 3){
        zombieY1 = (zombieY1 + 1) % rowSize;
    }
    if (zombieChoice2 == 0){
        zombieX2 = (zombieX2 + 1) % colSize;
    }
    else if(zombieChoice2 == 1){
        zombieX2 = --zombieX2 >= 0 ? zombieX2 : (colSize - 2);
    }
    else if(zombieChoice2 == 2){
        zombieY2 = --zombieY2 >= 0 ? zombieY2 : (rowSize - 2);
    }
    else if(zombieChoice2 == 3){
        zombieY2 = (zombieY2 + 1) % rowSize;
    }
    // 6. Check Lose Condition
    if(playerX == zombieX1 && playerY == zombieY1){
        gameOver = true;
        System.out.println("Your brain were eaten by the zombie");
    }
    if(playerX == fireX && playerY == fireY){
        gameOver = true;
        System.out.println("You fell into a trap!");
    }
    if(playerX == fireX2 && playerY == fireY2){
        gameOver = true;
        System.out.println("You fell into a trap!");
    }
    if(playerX == fireX3 && playerY == fireY3){
        gameOver = true;
        System.out.println("You fell into a trap!");
    }
    if(noFood == true){
        gameOver = true;
        System.out.println("You ran out of food and died of hunger!");
    }
        } 
    }
}