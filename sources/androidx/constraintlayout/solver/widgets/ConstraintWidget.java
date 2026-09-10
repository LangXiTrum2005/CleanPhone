package androidx.constraintlayout.solver.widgets;

import android.support.v4.media.a;
import android.view.View;
import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ConstraintAnchor f3944A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ConstraintAnchor f3945B;
    public final ConstraintAnchor C;
    public final ConstraintAnchor D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ConstraintAnchor f3946E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ConstraintAnchor f3947F;
    public final ConstraintAnchor[] G;
    public final ArrayList H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean[] f3948I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final DimensionBehaviour[] f3949J;
    public ConstraintWidget K;
    public int L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f3950N;
    public int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f3951P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f3952Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f3953R;
    public int S;
    public int T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f3954U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f3955V;
    public View W;
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f3956Y;
    public int Z;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChainRun f3958b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final float[] f3959b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChainRun f3960c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ConstraintWidget[] f3961c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ConstraintWidget[] f3962d0;
    public boolean x;
    public final ConstraintAnchor y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ConstraintAnchor f3971z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3957a = false;
    public final HorizontalWidgetRun d = new HorizontalWidgetRun(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VerticalWidgetRun f3963e = new VerticalWidgetRun(this);
    public final boolean[] f = {true, true};
    public final int[] g = {0, 0, 0, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3964h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3965i = -1;
    public int j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f3966l = new int[2];
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3967n = 0;
    public float o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3968p = 0;
    public int q = 0;
    public float r = 1.0f;
    public int s = -1;
    public float t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f3969u = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3970w = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3973b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f3973b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3973b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3973b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3973b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f3972a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3972a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3972a[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3972a[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3972a[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3972a[6] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3972a[7] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3972a[8] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3972a[0] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {
        public static final DimensionBehaviour X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final DimensionBehaviour f3974Y;
        public static final DimensionBehaviour Z;
        public static final DimensionBehaviour e0;
        public static final /* synthetic */ DimensionBehaviour[] f0;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            X = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            f3974Y = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            Z = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            e0 = dimensionBehaviour4;
            f0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) f0.clone();
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.X);
        this.y = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f3943Y);
        this.f3971z = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.Z);
        this.f3944A = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.e0);
        this.f3945B = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f0);
        this.C = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.h0);
        this.D = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.i0);
        this.f3946E = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.g0);
        this.f3947F = constraintAnchor8;
        this.G = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.f3948I = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.X;
        this.f3949J = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.K = null;
        this.L = 0;
        this.M = 0;
        this.f3950N = 0.0f;
        this.O = -1;
        this.f3951P = 0;
        this.f3952Q = 0;
        this.f3953R = 0;
        this.f3954U = 0.5f;
        this.f3955V = 0.5f;
        this.X = 0;
        this.f3956Y = null;
        this.Z = 0;
        this.a0 = 0;
        this.f3959b0 = new float[]{-1.0f, -1.0f};
        this.f3961c0 = new ConstraintWidget[]{null, null};
        this.f3962d0 = new ConstraintWidget[]{null, null};
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public void A(boolean z2, boolean z3) {
        int i2;
        int i3;
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        boolean z4 = z2 & horizontalWidgetRun.g;
        VerticalWidgetRun verticalWidgetRun = this.f3963e;
        boolean z5 = z3 & verticalWidgetRun.g;
        int i4 = horizontalWidgetRun.f4018h.g;
        int i5 = verticalWidgetRun.f4018h.g;
        int i6 = horizontalWidgetRun.f4019i.g;
        int i7 = verticalWidgetRun.f4019i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.f3951P = i4;
        }
        if (z5) {
            this.f3952Q = i5;
        }
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.X;
        if (z4) {
            if (this.f3949J[0] == dimensionBehaviour && i9 < (i3 = this.L)) {
                i9 = i3;
            }
            this.L = i9;
            int i11 = this.S;
            if (i9 < i11) {
                this.L = i11;
            }
        }
        if (z5) {
            if (this.f3949J[1] == dimensionBehaviour && i10 < (i2 = this.M)) {
                i10 = i2;
            }
            this.M = i10;
            int i12 = this.T;
            if (i10 < i12) {
                this.M = i12;
            }
        }
    }

    public void B(LinearSystem linearSystem) {
        int i2;
        int i3;
        ConstraintAnchor constraintAnchor = this.y;
        linearSystem.getClass();
        int iM = LinearSystem.m(constraintAnchor);
        int iM2 = LinearSystem.m(this.f3971z);
        int iM3 = LinearSystem.m(this.f3944A);
        int iM4 = LinearSystem.m(this.f3945B);
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        DependencyNode dependencyNode = horizontalWidgetRun.f4018h;
        if (dependencyNode.j) {
            DependencyNode dependencyNode2 = horizontalWidgetRun.f4019i;
            if (dependencyNode2.j) {
                iM = dependencyNode.g;
                iM3 = dependencyNode2.g;
            }
        }
        VerticalWidgetRun verticalWidgetRun = this.f3963e;
        DependencyNode dependencyNode3 = verticalWidgetRun.f4018h;
        if (dependencyNode3.j) {
            DependencyNode dependencyNode4 = verticalWidgetRun.f4019i;
            if (dependencyNode4.j) {
                iM2 = dependencyNode3.g;
                iM4 = dependencyNode4.g;
            }
        }
        int i4 = iM4 - iM2;
        if (iM3 - iM < 0 || i4 < 0 || iM == Integer.MIN_VALUE || iM == Integer.MAX_VALUE || iM2 == Integer.MIN_VALUE || iM2 == Integer.MAX_VALUE || iM3 == Integer.MIN_VALUE || iM3 == Integer.MAX_VALUE || iM4 == Integer.MIN_VALUE || iM4 == Integer.MAX_VALUE) {
            iM = 0;
            iM2 = 0;
            iM3 = 0;
            iM4 = 0;
        }
        int i5 = iM3 - iM;
        int i6 = iM4 - iM2;
        this.f3951P = iM;
        this.f3952Q = iM2;
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f3949J;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.X;
        if (dimensionBehaviour == dimensionBehaviour2 && i5 < (i3 = this.L)) {
            i5 = i3;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i6 < (i2 = this.M)) {
            i6 = i2;
        }
        this.L = i5;
        this.M = i6;
        int i7 = this.T;
        if (i6 < i7) {
            this.M = i7;
        }
        int i8 = this.S;
        if (i5 < i8) {
            this.L = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0309  */
    /* JADX WARN: Code duplicated, block: B:205:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x031e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0324  */
    /* JADX WARN: Code duplicated, block: B:214:0x0327  */
    /* JADX WARN: Code duplicated, block: B:217:0x0344  */
    /* JADX WARN: Code duplicated, block: B:219:0x034a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0350  */
    /* JADX WARN: Code duplicated, block: B:233:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:237:0x03af  */
    /* JADX WARN: Code duplicated, block: B:239:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:241:0x041f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0444  */
    /* JADX WARN: Code duplicated, block: B:256:0x0485  */
    /* JADX WARN: Code duplicated, block: B:259:0x0495  */
    /* JADX WARN: Code duplicated, block: B:261:0x0498  */
    /* JADX WARN: Code duplicated, block: B:263:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:266:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:269:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:271:0x04af  */
    /* JADX WARN: Code duplicated, block: B:276:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:279:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:280:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:283:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:288:0x04da  */
    /* JADX WARN: Code duplicated, block: B:290:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:294:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:296:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:298:0x0549  */
    /* JADX WARN: Code duplicated, block: B:300:0x054f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0556  */
    /* JADX WARN: Code duplicated, block: B:303:0x057f  */
    /* JADX WARN: Code duplicated, block: B:306:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(LinearSystem linearSystem) {
        boolean z2;
        boolean z3;
        boolean zR;
        boolean z4;
        boolean z5;
        SolverVariable solverVariable;
        int i2;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        ConstraintAnchor constraintAnchor;
        boolean z9;
        boolean z10;
        boolean z11;
        SolverVariable solverVariable2;
        DimensionBehaviour dimensionBehaviour;
        Object obj;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i4;
        VerticalWidgetRun verticalWidgetRun;
        DependencyNode dependencyNode;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int i5;
        int i6;
        int i7;
        int i8;
        SolverVariable solverVariable6;
        boolean z16;
        int i9;
        boolean z17;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariableJ;
        int i10;
        Object obj2;
        boolean z18;
        int i11;
        DependencyNode dependencyNode2;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariableJ2;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariableJ3;
        int i12;
        int i13;
        int i14;
        boolean zS;
        LinearSystem linearSystem2 = linearSystem;
        ConstraintAnchor constraintAnchor2 = this.y;
        SolverVariable solverVariableJ4 = linearSystem2.j(constraintAnchor2);
        ConstraintAnchor constraintAnchor3 = this.f3944A;
        SolverVariable solverVariableJ5 = linearSystem2.j(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = this.f3971z;
        SolverVariable solverVariableJ6 = linearSystem2.j(constraintAnchor4);
        ConstraintAnchor constraintAnchor5 = this.f3945B;
        SolverVariable solverVariableJ7 = linearSystem2.j(constraintAnchor5);
        ConstraintAnchor constraintAnchor6 = this.C;
        SolverVariable solverVariableJ8 = linearSystem2.j(constraintAnchor6);
        Metrics metrics = LinearSystem.f3890p;
        if (metrics != null) {
            metrics.f3903h++;
        }
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        DependencyNode dependencyNode3 = horizontalWidgetRun.f4018h;
        boolean z19 = dependencyNode3.j;
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.f3974Y;
        boolean[] zArr = this.f;
        VerticalWidgetRun verticalWidgetRun2 = this.f3963e;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        if (z19 && horizontalWidgetRun.f4019i.j && verticalWidgetRun2.f4018h.j && verticalWidgetRun2.f4019i.j) {
            if (metrics != null) {
                metrics.d++;
            }
            linearSystem2.d(solverVariableJ4, dependencyNode3.g);
            linearSystem2.d(solverVariableJ5, horizontalWidgetRun.f4019i.g);
            linearSystem2.d(solverVariableJ6, verticalWidgetRun2.f4018h.g);
            linearSystem2.d(solverVariableJ7, verticalWidgetRun2.f4019i.g);
            linearSystem2.d(solverVariableJ8, verticalWidgetRun2.k.g);
            ConstraintWidget constraintWidget4 = this.K;
            if (constraintWidget4 != null) {
                DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.f3949J;
                boolean z20 = dimensionBehaviourArr[0] == dimensionBehaviour2;
                boolean z21 = dimensionBehaviourArr[1] == dimensionBehaviour2;
                if (z20 && zArr[0] && !r()) {
                    linearSystem2.f(linearSystem2.j(this.K.f3944A), solverVariableJ5, 0, 8);
                }
                if (z21 && zArr[1] && !s()) {
                    linearSystem2.f(linearSystem2.j(this.K.f3945B), solverVariableJ7, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (metrics != null) {
            metrics.f3902e++;
        }
        ConstraintWidget constraintWidget5 = this.K;
        if (constraintWidget5 != null) {
            DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget5.f3949J;
            z3 = dimensionBehaviourArr2[0] == dimensionBehaviour2;
            boolean z22 = dimensionBehaviourArr2[1] == dimensionBehaviour2;
            if (q(0)) {
                ((ConstraintWidgetContainer) this.K).D(this, 0);
                zR = true;
                i14 = 1;
            } else {
                zR = r();
                i14 = 1;
            }
            if (q(i14)) {
                ((ConstraintWidgetContainer) this.K).D(this, i14);
                zS = true;
            } else {
                zS = s();
            }
            if (zR == 0 && z3) {
                z4 = zS;
                if (this.X != 8 && constraintAnchor2.d == null && constraintAnchor3.d == null) {
                    linearSystem2.f(linearSystem2.j(this.K.f3944A), solverVariableJ5, 0, 1);
                }
            } else {
                z4 = zS;
            }
            if (!z4 && z22 && this.X != 8 && constraintAnchor4.d == null) {
                if (constraintAnchor7.d == null && constraintAnchor6 == null) {
                    constraintAnchor7 = constraintAnchor7;
                    linearSystem2.f(linearSystem2.j(this.K.f3945B), solverVariableJ7, 0, 1);
                } else {
                    constraintAnchor7 = constraintAnchor7;
                }
            }
            z2 = z22;
        } else {
            constraintAnchor2 = constraintAnchor2;
            z2 = false;
            z3 = false;
            zR = false;
            z4 = false;
        }
        int i15 = this.L;
        int i16 = this.S;
        if (i15 >= i16) {
            i16 = i15;
        }
        int i17 = this.M;
        boolean z23 = z2;
        int i18 = this.T;
        int i19 = i17 < i18 ? i18 : i17;
        DimensionBehaviour[] dimensionBehaviourArr3 = this.f3949J;
        DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr3[0];
        DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.Z;
        boolean z24 = dimensionBehaviour3 != dimensionBehaviour4;
        int i20 = i16;
        DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr3[1];
        boolean z25 = dimensionBehaviour5 != dimensionBehaviour4;
        int i21 = this.O;
        this.s = i21;
        float f = this.f3950N;
        this.t = f;
        int i22 = this.j;
        int i23 = this.k;
        if (f > 0.0f) {
            z5 = z3;
            if (this.X != 8) {
                int i24 = (dimensionBehaviour3 == dimensionBehaviour4 && i22 == 0) ? 3 : i22;
                int i25 = (dimensionBehaviour5 == dimensionBehaviour4 && i23 == 0) ? 3 : i23;
                if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviour5 == dimensionBehaviour4 && i24 == 3) {
                    solverVariable = solverVariableJ8;
                    i13 = i25;
                    if (i13 == 3) {
                        if (i21 == -1) {
                            if (z24 && !z25) {
                                this.s = 0;
                            } else if (!z24 && z25) {
                                this.s = 1;
                                if (i21 == -1) {
                                    this.t = 1.0f / f;
                                }
                            }
                        }
                        if (this.s == 0 && (!constraintAnchor4.f() || !constraintAnchor7.f())) {
                            this.s = 1;
                        } else if (this.s == 1 && (!constraintAnchor2.f() || !constraintAnchor3.f())) {
                            this.s = 0;
                        }
                        if (this.s == -1 && (!constraintAnchor4.f() || !constraintAnchor7.f() || !constraintAnchor2.f() || !constraintAnchor3.f())) {
                            if (constraintAnchor4.f() && constraintAnchor7.f()) {
                                this.s = 0;
                            } else if (constraintAnchor2.f() && constraintAnchor3.f()) {
                                this.t = 1.0f / this.t;
                                this.s = 1;
                            }
                        }
                        if (this.s == -1) {
                            int i26 = this.m;
                            if (i26 > 0 && this.f3968p == 0) {
                                this.s = 0;
                            } else if (i26 == 0 && this.f3968p > 0) {
                                this.t = 1.0f / this.t;
                                this.s = 1;
                            }
                        }
                    }
                    i2 = i24;
                    i3 = i13;
                    z6 = true;
                    int[] iArr = this.f3966l;
                    iArr[0] = i2;
                    iArr[1] = i3;
                    z7 = !z6 && ((i12 = this.s) == 0 || i12 == -1);
                    if (this.f3949J[0] == dimensionBehaviour2 || !(this instanceof ConstraintWidgetContainer)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z8) {
                        i20 = 0;
                    }
                    constraintAnchor = this.f3947F;
                    z9 = !constraintAnchor.f();
                    boolean[] zArr2 = this.f3948I;
                    z10 = zArr2[0];
                    z11 = zArr2[1];
                    if (this.f3964h != 2) {
                        dependencyNode2 = horizontalWidgetRun.f4018h;
                        if (dependencyNode2.j || !horizontalWidgetRun.f4019i.j) {
                            constraintWidget2 = this.K;
                            if (constraintWidget2 != null) {
                                solverVariableJ2 = linearSystem2.j(constraintWidget2.f3944A);
                            } else {
                                solverVariableJ2 = null;
                            }
                            constraintWidget3 = this.K;
                            if (constraintWidget3 != null) {
                                solverVariableJ3 = linearSystem2.j(constraintWidget3.y);
                            } else {
                                solverVariableJ3 = null;
                            }
                            Object obj3 = constraintAnchor7;
                            i4 = i2;
                            SolverVariable solverVariable7 = solverVariableJ2;
                            z13 = z23;
                            boolean z26 = z9;
                            z12 = z4;
                            solverVariable2 = solverVariableJ5;
                            z14 = z5;
                            dimensionBehaviour = dimensionBehaviour2;
                            obj = obj3;
                            linearSystem2 = linearSystem;
                            d(linearSystem2, true, z14, z13, zArr[0], solverVariableJ3, solverVariable7, this.f3949J[0], z8, this.y, this.f3944A, this.f3951P, i20, this.S, this.f3969u[0], this.f3954U, z7, zR, z12, z10, i4, i3, this.m, this.f3967n, this.o, z26);
                            verticalWidgetRun = verticalWidgetRun2;
                            z15 = z26;
                        } else {
                            linearSystem2.d(solverVariableJ4, dependencyNode2.g);
                            linearSystem2.d(solverVariableJ5, horizontalWidgetRun.f4019i.g);
                            if (this.K != null && z5 && zArr[0] && !r()) {
                                linearSystem2.f(linearSystem2.j(this.K.f3944A), solverVariableJ5, 0, 8);
                            }
                            solverVariable2 = solverVariableJ5;
                            dimensionBehaviour = dimensionBehaviour2;
                            verticalWidgetRun = verticalWidgetRun2;
                            obj = constraintAnchor7;
                            z12 = z4;
                            z13 = z23;
                            z14 = z5;
                            z15 = z9;
                            i4 = i2;
                        }
                    } else {
                        solverVariable2 = solverVariableJ5;
                        dimensionBehaviour = dimensionBehaviour2;
                        obj = constraintAnchor7;
                        z12 = z4;
                        z13 = z23;
                        z14 = z5;
                        z15 = z9;
                        i4 = i2;
                        verticalWidgetRun = verticalWidgetRun2;
                    }
                    dependencyNode = verticalWidgetRun.f4018h;
                    if (dependencyNode.j || !verticalWidgetRun.f4019i.j) {
                        solverVariable3 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0485: MOVE (r6v4 'solverVariable3' androidx.constraintlayout.solver.SolverVariable) = (r33v0 androidx.constraintlayout.solver.SolverVariable) in method: androidx.constraintlayout.solver.widgets.ConstraintWidget.b(androidx.constraintlayout.solver.LinearSystem):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 androidx.constraintlayout.solver.SolverVariable
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1631
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.b(androidx.constraintlayout.solver.LinearSystem):void");
                    }

                    public boolean c() {
                        return this.X != 8;
                    }

                    /* JADX WARN: Code duplicated, block: B:171:0x028f  */
                    /* JADX WARN: Code duplicated, block: B:173:0x0295  */
                    /* JADX WARN: Code duplicated, block: B:175:0x029b  */
                    /* JADX WARN: Code duplicated, block: B:177:0x02bc  */
                    /* JADX WARN: Code duplicated, block: B:181:0x02d0 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:182:0x02d2  */
                    /* JADX WARN: Code duplicated, block: B:192:0x02e8  */
                    /* JADX WARN: Code duplicated, block: B:195:0x02fe  */
                    /* JADX WARN: Code duplicated, block: B:203:0x0312  */
                    /* JADX WARN: Code duplicated, block: B:205:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:216:0x032d  */
                    /* JADX WARN: Code duplicated, block: B:221:0x0337  */
                    /* JADX WARN: Code duplicated, block: B:223:0x033b  */
                    /* JADX WARN: Code duplicated, block: B:224:0x033d  */
                    /* JADX WARN: Code duplicated, block: B:227:0x0345  */
                    /* JADX WARN: Code duplicated, block: B:233:0x0353  */
                    /* JADX WARN: Code duplicated, block: B:234:0x0355  */
                    /* JADX WARN: Code duplicated, block: B:237:0x0367 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:238:0x0369  */
                    /* JADX WARN: Code duplicated, block: B:239:0x036e  */
                    /* JADX WARN: Code duplicated, block: B:241:0x0371  */
                    /* JADX WARN: Code duplicated, block: B:250:0x0389  */
                    /* JADX WARN: Code duplicated, block: B:262:0x03a8 A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:281:0x03dd  */
                    /* JADX WARN: Code duplicated, block: B:288:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:94:0x0179 A[ADDED_TO_REGION] */
                    public final void d(LinearSystem linearSystem, boolean z2, boolean z3, boolean z4, boolean z5, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z6, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2, int i3, int i4, int i5, float f, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
                        int iMin;
                        int i10;
                        int i11;
                        SolverVariable solverVariableJ;
                        SolverVariable solverVariableJ2;
                        ConstraintAnchor constraintAnchor3;
                        SolverVariable solverVariable3;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        boolean z15;
                        int i12;
                        int i13;
                        boolean z16;
                        boolean z17;
                        int i14;
                        ConstraintWidget constraintWidget;
                        SolverVariable solverVariable4;
                        SolverVariable solverVariable5;
                        SolverVariable solverVariable6;
                        int i15;
                        ConstraintWidget constraintWidget2;
                        int i16;
                        int iMax;
                        int iC;
                        int i17;
                        int iMin2;
                        int i18;
                        int i19;
                        int i20;
                        int i21;
                        LinearSystem linearSystem2 = linearSystem;
                        int i22 = i8;
                        int i23 = i9;
                        SolverVariable solverVariableJ3 = linearSystem2.j(constraintAnchor);
                        SolverVariable solverVariableJ4 = linearSystem2.j(constraintAnchor2);
                        SolverVariable solverVariableJ5 = linearSystem2.j(constraintAnchor.d);
                        SolverVariable solverVariableJ6 = linearSystem2.j(constraintAnchor2.d);
                        boolean zF = constraintAnchor.f();
                        boolean zF2 = constraintAnchor2.f();
                        boolean zF3 = this.f3947F.f();
                        int i24 = zF2 ? (zF ? 1 : 0) + 1 : zF ? 1 : 0;
                        if (zF3) {
                            i24++;
                        }
                        int i25 = i24;
                        int i26 = z7 ? 3 : i6;
                        int iOrdinal = dimensionBehaviour.ordinal();
                        boolean z18 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i26 == 4) ? false : true;
                        if (this.X == 8) {
                            iMin = 0;
                            z18 = false;
                        } else {
                            iMin = i3;
                        }
                        if (z11) {
                            if (!zF && !zF2 && !zF3) {
                                linearSystem2.d(solverVariableJ3, i2);
                            } else if (zF && !zF2) {
                                i10 = 8;
                                linearSystem2.e(solverVariableJ3, solverVariableJ5, constraintAnchor.c(), 8);
                            }
                            i10 = 8;
                        } else {
                            i10 = 8;
                        }
                        if (z18) {
                            if (i25 == 2 || z7 || !(i26 == 1 || i26 == 0)) {
                                if (i22 == -2) {
                                    i22 = iMin;
                                }
                                if (i23 == -2) {
                                    i23 = iMin;
                                }
                                if (iMin > 0 && i26 != 1) {
                                    iMin = 0;
                                }
                                if (i22 > 0) {
                                    linearSystem2.f(solverVariableJ4, solverVariableJ3, i22, 8);
                                    iMin = Math.max(iMin, i22);
                                }
                                if (i23 > 0) {
                                    if (!z3 || i26 != 1) {
                                        linearSystem2.g(solverVariableJ4, solverVariableJ3, i23, 8);
                                    }
                                    iMin = Math.min(iMin, i23);
                                }
                                if (i26 == 1) {
                                    if (z3) {
                                        linearSystem2.e(solverVariableJ4, solverVariableJ3, iMin, 8);
                                    } else if (z8) {
                                        linearSystem2.e(solverVariableJ4, solverVariableJ3, iMin, 5);
                                        linearSystem2.g(solverVariableJ4, solverVariableJ3, iMin, 8);
                                    } else {
                                        linearSystem2.e(solverVariableJ4, solverVariableJ3, iMin, 5);
                                        linearSystem2.g(solverVariableJ4, solverVariableJ3, iMin, 8);
                                    }
                                } else if (i26 == 2) {
                                    ConstraintAnchor.Type type = ConstraintAnchor.Type.f3943Y;
                                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.e0;
                                    ConstraintAnchor.Type type3 = constraintAnchor.f3940c;
                                    if (type3 == type || type3 == type2) {
                                        solverVariableJ = linearSystem2.j(this.K.h(type));
                                        solverVariableJ2 = linearSystem2.j(this.K.h(type2));
                                    } else {
                                        solverVariableJ = linearSystem2.j(this.K.h(ConstraintAnchor.Type.X));
                                        solverVariableJ2 = linearSystem2.j(this.K.h(ConstraintAnchor.Type.Z));
                                    }
                                    ArrayRow arrayRowK = linearSystem2.k();
                                    arrayRowK.d.f(solverVariableJ4, -1.0f);
                                    arrayRowK.d.f(solverVariableJ3, 1.0f);
                                    arrayRowK.d.f(solverVariableJ2, f2);
                                    arrayRowK.d.f(solverVariableJ, -f2);
                                    linearSystem2.c(arrayRowK);
                                    i11 = i22;
                                } else {
                                    i11 = i22;
                                    z5 = true;
                                }
                                if (z11 || z8) {
                                    boolean z19 = z5;
                                    if (i25 >= 2 && z3 && z19) {
                                        linearSystem2.f(solverVariableJ3, solverVariable, 0, 8);
                                        ConstraintAnchor constraintAnchor4 = this.C;
                                        boolean z20 = z2 || constraintAnchor4.d == null;
                                        if (!z2 && (constraintAnchor3 = constraintAnchor4.d) != null) {
                                            ConstraintWidget constraintWidget3 = constraintAnchor3.f3939b;
                                            if (constraintWidget3.f3950N != 0.0f) {
                                                DimensionBehaviour[] dimensionBehaviourArr = constraintWidget3.f3949J;
                                                DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                                                DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.Z;
                                                if (dimensionBehaviour2 == dimensionBehaviour3) {
                                                    z20 = true;
                                                    if (dimensionBehaviourArr[1] != dimensionBehaviour3) {
                                                        z20 = false;
                                                    }
                                                } else {
                                                    z20 = false;
                                                }
                                            } else {
                                                z20 = false;
                                            }
                                        }
                                        if (z20) {
                                            linearSystem2.f(solverVariable2, solverVariableJ4, 0, 8);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if ((zF || zF2 || zF3) && (!zF || zF2)) {
                                    if (zF || !zF2) {
                                        solverVariable3 = solverVariableJ6;
                                        if (zF && zF2) {
                                            ConstraintWidget constraintWidget4 = constraintAnchor.d.f3939b;
                                            ConstraintWidget constraintWidget5 = constraintAnchor2.d.f3939b;
                                            z12 = z5;
                                            ConstraintWidget constraintWidget6 = this.K;
                                            int i27 = 6;
                                            if (z18) {
                                                if (i26 == 0) {
                                                    if (i23 == 0 && i11 == 0) {
                                                        z14 = false;
                                                        z15 = true;
                                                        i12 = 8;
                                                        i13 = 8;
                                                    } else {
                                                        z14 = true;
                                                        z15 = false;
                                                        i12 = 5;
                                                        i13 = 5;
                                                    }
                                                    if ((constraintWidget4 instanceof Barrier) || (constraintWidget5 instanceof Barrier)) {
                                                        i27 = 6;
                                                        z13 = false;
                                                        i13 = 4;
                                                    } else {
                                                        i27 = 6;
                                                        z13 = false;
                                                    }
                                                } else {
                                                    if (i26 == 1) {
                                                        i27 = 6;
                                                        z13 = true;
                                                        z14 = true;
                                                        z15 = false;
                                                        i12 = 8;
                                                    } else if (i26 == 3) {
                                                        if (this.s == -1) {
                                                            if (z9) {
                                                                z13 = true;
                                                                i27 = z3 ? 5 : 4;
                                                            } else {
                                                                z13 = true;
                                                                i27 = 8;
                                                            }
                                                            z14 = true;
                                                            z15 = true;
                                                            i12 = 8;
                                                        } else if (z7) {
                                                            if (i7 == 2 || i7 == 1) {
                                                                i20 = 5;
                                                                i21 = 4;
                                                            } else {
                                                                i20 = 8;
                                                                i21 = 5;
                                                            }
                                                            i12 = i20;
                                                            i13 = i21;
                                                            i27 = 6;
                                                            z13 = true;
                                                            z14 = true;
                                                            z15 = true;
                                                        } else if (i23 > 0) {
                                                            i27 = 6;
                                                            z13 = true;
                                                            z14 = true;
                                                            z15 = true;
                                                            i12 = 5;
                                                        } else if (i23 != 0 || i11 != 0) {
                                                            i27 = 6;
                                                            z13 = true;
                                                            z14 = true;
                                                            z15 = true;
                                                            i12 = 5;
                                                        } else if (z9) {
                                                            i12 = (constraintWidget4 == constraintWidget6 || constraintWidget5 == constraintWidget6) ? 5 : 4;
                                                            i27 = 6;
                                                            z13 = true;
                                                            z14 = true;
                                                            z15 = true;
                                                        } else {
                                                            i27 = 6;
                                                            z13 = true;
                                                            z14 = true;
                                                            z15 = true;
                                                            i12 = 5;
                                                            i13 = 8;
                                                        }
                                                        i13 = 5;
                                                    } else {
                                                        z13 = false;
                                                        z14 = false;
                                                    }
                                                    i13 = 4;
                                                }
                                                if (z13 || solverVariableJ5 != solverVariable3 || constraintWidget4 == constraintWidget6) {
                                                    z16 = z13;
                                                    z17 = true;
                                                } else {
                                                    z16 = false;
                                                    z17 = false;
                                                }
                                                if (z14) {
                                                    if (this.X == 8) {
                                                        i27 = 4;
                                                    }
                                                    int i28 = i26;
                                                    solverVariable6 = solverVariableJ5;
                                                    int i29 = i27;
                                                    solverVariable4 = solverVariableJ3;
                                                    solverVariable5 = solverVariableJ4;
                                                    constraintWidget = constraintWidget5;
                                                    i14 = i28;
                                                    linearSystem2 = linearSystem;
                                                    i15 = 8;
                                                    linearSystem2.b(solverVariable4, solverVariable6, constraintAnchor.c(), f, solverVariable3, solverVariable5, constraintAnchor2.c(), i29);
                                                } else {
                                                    linearSystem2 = linearSystem;
                                                    i14 = i26;
                                                    constraintWidget = constraintWidget5;
                                                    solverVariable4 = solverVariableJ3;
                                                    solverVariable5 = solverVariableJ4;
                                                    solverVariable6 = solverVariableJ5;
                                                    i15 = 8;
                                                }
                                                if (this.X == i15) {
                                                    return;
                                                }
                                                if (z16) {
                                                    if (z3 || solverVariable6 == solverVariable3 || z18) {
                                                        constraintWidget2 = constraintWidget;
                                                    } else {
                                                        if (constraintWidget4 instanceof Barrier) {
                                                            constraintWidget2 = constraintWidget;
                                                        } else {
                                                            constraintWidget2 = constraintWidget;
                                                            if (constraintWidget2 instanceof Barrier) {
                                                            }
                                                            linearSystem2.f(solverVariable4, solverVariable6, constraintAnchor.c(), i19);
                                                            linearSystem2.g(solverVariable5, solverVariable3, -constraintAnchor2.c(), i19);
                                                            i12 = i19;
                                                        }
                                                        i19 = 6;
                                                        linearSystem2.f(solverVariable4, solverVariable6, constraintAnchor.c(), i19);
                                                        linearSystem2.g(solverVariable5, solverVariable3, -constraintAnchor2.c(), i19);
                                                        i12 = i19;
                                                    }
                                                    i19 = i12;
                                                    linearSystem2.f(solverVariable4, solverVariable6, constraintAnchor.c(), i19);
                                                    linearSystem2.g(solverVariable5, solverVariable3, -constraintAnchor2.c(), i19);
                                                    i12 = i19;
                                                } else {
                                                    constraintWidget2 = constraintWidget;
                                                }
                                                if (z3 || !z10 || (constraintWidget4 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                                    i16 = i12;
                                                    iMax = i13;
                                                } else {
                                                    i16 = 6;
                                                    iMax = 6;
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    if (z15 && (!z9 || z4)) {
                                                        if (constraintWidget4 != constraintWidget6 && constraintWidget2 != constraintWidget6) {
                                                            i27 = iMax;
                                                        }
                                                        if ((constraintWidget4 instanceof Guideline) || (constraintWidget2 instanceof Guideline)) {
                                                            i27 = 5;
                                                        }
                                                        if ((constraintWidget4 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                                            i27 = 5;
                                                        }
                                                        if (z9) {
                                                            i18 = 5;
                                                        } else {
                                                            i18 = i27;
                                                        }
                                                        iMax = Math.max(i18, iMax);
                                                    }
                                                    if (z3) {
                                                        iMin2 = Math.min(i16, iMax);
                                                        if (z7 || z9 || !(constraintWidget4 == constraintWidget6 || constraintWidget2 == constraintWidget6)) {
                                                            i17 = iMin2;
                                                        } else {
                                                            i17 = 4;
                                                        }
                                                    } else {
                                                        i17 = iMax;
                                                    }
                                                    linearSystem2.e(solverVariable4, solverVariable6, constraintAnchor.c(), i17);
                                                    linearSystem2.e(solverVariable5, solverVariable3, -constraintAnchor2.c(), i17);
                                                }
                                                if (z3) {
                                                    if (solverVariable == solverVariable6) {
                                                        iC = constraintAnchor.c();
                                                    } else {
                                                        iC = 0;
                                                    }
                                                    if (solverVariable6 != solverVariable) {
                                                        linearSystem2.f(solverVariable4, solverVariable, iC, 5);
                                                    }
                                                }
                                                if (z3 && z18 && i4 == 0 && i11 == 0) {
                                                    if (z18 || i14 != 3) {
                                                        linearSystem2.f(solverVariable5, solverVariable4, 0, 5);
                                                    } else {
                                                        linearSystem2.f(solverVariable5, solverVariable4, 0, 8);
                                                    }
                                                }
                                            } else {
                                                z13 = true;
                                                z14 = true;
                                            }
                                            z15 = false;
                                            i12 = 5;
                                            i13 = 4;
                                            if (z13) {
                                                z16 = z13;
                                                z17 = true;
                                            } else {
                                                z16 = z13;
                                                z17 = true;
                                            }
                                            if (z14) {
                                                if (this.X == 8) {
                                                    i27 = 4;
                                                }
                                                int i210 = i26;
                                                solverVariable6 = solverVariableJ5;
                                                int i211 = i27;
                                                solverVariable4 = solverVariableJ3;
                                                solverVariable5 = solverVariableJ4;
                                                constraintWidget = constraintWidget5;
                                                i14 = i210;
                                                linearSystem2 = linearSystem;
                                                i15 = 8;
                                                linearSystem2.b(solverVariable4, solverVariable6, constraintAnchor.c(), f, solverVariable3, solverVariable5, constraintAnchor2.c(), i211);
                                            } else {
                                                linearSystem2 = linearSystem;
                                                i14 = i26;
                                                constraintWidget = constraintWidget5;
                                                solverVariable4 = solverVariableJ3;
                                                solverVariable5 = solverVariableJ4;
                                                solverVariable6 = solverVariableJ5;
                                                i15 = 8;
                                            }
                                            if (this.X == i15) {
                                                return;
                                            }
                                            if (z16) {
                                                if (z3) {
                                                    constraintWidget2 = constraintWidget;
                                                    i19 = i12;
                                                } else {
                                                    constraintWidget2 = constraintWidget;
                                                    i19 = i12;
                                                }
                                                linearSystem2.f(solverVariable4, solverVariable6, constraintAnchor.c(), i19);
                                                linearSystem2.g(solverVariable5, solverVariable3, -constraintAnchor2.c(), i19);
                                                i12 = i19;
                                            } else {
                                                constraintWidget2 = constraintWidget;
                                            }
                                            if (z3) {
                                                i16 = i12;
                                                iMax = i13;
                                            } else {
                                                i16 = i12;
                                                iMax = i13;
                                            }
                                            if (z17) {
                                                if (z15) {
                                                    if (constraintWidget4 != constraintWidget6) {
                                                        i27 = iMax;
                                                    }
                                                    if (constraintWidget4 instanceof Guideline) {
                                                        i27 = 5;
                                                    } else {
                                                        i27 = 5;
                                                    }
                                                    if (constraintWidget4 instanceof Barrier) {
                                                        i27 = 5;
                                                    } else {
                                                        i27 = 5;
                                                    }
                                                    if (z9) {
                                                        i18 = 5;
                                                    } else {
                                                        i18 = i27;
                                                    }
                                                    iMax = Math.max(i18, iMax);
                                                }
                                                if (z3) {
                                                    iMin2 = Math.min(i16, iMax);
                                                    if (z7) {
                                                        i17 = iMin2;
                                                    } else {
                                                        i17 = iMin2;
                                                    }
                                                } else {
                                                    i17 = iMax;
                                                }
                                                linearSystem2.e(solverVariable4, solverVariable6, constraintAnchor.c(), i17);
                                                linearSystem2.e(solverVariable5, solverVariable3, -constraintAnchor2.c(), i17);
                                            }
                                            if (z3) {
                                                if (solverVariable == solverVariable6) {
                                                    iC = constraintAnchor.c();
                                                } else {
                                                    iC = 0;
                                                }
                                                if (solverVariable6 != solverVariable) {
                                                    linearSystem2.f(solverVariable4, solverVariable, iC, 5);
                                                }
                                            }
                                            if (z3) {
                                                if (z18) {
                                                    linearSystem2.f(solverVariable5, solverVariable4, 0, 5);
                                                } else {
                                                    linearSystem2.f(solverVariable5, solverVariable4, 0, 5);
                                                }
                                            }
                                        }
                                    } else {
                                        solverVariable3 = solverVariableJ6;
                                        linearSystem2.e(solverVariableJ4, solverVariable3, -constraintAnchor2.c(), 8);
                                        if (z3) {
                                            linearSystem2.f(solverVariableJ3, solverVariable, 0, 5);
                                        }
                                    }
                                    constraintAnchor2 = constraintAnchor2;
                                    solverVariable5 = solverVariableJ4;
                                    z12 = z5;
                                } else {
                                    constraintAnchor2 = constraintAnchor2;
                                    solverVariable5 = solverVariableJ4;
                                    z12 = z5;
                                    solverVariable3 = solverVariableJ6;
                                }
                                if (z3 && z12) {
                                    int iC2 = constraintAnchor2.d != null ? constraintAnchor2.c() : 0;
                                    if (solverVariable3 != solverVariable2) {
                                        linearSystem2.f(solverVariable2, solverVariable5, iC2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            int iMax2 = Math.max(i22, iMin);
                            if (i23 > 0) {
                                iMax2 = Math.min(i23, iMax2);
                            }
                            linearSystem2.e(solverVariableJ4, solverVariableJ3, iMax2, 8);
                            i11 = i22;
                            z18 = false;
                            if (z11) {
                            }
                            boolean z110 = z5;
                            if (i25 >= 2) {
                            }
                        }
                        if (z6) {
                            linearSystem2.e(solverVariableJ4, solverVariableJ3, 0, 3);
                            if (i4 > 0) {
                                linearSystem2.f(solverVariableJ4, solverVariableJ3, i4, i10);
                            }
                            if (i5 < Integer.MAX_VALUE) {
                                linearSystem2.g(solverVariableJ4, solverVariableJ3, i5, i10);
                            }
                        } else {
                            linearSystem2.e(solverVariableJ4, solverVariableJ3, iMin, i10);
                        }
                        z5 = z5;
                        i11 = i22;
                        if (z11) {
                        }
                        boolean z111 = z5;
                        if (i25 >= 2) {
                        }
                    }

                    public final void e(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
                        boolean z2;
                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.g0;
                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.i0;
                        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.h0;
                        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.X;
                        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f3943Y;
                        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.Z;
                        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.e0;
                        if (type == type3) {
                            if (type2 != type3) {
                                if (type2 == type6 || type2 == type8) {
                                    e(type6, constraintWidget, type2, 0);
                                    e(type8, constraintWidget, type2, 0);
                                    h(type3).a(constraintWidget.h(type2), 0);
                                    return;
                                } else {
                                    if (type2 == type7 || type2 == type9) {
                                        e(type7, constraintWidget, type2, 0);
                                        e(type9, constraintWidget, type2, 0);
                                        h(type3).a(constraintWidget.h(type2), 0);
                                        return;
                                    }
                                    return;
                                }
                            }
                            ConstraintAnchor constraintAnchorH = h(type6);
                            ConstraintAnchor constraintAnchorH2 = h(type8);
                            ConstraintAnchor constraintAnchorH3 = h(type7);
                            ConstraintAnchor constraintAnchorH4 = h(type9);
                            boolean z3 = true;
                            if ((constraintAnchorH == null || !constraintAnchorH.f()) && (constraintAnchorH2 == null || !constraintAnchorH2.f())) {
                                e(type6, constraintWidget, type6, 0);
                                e(type8, constraintWidget, type8, 0);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((constraintAnchorH3 == null || !constraintAnchorH3.f()) && (constraintAnchorH4 == null || !constraintAnchorH4.f())) {
                                e(type7, constraintWidget, type7, 0);
                                e(type9, constraintWidget, type9, 0);
                            } else {
                                z3 = false;
                            }
                            if (z2 && z3) {
                                h(type3).a(constraintWidget.h(type3), 0);
                                return;
                            } else if (z2) {
                                h(type5).a(constraintWidget.h(type5), 0);
                                return;
                            } else {
                                if (z3) {
                                    h(type4).a(constraintWidget.h(type4), 0);
                                    return;
                                }
                                return;
                            }
                        }
                        if (type == type5 && (type2 == type6 || type2 == type8)) {
                            ConstraintAnchor constraintAnchorH5 = h(type6);
                            ConstraintAnchor constraintAnchorH6 = constraintWidget.h(type2);
                            ConstraintAnchor constraintAnchorH7 = h(type8);
                            constraintAnchorH5.a(constraintAnchorH6, 0);
                            constraintAnchorH7.a(constraintAnchorH6, 0);
                            h(type5).a(constraintAnchorH6, 0);
                            return;
                        }
                        if (type == type4 && (type2 == type7 || type2 == type9)) {
                            ConstraintAnchor constraintAnchorH8 = constraintWidget.h(type2);
                            h(type7).a(constraintAnchorH8, 0);
                            h(type9).a(constraintAnchorH8, 0);
                            h(type4).a(constraintAnchorH8, 0);
                            return;
                        }
                        if (type == type5 && type2 == type5) {
                            h(type6).a(constraintWidget.h(type6), 0);
                            h(type8).a(constraintWidget.h(type8), 0);
                            h(type5).a(constraintWidget.h(type2), 0);
                            return;
                        }
                        if (type == type4 && type2 == type4) {
                            h(type7).a(constraintWidget.h(type7), 0);
                            h(type9).a(constraintWidget.h(type9), 0);
                            h(type4).a(constraintWidget.h(type2), 0);
                            return;
                        }
                        ConstraintAnchor constraintAnchorH9 = h(type);
                        ConstraintAnchor constraintAnchorH10 = constraintWidget.h(type2);
                        if (constraintAnchorH9.g(constraintAnchorH10)) {
                            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f0;
                            if (type == type10) {
                                ConstraintAnchor constraintAnchorH11 = h(type7);
                                ConstraintAnchor constraintAnchorH12 = h(type9);
                                if (constraintAnchorH11 != null) {
                                    constraintAnchorH11.h();
                                }
                                if (constraintAnchorH12 != null) {
                                    constraintAnchorH12.h();
                                }
                                i2 = 0;
                            } else if (type == type7 || type == type9) {
                                ConstraintAnchor constraintAnchorH13 = h(type10);
                                if (constraintAnchorH13 != null) {
                                    constraintAnchorH13.h();
                                }
                                ConstraintAnchor constraintAnchorH14 = h(type3);
                                if (constraintAnchorH14.d != constraintAnchorH10) {
                                    constraintAnchorH14.h();
                                }
                                ConstraintAnchor constraintAnchorD = h(type).d();
                                ConstraintAnchor constraintAnchorH15 = h(type4);
                                if (constraintAnchorH15.f()) {
                                    constraintAnchorD.h();
                                    constraintAnchorH15.h();
                                }
                            } else if (type == type6 || type == type8) {
                                ConstraintAnchor constraintAnchorH16 = h(type3);
                                if (constraintAnchorH16.d != constraintAnchorH10) {
                                    constraintAnchorH16.h();
                                }
                                ConstraintAnchor constraintAnchorD2 = h(type).d();
                                ConstraintAnchor constraintAnchorH17 = h(type5);
                                if (constraintAnchorH17.f()) {
                                    constraintAnchorD2.h();
                                    constraintAnchorH17.h();
                                }
                            }
                            constraintAnchorH9.a(constraintAnchorH10, i2);
                        }
                    }

                    public final void f(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
                        if (constraintAnchor.f3939b == this) {
                            e(constraintAnchor.f3940c, constraintAnchor2.f3939b, constraintAnchor2.f3940c, i2);
                        }
                    }

                    public final void g(LinearSystem linearSystem) {
                        linearSystem.j(this.y);
                        linearSystem.j(this.f3971z);
                        linearSystem.j(this.f3944A);
                        linearSystem.j(this.f3945B);
                        if (this.f3953R > 0) {
                            linearSystem.j(this.C);
                        }
                    }

                    public ConstraintAnchor h(ConstraintAnchor.Type type) {
                        switch (type.ordinal()) {
                            case 0:
                                return null;
                            case 1:
                                return this.y;
                            case 2:
                                return this.f3971z;
                            case 3:
                                return this.f3944A;
                            case 4:
                                return this.f3945B;
                            case 5:
                                return this.C;
                            case 6:
                                return this.f3947F;
                            case 7:
                                return this.D;
                            case 8:
                                return this.f3946E;
                            default:
                                throw new AssertionError(type.name());
                        }
                    }

                    public final DimensionBehaviour i(int i2) {
                        if (i2 == 0) {
                            return this.f3949J[0];
                        }
                        if (i2 == 1) {
                            return this.f3949J[1];
                        }
                        return null;
                    }

                    public final int j() {
                        if (this.X == 8) {
                            return 0;
                        }
                        return this.M;
                    }

                    public final ConstraintWidget k(int i2) {
                        ConstraintAnchor constraintAnchor;
                        ConstraintAnchor constraintAnchor2;
                        if (i2 != 0) {
                            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.f3945B).d) != null && constraintAnchor2.d == constraintAnchor) {
                                return constraintAnchor2.f3939b;
                            }
                            return null;
                        }
                        ConstraintAnchor constraintAnchor3 = this.f3944A;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
                        if (constraintAnchor4 == null || constraintAnchor4.d != constraintAnchor3) {
                            return null;
                        }
                        return constraintAnchor4.f3939b;
                    }

                    public final ConstraintWidget l(int i2) {
                        ConstraintAnchor constraintAnchor;
                        ConstraintAnchor constraintAnchor2;
                        if (i2 != 0) {
                            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.f3971z).d) != null && constraintAnchor2.d == constraintAnchor) {
                                return constraintAnchor2.f3939b;
                            }
                            return null;
                        }
                        ConstraintAnchor constraintAnchor3 = this.y;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
                        if (constraintAnchor4 == null || constraintAnchor4.d != constraintAnchor3) {
                            return null;
                        }
                        return constraintAnchor4.f3939b;
                    }

                    public final int m() {
                        if (this.X == 8) {
                            return 0;
                        }
                        return this.L;
                    }

                    public final int n() {
                        ConstraintWidget constraintWidget = this.K;
                        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f3951P : ((ConstraintWidgetContainer) constraintWidget).k0 + this.f3951P;
                    }

                    public final int o() {
                        ConstraintWidget constraintWidget = this.K;
                        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f3952Q : ((ConstraintWidgetContainer) constraintWidget).l0 + this.f3952Q;
                    }

                    public final void p(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
                        h(type).b(constraintWidget.h(type2), i2, i3, true);
                    }

                    public final boolean q(int i2) {
                        ConstraintAnchor constraintAnchor;
                        ConstraintAnchor constraintAnchor2;
                        int i3 = i2 * 2;
                        ConstraintAnchor[] constraintAnchorArr = this.G;
                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i3];
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
                        return (constraintAnchor4 == null || constraintAnchor4.d == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i3 + 1]).d) == null || constraintAnchor2.d != constraintAnchor) ? false : true;
                    }

                    public final boolean r() {
                        ConstraintAnchor constraintAnchor = this.y;
                        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                        if (constraintAnchor2 != null && constraintAnchor2.d == constraintAnchor) {
                            return true;
                        }
                        ConstraintAnchor constraintAnchor3 = this.f3944A;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
                        return constraintAnchor4 != null && constraintAnchor4.d == constraintAnchor3;
                    }

                    public final boolean s() {
                        ConstraintAnchor constraintAnchor = this.f3971z;
                        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                        if (constraintAnchor2 != null && constraintAnchor2.d == constraintAnchor) {
                            return true;
                        }
                        ConstraintAnchor constraintAnchor3 = this.f3945B;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
                        return constraintAnchor4 != null && constraintAnchor4.d == constraintAnchor3;
                    }

                    public void t() {
                        this.y.h();
                        this.f3971z.h();
                        this.f3944A.h();
                        this.f3945B.h();
                        this.C.h();
                        this.D.h();
                        this.f3946E.h();
                        this.f3947F.h();
                        this.K = null;
                        this.v = 0.0f;
                        this.L = 0;
                        this.M = 0;
                        this.f3950N = 0.0f;
                        this.O = -1;
                        this.f3951P = 0;
                        this.f3952Q = 0;
                        this.f3953R = 0;
                        this.S = 0;
                        this.T = 0;
                        this.f3954U = 0.5f;
                        this.f3955V = 0.5f;
                        DimensionBehaviour[] dimensionBehaviourArr = this.f3949J;
                        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.X;
                        dimensionBehaviourArr[0] = dimensionBehaviour;
                        dimensionBehaviourArr[1] = dimensionBehaviour;
                        this.W = null;
                        this.X = 0;
                        this.Z = 0;
                        this.a0 = 0;
                        float[] fArr = this.f3959b0;
                        fArr[0] = -1.0f;
                        fArr[1] = -1.0f;
                        this.f3964h = -1;
                        this.f3965i = -1;
                        int[] iArr = this.f3969u;
                        iArr[0] = Integer.MAX_VALUE;
                        iArr[1] = Integer.MAX_VALUE;
                        this.j = 0;
                        this.k = 0;
                        this.o = 1.0f;
                        this.r = 1.0f;
                        this.f3967n = Integer.MAX_VALUE;
                        this.q = Integer.MAX_VALUE;
                        this.m = 0;
                        this.f3968p = 0;
                        this.s = -1;
                        this.t = 1.0f;
                        boolean[] zArr = this.f;
                        zArr[0] = true;
                        zArr[1] = true;
                        boolean[] zArr2 = this.f3948I;
                        zArr2[0] = false;
                        zArr2[1] = false;
                    }

                    public String toString() {
                        StringBuilder sbW = a.w("");
                        sbW.append(this.f3956Y != null ? a.r(new StringBuilder("id: "), this.f3956Y, " ") : "");
                        sbW.append("(");
                        sbW.append(this.f3951P);
                        sbW.append(", ");
                        sbW.append(this.f3952Q);
                        sbW.append(") - (");
                        sbW.append(this.L);
                        sbW.append(" x ");
                        return a.i(this.M, ")", sbW);
                    }

                    public final void u() {
                        ConstraintWidget constraintWidget = this.K;
                        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
                            ((ConstraintWidgetContainer) constraintWidget).getClass();
                        }
                        ArrayList arrayList = this.H;
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((ConstraintAnchor) arrayList.get(i2)).h();
                        }
                    }

                    public void v(Cache cache) {
                        this.y.i();
                        this.f3971z.i();
                        this.f3944A.i();
                        this.f3945B.i();
                        this.C.i();
                        this.f3947F.i();
                        this.D.i();
                        this.f3946E.i();
                    }

                    public final void w(int i2) {
                        this.M = i2;
                        int i3 = this.T;
                        if (i2 < i3) {
                            this.M = i3;
                        }
                    }

                    public final void x(DimensionBehaviour dimensionBehaviour) {
                        this.f3949J[0] = dimensionBehaviour;
                    }

                    public final void y(DimensionBehaviour dimensionBehaviour) {
                        this.f3949J[1] = dimensionBehaviour;
                    }

                    public final void z(int i2) {
                        this.L = i2;
                        int i3 = this.S;
                        if (i2 < i3) {
                            this.L = i3;
                        }
                    }
                }
