package com.example.mchoi.finalproject;

import static java.lang.Math.*;

/**
 * Created by mchoi on 5/24/2016.
 */
public abstract class Entity extends Playable {
    protected int team;
    protected float health;
    protected float dx, dy, dz;
    protected float ddx, ddy, ddz;
    protected float iddx, iddy, iddz;
    protected float mdx, mdy, mdz;

    public Entity(float x, float y, int team, InstanceHandler instanceHandler) {
        super(x, y, instanceHandler);
        this.team = team;
        health = 1;
    }

    public void update() {
        super.update();
        if(health <= 0) destroy();

        dx = signum(dx)*min(abs(dx), mdx);
        dy = signum(dy)*min(abs(dy), mdy);
        dy = signum(dz)*min(abs(dz), mdz);

        //if dds is positive, positive feedback and ds -> inf.
        //if dds is negative, negative feedback and ds -> 0
        dx += signum(dx)*ddx;
        dy += signum(dy)*ddy;
        dz += signum(dz)*ddz;

        //intersections checked orthogonally to avoid misinterpreted physical game logic
        x += dx;
        //TODO check collisions
        y += dy;
        //TODO check collisions
        z += dz;
        //TODO check collisions
    }

    public void intersects(Instance instance) {

    }

    public void changeHealth(float delta) { health += delta; }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    public void setDz(float dz) {
        this.dz = dz;
    }

    public void setDdx(float ddx) {
        this.ddx = ddx;
    }

    public void setDdy(float ddy) {
        this.ddy = ddy;
    }

    public void setDdz(float ddz) {
        this.ddz = ddz;
    }
}
