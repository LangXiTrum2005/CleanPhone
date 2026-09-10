package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class IntAction extends TemporalAction {
    private int end;
    private int start;
    private int value;

    public IntAction() {
        this.start = 0;
        this.end = 1;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.value = this.start;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public int getValue() {
        return this.value;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setValue(int i) {
        this.value = i;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        if (f == 0.0f) {
            this.value = this.start;
        } else {
            if (f == 1.0f) {
                this.value = this.end;
                return;
            }
            int i = this.start;
            this.value = (int) (((this.end - i) * f) + i);
        }
    }

    public IntAction(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public IntAction(int i, int i2, float f) {
        super(f);
        this.start = i;
        this.end = i2;
    }

    public IntAction(int i, int i2, float f, @Null Interpolation interpolation) {
        super(f, interpolation);
        this.start = i;
        this.end = i2;
    }
}
