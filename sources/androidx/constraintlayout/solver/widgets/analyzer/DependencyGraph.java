package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.v4.media.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DependencyGraph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidgetContainer f3996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3998c;
    public ConstraintWidgetContainer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f3999e;
    public BasicMeasure.Measurer f;
    public BasicMeasure.Measure g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f4000h;

    public final void a(DependencyNode dependencyNode, int i2, ArrayList arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.f4016c == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f3996a;
            if (widgetRun == constraintWidgetContainer.d || widgetRun == constraintWidgetContainer.f3963e) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup();
                runGroup.f4010a = null;
                runGroup.f4011b = new ArrayList();
                runGroup.f4010a = widgetRun;
                arrayList.add(runGroup);
            }
            widgetRun.f4016c = runGroup;
            runGroup.f4011b.add(widgetRun);
            DependencyNode dependencyNode2 = widgetRun.f4018h;
            for (Dependency dependency : dependencyNode2.k) {
                if (dependency instanceof DependencyNode) {
                    a((DependencyNode) dependency, i2, arrayList, runGroup);
                }
            }
            DependencyNode dependencyNode3 = widgetRun.f4019i;
            for (Dependency dependency2 : dependencyNode3.k) {
                if (dependency2 instanceof DependencyNode) {
                    a((DependencyNode) dependency2, i2, arrayList, runGroup);
                }
            }
            if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).k.k) {
                    if (dependency3 instanceof DependencyNode) {
                        a((DependencyNode) dependency3, i2, arrayList, runGroup);
                    }
                }
            }
            Iterator it = dependencyNode2.f4007l.iterator();
            while (it.hasNext()) {
                a((DependencyNode) it.next(), i2, arrayList, runGroup);
            }
            Iterator it2 = dependencyNode3.f4007l.iterator();
            while (it2.hasNext()) {
                a((DependencyNode) it2.next(), i2, arrayList, runGroup);
            }
            if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it3 = ((VerticalWidgetRun) widgetRun).k.f4007l.iterator();
                while (it3.hasNext()) {
                    a((DependencyNode) it3.next(), i2, arrayList, runGroup);
                }
            }
        }
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer) {
        float f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        VerticalWidgetRun verticalWidgetRun;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        Iterator it = constraintWidgetContainer.e0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f3949J;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[1];
            if (constraintWidget.X == 8) {
                constraintWidget.f3957a = true;
            } else {
                float f2 = constraintWidget.o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.Z;
                if (f2 < 1.0f && dimensionBehaviour9 == dimensionBehaviour11) {
                    constraintWidget.j = 2;
                }
                float f3 = constraintWidget.r;
                if (f3 < 1.0f && dimensionBehaviour10 == dimensionBehaviour11) {
                    constraintWidget.k = 2;
                }
                float f4 = constraintWidget.f3950N;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.f3974Y;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.X;
                if (f4 > 0.0f) {
                    if (dimensionBehaviour9 == dimensionBehaviour11 && (dimensionBehaviour10 == dimensionBehaviour12 || dimensionBehaviour10 == dimensionBehaviour13)) {
                        constraintWidget.j = 3;
                    } else if (dimensionBehaviour10 == dimensionBehaviour11 && (dimensionBehaviour9 == dimensionBehaviour12 || dimensionBehaviour9 == dimensionBehaviour13)) {
                        constraintWidget.k = 3;
                    } else if (dimensionBehaviour9 == dimensionBehaviour11 && dimensionBehaviour10 == dimensionBehaviour11) {
                        if (constraintWidget.j == 0) {
                            constraintWidget.j = 3;
                        }
                        if (constraintWidget.k == 0) {
                            constraintWidget.k = 3;
                        }
                    }
                }
                ConstraintAnchor constraintAnchor = constraintWidget.f3944A;
                ConstraintAnchor constraintAnchor2 = constraintWidget.y;
                if (dimensionBehaviour9 == dimensionBehaviour11 && constraintWidget.j == 1 && (constraintAnchor2.d == null || constraintAnchor.d == null)) {
                    dimensionBehaviour9 = dimensionBehaviour12;
                }
                ConstraintAnchor constraintAnchor3 = constraintWidget.f3945B;
                ConstraintAnchor constraintAnchor4 = constraintWidget.f3971z;
                if (dimensionBehaviour10 == dimensionBehaviour11 && constraintWidget.k == 1 && (constraintAnchor4.d == null || constraintAnchor3.d == null)) {
                    dimensionBehaviour10 = dimensionBehaviour12;
                }
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.d;
                horizontalWidgetRun.d = dimensionBehaviour9;
                int i2 = constraintWidget.j;
                horizontalWidgetRun.f4014a = i2;
                VerticalWidgetRun verticalWidgetRun2 = constraintWidget.f3963e;
                verticalWidgetRun2.d = dimensionBehaviour10;
                Iterator it2 = it;
                int i3 = constraintWidget.k;
                verticalWidgetRun2.f4014a = i3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.e0;
                if ((dimensionBehaviour9 == dimensionBehaviour14 || dimensionBehaviour9 == dimensionBehaviour13 || dimensionBehaviour9 == dimensionBehaviour12) && (dimensionBehaviour10 == dimensionBehaviour14 || dimensionBehaviour10 == dimensionBehaviour13 || dimensionBehaviour10 == dimensionBehaviour12)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviour10;
                    int iM = constraintWidget.m();
                    if (dimensionBehaviour9 == dimensionBehaviour14) {
                        iM = (constraintWidgetContainer.m() - constraintAnchor2.f3941e) - constraintAnchor.f3941e;
                        dimensionBehaviour9 = dimensionBehaviour13;
                    }
                    int iJ = constraintWidget.j();
                    if (dimensionBehaviour15 == dimensionBehaviour14) {
                        iJ = (constraintWidgetContainer.j() - constraintAnchor4.f3941e) - constraintAnchor3.f3941e;
                        dimensionBehaviour15 = dimensionBehaviour13;
                    }
                    h(constraintWidget, dimensionBehaviour9, iM, dimensionBehaviour15, iJ);
                    horizontalWidgetRun.f4017e.d(constraintWidget.m());
                    verticalWidgetRun2.f4017e.d(constraintWidget.j());
                    constraintWidget.f3957a = true;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = constraintWidget.G;
                    if (dimensionBehaviour9 != dimensionBehaviour11 || (dimensionBehaviour10 != dimensionBehaviour12 && dimensionBehaviour10 != dimensionBehaviour13)) {
                        f = f3;
                        dimensionBehaviour = dimensionBehaviour13;
                        dimensionBehaviour2 = dimensionBehaviour10;
                        dimensionBehaviour3 = dimensionBehaviour9;
                        dimensionBehaviour4 = dimensionBehaviour12;
                        verticalWidgetRun = verticalWidgetRun2;
                    } else if (i2 == 3) {
                        if (dimensionBehaviour10 == dimensionBehaviour12) {
                            h(constraintWidget, dimensionBehaviour12, 0, dimensionBehaviour12, 0);
                        }
                        int iJ2 = constraintWidget.j();
                        h(constraintWidget, dimensionBehaviour13, (int) ((iJ2 * constraintWidget.f3950N) + 0.5f), dimensionBehaviour13, iJ2);
                        horizontalWidgetRun.f4017e.d(constraintWidget.m());
                        verticalWidgetRun2.f4017e.d(constraintWidget.j());
                        constraintWidget.f3957a = true;
                    } else {
                        dimensionBehaviour = dimensionBehaviour13;
                        dimensionBehaviour3 = dimensionBehaviour9;
                        dimensionBehaviour4 = dimensionBehaviour12;
                        verticalWidgetRun = verticalWidgetRun2;
                        if (i2 == 1) {
                            h(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            horizontalWidgetRun.f4017e.m = constraintWidget.m();
                        } else {
                            f = f3;
                            dimensionBehaviour2 = dimensionBehaviour10;
                            if (i2 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = constraintWidgetContainer.f3949J[0];
                                if (dimensionBehaviour16 == dimensionBehaviour || dimensionBehaviour16 == dimensionBehaviour14) {
                                    h(constraintWidget, dimensionBehaviour, (int) ((f2 * constraintWidgetContainer.m()) + 0.5f), dimensionBehaviour2, constraintWidget.j());
                                    horizontalWidgetRun.f4017e.d(constraintWidget.m());
                                    verticalWidgetRun.f4017e.d(constraintWidget.j());
                                    constraintWidget.f3957a = true;
                                }
                            } else if (constraintAnchorArr[0].d == null || constraintAnchorArr[1].d == null) {
                                h(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour2, 0);
                                horizontalWidgetRun.f4017e.d(constraintWidget.m());
                                verticalWidgetRun.f4017e.d(constraintWidget.j());
                                constraintWidget.f3957a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour2 != dimensionBehaviour11 || (dimensionBehaviour3 != dimensionBehaviour4 && dimensionBehaviour3 != dimensionBehaviour)) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviour3;
                        dimensionBehaviour5 = dimensionBehaviour4;
                        dimensionBehaviour6 = dimensionBehaviour17;
                    } else if (i3 == 3) {
                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                            h(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                        }
                        int iM2 = constraintWidget.m();
                        float f5 = constraintWidget.f3950N;
                        if (constraintWidget.O == -1) {
                            f5 = 1.0f / f5;
                        }
                        h(constraintWidget, dimensionBehaviour, iM2, dimensionBehaviour, (int) ((iM2 * f5) + 0.5f));
                        horizontalWidgetRun.f4017e.d(constraintWidget.m());
                        verticalWidgetRun.f4017e.d(constraintWidget.j());
                        constraintWidget.f3957a = true;
                    } else if (i3 == 1) {
                        h(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour4, 0);
                        verticalWidgetRun.f4017e.m = constraintWidget.j();
                    } else {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviour3;
                        dimensionBehaviour5 = dimensionBehaviour4;
                        if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = constraintWidgetContainer.f3949J[1];
                            if (dimensionBehaviour19 == dimensionBehaviour || dimensionBehaviour19 == dimensionBehaviour14) {
                                h(constraintWidget, dimensionBehaviour18, constraintWidget.m(), dimensionBehaviour, (int) ((f * constraintWidgetContainer.j()) + 0.5f));
                                horizontalWidgetRun.f4017e.d(constraintWidget.m());
                                verticalWidgetRun.f4017e.d(constraintWidget.j());
                                constraintWidget.f3957a = true;
                            } else {
                                dimensionBehaviour6 = dimensionBehaviour18;
                            }
                        } else {
                            dimensionBehaviour6 = dimensionBehaviour18;
                            if (constraintAnchorArr[2].d == null || constraintAnchorArr[3].d == null) {
                                h(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour2, 0);
                                horizontalWidgetRun.f4017e.d(constraintWidget.m());
                                verticalWidgetRun.f4017e.d(constraintWidget.j());
                                constraintWidget.f3957a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour6 == dimensionBehaviour11 && dimensionBehaviour2 == dimensionBehaviour11) {
                        if (i2 == 1 || i3 == 1) {
                            h(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            horizontalWidgetRun.f4017e.m = constraintWidget.m();
                            verticalWidgetRun.f4017e.m = constraintWidget.j();
                        } else if (i3 == 2 && i2 == 2 && (((dimensionBehaviour7 = (dimensionBehaviourArr = constraintWidgetContainer.f3949J)[0]) == dimensionBehaviour || dimensionBehaviour7 == dimensionBehaviour) && ((dimensionBehaviour8 = dimensionBehaviourArr[1]) == dimensionBehaviour || dimensionBehaviour8 == dimensionBehaviour))) {
                            h(constraintWidget, dimensionBehaviour, (int) ((f2 * constraintWidgetContainer.m()) + 0.5f), dimensionBehaviour, (int) ((f * constraintWidgetContainer.j()) + 0.5f));
                            horizontalWidgetRun.f4017e.d(constraintWidget.m());
                            verticalWidgetRun.f4017e.d(constraintWidget.j());
                            constraintWidget.f3957a = true;
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<WidgetRun> arrayList = this.f3999e;
        arrayList.clear();
        ConstraintWidgetContainer constraintWidgetContainer = this.d;
        constraintWidgetContainer.d.f();
        VerticalWidgetRun verticalWidgetRun = constraintWidgetContainer.f3963e;
        verticalWidgetRun.f();
        arrayList.add(constraintWidgetContainer.d);
        arrayList.add(verticalWidgetRun);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.e0) {
            if (constraintWidget instanceof Guideline) {
                GuidelineReference guidelineReference = new GuidelineReference(constraintWidget);
                constraintWidget.d.f();
                constraintWidget.f3963e.f();
                guidelineReference.f = ((Guideline) constraintWidget).i0;
                arrayList.add(guidelineReference);
            } else {
                if (constraintWidget.r()) {
                    if (constraintWidget.f3958b == null) {
                        constraintWidget.f3958b = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f3958b);
                } else {
                    arrayList.add(constraintWidget.d);
                }
                if (constraintWidget.s()) {
                    if (constraintWidget.f3960c == null) {
                        constraintWidget.f3960c = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f3960c);
                } else {
                    arrayList.add(constraintWidget.f3963e);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).f();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f4015b != constraintWidgetContainer) {
                widgetRun.d();
            }
        }
        ArrayList arrayList2 = this.f4000h;
        arrayList2.clear();
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f3996a;
        g(constraintWidgetContainer2.d, 0, arrayList2);
        g(constraintWidgetContainer2.f3963e, 1, arrayList2);
        this.f3997b = false;
    }

    public final int d(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = this.f4000h;
        int size = arrayList2.size();
        int i5 = 0;
        long jMax = 0;
        while (i5 < size) {
            WidgetRun widgetRun = ((RunGroup) arrayList2.get(i5)).f4010a;
            if (!(widgetRun instanceof ChainRun) ? !(i2 != 0 ? (widgetRun instanceof VerticalWidgetRun) : (widgetRun instanceof HorizontalWidgetRun)) : ((ChainRun) widgetRun).f != i2) {
                DependencyNode dependencyNode = (i2 == 0 ? constraintWidgetContainer.d : constraintWidgetContainer.f3963e).f4018h;
                DependencyNode dependencyNode2 = (i2 == 0 ? constraintWidgetContainer.d : constraintWidgetContainer.f3963e).f4019i;
                boolean zContains = widgetRun.f4018h.f4007l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun.f4019i;
                boolean zContains2 = dependencyNode3.f4007l.contains(dependencyNode2);
                long j3 = widgetRun.j();
                DependencyNode dependencyNode4 = widgetRun.f4018h;
                if (zContains && zContains2) {
                    long jB = RunGroup.b(dependencyNode4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long jA = RunGroup.a(dependencyNode3, 0L);
                    long j4 = jB - j3;
                    int i6 = dependencyNode3.f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j4 >= (-i6)) {
                        j4 += (long) i6;
                    }
                    long j5 = (-jA) - j3;
                    long j6 = dependencyNode4.f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    ConstraintWidget constraintWidget = widgetRun.f4015b;
                    if (i2 == 0) {
                        f = constraintWidget.f3954U;
                    } else if (i2 == 1) {
                        f = constraintWidget.f3955V;
                    } else {
                        constraintWidget.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j4 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) dependencyNode4.f) + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) a.a(1.0f, f, f2, 0.5f)))) - ((long) dependencyNode3.f);
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    if (zContains) {
                        j = Math.max(RunGroup.b(dependencyNode4, dependencyNode4.f), ((long) dependencyNode4.f) + j3);
                    } else if (zContains2) {
                        j = Math.max(-RunGroup.a(dependencyNode3, dependencyNode3.f), ((long) (-dependencyNode3.f)) + j3);
                    } else {
                        j = (widgetRun.j() + ((long) dependencyNode4.f)) - ((long) dependencyNode3.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i5 = i4 + 1;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final boolean e(boolean z2) {
        boolean z3;
        boolean z4 = this.f3997b;
        ConstraintWidgetContainer constraintWidgetContainer = this.f3996a;
        boolean z5 = false;
        if (z4 || this.f3998c) {
            for (ConstraintWidget constraintWidget : constraintWidgetContainer.e0) {
                constraintWidget.f3957a = false;
                constraintWidget.d.n();
                constraintWidget.f3963e.m();
            }
            constraintWidgetContainer.f3957a = false;
            constraintWidgetContainer.d.n();
            constraintWidgetContainer.f3963e.m();
            this.f3998c = false;
        }
        b(this.d);
        constraintWidgetContainer.f3951P = 0;
        constraintWidgetContainer.f3952Q = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourI = constraintWidgetContainer.i(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourI2 = constraintWidgetContainer.i(1);
        if (this.f3997b) {
            c();
        }
        int iN = constraintWidgetContainer.n();
        int iO = constraintWidgetContainer.o();
        constraintWidgetContainer.d.f4018h.d(iN);
        constraintWidgetContainer.f3963e.f4018h.d(iO);
        i();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f3974Y;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.X;
        ArrayList<WidgetRun> arrayList = this.f3999e;
        if (dimensionBehaviourI == dimensionBehaviour || dimensionBehaviourI2 == dimensionBehaviour) {
            if (z2) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((WidgetRun) it.next()).k()) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2 && dimensionBehaviourI == dimensionBehaviour) {
                constraintWidgetContainer.x(dimensionBehaviour2);
                constraintWidgetContainer.z(d(constraintWidgetContainer, 0));
                constraintWidgetContainer.d.f4017e.d(constraintWidgetContainer.m());
            }
            if (z2 && dimensionBehaviourI2 == dimensionBehaviour) {
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(d(constraintWidgetContainer, 1));
                constraintWidgetContainer.f3963e.f4017e.d(constraintWidgetContainer.j());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer.f3949J[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.e0;
        if (dimensionBehaviour3 == dimensionBehaviour2 || dimensionBehaviour3 == dimensionBehaviour4) {
            int iM = constraintWidgetContainer.m() + iN;
            constraintWidgetContainer.d.f4019i.d(iM);
            constraintWidgetContainer.d.f4017e.d(iM - iN);
            i();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.f3949J[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour4) {
                int iJ = constraintWidgetContainer.j() + iO;
                constraintWidgetContainer.f3963e.f4019i.d(iJ);
                constraintWidgetContainer.f3963e.f4017e.d(iJ - iO);
            }
            i();
            z3 = true;
        } else {
            z3 = false;
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f4015b != constraintWidgetContainer || widgetRun.g) {
                widgetRun.e();
            }
        }
        for (WidgetRun widgetRun2 : arrayList) {
            if (z3 || widgetRun2.f4015b != constraintWidgetContainer) {
                if (!widgetRun2.f4018h.j || ((!widgetRun2.f4019i.j && !(widgetRun2 instanceof GuidelineReference)) || (!widgetRun2.f4017e.j && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof GuidelineReference)))) {
                    constraintWidgetContainer.x(dimensionBehaviourI);
                    constraintWidgetContainer.y(dimensionBehaviourI2);
                    return z5;
                }
            }
        }
        z5 = true;
        constraintWidgetContainer.x(dimensionBehaviourI);
        constraintWidgetContainer.y(dimensionBehaviourI2);
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final boolean f(int i2, boolean z2) {
        boolean z3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidgetContainer constraintWidgetContainer = this.f3996a;
        boolean z4 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourI = constraintWidgetContainer.i(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourI2 = constraintWidgetContainer.i(1);
        int iN = constraintWidgetContainer.n();
        int iO = constraintWidgetContainer.o();
        ArrayList<WidgetRun> arrayList = this.f3999e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.X;
        if (z2 && (dimensionBehaviourI == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f3974Y) || dimensionBehaviourI2 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : arrayList) {
                if (widgetRun.f == i2 && !widgetRun.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z2 && dimensionBehaviourI == dimensionBehaviour) {
                    constraintWidgetContainer.x(dimensionBehaviour2);
                    constraintWidgetContainer.z(d(constraintWidgetContainer, 0));
                    constraintWidgetContainer.d.f4017e.d(constraintWidgetContainer.m());
                }
            } else if (z2 && dimensionBehaviourI2 == dimensionBehaviour) {
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(d(constraintWidgetContainer, 1));
                constraintWidgetContainer.f3963e.f4017e.d(constraintWidgetContainer.j());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.e0;
        if (i2 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.f3949J[0];
            if (dimensionBehaviour4 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour3) {
                int iM = constraintWidgetContainer.m() + iN;
                constraintWidgetContainer.d.f4019i.d(iM);
                constraintWidgetContainer.d.f4017e.d(iM - iN);
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.f3949J[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour3) {
                int iJ = constraintWidgetContainer.j() + iO;
                constraintWidgetContainer.f3963e.f4019i.d(iJ);
                constraintWidgetContainer.f3963e.f4017e.d(iJ - iO);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        i();
        for (WidgetRun widgetRun2 : arrayList) {
            if (widgetRun2.f == i2 && (widgetRun2.f4015b != constraintWidgetContainer || widgetRun2.g)) {
                widgetRun2.e();
            }
        }
        for (WidgetRun widgetRun3 : arrayList) {
            if (widgetRun3.f == i2 && (z3 || widgetRun3.f4015b != constraintWidgetContainer)) {
                if (!widgetRun3.f4018h.j || !widgetRun3.f4019i.j || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.f4017e.j)) {
                    constraintWidgetContainer.x(dimensionBehaviourI);
                    constraintWidgetContainer.y(dimensionBehaviourI2);
                    return z4;
                }
            }
        }
        z4 = true;
        constraintWidgetContainer.x(dimensionBehaviourI);
        constraintWidgetContainer.y(dimensionBehaviourI2);
        return z4;
    }

    public final void g(WidgetRun widgetRun, int i2, ArrayList arrayList) {
        DependencyNode dependencyNode;
        Iterator it = widgetRun.f4018h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dependencyNode = widgetRun.f4019i;
            if (!zHasNext) {
                break;
            }
            Dependency dependency = (Dependency) it.next();
            if (dependency instanceof DependencyNode) {
                a((DependencyNode) dependency, i2, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                a(((WidgetRun) dependency).f4018h, i2, arrayList, null);
            }
        }
        for (Dependency dependency2 : dependencyNode.k) {
            if (dependency2 instanceof DependencyNode) {
                a((DependencyNode) dependency2, i2, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                a(((WidgetRun) dependency2).f4019i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).k.k) {
                if (dependency3 instanceof DependencyNode) {
                    a((DependencyNode) dependency3, i2, arrayList, null);
                }
            }
        }
    }

    public final void h(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measure measure = this.g;
        measure.f3989a = dimensionBehaviour;
        measure.f3990b = dimensionBehaviour2;
        measure.f3991c = i2;
        measure.d = i3;
        this.f.b(constraintWidget, measure);
        constraintWidget.z(measure.f3992e);
        constraintWidget.w(measure.f);
        constraintWidget.f3970w = measure.f3993h;
        int i4 = measure.g;
        constraintWidget.f3953R = i4;
        constraintWidget.f3970w = i4 > 0;
    }

    public final void i() {
        BaselineDimensionDependency baselineDimensionDependency;
        DependencyGraph dependencyGraph = this;
        for (ConstraintWidget constraintWidget : dependencyGraph.f3996a.e0) {
            if (!constraintWidget.f3957a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f3949J;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i2 = constraintWidget.j;
                int i3 = constraintWidget.k;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f3974Y;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.Z;
                boolean z3 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == dimensionBehaviour4 && i2 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == dimensionBehaviour4 && i3 == 1)) {
                    z2 = true;
                }
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.d;
                DimensionDependency dimensionDependency = horizontalWidgetRun.f4017e;
                boolean z4 = dimensionDependency.j;
                VerticalWidgetRun verticalWidgetRun = constraintWidget.f3963e;
                DimensionDependency dimensionDependency2 = verticalWidgetRun.f4017e;
                boolean z5 = dimensionDependency2.j;
                boolean z6 = z3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.X;
                if (z4 && z5) {
                    dependencyGraph.h(constraintWidget, dimensionBehaviour5, dimensionDependency.g, dimensionBehaviour5, dimensionDependency2.g);
                    constraintWidget.f3957a = true;
                } else if (z4 && z2) {
                    h(constraintWidget, dimensionBehaviour5, dimensionDependency.g, dimensionBehaviour3, dimensionDependency2.g);
                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                        verticalWidgetRun.f4017e.m = constraintWidget.j();
                    } else {
                        verticalWidgetRun.f4017e.d(constraintWidget.j());
                        constraintWidget.f3957a = true;
                    }
                } else if (z5 && z6) {
                    h(constraintWidget, dimensionBehaviour3, dimensionDependency.g, dimensionBehaviour5, dimensionDependency2.g);
                    if (dimensionBehaviour == dimensionBehaviour4) {
                        horizontalWidgetRun.f4017e.m = constraintWidget.m();
                    } else {
                        horizontalWidgetRun.f4017e.d(constraintWidget.m());
                        constraintWidget.f3957a = true;
                    }
                }
                if (constraintWidget.f3957a && (baselineDimensionDependency = verticalWidgetRun.f4012l) != null) {
                    baselineDimensionDependency.d(constraintWidget.f3953R);
                }
                dependencyGraph = this;
            }
        }
    }
}
