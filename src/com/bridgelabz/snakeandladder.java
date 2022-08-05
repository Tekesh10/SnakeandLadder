package com.bridgelabz;

import java.util.Random;

public class snakeandladder {
    public static void main(String[] args) {
        System.out.println("Welcome Player 1");
        System.out.println("Welcome Player 2");
        int p1 = 0;
        int p2 = 0;
        int count1 = 0;
        int count2 = 0;
        while (p1 < 100 && p2 < 100) {

            // PLAYER 1

            if (p1 < 0) {
                p1 = 0;
                continue;
            }
            Random ran1 = new Random();
            int play1 = ran1.nextInt(4);
            int roll1 = ran1.nextInt(5);
            int out1 = roll1 + 1;
            System.out.println("PLayer 1 is at position => " + p1);
            System.out.println("Player 1 rolled => " + out1);
            System.out.println("  ");
            if (p1 + out1 > 100) {
                continue;
            }
            if (play1 == 1) {
                p1 = p1 - out1;System.out.println("player 1 found a Snake and moves backward");
            } else if (play1 == 2) {
                p1 = p1 + out1;
                System.out.println("Player 1 moves forward");
            } else if (play1 == 3) {
                p1 = p1 + out1;
                System.out.println("Player 1 found a Ladder and plays again");
                System.out.println("   ");
                continue;
            } else {
                System.out.println("Player 1 cant proceed");

            }
            count1++;
            System.out.println("PLayer 1 is at position => "+p1);
            System.out.println("    ");
            if (p1 == 100) {
                break;
            }

            // PLAYER 2

            if (p2 < 0) {
                p2 = 0;
                continue;
            }

            Random ran2 = new Random();
            int play2 = ran2.nextInt(4);
            int roll2 = ran2.nextInt(5);
            int out2 = roll2 + 1;
            System.out.println("PLayer 2 is at position => " + p2);
            System.out.println("Player 2 rolled => " + out2);
            System.out.println("    ");
            if (p2 + out2 > 100) {
                continue;
            }
            if (play2 == 1) {
                p2 = p2 - out2;
                System.out.println("player 2 found a Snake and moves backward");
            } else if (play2 == 2) {
                p2 = p2 + out2;
                System.out.println("Player 2 moves forward");
            } else if (play2 == 3) {
                p2 = p2 + out2;
                System.out.println("Player 2 found a Ladder and plays again");
                System.out.println("   ");
                continue;
            } else {
                System.out.println("Player 2 cant proceed");
            }
            count2++;
            System.out.println("PLayer 2 is at position => "+p2);
            System.out.println("    ");
        }
        if (p1 == 100) {
        System.out.println("Player 1 Won the Game");
        System.out.println("Total number of Die rolled by PLayer 1 => "+count1);
        } else {
            System.out.println("Player 2 Won the Game");
            System.out.println("Total number of Die rolled by Player 2 => "+count2);
        }
    }
}
