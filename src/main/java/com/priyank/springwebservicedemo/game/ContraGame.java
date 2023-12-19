package com.priyank.springwebservicedemo.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GameInterface {

        public void up() {
            System.out.println("Jumping up...");
        }

        public void down() {
            System.out.println("Going down...");
        }

        public void left() {
            System.out.println("Going left...");
        }

        public void right() {
            System.out.println("Going right...");
        }
}
