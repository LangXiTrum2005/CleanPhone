package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.math.MathUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class RotateToAction extends TemporalAction {
    private float end;
    private float start;
    private boolean useShortestDirection;

    public RotateToAction() {
        this.useShortestDirection = false;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.start = this.target.getRotation();
    }

    public float getRotation() {
        return this.end;
    }

    public boolean isUseShortestDirection() {
        return this.useShortestDirection;
    }

    public void setRotation(float f) {
        this.end = f;
    }

    public void setUseShortestDirection(boolean z) {
        this.useShortestDirection = z;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        float fW;
        if (f == 0.0f) {
            fW = this.start;
        } else if (f == 1.0f) {
            fW = this.end;
        } else if (this.useShortestDirection) {
            fW = MathUtils.lerpAngleDeg(this.start, this.end, f);
        } else {
            float f2 = this.start;
            fW = AbstractC5044xl.w(this.end, f2, f, f2);
        }
        this.target.setRotation(fW);
    }

    public RotateToAction(boolean z) {
        this.useShortestDirection = z;
    }
}
