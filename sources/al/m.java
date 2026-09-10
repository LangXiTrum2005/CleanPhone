package al;

import java.util.Map;
import pm.y;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk.h f3650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl.c f3651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3653d;

    public m(wk.h hVar, yl.c fqName, Map map) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        this.f3650a = hVar;
        this.f3651b = fqName;
        this.f3652c = map;
        this.f3653d = r9.b.t(wj.e.f53280a, new l(this, 0));
    }

    @Override // al.c
    public final j0 c() {
        return j0.C9;
    }

    @Override // al.c
    public final Map d() {
        return this.f3652c;
    }

    @Override // al.c
    public final yl.c e() {
        return this.f3651b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wj.d] */
    @Override // al.c
    public final y getType() {
        Object value = this.f3653d.getValue();
        kotlin.jvm.internal.n.e(value, "<get-type>(...)");
        return (y) value;
    }
}
