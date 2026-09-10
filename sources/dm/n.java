package dm;

import com.ironsource.X3;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import pm.j0;
import pm.n0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f38958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj.j f38959b;

    public n(Set set) {
        j0.f48443b.getClass();
        j0 attributes = j0.f48444c;
        kotlin.jvm.internal.n.f(attributes, "attributes");
        pm.f.s(rm.i.a(2, true, "unknown integer literal type"), xj.v.f53866a, attributes, this, false);
        this.f38959b = r9.b.u(new l(0));
        this.f38958a = set;
    }

    @Override // pm.n0
    public final wk.h d() {
        throw null;
    }

    @Override // pm.n0
    public final zk.g e() {
        return null;
    }

    @Override // pm.n0
    public final Collection f() {
        return (List) this.f38959b.getValue();
    }

    @Override // pm.n0
    public final boolean g() {
        return false;
    }

    @Override // pm.n0
    public final List getParameters() {
        return xj.v.f53866a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append(X3.j.f27834d + xj.n.u0(this.f38958a, ",", null, null, m.f38957e, 30) + ']');
        return sb2.toString();
    }
}
