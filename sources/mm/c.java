package mm;

import cl.h0;
import fm.e;
import kotlin.jvm.internal.n;
import lm.a0;
import lm.i;
import nm.p;
import om.l;
import tl.c0;
import tl.e0;
import tl.k0;
import tl.l0;
import zc.u;
import zk.b0;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends h0 implements b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ul.a f46256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v6.c f46257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f46258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f46259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f46260k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yl.c fqName, l lVar, w module, e0 e0Var, ul.a aVar) {
        super(module, fqName);
        n.f(fqName, "fqName");
        n.f(module, "module");
        this.f46256g = aVar;
        l0 strings = e0Var.f51202d;
        n.e(strings, "proto.strings");
        k0 qualifiedNames = e0Var.f51203e;
        n.e(qualifiedNames, "proto.qualifiedNames");
        n.f(strings, "strings");
        n.f(qualifiedNames, "qualifiedNames");
        v6.c cVar = new v6.c();
        cVar.f52487a = strings;
        cVar.f52488b = qualifiedNames;
        this.f46257h = cVar;
        this.f46258i = new u(e0Var, cVar, aVar, new a0(this));
        this.f46259j = e0Var;
    }

    @Override // zk.b0
    public final im.n A() {
        p pVar = this.f46260k;
        if (pVar != null) {
            return pVar;
        }
        n.l("_memberScope");
        throw null;
    }

    public final void K0(i components) {
        n.f(components, "components");
        e0 e0Var = this.f46259j;
        if (e0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f46259j = null;
        c0 c0Var = e0Var.f51204f;
        n.e(c0Var, "proto.`package`");
        this.f46260k = new p(this, c0Var, this.f46257h, this.f46256g, null, components, "scope of " + this, new al.l(this, 13));
    }

    @Override // cl.h0, cl.p
    public final String toString() {
        return "builtins package fragment for " + this.f6518e + " from " + e.j(this);
    }
}
