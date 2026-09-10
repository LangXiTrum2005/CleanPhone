package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Null;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class AlphaAction extends TemporalAction {

    @Null
    private Color color;
    private float end;
    private float start;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        if (this.color == null) {
            this.color = this.target.getColor();
        }
        this.start = this.color.f202a;
    }

    public float getAlpha() {
        return this.end;
    }

    @Null
    public Color getColor() {
        return this.color;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction, com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.color = null;
    }

    public void setAlpha(float f) {
        this.end = f;
    }

    public void setColor(@Null Color color) {
        this.color = color;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        if (f == 0.0f) {
            this.color.f202a = this.start;
        } else if (f == 1.0f) {
            this.color.f202a = this.end;
        } else {
            Color color = this.color;
            float f2 = this.start;
            color.f202a = AbstractC5044xl.w(this.end, f2, f, f2);
        }
    }
}
