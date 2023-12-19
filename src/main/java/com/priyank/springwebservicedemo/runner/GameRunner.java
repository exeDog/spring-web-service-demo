package com.priyank.springwebservicedemo.runner;

import com.priyank.springwebservicedemo.game.GameInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private final GameInterface game;

    public GameRunner(GameInterface game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Starting game...");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
