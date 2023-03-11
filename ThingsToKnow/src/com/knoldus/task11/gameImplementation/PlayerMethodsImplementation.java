package com.knoldus.task11.gameImplementation;
import com.knoldus.task11.game.Player;

public class PlayerMethodsImplementation {
    public static void main(String args[])
    {
        //creating players and displaying their details
        Player player1 = new Player();
        player1.setPlayerDetails("Riya", 20, 3);
        System.out.println("The player 1 details are: "+player1.getName()+" "+player1.getScore()+" "+player1.getLevel());
        Player player2 = new Player();
        player2.setPlayerDetails("Sahil", 50, 5);
        System.out.println("The player 1 details are: "+player2.getName()+" "+player2.getScore()+" "+player2.getLevel());
    }
}
