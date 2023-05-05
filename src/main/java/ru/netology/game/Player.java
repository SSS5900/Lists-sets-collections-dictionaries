package ru.netology.game;

public class Player {

    int id; // идентификационный номер игрока
    String name; // имя игрока
    int strength; // сила игрока. выражена числом

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }


    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }


}
