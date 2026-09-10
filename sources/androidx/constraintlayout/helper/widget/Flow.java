package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public final androidx.constraintlayout.solver.widgets.Flow n0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = new int[32];
        this.j0 = null;
        this.k0 = new HashMap();
        this.g0 = context;
        super.f(attributeSet);
        androidx.constraintlayout.solver.widgets.Flow flow = new androidx.constraintlayout.solver.widgets.Flow();
        flow.g0 = 0;
        flow.h0 = 0;
        flow.i0 = 0;
        flow.j0 = 0;
        flow.k0 = 0;
        flow.l0 = 0;
        flow.m0 = false;
        flow.n0 = 0;
        flow.o0 = 0;
        flow.p0 = new BasicMeasure.Measure();
        flow.q0 = null;
        flow.r0 = -1;
        flow.s0 = -1;
        flow.t0 = -1;
        flow.u0 = -1;
        flow.v0 = -1;
        flow.w0 = -1;
        flow.x0 = 0.5f;
        flow.y0 = 0.5f;
        flow.z0 = 0.5f;
        flow.A0 = 0.5f;
        flow.B0 = 0.5f;
        flow.C0 = 0.5f;
        flow.D0 = 0;
        flow.E0 = 0;
        flow.F0 = 2;
        flow.G0 = 2;
        flow.H0 = 0;
        flow.I0 = -1;
        flow.J0 = 0;
        flow.K0 = new ArrayList();
        flow.L0 = null;
        flow.M0 = null;
        flow.N0 = null;
        flow.P0 = 0;
        this.n0 = flow;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f4127b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.n0.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.solver.widgets.Flow flow2 = this.n0;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow2.g0 = dimensionPixelSize;
                    flow2.h0 = dimensionPixelSize;
                    flow2.i0 = dimensionPixelSize;
                    flow2.j0 = dimensionPixelSize;
                } else if (index == 11) {
                    androidx.constraintlayout.solver.widgets.Flow flow3 = this.n0;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow3.i0 = dimensionPixelSize2;
                    flow3.k0 = dimensionPixelSize2;
                    flow3.l0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.n0.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.n0.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.n0.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.n0.l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.n0.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.n0.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.n0.r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.n0.s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.n0.t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.n0.v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.n0.u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.n0.w0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.n0.x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.n0.z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.n0.B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.n0.A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.n0.C0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.n0.y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.n0.F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.n0.G0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.n0.D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.n0.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.n0.I0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.h0 = this.n0;
        j();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintWidget constraintWidget, boolean z2) {
        androidx.constraintlayout.solver.widgets.Flow flow = this.n0;
        int i2 = flow.i0;
        if (i2 > 0 || flow.j0 > 0) {
            if (z2) {
                flow.k0 = flow.j0;
                flow.l0 = i2;
            } else {
                flow.k0 = i2;
                flow.l0 = flow.j0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void k(androidx.constraintlayout.solver.widgets.VirtualLayout virtualLayout, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.C(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.n0, virtualLayout.o0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i2, int i3) {
        k(this.n0, i2, i3);
    }

    public void setFirstHorizontalBias(float f) {
        this.n0.z0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.n0.t0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.n0.A0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.n0.u0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.n0.F0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.n0.x0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.n0.D0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.n0.r0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.n0.I0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.n0.J0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        androidx.constraintlayout.solver.widgets.Flow flow = this.n0;
        flow.g0 = i2;
        flow.h0 = i2;
        flow.i0 = i2;
        flow.j0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.n0.h0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.n0.k0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.n0.l0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.n0.g0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.n0.G0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.n0.y0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.n0.E0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.n0.s0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.n0.H0 = i2;
        requestLayout();
    }
}
