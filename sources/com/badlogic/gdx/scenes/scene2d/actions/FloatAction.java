package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.utils.Null;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class FloatAction extends TemporalAction {
    private float end;
    private float start;
    private float value;

    public FloatAction() {
        this.start = 0.0f;
        this.end = 1.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.value = this.start;
    }

    public float getEnd() {
        return this.end;
    }

    public float getStart() {
        return this.start;
    }

    public float getValue() {
        return this.value;
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setStart(float f) {
        this.start = f;
    }

    public void setValue(float f) {
        this.value = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        if (f == 0.0f) {
            this.value = this.start;
        } else if (f == 1.0f) {
            this.value = this.end;
        } else {
            float f2 = this.start;
            this.value = AbstractC5044xl.w(this.end, f2, f, f2);
        }
    }

    public FloatAction(float f, float f2) {
        this.start = f;
        this.end = f2;
    }

    public FloatAction(float f, float f2, float f3) {
        super(f3);
        this.start = f;
        this.end = f2;
    }

    public FloatAction(float f, float f2, float f3, @Null Interpolation interpolation) {
        super(f3, interpolation);
        this.start = f;
        this.end = f2;
    }
}
