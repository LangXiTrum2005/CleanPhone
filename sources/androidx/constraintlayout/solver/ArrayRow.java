package androidx.constraintlayout.solver;

import android.support.v4.media.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {
    public ArrayRowVariables d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SolverVariable f3883a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3884b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f3885c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3886e = false;

    public interface ArrayRowVariables {
        SolverVariable a(int i2);

        void b();

        void c(SolverVariable solverVariable, float f, boolean z2);

        void clear();

        float d(SolverVariable solverVariable);

        float e(ArrayRow arrayRow, boolean z2);

        void f(SolverVariable solverVariable, float f);

        float g(SolverVariable solverVariable, boolean z2);

        int h();

        float i(int i2);

        boolean j(SolverVariable solverVariable);

        void k(float f);
    }

    public ArrayRow(Cache cache) {
        this.d = new ArrayLinkedVariables(this, cache);
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public SolverVariable a(boolean[] zArr) {
        return e(zArr, null);
    }

    public final void b(LinearSystem linearSystem, int i2) {
        this.d.f(linearSystem.i(i2), 1.0f);
        this.d.f(linearSystem.i(i2), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3884b = i2;
        }
        if (z2) {
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
            this.d.f(solverVariable3, -1.0f);
        } else {
            this.d.f(solverVariable, -1.0f);
            this.d.f(solverVariable2, 1.0f);
            this.d.f(solverVariable3, 1.0f);
        }
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3884b = i2;
        }
        if (z2) {
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
            this.d.f(solverVariable3, 1.0f);
        } else {
            this.d.f(solverVariable, -1.0f);
            this.d.f(solverVariable2, 1.0f);
            this.d.f(solverVariable3, -1.0f);
        }
    }

    public final SolverVariable e(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iH = this.d.h();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iH; i2++) {
            float fI = this.d.i(i2);
            if (fI < 0.0f) {
                SolverVariable solverVariableA = this.d.a(i2);
                if ((zArr == null || !zArr[solverVariableA.f3910b]) && solverVariableA != solverVariable && (((type = solverVariableA.f3914i) == SolverVariable.Type.f3917Y || type == SolverVariable.Type.Z) && fI < f)) {
                    f = fI;
                    solverVariable2 = solverVariableA;
                }
            }
        }
        return solverVariable2;
    }

    public final void f(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f3883a;
        if (solverVariable2 != null) {
            this.d.f(solverVariable2, -1.0f);
            this.f3883a = null;
        }
        float fG = this.d.g(solverVariable, true) * (-1.0f);
        this.f3883a = solverVariable;
        if (fG == 1.0f) {
            return;
        }
        this.f3884b /= fG;
        this.d.k(fG);
    }

    public final void g(SolverVariable solverVariable, boolean z2) {
        if (solverVariable.f) {
            float fD = this.d.d(solverVariable);
            this.f3884b = (solverVariable.f3912e * fD) + this.f3884b;
            this.d.g(solverVariable, z2);
            if (z2) {
                solverVariable.b(this);
            }
        }
    }

    public void h(ArrayRow arrayRow, boolean z2) {
        float fE = this.d.e(arrayRow, z2);
        this.f3884b = (arrayRow.f3884b * fE) + this.f3884b;
        if (z2) {
            arrayRow.f3883a.b(this);
        }
    }

    public String toString() {
        boolean z2;
        String strM = a.m(this.f3883a == null ? "0" : "" + this.f3883a, " = ");
        if (this.f3884b != 0.0f) {
            StringBuilder sbW = a.w(strM);
            sbW.append(this.f3884b);
            strM = sbW.toString();
            z2 = true;
        } else {
            z2 = false;
        }
        int iH = this.d.h();
        for (int i2 = 0; i2 < iH; i2++) {
            SolverVariable solverVariableA = this.d.a(i2);
            if (solverVariableA != null) {
                float fI = this.d.i(i2);
                if (fI != 0.0f) {
                    String string = solverVariableA.toString();
                    if (z2) {
                        if (fI > 0.0f) {
                            strM = a.m(strM, " + ");
                        } else {
                            strM = a.m(strM, " - ");
                            fI *= -1.0f;
                        }
                    } else if (fI < 0.0f) {
                        strM = a.m(strM, "- ");
                        fI *= -1.0f;
                    }
                    strM = fI == 1.0f ? a.m(strM, string) : strM + fI + " " + string;
                    z2 = true;
                }
            }
        }
        return !z2 ? a.m(strM, "0.0") : strM;
    }
}
