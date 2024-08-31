package com.model;

import java.util.ArrayList;

public class TeamManager {
    private final ArrayList<FootballPlayer> players;

    public TeamManager() {
        players = new ArrayList<FootballPlayer>();
    }

    public TeamManager(ArrayList<FootballPlayer> players) {
        this.players = players;
    }

    public void addPlayer(FootballPlayer player) throws Exception {
        try {
            players.add(player);
            System.out.println("New player added to team");
        } catch (Exception e) {
            throw new Exception("Error adding player");
        }
    }

    public void removePlayer(FootballPlayer player) throws Exception {
        try {
            players.remove(player);
            System.out.println("Player removed from team");
        } catch (Exception e) {
            throw new Exception("Error removing player");
        }
    }

    /**
     * Create a team with 11 players from the player list
     * @return an array list of all players in the newly created team
     * @throws Exception when not enough player
     */
    public ArrayList<FootballPlayer> createPlayer() throws Exception{
        try {
            if (players.size() < 11) {
                throw new Exception("Not enough players to create a team");
            } else {
                ArrayList<FootballPlayer> team = new ArrayList<FootballPlayer>();
                int playerCount = 0;
                while (playerCount < 11) {
                    team.add(players.get(playerCount));
                    playerCount++;
                }
                return team;
            }
        } catch (Exception e) {
            throw new Exception("Error creating team");
        }
    }

    public void display() throws Exception {
        try {
            //column width used for formatting
            int nameWidth = 6;
            int shirtNumberWidth = 11;
            int positionWidth = 10;
            int heightWidth = 8;
            int weightWidth = 8;
            int ageWidth = 7;


            int playerCount = players.size();
            if (playerCount == 0) {
                throw new Exception("No players found in team");
            } else {
                for (FootballPlayer player : players) {
                    if (player.name.length() + 2 > nameWidth) {
                        nameWidth = player.name.length() + 2;
                    }
                    if (player.position.length() + 2 > positionWidth) {
                        positionWidth = player.position.length() + 2;
                    }
                }
                final String format = "%-" + nameWidth + "s%-" + shirtNumberWidth + "s%-" + positionWidth + "s%-" + heightWidth + "s%-" + weightWidth + "s%-" + ageWidth + "s%n";
                System.out.printf(format, "Name", "Shirt No.", "Position", "Height", "Weight", "Age");
                for (FootballPlayer player : players) {
                    System.out.printf(format, player.name, player.shirtNumber, player.position, player.height, player.weight, player.age);
                }
            }
        } catch (Exception e) {
            throw new Exception("Error displaying team");
        }
    }
}
