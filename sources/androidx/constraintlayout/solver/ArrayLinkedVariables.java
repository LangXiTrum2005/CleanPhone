package androidx.constraintlayout.solver;

import android.support.v4.media.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayRow f3878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cache f3879c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3877a = 0;
    public int d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3880e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3881h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3882i = -1;
    public boolean j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.f3878b = arrayRow;
        this.f3879c = cache;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final SolverVariable a(int i2) {
        int i3 = this.f3881h;
        for (int i4 = 0; i3 != -1 && i4 < this.f3877a; i4++) {
            if (i4 == i2) {
                return this.f3879c.d[this.f3880e[i3]];
            }
            i3 = this.f[i3];
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void b() {
        int i2 = this.f3881h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3877a; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f[i2];
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int i2 = this.f3881h;
            ArrayRow arrayRow = this.f3878b;
            if (i2 == -1) {
                this.f3881h = 0;
                this.g[0] = f;
                this.f3880e[0] = solverVariable.f3910b;
                this.f[0] = -1;
                solverVariable.f3915l++;
                solverVariable.a(arrayRow);
                this.f3877a++;
                if (this.j) {
                    return;
                }
                int i3 = this.f3882i + 1;
                this.f3882i = i3;
                int[] iArr = this.f3880e;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.f3882i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f3877a; i5++) {
                int i6 = this.f3880e[i2];
                int i7 = solverVariable.f3910b;
                if (i6 == i7) {
                    float[] fArr = this.g;
                    float f2 = fArr[i2] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i2] = f2;
                    if (f2 == 0.0f) {
                        if (i2 == this.f3881h) {
                            this.f3881h = this.f[i2];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            solverVariable.b(arrayRow);
                        }
                        if (this.j) {
                            this.f3882i = i2;
                        }
                        solverVariable.f3915l--;
                        this.f3877a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f[i2];
            }
            int length = this.f3882i;
            int i8 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f3880e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f3880e;
            if (length >= iArr4.length && this.f3877a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3880e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f3880e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.j = false;
                this.f3882i = length - 1;
                this.g = Arrays.copyOf(this.g, i10);
                this.f3880e = Arrays.copyOf(this.f3880e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.f3880e[length] = solverVariable.f3910b;
            this.g[length] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f;
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                this.f[length] = this.f3881h;
                this.f3881h = length;
            }
            solverVariable.f3915l++;
            solverVariable.a(arrayRow);
            this.f3877a++;
            if (!this.j) {
                this.f3882i++;
            }
            int i11 = this.f3882i;
            int[] iArr8 = this.f3880e;
            if (i11 >= iArr8.length) {
                this.j = true;
                this.f3882i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.f3881h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3877a; i3++) {
            SolverVariable solverVariable = this.f3879c.d[this.f3880e[i2]];
            if (solverVariable != null) {
                solverVariable.b(this.f3878b);
            }
            i2 = this.f[i2];
        }
        this.f3881h = -1;
        this.f3882i = -1;
        this.j = false;
        this.f3877a = 0;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        int i2 = this.f3881h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3877a; i3++) {
            if (this.f3880e[i2] == solverVariable.f3910b) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float e(ArrayRow arrayRow, boolean z2) {
        float fD = d(arrayRow.f3883a);
        g(arrayRow.f3883a, z2);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int iH = arrayRowVariables.h();
        for (int i2 = 0; i2 < iH; i2++) {
            SolverVariable solverVariableA = arrayRowVariables.a(i2);
            c(solverVariableA, arrayRowVariables.d(solverVariableA) * fD, z2);
        }
        return fD;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            g(solverVariable, true);
            return;
        }
        int i2 = this.f3881h;
        ArrayRow arrayRow = this.f3878b;
        if (i2 == -1) {
            this.f3881h = 0;
            this.g[0] = f;
            this.f3880e[0] = solverVariable.f3910b;
            this.f[0] = -1;
            solverVariable.f3915l++;
            solverVariable.a(arrayRow);
            this.f3877a++;
            if (this.j) {
                return;
            }
            int i3 = this.f3882i + 1;
            this.f3882i = i3;
            int[] iArr = this.f3880e;
            if (i3 >= iArr.length) {
                this.j = true;
                this.f3882i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f3877a; i5++) {
            int i6 = this.f3880e[i2];
            int i7 = solverVariable.f3910b;
            if (i6 == i7) {
                this.g[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f[i2];
        }
        int length = this.f3882i;
        int i8 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f3880e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f3880e;
        if (length >= iArr3.length && this.f3877a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3880e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f3880e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.f3882i = length - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.f3880e = Arrays.copyOf(this.f3880e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.f3880e[length] = solverVariable.f3910b;
        this.g[length] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f;
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            this.f[length] = this.f3881h;
            this.f3881h = length;
        }
        solverVariable.f3915l++;
        solverVariable.a(arrayRow);
        int i11 = this.f3877a + 1;
        this.f3877a = i11;
        if (!this.j) {
            this.f3882i++;
        }
        int[] iArr7 = this.f3880e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.f3882i >= iArr7.length) {
            this.j = true;
            this.f3882i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float g(SolverVariable solverVariable, boolean z2) {
        int i2 = this.f3881h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3877a) {
            if (this.f3880e[i2] == solverVariable.f3910b) {
                if (i2 == this.f3881h) {
                    this.f3881h = this.f[i2];
                } else {
                    int[] iArr = this.f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    solverVariable.b(this.f3878b);
                }
                solverVariable.f3915l--;
                this.f3877a--;
                this.f3880e[i2] = -1;
                if (this.j) {
                    this.f3882i = i2;
                }
                return this.g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final int h() {
        return this.f3877a;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float i(int i2) {
        int i3 = this.f3881h;
        for (int i4 = 0; i3 != -1 && i4 < this.f3877a; i4++) {
            if (i4 == i2) {
                return this.g[i3];
            }
            i3 = this.f[i3];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final boolean j(SolverVariable solverVariable) {
        int i2 = this.f3881h;
        if (i2 != -1) {
            for (int i3 = 0; i2 != -1 && i3 < this.f3877a; i3++) {
                if (this.f3880e[i2] == solverVariable.f3910b) {
                    return true;
                }
                i2 = this.f[i2];
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void k(float f) {
        int i2 = this.f3881h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3877a; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f[i2];
        }
    }

    public final String toString() {
        int i2 = this.f3881h;
        String string = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f3877a; i3++) {
            StringBuilder sbW = a.w(a.m(string, " -> "));
            sbW.append(this.g[i2]);
            sbW.append(" : ");
            StringBuilder sbW2 = a.w(sbW.toString());
            sbW2.append(this.f3879c.d[this.f3880e[i2]]);
            string = sbW2.toString();
            i2 = this.f[i2];
        }
        return string;
    }
}
