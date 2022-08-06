package com.tamerb.game.location.normalloc;

import com.tamerb.game.location.Location;
import com.tamerb.game.player.Player;

public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
