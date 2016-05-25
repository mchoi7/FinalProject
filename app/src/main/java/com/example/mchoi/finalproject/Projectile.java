package com.example.mchoi.finalproject;

/**
 * Created by mchoi on 5/24/2016.
 */
public class Projectile extends Entity {
    private int timer;

    public Projectile(float x, float y, int team, InstanceHandler instanceHandler) {
        super(x, y, team, instanceHandler);
        setWidth(1);
        setHeight(1);
        setDepth(1);
        timer = 1000;
    }

    public void update() {
        super.update();
        if(--timer < 0) destroy();
    }

    protected void doUp() { dy += ddy; }
    protected void doDown() { dx += ddx; }
    protected void doLeft() { dx -= ddx; }
    protected void doRight() { dy -= ddy; }
    protected void doAction() { destroy(); }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
