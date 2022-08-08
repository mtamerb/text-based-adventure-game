package com.tamerb.game;


import com.tamerb.game.location.normalloc.toolstore.ToolStore;
import com.tamerb.game.player.Player;

import java.util.Scanner;

public class Game {

    static final Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Patika Adventure Game! ");
        System.out.println("-------------------------------------");
        System.out.print("\tPlease enter a name : ");

        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        player.selectChar();
        ToolStore ts = new ToolStore(player);
        ts.selectLocation();


    }


}
