package f2;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1.g f40508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a4.a f40509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u1.h f40510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ea.b0 f40511k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i1.p f40512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40513n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f40514o = C.TIME_UNSET;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f40515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f40516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n1.z f40518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i1.y f40519t;

    public x0(i1.y yVar, n1.g gVar, a4.a aVar, u1.h hVar, ea.b0 b0Var, int i10, i1.p pVar) {
        this.f40519t = yVar;
        this.f40508h = gVar;
        this.f40509i = aVar;
        this.f40510j = hVar;
        this.f40511k = b0Var;
        this.l = i10;
        this.f40512m = pVar;
    }

    @Override // f2.a
    public final a0 c(c0 c0Var, v9.e eVar, long j10) {
        n1.h hVarCreateDataSource = this.f40508h.createDataSource();
        n1.z zVar = this.f40518s;
        if (zVar != null) {
            hVarCreateDataSource.c(zVar);
        }
        i1.v vVar = k().f42714b;
        vVar.getClass();
        Uri uri = vVar.f42704a;
        this.f40278g.getClass();
        return new v0(uri, hVarCreateDataSource, new g9.k((n2.n) this.f40509i.f3382b), this.f40510j, new i0(this.f40275d.f40371c, 0, c0Var), this.f40511k, a(c0Var), this, eVar, this.l, this.f40512m, l1.y.M(vVar.f42708e), null);
    }

    @Override // f2.a
    public final synchronized i1.y k() {
        return this.f40519t;
    }

    @Override // f2.a
    public final void p(n1.z zVar) {
        this.f40518s = zVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        q1.j jVar = this.f40278g;
        jVar.getClass();
        u1.h hVar = this.f40510j;
        hVar.a(looperMyLooper, jVar);
        hVar.c();
        x();
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        v0 v0Var = (v0) a0Var;
        if (v0Var.f40496x) {
            for (b1 b1Var : v0Var.f40493u) {
                b1Var.k();
                na.g gVar = b1Var.f40286h;
                if (gVar != null) {
                    gVar.D(b1Var.f40283e);
                    b1Var.f40286h = null;
                    b1Var.f40285g = null;
                }
            }
        }
        v0Var.l.d(v0Var);
        v0Var.f40489q.removeCallbacksAndMessages(null);
        v0Var.f40490r = null;
        v0Var.P = true;
    }

    @Override // f2.a
    public final void t() {
        this.f40510j.release();
    }

    @Override // f2.a
    public final synchronized void w(i1.y yVar) {
        this.f40519t = yVar;
    }

    public final void x() {
        i1.p0 g1Var = new g1(this.f40514o, this.f40515p, this.f40516q, k());
        if (this.f40513n) {
            g1Var = new b2.y(g1Var, 1);
        }
        q(g1Var);
    }

    public final void y(long j10, n2.t tVar, boolean z10) {
        if (this.f40517r && tVar.a()) {
            return;
        }
        this.f40517r = !tVar.a();
        if (j10 == C.TIME_UNSET) {
            j10 = this.f40514o;
        }
        boolean zIsSeekable = tVar.isSeekable();
        if (!this.f40513n && this.f40514o == j10 && this.f40515p == zIsSeekable && this.f40516q == z10) {
            return;
        }
        this.f40514o = j10;
        this.f40515p = zIsSeekable;
        this.f40516q = z10;
        this.f40513n = false;
        x();
    }

    @Override // f2.a
    public final void m() {
    }
}
