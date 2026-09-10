package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pools;

/* JADX INFO: loaded from: classes.dex */
public class Slider extends ProgressBar {
    int button;
    int draggingPointer;
    boolean mouseOver;
    private float[] snapValues;
    private float threshold;
    private Interpolation visualInterpolationInverse;

    public static class SliderStyle extends ProgressBar.ProgressBarStyle {

        @Null
        public Drawable backgroundDown;

        @Null
        public Drawable backgroundOver;

        @Null
        public Drawable knobAfterDown;

        @Null
        public Drawable knobAfterOver;

        @Null
        public Drawable knobBeforeDown;

        @Null
        public Drawable knobBeforeOver;

        @Null
        public Drawable knobDown;

        @Null
        public Drawable knobOver;

        public SliderStyle() {
        }

        public SliderStyle(@Null Drawable drawable, @Null Drawable drawable2) {
            super(drawable, drawable2);
        }

        public SliderStyle(SliderStyle sliderStyle) {
            super(sliderStyle);
            this.backgroundOver = sliderStyle.backgroundOver;
            this.backgroundDown = sliderStyle.backgroundDown;
            this.knobOver = sliderStyle.knobOver;
            this.knobDown = sliderStyle.knobDown;
            this.knobBeforeOver = sliderStyle.knobBeforeOver;
            this.knobBeforeDown = sliderStyle.knobBeforeDown;
            this.knobAfterOver = sliderStyle.knobAfterOver;
            this.knobAfterDown = sliderStyle.knobAfterDown;
        }
    }

    public Slider(float f, float f2, float f3, boolean z, Skin skin) {
        this(f, f2, f3, z, (SliderStyle) skin.get("default-".concat(z ? "vertical" : "horizontal"), SliderStyle.class));
    }

    public boolean calculatePositionAndValue(float f, float f2) {
        float fApply;
        Drawable drawable = getStyle().knob;
        Drawable backgroundDrawable = getBackgroundDrawable();
        float f3 = this.position;
        float minValue = getMinValue();
        float maxValue = getMaxValue();
        if (this.vertical) {
            float height = (getHeight() - backgroundDrawable.getTopHeight()) - backgroundDrawable.getBottomHeight();
            float minHeight = drawable == null ? 0.0f : drawable.getMinHeight();
            float bottomHeight = (f2 - backgroundDrawable.getBottomHeight()) - (0.5f * minHeight);
            this.position = bottomHeight;
            float f4 = height - minHeight;
            fApply = (this.visualInterpolationInverse.apply(bottomHeight / f4) * (maxValue - minValue)) + minValue;
            float fMax = Math.max(Math.min(0.0f, backgroundDrawable.getBottomHeight()), this.position);
            this.position = fMax;
            this.position = Math.min(f4, fMax);
        } else {
            float width = (getWidth() - backgroundDrawable.getLeftWidth()) - backgroundDrawable.getRightWidth();
            float minWidth = drawable == null ? 0.0f : drawable.getMinWidth();
            float leftWidth = (f - backgroundDrawable.getLeftWidth()) - (0.5f * minWidth);
            this.position = leftWidth;
            float f5 = width - minWidth;
            float fApply2 = this.visualInterpolationInverse.apply(leftWidth / f5);
            float fMax2 = Math.max(Math.min(0.0f, backgroundDrawable.getLeftWidth()), this.position);
            this.position = fMax2;
            this.position = Math.min(f5, fMax2);
            fApply = (fApply2 * (maxValue - minValue)) + minValue;
        }
        float fSnap = (Gdx.input.isKeyPressed(59) || Gdx.input.isKeyPressed(60)) ? fApply : snap(fApply);
        boolean value = setValue(fSnap);
        if (fSnap == fApply) {
            this.position = f3;
        }
        return value;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    @Null
    public Drawable getBackgroundDrawable() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        SliderStyle sliderStyle = (SliderStyle) super.getStyle();
        if (this.disabled && (drawable3 = sliderStyle.disabledBackground) != null) {
            return drawable3;
        }
        if (!isDragging() || (drawable2 = sliderStyle.backgroundDown) == null) {
            return (!this.mouseOver || (drawable = sliderStyle.backgroundOver) == null) ? sliderStyle.background : drawable;
        }
        return drawable2;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    public Drawable getKnobAfterDrawable() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        SliderStyle sliderStyle = (SliderStyle) super.getStyle();
        if (this.disabled && (drawable3 = sliderStyle.disabledKnobAfter) != null) {
            return drawable3;
        }
        if (!isDragging() || (drawable2 = sliderStyle.knobAfterDown) == null) {
            return (!this.mouseOver || (drawable = sliderStyle.knobAfterOver) == null) ? sliderStyle.knobAfter : drawable;
        }
        return drawable2;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    public Drawable getKnobBeforeDrawable() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        SliderStyle sliderStyle = (SliderStyle) super.getStyle();
        if (this.disabled && (drawable3 = sliderStyle.disabledKnobBefore) != null) {
            return drawable3;
        }
        if (!isDragging() || (drawable2 = sliderStyle.knobBeforeDown) == null) {
            return (!this.mouseOver || (drawable = sliderStyle.knobBeforeOver) == null) ? sliderStyle.knobBefore : drawable;
        }
        return drawable2;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    @Null
    public Drawable getKnobDrawable() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        SliderStyle sliderStyle = (SliderStyle) super.getStyle();
        if (this.disabled && (drawable3 = sliderStyle.disabledKnob) != null) {
            return drawable3;
        }
        if (!isDragging() || (drawable2 = sliderStyle.knobDown) == null) {
            return (!this.mouseOver || (drawable = sliderStyle.knobOver) == null) ? sliderStyle.knob : drawable;
        }
        return drawable2;
    }

