package com.tamerb.game.location.normalloc;

import com.tamerb.game.player.Player;

public  class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\t\tYou are in Tool-Store...");
        return true;
    }
}
