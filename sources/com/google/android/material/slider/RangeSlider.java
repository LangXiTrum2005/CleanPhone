package com.google.android.material.slider;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RangeSlider extends BaseSlider<RangeSlider, OnChangeListener, OnSliderTouchListener> {
    public float S0;
    public int T0;

    public interface OnChangeListener extends BaseOnChangeListener<RangeSlider> {
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<RangeSlider> {
    }

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new AnonymousClass1();
        public float X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19487Y;

        /* JADX INFO: renamed from: com.google.android.material.slider.RangeSlider$RangeSliderState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<RangeSliderState> {
            @Override // android.os.Parcelable.Creator
            public final RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final RangeSliderState[] newArray(int i2) {
                return new RangeSliderState[i2];
            }
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.X);
            parcel.writeInt(this.f19487Y);
        }

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.X = parcel.readFloat();
            this.f19487Y = parcel.readInt();
        }
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

    @Override // com.google.android.material.slider.BaseSlider
    public float getMinSeparation() {
        return this.S0;
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

    public float getValueFrom() {
        return this.v0;
    }

    public float getValueTo() {
        return this.w0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.S0 = rangeSliderState.X;
        int i2 = rangeSliderState.f19487Y;
        this.T0 = i2;
        setSeparationUnit(i2);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.X = this.S0;
        rangeSliderState.f19487Y = this.T0;
        return rangeSliderState;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
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

    public void setMinSeparation(float f) {
        this.S0 = f;
        this.T0 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.S0 = f;
        this.T0 = 1;
        setSeparationUnit(1);
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

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(Float... fArr) {
        super.setValues(fArr);
    }

    public void setCustomThumbDrawable(int i2) {
        setCustomThumbDrawable(getResources().getDrawable(i2));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(List<Float> list) {
        super.setValues(list);
    }
}
