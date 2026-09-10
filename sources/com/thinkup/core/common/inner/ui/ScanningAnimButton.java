package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/* JADX INFO: loaded from: classes6.dex */
public class ScanningAnimButton extends Button {
    private int m;
    private volatile boolean o;

    public ScanningAnimButton(Context context) {
        this(context, null);
    }

    private static void m() {
    }

    private static void n() {
    }

    private void o() {
        setGravity(17);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i2 = this.m;
        if (i2 != 0) {
            startAnimation(i2);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    public void startAnimation(int i2) {
        this.m = i2;
        if (this.o) {
            return;
        }
        this.o = true;
    }

    public void stopAnimation() {
        this.o = false;
    }

    public ScanningAnimButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScanningAnimButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = 0;
        setGravity(17);
    }
}
