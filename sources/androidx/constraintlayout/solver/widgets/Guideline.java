package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends ConstraintWidget {
    public float e0 = -1.0f;
    public int f0 = -1;
    public int g0 = -1;
    public ConstraintAnchor h0 = this.f3971z;
    public int i0 = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.Guideline$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3984a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f3984a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3984a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3984a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3984a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3984a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3984a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3984a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3984a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3984a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Guideline() {
        this.H.clear();
        this.H.add(this.h0);
        int length = this.G.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.G[i2] = this.h0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void B(LinearSystem linearSystem) {
        if (this.K == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.h0;
        linearSystem.getClass();
        int iM = LinearSystem.m(constraintAnchor);
        if (this.i0 == 1) {
            this.f3951P = iM;
            this.f3952Q = 0;
            w(this.K.j());
            z(0);
            return;
        }
        this.f3951P = 0;
        this.f3952Q = iM;
        z(this.K.m());
        w(0);
    }

    public final void C(int i2) {
        if (this.i0 == i2) {
            return;
        }
        this.i0 = i2;
        ArrayList arrayList = this.H;
        arrayList.clear();
        if (this.i0 == 1) {
            this.h0 = this.y;
        } else {
            this.h0 = this.f3971z;
        }
        arrayList.add(this.h0);
        ConstraintAnchor[] constraintAnchorArr = this.G;
        int length = constraintAnchorArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            constraintAnchorArr[i3] = this.h0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void b(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.K;
        if (constraintWidgetContainer == null) {
            return;
        }
        ConstraintAnchor constraintAnchorH = constraintWidgetContainer.h(ConstraintAnchor.Type.X);
        ConstraintAnchor constraintAnchorH2 = constraintWidgetContainer.h(ConstraintAnchor.Type.Z);
        ConstraintWidget constraintWidget = this.K;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f3974Y;
        boolean z2 = constraintWidget != null && constraintWidget.f3949J[0] == dimensionBehaviour;
        if (this.i0 == 0) {
            constraintAnchorH = constraintWidgetContainer.h(ConstraintAnchor.Type.f3943Y);
            constraintAnchorH2 = constraintWidgetContainer.h(ConstraintAnchor.Type.e0);
            ConstraintWidget constraintWidget2 = this.K;
            z2 = constraintWidget2 != null && constraintWidget2.f3949J[1] == dimensionBehaviour;
        }
        if (this.f0 != -1) {
            SolverVariable solverVariableJ = linearSystem.j(this.h0);
            linearSystem.e(solverVariableJ, linearSystem.j(constraintAnchorH), this.f0, 8);
            if (z2) {
                linearSystem.f(linearSystem.j(constraintAnchorH2), solverVariableJ, 0, 5);
                return;
            }
            return;
        }
        if (this.g0 != -1) {
            SolverVariable solverVariableJ2 = linearSystem.j(this.h0);
            SolverVariable solverVariableJ3 = linearSystem.j(constraintAnchorH2);
            linearSystem.e(solverVariableJ2, solverVariableJ3, -this.g0, 8);
            if (z2) {
                linearSystem.f(solverVariableJ2, linearSystem.j(constraintAnchorH), 0, 5);
                linearSystem.f(solverVariableJ3, solverVariableJ2, 0, 5);
                return;
            }
            return;
        }
        if (this.e0 != -1.0f) {
            SolverVariable solverVariableJ4 = linearSystem.j(this.h0);
            SolverVariable solverVariableJ5 = linearSystem.j(constraintAnchorH2);
            float f = this.e0;
            ArrayRow arrayRowK = linearSystem.k();
            arrayRowK.d.f(solverVariableJ4, -1.0f);
            arrayRowK.d.f(solverVariableJ5, f);
            linearSystem.c(arrayRowK);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final ConstraintAnchor h(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.i0 == 1) {
                    return this.h0;
                }
                break;
            case 2:
            case 4:
                if (this.i0 == 0) {
                    return this.h0;
                }
                break;
        }
        throw new AssertionError(type.name());
    }
}
