package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public float l0;
    public float m0;
    public float n0;
    public ConstraintLayout o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w0;
    public View[] x0;
    public float y0;
    public float z0;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h() {
        l();
        this.r0 = Float.NaN;
        this.s0 = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).l0;
        constraintWidget.z(0);
        constraintWidget.w(0);
        k();
        layout(((int) this.v0) - getPaddingLeft(), ((int) this.w0) - getPaddingTop(), getPaddingRight() + ((int) this.t0), getPaddingBottom() + ((int) this.u0));
        if (Float.isNaN(this.n0)) {
            return;
        }
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void i(ConstraintLayout constraintLayout) {
        this.o0 = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.n0 = rotation;
        } else {
            if (Float.isNaN(this.n0)) {
                return;
            }
            this.n0 = rotation;
        }
    }

    public final void k() {
        if (this.o0 == null) {
            return;
        }
        if (Float.isNaN(this.r0) || Float.isNaN(this.s0)) {
            if (!Float.isNaN(this.l0) && !Float.isNaN(this.m0)) {
                this.s0 = this.m0;
                this.r0 = this.l0;
                return;
            }
            View[] viewArrE = e(this.o0);
            int left = viewArrE[0].getLeft();
            int top2 = viewArrE[0].getTop();
            int right = viewArrE[0].getRight();
            int bottom = viewArrE[0].getBottom();
            for (int i2 = 0; i2 < this.f0; i2++) {
                View view = viewArrE[i2];
                left = Math.min(left, view.getLeft());
                top2 = Math.min(top2, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.t0 = right;
            this.u0 = bottom;
            this.v0 = left;
            this.w0 = top2;
            if (Float.isNaN(this.l0)) {
                this.r0 = (left + right) / 2;
            } else {
                this.r0 = this.l0;
            }
            if (Float.isNaN(this.m0)) {
                this.s0 = (top2 + bottom) / 2;
            } else {
                this.s0 = this.m0;
            }
        }
    }

    public final void l() {
        int i2;
        if (this.o0 == null || (i2 = this.f0) == 0) {
            return;
        }
        View[] viewArr = this.x0;
        if (viewArr == null || viewArr.length != i2) {
            this.x0 = new View[i2];
        }
        for (int i3 = 0; i3 < this.f0; i3++) {
            this.x0[i3] = this.o0.getViewById(this.e0[i3]);
        }
    }

    public final void m() {
        if (this.o0 == null) {
            return;
        }
        if (this.x0 == null) {
            l();
        }
        k();
        double radians = Math.toRadians(this.n0);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.p0;
        float f2 = f * fCos;
        float f3 = this.q0;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i2 = 0; i2 < this.f0; i2++) {
            View view = this.x0[i2];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.r0;
            float f8 = bottom - this.s0;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.y0;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.z0;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.q0);
            view.setScaleX(this.p0);
            view.setRotation(this.n0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o0 = (ConstraintLayout) getParent();
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f0; i2++) {
            View viewById = this.o0.getViewById(this.e0[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.l0 = f;
        m();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.m0 = f;
        m();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.n0 = f;
        m();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.p0 = f;
        m();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.q0 = f;
        m();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.y0 = f;
        m();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.z0 = f;
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}
