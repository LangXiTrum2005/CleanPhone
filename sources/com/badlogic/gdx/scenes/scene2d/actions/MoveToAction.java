package com.badlogic.gdx.scenes.scene2d.actions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class MoveToAction extends TemporalAction {
    private int alignment = 12;
    private float endX;
    private float endY;
    private float startX;
    private float startY;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.startX = this.target.getX(this.alignment);
        this.startY = this.target.getY(this.alignment);
    }

    public int getAlignment() {
        return this.alignment;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public float getX() {
        return this.endX;
    }

    public float getY() {
        return this.endY;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction, com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.alignment = 12;
    }

    public void setAlignment(int i) {
        this.alignment = i;
    }

    public void setPosition(float f, float f2) {
        this.endX = f;
        this.endY = f2;
    }

    public void setStartPosition(float f, float f2) {
        this.startX = f;
        this.startY = f2;
    }

    public void setX(float f) {
        this.endX = f;
    }

    public void setY(float f) {
        this.endY = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        float fW;
        float f2;
        if (f == 0.0f) {
            f2 = this.startX;
            fW = this.startY;
        } else if (f == 1.0f) {
            f2 = this.endX;
            fW = this.endY;
        } else {
            float f3 = this.startX;
            float fW2 = AbstractC5044xl.w(this.endX, f3, f, f3);
            float f4 = this.startY;
            fW = AbstractC5044xl.w(this.endY, f4, f, f4);
            f2 = fW2;
        }
        this.target.setPosition(f2, fW, this.alignment);
    }

    public void setPosition(float f, float f2, int i) {
        this.endX = f;
        this.endY = f2;
        this.alignment = i;
    }
}
