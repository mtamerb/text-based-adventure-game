package com.tamerb.game;


import com.tamerb.game.player.Player;

import java.util.Scanner;

public class Game {

    private String playerName;
    static final Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Patika Adventure Game! ");
        System.out.println("-------------------------------------");
        System.out.print("\tPlease enter a name : ");

        playerName = scan.nextLine();
        Player player = new Player(playerName);

    }


}
