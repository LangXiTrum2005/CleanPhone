package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends ak.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f6788b = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6789a;

    public z(String str) {
        super(f6788b);
        this.f6789a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.n.a(this.f6789a, ((z) obj).f6789a);
    }

    public final int hashCode() {
        return this.f6789a.hashCode();
    }

    public final String toString() {
        return wi.d.k(new StringBuilder("CoroutineName("), this.f6789a, ')');
    }
}
