package com.tamerb.game.location.normalloc;

import com.tamerb.game.player.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe Home");
    }
    @Override
    public boolean onLocation() {
        System.out.println("\tYou are in Safe Home");
        System.out.println("\t Your health is renewed");
        return true;
    }
}
