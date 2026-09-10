package lm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.b f45531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f45532b;

    public f(yl.b classId, d dVar) {
        kotlin.jvm.internal.n.f(classId, "classId");
        this.f45531a = classId;
        this.f45532b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return kotlin.jvm.internal.n.a(this.f45531a, ((f) obj).f45531a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45531a.hashCode();
    }
}
