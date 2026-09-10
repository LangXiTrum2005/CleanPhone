package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements Dependency {
    public final WidgetRun d;
    public int f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WidgetRun f4001a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4002b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4003c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Type f4004e = Type.X;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4005h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DimensionDependency f4006i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4007l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Type f4008Y;
        public static final Type Z;
        public static final Type e0;
        public static final Type f0;
        public static final Type g0;
        public static final Type h0;
        public static final Type i0;
        public static final /* synthetic */ Type[] j0;

        static {
            Type type = new Type("UNKNOWN", 0);
            X = type;
            Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
            f4008Y = type2;
            Type type3 = new Type("VERTICAL_DIMENSION", 2);
            Z = type3;
            Type type4 = new Type("LEFT", 3);
            e0 = type4;
            Type type5 = new Type("RIGHT", 4);
            f0 = type5;
            Type type6 = new Type("TOP", 5);
            g0 = type6;
            Type type7 = new Type("BOTTOM", 6);
            h0 = type7;
            Type type8 = new Type("BASELINE", 7);
            i0 = type8;
            j0 = new Type[]{type, type2, type3, type4, type5, type6, type7, type8};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) j0.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        ArrayList<DependencyNode> arrayList = this.f4007l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).j) {
                return;
            }
        }
        this.f4003c = true;
        WidgetRun widgetRun = this.f4001a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.f4002b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i2 = 0;
        for (DependencyNode dependencyNode2 : arrayList) {
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i2++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i2 == 1 && dependencyNode.j) {
            DimensionDependency dimensionDependency = this.f4006i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.j) {
                    return;
                } else {
                    this.f = this.f4005h * dimensionDependency.g;
                }
            }
            d(dependencyNode.g + this.f);
        }
        WidgetRun widgetRun2 = this.f4001a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(WidgetRun widgetRun) {
        this.k.add(widgetRun);
        if (this.j) {
            widgetRun.a(widgetRun);
        }
    }

    public final void c() {
        this.f4007l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f4003c = false;
        this.f4002b = false;
    }

    public void d(int i2) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i2;
        for (Dependency dependency : this.k) {
            dependency.a(dependency);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f4015b.f3956Y);
        sb.append(":");
        sb.append(this.f4004e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4007l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
