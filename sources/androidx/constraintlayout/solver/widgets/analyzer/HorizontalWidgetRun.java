package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalWidgetRun extends WidgetRun {
    public static final int[] k = new int[2];

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4009a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f4009a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4009a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4009a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f4018h.f4004e = DependencyNode.Type.e0;
        this.f4019i.f4004e = DependencyNode.Type.f0;
        this.f = 0;
    }

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f) + 0.5f);
        int i10 = (int) ((i7 / f) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        float f;
        int iG;
        int i2;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i3;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f4015b;
            l(constraintWidget.y, constraintWidget.f3944A, 0);
            return;
        }
        DimensionDependency dimensionDependency = this.f4017e;
        boolean z2 = dimensionDependency.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
        DependencyNode dependencyNode = this.f4018h;
        DependencyNode dependencyNode2 = this.f4019i;
        if (z2 || this.d != dimensionBehaviour) {
            f = 0.5f;
        } else {
            ConstraintWidget constraintWidget2 = this.f4015b;
            int i4 = constraintWidget2.j;
            if (i4 == 2) {
                f = 0.5f;
                ConstraintWidget constraintWidget3 = constraintWidget2.K;
                if (constraintWidget3 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget3.d.f4017e;
                    if (dimensionDependency2.j) {
                        dimensionDependency.d((int) ((dimensionDependency2.g * constraintWidget2.o) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = constraintWidget2.k;
                if (i5 == 0 || i5 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.f3963e;
                    DependencyNode dependencyNode3 = verticalWidgetRun.f4018h;
                    DependencyNode dependencyNode4 = verticalWidgetRun.f4019i;
                    boolean z3 = constraintWidget2.y.d != null;
                    boolean z4 = constraintWidget2.f3971z.d != null;
                    boolean z5 = constraintWidget2.f3944A.d != null;
                    boolean z6 = constraintWidget2.f3945B.d != null;
                    f = 0.5f;
                    int i6 = constraintWidget2.O;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = constraintWidget2.f3950N;
                        boolean z7 = dependencyNode3.j;
                        int[] iArr = k;
                        if (z7 && dependencyNode4.j) {
                            if (dependencyNode.f4003c && dependencyNode2.f4003c) {
                                m(iArr, ((DependencyNode) dependencyNode.f4007l.get(0)).g + dependencyNode.f, ((DependencyNode) dependencyNode2.f4007l.get(0)).g - dependencyNode2.f, dependencyNode3.g + dependencyNode3.f, dependencyNode4.g - dependencyNode4.f, f5, i6);
                                dimensionDependency.d(iArr[0]);
                                this.f4015b.f3963e.f4017e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = dependencyNode.j;
                        ArrayList arrayList = dependencyNode3.f4007l;
                        if (z8 && dependencyNode2.j) {
                            if (!dependencyNode3.f4003c || !dependencyNode4.f4003c) {
                                return;
                            }
                            m(iArr, dependencyNode.g + dependencyNode.f, dependencyNode2.g - dependencyNode2.f, ((DependencyNode) arrayList.get(0)).g + dependencyNode3.f, ((DependencyNode) dependencyNode4.f4007l.get(0)).g - dependencyNode4.f, f5, i6);
                            dimensionDependency.d(iArr[0]);
                            this.f4015b.f3963e.f4017e.d(iArr[1]);
                        }
                        if (!dependencyNode.f4003c || !dependencyNode2.f4003c || !dependencyNode3.f4003c || !dependencyNode4.f4003c) {
                            return;
                        }
                        m(iArr, ((DependencyNode) dependencyNode.f4007l.get(0)).g + dependencyNode.f, ((DependencyNode) dependencyNode2.f4007l.get(0)).g - dependencyNode2.f, ((DependencyNode) arrayList.get(0)).g + dependencyNode3.f, ((DependencyNode) dependencyNode4.f4007l.get(0)).g - dependencyNode4.f, f5, i6);
                        dimensionDependency.d(iArr[0]);
                        this.f4015b.f3963e.f4017e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!dependencyNode.f4003c || !dependencyNode2.f4003c) {
                            return;
                        }
                        float f6 = constraintWidget2.f3950N;
                        int i7 = ((DependencyNode) dependencyNode.f4007l.get(0)).g + dependencyNode.f;
                        int i8 = ((DependencyNode) dependencyNode2.f4007l.get(0)).g - dependencyNode2.f;
                        if (i6 == -1 || i6 == 0) {
                            int iG3 = g(i8 - i7, 0);
                            int i9 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i9, 1);
                            if (i9 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            dimensionDependency.d(iG3);
                            this.f4015b.f3963e.f4017e.d(iG4);
                        } else if (i6 == 1) {
                            int iG5 = g(i8 - i7, 0);
                            int i10 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i10, 1);
                            if (i10 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            dimensionDependency.d(iG5);
                            this.f4015b.f3963e.f4017e.d(iG6);
                        }
                    } else if (z4 && z6) {
                        if (!dependencyNode3.f4003c || !dependencyNode4.f4003c) {
                            return;
                        }
                        float f7 = constraintWidget2.f3950N;
                        int i11 = ((DependencyNode) dependencyNode3.f4007l.get(0)).g + dependencyNode3.f;
                        int i12 = ((DependencyNode) dependencyNode4.f4007l.get(0)).g - dependencyNode4.f;
                        if (i6 == -1) {
                            iG = g(i12 - i11, 1);
                            i2 = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i2, 0);
                            if (i2 != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            dimensionDependency.d(iG2);
                            this.f4015b.f3963e.f4017e.d(iG);
                        } else if (i6 == 0) {
                            int iG7 = g(i12 - i11, 1);
                            int i13 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i13, 0);
                            if (i13 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            dimensionDependency.d(iG8);
                            this.f4015b.f3963e.f4017e.d(iG7);
                        } else if (i6 == 1) {
                            iG = g(i12 - i11, 1);
                            i2 = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i2, 0);
                            if (i2 != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            dimensionDependency.d(iG2);
                            this.f4015b.f3963e.f4017e.d(iG);
                        }
                    }
                } else {
                    int i14 = constraintWidget2.O;
                    if (i14 != -1) {
                        if (i14 == 0) {
                            f4 = constraintWidget2.f3963e.f4017e.g / constraintWidget2.f3950N;
                            i3 = (int) (f4 + 0.5f);
                        } else if (i14 != 1) {
                            i3 = 0;
                        } else {
                            f2 = constraintWidget2.f3963e.f4017e.g;
                            f3 = constraintWidget2.f3950N;
                        }
                        dimensionDependency.d(i3);
                        f = 0.5f;
                    } else {
                        f2 = constraintWidget2.f3963e.f4017e.g;
                        f3 = constraintWidget2.f3950N;
                    }
                    f4 = f2 * f3;
                    i3 = (int) (f4 + 0.5f);
                    dimensionDependency.d(i3);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        if (dependencyNode.f4003c && dependencyNode2.f4003c) {
            if (dependencyNode.j && dependencyNode2.j && dimensionDependency.j) {
                return;
            }
            if (!dimensionDependency.j && this.d == dimensionBehaviour) {
                ConstraintWidget constraintWidget4 = this.f4015b;
                if (constraintWidget4.j == 0 && !constraintWidget4.r()) {
                    DependencyNode dependencyNode5 = (DependencyNode) dependencyNode.f4007l.get(0);
                    DependencyNode dependencyNode6 = (DependencyNode) dependencyNode2.f4007l.get(0);
                    int i15 = dependencyNode5.g + dependencyNode.f;
                    int i16 = dependencyNode6.g + dependencyNode2.f;
                    dependencyNode.d(i15);
                    dependencyNode2.d(i16);
                    dimensionDependency.d(i16 - i15);
                    return;
                }
            }
            if (!dimensionDependency.j && this.d == dimensionBehaviour && this.f4014a == 1 && dependencyNode.f4007l.size() > 0 && dependencyNode2.f4007l.size() > 0) {
                int iMin = Math.min((((DependencyNode) dependencyNode2.f4007l.get(0)).g + dependencyNode2.f) - (((DependencyNode) dependencyNode.f4007l.get(0)).g + dependencyNode.f), dimensionDependency.m);
                ConstraintWidget constraintWidget5 = this.f4015b;
                int i17 = constraintWidget5.f3967n;
                int iMax = Math.max(constraintWidget5.m, iMin);
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                dimensionDependency.d(iMax);
            }
            if (dimensionDependency.j) {
                DependencyNode dependencyNode7 = (DependencyNode) dependencyNode.f4007l.get(0);
                DependencyNode dependencyNode8 = (DependencyNode) dependencyNode2.f4007l.get(0);
                int i18 = dependencyNode7.g;
                int i19 = dependencyNode.f + i18;
                int i20 = dependencyNode8.g;
                int i21 = dependencyNode2.f + i20;
                float f8 = this.f4015b.f3954U;
                if (dependencyNode7 == dependencyNode8) {
                    f8 = f;
                } else {
                    i18 = i19;
                    i20 = i21;
                }
                dependencyNode.d((int) ((((i20 - i18) - dimensionDependency.g) * f8) + i18 + f));
                dependencyNode2.d(dependencyNode.g + dimensionDependency.g);
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
            dimensionDependency.d(constraintWidget5.m());
        }
        boolean z3 = dimensionDependency.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.Z;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.X;
        DependencyNode dependencyNode = this.f4019i;
        DependencyNode dependencyNode2 = this.f4018h;
        if (!z3) {
            ConstraintWidget constraintWidget6 = this.f4015b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidget6.f3949J[0];
            this.d = dimensionBehaviour4;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                if (dimensionBehaviour4 == dimensionBehaviour && (((constraintWidget4 = constraintWidget6.K) != null && constraintWidget4.f3949J[0] == dimensionBehaviour3) || constraintWidget4.f3949J[0] == dimensionBehaviour)) {
                    int iM = (constraintWidget4.m() - this.f4015b.y.c()) - this.f4015b.f3944A.c();
                    HorizontalWidgetRun horizontalWidgetRun = constraintWidget4.d;
                    WidgetRun.b(dependencyNode2, horizontalWidgetRun.f4018h, this.f4015b.y.c());
                    WidgetRun.b(dependencyNode, horizontalWidgetRun.f4019i, -this.f4015b.f3944A.c());
                    dimensionDependency.d(iM);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour3) {
                    dimensionDependency.d(constraintWidget6.m());
                }
            }
        } else if (this.d == dimensionBehaviour && (((constraintWidget2 = (constraintWidget = this.f4015b).K) != null && constraintWidget2.f3949J[0] == dimensionBehaviour3) || constraintWidget2.f3949J[0] == dimensionBehaviour)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.d.f4018h, constraintWidget.y.c());
            WidgetRun.b(dependencyNode, constraintWidget2.d.f4019i, -this.f4015b.f3944A.c());
            return;
        }
        if (dimensionDependency.j) {
            ConstraintWidget constraintWidget7 = this.f4015b;
            if (constraintWidget7.f3957a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.G;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                if (constraintAnchor2 != null && constraintAnchorArr[1].d != null) {
                    if (constraintWidget7.r()) {
                        dependencyNode2.f = this.f4015b.G[0].c();
                        dependencyNode.f = -this.f4015b.G[1].c();
                        return;
                    }
                    DependencyNode dependencyNodeH = WidgetRun.h(this.f4015b.G[0]);
                    if (dependencyNodeH != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH, this.f4015b.G[0].c());
                    }
                    DependencyNode dependencyNodeH2 = WidgetRun.h(this.f4015b.G[1]);
                    if (dependencyNodeH2 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH2, -this.f4015b.G[1].c());
                    }
                    dependencyNode2.f4002b = true;
                    dependencyNode.f4002b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.f4015b.G[0].c());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.d != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.f4015b.G[1].c());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.K == null || constraintWidget7.h(ConstraintAnchor.Type.g0).d != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f4015b;
                WidgetRun.b(dependencyNode2, constraintWidget8.K.d.f4018h, constraintWidget8.n());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                return;
            }
        }
        if (this.d == dimensionBehaviour2) {
            ConstraintWidget constraintWidget9 = this.f4015b;
            int i2 = constraintWidget9.j;
            if (i2 == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.K;
                if (constraintWidget10 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget10.f3963e.f4017e;
                    dimensionDependency.f4007l.add(dimensionDependency2);
                    dimensionDependency2.k.add(dimensionDependency);
                    dimensionDependency.f4002b = true;
                    dimensionDependency.k.add(dependencyNode2);
                    dimensionDependency.k.add(dependencyNode);
                }
            } else if (i2 == 3) {
                if (constraintWidget9.k == 3) {
                    dependencyNode2.f4001a = this;
                    dependencyNode.f4001a = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget9.f3963e;
                    verticalWidgetRun.f4018h.f4001a = this;
                    verticalWidgetRun.f4019i.f4001a = this;
                    dimensionDependency.f4001a = this;
                    if (constraintWidget9.s()) {
                        dimensionDependency.f4007l.add(this.f4015b.f3963e.f4017e);
                        this.f4015b.f3963e.f4017e.k.add(dimensionDependency);
                        VerticalWidgetRun verticalWidgetRun2 = this.f4015b.f3963e;
                        verticalWidgetRun2.f4017e.f4001a = this;
                        dimensionDependency.f4007l.add(verticalWidgetRun2.f4018h);
                        dimensionDependency.f4007l.add(this.f4015b.f3963e.f4019i);
                        this.f4015b.f3963e.f4018h.k.add(dimensionDependency);
                        this.f4015b.f3963e.f4019i.k.add(dimensionDependency);
                    } else if (this.f4015b.r()) {
                        this.f4015b.f3963e.f4017e.f4007l.add(dimensionDependency);
                        dimensionDependency.k.add(this.f4015b.f3963e.f4017e);
                    } else {
                        this.f4015b.f3963e.f4017e.f4007l.add(dimensionDependency);
                    }
                } else {
                    DimensionDependency dimensionDependency3 = constraintWidget9.f3963e.f4017e;
                    dimensionDependency.f4007l.add(dimensionDependency3);
                    dimensionDependency3.k.add(dimensionDependency);
                    this.f4015b.f3963e.f4018h.k.add(dimensionDependency);
                    this.f4015b.f3963e.f4019i.k.add(dimensionDependency);
                    dimensionDependency.f4002b = true;
                    dimensionDependency.k.add(dependencyNode2);
                    dimensionDependency.k.add(dependencyNode);
                    dependencyNode2.f4007l.add(dimensionDependency);
                    dependencyNode.f4007l.add(dimensionDependency);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f4015b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.G;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.d;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].d != null) {
            if (constraintWidget11.r()) {
                dependencyNode2.f = this.f4015b.G[0].c();
                dependencyNode.f = -this.f4015b.G[1].c();
                return;
            }
            DependencyNode dependencyNodeH5 = WidgetRun.h(this.f4015b.G[0]);
            DependencyNode dependencyNodeH6 = WidgetRun.h(this.f4015b.G[1]);
            dependencyNodeH5.b(this);
            dependencyNodeH6.b(this);
            this.j = WidgetRun.RunType.f4021Y;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = WidgetRun.h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH7, this.f4015b.G[0].c());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.d != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeH8, -this.f4015b.G[1].c());
                c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof Helper) || (constraintWidget3 = constraintWidget11.K) == null) {
            return;
        }
        WidgetRun.b(dependencyNode2, constraintWidget3.d.f4018h, constraintWidget11.n());
        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f4018h;
        if (dependencyNode.j) {
            this.f4015b.f3951P = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f4016c = null;
        this.f4018h.c();
        this.f4019i.c();
        this.f4017e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.Z || this.f4015b.j == 0;
    }

    public final void n() {
        this.g = false;
        DependencyNode dependencyNode = this.f4018h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.f4019i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        this.f4017e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4015b.f3956Y;
    }
}
