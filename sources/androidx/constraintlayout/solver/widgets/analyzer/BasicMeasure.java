package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BasicMeasure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3986a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Measure f3987b = new Measure();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintWidgetContainer f3988c;

    public static class Measure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f3989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f3990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3991c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3992e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3993h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f3994i;
        public boolean j;
    }

    public enum MeasureType {
    }

    public interface Measurer {
        void a();

        void b(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f3988c = constraintWidgetContainer;
    }

    public final boolean a(Measurer measurer, ConstraintWidget constraintWidget, boolean z2) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f3949J;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        Measure measure = this.f3987b;
        measure.f3989a = dimensionBehaviour;
        measure.f3990b = dimensionBehaviourArr[1];
        measure.f3991c = constraintWidget.m();
        measure.d = constraintWidget.j();
        measure.f3994i = false;
        measure.j = z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f3989a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.Z;
        boolean z3 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z4 = measure.f3990b == dimensionBehaviour3;
        boolean z5 = z3 && constraintWidget.f3950N > 0.0f;
        boolean z6 = z4 && constraintWidget.f3950N > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.X;
        int[] iArr = constraintWidget.f3966l;
        if (z5 && iArr[0] == 4) {
            measure.f3989a = dimensionBehaviour4;
        }
        if (z6 && iArr[1] == 4) {
            measure.f3990b = dimensionBehaviour4;
        }
        measurer.b(constraintWidget, measure);
        constraintWidget.z(measure.f3992e);
        constraintWidget.w(measure.f);
        constraintWidget.f3970w = measure.f3993h;
        int i2 = measure.g;
        constraintWidget.f3953R = i2;
        constraintWidget.f3970w = i2 > 0;
        measure.j = false;
        return measure.f3994i;
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3) {
        int i4 = constraintWidgetContainer.S;
        int i5 = constraintWidgetContainer.T;
        constraintWidgetContainer.S = 0;
        constraintWidgetContainer.T = 0;
        constraintWidgetContainer.z(i2);
        constraintWidgetContainer.w(i3);
        if (i4 < 0) {
            constraintWidgetContainer.S = 0;
        } else {
            constraintWidgetContainer.S = i4;
        }
        if (i5 < 0) {
            constraintWidgetContainer.T = 0;
        } else {
            constraintWidgetContainer.T = i5;
        }
        this.f3988c.C();
    }
}
