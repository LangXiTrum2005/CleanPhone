package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public float A0;
    public float B0;
    public float C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public ArrayList K0;
    public ConstraintWidget[] L0;
    public ConstraintWidget[] M0;
    public int[] N0;
    public ConstraintWidget[] O0;
    public int P0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public float x0;
    public float y0;
    public float z0;

    public class WidgetsList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3975a;
        public ConstraintAnchor d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ConstraintAnchor f3978e;
        public ConstraintAnchor f;
        public ConstraintAnchor g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3979h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3980i;
        public int j;
        public int k;
        public int q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget f3976b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3977c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f3981l = 0;
        public int m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f3982n = 0;
        public int o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f3983p = 0;

        public WidgetsList(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.f3979h = 0;
            this.f3980i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.f3975a = i2;
            this.d = constraintAnchor;
            this.f3978e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.f3979h = Flow.this.k0;
            this.f3980i = Flow.this.g0;
            this.j = Flow.this.l0;
            this.k = Flow.this.h0;
            this.q = i3;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i2 = this.f3975a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
            Flow flow = Flow.this;
            if (i2 == 0) {
                int iF = flow.F(constraintWidget, this.q);
                if (constraintWidget.f3949J[0] == dimensionBehaviour) {
                    this.f3983p++;
                    iF = 0;
                }
                this.f3981l = iF + (constraintWidget.X != 8 ? flow.D0 : 0) + this.f3981l;
                int iE = flow.E(constraintWidget, this.q);
                if (this.f3976b == null || this.f3977c < iE) {
                    this.f3976b = constraintWidget;
                    this.f3977c = iE;
                    this.m = iE;
                }
            } else {
                int iF2 = flow.F(constraintWidget, this.q);
                int iE2 = flow.E(constraintWidget, this.q);
                if (constraintWidget.f3949J[1] == dimensionBehaviour) {
                    this.f3983p++;
                    iE2 = 0;
                }
                this.m = iE2 + (constraintWidget.X != 8 ? flow.E0 : 0) + this.m;
                if (this.f3976b == null || this.f3977c < iF2) {
                    this.f3976b = constraintWidget;
                    this.f3977c = iF2;
                    this.f3981l = iF2;
                }
            }
            this.o++;
        }

        public final void b(int i2, boolean z2, boolean z3) {
            Flow flow;
            int i3;
            ConstraintWidget constraintWidget;
            char c2;
            int i4;
            int i5;
            int i6;
            int i7 = this.o;
            int i8 = 0;
            while (true) {
                flow = Flow.this;
                if (i8 >= i7 || (i6 = this.f3982n + i8) >= flow.P0) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.O0[i6];
                if (constraintWidget2 != null) {
                    constraintWidget2.u();
                }
                i8++;
            }
            if (i7 == 0 || this.f3976b == null) {
                return;
            }
            boolean z4 = z3 && i2 == 0;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = this.f3982n + (z2 ? (i7 - 1) - i11 : i11);
                if (i12 >= flow.P0) {
                    break;
                }
                if (flow.O0[i12].X == 0) {
                    if (i9 == -1) {
                        i9 = i11;
                    }
                    i10 = i11;
                }
            }
            if (this.f3975a != 0) {
                ConstraintWidget constraintWidget3 = this.f3976b;
                constraintWidget3.Z = flow.r0;
                int i13 = this.f3979h;
                if (i2 > 0) {
                    i13 += flow.D0;
                }
                ConstraintAnchor constraintAnchor = constraintWidget3.y;
                ConstraintAnchor constraintAnchor2 = constraintWidget3.f3944A;
                if (z2) {
                    constraintAnchor2.a(this.f, i13);
                    if (z3) {
                        constraintAnchor.a(this.d, this.j);
                    }
                    if (i2 > 0) {
                        this.f.f3939b.y.a(constraintAnchor2, 0);
                    }
                } else {
                    constraintAnchor.a(this.d, i13);
                    if (z3) {
                        constraintAnchor2.a(this.f, this.j);
                    }
                    if (i2 > 0) {
                        this.d.f3939b.f3944A.a(constraintAnchor, 0);
                    }
                }
                int i14 = 0;
                ConstraintWidget constraintWidget4 = null;
                while (i14 < i7) {
                    int i15 = this.f3982n + i14;
                    if (i15 >= flow.P0) {
                        return;
                    }
                    ConstraintWidget constraintWidget5 = flow.O0[i15];
                    if (i14 == 0) {
                        constraintWidget5.f(constraintWidget5.f3971z, this.f3978e, this.f3980i);
                        int i16 = flow.s0;
                        float f = flow.y0;
                        if (this.f3982n == 0) {
                            int i17 = flow.u0;
                            i3 = -1;
                            if (i17 != -1) {
                                f = flow.A0;
                            }
                            i16 = i17;
                            constraintWidget5.a0 = i16;
                            constraintWidget5.f3955V = f;
                        } else {
                            i3 = -1;
                        }
                        if (z3 && (i17 = flow.w0) != i3) {
                            f = flow.C0;
                            i16 = i17;
                        }
                        constraintWidget5.a0 = i16;
                        constraintWidget5.f3955V = f;
                    }
                    if (i14 == i7 - 1) {
                        constraintWidget5.f(constraintWidget5.f3945B, this.g, this.k);
                    }
                    if (constraintWidget4 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.f3971z;
                        int i18 = flow.E0;
                        ConstraintAnchor constraintAnchor4 = constraintWidget4.f3945B;
                        constraintAnchor3.a(constraintAnchor4, i18);
                        ConstraintAnchor constraintAnchor5 = constraintWidget5.f3971z;
                        if (i14 == i9) {
                            int i19 = this.f3980i;
                            if (constraintAnchor5.f()) {
                                constraintAnchor5.f = i19;
                            }
                        }
                        constraintAnchor4.a(constraintAnchor5, 0);
                        if (i14 == i10 + 1) {
                            int i20 = this.k;
                            if (constraintAnchor4.f()) {
                                constraintAnchor4.f = i20;
                            }
                        }
                    }
                    if (constraintWidget5 != constraintWidget3) {
                        if (z2) {
                            int i21 = flow.F0;
                            if (i21 == 0) {
                                constraintWidget5.f3944A.a(constraintAnchor2, 0);
                            } else if (i21 == 1) {
                                constraintWidget5.y.a(constraintAnchor, 0);
                            } else if (i21 == 2) {
                                constraintWidget5.y.a(constraintAnchor, 0);
                                constraintWidget5.f3944A.a(constraintAnchor2, 0);
                            }
                        } else {
                            int i22 = flow.F0;
                            if (i22 == 0) {
                                constraintWidget5.y.a(constraintAnchor, 0);
                            } else if (i22 == 1) {
                                constraintWidget5.f3944A.a(constraintAnchor2, 0);
                            } else if (i22 == 2) {
                                if (z4) {
                                    constraintWidget5.y.a(this.d, this.f3979h);
                                    constraintWidget5.f3944A.a(this.f, this.j);
                                } else {
                                    constraintWidget5.y.a(constraintAnchor, 0);
                                    constraintWidget5.f3944A.a(constraintAnchor2, 0);
                                }
                            }
                        }
                    }
                    i14++;
                    constraintWidget4 = constraintWidget5;
                }
                return;
            }
            ConstraintWidget constraintWidget6 = this.f3976b;
            constraintWidget6.a0 = flow.s0;
            int i23 = this.f3980i;
            if (i2 > 0) {
                i23 += flow.E0;
            }
            ConstraintAnchor constraintAnchor6 = this.f3978e;
            ConstraintAnchor constraintAnchor7 = constraintWidget6.f3971z;
            constraintAnchor7.a(constraintAnchor6, i23);
            ConstraintAnchor constraintAnchor8 = constraintWidget6.f3945B;
            if (z3) {
                constraintAnchor8.a(this.g, this.k);
            }
            if (i2 > 0) {
                this.f3978e.f3939b.f3945B.a(constraintAnchor7, 0);
            }
            if (flow.G0 != 3 || constraintWidget6.f3970w) {
                constraintWidget = constraintWidget6;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i7) {
                    int i25 = this.f3982n + (z2 ? (i7 - 1) - i24 : i24);
                    if (i25 < flow.P0) {
                        constraintWidget = flow.O0[i25];
                        if (constraintWidget.f3970w) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                constraintWidget = constraintWidget6;
                break;
            }
            int i26 = 0;
            ConstraintWidget constraintWidget7 = null;
            while (i26 < i7) {
                int i27 = z2 ? (i7 - 1) - i26 : i26;
                int i28 = this.f3982n + i27;
                if (i28 >= flow.P0) {
                    return;
                }
                ConstraintWidget constraintWidget8 = flow.O0[i28];
                if (i26 == 0) {
                    constraintWidget8.f(constraintWidget8.y, this.d, this.f3979h);
                }
                if (i27 == 0) {
                    int i29 = flow.r0;
                    float f2 = flow.x0;
                    if (this.f3982n == 0) {
                        int i30 = flow.t0;
                        i4 = -1;
                        if (i30 != -1) {
                            f2 = flow.z0;
                        }
                        i5 = i30;
                        constraintWidget8.Z = i5;
                        constraintWidget8.f3954U = f2;
                    } else {
                        i4 = -1;
                    }
                    if (!z3 || (i30 = flow.v0) == i4) {
                        i5 = i29;
                    } else {
                        f2 = flow.B0;
                        i5 = i30;
                    }
                    constraintWidget8.Z = i5;
                    constraintWidget8.f3954U = f2;
                }
                if (i26 == i7 - 1) {
                    constraintWidget8.f(constraintWidget8.f3944A, this.f, this.j);
                }
                if (constraintWidget7 != null) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget8.y;
                    int i31 = flow.D0;
                    ConstraintAnchor constraintAnchor10 = constraintWidget7.f3944A;
                    constraintAnchor9.a(constraintAnchor10, i31);
                    ConstraintAnchor constraintAnchor11 = constraintWidget8.y;
                    if (i26 == i9) {
                        int i32 = this.f3979h;
                        if (constraintAnchor11.f()) {
                            constraintAnchor11.f = i32;
                        }
                    }
                    constraintAnchor10.a(constraintAnchor11, 0);
                    if (i26 == i10 + 1) {
                        int i33 = this.j;
                        if (constraintAnchor10.f()) {
                            constraintAnchor10.f = i33;
                        }
                    }
                }
                if (constraintWidget8 != constraintWidget6) {
                    int i34 = flow.G0;
                    c2 = 3;
                    if (i34 == 3 && constraintWidget.f3970w && constraintWidget8 != constraintWidget && constraintWidget8.f3970w) {
                        constraintWidget8.C.a(constraintWidget.C, 0);
                    } else if (i34 == 0) {
                        constraintWidget8.f3971z.a(constraintAnchor7, 0);
                    } else if (i34 == 1) {
                        constraintWidget8.f3945B.a(constraintAnchor8, 0);
                    } else if (z4) {
                        constraintWidget8.f3971z.a(this.f3978e, this.f3980i);
                        constraintWidget8.f3945B.a(this.g, this.k);
                    } else {
                        constraintWidget8.f3971z.a(constraintAnchor7, 0);
                        constraintWidget8.f3945B.a(constraintAnchor8, 0);
                    }
                } else {
                    c2 = 3;
                }
                i26++;
                constraintWidget7 = constraintWidget8;
            }
        }

        public final int c() {
            return this.f3975a == 1 ? this.m - Flow.this.E0 : this.m;
        }

        public final int d() {
            return this.f3975a == 0 ? this.f3981l - Flow.this.D0 : this.f3981l;
        }

        public final void e(int i2) {
            int i3 = this.f3983p;
            if (i3 == 0) {
                return;
            }
            int i4 = this.o;
            int i5 = i2 / i3;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = this.f3982n;
                int i8 = i7 + i6;
                Flow flow = Flow.this;
                if (i8 >= flow.P0) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.O0[i7 + i6];
                int i9 = this.f3975a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.X;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.Z;
                if (i9 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f3949J;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.j == 0) {
                            flow.D(constraintWidget, dimensionBehaviour, i5, dimensionBehaviourArr[1], constraintWidget.j());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f3949J;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.k == 0) {
                        int i10 = i5;
                        flow.D(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.m(), dimensionBehaviour, i10);
                        i5 = i10;
                    }
                }
            }
            this.f3981l = 0;
            this.m = 0;
            this.f3976b = null;
            this.f3977c = 0;
            int i11 = this.o;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = this.f3982n + i12;
                Flow flow2 = Flow.this;
                if (i13 >= flow2.P0) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow2.O0[i13];
                if (this.f3975a == 0) {
                    int iM = constraintWidget2.m();
                    int i14 = flow2.D0;
                    if (constraintWidget2.X == 8) {
                        i14 = 0;
                    }
                    this.f3981l = iM + i14 + this.f3981l;
                    int iE = flow2.E(constraintWidget2, this.q);
                    if (this.f3976b == null || this.f3977c < iE) {
                        this.f3976b = constraintWidget2;
                        this.f3977c = iE;
                        this.m = iE;
                    }
                } else {
                    int iF = flow2.F(constraintWidget2, this.q);
                    int iE2 = flow2.E(constraintWidget2, this.q);
                    int i15 = flow2.E0;
                    if (constraintWidget2.X == 8) {
                        i15 = 0;
                    }
                    this.m = iE2 + i15 + this.m;
                    if (this.f3976b == null || this.f3977c < iF) {
                        this.f3976b = constraintWidget2;
                        this.f3977c = iF;
                        this.f3981l = iF;
                    }
                }
            }
        }

        public final void f(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.f3975a = i2;
            this.d = constraintAnchor;
            this.f3978e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.f3979h = i3;
            this.f3980i = i4;
            this.j = i5;
            this.k = i6;
            this.q = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x027d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0534  */
    /* JADX WARN: Code duplicated, block: B:311:0x0538 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x053a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0541  */
    /* JADX WARN: Code duplicated, block: B:316:0x0546  */
    /* JADX WARN: Code duplicated, block: B:318:0x054a  */
    /* JADX WARN: Code duplicated, block: B:319:0x054d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x054f  */
    /* JADX WARN: Code duplicated, block: B:321:0x0556 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:323:0x0559  */
    /* JADX WARN: Code duplicated, block: B:326:0x0569  */
    /* JADX WARN: Code duplicated, block: B:327:0x056c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.solver.widgets.VirtualLayout
    public final void C(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        ConstraintWidget[] constraintWidgetArr;
        int i8;
        int i9;
        int i10;
        WidgetsList widgetsList;
        char c2;
        int iMin;
        int iMin2;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        ConstraintWidget constraintWidget;
        int i15;
        int i16;
        int iCeil;
        int iCeil2;
        Object obj;
        ConstraintWidget constraintWidget2;
        int i17;
        int i18 = this.f0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f3974Y;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.Z;
        if (i18 > 0) {
            ConstraintWidget constraintWidget3 = this.K;
            BasicMeasure.Measurer measurer = constraintWidget3 != null ? ((ConstraintWidgetContainer) constraintWidget3).h0 : null;
            if (measurer == null) {
                this.n0 = 0;
                this.o0 = 0;
                this.m0 = false;
                return;
            }
            for (int i19 = 0; i19 < this.f0; i19++) {
                ConstraintWidget constraintWidget4 = this.e0[i19];
                if (constraintWidget4 != null && !(constraintWidget4 instanceof Guideline)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourI = constraintWidget4.i(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourI2 = constraintWidget4.i(1);
                    if (dimensionBehaviourI != dimensionBehaviour2 || constraintWidget4.j == 1 || dimensionBehaviourI2 != dimensionBehaviour2 || constraintWidget4.k == 1) {
                        if (dimensionBehaviourI == dimensionBehaviour2) {
                            dimensionBehaviourI = dimensionBehaviour;
                        }
                        if (dimensionBehaviourI2 == dimensionBehaviour2) {
                            dimensionBehaviourI2 = dimensionBehaviour;
                        }
                        BasicMeasure.Measure measure = this.p0;
                        measure.f3989a = dimensionBehaviourI;
                        measure.f3990b = dimensionBehaviourI2;
                        measure.f3991c = constraintWidget4.m();
                        measure.d = constraintWidget4.j();
                        measurer.b(constraintWidget4, measure);
                        constraintWidget4.z(measure.f3992e);
                        constraintWidget4.w(measure.f);
                        int i20 = measure.g;
                        constraintWidget4.f3953R = i20;
                        constraintWidget4.f3970w = i20 > 0;
                    }
                }
            }
        }
        int i21 = this.k0;
        int i22 = this.l0;
        int i23 = this.g0;
        int i24 = this.h0;
        int[] iArr = new int[2];
        int i25 = (i3 - i21) - i22;
        int i26 = this.J0;
        if (i26 == 1) {
            i25 = (i5 - i23) - i24;
        }
        int i27 = i25;
        if (i26 == 0) {
            if (this.r0 == -1) {
                this.r0 = 0;
            }
            if (this.s0 == -1) {
                this.s0 = 0;
            }
        } else {
            if (this.r0 == -1) {
                this.r0 = 0;
            }
            if (this.s0 == -1) {
                this.s0 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.e0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i6 = this.f0;
            if (i28 >= i6) {
                break;
            }
            if (this.e0[i28].X == 8) {
                i29++;
            }
            i28++;
        }
        if (i29 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i6 - i29];
            int i31 = 0;
            int i32 = 0;
            while (i31 < this.f0) {
                ConstraintWidget constraintWidget5 = this.e0[i31];
                int i33 = i21;
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget5.X != 8) {
                    constraintWidgetArr4[i32] = constraintWidget5;
                    i32++;
                }
                i31++;
                i21 = i33;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            i7 = i32;
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            i7 = i6;
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i34 = i21;
        this.O0 = constraintWidgetArr;
        this.P0 = i7;
        int i35 = this.H0;
        ArrayList arrayList = this.K0;
        if (i35 == 0) {
            i8 = i23;
            i24 = i24;
            iArr = iArr;
            ConstraintWidget[] constraintWidgetArr5 = constraintWidgetArr;
            i9 = i34;
            i10 = i22;
            int i36 = this.J0;
            if (i7 != 0) {
                if (arrayList.size() == 0) {
                    widgetsList = new WidgetsList(i36, this.y, this.f3971z, this.f3944A, this.f3945B, i27);
                    arrayList.add(widgetsList);
                } else {
                    WidgetsList widgetsList2 = (WidgetsList) arrayList.get(0);
                    widgetsList2.f3977c = 0;
                    widgetsList2.f3976b = null;
                    widgetsList2.f3981l = 0;
                    widgetsList2.m = 0;
                    widgetsList2.f3982n = 0;
                    widgetsList2.o = 0;
                    widgetsList2.f3983p = 0;
                    widgetsList2.f(i36, this.y, this.f3971z, this.f3944A, this.f3945B, this.k0, this.g0, this.l0, this.h0, i27);
                    widgetsList = widgetsList2;
                }
                for (int i37 = 0; i37 < i7; i37++) {
                    widgetsList.a(constraintWidgetArr5[i37]);
                }
                i30 = 0;
                iArr[0] = widgetsList.d();
                c2 = 1;
                iArr[1] = widgetsList.c();
            }
            iMin = iArr[i30] + i9 + i10;
            iMin2 = iArr[c2] + i8 + i24;
            if (i2 == 1073741824) {
                i11 = i4;
                iMin = i3;
            } else if (i2 == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i3);
                i11 = i4;
            } else {
                i11 = i4;
                if (i2 != 0) {
                    iMin = i30;
                }
            }
            if (i11 == 1073741824) {
                iMin2 = i5;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i5);
            } else if (i11 != 0) {
                iMin2 = i30;
            }
            this.n0 = iMin;
            this.o0 = iMin2;
            z(iMin);
            w(iMin2);
            if (this.f0 > 0) {
                z2 = c2;
            } else {
                z2 = i30;
            }
            this.m0 = z2;
        }
        if (i35 == 1) {
            int i38 = this.J0;
            if (i7 == 0) {
                i8 = i23;
                i10 = i22;
            } else {
                arrayList.clear();
                iArr = iArr;
                ConstraintWidget[] constraintWidgetArr6 = constraintWidgetArr;
                i8 = i23;
                i24 = i24;
                i10 = i22;
                i9 = i34;
                WidgetsList widgetsList3 = new WidgetsList(i38, this.y, this.f3971z, this.f3944A, this.f3945B, i27);
                arrayList.add(widgetsList3);
                if (i38 == 0) {
                    int i39 = 0;
                    i12 = 0;
                    int i40 = 0;
                    while (i39 < i7) {
                        ConstraintWidget constraintWidget6 = constraintWidgetArr6[i39];
                        int iF = F(constraintWidget6, i27);
                        int i41 = i38;
                        if (constraintWidget6.f3949J[0] == dimensionBehaviour2) {
                            i12++;
                        }
                        int i42 = i12;
                        boolean z3 = (i40 == i27 || (this.D0 + i40) + iF > i27) && widgetsList3.f3976b != null;
                        if (!z3 && i39 > 0 && (i15 = this.I0) > 0 && i39 % i15 == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            i14 = i39;
                            i38 = i41;
                            constraintWidget = constraintWidget6;
                            widgetsList3 = new WidgetsList(i38, this.y, this.f3971z, this.f3944A, this.f3945B, i27);
                            widgetsList3.f3982n = i14;
                            arrayList.add(widgetsList3);
                        } else {
                            i14 = i39;
                            constraintWidget = constraintWidget6;
                            i38 = i41;
                            if (i14 > 0) {
                                i40 = this.D0 + iF + i40;
                            }
                            widgetsList3.a(constraintWidget);
                            i39 = i14 + 1;
                            i12 = i42;
                        }
                        i40 = iF;
                        widgetsList3.a(constraintWidget);
                        i39 = i14 + 1;
                        i12 = i42;
                    }
                } else {
                    int i43 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    while (i45 < i7) {
                        ConstraintWidget constraintWidget7 = constraintWidgetArr6[i45];
                        int iE = E(constraintWidget7, i27);
                        if (constraintWidget7.f3949J[1] == dimensionBehaviour2) {
                            i43++;
                        }
                        int i46 = i43;
                        boolean z4 = (i44 == i27 || (this.E0 + i44) + iE > i27) && widgetsList3.f3976b != null;
                        if (!z4 && i45 > 0 && (i13 = this.I0) > 0 && i45 % i13 == 0) {
                            z4 = true;
                        }
                        if (z4) {
                            widgetsList3 = new WidgetsList(i38, this.y, this.f3971z, this.f3944A, this.f3945B, i27);
                            widgetsList3.f3982n = i45;
                            arrayList.add(widgetsList3);
                        } else {
                            if (i45 > 0) {
                                i44 = this.E0 + iE + i44;
                            }
                            widgetsList3.a(constraintWidget7);
                            i45++;
                            i43 = i46;
                        }
                        i44 = iE;
                        widgetsList3.a(constraintWidget7);
                        i45++;
                        i43 = i46;
                    }
                    i12 = i43;
                }
                int size = arrayList.size();
                int i47 = this.k0;
                int i48 = this.g0;
                int i49 = this.l0;
                int i50 = this.h0;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f3949J;
                boolean z5 = dimensionBehaviourArr[0] == dimensionBehaviour || dimensionBehaviourArr[1] == dimensionBehaviour;
                if (i12 > 0 && z5) {
                    for (int i51 = 0; i51 < size; i51++) {
                        WidgetsList widgetsList4 = (WidgetsList) arrayList.get(i51);
                        if (i38 == 0) {
                            widgetsList4.e(i27 - widgetsList4.d());
                        } else {
                            widgetsList4.e(i27 - widgetsList4.c());
                        }
                    }
                }
                ConstraintAnchor constraintAnchor = this.f3945B;
                ConstraintAnchor constraintAnchor2 = this.f3944A;
                int i52 = i47;
                ConstraintAnchor constraintAnchor3 = constraintAnchor;
                int i53 = i48;
                int i54 = i49;
                int i55 = i50;
                ConstraintAnchor constraintAnchor4 = constraintAnchor2;
                ConstraintAnchor constraintAnchor5 = this.y;
                ConstraintAnchor constraintAnchor6 = this.f3971z;
                int iD = 0;
                int iMax = 0;
                for (int i56 = 0; i56 < size; i56++) {
                    WidgetsList widgetsList5 = (WidgetsList) arrayList.get(i56);
                    if (i38 == 0) {
                        if (i56 < size - 1) {
                            constraintAnchor3 = ((WidgetsList) arrayList.get(i56 + 1)).f3976b.f3971z;
                            i55 = 0;
                        } else {
                            constraintAnchor3 = constraintAnchor;
                            i55 = this.h0;
                        }
                        ConstraintAnchor constraintAnchor7 = widgetsList5.f3976b.f3945B;
                        widgetsList5.f(i38, constraintAnchor5, constraintAnchor6, constraintAnchor4, constraintAnchor3, i52, i53, i54, i55, i27);
                        iD = Math.max(iD, widgetsList5.d());
                        iMax += widgetsList5.c();
                        if (i56 > 0) {
                            iMax += this.E0;
                        }
                        constraintAnchor6 = constraintAnchor7;
                        i53 = 0;
                    } else {
                        if (i56 < size - 1) {
                            constraintAnchor4 = ((WidgetsList) arrayList.get(i56 + 1)).f3976b.y;
                            i54 = 0;
                        } else {
                            constraintAnchor4 = constraintAnchor2;
                            i54 = this.l0;
                        }
                        ConstraintAnchor constraintAnchor8 = widgetsList5.f3976b.f3944A;
                        widgetsList5.f(i38, constraintAnchor5, constraintAnchor6, constraintAnchor4, constraintAnchor3, i52, i53, i54, i55, i27);
                        iD += widgetsList5.d();
                        iMax = Math.max(iMax, widgetsList5.c());
                        if (i56 > 0) {
                            iD += this.D0;
                        }
                        constraintAnchor5 = constraintAnchor8;
                        i52 = 0;
                    }
                }
                iArr[0] = iD;
                iArr[1] = iMax;
            }
        } else if (i35 != 2) {
            i10 = i22;
            i8 = i23;
        } else {
            int i57 = this.J0;
            if (i57 == 0) {
                int i58 = this.I0;
                if (i58 <= 0) {
                    int i59 = 0;
                    int i60 = 0;
                    iCeil2 = 0;
                    while (true) {
                        if (i59 >= i7) {
                            i16 = i27;
                            break;
                        }
                        if (i59 > 0) {
                            i60 += this.D0;
                        }
                        ConstraintWidget constraintWidget8 = constraintWidgetArr[i59];
                        if (constraintWidget8 == null) {
                            i16 = i27;
                        } else {
                            i16 = i27;
                            int iF2 = F(constraintWidget8, i16) + i60;
                            if (iF2 > i16) {
                                break;
                            }
                            iCeil2++;
                            i60 = iF2;
                        }
                        i27 = i16;
                        i59++;
                    }
                } else {
                    i16 = i27;
                    iCeil2 = i58;
                }
                iCeil = 0;
            } else {
                i16 = i27;
                int i61 = this.I0;
                if (i61 <= 0) {
                    int i62 = 0;
                    int i63 = 0;
                    iCeil = 0;
                    while (true) {
                        i22 = i22;
                        if (i62 >= i7) {
                            break;
                        }
                        if (i62 > 0) {
                            i63 += this.E0;
                        }
                        ConstraintWidget constraintWidget9 = constraintWidgetArr[i62];
                        if (constraintWidget9 != null) {
                            int iE2 = E(constraintWidget9, i16) + i63;
                            if (iE2 > i16) {
                                break;
                            }
                            iCeil++;
                            i63 = iE2;
                        }
                        i62++;
                        i22 = i22;
                    }
                } else {
                    i22 = i22;
                    iCeil = i61;
                }
                iCeil2 = 0;
            }
            if (this.N0 == null) {
                this.N0 = new int[2];
            }
            boolean z6 = (iCeil == 0 && i57 == 1) || (iCeil2 == 0 && i57 == 0);
            while (!z6) {
                if (i57 == 0) {
                    iCeil = (int) Math.ceil(i7 / iCeil2);
                } else {
                    iCeil2 = (int) Math.ceil(i7 / iCeil);
                }
                ConstraintWidget[] constraintWidgetArr7 = this.M0;
                if (constraintWidgetArr7 == null || constraintWidgetArr7.length < iCeil2) {
                    obj = null;
                    this.M0 = new ConstraintWidget[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(constraintWidgetArr7, (Object) null);
                }
                ConstraintWidget[] constraintWidgetArr8 = this.L0;
                if (constraintWidgetArr8 == null || constraintWidgetArr8.length < iCeil) {
                    this.L0 = new ConstraintWidget[iCeil];
                } else {
                    Arrays.fill(constraintWidgetArr8, obj);
                }
                int i64 = 0;
                while (i64 < iCeil2) {
                    int i65 = 0;
                    while (i65 < iCeil) {
                        int i66 = (i65 * iCeil2) + i64;
                        int i67 = i64;
                        if (i57 == 1) {
                            i66 = (i67 * iCeil) + i65;
                        }
                        if (i66 < constraintWidgetArr.length && (constraintWidget2 = constraintWidgetArr[i66]) != null) {
                            int iF3 = F(constraintWidget2, i16);
                            i17 = i57;
                            ConstraintWidget constraintWidget10 = this.M0[i67];
                            if (constraintWidget10 == null || constraintWidget10.m() < iF3) {
                                this.M0[i67] = constraintWidget2;
                            }
                            int iE3 = E(constraintWidget2, i16);
                            ConstraintWidget constraintWidget11 = this.L0[i65];
                            if (constraintWidget11 == null || constraintWidget11.j() < iE3) {
                                this.L0[i65] = constraintWidget2;
                            }
                        } else {
                            i17 = i57;
                        }
                        i65++;
                        i64 = i67;
                        i57 = i17;
                    }
                    i64++;
                }
                int i68 = i57;
                int iF4 = 0;
                for (int i69 = 0; i69 < iCeil2; i69++) {
                    ConstraintWidget constraintWidget12 = this.M0[i69];
                    if (constraintWidget12 != null) {
                        if (i69 > 0) {
                            iF4 += this.D0;
                        }
                        iF4 = F(constraintWidget12, i16) + iF4;
                    }
                }
                int i70 = 0;
                int iE4 = 0;
                while (i70 < iCeil) {
                    ConstraintWidget constraintWidget13 = this.L0[i70];
                    int i71 = i70;
                    if (constraintWidget13 != null) {
                        if (i70 > 0) {
                            iE4 += this.E0;
                        }
                        iE4 = E(constraintWidget13, i16) + iE4;
                    }
                    i70 = i71 + 1;
                }
                iArr[0] = iF4;
                iArr[1] = iE4;
                if (i68 == 0) {
                    if (iF4 <= i16 || iCeil2 <= 1) {
                        z6 = true;
                    } else {
                        iCeil2--;
                        z6 = z6;
                    }
                } else if (iE4 <= i16 || iCeil <= 1) {
                    z6 = true;
                } else {
                    iCeil--;
                    z6 = z6;
                }
                i23 = i23;
                i57 = i68;
            }
            int[] iArr2 = this.N0;
            iArr2[0] = iCeil2;
            iArr2[1] = iCeil;
            i8 = i23;
            i10 = i22;
        }
        i9 = i34;
        c2 = 1;
        iMin = iArr[i30] + i9 + i10;
        iMin2 = iArr[c2] + i8 + i24;
        if (i2 == 1073741824) {
            i11 = i4;
            iMin = i3;
        } else if (i2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i3);
            i11 = i4;
        } else {
            i11 = i4;
            if (i2 != 0) {
                iMin = i30;
            }
        }
        if (i11 == 1073741824) {
            iMin2 = i5;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i5);
        } else if (i11 != 0) {
            iMin2 = i30;
        }
        this.n0 = iMin;
        this.o0 = iMin2;
        z(iMin);
        w(iMin2);
        if (this.f0 > 0) {
            z2 = c2;
        } else {
            z2 = i30;
        }
        this.m0 = z2;
    }

    public final int E(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f3949J[1] == ConstraintWidget.DimensionBehaviour.Z) {
            int i3 = constraintWidget.k;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.r * i2);
                if (i4 != constraintWidget.j()) {
                    D(constraintWidget, constraintWidget.f3949J[0], constraintWidget.m(), ConstraintWidget.DimensionBehaviour.X, i4);
                }
                return i4;
            }
            constraintWidget2 = constraintWidget;
            if (i3 == 1) {
                return constraintWidget2.j();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget2.m() * constraintWidget2.f3950N) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.j();
    }

    public final int F(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f3949J[0] == ConstraintWidget.DimensionBehaviour.Z) {
            int i3 = constraintWidget.j;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.o * i2);
                if (i4 != constraintWidget.m()) {
                    D(constraintWidget, ConstraintWidget.DimensionBehaviour.X, i4, constraintWidget.f3949J[1], constraintWidget.j());
                }
                return i4;
            }
            constraintWidget2 = constraintWidget;
            if (i3 == 1) {
                return constraintWidget2.m();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget2.j() * constraintWidget2.f3950N) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.m();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void b(LinearSystem linearSystem) {
        ConstraintWidget constraintWidget;
        super.b(linearSystem);
        ConstraintWidget constraintWidget2 = this.K;
        boolean z2 = constraintWidget2 != null ? ((ConstraintWidgetContainer) constraintWidget2).i0 : false;
        int i2 = this.H0;
        ArrayList arrayList = this.K0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((WidgetsList) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.N0 != null && this.M0 != null && this.L0 != null) {
                for (int i4 = 0; i4 < this.P0; i4++) {
                    this.O0[i4].u();
                }
                int[] iArr = this.N0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                for (int i7 = 0; i7 < i5; i7++) {
                    ConstraintWidget constraintWidget4 = this.M0[z2 ? (i5 - i7) - 1 : i7];
                    if (constraintWidget4 != null && constraintWidget4.X != 8) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.y;
                        if (i7 == 0) {
                            constraintWidget4.f(constraintAnchor, this.y, this.k0);
                            constraintWidget4.Z = this.r0;
                            constraintWidget4.f3954U = this.x0;
                        }
                        if (i7 == i5 - 1) {
                            constraintWidget4.f(constraintWidget4.f3944A, this.f3944A, this.l0);
                        }
                        if (i7 > 0) {
                            constraintWidget4.f(constraintAnchor, constraintWidget3.f3944A, this.D0);
                            constraintWidget3.f(constraintWidget3.f3944A, constraintAnchor, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    ConstraintWidget constraintWidget5 = this.L0[i8];
                    if (constraintWidget5 != null && constraintWidget5.X != 8) {
                        ConstraintAnchor constraintAnchor2 = constraintWidget5.f3971z;
                        if (i8 == 0) {
                            constraintWidget5.f(constraintAnchor2, this.f3971z, this.g0);
                            constraintWidget5.a0 = this.s0;
                            constraintWidget5.f3955V = this.y0;
                        }
                        if (i8 == i6 - 1) {
                            constraintWidget5.f(constraintWidget5.f3945B, this.f3945B, this.h0);
                        }
                        if (i8 > 0) {
                            constraintWidget5.f(constraintAnchor2, constraintWidget3.f3945B, this.E0);
                            constraintWidget3.f(constraintWidget3.f3945B, constraintAnchor2, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.J0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.O0;
                        if (i11 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i11]) != null && constraintWidget.X != 8) {
                            ConstraintWidget constraintWidget6 = this.M0[i9];
                            ConstraintWidget constraintWidget7 = this.L0[i10];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.f(constraintWidget.y, constraintWidget6.y, 0);
                                constraintWidget.f(constraintWidget.f3944A, constraintWidget6.f3944A, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.f(constraintWidget.f3971z, constraintWidget7.f3971z, 0);
                                constraintWidget.f(constraintWidget.f3945B, constraintWidget7.f3945B, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((WidgetsList) arrayList.get(0)).b(0, z2, true);
        }
        this.m0 = false;
    }
}