    @Null
    public float[] getSnapToValues() {
        return this.snapValues;
    }

    public float getSnapToValuesThreshold() {
        return this.threshold;
    }

    public boolean isDragging() {
        return this.draggingPointer != -1;
    }

    public boolean isOver() {
        return this.mouseOver;
    }

    public void setButton(int i) {
        this.button = i;
    }

    public void setSnapToValues(float f, @Null float... fArr) {
        if (fArr != null && fArr.length == 0) {
            throw new IllegalArgumentException("values cannot be empty.");
        }
        this.snapValues = fArr;
        this.threshold = f;
    }

    public void setVisualInterpolationInverse(Interpolation interpolation) {
        this.visualInterpolationInverse = interpolation;
    }

    public void setVisualPercent(float f) {
        float f2 = this.min;
        setValue((this.visualInterpolationInverse.apply(f) * (this.max - f2)) + f2);
    }

    public float snap(float f) {
        float[] fArr = this.snapValues;
        if (fArr == null || fArr.length == 0) {
            return f;
        }
        float f2 = 0.0f;
        int i = 0;
        float f3 = -1.0f;
        while (true) {
            float[] fArr2 = this.snapValues;
            if (i >= fArr2.length) {
                break;
            }
            float f4 = fArr2[i];
            float fAbs = Math.abs(f - f4);
            if (fAbs <= this.threshold && (f3 == -1.0f || fAbs < f3)) {
                f2 = f4;
                f3 = fAbs;
            }
            i++;
        }
        return f3 == -1.0f ? f : f2;
    }

    public Slider(float f, float f2, float f3, boolean z, Skin skin, String str) {
        this(f, f2, f3, z, (SliderStyle) skin.get(str, SliderStyle.class));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    public SliderStyle getStyle() {
        return (SliderStyle) super.getStyle();
    }

    public Slider(float f, float f2, float f3, boolean z, SliderStyle sliderStyle) {
        super(f, f2, f3, z, sliderStyle);
        this.button = -1;
        this.draggingPointer = -1;
        this.visualInterpolationInverse = Interpolation.linear;
        addListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Slider.1
            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void enter(InputEvent inputEvent, float f4, float f5, int i, @Null Actor actor) {
                if (i == -1) {
                    Slider.this.mouseOver = true;
                }
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void exit(InputEvent inputEvent, float f4, float f5, int i, @Null Actor actor) {
                if (i == -1) {
                    Slider.this.mouseOver = false;
                }
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean touchDown(InputEvent inputEvent, float f4, float f5, int i, int i2) {
                Slider slider = Slider.this;
                if (slider.disabled) {
                    return false;
                }
                int i3 = slider.button;
                if ((i3 != -1 && i3 != i2) || slider.draggingPointer != -1) {
                    return false;
                }
                slider.draggingPointer = i;
                slider.calculatePositionAndValue(f4, f5);
                return true;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void touchDragged(InputEvent inputEvent, float f4, float f5, int i) {
                Slider.this.calculatePositionAndValue(f4, f5);
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void touchUp(InputEvent inputEvent, float f4, float f5, int i, int i2) {
                Slider slider = Slider.this;
                if (i != slider.draggingPointer) {
                    return;
                }
                slider.draggingPointer = -1;
                if (inputEvent.isTouchFocusCancel() || !Slider.this.calculatePositionAndValue(f4, f5)) {
                    ChangeListener.ChangeEvent changeEvent = (ChangeListener.ChangeEvent) Pools.obtain(ChangeListener.ChangeEvent.class);
                    Slider.this.fire(changeEvent);
                    Pools.free(changeEvent);
                }
            }
        });
    }

    @Deprecated
    public void setSnapToValues(@Null float[] fArr, float f) {
        setSnapToValues(f, fArr);
    }
}
