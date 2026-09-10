package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;

/* JADX INFO: loaded from: classes.dex */
class GuidelineReference extends WidgetRun {
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        DependencyNode dependencyNode = this.f4018h;
        if (dependencyNode.f4003c && !dependencyNode.j) {
            dependencyNode.d((int) ((((DependencyNode) dependencyNode.f4007l.get(0)).g * ((Guideline) this.f4015b).e0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f4015b;
        Guideline guideline = (Guideline) constraintWidget;
        int i2 = guideline.f0;
        int i3 = guideline.g0;
        int i4 = guideline.i0;
        DependencyNode dependencyNode = this.f4018h;
        if (i4 == 1) {
            if (i2 != -1) {
                dependencyNode.f4007l.add(constraintWidget.K.d.f4018h);
                this.f4015b.K.d.f4018h.k.add(dependencyNode);
                dependencyNode.f = i2;
            } else if (i3 != -1) {
                dependencyNode.f4007l.add(constraintWidget.K.d.f4019i);
                this.f4015b.K.d.f4019i.k.add(dependencyNode);
                dependencyNode.f = -i3;
            } else {
                dependencyNode.f4002b = true;
                dependencyNode.f4007l.add(constraintWidget.K.d.f4019i);
                this.f4015b.K.d.f4019i.k.add(dependencyNode);
            }
            m(this.f4015b.d.f4018h);
            m(this.f4015b.d.f4019i);
            return;
        }
        if (i2 != -1) {
            dependencyNode.f4007l.add(constraintWidget.K.f3963e.f4018h);
            this.f4015b.K.f3963e.f4018h.k.add(dependencyNode);
            dependencyNode.f = i2;
        } else if (i3 != -1) {
            dependencyNode.f4007l.add(constraintWidget.K.f3963e.f4019i);
            this.f4015b.K.f3963e.f4019i.k.add(dependencyNode);
            dependencyNode.f = -i3;
        } else {
            dependencyNode.f4002b = true;
            dependencyNode.f4007l.add(constraintWidget.K.f3963e.f4019i);
            this.f4015b.K.f3963e.f4019i.k.add(dependencyNode);
        }
        m(this.f4015b.f3963e.f4018h);
        m(this.f4015b.f3963e.f4019i);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f4015b;
        int i2 = ((Guideline) constraintWidget).i0;
        DependencyNode dependencyNode = this.f4018h;
        if (i2 == 1) {
            constraintWidget.f3951P = dependencyNode.g;
        } else {
            constraintWidget.f3952Q = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public final void f() {
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
