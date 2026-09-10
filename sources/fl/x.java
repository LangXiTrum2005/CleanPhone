package fl;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends r implements pl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.c f41010a;

    public x(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        this.f41010a = fqName;
    }

    @Override // pl.b
    public final d a(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return kotlin.jvm.internal.n.a(this.f41010a, ((x) obj).f41010a);
        }
        return false;
    }

    @Override // pl.b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return xj.v.f53866a;
    }

    public final int hashCode() {
        return this.f41010a.hashCode();
    }

    public final String toString() {
        return x.class.getName() + ": " + this.f41010a;
    }
}
