package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.v4.media.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ChainRun extends WidgetRun {
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3995l;

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.k = new ArrayList();
        this.f = i2;
        ConstraintWidget constraintWidget3 = this.f4015b;
        ConstraintWidget constraintWidgetL = constraintWidget3.l(i2);
        while (true) {
            ConstraintWidget constraintWidget4 = constraintWidgetL;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetL = constraintWidget3.l(this.f);
            }
        }
        this.f4015b = constraintWidget2;
        int i3 = this.f;
        Dependency dependency = i3 == 0 ? constraintWidget2.d : i3 == 1 ? constraintWidget2.f3963e : null;
        ArrayList<WidgetRun> arrayList = this.k;
        arrayList.add(dependency);
        ConstraintWidget constraintWidgetK = constraintWidget2.k(this.f);
        while (constraintWidgetK != null) {
            int i4 = this.f;
            arrayList.add(i4 == 0 ? constraintWidgetK.d : i4 == 1 ? constraintWidgetK.f3963e : null);
            constraintWidgetK = constraintWidgetK.k(this.f);
        }
        for (WidgetRun widgetRun : arrayList) {
            int i5 = this.f;
            if (i5 == 0) {
                widgetRun.f4015b.f3958b = this;
            } else if (i5 == 1) {
                widgetRun.f4015b.f3960c = this;
            }
        }
        if (this.f == 0 && ((ConstraintWidgetContainer) this.f4015b.K).i0 && arrayList.size() > 1) {
            this.f4015b = ((WidgetRun) a.d(1, arrayList)).f4015b;
        }
        this.f3995l = this.f == 0 ? this.f4015b.Z : this.f4015b.a0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01c9 A[PHI: r1 r28
  0x01c9: PHI (r1v58 int) = (r1v56 int), (r1v61 int) binds: [B:121:0x01c7, B:112:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r28v1 int) = (r28v0 int), (r28v3 int) binds: [B:121:0x01c7, B:112:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x00f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x015d  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax;
        int i13;
        int i14;
        float f3;
        DependencyNode dependencyNode = this.f4018h;
        if (dependencyNode.j) {
            DependencyNode dependencyNode2 = this.f4019i;
            if (dependencyNode2.j) {
                ConstraintWidget constraintWidget = this.f4015b.K;
                boolean z3 = (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? false : ((ConstraintWidgetContainer) constraintWidget).i0;
                int i15 = dependencyNode2.g - dependencyNode.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i16 = 0;
                while (true) {
                    i2 = -1;
                    if (i16 >= size) {
                        i16 = -1;
                        break;
                    } else if (((WidgetRun) arrayList.get(i16)).f4015b.X != 8) {
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = size - 1;
                for (int i18 = i17; i18 >= 0; i18--) {
                    if (((WidgetRun) arrayList.get(i18)).f4015b.X != 8) {
                        i2 = i18;
                        break;
                    }
                }
                int i19 = 0;
                while (true) {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                    if (i19 >= 2) {
                        z2 = z3;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i20 = 0;
                    i5 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (i20 < size) {
                        WidgetRun widgetRun = (WidgetRun) arrayList.get(i20);
                        ConstraintWidget constraintWidget2 = widgetRun.f4015b;
                        boolean z4 = z3;
                        int i23 = i19;
                        if (constraintWidget2.X != 8) {
                            i22++;
                            if (i20 > 0 && i20 >= i16) {
                                i5 += widgetRun.f4018h.f;
                            }
                            DimensionDependency dimensionDependency = widgetRun.f4017e;
                            int i24 = dimensionDependency.g;
                            boolean z5 = widgetRun.d != dimensionBehaviour;
                            if (z5) {
                                int i25 = this.f;
                                if (i25 == 0 && !constraintWidget2.d.f4017e.j) {
                                    return;
                                }
                                if (i25 == 1 && !constraintWidget2.f3963e.f4017e.j) {
                                    return;
                                } else {
                                    i13 = i5;
                                }
                            } else {
                                i13 = i5;
                                if (widgetRun.f4014a == 1 && i23 == 0) {
                                    i14 = dimensionDependency.m;
                                    i21++;
                                } else {
                                    if (dimensionDependency.j) {
                                        i14 = i24;
                                    }
                                    if (z5) {
                                        i5 = i13 + i14;
                                    } else {
                                        i21++;
                                        f3 = constraintWidget2.f3959b0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i5 = i13;
                                    }
                                    if (i20 >= i17 && i20 < i2) {
                                        i5 += -widgetRun.f4019i.f;
                                    }
                                }
                                z5 = true;
                                if (z5) {
                                    i21++;
                                    f3 = constraintWidget2.f3959b0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i13;
                                } else {
                                    i5 = i13 + i14;
                                }
                                if (i20 >= i17) {
                                }
                            }
                            i14 = i24;
                            if (z5) {
                                i21++;
                                f3 = constraintWidget2.f3959b0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i5 = i13;
                            } else {
                                i5 = i13 + i14;
                            }
                            if (i20 >= i17) {
                            }
                        }
                        i20++;
                        z3 = z4;
                        i19 = i23;
                    }
                    z2 = z3;
                    int i26 = i19;
                    if (i5 < i15 || i21 == 0) {
                        i3 = i21;
                        i4 = i22;
                        break;
                    } else {
                        i19 = i26 + 1;
                        z3 = z2;
                    }
                }
                int i27 = dependencyNode.g;
                if (z2) {
                    i27 = dependencyNode2.g;
                }
                float f4 = 0.5f;
                if (i5 > i15) {
                    i27 = z2 ? i27 + ((int) (((i5 - i15) / 2.0f) + 0.5f)) : i27 - ((int) (((i5 - i15) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i15 - i5;
                    int i28 = (int) ((f5 / i3) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        float f6 = f4;
                        WidgetRun widgetRun2 = (WidgetRun) arrayList.get(i29);
                        int i31 = i27;
                        ConstraintWidget constraintWidget3 = widgetRun2.f4015b;
                        int i32 = i3;
                        float f7 = f5;
                        if (constraintWidget3.X != 8 && widgetRun2.d == dimensionBehaviour) {
                            DimensionDependency dimensionDependency2 = widgetRun2.f4017e;
                            if (dimensionDependency2.j) {
                                i11 = i28;
                                i12 = i29;
                            } else {
                                if (f > 0.0f) {
                                    i10 = (int) (((constraintWidget3.f3959b0[this.f] * f7) / f) + f6);
                                    i11 = i28;
                                } else {
                                    i10 = i28;
                                    i11 = i10;
                                }
                                if (this.f == 0) {
                                    int i33 = constraintWidget3.f3967n;
                                    i12 = i29;
                                    iMax = Math.max(constraintWidget3.m, widgetRun2.f4014a == 1 ? Math.min(i10, dimensionDependency2.m) : i10);
                                    if (i33 > 0) {
                                        iMax = Math.min(i33, iMax);
                                    }
                                    if (iMax != i10) {
                                        i30++;
                                        i10 = iMax;
                                    }
                                } else {
                                    i12 = i29;
                                    int i34 = constraintWidget3.q;
                                    iMax = Math.max(constraintWidget3.f3968p, widgetRun2.f4014a == 1 ? Math.min(i10, dimensionDependency2.m) : i10);
                                    if (i34 > 0) {
                                        iMax = Math.min(i34, iMax);
                                    }
                                    if (iMax != i10) {
                                        i30++;
                                        i10 = iMax;
                                    }
                                }
                                dimensionDependency2.d(i10);
                            }
                        } else {
                            i11 = i28;
                            i12 = i29;
                        }
                        i29 = i12 + 1;
                        i27 = i31;
                        f4 = f6;
                        i3 = i32;
                        f5 = f7;
                        i28 = i11;
                    }
                    i6 = i27;
                    f2 = f4;
                    int i35 = i3;
                    if (i30 > 0) {
                        i3 = i35 - i30;
                        i5 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            WidgetRun widgetRun3 = (WidgetRun) arrayList.get(i36);
                            if (widgetRun3.f4015b.X != 8) {
                                if (i36 > 0 && i36 >= i16) {
                                    i5 += widgetRun3.f4018h.f;
                                }
                                i5 += widgetRun3.f4017e.g;
                                if (i36 < i17 && i36 < i2) {
                                    i5 += -widgetRun3.f4019i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i35;
                    }
                    i8 = 2;
                    if (this.f3995l == 2 && i30 == 0) {
                        i7 = 0;
                        this.f3995l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i27;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i15) {
                    this.f3995l = i8;
                }
                if (i4 > 0 && i3 == 0 && i16 == i2) {
                    this.f3995l = i8;
                }
                int i37 = this.f3995l;
                if (i37 == 1) {
                    int i38 = i4 > 1 ? (i15 - i5) / (i4 - 1) : i4 == 1 ? (i15 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i38 = i7;
                    }
                    int i39 = i6;
                    for (int i40 = i7; i40 < size; i40++) {
                        WidgetRun widgetRun4 = (WidgetRun) arrayList.get(z2 ? size - (i40 + 1) : i40);
                        int i41 = widgetRun4.f4015b.X;
                        DependencyNode dependencyNode3 = widgetRun4.f4019i;
                        DependencyNode dependencyNode4 = widgetRun4.f4018h;
                        if (i41 == 8) {
                            dependencyNode4.d(i39);
                            dependencyNode3.d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z2 ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i16) {
                                i39 = z2 ? i39 - dependencyNode4.f : i39 + dependencyNode4.f;
                            }
                            if (z2) {
                                dependencyNode3.d(i39);
                            } else {
                                dependencyNode4.d(i39);
                            }
                            DimensionDependency dimensionDependency3 = widgetRun4.f4017e;
                            int i42 = dimensionDependency3.g;
                            if (widgetRun4.d == dimensionBehaviour) {
                                i9 = i39;
                                if (widgetRun4.f4014a == 1) {
                                    i42 = dimensionDependency3.m;
                                }
                            } else {
                                i9 = i39;
                            }
                            i39 = z2 ? i9 - i42 : i9 + i42;
                            if (z2) {
                                dependencyNode4.d(i39);
                            } else {
                                dependencyNode3.d(i39);
                            }
                            widgetRun4.g = true;
                            if (i40 < i17 && i40 < i2) {
                                i39 = z2 ? i39 - (-dependencyNode3.f) : i39 + (-dependencyNode3.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i43 = (i15 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i43 = i7;
                    }
                    int i44 = i6;
                    for (int i45 = i7; i45 < size; i45++) {
                        WidgetRun widgetRun5 = (WidgetRun) arrayList.get(z2 ? size - (i45 + 1) : i45);
                        int i46 = widgetRun5.f4015b.X;
                        DependencyNode dependencyNode5 = widgetRun5.f4019i;
                        DependencyNode dependencyNode6 = widgetRun5.f4018h;
                        if (i46 == 8) {
                            dependencyNode6.d(i44);
                            dependencyNode5.d(i44);
                        } else {
                            int i47 = z2 ? i44 - i43 : i44 + i43;
                            if (i45 > 0 && i45 >= i16) {
                                i47 = z2 ? i47 - dependencyNode6.f : i47 + dependencyNode6.f;
                            }
                            if (z2) {
                                dependencyNode5.d(i47);
                            } else {
                                dependencyNode6.d(i47);
                            }
                            DimensionDependency dimensionDependency4 = widgetRun5.f4017e;
                            int iMin = dimensionDependency4.g;
                            if (widgetRun5.d == dimensionBehaviour && widgetRun5.f4014a == 1) {
                                iMin = Math.min(iMin, dimensionDependency4.m);
                            }
                            i44 = z2 ? i47 - iMin : i47 + iMin;
                            if (z2) {
                                dependencyNode6.d(i44);
                            } else {
                                dependencyNode5.d(i44);
                            }
                            if (i45 < i17 && i45 < i2) {
                                i44 = z2 ? i44 - (-dependencyNode5.f) : i44 + (-dependencyNode5.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f8 = this.f == 0 ? this.f4015b.f3954U : this.f4015b.f3955V;
                    if (z2) {
                        f8 = 1.0f - f8;
                    }
                    int i48 = (int) (((i15 - i5) * f8) + f2);
                    if (i48 < 0 || i3 > 0) {
                        i48 = i7;
                    }
                    int i49 = z2 ? i6 - i48 : i6 + i48;
                    for (int i50 = i7; i50 < size; i50++) {
                        WidgetRun widgetRun6 = (WidgetRun) arrayList.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = widgetRun6.f4015b.X;
                        DependencyNode dependencyNode7 = widgetRun6.f4019i;
                        DependencyNode dependencyNode8 = widgetRun6.f4018h;
                        if (i51 == 8) {
                            dependencyNode8.d(i49);
                            dependencyNode7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i16) {
                                i49 = z2 ? i49 - dependencyNode8.f : i49 + dependencyNode8.f;
                            }
                            if (z2) {
                                dependencyNode7.d(i49);
                            } else {
                                dependencyNode8.d(i49);
                            }
                            DimensionDependency dimensionDependency5 = widgetRun6.f4017e;
                            int i52 = dimensionDependency5.g;
                            if (widgetRun6.d == dimensionBehaviour && widgetRun6.f4014a == 1) {
                                i52 = dimensionDependency5.m;
                            }
                            i49 = z2 ? i49 - i52 : i49 + i52;
                            if (z2) {
                                dependencyNode8.d(i49);
                            } else {
                                dependencyNode7.d(i49);
                            }
                            if (i50 < i17 && i50 < i2) {
                                i49 = z2 ? i49 - (-dependencyNode7.f) : i49 + (-dependencyNode7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(0)).f4015b;
        ConstraintWidget constraintWidget2 = ((WidgetRun) arrayList.get(size - 1)).f4015b;
        int i2 = this.f;
        DependencyNode dependencyNode = this.f4019i;
        DependencyNode dependencyNode2 = this.f4018h;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.y;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f3944A;
            DependencyNode dependencyNodeI = WidgetRun.i(constraintAnchor, 0);
            int iC = constraintAnchor.c();
            ConstraintWidget constraintWidgetM = m();
            if (constraintWidgetM != null) {
                iC = constraintWidgetM.y.c();
            }
            if (dependencyNodeI != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeI, iC);
            }
            DependencyNode dependencyNodeI2 = WidgetRun.i(constraintAnchor2, 0);
            int iC2 = constraintAnchor2.c();
            ConstraintWidget constraintWidgetN = n();
            if (constraintWidgetN != null) {
                iC2 = constraintWidgetN.f3944A.c();
            }
            if (dependencyNodeI2 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeI2, -iC2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f3971z;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f3945B;
            DependencyNode dependencyNodeI3 = WidgetRun.i(constraintAnchor3, 1);
            int iC3 = constraintAnchor3.c();
            ConstraintWidget constraintWidgetM2 = m();
            if (constraintWidgetM2 != null) {
                iC3 = constraintWidgetM2.f3971z.c();
            }
            if (dependencyNodeI3 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeI3, iC3);
            }
            DependencyNode dependencyNodeI4 = WidgetRun.i(constraintAnchor4, 1);
            int iC4 = constraintAnchor4.c();
            ConstraintWidget constraintWidgetN2 = n();
            if (constraintWidgetN2 != null) {
                iC4 = constraintWidgetN2.f3945B.c();
            }
            if (dependencyNodeI4 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeI4, -iC4);
            }
        }
        dependencyNode2.f4001a = this;
        dependencyNode.f4001a = this;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((WidgetRun) arrayList.get(i2)).e();
            i2++;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f4016c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            WidgetRun widgetRun = (WidgetRun) arrayList.get(i2);
            j = ((long) widgetRun.f4019i.f) + widgetRun.j() + j + ((long) widgetRun.f4018h.f);
        }
        return j;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((WidgetRun) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(i2)).f4015b;
            if (constraintWidget.X != 8) {
                return constraintWidget;
            }
            i2++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(size)).f4015b;
            if (constraintWidget.X != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.k) {
            strConcat = a.m(a.m(strConcat, "<") + widgetRun, "> ");
        }
        return strConcat;
    }
}
