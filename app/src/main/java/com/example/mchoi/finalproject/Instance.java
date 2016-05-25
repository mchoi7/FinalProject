package com.example.mchoi.finalproject;

import android.graphics.Canvas;
import static java.lang.Math.*;

public abstract class Instance {
    protected InstanceHandler instanceHandler;
    protected float x, y, z;
    private float width, height, depth;
    protected int spriteIndex, lastSpriteIndex;
    protected float imageIndex, imageSpeed, imageXScale, imageYScale;

    public Instance(float x, float y, InstanceHandler instanceHandler) {
        this.x = x;
        this.y = y;
        this.instanceHandler = instanceHandler;
        instanceHandler.addInstance(this);
    }

    public void destroy() {
        instanceHandler.removeInstance(this);
    }

    public boolean isIntersecting(Instance instance) {
        return  2*(width+instance.getWidth())   < abs(x-instance.getX()) &&
                2*(height+instance.getHeight()) < abs(y-instance.getY()) &&
                2*(depth+instance.getDepth())   < abs(z-instance.getZ());
    }

    public abstract void intersects(Instance instance);

    public void update() {}

    public void draw(Instance camera, Canvas canvas) {
        /*
        Sprite sprite = ResourceManager.getSprite(spriteIndex);
        imageIndex = spriteIndex==lastSpriteIndex ? (imageIndex+imageSpeed) % sprite.getImageNumber() : 0;
        lastSpriteIndex = spriteIndex;
        sprite.draw(x, y, z, imageIndex, imageXScale, imageYScale, camera, canvas);
        */
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public void setSpriteIndex(int spriteIndex) {
        this.spriteIndex = spriteIndex;
    }
}
