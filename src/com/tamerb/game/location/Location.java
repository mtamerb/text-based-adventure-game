package com.tamerb.game.location;

import com.tamerb.game.location.normalloc.SafeHouse;
import com.tamerb.game.location.normalloc.toolstore.ToolStore;
import com.tamerb.game.player.Player;

import java.util.Scanner;

public abstract class Location {
    protected static final Scanner scan = new Scanner(System.in);


    private Player player;
    private String name;

    public abstract boolean onLocation();



    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public void selectLocation(){
        Location location = null;
        while (true) {
            System.out.println("\n\t\t------------LOCATION------------------");
            System.out.println("\n\t1- -> Safe House # Don't forget ! No enemies in the safe house ");
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


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
