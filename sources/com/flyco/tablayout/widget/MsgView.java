package com.flyco.tablayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.flyco.tablayout.R;

/* JADX INFO: loaded from: classes3.dex */
public class MsgView extends TextView {
    public final Context e0;
    public final GradientDrawable f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;

    public MsgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f0 = new GradientDrawable();
        this.e0 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f16662a);
        this.g0 = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.j0 = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.k0 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.l0 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = this.f0;
        int i2 = this.g0;
        int i3 = this.j0;
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(this.h0);
        gradientDrawable.setStroke(this.i0, i3);
        stateListDrawable.addState(new int[]{-16842919}, gradientDrawable);
        setBackground(stateListDrawable);
    }

    public int getBackgroundColor() {
        return this.g0;
    }

    public int getCornerRadius() {
        return this.h0;
    }

    public int getStrokeColor() {
        return this.j0;
    }

    public int getStrokeWidth() {
        return this.i0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.k0) {
            setCornerRadius(getHeight() / 2);
        } else {
            a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.l0 || getWidth() <= 0 || getHeight() <= 0) {
            super.onMeasure(i2, i3);
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), 1073741824);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.g0 = i2;
        a();
    }

    public void setCornerRadius(int i2) {
        this.h0 = (int) ((i2 * this.e0.getResources().getDisplayMetrics().density) + 0.5f);
        a();
    }

    public void setIsRadiusHalfHeight(boolean z2) {
        this.k0 = z2;
        a();
    }

    public void setIsWidthHeightEqual(boolean z2) {
        this.l0 = z2;
        a();
    }

    public void setStrokeColor(int i2) {
        this.j0 = i2;
        a();
    }

    public void setStrokeWidth(int i2) {
        this.i0 = (int) ((i2 * this.e0.getResources().getDisplayMetrics().density) + 0.5f);
        a();
    }
}
