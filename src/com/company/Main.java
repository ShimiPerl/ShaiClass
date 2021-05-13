package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter Player 1 name");
        String player_1 = scanner.nextLine();
        System.out.println("enter Player 2 name");
        String player_2 = scanner.nextLine();

        Random  win_number = new Random();
        int number = win_number.nextInt(100)+1;
        int geust = 0;

        while (true){

            System.out.println("gust a number " + player_1 );
            geust = scanner.nextInt();
            if (number == geust){
                System.out.println(player_1 + " you won");
                break;
            }
            else if (number > geust) System.out.println("number to low");
            else System.out.println("number to high");

            System.out.println("gust a number " + player_2 );
            geust = scanner.nextInt();
            if (number == geust){
                System.out.println(player_1 + " you won");
                break;
            }
            else if (number > geust) System.out.println("number to low");
            else System.out.println("number to high");
        }
    }
}

