package com.learntocode;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // ask user for teams & scores
        System.out.println("Please enter a score: \nFormat Home:Visitor | 21:9");
        String input = myScanner.nextLine();


        // split into teams and scores
        String[] divider = input.split("\\|");
        String homeTeam = divider[0].split(":")[0];
        String visitorTeam = divider[0].split(":")[1];
        int homeScore = Integer.parseInt(divider[1].split(":")[0]);
        int visitorScore = Integer.parseInt(divider[1].split(":")[1]);

        // ternary operator instead of if else
        String winner = homeScore > visitorScore ? homeTeam : visitorTeam;
        System.out.println("Winner: " + winner);

    }
}
