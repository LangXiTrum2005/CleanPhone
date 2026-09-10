package v1;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import f2.a0;
import f2.c0;
import f2.g1;
import f2.i0;
import i1.v;
import i1.y;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.z;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends f2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f52370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final na.g f52371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f52372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u1.h f52373k;
    public final b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f52374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f52375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1.d f52376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f52377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i1.u f52378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f52379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y f52380s;

    static {
        i1.z.a("media3.exoplayer.hls");
    }

    public m(y yVar, na.g gVar, c cVar, b0 b0Var, u1.h hVar, b0 b0Var2, w1.d dVar, long j10, boolean z10, int i10) {
        this.f52380s = yVar;
        this.f52378q = yVar.f42715c;
        this.f52371i = gVar;
        this.f52370h = cVar;
        this.f52372j = b0Var;
        this.f52373k = hVar;
        this.l = b0Var2;
        this.f52376o = dVar;
        this.f52377p = j10;
        this.f52374m = z10;
        this.f52375n = i10;
    }

    public static w1.h x(long j10, List list) {
        w1.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            w1.h hVar2 = (w1.h) list.get(i10);
            long j11 = hVar2.f52821e;
            if (j11 > j10 || !hVar2.l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
        }
        return hVar;
    }

    @Override // f2.a
    public final a0 c(c0 c0Var, v9.e eVar, long j10) {
        i0 i0VarA = a(c0Var);
        i0 i0Var = new i0(this.f40275d.f40371c, 0, c0Var);
        z zVar = this.f52379r;
        q1.j jVar = this.f40278g;
        jVar.getClass();
        return new l(this.f52370h, this.f52376o, this.f52371i, zVar, this.f52373k, i0Var, this.l, i0VarA, eVar, this.f52372j, this.f52374m, this.f52375n, jVar);
    }

    @Override // f2.a
    public final synchronized y k() {
        return this.f52380s;
    }

    @Override // f2.a
    public final void m() throws IOException {
        w1.d dVar = this.f52376o;
        j2.m mVar = dVar.f52763g;
        if (mVar != null) {
            mVar.maybeThrowError();
        }
        Uri uri = dVar.f52767k;
        if (uri != null) {
            w1.c cVar = (w1.c) dVar.f52760d.get(uri);
            cVar.f52746b.maybeThrowError();
            IOException iOException = cVar.f52754j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // f2.a
    public final void p(z zVar) {
        this.f52379r = zVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        q1.j jVar = this.f40278g;
        jVar.getClass();
        u1.h hVar = this.f52373k;
        hVar.a(looperMyLooper, jVar);
        hVar.c();
        i0 i0VarA = a(null);
        v vVar = k().f42714b;
        vVar.getClass();
        Uri uri = vVar.f42704a;
        w1.d dVar = this.f52376o;
        dVar.getClass();
        dVar.f52764h = l1.y.q(null);
        dVar.f52762f = i0VarA;
        dVar.f52765i = this;
        Map map = Collections.EMPTY_MAP;
        go.k.o(uri, "The uri must be set.");
        j2.q qVar = new j2.q(((n1.g) dVar.f52757a.f46631b).createDataSource(), new n1.k(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f52758b.d());
        go.k.t(dVar.f52763g == null);
        j2.m mVar = new j2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.f52763g = mVar;
        mVar.e(qVar, dVar, dVar.f52759c.j(qVar.f43680c));
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        l lVar = (l) a0Var;
        lVar.f52349b.f52761e.remove(lVar);
        for (r rVar : lVar.f52366t) {
            if (rVar.D) {
                for (q qVar : rVar.f52413v) {
                    qVar.k();
                    na.g gVar = qVar.f40286h;
                    if (gVar != null) {
                        gVar.D(qVar.f40283e);
                        qVar.f40286h = null;
                        qVar.f40285g = null;
                    }
                }
            }
            i iVar = rVar.f52396d;
            w1.c cVar = (w1.c) iVar.f52318g.f52760d.get(iVar.f52316e[iVar.f52328r.getSelectedIndexInTrackGroup()]);
            if (cVar != null) {
                cVar.f52755k = false;
            }
            iVar.f52324n = null;
            rVar.f52402j.d(rVar);
            rVar.f52409r.removeCallbacksAndMessages(null);
            rVar.H = true;
            rVar.f52410s.clear();
        }
        lVar.f52363q = null;
    }

    @Override // f2.a
    public final void t() {
        w1.d dVar = this.f52376o;
        dVar.f52767k = null;
        dVar.l = null;
        dVar.f52766j = null;
        dVar.f52769n = C.TIME_UNSET;
        dVar.f52763g.d(null);
        dVar.f52763g = null;
        HashMap map = dVar.f52760d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((w1.c) it.next()).f52746b.d(null);
        }
        dVar.f52764h.removeCallbacksAndMessages(null);
        dVar.f52764h = null;
        map.clear();
        this.f52373k.release();
    }

    @Override // f2.a
    public final synchronized void w(y yVar) {
        this.f52380s = yVar;
    }

    public final void y(w1.m mVar) {
        long j10;
        g1 g1Var;
        long j11;
        long jM;
        long j12;
        boolean z10 = mVar.f52844p;
        boolean z11 = mVar.f52836g;
        j0 j0Var = mVar.f52846r;
        long j13 = mVar.f52849u;
        long jM2 = mVar.f52834e;
        int i10 = mVar.f52833d;
        long j14 = mVar.f52837h;
        long jZ = z10 ? l1.y.Z(j14) : C.TIME_UNSET;
        long j15 = (i10 == 2 || i10 == 1) ? jZ : C.TIME_UNSET;
        w1.d dVar = this.f52376o;
        dVar.f52766j.getClass();
        j jVar = new j(0);
        long j16 = 0;
        if (dVar.f52768m) {
            w1.l lVar = mVar.f52850v;
            long j17 = j14 - dVar.f52769n;
            boolean z12 = mVar.f52843o;
            long j18 = z12 ? j17 + j13 : -9223372036854775807L;
            long jM3 = mVar.f52844p ? l1.y.M(l1.y.B(this.f52377p)) - (j14 + j13) : 0L;
            long j19 = this.f52378q.f42694a;
            if (j19 != C.TIME_UNSET) {
                jM = l1.y.M(j19);
            } else {
                if (jM2 != C.TIME_UNSET) {
                    j11 = j13 - jM2;
                } else {
                    j11 = lVar.f52831d;
                    if (j11 == C.TIME_UNSET || mVar.f52842n == C.TIME_UNSET) {
                        j11 = lVar.f52830c;
                        if (j11 == C.TIME_UNSET) {
                            j11 = 3 * mVar.f52841m;
                        }
                    }
                }
                jM = j11 + jM3;
            }
            long j20 = j13 + jM3;
            long jK = l1.y.k(jM, jM3, j20);
            i1.u uVar = k().f42715c;
            boolean z13 = uVar.f42697d == -3.4028235E38f && uVar.f42698e == -3.4028235E38f && lVar.f52830c == C.TIME_UNSET && lVar.f52831d == C.TIME_UNSET;
            i1.t tVarA = this.f52378q.a();
            tVarA.f42668a = l1.y.Z(jK);
            tVarA.f42671d = z13 ? 1.0f : this.f52378q.f42697d;
            tVarA.f42672e = z13 ? 1.0f : this.f52378q.f42698e;
            i1.u uVar2 = new i1.u(tVarA);
            this.f52378q = uVar2;
            if (jM2 == C.TIME_UNSET) {
                jM2 = j20 - l1.y.M(uVar2.f42694a);
            }
            if (z11) {
                j16 = jM2;
            } else {
                w1.h hVarX = x(jM2, mVar.f52847s);
                if (hVarX != null) {
                    j12 = hVarX.f52821e;
                } else if (!j0Var.isEmpty()) {
                    w1.j jVar2 = (w1.j) j0Var.get(l1.y.d(j0Var, Long.valueOf(jM2), true));
                    w1.h hVarX2 = x(jM2, jVar2.f52816m);
                    j12 = hVarX2 != null ? hVarX2.f52821e : jVar2.f52821e;
                }
                j16 = j12;
            }
            g1Var = new g1(j15, jZ, j18, mVar.f52849u, j17, j16, true, !z12, i10 == 2 && mVar.f52835f, jVar, k(), this.f52378q);
        } else {
            if (jM2 == C.TIME_UNSET || j0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && jM2 != j13) {
                    jM2 = ((w1.j) j0Var.get(l1.y.d(j0Var, Long.valueOf(jM2), true))).f52821e;
                }
                j10 = jM2;
            }
            long j21 = mVar.f52849u;
            g1Var = new g1(j15, jZ, j21, j21, 0L, j10, true, false, true, jVar, k(), null);
        }
        q(g1Var);
    }
}
