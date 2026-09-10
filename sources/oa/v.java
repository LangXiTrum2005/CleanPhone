package oa;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends m1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.j f47334a;

    public v(b2.j jVar) {
        this.f47334a = jVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f47334a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return this.f47334a.equals(((v) obj).f47334a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47334a.hashCode();
    }

    public final String toString() {
        return this.f47334a.toString();
    }
}
