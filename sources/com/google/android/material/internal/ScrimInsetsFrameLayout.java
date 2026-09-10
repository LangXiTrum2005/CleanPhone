package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes4.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    public Drawable e0;

    /* JADX INFO: renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$1, reason: invalid class name */
    class AnonymousClass1 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
            throw null;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.e0;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.e0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z2) {
    }

    public void setDrawLeftInsetForeground(boolean z2) {
    }

    public void setDrawRightInsetForeground(boolean z2) {
    }

    public void setDrawTopInsetForeground(boolean z2) {
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.e0 = drawable;
    }
}
