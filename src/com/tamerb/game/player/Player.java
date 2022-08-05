package com.tamerb.game.player;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String playerName;
    private String charName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void selectChar() {
        System.out.println("Karakterinizi seçiniz : ");
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
