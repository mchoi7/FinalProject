package com.example.mchoi.finalproject;

/**
 * Created by mchoi on 5/24/2016.
 */
public class Varus extends Champion {
    public Varus(float x, float y, int team, InstanceHandler instanceHandler) {
        super(x, y, team, instanceHandler);
        setWidth(1);
        setHeight(1);
        setDepth(1);
    }

    protected void doAction() {
        Projectile projectile = new Projectile(x, y, team, instanceHandler);
        projectile.setSpriteIndex(/*some index here*/ 0);
        projectile.setDdx(1);
        projectile.setDdy(1);
        projectile.setInput(input);
        projectile.setDz(10);
        projectile.setDdz(-1);
        projectile.setTimer(100);
    }
}
