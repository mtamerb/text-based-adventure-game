package com.tamerb.game;


import com.tamerb.game.player.Player;

import java.util.Scanner;

public class Game {

    private String playerName;
    static final Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Patika Adventure Game! ");
        System.out.println("-------------------------------------");
        System.out.print("\t Please enter a name : ");

        playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("\tAre u ready fro this "+ player.getName() + "? #");
        System.out.println("\tOK... Let's start");
        player.selectChar();
    }


}
