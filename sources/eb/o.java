package eb;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f40004b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f40005a = new AtomicReference(new i0(new zc.u(4)));

    static {
        try {
            o oVar = new o();
            oVar.d(new d(h.class, new com.unity3d.ads.adplayer.b(12)));
            f40004b = oVar;
        } catch (Exception e10) {
            throw new aa.b(e10, 11);
        }
    }

    public final qk.i0 a(c0 c0Var) throws GeneralSecurityException {
        i0 i0Var = (i0) this.f40005a.get();
        i0Var.getClass();
        g0 g0Var = new g0(c0Var.getClass(), c0Var.f39968b);
        HashMap map = i0Var.f39991b;
        if (map.containsKey(g0Var)) {
            return ((b) map.get(g0Var)).f39966b.a(c0Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + g0Var + " available");
    }

    public final va.i b(d0 d0Var) throws GeneralSecurityException {
        i0 i0Var = (i0) this.f40005a.get();
        i0Var.getClass();
        g0 g0Var = new g0(d0.class, (lb.a) d0Var.f39976b);
        HashMap map = i0Var.f39993d;
        if (map.containsKey(g0Var)) {
            return ((q) map.get(g0Var)).f40008b.b(d0Var);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + g0Var + " available");
    }

    public final synchronized void c(b bVar) {
        zc.u uVar = new zc.u((i0) this.f40005a.get());
        uVar.A(bVar);
        this.f40005a.set(new i0(uVar));
    }

    public final synchronized void d(d dVar) {
        zc.u uVar = new zc.u((i0) this.f40005a.get());
        uVar.B(dVar);
        this.f40005a.set(new i0(uVar));
    }

    public final synchronized void e(q qVar) {
        zc.u uVar = new zc.u((i0) this.f40005a.get());
        uVar.C(qVar);
        this.f40005a.set(new i0(uVar));
    }

    public final synchronized void f(s sVar) {
        zc.u uVar = new zc.u((i0) this.f40005a.get());
        uVar.D(sVar);
        this.f40005a.set(new i0(uVar));
    }

    public final f0 g(qk.i0 i0Var) throws GeneralSecurityException {
        i0 i0Var2 = (i0) this.f40005a.get();
        i0Var2.getClass();
        h0 h0Var = new h0(i0Var.getClass(), c0.class);
        HashMap map = i0Var2.f39990a;
        if (map.containsKey(h0Var)) {
            return ((d) map.get(h0Var)).f39974b.h(i0Var);
        }
        throw new GeneralSecurityException("No Key serializer for " + h0Var + " available");
    }

    public final f0 h(va.i iVar) throws GeneralSecurityException {
        i0 i0Var = (i0) this.f40005a.get();
        i0Var.getClass();
        h0 h0Var = new h0(iVar.getClass(), d0.class);
        HashMap map = i0Var.f39992c;
        if (map.containsKey(h0Var)) {
            return ((s) map.get(h0Var)).f40010b.f(iVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + h0Var + " available");
    }
}
