package com.google.android.material.slider;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes4.dex */
public class Slider extends BaseSlider<Slider, OnChangeListener, OnSliderTouchListener> {

    public interface OnChangeListener extends BaseOnChangeListener<Slider> {
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<Slider> {
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.y0;
    }

    public int getFocusedThumbIndex() {
        return this.z0;
    }

    public int getHaloRadius() {
        return this.l0;
    }

    public ColorStateList getHaloTintList() {
        return this.I0;
    }

    public int getLabelBehavior() {
        return this.h0;
    }

    public float getStepSize() {
        return this.A0;
    }

    public float getThumbElevation() {
        throw null;
    }

    public int getThumbHeight() {
        return this.k0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public int getThumbRadius() {
        return this.j0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        throw null;
    }

    public float getThumbStrokeWidth() {
        throw null;
    }

    public ColorStateList getThumbTintList() {
        throw null;
    }

    public int getThumbTrackGapSize() {
        return this.m0;
    }

    public int getThumbWidth() {
        return this.j0;
    }

    public int getTickActiveRadius() {
        return this.D0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.J0;
    }

    public int getTickInactiveRadius() {
        return this.E0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.K0;
    }

    public ColorStateList getTickTintList() {
        if (this.K0.equals(this.J0)) {
            return this.J0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.L0;
    }

    public int getTrackHeight() {
        return this.i0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.M0;
    }

    public int getTrackInsideCornerSize() {
        return this.q0;
    }

    public int getTrackSidePadding() {
        return 0;
    }

    public int getTrackStopIndicatorSize() {
        return this.p0;
    }

    public ColorStateList getTrackTintList() {
        if (this.M0.equals(this.L0)) {
            return this.L0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.F0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.v0;
    }

    public float getValueTo() {
        return this.w0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean n() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.x0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.z0 = i2;
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int i2) {
        super.setHaloRadius(i2);
    }

    public void setHaloRadiusResource(int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    public void setLabelBehavior(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            requestLayout();
        }
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.t0 = labelFormatter;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    public void setThumbElevation(float f) {
        throw null;
    }

    public void setThumbElevationResource(int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int i2) {
        super.setThumbHeight(i2);
    }

    public void setThumbHeightResource(int i2) {
        setThumbHeight(getResources().getDimensionPixelSize(i2));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int i2) {
        super.setThumbRadius(i2);
    }

    public void setThumbRadiusResource(int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setThumbStrokeColorResource(int i2) {
        if (i2 != 0) {
            setThumbStrokeColor(ContextCompat.getColorStateList(getContext(), i2));
        }
    }

    public void setThumbStrokeWidth(float f) {
        throw null;
    }

    public void setThumbStrokeWidthResource(int i2) {
        if (i2 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i2));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i2) {
        super.setThumbTrackGapSize(i2);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int i2) {
        super.setThumbWidth(i2);
    }

    public void setThumbWidthResource(int i2) {
        setThumbWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setTickActiveRadius(int i2) {
        if (this.D0 == i2) {
            return;
        }
        this.D0 = i2;
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    public void setTickInactiveRadius(int i2) {
        if (this.E0 == i2) {
            return;
        }
        this.E0 = i2;
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z2) {
        if (this.C0 != z2) {
            this.C0 = z2;
            postInvalidate();
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    public void setTrackHeight(int i2) {
        if (this.i0 == i2) {
            return;
        }
        this.i0 = i2;
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public void setTrackInsideCornerSize(int i2) {
        if (this.q0 == i2) {
            return;
        }
        this.q0 = i2;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i2) {
        if (this.p0 == i2) {
            return;
        }
        this.p0 = i2;
        throw null;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.v0 = f;
        this.H0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.w0 = f;
        this.H0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(int i2) {
        setCustomThumbDrawable(getResources().getDrawable(i2));
    }
}
