package com.tamerb.game.player;

import com.tamerb.game.character.GameCharacter;
import com.tamerb.game.character.archer.Archer;
import com.tamerb.game.character.knight.Knight;
import com.tamerb.game.character.samurai.Samurai;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String playerName;
    private String charName;

    public Player(String name) {
        this.playerName = name;
    }

    public void selectChar() {
        System.out.println("Please choose your character : ");
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        System.out.println(knight.getDamage());


        System.out.println("-------------------------------");
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
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

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }


}
