package x4;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.b f53614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f53615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f53616c;

    public c(u4.b bVar, b bVar2, b bVar3) {
        int i10 = bVar.f51880b;
        this.f53614a = bVar;
        this.f53615b = bVar2;
        this.f53616c = bVar3;
        int i11 = bVar.f51881c;
        int i12 = bVar.f51879a;
        if (i11 - i12 == 0 && bVar.f51882d - i10 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i12 != 0 && i10 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.d(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return n.a(this.f53614a, cVar.f53614a) && n.a(this.f53615b, cVar.f53615b) && n.a(this.f53616c, cVar.f53616c);
    }

    public final int hashCode() {
        return this.f53616c.hashCode() + ((this.f53615b.hashCode() + (this.f53614a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f53614a + ", type=" + this.f53615b + ", state=" + this.f53616c + " }";
    }
}
