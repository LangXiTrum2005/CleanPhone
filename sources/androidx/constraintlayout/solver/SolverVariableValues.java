package androidx.constraintlayout.solver;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3918a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3919b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f3920c = new int[16];
    public int[] d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f3921e = new float[16];
    public int[] f = new int[16];
    public int[] g = new int[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3922h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3923i = -1;
    public final ArrayRow j;
    public final Cache k;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.j = arrayRow;
        this.k = cache;
        clear();
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final SolverVariable a(int i2) {
        int i3 = this.f3922h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f3923i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.k.d[this.d[i4]];
            }
            i4 = this.g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void b() {
        int i2 = this.f3922h;
        int i3 = this.f3923i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3921e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int iN = n(solverVariable);
            if (iN == -1) {
                f(solverVariable, f);
                return;
            }
            float[] fArr = this.f3921e;
            float f2 = fArr[iN] + f;
            fArr[iN] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            g(solverVariable, z2);
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.f3922h;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariableA = a(i3);
            if (solverVariableA != null) {
                solverVariableA.b(this.j);
            }
        }
        for (int i4 = 0; i4 < this.f3918a; i4++) {
            this.d[i4] = -1;
            this.f3920c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f3919b[i5] = -1;
        }
        this.f3922h = 0;
        this.f3923i = -1;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        int iN = n(solverVariable);
        if (iN != -1) {
            return this.f3921e[iN];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float e(ArrayRow arrayRow, boolean z2) {
        float fD = d(arrayRow.f3883a);
        g(arrayRow.f3883a, z2);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.d;
        int i2 = solverVariableValues.f3922h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = solverVariableValues.d[i4];
            if (i5 != -1) {
                c(this.k.d[i5], solverVariableValues.f3921e[i4] * fD, z2);
                i3++;
            }
            i4++;
        }
        return fD;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f) {
        if (f > -0.001f && f < 0.001f) {
            g(solverVariable, true);
            return;
        }
        int i2 = 0;
        if (this.f3922h == 0) {
            m(0, solverVariable, f);
            l(solverVariable, 0);
            this.f3923i = 0;
            return;
        }
        int iN = n(solverVariable);
        if (iN != -1) {
            this.f3921e[iN] = f;
            return;
        }
        int i3 = this.f3922h + 1;
        int i4 = this.f3918a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.d = Arrays.copyOf(this.d, i5);
            this.f3921e = Arrays.copyOf(this.f3921e, i5);
            this.f = Arrays.copyOf(this.f, i5);
            this.g = Arrays.copyOf(this.g, i5);
            this.f3920c = Arrays.copyOf(this.f3920c, i5);
            for (int i6 = this.f3918a; i6 < i5; i6++) {
                this.d[i6] = -1;
                this.f3920c[i6] = -1;
            }
            this.f3918a = i5;
        }
        int i7 = this.f3922h;
        int i8 = this.f3923i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.d[i8];
            int i12 = solverVariable.f3910b;
            if (i11 == i12) {
                this.f3921e[i8] = f;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.f3918a) {
                i2 = -1;
                break;
            } else if (this.d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m(i2, solverVariable, f);
        if (i9 != -1) {
            this.f[i2] = i9;
            int[] iArr = this.g;
            iArr[i2] = iArr[i9];
            iArr[i9] = i2;
        } else {
            this.f[i2] = -1;
            if (this.f3922h > 0) {
                this.g[i2] = this.f3923i;
                this.f3923i = i2;
            } else {
                this.g[i2] = -1;
            }
        }
        int i13 = this.g[i2];
        if (i13 != -1) {
            this.f[i13] = i2;
        }
        l(solverVariable, i2);
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float g(SolverVariable solverVariable, boolean z2) {
        int[] iArr;
        int i2;
        int iN = n(solverVariable);
        if (iN == -1) {
            return 0.0f;
        }
        int i3 = solverVariable.f3910b;
        int i4 = i3 % 16;
        int[] iArr2 = this.f3919b;
        int i5 = iArr2[i4];
        if (i5 != -1) {
            if (this.d[i5] == i3) {
                int[] iArr3 = this.f3920c;
                iArr2[i4] = iArr3[i5];
                iArr3[i5] = -1;
            } else {
                while (true) {
                    iArr = this.f3920c;
                    i2 = iArr[i5];
                    if (i2 == -1 || this.d[i2] == i3) {
                        break;
                    }
                    i5 = i2;
                }
                if (i2 != -1 && this.d[i2] == i3) {
                    iArr[i5] = iArr[i2];
                    iArr[i2] = -1;
                }
            }
        }
        float f = this.f3921e[iN];
        if (this.f3923i == iN) {
            this.f3923i = this.g[iN];
        }
        this.d[iN] = -1;
        int[] iArr4 = this.f;
        int i6 = iArr4[iN];
        if (i6 != -1) {
            int[] iArr5 = this.g;
            iArr5[i6] = iArr5[iN];
        }
        int i7 = this.g[iN];
        if (i7 != -1) {
            iArr4[i7] = iArr4[iN];
        }
        this.f3922h--;
        solverVariable.f3915l--;
        if (z2) {
            solverVariable.b(this.j);
        }
        return f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final int h() {
        return this.f3922h;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float i(int i2) {
        int i3 = this.f3922h;
        int i4 = this.f3923i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f3921e[i4];
            }
            i4 = this.g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final boolean j(SolverVariable solverVariable) {
        return n(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void k(float f) {
        int i2 = this.f3922h;
        int i3 = this.f3923i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3921e;
            fArr[i3] = fArr[i3] / f;
            i3 = this.g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public final void l(SolverVariable solverVariable, int i2) {
        int[] iArr;
        int i3 = solverVariable.f3910b % 16;
        int[] iArr2 = this.f3919b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f3920c;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f3920c[i2] = -1;
    }

    public final void m(int i2, SolverVariable solverVariable, float f) {
        this.d[i2] = solverVariable.f3910b;
        this.f3921e[i2] = f;
        this.f[i2] = -1;
        this.g[i2] = -1;
        solverVariable.a(this.j);
        solverVariable.f3915l++;
        this.f3922h++;
    }

    public final int n(SolverVariable solverVariable) {
        if (this.f3922h == 0) {
            return -1;
        }
        int i2 = solverVariable.f3910b;
        int i3 = this.f3919b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.d[i3] == i2) {
            return i3;
        }
        do {
            i3 = this.f3920c[i3];
            if (i3 == -1) {
                break;
            }
        } while (this.d[i3] != i2);
        if (i3 != -1 && this.d[i3] == i2) {
            return i3;
        }
        return -1;
    }

    public final String toString() {
        String strM;
        String strM2;
        String strM3 = hashCode() + " { ";
        int i2 = this.f3922h;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariableA = a(i3);
            if (solverVariableA != null) {
                String str = strM3 + solverVariableA + " = " + i(i3) + " ";
                int iN = n(solverVariableA);
                String strM4 = a.m(str, "[p: ");
                int i4 = this.f[iN];
                Cache cache = this.k;
                if (i4 != -1) {
                    StringBuilder sbW = a.w(strM4);
                    sbW.append(cache.d[this.d[this.f[iN]]]);
                    strM = sbW.toString();
                } else {
                    strM = a.m(strM4, "none");
                }
                String strM5 = a.m(strM, ", n: ");
                if (this.g[iN] != -1) {
                    StringBuilder sbW2 = a.w(strM5);
                    sbW2.append(cache.d[this.d[this.g[iN]]]);
                    strM2 = sbW2.toString();
                } else {
                    strM2 = a.m(strM5, "none");
                }
                strM3 = a.m(strM2, d9.i.f24752e);
            }
        }
        return a.m(strM3, " }");
    }
}
