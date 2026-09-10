package com.badlogic.gdx.scenes.scene2d.actions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class ScaleToAction extends TemporalAction {
    private float endX;
    private float endY;
    private float startX;
    private float startY;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.startX = this.target.getScaleX();
        this.startY = this.target.getScaleY();
    }

    public float getX() {
        return this.endX;
    }

    public float getY() {
        return this.endY;
    }

    public void setScale(float f, float f2) {
        this.endX = f;
        this.endY = f2;
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
        this.target.setScale(f2, fW);
    }

    public void setScale(float f) {
        this.endX = f;
        this.endY = f;
    }
}
