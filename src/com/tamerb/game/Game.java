package com.tamerb.game;


import com.tamerb.game.location.Location;
import com.tamerb.game.location.normalloc.SafeHouse;
import com.tamerb.game.location.normalloc.ToolStore;
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

        Location location = null;
        while (true) {
            System.out.println("\n\t\t------------LOCATION------------------");
            System.out.println("\t1- -> Safe House # Don't forget ! No enemies in the safe house ");
            System.out.println("\t2- -> Tool Store # You can buy weapons or armor ");
            System.out.print("\tWhere would you like to go ? : ");
            int selectLoc = scan.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                default:
                    location = new ToolStore(player);
                    break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER []");
                break;
            }

        }

    }


}
