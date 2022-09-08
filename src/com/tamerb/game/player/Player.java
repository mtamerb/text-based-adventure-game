package com.tamerb.game.player;

import com.tamerb.game.character.GameCharacter;
import com.tamerb.game.character.archer.Archer;
import com.tamerb.game.character.knight.Knight;
import com.tamerb.game.character.samurai.Samurai;
import lombok.Data;

import java.util.Scanner;

@Data
public class Player {
    private int playerDamage;
    private int playerHealth;
    private int playerMoney;
    private String playerName;
    private String charName;

    static final Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.playerName = name;
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setPlayerDamage(gameCharacter.getDamage());
        this.setPlayerHealth(gameCharacter.getHealth());
        this.setPlayerMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getCharName());
    }

    public void selectChar() {
        System.out.println("\tAre u ready for adventure " + getPlayerName() + " ?");
        System.out.println("\tOK... Let's start");
        System.out.println("\n\t\t------------CHARACTER-----------------");
        GameCharacter[] charList = {new Samurai(), new Knight(), new Archer()};
        System.out.println("\n\tCharacter\t\tDamage\t\tHealth\t\tMoney\t\t");
        for (GameCharacter gameChar : charList) {
            System.out.println("\t " + gameChar.getCharName() + "\t\t" +
                    gameChar.getDamage() + "\t\t\t" +
                    gameChar.getHealth() + "\t\t\t" +
                    gameChar.getMoney());
        }
        System.out.print("\tPlease choose a character above : ");
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
            } else {
                System.out.print("\tAgain Please : ");
                chooseChar = scan.nextLine();
            }
        }
    }

}
