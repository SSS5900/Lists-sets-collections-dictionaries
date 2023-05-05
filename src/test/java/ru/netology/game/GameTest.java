package ru.netology.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest {


    @Test
    public void testWinPlayer1() {
        Player player1 = new Player(1248, "Игрок 1", 9);
        Player player2 = new Player(1336, "Игрок 2", 5);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Игрок 1", "Игрок 2");
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testWinPlayer2() {
        Player player1 = new Player(1248, "Игрок 1", 9);
        Player player2 = new Player(1336, "Игрок 2", 10);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Игрок 1", "Игрок 2");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testADrawPlayer() {
        Player player1 = new Player(1248, "Игрок 1", 9);
        Player player2 = new Player(1336, "Игрок 2", 9);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Игрок 2", "Игрок 1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotRegisteredPlayer1() {
        Player player1 = new Player(1248, "Игрок 1", 9);
        Player player2 = new Player(1336, "Игрок 2", 9);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Игрок 3", "Игрок 2");
        });

    }

    @Test
    public void testNotRegisteredPlayer2() {
        Player player1 = new Player(1248, "Игрок 1", 9);
        Player player2 = new Player(1336, "Игрок 2", 9);

        Game game = new Game();

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Игрок 1", "Игрок 3");
        });

    }


}
