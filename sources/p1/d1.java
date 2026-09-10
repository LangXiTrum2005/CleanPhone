package p1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f47995b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.u0 f47996a;

    static {
        od.c cVar = new od.c(27, false);
        cVar.f47386b = oa.u0.u(2, 1, 5);
        f47995b = new d1(cVar);
    }

    public d1(od.c cVar) {
        this.f47996a = (oa.u0) cVar.f47386b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d1) && this.f47996a.equals(((d1) obj).f47996a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f47996a, null, null, bool, bool, bool, bool, bool);
    }
}
