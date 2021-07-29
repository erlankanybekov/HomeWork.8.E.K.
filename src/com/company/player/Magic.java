package com.company.player;

import java.util.Random;

public class Magic extends Hero {
    private int booster;

    public Magic(int health, int damage, int booster) {
        super(health, damage, SuperAbility.BOOST);
        this.booster = booster;
    }

    public int getBooster() {
        return booster;
    }

    public void setBooster(int booster) {
        this.booster = booster;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                if (!heroes[i].getAbility().equals(SuperAbility.BOOST)) {
                    heroes[i].setDamage(heroes[i].getDamage() + booster);
                    System.out.println(heroes[i] +" gets boost "+ booster+"+");

                }

            }

        }
    }
}