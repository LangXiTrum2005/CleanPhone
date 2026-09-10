package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        Barrier barrier = (Barrier) this.f4015b;
        int i2 = barrier.g0;
        DependencyNode dependencyNode = this.f4018h;
        Iterator it = dependencyNode.f4007l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((DependencyNode) it.next()).g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            dependencyNode.d(i4 + barrier.i0);
        } else {
            dependencyNode.d(i3 + barrier.i0);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f4015b;
        if (constraintWidget instanceof Barrier) {
            DependencyNode dependencyNode = this.f4018h;
            dependencyNode.f4002b = true;
            Barrier barrier = (Barrier) constraintWidget;
            int i2 = barrier.g0;
            boolean z2 = barrier.h0;
            int i3 = 0;
            if (i2 == 0) {
                dependencyNode.f4004e = DependencyNode.Type.e0;
                while (i3 < barrier.f0) {
                    ConstraintWidget constraintWidget2 = barrier.e0[i3];
                    if (z2 || constraintWidget2.X != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.d.f4018h;
                        dependencyNode2.k.add(dependencyNode);
                        dependencyNode.f4007l.add(dependencyNode2);
                    }
                    i3++;
                }
                m(this.f4015b.d.f4018h);
                m(this.f4015b.d.f4019i);
                return;
            }
            if (i2 == 1) {
                dependencyNode.f4004e = DependencyNode.Type.f0;
                while (i3 < barrier.f0) {
                    ConstraintWidget constraintWidget3 = barrier.e0[i3];
                    if (z2 || constraintWidget3.X != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.d.f4019i;
                        dependencyNode3.k.add(dependencyNode);
                        dependencyNode.f4007l.add(dependencyNode3);
                    }
                    i3++;
                }
                m(this.f4015b.d.f4018h);
                m(this.f4015b.d.f4019i);
                return;
            }
            if (i2 == 2) {
                dependencyNode.f4004e = DependencyNode.Type.g0;
                while (i3 < barrier.f0) {
                    ConstraintWidget constraintWidget4 = barrier.e0[i3];
                    if (z2 || constraintWidget4.X != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f3963e.f4018h;
                        dependencyNode4.k.add(dependencyNode);
                        dependencyNode.f4007l.add(dependencyNode4);
                    }
                    i3++;
                }
                m(this.f4015b.f3963e.f4018h);
                m(this.f4015b.f3963e.f4019i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            dependencyNode.f4004e = DependencyNode.Type.h0;
            while (i3 < barrier.f0) {
                ConstraintWidget constraintWidget5 = barrier.e0[i3];
                if (z2 || constraintWidget5.X != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f3963e.f4019i;
                    dependencyNode5.k.add(dependencyNode);
                    dependencyNode.f4007l.add(dependencyNode5);
                }
                i3++;
            }
            m(this.f4015b.f3963e.f4018h);
            m(this.f4015b.f3963e.f4019i);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f4015b;
        if (constraintWidget instanceof Barrier) {
            int i2 = ((Barrier) constraintWidget).g0;
            DependencyNode dependencyNode = this.f4018h;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.f3951P = dependencyNode.g;
            } else {
                constraintWidget.f3952Q = dependencyNode.g;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
        this.f4016c = null;
        this.f4018h.c();
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f4018h;
        dependencyNode2.k.add(dependencyNode);
        dependencyNode.f4007l.add(dependencyNode2);
    }
}
