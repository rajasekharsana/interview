package com.interview.chess;

/*
 *  Create layout like a Chess board, it should show layout as shown below..
 *
 *  W B W B W B ..
 *  B W B W B W ..
 *  W B W B W B ..
 *  B W B W B W
 *
 * 00 01 02 03 04 05 ..
 * 10 11 12 13 14 15 ..
 * 20 21 22 23 24 25 ..
 * 30 31 32 33 34 35 ..
 * 40 41 42 43 44 45 ..
 * 50 51 52 53 54 55 ..
 *
 */

public class ChessLayout {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print(" W ");
                } else {
                    System.out.print(" B ");
                }
            }
            System.out.println("\n");
        }
    }
}
