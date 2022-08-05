package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome Player 1");
        System.out.println("Welcome Player 2");
        Random ran = new Random();
        int p1 = 0;
        int p2 = 0;
        int playerOneDiceCount = 0;
        int playerTwoDiceCount = 0;
        while (p1 < 100 && p2 < 100) {

            // PLAYER 1

            while (true) {
                if (p1 < 0) {
                    p1 = 0;
                }
                int conditionPlayerOne = ran.nextInt(4);
                int playerOneDiceRoll = ran.nextInt(1, 6);
                playerOneDiceCount++;
                System.out.println("PLayer 1 is at position => " + p1);
                System.out.println("Player 1 rolled => " + playerOneDiceRoll);
                System.out.println("  ");
                if (p1 + playerOneDiceRoll > 100) {
                    break;
                }
                if (conditionPlayerOne == 1) {
                    p1 = p1 - playerOneDiceRoll;
                    System.out.println("player 1 found a Snake and moves backward");
                    break;
                } else if (conditionPlayerOne == 2) {
                    p1 = p1 + playerOneDiceRoll;
                    System.out.println("Player 1 moves forward");
                    break;
                } else if (conditionPlayerOne == 3) {
                    p1 = p1 + playerOneDiceRoll;
                    System.out.println("Player 1 found a Ladder and plays again");
                    System.out.println("   ");
                    continue;
                } else {
                    System.out.println("Player 1 cant proceed");
                }
                break;
            }
            System.out.println("PLayer 1 is at position => " + p1);
            System.out.println("    ");
            if (p1 == 100) {
                break;
            }

            // PLAYER 2

            while (true) {
                if (p2 < 0) {
                    p2 = 0;
                }
                int conditionPlayerTwo = ran.nextInt(4);
                int playerTwoDiceRoll = ran.nextInt(5);
                playerTwoDiceCount++;
                System.out.println("PLayer 2 is at position => " + p2);
                System.out.println("Player 2 rolled => " + playerTwoDiceRoll);
                System.out.println("    ");
                if (p2 + playerTwoDiceRoll > 100) {
                    break;
                }
                if (conditionPlayerTwo == 1) {
                    p2 = p2 - playerTwoDiceRoll;
                    System.out.println("player 2 found a Snake and moves backward");
                    break;
                } else if (conditionPlayerTwo == 2) {
                    p2 = p2 + playerTwoDiceRoll;
                    System.out.println("Player 2 moves forward");
                    break;
                } else if (conditionPlayerTwo == 3) {
                    p2 = p2 + playerTwoDiceRoll;
                    System.out.println("Player 2 found a Ladder and plays again");
                    System.out.println("   ");
                    continue;
                } else {
                    System.out.println("Player 2 cant proceed");
                }
                break;
            }
            System.out.println("PLayer 2 is at position => " + p2);
            System.out.println("    ");
        }
        if (p1 == 100) {
            System.out.println("Player 1 Won the Game");
            System.out.println("Total number of Die rolled by PLayer 1 => " + playerOneDiceCount);
        } else {
            System.out.println("Player 2 Won the Game");
            System.out.println("Total number of Die rolled by Player 2 => " + playerTwoDiceCount);
        }
    }
}