package com.tamerb.game.character;


import lombok.Data;

@Data
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


}
