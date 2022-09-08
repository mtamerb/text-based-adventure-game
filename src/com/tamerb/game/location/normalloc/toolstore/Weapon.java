package com.tamerb.game.location.normalloc.toolstore;


import lombok.Data;

@Data
public class Weapon {

    private String weaponName;
    private int weaponId;
    private int weaponDamage;
    private int weaponPrice;

    public Weapon(String weaponName, int weaponId, int weaponDamage, int weaponPrice) {
        this.weaponName = weaponName;
        this.weaponId = weaponId;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Gun  ", 1, 2, 8);
        weaponList[1] = new Weapon("Sword", 2, 3, 11);
        weaponList[2] = new Weapon("Rifle", 3, 7, 30);
        return weaponList;
    }

    public static Weapon soldWeaponId(int id) {
        for (Weapon w : weapons()) {
            if (w.getWeaponId() == id) {
                return w;
            }
        }
        return null;
    }

}
