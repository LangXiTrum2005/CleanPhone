package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public int n0;
    public int o0;
    public BasicMeasure.Measure p0;
    public BasicMeasure.Measurer q0;

    public void C(int i2, int i3, int i4, int i5) {
    }

    public final void D(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            measurer = this.q0;
            if (measurer != null || (constraintWidget2 = this.K) == null) {
                break;
            } else {
                this.q0 = ((ConstraintWidgetContainer) constraintWidget2).h0;
            }
        }
        BasicMeasure.Measure measure = this.p0;
        measure.f3989a = dimensionBehaviour;
        measure.f3990b = dimensionBehaviour2;
        measure.f3991c = i2;
        measure.d = i3;
        measurer.b(constraintWidget, measure);
        constraintWidget.z(measure.f3992e);
        constraintWidget.w(measure.f);
        constraintWidget.f3970w = measure.f3993h;
        int i4 = measure.g;
        constraintWidget.f3953R = i4;
        constraintWidget.f3970w = i4 > 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.Helper
    public final void a() {
        for (int i2 = 0; i2 < this.f0; i2++) {
            ConstraintWidget constraintWidget = this.e0[i2];
        }
    }
}
