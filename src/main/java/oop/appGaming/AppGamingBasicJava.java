package oop.appGaming;


import oop.game.GameRunner;
import oop.game.Pacman;

public class AppGamingBasicJava {

        public static void main (String[] args){

//            var game = new MarioGame();

            var game = new Pacman(); //1.: Object Creation

//            var game = new SuperContra();

             var gameRunner = new GameRunner(game); // 2:Object Creation + Wiring of Dependencies !
                // Game is a Dependency of GameRunner!

             game.onlyPacman();
            gameRunner.run();
        }
}
