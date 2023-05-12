package oop.game;

public class Pacman implements GamingConsole{


    public void up(){
        System.out.println("UP Pacman");
    }
    public void down(){
        System.out.println("DOWN PACMAN");
    }

    public void left(){
        System.out.println("LEFT PACMAN");
    }
    public void right(){
        System.out.println("Right PACMAN");
    }

    public void onlyPacman(){
        System.out.println("Only Pacman");
    }

}
