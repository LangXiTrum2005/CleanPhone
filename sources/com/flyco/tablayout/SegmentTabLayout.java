package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.view.View;
import android.widget.FrameLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

/* JADX INFO: loaded from: classes3.dex */
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    public int e0;
    public int f0;
    public long g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public OnTabSelectListener m0;

    /* JADX INFO: renamed from: com.flyco.tablayout.SegmentTabLayout$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((Integer) view.getTag()).getClass();
            throw null;
        }
    }

    public class IndicatorPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f16664a;
    }

    public class PointEvaluator implements TypeEvaluator<IndicatorPoint> {
        @Override // android.animation.TypeEvaluator
        public final IndicatorPoint evaluate(float f, IndicatorPoint indicatorPoint, IndicatorPoint indicatorPoint2) {
            float f2 = indicatorPoint.f16664a;
            float fA = a.a(indicatorPoint2.f16664a, f2, f, f2);
            IndicatorPoint indicatorPoint3 = new IndicatorPoint();
            indicatorPoint3.f16664a = fA;
            return indicatorPoint3;
        }
    }

    public int getCurrentTab() {
        return this.e0;
    }

    public int getDividerColor() {
        return this.i0;
    }

    public float getDividerPadding() {
        return 0.0f;
    }

    public float getDividerWidth() {
        return 0.0f;
    }

    public long getIndicatorAnimDuration() {
        return this.g0;
    }

    public int getIndicatorColor() {
        return this.f0;
    }

    public float getIndicatorCornerRadius() {
        throw null;
    }

    public float getIndicatorHeight() {
        throw null;
    }

    public float getIndicatorMarginBottom() {
        return 0.0f;
    }

    public float getIndicatorMarginLeft() {
        return 0.0f;
    }

    public float getIndicatorMarginRight() {
        return 0.0f;
    }

    public float getIndicatorMarginTop() {
        return 0.0f;
    }

    public int getTabCount() {
        return 0;
    }

    public float getTabPadding() {
        return 0.0f;
    }

    public float getTabWidth() {
        return 0.0f;
    }

    public int getTextBold() {
        return this.l0;
    }

    public int getTextSelectColor() {
        return this.j0;
    }

    public int getTextUnselectColor() {
        return this.k0;
    }

    public float getTextsize() {
        return 0.0f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = ((IndicatorPoint) valueAnimator.getAnimatedValue()).f16664a;
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.e0 = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.e0 != 0) {
                throw null;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.e0);
        return bundle;
    }

    public void setCurrentTab(int i2) {
        this.e0 = i2;
        if (this.h0) {
            throw null;
        }
        invalidate();
    }

    public void setDividerColor(int i2) {
        this.i0 = i2;
        invalidate();
    }

    public void setDividerPadding(float f) {
        throw null;
    }

    public void setDividerWidth(float f) {
        throw null;
    }

    public void setIndicatorAnimDuration(long j) {
        this.g0 = j;
    }

    public void setIndicatorAnimEnable(boolean z2) {
        this.h0 = z2;
    }

    public void setIndicatorBounceEnable(boolean z2) {
    }

    public void setIndicatorColor(int i2) {
        this.f0 = i2;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        throw null;
    }

    public void setIndicatorHeight(float f) {
        throw null;
    }

    public void setOnTabSelectListener(OnTabSelectListener onTabSelectListener) {
        this.m0 = onTabSelectListener;
    }

    public void setTabData(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            throw null;
        }
        throw new IllegalStateException("Titles can not be NULL or EMPTY !");
    }

    public void setTabPadding(float f) {
        throw null;
    }

    public void setTabSpaceEqual(boolean z2) {
        throw null;
    }

    public void setTabWidth(float f) {
        throw null;
    }

    public void setTextAllCaps(boolean z2) {
        throw null;
    }

    public void setTextBold(int i2) {
        this.l0 = i2;
        throw null;
    }

    public void setTextSelectColor(int i2) {
        this.j0 = i2;
        throw null;
    }

    public void setTextUnselectColor(int i2) {
        this.k0 = i2;
        throw null;
    }

    public void setTextsize(float f) {
        throw null;
    }
}
