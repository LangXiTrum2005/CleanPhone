package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class RunGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WidgetRun f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4011b;

    public static long a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        ArrayList arrayList = dependencyNode.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = (Dependency) arrayList.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    jMin = Math.min(jMin, a(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f4019i) {
            return jMin;
        }
        long j2 = widgetRun.j();
        DependencyNode dependencyNode3 = widgetRun.f4018h;
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(dependencyNode3, j3)), j3 - ((long) dependencyNode3.f));
    }

    public static long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        ArrayList arrayList = dependencyNode.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = (Dependency) arrayList.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    jMax = Math.max(jMax, b(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f4018h) {
            return jMax;
        }
        long j2 = widgetRun.j();
        DependencyNode dependencyNode3 = widgetRun.f4019i;
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(dependencyNode3, j3)), j3 - ((long) dependencyNode3.f));
    }
}
