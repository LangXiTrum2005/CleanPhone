package yk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.b f54444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl.b f54445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl.b f54446c;

    public c(yl.b bVar, yl.b bVar2, yl.b bVar3) {
        this.f54444a = bVar;
        this.f54445b = bVar2;
        this.f54446c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.n.a(this.f54444a, cVar.f54444a) && kotlin.jvm.internal.n.a(this.f54445b, cVar.f54445b) && kotlin.jvm.internal.n.a(this.f54446c, cVar.f54446c);
    }

    public final int hashCode() {
        return this.f54446c.hashCode() + ((this.f54445b.hashCode() + (this.f54444a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f54444a + ", kotlinReadOnly=" + this.f54445b + ", kotlinMutable=" + this.f54446c + ')';
    }
}
