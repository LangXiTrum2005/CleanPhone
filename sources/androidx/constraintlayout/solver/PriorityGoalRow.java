package androidx.constraintlayout.solver;

import android.support.v4.media.a;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {
    public SolverVariable[] f;
    public SolverVariable[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GoalVariableAccessor f3907i;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.PriorityGoalRow$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f3910b - solverVariable2.f3910b;
        }
    }

    public class GoalVariableAccessor implements Comparable {
        public SolverVariable X;

        public GoalVariableAccessor() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.X.f3910b - ((SolverVariable) obj).f3910b;
        }

        public final String toString() {
            String string = "[ ";
            if (this.X != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder sbW = a.w(string);
                    sbW.append(this.X.f3913h[i2]);
                    sbW.append(" ");
                    string = sbW.toString();
                }
            }
            StringBuilder sbX = a.x(string, "] ");
            sbX.append(this.X);
            return sbX.toString();
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public final SolverVariable a(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f3906h; i3++) {
            SolverVariable[] solverVariableArr = this.f;
            SolverVariable solverVariable = solverVariableArr[i3];
            if (!zArr[solverVariable.f3910b]) {
                GoalVariableAccessor goalVariableAccessor = this.f3907i;
                goalVariableAccessor.X = solverVariable;
                int i4 = 8;
                if (i2 != -1) {
                    SolverVariable solverVariable2 = solverVariableArr[i2];
                    while (i4 >= 0) {
                        float f = solverVariable2.f3913h[i4];
                        float f2 = goalVariableAccessor.X.f3913h[i4];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i2 = i3;
                            break;
                            break;
                        }
                        i4--;
                    }
                } else {
                    while (i4 >= 0) {
                        float f3 = goalVariableAccessor.X.f3913h[i4];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i2 = i3;
                            break;
                        }
                        i4--;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f[i2];
    }

    @Override // androidx.constraintlayout.solver.ArrayRow
    public final void h(ArrayRow arrayRow, boolean z2) {
        SolverVariable solverVariable = arrayRow.f3883a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int iH = arrayRowVariables.h();
        for (int i2 = 0; i2 < iH; i2++) {
            SolverVariable solverVariableA = arrayRowVariables.a(i2);
            float fI = arrayRowVariables.i(i2);
            GoalVariableAccessor goalVariableAccessor = this.f3907i;
            goalVariableAccessor.X = solverVariableA;
            boolean z3 = solverVariableA.f3909a;
            float[] fArr = solverVariable.f3913h;
            if (z3) {
                boolean z4 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = goalVariableAccessor.X.f3913h;
                    float f = (fArr[i3] * fI) + fArr2[i3];
                    fArr2[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        goalVariableAccessor.X.f3913h[i3] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    PriorityGoalRow.this.j(goalVariableAccessor.X);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = fArr[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fI;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        goalVariableAccessor.X.f3913h[i4] = f3;
                    } else {
                        goalVariableAccessor.X.f3913h[i4] = 0.0f;
                    }
                }
                i(solverVariableA);
            }
            this.f3884b = (arrayRow.f3884b * fI) + this.f3884b;
        }
        j(solverVariable);
    }

    public final void i(SolverVariable solverVariable) {
        int i2;
        int i3 = this.f3906h + 1;
        SolverVariable[] solverVariableArr = this.f;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f = solverVariableArr2;
            this.g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f;
        int i4 = this.f3906h;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.f3906h = i5;
        if (i5 > 1 && solverVariableArr3[i4].f3910b > solverVariable.f3910b) {
            int i6 = 0;
            while (true) {
                i2 = this.f3906h;
                if (i6 >= i2) {
                    break;
                }
                this.g[i6] = this.f[i6];
                i6++;
            }
            Arrays.sort(this.g, 0, i2, new AnonymousClass1());
            for (int i7 = 0; i7 < this.f3906h; i7++) {
                this.f[i7] = this.g[i7];
            }
        }
        solverVariable.f3909a = true;
        solverVariable.a(this);
    }

    public final void j(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.f3906h) {
            if (this.f[i2] == solverVariable) {
                while (true) {
                    int i3 = this.f3906h;
                    if (i2 >= i3 - 1) {
                        this.f3906h = i3 - 1;
                        solverVariable.f3909a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow
    public final String toString() {
        String str = " goal -> (" + this.f3884b + ") : ";
        for (int i2 = 0; i2 < this.f3906h; i2++) {
            SolverVariable solverVariable = this.f[i2];
            GoalVariableAccessor goalVariableAccessor = this.f3907i;
            goalVariableAccessor.X = solverVariable;
            str = str + goalVariableAccessor + " ";
        }
        return str;
    }
}
