package ml;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends ym.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk.e f46170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f46171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f46172d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(zk.e eVar, Set set, jk.b bVar) {
        this.f46170b = eVar;
        this.f46171c = set;
        this.f46172d = (kotlin.jvm.internal.o) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [jk.b, kotlin.jvm.internal.o] */
    @Override // ym.l
    public final boolean c(Object obj) {
        zk.e current = (zk.e) obj;
        kotlin.jvm.internal.n.f(current, "current");
        if (current == this.f46170b) {
            return true;
        }
        im.n nVarG0 = current.g0();
        kotlin.jvm.internal.n.e(nVarG0, "current.staticScope");
        if (!(nVarG0 instanceof f0)) {
            return true;
        }
        this.f46171c.addAll((Collection) this.f46172d.invoke(nVarG0));
        return false;
    }

    @Override // ym.l
    public final /* bridge */ /* synthetic */ Object i() {
        return wj.r.f53297a;
    }
}
