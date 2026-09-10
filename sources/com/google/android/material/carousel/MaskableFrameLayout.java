package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: loaded from: classes4.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    public static final /* synthetic */ int h0 = 0;
    public float e0;
    public OnMaskChangedListener f0;
    public ShapeAppearanceModel g0;

    public final void a() {
        if (this.e0 != -1.0f) {
            float fB = AnimationUtils.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.e0);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        throw null;
    }

    public RectF getMaskRectF() {
        return null;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.e0;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.g0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.e0 != -1.0f) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setForceCompatClipping(boolean z2) {
        throw null;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(RectF rectF) {
        throw null;
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float fA = MathUtils.a(f, 0.0f, 1.0f);
        if (this.e0 != fA) {
            this.e0 = fA;
            a();
        }
    }

    public void setOnMaskChangedListener(OnMaskChangedListener onMaskChangedListener) {
        this.f0 = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.g0 = shapeAppearanceModel.g(new f(27));
        throw null;
    }
}
