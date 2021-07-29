package com.company.player;

import java.util.Random;

public class Warrior extends Hero{
    private int Damagepoint;



    public Warrior(int health, int damage,int damagepoint) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
        this.Damagepoint = damagepoint;

    }


    public int getDamagepoint() {
        return Damagepoint;
    }

    public void setDamagepoint(int damagepoint) {
        Damagepoint = damagepoint;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
       int koeff = random.nextInt(5);
            if ( boss.getHealth() > 0){
                if (koeff == 2){
                    boss.setHealth(boss.getHealth() - Damagepoint*koeff);
                    System.out.println("Warrior is using ability: " + koeff+"x" );
                }
                if (koeff == 3){
                    boss.setHealth(boss.getHealth() - Damagepoint*koeff);
                    System.out.println("Warrior is using ability: " + koeff+"x" );
                }
                if (koeff == 4){
                    boss.setHealth(boss.getHealth() - Damagepoint*koeff);
                    System.out.println("Warrior is using ability: " + koeff+"x" );
                }
            }

        }
    }


