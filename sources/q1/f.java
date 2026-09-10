package q1;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.consent_sdk.x;
import f2.c0;
import f2.j0;
import i1.a0;
import i1.g0;
import i1.h0;
import i1.i0;
import i1.k0;
import i1.n0;
import i1.o0;
import i1.p0;
import i1.v0;
import i1.z0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import l1.k;
import l1.u;
import l1.w;
import l1.y;
import oa.f0;
import oa.n1;
import oa.s1;
import p1.b0;
import p1.q;
import p1.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i0, j0, u1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f48529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f48530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f48531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f48532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f48533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mk0 f48534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0 f48535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f48536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f48537i;

    public f(u uVar) {
        uVar.getClass();
        this.f48529a = uVar;
        String str = y.f44830a;
        Looper looperMyLooper = Looper.myLooper();
        this.f48534f = new mk0((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread(), 2);
        n0 n0Var = new n0();
        this.f48530b = n0Var;
        this.f48531c = new o0();
        x xVar = new x();
        xVar.f23260a = n0Var;
        f0 f0Var = oa.j0.f47265b;
        xVar.f23261b = n1.f47281e;
        xVar.f23262c = s1.f47307g;
        this.f48532d = xVar;
        this.f48533e = new SparseArray();
    }

    @Override // f2.j0
    public final void A(int i10, c0 c0Var, f2.u uVar, c2.g gVar, IOException iOException, boolean z10) {
        a aVarG = G(i10, c0Var);
        I(aVarG, 1003, new k3.j(aVarG, uVar, gVar, iOException, z10));
    }

    @Override // f2.j0
    public final void B(int i10, c0 c0Var, c2.g gVar) {
        I(G(i10, c0Var), 1005, new d(16));
    }

    @Override // i1.i0
    public final void C(boolean z10) {
        I(D(), 7, new ni.g(14));
    }

    public final a D() {
        return E((c0) this.f48532d.f23263d);
    }

    public final a E(c0 c0Var) {
        this.f48535g.getClass();
        p0 p0Var = c0Var == null ? null : (p0) ((s1) this.f48532d.f23262c).get(c0Var);
        if (c0Var != null && p0Var != null) {
            return F(p0Var, p0Var.g(c0Var.f40307a, this.f48530b).f42584c, c0Var);
        }
        int iM0 = ((b0) this.f48535g).M0();
        p0 p0VarQ0 = ((b0) this.f48535g).Q0();
        if (iM0 >= p0VarQ0.o()) {
            p0VarQ0 = p0.f42656a;
        }
        return F(p0VarQ0, iM0, null);
    }

    public final a F(p0 p0Var, int i10, c0 c0Var) {
        c0 c0Var2 = p0Var.p() ? null : c0Var;
        this.f48529a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = p0Var.equals(((b0) this.f48535g).Q0()) && i10 == ((b0) this.f48535g).M0();
        long jZ = 0;
        if (c0Var2 == null || !c0Var2.b()) {
            if (z10) {
                b0 b0Var = (b0) this.f48535g;
                b0Var.l1();
                jZ = b0Var.J0(b0Var.f47941h0);
            } else if (!p0Var.p()) {
                jZ = y.Z(p0Var.m(i10, this.f48531c, 0L).l);
            }
        } else if (z10 && ((b0) this.f48535g).K0() == c0Var2.f40308b && ((b0) this.f48535g).L0() == c0Var2.f40309c) {
            jZ = ((b0) this.f48535g).O0();
        }
        long j10 = jZ;
        c0 c0Var3 = (c0) this.f48532d.f23263d;
        p0 p0VarQ0 = ((b0) this.f48535g).Q0();
        int iM0 = ((b0) this.f48535g).M0();
        long jO0 = ((b0) this.f48535g).O0();
        b0 b0Var2 = (b0) this.f48535g;
        b0Var2.l1();
        return new a(jElapsedRealtime, p0Var, i10, c0Var2, j10, p0VarQ0, iM0, c0Var3, jO0, y.Z(b0Var2.f47941h0.f48195r));
    }

    public final a G(int i10, c0 c0Var) {
        this.f48535g.getClass();
        if (c0Var != null) {
            return ((p0) ((s1) this.f48532d.f23262c).get(c0Var)) != null ? E(c0Var) : F(p0.f42656a, i10, c0Var);
        }
        p0 p0VarQ0 = ((b0) this.f48535g).Q0();
        if (i10 >= p0VarQ0.o()) {
            p0VarQ0 = p0.f42656a;
        }
        return F(p0VarQ0, i10, null);
    }

    public final a H() {
        return E((c0) this.f48532d.f23265f);
    }

    public final void I(a aVar, int i10, k kVar) {
        this.f48533e.put(i10, aVar);
        this.f48534f.e(i10, kVar);
    }

    public final void J(b0 b0Var, Looper looper) {
        go.k.t(this.f48535g == null || ((oa.j0) this.f48532d.f23261b).isEmpty());
        b0Var.getClass();
        this.f48535g = b0Var;
        this.f48536h = this.f48529a.a(looper, null);
        mk0 mk0Var = this.f48534f;
        cj.h hVar = new cj.h(23, this, b0Var);
        mk0Var.getClass();
        u uVar = this.f48529a;
        go.k.t(uVar != null);
        this.f48534f = new mk0((CopyOnWriteArraySet) mk0Var.f17464f, looper, looper.getThread(), uVar, hVar, mk0Var.f17460b);
    }

    @Override // i1.i0
    public final void a(z0 z0Var) {
        a aVarH = H();
        I(aVarH, 25, new s(aVarH, z0Var));
    }

    @Override // i1.i0
    public final void b(int i10) {
        I(D(), 6, new ni.g(16));
    }

    @Override // i1.i0
    public final void c(a0 a0Var) {
        I(D(), 14, new d(14));
    }

    @Override // i1.i0
    public final void d(h0 h0Var) {
        I(D(), 13, new d(23));
    }

    @Override // i1.i0
    public final void e(k1.c cVar) {
        I(D(), 27, new d(4));
    }

    @Override // i1.i0
    public final void f(i1.c0 c0Var) {
        I(D(), 28, new ni.g(13));
    }

    @Override // i1.i0
    public final void g(int i10) {
        I(H(), 21, new d(11));
    }

    @Override // i1.i0
    public final void h(g0 g0Var) {
        I(D(), 12, new ni.g(19));
    }

    @Override // i1.i0
    public final void i(int i10) {
        I(D(), 4, new ni.g(23));
    }

    @Override // i1.i0
    public final void j(int i10) {
        k0 k0Var = this.f48535g;
        k0Var.getClass();
        x xVar = this.f48532d;
        xVar.f23263d = x.h(k0Var, (oa.j0) xVar.f23261b, (c0) xVar.f23264e, (n0) xVar.f23260a);
        xVar.D(((b0) k0Var).Q0());
        I(D(), 0, new d(24));
    }

    @Override // f2.j0
    public final void l(int i10, c0 c0Var, f2.u uVar, c2.g gVar) {
        I(G(i10, c0Var), 1001, new d(8));
    }

    @Override // i1.i0
    public final void m(boolean z10) {
        I(H(), 23, new d(18));
    }

    @Override // i1.i0
    public final void n(int i10, i1.j0 j0Var, i1.j0 j0Var2) {
        if (i10 == 1) {
            this.f48537i = false;
        }
        k0 k0Var = this.f48535g;
        k0Var.getClass();
        x xVar = this.f48532d;
        xVar.f23263d = x.h(k0Var, (oa.j0) xVar.f23261b, (c0) xVar.f23264e, (n0) xVar.f23260a);
        a aVarD = D();
        I(aVarD, 11, new q(aVarD, i10, j0Var, j0Var2));
    }

    @Override // i1.i0
    public final void o(i1.e eVar) {
        I(H(), 20, new ni.g(12));
    }

    @Override // i1.i0
    public final void onCues(List list) {
        a aVarD = D();
        I(aVarD, 27, new n7.a(aVarD, list));
    }

    @Override // i1.i0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        I(D(), -1, new ni.g(11));
    }

    @Override // i1.i0
    public final void onRepeatModeChanged(int i10) {
        I(D(), 8, new d(15));
    }

    @Override // i1.i0
    public final void p(i1.f0 f0Var) {
        c0 c0Var;
        a aVarD = (!(f0Var instanceof p1.h) || (c0Var = ((p1.h) f0Var).f48040h) == null) ? D() : E(c0Var);
        I(aVarD, 10, new k3.j(aVarD, f0Var, 20));
    }

    @Override // i1.i0
    public final void q(int i10, int i11) {
        I(H(), 24, new ni.g(28));
    }

    @Override // i1.i0
    public final void r(boolean z10) {
        I(D(), 3, new d(21));
    }

    @Override // i1.i0
    public final void s(int i10, boolean z10) {
        I(D(), 5, new ni.g(20));
    }

    @Override // i1.i0
    public final void t(float f10) {
        I(H(), 22, new d(2));
    }

    @Override // i1.i0
    public final void u(i1.f0 f0Var) {
        c0 c0Var;
        I((!(f0Var instanceof p1.h) || (c0Var = ((p1.h) f0Var).f48040h) == null) ? D() : E(c0Var), 10, new ni.g(18));
    }

    @Override // f2.j0
    public final void v(int i10, c0 c0Var, c2.g gVar) {
        a aVarG = G(i10, c0Var);
        I(aVarG, 1004, new cj.h(24, aVarG, gVar));
    }

    @Override // i1.i0
    public final void w(v0 v0Var) {
        I(D(), 2, new ni.g(26));
    }

    @Override // i1.i0
    public final void x(i1.y yVar, int i10) {
        I(D(), 1, new d(25));
    }

    @Override // f2.j0
    public final void y(int i10, c0 c0Var, f2.u uVar, c2.g gVar) {
        I(G(i10, c0Var), 1002, new d(6));
    }

    @Override // f2.j0
    public final void z(int i10, c0 c0Var, f2.u uVar, c2.g gVar, int i11) {
        I(G(i10, c0Var), 1000, new ni.g(29));
    }

    @Override // i1.i0
    public final void k() {
    }
}
