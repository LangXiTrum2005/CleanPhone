package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Null;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class ColorAction extends TemporalAction {

    @Null
    private Color color;
    private final Color end = new Color();
    private float startA;
    private float startB;
    private float startG;
    private float startR;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        if (this.color == null) {
            this.color = this.target.getColor();
        }
        Color color = this.color;
        this.startR = color.r;
        this.startG = color.g;
        this.startB = color.b;
        this.startA = color.f202a;
    }

    @Null
    public Color getColor() {
        return this.color;
    }

    public Color getEndColor() {
        return this.end;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction, com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.color = null;
    }

    public void setColor(@Null Color color) {
        this.color = color;
    }

    public void setEndColor(Color color) {
        this.end.set(color);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        if (f == 0.0f) {
            this.color.set(this.startR, this.startG, this.startB, this.startA);
            return;
        }
        if (f == 1.0f) {
            this.color.set(this.end);
            return;
        }
        float f2 = this.startR;
        Color color = this.end;
        float fW = AbstractC5044xl.w(color.r, f2, f, f2);
        float f3 = this.startG;
        float fW2 = AbstractC5044xl.w(color.g, f3, f, f3);
        float f4 = this.startB;
        float fW3 = AbstractC5044xl.w(color.b, f4, f, f4);
        float f5 = this.startA;
        this.color.set(fW, fW2, fW3, AbstractC5044xl.w(color.f202a, f5, f, f5));
    }
}
