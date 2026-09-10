package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f44765a;

    public t(Class jClass, String str) {
        n.f(jClass, "jClass");
        this.f44765a = jClass;
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f44765a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return n.a(this.f44765a, ((t) obj).f44765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44765a.hashCode();
    }

    public final String toString() {
        return this.f44765a.toString() + " (Kotlin reflection is not available)";
    }
}
