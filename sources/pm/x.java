package pm;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements n0, sm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f48484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f48485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48486c;

    public x(AbstractCollection typesToIntersect) {
        kotlin.jvm.internal.n.f(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f48485b = linkedHashSet;
        this.f48486c = linkedHashSet.hashCode();
    }

    public final c0 b() {
        j0.f48443b.getClass();
        return f.t(j0.f48444c, this, xj.v.f53866a, false, android.support.v4.media.session.a.l("member scope for intersection type", this.f48485b), new al.f(this, 20));
    }

    public final String c(jk.b getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.n.f(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return xj.n.u0(xj.n.I0(this.f48485b, new v(getProperTypeRelatedToStringify)), " & ", "{", "}", new al.f(getProperTypeRelatedToStringify, 21), 24);
    }

    @Override // pm.n0
    public final wk.h d() {
        wk.h hVarD = ((y) this.f48485b.iterator().next()).P().d();
        kotlin.jvm.internal.n.e(hVarD, "intersectedTypes.iterato…xt().constructor.builtIns");
        return hVarD;
    }

    @Override // pm.n0
    public final zk.g e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return kotlin.jvm.internal.n.a(this.f48485b, ((x) obj).f48485b);
    }

    @Override // pm.n0
    public final Collection f() {
        return this.f48485b;
    }

    @Override // pm.n0
    public final boolean g() {
        return false;
    }

    @Override // pm.n0
    public final List getParameters() {
        return xj.v.f53866a;
    }

    public final int hashCode() {
        return this.f48486c;
    }

    public final String toString() {
        return c(w.f48481e);
    }
}
