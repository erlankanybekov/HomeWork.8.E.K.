package com.company.player;

public class Thank extends Hero{
    private  int savepoint;

    public Thank(int health, int damage,int savepoint ) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.savepoint = savepoint;

    }

    public int getSavepoint() {
        return savepoint;
    }

    public void setSavepoint(int savepoint) {
        this.savepoint = savepoint;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if ( boss.getHealth() > 0){
                boss.setHealth(boss.getHealth() - savepoint );
                System.out.println("Thank is using ability: " + savepoint+"+" );
            }


    }
}
