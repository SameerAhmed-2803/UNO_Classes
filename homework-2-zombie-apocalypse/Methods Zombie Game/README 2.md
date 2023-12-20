# Homework 2 Zombie Apocalypse
Author: Sameer Ahmed

Summary of code: 
The code is a basic one level zombie apocalypse game
that to win you have to keep an eye of your food level so that you don't die of
hunger. The other win condition is that you have to enter the safe zone. 
The way you would end up losing the game is by either getting touched by the zombies
on the map moving randomly or by falling into the traps.

The player moves on the play field when either w, a, s, or d key is pressed.

Features added onto the base game are listed below:
    Graphic Play Field
    Customized skins set for the player, zombies, food, safezone, and traps.
    Added a food counter that starts off with 100 food and when it hits zero it ends the 
    game and to not lose of hunger a food can is placed randomly on the map. 
    Added multiple zombies that all move randomly on the play field.
    Made it so that the player, zombies, food, and traps can not go off the play field.
    Multiple traps were also added onto the play field that instantly end the game if touched.

The way to play my version of the game is to keep an eye on the food bar so that you 
don't die of hunger. The way to gewt rid of that problem would be to move the players towards
the canned food on the map. It gives back 50 food and the max a player can hold would be 200.

The way to actually win the game comes down to if you can make it to the safezone.

Ways to lose in the game are the food bar hitting zero as explained above and two other ways. The other ways 
to lose the game would be to move into a play tile that has Traps and instantly 
ends the game. The other instant game over is by getting touched by one of the two zombies.

Most of my graphics were found on the website: https://opengameart.org/
The character graphic was found on: https://deadrevolver.itch.io/pixel-prototype-player-sprites

Used the Rectangle api to make essentially hitboxes for the player, traps, and food. The "hitboxes"
were used to check if the rectangle of any of the things stated would cross if so it would activate
the code alinged with the thing.

The StdDraw api made by princeton was used to make all of the graphics and keyboard movements possible in this project.