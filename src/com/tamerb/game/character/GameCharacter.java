package com.tamerb.game.character;

public abstract class GameCharacter {
    private String charName;
    private int health;
    private int damage;
    private int money;

    public GameCharacter(String charName, int damage, int health, int money) {
        this.charName = charName;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
