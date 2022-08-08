package com.tamerb.game.location.normalloc.toolstore;

import com.tamerb.game.location.normalloc.NormalLocation;
import com.tamerb.game.player.Player;

public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\t\tYou are in Tool-Store...");
        System.out.println("\n\t\t------------TOOL-STORE-----------------");
        menu();
        return true;
    }

    public void menu() {
        while (true) {
            System.out.println("\t\t1 - Gun");
            System.out.println("\t\t2 - Armor");
            System.out.print("\t\t3 - Exit Tool Store : ");
            int option = scan.nextInt();
            if (option < 1 || option > 3) {
                System.out.print("\t\tAgain Please : ");
                option = scan.nextInt();
            }
            if (option == 1) printWeapon();
            if (option == 2) printArmor();
            if (option == 3) {
                System.out.println("\t\tBAM! BAM! leaving the tool-store...");
                break;
            }
        }
    }

    public void printWeapon() {
        System.out.println("\n\t\t------------WEAPONRY-----------------");
        System.out.println("\n\t\tWeaponName\t\tWeaponId\t\tDamage\t\tPrice");
        for (Weapon w : Weapon.weapons()) {
            System.out.println("\t\t\t" + w.getWeaponName() + "\t\t\t" + w.getWeaponId() + "\t\t\t" +
                    w.getWeaponDamage() + "\t\t\t" +
                    w.getWeaponPrice());
        }
    }

    public void printArmor() {

    }

}
