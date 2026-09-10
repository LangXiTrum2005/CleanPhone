package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f4015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RunGroup f4016c;
    public ConstraintWidget.DimensionBehaviour d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DimensionDependency f4017e = new DimensionDependency(this);
    public int f = 0;
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DependencyNode f4018h = new DependencyNode(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DependencyNode f4019i = new DependencyNode(this);
    public RunType j = RunType.X;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4020a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f4020a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4020a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4020a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4020a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4020a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunType {
        public static final RunType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final RunType f4021Y;
        public static final /* synthetic */ RunType[] Z;

        static {
            RunType runType = new RunType("NONE", 0);
            X = runType;
            RunType runType2 = new RunType("START", 1);
            RunType runType3 = new RunType("END", 2);
            RunType runType4 = new RunType("CENTER", 3);
            f4021Y = runType4;
            Z = new RunType[]{runType, runType2, runType3, runType4};
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) Z.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f4015b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
        dependencyNode.f4007l.add(dependencyNode2);
        dependencyNode.f = i2;
        dependencyNode2.k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
        if (constraintAnchor2 == null) {
            return null;
        }
        int iOrdinal = constraintAnchor2.f3940c.ordinal();
        ConstraintWidget constraintWidget = constraintAnchor2.f3939b;
        if (iOrdinal == 1) {
            return constraintWidget.d.f4018h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.f3963e.f4018h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.d.f4019i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.f3963e.f4019i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.f3963e.k;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f3939b;
        WidgetRun widgetRun = i2 == 0 ? constraintWidget.d : constraintWidget.f3963e;
        int iOrdinal = constraintAnchor2.f3940c.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return widgetRun.f4018h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return widgetRun.f4019i;
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void a(Dependency dependency) {
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, DimensionDependency dimensionDependency) {
        dependencyNode.f4007l.add(dependencyNode2);
        dependencyNode.f4007l.add(this.f4017e);
        dependencyNode.f4005h = i2;
        dependencyNode.f4006i = dimensionDependency;
        dependencyNode2.k.add(dependencyNode);
        dimensionDependency.k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.f4015b;
            int i4 = constraintWidget.f3967n;
            int iMax = Math.max(constraintWidget.m, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax != i2) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f4015b;
            int i5 = constraintWidget2.q;
            int iMax2 = Math.max(constraintWidget2.f3968p, i2);
            if (i5 > 0) {
                iMax2 = Math.min(i5, i2);
            }
            if (iMax2 != i2) {
                return iMax2;
            }
        }
        return i2;
    }

    public long j() {
        DimensionDependency dimensionDependency = this.f4017e;
        if (dimensionDependency.j) {
            return dimensionDependency.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        DependencyNode dependencyNodeH = h(constraintAnchor);
        DependencyNode dependencyNodeH2 = h(constraintAnchor2);
        if (dependencyNodeH.j && dependencyNodeH2.j) {
            int iC = constraintAnchor.c() + dependencyNodeH.g;
            int iC2 = dependencyNodeH2.g - constraintAnchor2.c();
            int i3 = iC2 - iC;
            DimensionDependency dimensionDependency = this.f4017e;
            if (!dimensionDependency.j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.Z;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i4 = this.f4014a;
                    if (i4 == 0) {
                        dimensionDependency.d(g(i3, i2));
                    } else if (i4 == 1) {
                        dimensionDependency.d(Math.min(g(dimensionDependency.m, i2), i3));
                    } else if (i4 == 2) {
                        ConstraintWidget constraintWidget = this.f4015b;
                        ConstraintWidget constraintWidget2 = constraintWidget.K;
                        if (constraintWidget2 != null) {
                            DimensionDependency dimensionDependency2 = (i2 == 0 ? constraintWidget2.d : constraintWidget2.f3963e).f4017e;
                            if (dimensionDependency2.j) {
                                dimensionDependency.d(g((int) ((dimensionDependency2.g * (i2 == 0 ? constraintWidget.o : constraintWidget.r)) + 0.5f), i2));
                            }
                        }
                    } else if (i4 == 3) {
                        ConstraintWidget constraintWidget3 = this.f4015b;
                        WidgetRun widgetRun = constraintWidget3.d;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = widgetRun.d;
                        VerticalWidgetRun verticalWidgetRun = constraintWidget3.f3963e;
                        if (dimensionBehaviour3 != dimensionBehaviour2 || widgetRun.f4014a != 3 || verticalWidgetRun.d != dimensionBehaviour2 || verticalWidgetRun.f4014a != 3) {
                            if (i2 == 0) {
                                widgetRun = verticalWidgetRun;
                            }
                            DimensionDependency dimensionDependency3 = widgetRun.f4017e;
                            if (dimensionDependency3.j) {
                                float f = constraintWidget3.f3950N;
                                dimensionDependency.d(i2 == 1 ? (int) ((dimensionDependency3.g / f) + 0.5f) : (int) ((f * dimensionDependency3.g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (dimensionDependency.j) {
                int i5 = dimensionDependency.g;
                DependencyNode dependencyNode = this.f4019i;
                DependencyNode dependencyNode2 = this.f4018h;
                if (i5 == i3) {
                    dependencyNode2.d(iC);
                    dependencyNode.d(iC2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f4015b;
                float f2 = i2 == 0 ? constraintWidget4.f3954U : constraintWidget4.f3955V;
                if (dependencyNodeH == dependencyNodeH2) {
                    iC = dependencyNodeH.g;
                    iC2 = dependencyNodeH2.g;
                    f2 = 0.5f;
                }
                dependencyNode2.d((int) ((((iC2 - iC) - i5) * f2) + iC + 0.5f));
                dependencyNode.d(dependencyNode2.g + dimensionDependency.g);
            }
        }
    }
}
