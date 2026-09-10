package cl;

import com.google.android.gms.internal.ads.u22;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends p implements zk.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.l f6498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wk.h f6499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f6500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f6501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n5.f f6502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk.d0 f6503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final om.e f6505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wj.j f6506k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yl.f moduleName, om.l lVar, wk.h hVar, int i10) {
        super(al.i.f3645a, moduleName);
        kotlin.jvm.internal.n.f(moduleName, "moduleName");
        this.f6498c = lVar;
        this.f6499d = hVar;
        if (!moduleName.f54515b) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f6500e = xj.w.f53867a;
        k0.f6534a.getClass();
        k0 k0Var = (k0) n0(i0.f6524b);
        this.f6501f = k0Var == null ? j0.f6527b : k0Var;
        this.f6504i = true;
        this.f6505j = lVar.b(new al.f(this, 4));
        this.f6506k = r9.b.u(new e0(this, 0));
    }

    @Override // zk.w
    public final zk.e0 F(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        I0();
        return (zk.e0) this.f6505j.invoke(fqName);
    }

    public final void I0() {
        if (this.f6504i) {
            return;
        }
        if (n0(zk.u.f55001a) != null) {
            throw new ClassCastException();
        }
        String message = "Accessing invalid module descriptor " + this;
        kotlin.jvm.internal.n.f(message, "message");
        throw new u22(message);
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.p(this, obj);
    }

    @Override // zk.w
    public final wk.h d() {
        return this.f6499d;
    }

    @Override // zk.j
    public final zk.j e() {
        return null;
    }

    @Override // zk.w
    public final Collection h(yl.c fqName, jk.b bVar) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        I0();
        I0();
        return ((o) this.f6506k.getValue()).h(fqName, bVar);
    }

    @Override // zk.w
    public final Object n0(hn.u capability) {
        kotlin.jvm.internal.n.f(capability, "capability");
        Object obj = this.f6500e.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // zk.w
    public final List r0() {
        if (this.f6502g != null) {
            return xj.v.f53866a;
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().f54514a;
        kotlin.jvm.internal.n.e(str, "name.toString()");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // cl.p
    public final String toString() {
        String strH0 = p.H0(this);
        return this.f6504i ? strH0 : strH0.concat(" !isValid");
    }

    @Override // zk.w
    public final boolean w0(zk.w targetModule) {
        kotlin.jvm.internal.n.f(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        kotlin.jvm.internal.n.c(this.f6502g);
        if (xj.n.i0(xj.x.f53868a, targetModule)) {
            return true;
        }
        r0();
        return targetModule.r0().contains(this);
    }
}
