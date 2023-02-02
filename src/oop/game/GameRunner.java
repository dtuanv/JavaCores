package oop.game;

public class GameRunner {

//    MarioGame game;

    GamingConsole game;
//    public GameRunner(MarioGame marioGame) {
//
//        this.game = marioGame;
//    }

    public GameRunner(GamingConsole gamingConsole){
        this.game = gamingConsole;
    }

    public void run(){
        System.out.println("run function in  GameRunner is called... Running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
