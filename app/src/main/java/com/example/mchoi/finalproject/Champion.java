package com.example.mchoi.finalproject;

/**
 * Created by mchoi on 5/24/2016.
 */
public abstract class Champion extends Entity {
    public Champion(float x, float y, int team, InstanceHandler instanceHandler) {
        super(x, y, team, instanceHandler);
    }

    protected void doUp() { dy += iddy; }
    protected void doDown() { dx += iddx; }
    protected void doLeft() { dx -= iddx; }
    protected void doRight() { dy -= iddy; }

}
