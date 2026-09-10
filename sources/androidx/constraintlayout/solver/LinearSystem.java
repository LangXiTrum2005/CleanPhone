package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.PriorityGoalRow.GoalVariableAccessor;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {
    public static int o = 1000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Metrics f3890p = null;
    public static boolean q = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityGoalRow f3892b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayRow[] f3894e;
    public final Cache k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayRow f3898n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3891a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3893c = 32;
    public int d = 32;
    public boolean f = false;
    public boolean[] g = new boolean[32];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3895h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3896i = 0;
    public int j = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SolverVariable[] f3897l = new SolverVariable[o];
    public int m = 0;

    public interface Row {
        SolverVariable a(boolean[] zArr);
    }

    public class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.f3883a = null;
            this.f3884b = 0.0f;
            this.f3885c = new ArrayList();
            this.f3886e = false;
            this.d = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.f3894e = null;
        this.f3894e = new ArrayRow[32];
        r();
        Cache cache = new Cache();
        cache.f3887a = new Pools.SimplePool();
        cache.f3888b = new Pools.SimplePool();
        cache.f3889c = new Pools.SimplePool();
        cache.d = new SolverVariable[32];
        this.k = cache;
        PriorityGoalRow priorityGoalRow = new PriorityGoalRow(cache);
        priorityGoalRow.f = new SolverVariable[128];
        priorityGoalRow.g = new SolverVariable[128];
        priorityGoalRow.f3906h = 0;
        priorityGoalRow.f3907i = priorityGoalRow.new GoalVariableAccessor();
        this.f3892b = priorityGoalRow;
        if (q) {
            this.f3898n = new ValuesRow(cache);
        } else {
            this.f3898n = new ArrayRow(cache);
        }
    }

    public static int m(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).g;
        if (solverVariable != null) {
            return (int) (solverVariable.f3912e + 0.5f);
        }
        return 0;
    }

    public final SolverVariable a(SolverVariable.Type type) {
        SolverVariable solverVariable = (SolverVariable) this.k.f3889c.a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f3914i = type;
        } else {
            solverVariable.c();
            solverVariable.f3914i = type;
        }
        int i2 = this.m;
        int i3 = o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            o = i4;
            this.f3897l = (SolverVariable[]) Arrays.copyOf(this.f3897l, i4);
        }
        SolverVariable[] solverVariableArr = this.f3897l;
        int i5 = this.m;
        this.m = i5 + 1;
        solverVariableArr[i5] = solverVariable;
        return solverVariable;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        ArrayRow arrayRowK = k();
        if (solverVariable2 == solverVariable3) {
            arrayRowK.d.f(solverVariable, 1.0f);
            arrayRowK.d.f(solverVariable4, 1.0f);
            arrayRowK.d.f(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            arrayRowK.d.f(solverVariable, 1.0f);
            arrayRowK.d.f(solverVariable2, -1.0f);
            arrayRowK.d.f(solverVariable3, -1.0f);
            arrayRowK.d.f(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                arrayRowK.f3884b = (-i2) + i3;
            }
        } else if (f <= 0.0f) {
            arrayRowK.d.f(solverVariable, -1.0f);
            arrayRowK.d.f(solverVariable2, 1.0f);
            arrayRowK.f3884b = i2;
        } else if (f >= 1.0f) {
            arrayRowK.d.f(solverVariable4, -1.0f);
            arrayRowK.d.f(solverVariable3, 1.0f);
            arrayRowK.f3884b = -i3;
        } else {
            float f2 = 1.0f - f;
            arrayRowK.d.f(solverVariable, f2 * 1.0f);
            arrayRowK.d.f(solverVariable2, f2 * (-1.0f));
            arrayRowK.d.f(solverVariable3, (-1.0f) * f);
            arrayRowK.d.f(solverVariable4, 1.0f * f);
            if (i2 > 0 || i3 > 0) {
                arrayRowK.f3884b = (i3 * f) + ((-i2) * f2);
            }
        }
        if (i4 != 8) {
            arrayRowK.b(this, i4);
        }
        c(arrayRowK);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    public final void c(ArrayRow arrayRow) {
        boolean z2;
        SolverVariable.Type type;
        boolean z3;
        SolverVariable solverVariableE;
        ArrayList<SolverVariable> arrayList;
        boolean z4 = true;
        if (this.f3896i + 1 >= this.j || this.f3895h + 1 >= this.d) {
            n();
        }
        if (arrayRow.f3886e) {
            z2 = false;
        } else {
            if (this.f3894e.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iH = arrayRow.d.h();
                    int i2 = 0;
                    while (true) {
                        arrayList = arrayRow.f3885c;
                        if (i2 >= iH) {
                            break;
                        }
                        SolverVariable solverVariableA = arrayRow.d.a(i2);
                        if (solverVariableA.f3911c != -1 || solverVariableA.f) {
                            arrayList.add(solverVariableA);
                        }
                        i2++;
                    }
                    if (arrayList.size() > 0) {
                        for (SolverVariable solverVariable : arrayList) {
                            if (solverVariable.f) {
                                arrayRow.g(solverVariable, true);
                            } else {
                                arrayRow.h(this.f3894e[solverVariable.f3911c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            float f = 0.0f;
            if (arrayRow.f3883a == null && arrayRow.f3884b == 0.0f && arrayRow.d.h() == 0) {
                return;
            }
            float f2 = arrayRow.f3884b;
            if (f2 < 0.0f) {
                arrayRow.f3884b = f2 * (-1.0f);
                arrayRow.d.b();
            }
            int iH2 = arrayRow.d.h();
            float f3 = 0.0f;
            float f4 = 0.0f;
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            int i3 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (true) {
                type = SolverVariable.Type.X;
                if (i3 >= iH2) {
                    break;
                }
                float fI = arrayRow.d.i(i3);
                float f5 = f;
                SolverVariable solverVariableA2 = arrayRow.d.a(i3);
                if (solverVariableA2.f3914i == type) {
                    if (solverVariable2 == null) {
                        if (solverVariableA2.f3915l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        f3 = fI;
                        solverVariable2 = solverVariableA2;
                    } else {
                        if (f3 > fI) {
                            if (solverVariableA2.f3915l > 1) {
                                z6 = false;
                            }
                            f3 = fI;
                            solverVariable2 = solverVariableA2;
                        } else if (z6 || solverVariableA2.f3915l > 1) {
                        }
                        z6 = true;
                        f3 = fI;
                        solverVariable2 = solverVariableA2;
                    }
                } else if (solverVariable2 == null && fI < f5) {
                    if (solverVariable3 == null) {
                        if (solverVariableA2.f3915l <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        f4 = fI;
                        solverVariable3 = solverVariableA2;
                    } else {
                        if (f4 > fI) {
                            if (solverVariableA2.f3915l > 1) {
                                z7 = false;
                            }
                            f4 = fI;
                            solverVariable3 = solverVariableA2;
                        } else if (z7 || solverVariableA2.f3915l > 1) {
                        }
                        z7 = true;
                        f4 = fI;
                        solverVariable3 = solverVariableA2;
                    }
                }
                i3++;
                f = f5;
            }
            float f6 = f;
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z3 = true;
            } else {
                arrayRow.f(solverVariable2);
                z3 = false;
            }
            if (arrayRow.d.h() == 0) {
                arrayRow.f3886e = true;
            }
            if (z3) {
                if (this.f3895h + 1 >= this.d) {
                    n();
                }
                SolverVariable solverVariableA3 = a(SolverVariable.Type.f3917Y);
                int i4 = this.f3891a + 1;
                this.f3891a = i4;
                this.f3895h++;
                solverVariableA3.f3910b = i4;
                this.k.d[i4] = solverVariableA3;
                arrayRow.f3883a = solverVariableA3;
                h(arrayRow);
                ArrayRow arrayRow2 = this.f3898n;
                arrayRow2.getClass();
                arrayRow2.f3883a = null;
                arrayRow2.d.clear();
                for (int i5 = 0; i5 < arrayRow.d.h(); i5++) {
                    arrayRow2.d.c(arrayRow.d.a(i5), arrayRow.d.i(i5), true);
                }
                q(this.f3898n);
                if (solverVariableA3.f3911c == -1) {
                    if (arrayRow.f3883a == solverVariableA3 && (solverVariableE = arrayRow.e(null, solverVariableA3)) != null) {
                        arrayRow.f(solverVariableE);
                    }
                    if (!arrayRow.f3886e) {
                        arrayRow.f3883a.d(arrayRow);
                    }
                    this.f3896i--;
                }
            } else {
                z4 = false;
            }
            SolverVariable solverVariable4 = arrayRow.f3883a;
            if (solverVariable4 == null) {
                return;
            }
            if (solverVariable4.f3914i != type && arrayRow.f3884b < f6) {
                return;
            } else {
                z2 = z4;
            }
        }
        if (z2) {
            return;
        }
        h(arrayRow);
    }

    public final void d(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.f3911c;
        if (i3 == -1) {
            solverVariable.f3912e = i2;
            solverVariable.f = true;
            int i4 = solverVariable.k;
            for (int i5 = 0; i5 < i4; i5++) {
                solverVariable.j[i5].g(solverVariable, false);
            }
            solverVariable.k = 0;
            return;
        }
        if (i3 == -1) {
            ArrayRow arrayRowK = k();
            arrayRowK.f3883a = solverVariable;
            float f = i2;
            solverVariable.f3912e = f;
            arrayRowK.f3884b = f;
            arrayRowK.f3886e = true;
            c(arrayRowK);
            return;
        }
        ArrayRow arrayRow = this.f3894e[i3];
        if (arrayRow.f3886e) {
            arrayRow.f3884b = i2;
            return;
        }
        if (arrayRow.d.h() == 0) {
            arrayRow.f3886e = true;
            arrayRow.f3884b = i2;
            return;
        }
        ArrayRow arrayRowK2 = k();
        if (i2 < 0) {
            arrayRowK2.f3884b = i2 * (-1);
            arrayRowK2.d.f(solverVariable, 1.0f);
        } else {
            arrayRowK2.f3884b = i2;
            arrayRowK2.d.f(solverVariable, -1.0f);
        }
        c(arrayRowK2);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        boolean z2 = false;
        if (i3 == 8 && solverVariable2.f && solverVariable.f3911c == -1) {
            solverVariable.f3912e = solverVariable2.f3912e + i2;
            solverVariable.f = true;
            int i4 = solverVariable.k;
            for (int i5 = 0; i5 < i4; i5++) {
                solverVariable.j[i5].g(solverVariable, false);
            }
            solverVariable.k = 0;
            return;
        }
        ArrayRow arrayRowK = k();
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            arrayRowK.f3884b = i2;
        }
        if (z2) {
            arrayRowK.d.f(solverVariable, 1.0f);
            arrayRowK.d.f(solverVariable2, -1.0f);
        } else {
            arrayRowK.d.f(solverVariable, -1.0f);
            arrayRowK.d.f(solverVariable2, 1.0f);
        }
        if (i3 != 8) {
            arrayRowK.b(this, i3);
        }
        c(arrayRowK);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow arrayRowK = k();
        SolverVariable solverVariableL = l();
        solverVariableL.d = 0;
        arrayRowK.c(solverVariable, solverVariable2, solverVariableL, i2);
        if (i3 != 8) {
            arrayRowK.d.f(i(i3), (int) (arrayRowK.d.d(solverVariableL) * (-1.0f)));
        }
        c(arrayRowK);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow arrayRowK = k();
        SolverVariable solverVariableL = l();
        solverVariableL.d = 0;
        arrayRowK.d(solverVariable, solverVariable2, solverVariableL, i2);
        if (i3 != 8) {
            arrayRowK.d.f(i(i3), (int) (arrayRowK.d.d(solverVariableL) * (-1.0f)));
        }
        c(arrayRowK);
    }

    public final void h(ArrayRow arrayRow) {
        boolean z2 = q;
        Cache cache = this.k;
        if (z2) {
            ArrayRow arrayRow2 = this.f3894e[this.f3896i];
            if (arrayRow2 != null) {
                cache.f3887a.b(arrayRow2);
            }
        } else {
            ArrayRow arrayRow3 = this.f3894e[this.f3896i];
            if (arrayRow3 != null) {
                cache.f3888b.b(arrayRow3);
            }
        }
        ArrayRow[] arrayRowArr = this.f3894e;
        int i2 = this.f3896i;
        arrayRowArr[i2] = arrayRow;
        SolverVariable solverVariable = arrayRow.f3883a;
        solverVariable.f3911c = i2;
        this.f3896i = i2 + 1;
        solverVariable.d(arrayRow);
    }

    public final SolverVariable i(int i2) {
        if (this.f3895h + 1 >= this.d) {
            n();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.Z);
        int i3 = this.f3891a + 1;
        this.f3891a = i3;
        this.f3895h++;
        solverVariableA.f3910b = i3;
        solverVariableA.d = i2;
        this.k.d[i3] = solverVariableA;
        PriorityGoalRow priorityGoalRow = this.f3892b;
        priorityGoalRow.f3907i.X = solverVariableA;
        float[] fArr = solverVariableA.f3913h;
        Arrays.fill(fArr, 0.0f);
        fArr[solverVariableA.d] = 1.0f;
        priorityGoalRow.i(solverVariableA);
        return solverVariableA;
    }

    public final SolverVariable j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3895h + 1 >= this.d) {
            n();
        }
        if (!(obj instanceof ConstraintAnchor)) {
            return null;
        }
        ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
        SolverVariable solverVariable = constraintAnchor.g;
        if (solverVariable == null) {
            constraintAnchor.i();
            solverVariable = constraintAnchor.g;
        }
        int i2 = solverVariable.f3910b;
        Cache cache = this.k;
        if (i2 != -1 && i2 <= this.f3891a && cache.d[i2] != null) {
            return solverVariable;
        }
        if (i2 != -1) {
            solverVariable.c();
        }
        int i3 = this.f3891a + 1;
        this.f3891a = i3;
        this.f3895h++;
        solverVariable.f3910b = i3;
        solverVariable.f3914i = SolverVariable.Type.X;
        cache.d[i3] = solverVariable;
        return solverVariable;
    }

    public final ArrayRow k() {
        boolean z2 = q;
        Cache cache = this.k;
        if (z2) {
            ArrayRow arrayRow = (ArrayRow) cache.f3887a.a();
            if (arrayRow == null) {
                return new ValuesRow(cache);
            }
            arrayRow.f3883a = null;
            arrayRow.d.clear();
            arrayRow.f3884b = 0.0f;
            arrayRow.f3886e = false;
            return arrayRow;
        }
        ArrayRow arrayRow2 = (ArrayRow) cache.f3888b.a();
        if (arrayRow2 == null) {
            return new ArrayRow(cache);
        }
        arrayRow2.f3883a = null;
        arrayRow2.d.clear();
        arrayRow2.f3884b = 0.0f;
        arrayRow2.f3886e = false;
        return arrayRow2;
    }

    public final SolverVariable l() {
        if (this.f3895h + 1 >= this.d) {
            n();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.f3917Y);
        int i2 = this.f3891a + 1;
        this.f3891a = i2;
        this.f3895h++;
        solverVariableA.f3910b = i2;
        this.k.d[i2] = solverVariableA;
        return solverVariableA;
    }

    public final void n() {
        int i2 = this.f3893c * 2;
        this.f3893c = i2;
        this.f3894e = (ArrayRow[]) Arrays.copyOf(this.f3894e, i2);
        Cache cache = this.k;
        cache.d = (SolverVariable[]) Arrays.copyOf(cache.d, this.f3893c);
        int i3 = this.f3893c;
        this.g = new boolean[i3];
        this.d = i3;
        this.j = i3;
        Metrics metrics = f3890p;
        if (metrics != null) {
            metrics.f3900b = Math.max(metrics.f3900b, i3);
            long j = f3890p.f3900b;
        }
    }

    public final void o() {
        Metrics metrics = f3890p;
        PriorityGoalRow priorityGoalRow = this.f3892b;
        if (!this.f) {
            p(priorityGoalRow);
            return;
        }
        if (metrics != null) {
            metrics.f3901c++;
        }
        for (int i2 = 0; i2 < this.f3896i; i2++) {
            if (!this.f3894e[i2].f3886e) {
                p(priorityGoalRow);
                return;
            }
        }
        for (int i3 = 0; i3 < this.f3896i; i3++) {
            ArrayRow arrayRow = this.f3894e[i3];
            arrayRow.f3883a.f3912e = arrayRow.f3884b;
        }
    }

    public final void p(PriorityGoalRow priorityGoalRow) {
        Cache cache;
        Metrics metrics = f3890p;
        if (metrics != null) {
            metrics.f = Math.max(metrics.f, this.f3895h);
            Metrics metrics2 = f3890p;
            metrics2.g = Math.max(metrics2.g, this.f3896i);
        }
        for (int i2 = 0; i2 < this.f3896i; i2++) {
            ArrayRow arrayRow = this.f3894e[i2];
            SolverVariable.Type type = arrayRow.f3883a.f3914i;
            SolverVariable.Type type2 = SolverVariable.Type.X;
            if (type != type2) {
                float f = 0.0f;
                if (arrayRow.f3884b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        int i4 = 1;
                        i3++;
                        float f2 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        while (true) {
                            int i9 = this.f3896i;
                            cache = this.k;
                            if (i5 >= i9) {
                                break;
                            }
                            ArrayRow arrayRow2 = this.f3894e[i5];
                            if (arrayRow2.f3883a.f3914i != type2 && !arrayRow2.f3886e && arrayRow2.f3884b < f) {
                                int i10 = i4;
                                while (i10 < this.f3895h) {
                                    SolverVariable solverVariable = cache.d[i10];
                                    float f3 = f;
                                    float fD = arrayRow2.d.d(solverVariable);
                                    if (fD > f3) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = solverVariable.g[i11] / fD;
                                            if ((f4 < f2 && i11 == i8) || i11 > i8) {
                                                i8 = i11;
                                                f2 = f4;
                                                i6 = i5;
                                                i7 = i10;
                                            }
                                        }
                                    }
                                    i10++;
                                    f = f3;
                                }
                            }
                            i5++;
                            f = f;
                            i4 = 1;
                        }
                        float f5 = f;
                        if (i6 != -1) {
                            ArrayRow arrayRow3 = this.f3894e[i6];
                            arrayRow3.f3883a.f3911c = -1;
                            arrayRow3.f(cache.d[i7]);
                            SolverVariable solverVariable2 = arrayRow3.f3883a;
                            solverVariable2.f3911c = i6;
                            solverVariable2.d(arrayRow3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.f3895h / 2) {
                            z2 = true;
                        }
                        f = f5;
                    }
                    break;
                }
            }
        }
        q(priorityGoalRow);
        for (int i12 = 0; i12 < this.f3896i; i12++) {
            ArrayRow arrayRow4 = this.f3894e[i12];
            arrayRow4.f3883a.f3912e = arrayRow4.f3884b;
        }
    }

    public final void q(ArrayRow arrayRow) {
        for (int i2 = 0; i2 < this.f3895h; i2++) {
            this.g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f3895h * 2) {
                return;
            }
            SolverVariable solverVariable = arrayRow.f3883a;
            if (solverVariable != null) {
                this.g[solverVariable.f3910b] = true;
            }
            SolverVariable solverVariableA = arrayRow.a(this.g);
            if (solverVariableA != null) {
                boolean[] zArr = this.g;
                int i4 = solverVariableA.f3910b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (solverVariableA != null) {
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f3896i; i6++) {
                    ArrayRow arrayRow2 = this.f3894e[i6];
                    if (arrayRow2.f3883a.f3914i != SolverVariable.Type.X && !arrayRow2.f3886e && arrayRow2.d.j(solverVariableA)) {
                        float fD = arrayRow2.d.d(solverVariableA);
                        if (fD < 0.0f) {
                            float f2 = (-arrayRow2.f3884b) / fD;
                            if (f2 < f) {
                                i5 = i6;
                                f = f2;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    ArrayRow arrayRow3 = this.f3894e[i5];
                    arrayRow3.f3883a.f3911c = -1;
                    arrayRow3.f(solverVariableA);
                    SolverVariable solverVariable2 = arrayRow3.f3883a;
                    solverVariable2.f3911c = i5;
                    solverVariable2.d(arrayRow3);
                }
            } else {
                z2 = true;
            }
        }
    }

    public final void r() {
        boolean z2 = q;
        Cache cache = this.k;
        int i2 = 0;
        if (z2) {
            while (true) {
                ArrayRow[] arrayRowArr = this.f3894e;
                if (i2 >= arrayRowArr.length) {
                    return;
                }
                ArrayRow arrayRow = arrayRowArr[i2];
                if (arrayRow != null) {
                    cache.f3887a.b(arrayRow);
                }
                this.f3894e[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                ArrayRow[] arrayRowArr2 = this.f3894e;
                if (i2 >= arrayRowArr2.length) {
                    return;
                }
                ArrayRow arrayRow2 = arrayRowArr2[i2];
                if (arrayRow2 != null) {
                    cache.f3888b.b(arrayRow2);
                }
                this.f3894e[i2] = null;
                i2++;
            }
        }
    }

    public final void s() {
        Cache cache;
        int i2 = 0;
        while (true) {
            cache = this.k;
            SolverVariable[] solverVariableArr = cache.d;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i2++;
        }
        Pools.SimplePool simplePool = cache.f3889c;
        SolverVariable[] solverVariableArr2 = this.f3897l;
        int length = this.m;
        simplePool.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            SolverVariable solverVariable2 = solverVariableArr2[i3];
            int i4 = simplePool.f3905b;
            Object[] objArr = simplePool.f3904a;
            if (i4 < objArr.length) {
                objArr[i4] = solverVariable2;
                simplePool.f3905b = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(cache.d, (Object) null);
        this.f3891a = 0;
        PriorityGoalRow priorityGoalRow = this.f3892b;
        priorityGoalRow.f3906h = 0;
        priorityGoalRow.f3884b = 0.0f;
        this.f3895h = 1;
        for (int i5 = 0; i5 < this.f3896i; i5++) {
            this.f3894e[i5].getClass();
        }
        r();
        this.f3896i = 0;
        if (q) {
            this.f3898n = new ValuesRow(cache);
        } else {
            this.f3898n = new ArrayRow(cache);
        }
    }
}
