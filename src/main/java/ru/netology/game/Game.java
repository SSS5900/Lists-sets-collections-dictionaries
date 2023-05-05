package ru.netology.game;

import java.util.ArrayList;


public class Game {


    //    public static void main(String[] args)
// счетчик списка "fori"
// for (int i = 0; i < namePlayer.size(); i++);

// счетчик списка "foreach"
// for (String Player : namePlayer);

    ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {

        players.add(player);

    }

    public int round(String playerName1, String playerName2) {


        Player player1 = null;
        Player player2 = null;

        for (Player player : players) {
            if (player.getName().contains(playerName1)) {
                player1 = player;
            }
            if (player.getName().contains(playerName2)) {
                player2 = player;
            }
        }


        if (player1 == null) {
            throw new NotRegisteredException(
                    "Игрок с именем: " + playerName1 + " не зарегистрирован."
            );
        }

        if (player2 == null) {
            throw new NotRegisteredException(
                    "Игрок с именем: " + playerName2 + " не зарегистрирован."
            );
        }


        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }

        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }


        return 0;
    }


}




