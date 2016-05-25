package com.example.mchoi.finalproject;

/**
 * Created by mchoi on 5/24/2016.
 */
public abstract class Playable extends Instance {
    protected static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, ACTION = 4;
    protected boolean[] input = new boolean[5];

    public Playable(float x, float y, InstanceHandler instanceHandler) {
        super(x, y, instanceHandler);
    }

    public void update() {
        super.update();
        if(input[UP]) doUp();
        if(input[DOWN]) doDown();
        if(input[LEFT]) doLeft();
        if(input[RIGHT]) doRight();
        if(input[ACTION]) doAction();
    }

    public void setInput(boolean[] input) {
        this.input = input;
    }

    protected abstract void doUp();
    protected abstract void doDown();
    protected abstract void doLeft();
    protected abstract void doRight();
    protected abstract void doAction();
}
