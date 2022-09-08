package com.tamerb.game.inventory;


import lombok.Data;

@Data
public class Armor {
    private int armorId;
    private String armorName;
    private int blockDamage;
    private int armorPrice;

    public Armor(int armorId, String armorName, int blockDamage, int armorPrice) {
        this.armorId = armorId;
        this.armorName = armorName;
        this.blockDamage = blockDamage;
        this.armorPrice = armorPrice;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "LightWeight", 1, 15);
        armorList[1] = new Armor(2, "MiddleWeigh", 3, 25);
        armorList[2] = new Armor(3, "Heavy", 5, 40);
        return armorList;
    }


}
