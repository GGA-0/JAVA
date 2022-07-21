package com.company;

public class Character {
    private int hp;
    private int coins;

    //getters and setters
    public int getHp() {
        return hp;
    }
    public int getCoins() {
        return coins;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Character() {
        this.hp = 20;
        this.coins = 0;
    }
}
