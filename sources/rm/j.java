package rm;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends e {
    @Override // rm.e, im.n
    public final /* bridge */ /* synthetic */ Collection a(yl.f fVar, hl.b bVar) {
        a(fVar, bVar);
        throw null;
    }

    @Override // rm.e, im.n
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // rm.e, im.p
    public final zk.g c(yl.f name, hl.b location) {
        n.f(name, "name");
        n.f(location, "location");
        throw new IllegalStateException(this.f49662b + ", required name: " + name);
    }

    @Override // rm.e, im.p
    public final Collection d(im.f kindFilter, jk.b bVar) {
        n.f(kindFilter, "kindFilter");
        throw new IllegalStateException(this.f49662b);
    }

    @Override // rm.e, im.n
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // rm.e, im.n
    public final /* bridge */ /* synthetic */ Collection f(yl.f fVar, hl.b bVar) {
        f(fVar, bVar);
        throw null;
    }

    @Override // rm.e, im.n
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // rm.e
    /* JADX INFO: renamed from: h */
    public final Set a(yl.f name, hl.b bVar) {
        n.f(name, "name");
        throw new IllegalStateException(this.f49662b + ", required name: " + name);
    }

    @Override // rm.e
    /* JADX INFO: renamed from: i */
    public final Set f(yl.f name, hl.b bVar) {
        n.f(name, "name");
        throw new IllegalStateException(this.f49662b + ", required name: " + name);
    }

    @Override // rm.e
    public final String toString() {
        return wi.d.k(new StringBuilder("ThrowingScope{"), this.f49662b, '}');
    }
}
