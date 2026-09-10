package com.google.android.material.divider;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialDivider extends View {
    public int e0;
    public int f0;
    public int g0;
    public int h0;

    public int getDividerColor() {
        return this.f0;
    }

    public int getDividerInsetEnd() {
        return this.h0;
    }

    public int getDividerInsetStart() {
        return this.g0;
    }

    public int getDividerThickness() {
        return this.e0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (getLayoutDirection() != 1) {
        }
        getWidth();
        getBottom();
        getTop();
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i4 = this.e0;
            if (i4 > 0 && measuredHeight != i4) {
                measuredHeight = i4;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i2) {
        if (this.f0 == i2) {
            return;
        }
        this.f0 = i2;
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setDividerColorResource(int i2) {
        setDividerColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setDividerInsetEnd(int i2) {
        this.h0 = i2;
    }

    public void setDividerInsetEndResource(int i2) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerInsetStart(int i2) {
        this.g0 = i2;
    }

    public void setDividerInsetStartResource(int i2) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerThickness(int i2) {
        if (this.e0 != i2) {
            this.e0 = i2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i2) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i2));
    }
}
