package x4;

import java.util.List;
import xj.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53627a;

    public i(List list) {
        this.f53627a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i.class.equals(obj.getClass())) {
            return false;
        }
        return this.f53627a.equals(((i) obj).f53627a);
    }

    public final int hashCode() {
        return this.f53627a.hashCode();
    }

    public final String toString() {
        return n.u0((Iterable) this.f53627a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
