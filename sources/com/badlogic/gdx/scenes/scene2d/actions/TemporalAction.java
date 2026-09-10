package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public abstract class TemporalAction extends Action {
    private boolean began;
    private boolean complete;
    private float duration;

    @Null
    private Interpolation interpolation;
    private boolean reverse;
    private float time;

    public TemporalAction() {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float f) {
        boolean z = true;
        if (this.complete) {
            return true;
        }
        Pool pool = getPool();
        setPool(null);
        try {
            if (!this.began) {
                begin();
                this.began = true;
            }
            float f2 = this.time + f;
            this.time = f2;
            float f3 = this.duration;
            if (f2 < f3) {
                z = false;
            }
            this.complete = z;
            float fApply = z ? 1.0f : f2 / f3;
            Interpolation interpolation = this.interpolation;
            if (interpolation != null) {
                fApply = interpolation.apply(fApply);
            }
            if (this.reverse) {
                fApply = 1.0f - fApply;
            }
            update(fApply);
            if (this.complete) {
                end();
            }
            return this.complete;
        } finally {
            setPool(pool);
        }
    }

    public void begin() {
    }

    public void end() {
    }

    public void finish() {
        this.time = this.duration;
    }

    public float getDuration() {
        return this.duration;
    }

    @Null
    public Interpolation getInterpolation() {
        return this.interpolation;
    }

    public float getTime() {
        return this.time;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.reverse = false;
        this.interpolation = null;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
        this.time = 0.0f;
        this.began = false;
        this.complete = false;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setInterpolation(@Null Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    public void setReverse(boolean z) {
        this.reverse = z;
    }

    public void setTime(float f) {
        this.time = f;
    }

    public abstract void update(float f);

    public TemporalAction(float f) {
        this.duration = f;
    }

    public TemporalAction(float f, @Null Interpolation interpolation) {
        this.duration = f;
        this.interpolation = interpolation;
    }
}
