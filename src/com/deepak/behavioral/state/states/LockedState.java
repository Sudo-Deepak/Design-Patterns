package com.deepak.behavioral.state.states;

import com.deepak.behavioral.state.ui.Player;

public class LockedState extends State {

    LockedState(Player player) {
        super(player)   ;
        player.setPlaying(false);
    }
    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
