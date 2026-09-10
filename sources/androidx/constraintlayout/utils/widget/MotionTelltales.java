package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {
    public MotionLayout e0;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(null);
        if (this.e0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.e0 = (MotionLayout) parent;
                return;
            }
            return;
        }
        getWidth();
        getHeight();
        MotionLayout motionLayout = this.e0;
        float f = motionLayout.q0;
        if (motionLayout.f0 != null) {
            Math.signum(motionLayout.s0 - f);
            motionLayout.f0.getInterpolation(motionLayout.q0 + 1.0E-5f);
            motionLayout.f0.getInterpolation(motionLayout.q0);
        }
        Interpolator interpolator = motionLayout.f0;
        if (!(interpolator instanceof MotionInterpolator)) {
            throw null;
        }
        ((MotionInterpolator) interpolator).a();
        throw null;
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence.toString();
        requestLayout();
    }
}
