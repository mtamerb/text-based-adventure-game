package com.tamerb.game.location.normalloc.toolstore;

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
        weaponList[0] = new Weapon("Gun  ", 1, 2, 25);
        weaponList[1] = new Weapon("Sword", 2, 3, 35);
        weaponList[2] = new Weapon("Rifle", 3, 7, 45);
        return weaponList;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }
}
