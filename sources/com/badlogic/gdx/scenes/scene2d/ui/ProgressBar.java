package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Disableable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pools;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class ProgressBar extends Widget implements Disableable {
    private float animateDuration;
    private float animateFromValue;
    private Interpolation animateInterpolation;
    private float animateTime;
    boolean disabled;
    float max;
    float min;
    float position;
    private boolean programmaticChangeEvents;
    private boolean round;
    float stepSize;
    private ProgressBarStyle style;
    private float value;
    final boolean vertical;
    private Interpolation visualInterpolation;

    public static class ProgressBarStyle {

        @Null
        public Drawable background;

        @Null
        public Drawable disabledBackground;

        @Null
        public Drawable disabledKnob;

        @Null
        public Drawable disabledKnobAfter;

        @Null
        public Drawable disabledKnobBefore;

        @Null
        public Drawable knob;

        @Null
        public Drawable knobAfter;

        @Null
        public Drawable knobBefore;

        public ProgressBarStyle() {
        }

        public ProgressBarStyle(@Null Drawable drawable, @Null Drawable drawable2) {
            this.background = drawable;
            this.knob = drawable2;
        }

        public ProgressBarStyle(ProgressBarStyle progressBarStyle) {
            this.background = progressBarStyle.background;
            this.disabledBackground = progressBarStyle.disabledBackground;
            this.knob = progressBarStyle.knob;
            this.disabledKnob = progressBarStyle.disabledKnob;
            this.knobBefore = progressBarStyle.knobBefore;
            this.disabledKnobBefore = progressBarStyle.disabledKnobBefore;
            this.knobAfter = progressBarStyle.knobAfter;
            this.disabledKnobAfter = progressBarStyle.disabledKnobAfter;
        }
    }

    public ProgressBar(float f, float f2, float f3, boolean z, Skin skin) {
        this(f, f2, f3, z, (ProgressBarStyle) skin.get("default-".concat(z ? "vertical" : "horizontal"), ProgressBarStyle.class));
    }

    private void drawRound(Batch batch, Drawable drawable, float f, float f2, float f3, float f4) {
        if (this.round) {
            f = (float) Math.floor(f);
            f2 = (float) Math.floor(f2);
            f3 = (float) Math.ceil(f3);
            f4 = (float) Math.ceil(f4);
        }
        drawable.draw(batch, f, f2, f3, f4);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float f) {
        super.act(f);
        float f2 = this.animateTime;
        if (f2 > 0.0f) {
            this.animateTime = f2 - f;
            Stage stage = getStage();
            if (stage == null || !stage.getActionsRequestRendering()) {
                return;
            }
            Gdx.graphics.requestRendering();
        }
    }

    public float clamp(float f) {
        return MathUtils.clamp(f, this.min, this.max);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        float leftWidth;
        float f2;
        float bottomHeight;
        Drawable drawable = this.style.knob;
        Drawable knobDrawable = getKnobDrawable();
        Drawable backgroundDrawable = getBackgroundDrawable();
        Drawable knobBeforeDrawable = getKnobBeforeDrawable();
        Drawable knobAfterDrawable = getKnobAfterDrawable();
        Color color = getColor();
        float x = getX();
        float y = getY();
        float width = getWidth();
        float height = getHeight();
        float minHeight = drawable == null ? 0.0f : drawable.getMinHeight();
        float minWidth = drawable == null ? 0.0f : drawable.getMinWidth();
        float visualPercent = getVisualPercent();
        batch.setColor(color.r, color.g, color.b, color.f202a * f);
        if (!this.vertical) {
            if (backgroundDrawable != null) {
                drawRound(batch, backgroundDrawable, x, Math.round(((height - backgroundDrawable.getMinHeight()) * 0.5f) + y), width, Math.round(backgroundDrawable.getMinHeight()));
                leftWidth = backgroundDrawable.getLeftWidth();
                width -= backgroundDrawable.getRightWidth() + leftWidth;
            } else {
                leftWidth = 0.0f;
            }
            float f3 = width - minWidth;
            float fClamp = MathUtils.clamp(f3 * visualPercent, 0.0f, f3);
            this.position = leftWidth + fClamp;
            float f4 = minWidth * 0.5f;
            if (knobBeforeDrawable != null) {
                drawRound(batch, knobBeforeDrawable, x + leftWidth, ((height - knobBeforeDrawable.getMinHeight()) * 0.5f) + y, fClamp + f4, knobBeforeDrawable.getMinHeight());
            }
            if (knobAfterDrawable != null) {
                drawRound(batch, knobAfterDrawable, this.position + x + f4, ((height - knobAfterDrawable.getMinHeight()) * 0.5f) + y, f3 - (this.round ? (float) Math.ceil(fClamp - f4) : fClamp - f4), knobAfterDrawable.getMinHeight());
            }
            if (knobDrawable != null) {
                float minWidth2 = knobDrawable.getMinWidth();
                float minHeight2 = knobDrawable.getMinHeight();
                drawRound(batch, knobDrawable, AbstractC5044xl.w(minWidth, minWidth2, 0.5f, x + this.position), AbstractC5044xl.w(height, minHeight2, 0.5f, y), minWidth2, minHeight2);
                return;
            }
            return;
        }
        if (backgroundDrawable != null) {
            f2 = 0.0f;
            drawRound(batch, backgroundDrawable, ((width - backgroundDrawable.getMinWidth()) * 0.5f) + x, y, backgroundDrawable.getMinWidth(), height);
            float topHeight = backgroundDrawable.getTopHeight();
            bottomHeight = backgroundDrawable.getBottomHeight();
            height -= topHeight + bottomHeight;
        } else {
            f2 = 0.0f;
            bottomHeight = 0.0f;
        }
        float f5 = height - minHeight;
        float fClamp2 = MathUtils.clamp(f5 * visualPercent, f2, f5);
        this.position = bottomHeight + fClamp2;
        float f6 = minHeight * 0.5f;
        if (knobBeforeDrawable != null) {
            drawRound(batch, knobBeforeDrawable, ((width - knobBeforeDrawable.getMinWidth()) * 0.5f) + x, y + bottomHeight, knobBeforeDrawable.getMinWidth(), fClamp2 + f6);
        }
        if (knobAfterDrawable != 0) {
            drawRound(batch, knobAfterDrawable, ((width - knobAfterDrawable.getMinWidth()) * 0.5f) + x, this.position + y + f6, knobAfterDrawable.getMinWidth(), f5 - (this.round ? (float) Math.ceil(fClamp2 - f6) : fClamp2 - f6));
        }
        if (knobDrawable != null) {
            float minWidth3 = knobDrawable.getMinWidth();
            float minHeight3 = knobDrawable.getMinHeight();
            drawRound(batch, knobDrawable, AbstractC5044xl.w(width, minWidth3, 0.5f, x), AbstractC5044xl.w(minHeight, minHeight3, 0.5f, y + this.position), minWidth3, minHeight3);
        }
    }

    @Null
    public Drawable getBackgroundDrawable() {
        Drawable drawable;
        return (!this.disabled || (drawable = this.style.disabledBackground) == null) ? this.style.background : drawable;
    }

    public Drawable getKnobAfterDrawable() {
        Drawable drawable;
        return (!this.disabled || (drawable = this.style.disabledKnobAfter) == null) ? this.style.knobAfter : drawable;
    }

    public Drawable getKnobBeforeDrawable() {
        Drawable drawable;
        return (!this.disabled || (drawable = this.style.disabledKnobBefore) == null) ? this.style.knobBefore : drawable;
    }

    @Null
    public Drawable getKnobDrawable() {
        Drawable drawable;
        return (!this.disabled || (drawable = this.style.disabledKnob) == null) ? this.style.knob : drawable;
    }

    public float getKnobPosition() {
        return this.position;
    }

    public float getMaxValue() {
        return this.max;
    }

    public float getMinValue() {
        return this.min;
    }

    public float getPercent() {
        float f = this.min;
        float f2 = this.max;
        if (f == f2) {
            return 0.0f;
        }
        return (this.value - f) / (f2 - f);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        if (this.vertical) {
            return 140.0f;
        }
        Drawable drawable = this.style.knob;
        Drawable backgroundDrawable = getBackgroundDrawable();
        return Math.max(drawable == null ? 0.0f : drawable.getMinHeight(), backgroundDrawable != null ? backgroundDrawable.getMinHeight() : 0.0f);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        if (!this.vertical) {
            return 140.0f;
        }
        Drawable drawable = this.style.knob;
        Drawable backgroundDrawable = getBackgroundDrawable();
        return Math.max(drawable == null ? 0.0f : drawable.getMinWidth(), backgroundDrawable != null ? backgroundDrawable.getMinWidth() : 0.0f);
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public ProgressBarStyle getStyle() {
        return this.style;
    }

    public float getValue() {
        return this.value;
    }

    public float getVisualPercent() {
        if (this.min == this.max) {
            return 0.0f;
        }
        Interpolation interpolation = this.visualInterpolation;
        float visualValue = getVisualValue();
        float f = this.min;
        return interpolation.apply((visualValue - f) / (this.max - f));
    }

    public float getVisualValue() {
        float f = this.animateTime;
        return f > 0.0f ? this.animateInterpolation.apply(this.animateFromValue, this.value, 1.0f - (f / this.animateDuration)) : this.value;
    }

    public boolean isAnimating() {
        return this.animateTime > 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public boolean isDisabled() {
        return this.disabled;
    }

    public boolean isVertical() {
        return this.vertical;
    }

    public float round(float f) {
        return Math.round(f / this.stepSize) * this.stepSize;
    }

    public void setAnimateDuration(float f) {
        this.animateDuration = f;
    }

    public void setAnimateInterpolation(Interpolation interpolation) {
        if (interpolation == null) {
            throw new IllegalArgumentException("animateInterpolation cannot be null.");
        }
        this.animateInterpolation = interpolation;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public void setDisabled(boolean z) {
        this.disabled = z;
    }

    public void setProgrammaticChangeEvents(boolean z) {
        this.programmaticChangeEvents = z;
    }

    public void setRange(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("min must be <= max: " + f + " <= " + f2);
        }
        this.min = f;
        this.max = f2;
        float f3 = this.value;
        if (f3 < f) {
            setValue(f);
        } else if (f3 > f2) {
            setValue(f2);
        }
    }

    public void setRound(boolean z) {
        this.round = z;
    }

    public void setStepSize(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException(DM.g("steps must be > 0: ", f));
        }
        this.stepSize = f;
    }

    public void setStyle(ProgressBarStyle progressBarStyle) {
        if (progressBarStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = progressBarStyle;
        invalidateHierarchy();
    }

    public boolean setValue(float f) {
        float fClamp = clamp(round(f));
        float f2 = this.value;
        if (fClamp == f2) {
            return false;
        }
        float visualValue = getVisualValue();
        this.value = fClamp;
        if (this.programmaticChangeEvents) {
            ChangeListener.ChangeEvent changeEvent = (ChangeListener.ChangeEvent) Pools.obtain(ChangeListener.ChangeEvent.class);
            boolean zFire = fire(changeEvent);
            Pools.free(changeEvent);
            if (zFire) {
                this.value = f2;
                return false;
            }
        }
        float f3 = this.animateDuration;
        if (f3 <= 0.0f) {
            return true;
        }
        this.animateFromValue = visualValue;
        this.animateTime = f3;
        return true;
    }

    public void setVisualInterpolation(Interpolation interpolation) {
        this.visualInterpolation = interpolation;
    }

    public void updateVisualValue() {
        this.animateTime = 0.0f;
    }

    public ProgressBar(float f, float f2, float f3, boolean z, Skin skin, String str) {
        this(f, f2, f3, z, (ProgressBarStyle) skin.get(str, ProgressBarStyle.class));
    }

    public ProgressBar(float f, float f2, float f3, boolean z, ProgressBarStyle progressBarStyle) {
        Interpolation interpolation = Interpolation.linear;
        this.animateInterpolation = interpolation;
        this.visualInterpolation = interpolation;
        this.round = true;
        this.programmaticChangeEvents = true;
        if (f > f2) {
            throw new IllegalArgumentException("max must be > min. min,max: " + f + ", " + f2);
        }
        if (f3 > 0.0f) {
            setStyle(progressBarStyle);
            this.min = f;
            this.max = f2;
            this.stepSize = f3;
            this.vertical = z;
            this.value = f;
            setSize(getPrefWidth(), getPrefHeight());
            return;
        }
        throw new IllegalArgumentException(DM.g("stepSize must be > 0: ", f3));
    }
}
