package com.tamerb.game;


import com.tamerb.game.character.player.Player;

import java.util.Scanner;

public class Game {

    static final Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Patika Adventure Game! ");
        System.out.println("-------------------------------------");
        System.out.print("\tPlease enter a name : ");

        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("\tAre u ready for adventure " + player.getPlayerName() + " ?");
        System.out.println("\tOK... Let's start");
        player.selectChar();



    }


}
