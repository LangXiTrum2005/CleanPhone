package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    public final BasicMeasure f0;
    public final DependencyGraph g0;
    public BasicMeasure.Measurer h0;
    public boolean i0;
    public final LinearSystem j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public ChainHead[] o0;
    public ChainHead[] p0;
    public int q0;
    public boolean r0;
    public boolean s0;

    public ConstraintWidgetContainer() {
        this.e0 = new ArrayList();
        this.f0 = new BasicMeasure(this);
        DependencyGraph dependencyGraph = new DependencyGraph();
        dependencyGraph.f3997b = true;
        dependencyGraph.f3998c = true;
        dependencyGraph.f3999e = new ArrayList();
        new ArrayList();
        dependencyGraph.f = null;
        dependencyGraph.g = new BasicMeasure.Measure();
        dependencyGraph.f4000h = new ArrayList();
        dependencyGraph.f3996a = this;
        dependencyGraph.d = this;
        this.g0 = dependencyGraph;
        this.h0 = null;
        this.i0 = false;
        this.j0 = new LinearSystem();
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new ChainHead[4];
        this.p0 = new ChainHead[4];
        this.q0 = 263;
        this.r0 = false;
        this.s0 = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void A(boolean z2, boolean z3) {
        super.A(z2, z3);
        int size = this.e0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.e0.get(i2)).A(z2, z3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[LOOP:3: B:49:0x00da->B:50:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1 A[LOOP:5: B:52:0x00ef->B:53:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7 A[PHI: r0 r14
  0x01d7: PHI (r0v18 ??) = (r0v17 ??), (r0v20 ??), (r0v20 ??), (r0v20 ??) binds: [B:79:0x019d, B:88:0x01c1, B:89:0x01c3, B:91:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01d7: PHI (r14v5 boolean) = (r14v4 boolean), (r14v7 boolean), (r14v7 boolean), (r14v7 boolean) binds: [B:79:0x019d, B:88:0x01c1, B:89:0x01c3, B:91:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v31 */
    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer
    public final void C() {
        boolean z2;
        ?? r17;
        ?? r13;
        boolean[] zArr;
        int i2;
        ?? r0;
        int iMax;
        int iM;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3;
        ?? r1;
        int iMax2;
        boolean z4;
        ?? r2;
        ?? r14;
        ?? r3;
        ?? r4;
        ?? r5;
        int size;
        int i3;
        ?? r15;
        boolean z5 = false;
        this.f3951P = 0;
        this.f3952Q = 0;
        int iMax3 = Math.max(0, m());
        int iMax4 = Math.max(0, j());
        this.r0 = false;
        this.s0 = false;
        int i4 = this.q0;
        boolean z6 = true;
        boolean z7 = ((i4 & 64) == 64) || (i4 & 128) == 128;
        LinearSystem linearSystem = this.j0;
        linearSystem.getClass();
        linearSystem.f = false;
        if (this.q0 != 0 && z7) {
            linearSystem.f = true;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f3949J;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ArrayList arrayList = this.e0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f3974Y;
        boolean z8 = dimensionBehaviour3 == dimensionBehaviour4 || dimensionBehaviour2 == dimensionBehaviour4;
        this.m0 = 0;
        this.n0 = 0;
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.e0.get(i5);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).C();
            }
        }
        int i6 = 0;
        boolean z9 = false;
        ?? r16 = 1;
        boolean z10 = z8;
        while (r16 != 0) {
            int i7 = i6 + 1;
            try {
                linearSystem.s();
                this.m0 = z5 ? 1 : 0;
                this.n0 = z5 ? 1 : 0;
                g(linearSystem);
                int i8 = z5 ? 1 : 0;
                while (i8 < size2) {
                    z2 = z5;
                    try {
                        ((ConstraintWidget) this.e0.get(i8)).g(linearSystem);
                        i8++;
                        z5 = z2 ? 1 : 0;
                    } catch (Exception e2) {
                        e = e2;
                        r15 = r16;
                        e.printStackTrace();
                        r17 = z6;
                        System.out.println("EXCEPTION : " + e);
                        r13 = r15;
                        zArr = Optimizer.f3985a;
                        if (r13 != 0) {
                            zArr[2] = z2;
                            B(linearSystem);
                            size = this.e0.size();
                            for (i3 = z2 ? 1 : 0; i3 < size; i3++) {
                                ((ConstraintWidget) this.e0.get(i3)).B(linearSystem);
                            }
                        } else {
                            B(linearSystem);
                            for (i2 = z2 ? 1 : 0; i2 < size2; i2++) {
                                ((ConstraintWidget) this.e0.get(i2)).B(linearSystem);
                            }
                        }
                        if (z10 == 0) {
                            r0 = z2 ? 1 : 0;
                        } else {
                            r0 = z2 ? 1 : 0;
                        }
                        r0 = r5;
                        r0 = r5;
                        iMax = Math.max(this.S, m());
                        iM = m();
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.X;
                        r1 = r0;
                        z3 = z9;
                        if (iMax > iM) {
                            z(iMax);
                            this.f3949J[z2 ? 1 : 0] = dimensionBehaviour;
                            ?? r6 = r17;
                            z3 = r6 == true ? 1 : 0;
                            r1 = r6;
                        }
                        iMax2 = Math.max(this.T, j());
                        r2 = r1;
                        z4 = z3;
                        if (iMax2 > j()) {
                            w(iMax2);
                            this.f3949J[r17] = dimensionBehaviour;
                            r4 = r17;
                            z4 = r4 == true ? 1 : 0;
                        }
                        if (z4) {
                            r2 = r4;
                            r14 = r2;
                        } else {
                            if (this.f3949J[z2 ? 1 : 0] == dimensionBehaviour4) {
                                r2 = r4;
                                r3 = r17;
                                r2 = r2;
                                z4 = z4;
                            } else {
                                r2 = r4;
                                r3 = r17;
                                r2 = r2;
                                z4 = z4;
                            }
                            if (this.f3949J[r3] == dimensionBehaviour4) {
                                r2 = r4;
                                r14 = r2;
                            } else {
                                r2 = r4;
                                r14 = r2;
                            }
                        }
                        i6 = i7;
                        z5 = z2 ? 1 : 0;
                        z10 = z10;
                        z6 = true;
                        r16 = r14;
                        z9 = z4;
                    }
                }
                z2 = z5;
                E(linearSystem);
                try {
                    linearSystem.o();
                    boolean z11 = z6;
                    r17 = z11 ? 1 : 0;
                    r13 = z11;
                } catch (Exception e3) {
                    e = e3;
                    r15 = z6;
                    e.printStackTrace();
                    r17 = z6;
                    System.out.println("EXCEPTION : " + e);
                    r13 = r15;
                }
            } catch (Exception e4) {
                e = e4;
                z2 = z5 ? 1 : 0;
                r15 = r16;
            }
            zArr = Optimizer.f3985a;
            if (r13 != 0) {
                zArr[2] = z2;
                B(linearSystem);
                size = this.e0.size();
                while (i3 < size) {
                    ((ConstraintWidget) this.e0.get(i3)).B(linearSystem);
                }
            } else {
                B(linearSystem);
                while (i2 < size2) {
                    ((ConstraintWidget) this.e0.get(i2)).B(linearSystem);
                }
            }
            if (z10 == 0 && i7 < 8 && zArr[2]) {
                int i9 = z2 ? 1 : 0;
                int iMax5 = i9;
                int iMax6 = iMax5;
                while (i9 < size2) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget) this.e0.get(i9);
                    iMax5 = Math.max(iMax5, constraintWidget2.m() + constraintWidget2.f3951P);
                    iMax6 = Math.max(iMax6, constraintWidget2.j() + constraintWidget2.f3952Q);
                    i9++;
                }
                int iMax7 = Math.max(this.S, iMax5);
                int iMax8 = Math.max(this.T, iMax6);
                if (dimensionBehaviour3 != dimensionBehaviour4 || m() >= iMax7) {
                    r0 = z2 ? 1 : 0;
                    z9 = z9;
                } else {
                    z(iMax7);
                    this.f3949J[z2 ? 1 : 0] = dimensionBehaviour4;
                    r5 = r17;
                    z9 = r5 == true ? 1 : 0;
                }
                if (dimensionBehaviour2 == dimensionBehaviour4 && j() < iMax8) {
                    r0 = r5;
                    w(iMax8);
                    this.f3949J[r17] = dimensionBehaviour4;
                    r0 = r17;
                    z9 = r0 == true ? 1 : 0;
                }
            } else {
                r0 = z2 ? 1 : 0;
            }
            r0 = r5;
            r0 = r5;
            iMax = Math.max(this.S, m());
            iM = m();
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.X;
            r1 = r0;
            z3 = z9;
            if (iMax > iM) {
                z(iMax);
                this.f3949J[z2 ? 1 : 0] = dimensionBehaviour;
                ?? r7 = r17;
                z3 = r7 == true ? 1 : 0;
                r1 = r7;
            }
            iMax2 = Math.max(this.T, j());
            r2 = r1;
            z4 = z3;
            if (iMax2 > j()) {
                w(iMax2);
                this.f3949J[r17] = dimensionBehaviour;
                r4 = r17;
                z4 = r4 == true ? 1 : 0;
            }
            if (z4) {
                r2 = r4;
                r14 = r2;
            } else {
                if (this.f3949J[z2 ? 1 : 0] == dimensionBehaviour4 || iMax3 <= 0 || m() <= iMax3) {
                    r2 = r4;
                    r3 = r17;
                    r2 = r2;
                    z4 = z4;
                } else {
                    ?? r8 = r17;
                    this.r0 = r8;
                    this.f3949J[z2 ? 1 : 0] = dimensionBehaviour;
                    z(iMax3);
                    boolean z12 = r8 == true ? 1 : 0;
                    z4 = z12 ? 1 : 0;
                    r2 = z12;
                    r3 = r8;
                }
                if (this.f3949J[r3] == dimensionBehaviour4 || iMax4 <= 0 || j() <= iMax4) {
                    r2 = r4;
                    r14 = r2;
                } else {
                    this.s0 = r3;
                    this.f3949J[r3] = dimensionBehaviour;
                    w(iMax4);
                    r14 = 1;
                    z4 = true;
                }
            }
            i6 = i7;
            z5 = z2 ? 1 : 0;
            z10 = z10;
            z6 = true;
            r16 = r14;
            z9 = z4;
        }
        boolean z13 = z5 ? 1 : 0;
        this.e0 = arrayList;
        if (z9) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f3949J;
            dimensionBehaviourArr2[z13 ? 1 : 0] = dimensionBehaviour3;
            dimensionBehaviourArr2[1] = dimensionBehaviour2;
        }
        v(linearSystem.k);
    }

    public final void D(ConstraintWidget constraintWidget, int i2) {
        if (i2 == 0) {
            int i3 = this.m0 + 1;
            ChainHead[] chainHeadArr = this.p0;
            if (i3 >= chainHeadArr.length) {
                this.p0 = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            ChainHead[] chainHeadArr2 = this.p0;
            int i4 = this.m0;
            chainHeadArr2[i4] = new ChainHead(constraintWidget, 0, this.i0);
            this.m0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.n0 + 1;
            ChainHead[] chainHeadArr3 = this.o0;
            if (i5 >= chainHeadArr3.length) {
                this.o0 = (ChainHead[]) Arrays.copyOf(chainHeadArr3, chainHeadArr3.length * 2);
            }
            ChainHead[] chainHeadArr4 = this.o0;
            int i6 = this.n0;
            chainHeadArr4[i6] = new ChainHead(constraintWidget, 1, this.i0);
            this.n0 = i6 + 1;
        }
    }

    public final void E(LinearSystem linearSystem) {
        b(linearSystem);
        int size = this.e0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.e0.get(i2);
            boolean[] zArr = constraintWidget.f3948I;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.e0.get(i3);
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    for (int i4 = 0; i4 < barrier.f0; i4++) {
                        ConstraintWidget constraintWidget3 = barrier.e0[i4];
                        int i5 = barrier.g0;
                        if (i5 == 0 || i5 == 1) {
                            constraintWidget3.f3948I[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            constraintWidget3.f3948I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.e0.get(i6);
            constraintWidget4.getClass();
            if ((constraintWidget4 instanceof VirtualLayout) || (constraintWidget4 instanceof Guideline)) {
                constraintWidget4.b(linearSystem);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            ConstraintWidget constraintWidget5 = (ConstraintWidget) this.e0.get(i7);
            boolean z3 = constraintWidget5 instanceof ConstraintWidgetContainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f3974Y;
            if (z3) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.f3949J;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.X;
                if (dimensionBehaviour2 == dimensionBehaviour) {
                    constraintWidget5.x(dimensionBehaviour4);
                }
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    constraintWidget5.y(dimensionBehaviour4);
                }
                constraintWidget5.b(linearSystem);
                if (dimensionBehaviour2 == dimensionBehaviour) {
                    constraintWidget5.x(dimensionBehaviour2);
                }
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    constraintWidget5.y(dimensionBehaviour3);
                }
            } else {
                constraintWidget5.f3964h = -1;
                constraintWidget5.f3965i = -1;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = this.f3949J[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.e0;
                if (dimensionBehaviour5 != dimensionBehaviour && constraintWidget5.f3949J[0] == dimensionBehaviour6) {
                    ConstraintAnchor constraintAnchor = constraintWidget5.y;
                    int i8 = constraintAnchor.f3941e;
                    int iM = m();
                    ConstraintAnchor constraintAnchor2 = constraintWidget5.f3944A;
                    int i9 = iM - constraintAnchor2.f3941e;
                    constraintAnchor.g = linearSystem.j(constraintAnchor);
                    constraintAnchor2.g = linearSystem.j(constraintAnchor2);
                    linearSystem.d(constraintAnchor.g, i8);
                    linearSystem.d(constraintAnchor2.g, i9);
                    constraintWidget5.f3964h = 2;
                    constraintWidget5.f3951P = i8;
                    int i10 = i9 - i8;
                    constraintWidget5.L = i10;
                    int i11 = constraintWidget5.S;
                    if (i10 < i11) {
                        constraintWidget5.L = i11;
                    }
                }
                if (this.f3949J[1] != dimensionBehaviour && constraintWidget5.f3949J[1] == dimensionBehaviour6) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget5.f3971z;
                    int i12 = constraintAnchor3.f3941e;
                    int iJ = j();
                    ConstraintAnchor constraintAnchor4 = constraintWidget5.f3945B;
                    int i13 = iJ - constraintAnchor4.f3941e;
                    constraintAnchor3.g = linearSystem.j(constraintAnchor3);
                    constraintAnchor4.g = linearSystem.j(constraintAnchor4);
                    linearSystem.d(constraintAnchor3.g, i12);
                    linearSystem.d(constraintAnchor4.g, i13);
                    if (constraintWidget5.f3953R > 0 || constraintWidget5.X == 8) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget5.C;
                        SolverVariable solverVariableJ = linearSystem.j(constraintAnchor5);
                        constraintAnchor5.g = solverVariableJ;
                        linearSystem.d(solverVariableJ, constraintWidget5.f3953R + i12);
                    }
                    constraintWidget5.f3965i = 2;
                    constraintWidget5.f3952Q = i12;
                    int i14 = i13 - i12;
                    constraintWidget5.M = i14;
                    int i15 = constraintWidget5.T;
                    if (i14 < i15) {
                        constraintWidget5.M = i15;
                    }
                }
                if (!(constraintWidget5 instanceof VirtualLayout) && !(constraintWidget5 instanceof Guideline)) {
                    constraintWidget5.b(linearSystem);
                }
            }
        }
        if (this.m0 > 0) {
            Chain.a(this, linearSystem, 0);
        }
        if (this.n0 > 0) {
            Chain.a(this, linearSystem, 1);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void t() {
        this.j0.s();
        this.k0 = 0;
        this.l0 = 0;
        super.t();
    }
}
