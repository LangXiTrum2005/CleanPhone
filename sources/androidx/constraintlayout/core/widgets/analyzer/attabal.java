package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: DimensionDependency.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends DependencyNode {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f8207formularize;

    public attabal(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof dern) {
            this.f8190marial = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f8190marial = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void wireman(int i) {
        if (this.f8192taiyuan) {
            return;
        }
        this.f8192taiyuan = true;
        this.value = i;
        for (empress.wireman wiremanVar : this.f8187cutely) {
            wiremanVar.attabal(wiremanVar);
        }
    }
}
