package androidx.constraintlayout.solver.widgets.analyzer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class DimensionDependency extends DependencyNode {
    public int m;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f4004e = DependencyNode.Type.f4008Y;
        } else {
            this.f4004e = DependencyNode.Type.Z;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
    public final void d(int i2) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i2;
        for (Dependency dependency : this.k) {
            dependency.a(dependency);
        }
    }
}
