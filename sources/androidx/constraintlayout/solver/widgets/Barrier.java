package androidx.constraintlayout.solver.widgets;

import android.support.v4.media.a;
import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends HelperWidget {
    public int g0;
    public boolean h0;
    public int i0;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void b(LinearSystem linearSystem) {
        boolean z2;
        int i2;
        ConstraintAnchor[] constraintAnchorArr = this.G;
        ConstraintAnchor constraintAnchor = this.y;
        constraintAnchorArr[0] = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = this.f3971z;
        int i3 = 2;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.f3944A;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.f3945B;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.g = linearSystem.j(constraintAnchor5);
        }
        int i4 = this.g0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= this.f0) {
                z2 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.e0[i5];
            if (this.h0 || constraintWidget.c()) {
                int i6 = this.g0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                if (((i6 == 0 || i6 == 1) && constraintWidget.f3949J[0] == dimensionBehaviour && constraintWidget.y.d != null && constraintWidget.f3944A.d != null) || ((i6 == 2 || i6 == 3) && constraintWidget.f3949J[1] == dimensionBehaviour && constraintWidget.f3971z.d != null && constraintWidget.f3945B.d != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = constraintAnchor.e() || constraintAnchor3.e();
        boolean z4 = constraintAnchor2.e() || constraintAnchor4.e();
        int i7 = (z2 || !(((i2 = this.g0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f0) {
            ConstraintWidget constraintWidget2 = this.e0[i8];
            if (this.h0 || constraintWidget2.c()) {
                SolverVariable solverVariableJ = linearSystem.j(constraintWidget2.G[this.g0]);
                int i9 = this.g0;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.G[i9];
                constraintAnchor7.g = solverVariableJ;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.d;
                int i10 = (constraintAnchor8 == null || constraintAnchor8.f3939b != this) ? 0 : constraintAnchor7.f3941e;
                if (i9 == 0 || i9 == i3) {
                    SolverVariable solverVariable = constraintAnchor6.g;
                    int i11 = this.i0 - i10;
                    ArrayRow arrayRowK = linearSystem.k();
                    SolverVariable solverVariableL = linearSystem.l();
                    solverVariableL.d = 0;
                    arrayRowK.d(solverVariable, solverVariableJ, solverVariableL, i11);
                    linearSystem.c(arrayRowK);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.g;
                    int i12 = this.i0 + i10;
                    ArrayRow arrayRowK2 = linearSystem.k();
                    SolverVariable solverVariableL2 = linearSystem.l();
                    solverVariableL2.d = 0;
                    arrayRowK2.c(solverVariable2, solverVariableJ, solverVariableL2, i12);
                    linearSystem.c(arrayRowK2);
                }
                linearSystem.e(constraintAnchor6.g, solverVariableJ, this.i0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.g0;
        if (i13 == 0) {
            linearSystem.e(constraintAnchor3.g, constraintAnchor.g, 0, 8);
            linearSystem.e(constraintAnchor.g, this.K.f3944A.g, 0, 4);
            linearSystem.e(constraintAnchor.g, this.K.y.g, 0, 0);
            return;
        }
        if (i13 == 1) {
            linearSystem.e(constraintAnchor.g, constraintAnchor3.g, 0, 8);
            linearSystem.e(constraintAnchor.g, this.K.y.g, 0, 4);
            linearSystem.e(constraintAnchor.g, this.K.f3944A.g, 0, 0);
        } else if (i13 == 2) {
            linearSystem.e(constraintAnchor4.g, constraintAnchor2.g, 0, 8);
            linearSystem.e(constraintAnchor2.g, this.K.f3945B.g, 0, 4);
            linearSystem.e(constraintAnchor2.g, this.K.f3971z.g, 0, 0);
        } else if (i13 == 3) {
            linearSystem.e(constraintAnchor2.g, constraintAnchor4.g, 0, 8);
            linearSystem.e(constraintAnchor2.g, this.K.f3971z.g, 0, 4);
            linearSystem.e(constraintAnchor2.g, this.K.f3945B.g, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final String toString() {
        String strR = a.r(new StringBuilder("[Barrier] "), this.f3956Y, " {");
        for (int i2 = 0; i2 < this.f0; i2++) {
            ConstraintWidget constraintWidget = this.e0[i2];
            if (i2 > 0) {
                strR = a.m(strR, ", ");
            }
            StringBuilder sbW = a.w(strR);
            sbW.append(constraintWidget.f3956Y);
            strR = sbW.toString();
        }
        return a.m(strR, "}");
    }
}
