package com.bridgelabz;

import java.util.Random;

public class snakeandladder {
    public static void main(String[] args) {
        System.out.println("Welcome Player 1");
        int p1 = 0;
        while (p1 <= 100) {
            if (p1 < 0) {
                p1 = 0;
                continue;
            }
            Random ran = new Random();
            int roll = ran.nextInt(5);
            int out = roll + 1;
            System.out.println(roll + "  " + out);
            int play = ran.nextInt(3);
            if (play == 1) {
                p1 = p1 - out;
                System.out.println("Player 1 rolled => " + out);
                System.out.println("player 1 found a Snake and moved behind");
            } else if (play == 2) {
                p1 = p1 + out;
                System.out.println("Player 1 rolled => " + out);
                System.out.println("Player 1 moved ahead using Ladder");
            } else {
                System.out.println("Player 1 rolled => " + out);
                System.out.println("Player 1 cant move forward");
            }
            System.out.println("PLayer 1 is at position => " + p1);
            System.out.println("    ");
            p1 += 0;
        }
        System.out.println("Player 1 has completed the Game");
    }
}
