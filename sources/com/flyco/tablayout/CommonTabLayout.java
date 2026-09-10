package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    public int e0;
    public int f0;
    public int g0;
    public long h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public OnTabSelectListener p0;

    /* JADX INFO: renamed from: com.flyco.tablayout.CommonTabLayout$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((Integer) view.getTag()).getClass();
            throw null;
        }
    }

    public class IndicatorPoint {
    }

    public class PointEvaluator implements TypeEvaluator<IndicatorPoint> {
        @Override // android.animation.TypeEvaluator
        public final IndicatorPoint evaluate(float f, IndicatorPoint indicatorPoint, IndicatorPoint indicatorPoint2) {
            indicatorPoint.getClass();
            indicatorPoint2.getClass();
            return new IndicatorPoint();
        }
    }

    public final void a() {
        throw null;
    }

    public int getCurrentTab() {
        return this.e0;
    }

    public int getDividerColor() {
        return this.k0;
    }

    public float getDividerPadding() {
        return 0.0f;
    }

    public float getDividerWidth() {
        return 0.0f;
    }

    public int getIconGravity() {
        return this.o0;
    }

    public float getIconHeight() {
        return 0.0f;
    }

    public float getIconMargin() {
        return 0.0f;
    }

    public float getIconWidth() {
        return 0.0f;
    }

    public long getIndicatorAnimDuration() {
        return this.h0;
    }

    public int getIndicatorColor() {
        return this.g0;
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

    public int getIndicatorStyle() {
        return this.f0;
    }

    public float getIndicatorWidth() {
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
        return this.n0;
    }

    public int getTextSelectColor() {
        return this.l0;
    }

    public int getTextUnselectColor() {
        return this.m0;
    }

    public float getTextsize() {
        return 0.0f;
    }

    public int getUnderlineColor() {
        return this.j0;
    }

    public float getUnderlineHeight() {
        return 0.0f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
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
        if (this.i0) {
            throw null;
        }
        invalidate();
    }

    public void setDividerColor(int i2) {
        this.k0 = i2;
        invalidate();
    }

    public void setDividerPadding(float f) {
        throw null;
    }

    public void setDividerWidth(float f) {
        throw null;
    }

    public void setIconGravity(int i2) {
        this.o0 = i2;
        throw null;
    }

    public void setIconHeight(float f) {
        throw null;
    }

    public void setIconMargin(float f) {
        throw null;
    }

    public void setIconVisible(boolean z2) {
        throw null;
    }

    public void setIconWidth(float f) {
        throw null;
    }

    public void setIndicatorAnimDuration(long j) {
        this.h0 = j;
    }

    public void setIndicatorAnimEnable(boolean z2) {
        this.i0 = z2;
    }

    public void setIndicatorBounceEnable(boolean z2) {
    }

    public void setIndicatorColor(int i2) {
        this.g0 = i2;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        throw null;
    }

    public void setIndicatorGravity(int i2) {
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        throw null;
    }

    public void setIndicatorStyle(int i2) {
        this.f0 = i2;
        invalidate();
    }

    public void setIndicatorWidth(float f) {
        throw null;
    }

    public void setOnTabSelectListener(OnTabSelectListener onTabSelectListener) {
        this.p0 = onTabSelectListener;
    }

    public void setTabData(ArrayList<CustomTabEntity> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            throw null;
        }
        throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
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
        this.n0 = i2;
        a();
    }

    public void setTextSelectColor(int i2) {
        this.l0 = i2;
        a();
    }

    public void setTextUnselectColor(int i2) {
        this.m0 = i2;
        a();
    }

    public void setTextsize(float f) {
        throw null;
    }

    public void setUnderlineColor(int i2) {
        this.j0 = i2;
        invalidate();
    }

    public void setUnderlineGravity(int i2) {
        invalidate();
    }

    public void setUnderlineHeight(float f) {
        throw null;
    }
}
