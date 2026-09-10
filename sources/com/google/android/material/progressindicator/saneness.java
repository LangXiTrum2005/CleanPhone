package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.rotuma;

/* JADX INFO: compiled from: BaseProgressIndicatorSpec.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class saneness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f20740apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f20741attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f20742beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f20743competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f20744cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f20745dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f20746formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f20747impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f20748impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int[] f20749marial = new int[0];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f20750saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f20751taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f20752triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f20753wireman;

    public saneness(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bubbles.marial.mtrl_progress_track_thickness);
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(context, attributeSet, bubbles.impassible.BaseProgressIndicator, i, i2, new int[0]);
        this.f20741attabal = mullein.dern.wireman(context, typedArrayTaiyuan, bubbles.impassible.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayTaiyuan.peekValue(bubbles.impassible.BaseProgressIndicator_trackCornerRadius);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.f20750saneness = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayTaiyuan.getResources().getDisplayMetrics()), this.f20741attabal / 2);
                this.f20753wireman = false;
            } else if (i3 == 6) {
                this.f20745dern = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f20753wireman = true;
            }
        }
        this.f20743competently = typedArrayTaiyuan.getInt(bubbles.impassible.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f20748impromptu = typedArrayTaiyuan.getInt(bubbles.impassible.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.f20751taiyuan = typedArrayTaiyuan.getDimensionPixelSize(bubbles.impassible.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int iAbs = Math.abs(typedArrayTaiyuan.getDimensionPixelSize(bubbles.impassible.BaseProgressIndicator_wavelength, 0));
        this.f20744cutely = Math.abs(typedArrayTaiyuan.getDimensionPixelSize(bubbles.impassible.BaseProgressIndicator_wavelengthDeterminate, iAbs));
        this.f20740apical = Math.abs(typedArrayTaiyuan.getDimensionPixelSize(bubbles.impassible.BaseProgressIndicator_wavelengthIndeterminate, iAbs));
        this.f20746formularize = Math.abs(typedArrayTaiyuan.getDimensionPixelSize(bubbles.impassible.BaseProgressIndicator_waveAmplitude, 0));
        this.f20747impassible = typedArrayTaiyuan.getDimensionPixelSize(bubbles.impassible.BaseProgressIndicator_waveSpeed, 0);
        this.f20752triweekly = typedArrayTaiyuan.getFloat(bubbles.impassible.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        marial(context, typedArrayTaiyuan);
        beachfront(context, typedArrayTaiyuan);
        typedArrayTaiyuan.recycle();
    }

    public int attabal() {
        return this.f20753wireman ? (int) (this.f20741attabal * this.f20745dern) : this.f20750saneness;
    }

    public final void beachfront(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(bubbles.impassible.BaseProgressIndicator_trackColor)) {
            this.f20742beachfront = typedArray.getColor(bubbles.impassible.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.f20742beachfront = this.f20749marial[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f20742beachfront = pyrope.attabal.attabal(this.f20742beachfront, (int) (f * 255.0f));
    }

    public boolean competently() {
        return this.f20753wireman && this.f20745dern == 0.5f;
    }

    public boolean dern() {
        return this.f20748impromptu != 0;
    }

    public void impromptu() {
        if (this.f20751taiyuan < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public final void marial(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(bubbles.impassible.BaseProgressIndicator_indicatorColor)) {
            this.f20749marial = new int[]{pyrope.attabal.saneness(context, beachfront.attabal.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(bubbles.impassible.BaseProgressIndicator_indicatorColor).type != 1) {
            this.f20749marial = new int[]{typedArray.getColor(bubbles.impassible.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(bubbles.impassible.BaseProgressIndicator_indicatorColor, -1));
        this.f20749marial = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public boolean saneness(boolean z) {
        if (this.f20746formularize <= 0) {
            return false;
        }
        if (z || this.f20740apical <= 0) {
            return z && this.f20744cutely > 0;
        }
        return true;
    }

    public boolean wireman() {
        return this.f20743competently != 0;
    }
}
