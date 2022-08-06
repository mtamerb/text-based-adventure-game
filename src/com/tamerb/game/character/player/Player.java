package com.tamerb.game.character.player;

import com.tamerb.game.character.GameCharacter;
import com.tamerb.game.character.archer.Archer;
import com.tamerb.game.character.knight.Knight;
import com.tamerb.game.character.samurai.Samurai;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String playerName;
    private String charName;

    static final Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.playerName = name;
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getCharName());
    }

    public void selectChar() {
        System.out.println("\n\tPlease choose a character below: ");
        System.out.println("\t------------------------------------------------");
        GameCharacter[] charList = {new Samurai(), new Knight(), new Archer()};
        System.out.println("\tCharacter\t\tDamage\t\tHealth\t\tMoney\t\t");
        for (GameCharacter gameChar : charList) {
            System.out.println("\t " + gameChar.getCharName() + "\t\t" +
                    gameChar.getDamage() + "\t\t\t" +
                    gameChar.getHealth() + "\t\t\t" +
                    gameChar.getMoney());
        }
        System.out.println("\t-------------------------------------------------");
        String chooseChar = scan.nextLine();
        while (true) {
            if (chooseChar.equalsIgnoreCase("samurai")) {
                initPlayer(new Samurai());
                break;
            }
            if (chooseChar.equalsIgnoreCase("knight")) {
                initPlayer(new Knight());
                break;
            }
            if (chooseChar.equalsIgnoreCase("archer")) {
                initPlayer(new Archer());
                break;
            }
        }

        System.out.println("Selected character is " + getCharName() + " --> " +
                "\tDamage: " + this.getDamage() +
                "\tHealth: " + this.getHealth() +
                "\tMoney: " + this.getMoney());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
