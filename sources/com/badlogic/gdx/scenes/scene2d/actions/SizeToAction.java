package com.badlogic.gdx.scenes.scene2d.actions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class SizeToAction extends TemporalAction {
    private float endHeight;
    private float endWidth;
    private float startHeight;
    private float startWidth;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.startWidth = this.target.getWidth();
        this.startHeight = this.target.getHeight();
    }

    public float getHeight() {
        return this.endHeight;
    }

    public float getWidth() {
        return this.endWidth;
    }

    public void setHeight(float f) {
        this.endHeight = f;
    }

    public void setSize(float f, float f2) {
        this.endWidth = f;
        this.endHeight = f2;
    }

    public void setWidth(float f) {
        this.endWidth = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        float fW;
        float f2;
        if (f == 0.0f) {
            f2 = this.startWidth;
            fW = this.startHeight;
        } else if (f == 1.0f) {
            f2 = this.endWidth;
            fW = this.endHeight;
        } else {
            float f3 = this.startWidth;
            float fW2 = AbstractC5044xl.w(this.endWidth, f3, f, f3);
            float f4 = this.startHeight;
            fW = AbstractC5044xl.w(this.endHeight, f4, f, f4);
            f2 = fW2;
        }
        this.target.setSize(f2, fW);
    }
}
