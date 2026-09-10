package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;

/* JADX INFO: loaded from: classes.dex */
public class VerticalWidgetRun extends WidgetRun {
    public final DependencyNode k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BaselineDimensionDependency f4012l;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4013a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f4013a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4013a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4013a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.f4012l = null;
        this.f4018h.f4004e = DependencyNode.Type.g0;
        this.f4019i.f4004e = DependencyNode.Type.h0;
        dependencyNode.f4004e = DependencyNode.Type.i0;
        this.f = 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        float f;
        float f2;
        float f3;
        int i2;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f4015b;
            l(constraintWidget.f3971z, constraintWidget.f3945B, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.f4017e;
        boolean z2 = dimensionDependency.f4003c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
        if (z2 && !dimensionDependency.j && this.d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f4015b;
            int i3 = constraintWidget2.k;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.K;
                if (constraintWidget3 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget3.f3963e.f4017e;
                    if (dimensionDependency2.j) {
                        dimensionDependency.d((int) ((dimensionDependency2.g * constraintWidget2.r) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                DimensionDependency dimensionDependency3 = constraintWidget2.d.f4017e;
                if (dimensionDependency3.j) {
                    int i4 = constraintWidget2.O;
                    if (i4 != -1) {
                        if (i4 == 0) {
                            f3 = dimensionDependency3.g * constraintWidget2.f3950N;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i4 != 1) {
                            i2 = 0;
                        } else {
                            f = dimensionDependency3.g;
                            f2 = constraintWidget2.f3950N;
                        }
                        dimensionDependency.d(i2);
                    } else {
                        f = dimensionDependency3.g;
                        f2 = constraintWidget2.f3950N;
                    }
                    f3 = f / f2;
                    i2 = (int) (f3 + 0.5f);
                    dimensionDependency.d(i2);
                }
            }
        }
        DependencyNode dependencyNode = this.f4018h;
        if (dependencyNode.f4003c) {
            DependencyNode dependencyNode2 = this.f4019i;
            if (dependencyNode2.f4003c) {
                if (dependencyNode.j && dependencyNode2.j && dimensionDependency.j) {
                    return;
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f4015b;
                    if (constraintWidget4.j == 0 && !constraintWidget4.s()) {
                        DependencyNode dependencyNode3 = (DependencyNode) dependencyNode.f4007l.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) dependencyNode2.f4007l.get(0);
                        int i5 = dependencyNode3.g + dependencyNode.f;
                        int i6 = dependencyNode4.g + dependencyNode2.f;
                        dependencyNode.d(i5);
                        dependencyNode2.d(i6);
                        dimensionDependency.d(i6 - i5);
                        return;
                    }
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour && this.f4014a == 1 && dependencyNode.f4007l.size() > 0 && dependencyNode2.f4007l.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) dependencyNode.f4007l.get(0);
                    int i7 = (((DependencyNode) dependencyNode2.f4007l.get(0)).g + dependencyNode2.f) - (dependencyNode5.g + dependencyNode.f);
                    int i8 = dimensionDependency.m;
                    if (i7 < i8) {
                        dimensionDependency.d(i7);
                    } else {
                        dimensionDependency.d(i8);
                    }
                }
                if (dimensionDependency.j && dependencyNode.f4007l.size() > 0 && dependencyNode2.f4007l.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) dependencyNode.f4007l.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) dependencyNode2.f4007l.get(0);
                    int i9 = dependencyNode6.g;
                    int i10 = dependencyNode.f + i9;
                    int i11 = dependencyNode7.g;
                    int i12 = dependencyNode2.f + i11;
                    float f4 = this.f4015b.f3955V;
                    if (dependencyNode6 == dependencyNode7) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    dependencyNode.d((int) ((((i11 - i9) - dimensionDependency.g) * f4) + i9 + 0.5f));
                    dependencyNode2.d(dependencyNode.g + dimensionDependency.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f4015b;
        boolean z2 = constraintWidget5.f3957a;
        DimensionDependency dimensionDependency = this.f4017e;
        if (z2) {
            dimensionDependency.d(constraintWidget5.j());
        }
        boolean z3 = dimensionDependency.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.X;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.Z;
        DependencyNode dependencyNode = this.f4019i;
        DependencyNode dependencyNode2 = this.f4018h;
        if (!z3) {
            ConstraintWidget constraintWidget6 = this.f4015b;
            this.d = constraintWidget6.f3949J[1];
            if (constraintWidget6.f3970w) {
                this.f4012l = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.f4015b.K) != null && constraintWidget4.f3949J[1] == dimensionBehaviour2) {
                    int iJ = (constraintWidget4.j() - this.f4015b.f3971z.c()) - this.f4015b.f3945B.c();
                    VerticalWidgetRun verticalWidgetRun = constraintWidget4.f3963e;
                    WidgetRun.b(dependencyNode2, verticalWidgetRun.f4018h, this.f4015b.f3971z.c());
                    WidgetRun.b(dependencyNode, verticalWidgetRun.f4019i, -this.f4015b.f3945B.c());
                    dimensionDependency.d(iJ);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    dimensionDependency.d(this.f4015b.j());
                }
            }
        } else if (this.d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.f4015b).K) != null && constraintWidget2.f3949J[1] == dimensionBehaviour2) {
            VerticalWidgetRun verticalWidgetRun2 = constraintWidget2.f3963e;
            WidgetRun.b(dependencyNode2, verticalWidgetRun2.f4018h, constraintWidget.f3971z.c());
            WidgetRun.b(dependencyNode, verticalWidgetRun2.f4019i, -this.f4015b.f3945B.c());
            return;
        }
        boolean z4 = dimensionDependency.j;
        DependencyNode dependencyNode3 = this.k;
        if (z4) {
            ConstraintWidget constraintWidget7 = this.f4015b;
            if (constraintWidget7.f3957a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.G;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                if (constraintAnchor2 != null && constraintAnchorArr[3].d != null) {
                    if (constraintWidget7.s()) {
                        dependencyNode2.f = this.f4015b.G[2].c();
                        dependencyNode.f = -this.f4015b.G[3].c();
                    } else {
                        DependencyNode dependencyNodeH = WidgetRun.h(this.f4015b.G[2]);
                        if (dependencyNodeH != null) {
                            WidgetRun.b(dependencyNode2, dependencyNodeH, this.f4015b.G[2].c());
                        }
                        DependencyNode dependencyNodeH2 = WidgetRun.h(this.f4015b.G[3]);
                        if (dependencyNodeH2 != null) {
                            WidgetRun.b(dependencyNode, dependencyNodeH2, -this.f4015b.G[3].c());
                        }
                        dependencyNode2.f4002b = true;
                        dependencyNode.f4002b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f4015b;
                    if (constraintWidget8.f3970w) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget8.f3953R);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.f4015b.G[2].c());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        ConstraintWidget constraintWidget9 = this.f4015b;
                        if (constraintWidget9.f3970w) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.f3953R);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.d != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.f4015b.G[3].c());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.g);
                    }
                    ConstraintWidget constraintWidget10 = this.f4015b;
                    if (constraintWidget10.f3970w) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.f3953R);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.d != null) {
                    DependencyNode dependencyNodeH5 = WidgetRun.h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH5, 0);
                        WidgetRun.b(dependencyNode2, dependencyNode3, -this.f4015b.f3953R);
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.K == null || constraintWidget7.h(ConstraintAnchor.Type.g0).d != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f4015b;
                WidgetRun.b(dependencyNode2, constraintWidget11.K.f3963e.f4018h, constraintWidget11.o());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                ConstraintWidget constraintWidget12 = this.f4015b;
                if (constraintWidget12.f3970w) {
                    WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget12.f3953R);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != dimensionBehaviour3) {
            dimensionDependency.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f4015b;
            int i2 = constraintWidget13.k;
            if (i2 == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.K;
                if (constraintWidget14 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget14.f3963e.f4017e;
                    dimensionDependency.f4007l.add(dimensionDependency2);
                    dimensionDependency2.k.add(dimensionDependency);
                    dimensionDependency.f4002b = true;
                    dimensionDependency.k.add(dependencyNode2);
                    dimensionDependency.k.add(dependencyNode);
                }
            } else if (i2 == 3 && !constraintWidget13.s()) {
                ConstraintWidget constraintWidget15 = this.f4015b;
                if (constraintWidget15.j != 3) {
                    DimensionDependency dimensionDependency3 = constraintWidget15.d.f4017e;
                    dimensionDependency.f4007l.add(dimensionDependency3);
                    dimensionDependency3.k.add(dimensionDependency);
                    dimensionDependency.f4002b = true;
                    dimensionDependency.k.add(dependencyNode2);
                    dimensionDependency.k.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f4015b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.G;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.d;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].d != null) {
            if (constraintWidget16.s()) {
                dependencyNode2.f = this.f4015b.G[2].c();
                dependencyNode.f = -this.f4015b.G[3].c();
            } else {
                DependencyNode dependencyNodeH6 = WidgetRun.h(this.f4015b.G[2]);
                DependencyNode dependencyNodeH7 = WidgetRun.h(this.f4015b.G[3]);
                dependencyNodeH6.b(this);
                dependencyNodeH7.b(this);
                this.j = WidgetRun.RunType.f4021Y;
            }
            if (this.f4015b.f3970w) {
                c(dependencyNode3, dependencyNode2, 1, this.f4012l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH8, this.f4015b.G[2].c());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                if (this.f4015b.f3970w) {
                    c(dependencyNode3, dependencyNode2, 1, this.f4012l);
                }
                if (this.d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f4015b;
                    if (constraintWidget17.f3950N > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget17.d;
                        if (horizontalWidgetRun.d == dimensionBehaviour3) {
                            horizontalWidgetRun.f4017e.k.add(dimensionDependency);
                            dimensionDependency.f4007l.add(this.f4015b.d.f4017e);
                            dimensionDependency.f4001a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.d != null) {
                DependencyNode dependencyNodeH9 = WidgetRun.h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    WidgetRun.b(dependencyNode, dependencyNodeH9, -this.f4015b.G[3].c());
                    c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                    if (this.f4015b.f3970w) {
                        c(dependencyNode3, dependencyNode2, 1, this.f4012l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.d != null) {
                    DependencyNode dependencyNodeH10 = WidgetRun.h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH10, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.f4012l);
                        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    }
                } else if (!(constraintWidget16 instanceof Helper) && (constraintWidget3 = constraintWidget16.K) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.f3963e.f4018h, constraintWidget16.o());
                    c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    if (this.f4015b.f3970w) {
                        c(dependencyNode3, dependencyNode2, 1, this.f4012l);
                    }
                    if (this.d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget18 = this.f4015b;
                        if (constraintWidget18.f3950N > 0.0f) {
                            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget18.d;
                            if (horizontalWidgetRun2.d == dimensionBehaviour3) {
                                horizontalWidgetRun2.f4017e.k.add(dimensionDependency);
                                dimensionDependency.f4007l.add(this.f4015b.d.f4017e);
                                dimensionDependency.f4001a = this;
                            }
                        }
                    }
                }
            }
        }
        if (dimensionDependency.f4007l.size() == 0) {
            dimensionDependency.f4003c = true;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f4018h;
        if (dependencyNode.j) {
            this.f4015b.f3952Q = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f4016c = null;
        this.f4018h.c();
        this.f4019i.c();
        this.k.c();
        this.f4017e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.Z || this.f4015b.k == 0;
    }

    public final void m() {
        this.g = false;
        DependencyNode dependencyNode = this.f4018h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.f4019i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        DependencyNode dependencyNode3 = this.k;
        dependencyNode3.c();
        dependencyNode3.j = false;
        this.f4017e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4015b.f3956Y;
    }
}
