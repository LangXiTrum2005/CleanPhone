package d2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import f2.a0;
import f2.c0;
import f2.g1;
import f2.i0;
import f2.u;
import i1.e0;
import i1.v;
import i1.y;
import j2.h;
import j2.j;
import j2.m;
import j2.n;
import j2.o;
import j2.p;
import j2.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import n1.g;
import n1.i;
import n1.k;
import n1.r;
import n1.z;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f2.a implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f38645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f38646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f38647k;
    public final b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u1.h f38648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f38649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f38650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f38651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f38652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f38653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n1.h f38654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f38655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o f38656u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f38657v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f38658w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e2.c f38659x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f38660y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y f38661z;

    static {
        i1.z.a("media3.exoplayer.smoothstreaming");
    }

    public e(y yVar, g gVar, p pVar, l lVar, b0 b0Var, u1.h hVar, b0 b0Var2, long j10) {
        this.f38661z = yVar;
        v vVar = yVar.f42714b;
        vVar.getClass();
        Uri uriWithAppendedPath = vVar.f42704a;
        this.f38659x = null;
        if (uriWithAppendedPath.equals(Uri.EMPTY)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = l1.y.f44835f.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f38645i = uriWithAppendedPath;
        this.f38646j = gVar;
        this.f38652q = pVar;
        this.f38647k = lVar;
        this.l = b0Var;
        this.f38648m = hVar;
        this.f38649n = b0Var2;
        this.f38650o = j10;
        this.f38651p = a(null);
        this.f38644h = false;
        this.f38653r = new ArrayList();
    }

    @Override // j2.h
    public final void b(j jVar, long j10, long j11, boolean z10) {
        q qVar = (q) jVar;
        long j12 = qVar.f43678a;
        k kVar = qVar.f43679b;
        n1.y yVar = qVar.f43681d;
        u uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f38649n.getClass();
        this.f38651p.c(uVar, qVar.f43680c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    @Override // f2.a
    public final a0 c(c0 c0Var, v9.e eVar, long j10) {
        i0 i0VarA = a(c0Var);
        i0 i0Var = new i0(this.f40275d.f40371c, 0, c0Var);
        d dVar = new d(this.f38659x, this.f38647k, this.f38657v, this.l, this.f38648m, i0Var, this.f38649n, i0VarA, this.f38656u, eVar);
        this.f38653r.add(dVar);
        return dVar;
    }

    @Override // j2.h
    public final com.google.android.gms.internal.ads.a0 d(j jVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        q qVar = (q) jVar;
        long j12 = qVar.f43678a;
        k kVar = qVar.f43679b;
        n1.y yVar = qVar.f43681d;
        u uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        int i11 = qVar.f43680c;
        this.f38649n.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof e0) || (cause instanceof FileNotFoundException) || (cause instanceof r) || (cause instanceof j2.l) || ((cause instanceof i) && ((i) cause).f46362a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        com.google.android.gms.internal.ads.a0 a0Var = jMin == C.TIME_UNSET ? m.f43673f : new com.google.android.gms.internal.ads.a0(jMin, 0, false);
        this.f38651p.g(uVar, i11, iOException, !a0Var.a());
        return a0Var;
    }

    @Override // j2.h
    public final void j(j jVar, long j10, long j11) {
        q qVar = (q) jVar;
        long j12 = qVar.f43678a;
        k kVar = qVar.f43679b;
        n1.y yVar = qVar.f43681d;
        u uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f38649n.getClass();
        this.f38651p.d(uVar, qVar.f43680c);
        this.f38659x = (e2.c) qVar.f43683f;
        this.f38658w = j10 - j11;
        x();
        if (this.f38659x.f39041d) {
            this.f38660y.postDelayed(new f(this, 10), Math.max(0L, (this.f38658w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // f2.a
    public final synchronized y k() {
        return this.f38661z;
    }

    @Override // f2.a
    public final void m() {
        this.f38656u.maybeThrowError();
    }

    @Override // j2.h
    public final void n(j jVar, long j10, long j11, int i10) {
        u uVar;
        q qVar = (q) jVar;
        if (i10 == 0) {
            long j12 = qVar.f43678a;
            uVar = new u(qVar.f43679b, j10);
        } else {
            long j13 = qVar.f43678a;
            k kVar = qVar.f43679b;
            n1.y yVar = qVar.f43681d;
            uVar = new u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        }
        this.f38651p.h(uVar, qVar.f43680c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i10);
    }

    @Override // f2.a
    public final void p(z zVar) {
        this.f38657v = zVar;
        Looper looperMyLooper = Looper.myLooper();
        q1.j jVar = this.f40278g;
        jVar.getClass();
        u1.h hVar = this.f38648m;
        hVar.a(looperMyLooper, jVar);
        hVar.c();
        if (this.f38644h) {
            this.f38656u = new n(0);
            x();
            return;
        }
        this.f38654s = this.f38646j.createDataSource();
        m mVar = new m("SsMediaSource");
        this.f38655t = mVar;
        this.f38656u = mVar;
        this.f38660y = l1.y.q(null);
        y();
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        d dVar = (d) a0Var;
        for (g2.i iVar : dVar.f38642m) {
            iVar.q(null);
        }
        dVar.f38641k = null;
        this.f38653r.remove(a0Var);
    }

    @Override // f2.a
    public final void t() {
        this.f38659x = this.f38644h ? this.f38659x : null;
        this.f38654s = null;
        this.f38658w = 0L;
        m mVar = this.f38655t;
        if (mVar != null) {
            mVar.d(null);
            this.f38655t = null;
        }
        Handler handler = this.f38660y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f38660y = null;
        }
        this.f38648m.release();
    }

    @Override // f2.a
    public final synchronized void w(y yVar) {
        this.f38661z = yVar;
    }

    public final void x() {
        g1 g1Var;
        char c4;
        char c5 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f38653r;
            if (i10 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i10);
            e2.c cVar = this.f38659x;
            dVar.l = cVar;
            for (g2.i iVar : dVar.f38642m) {
                b bVar = (b) iVar.f41384e;
                e2.b[] bVarArr = bVar.f38627f.f39043f;
                int i11 = bVar.f38623b;
                e2.b bVar2 = bVarArr[i11];
                int i12 = bVar2.f39033k;
                long[] jArr = bVar2.f39036o;
                e2.b bVar3 = cVar.f39043f[i11];
                if (i12 == 0 || bVar3.f39033k == 0) {
                    bVar.f38628g += i12;
                } else {
                    int i13 = i12 - 1;
                    long jB = bVar2.b(i13) + jArr[i13];
                    long j10 = bVar3.f39036o[0];
                    if (jB <= j10) {
                        bVar.f38628g += i12;
                    } else {
                        bVar.f38628g = l1.y.f(jArr, j10, true) + bVar.f38628g;
                    }
                }
                bVar.f38627f = cVar;
            }
            f2.z zVar = dVar.f38641k;
            zVar.getClass();
            zVar.h(dVar);
            i10++;
        }
        e2.b[] bVarArr2 = this.f38659x.f39043f;
        int length = bVarArr2.length;
        long jMax = Long.MIN_VALUE;
        int i14 = 0;
        long jMax2 = Long.MAX_VALUE;
        while (i14 < length) {
            e2.b bVar4 = bVarArr2[i14];
            int i15 = bVar4.f39033k;
            long[] jArr2 = bVar4.f39036o;
            if (i15 > 0) {
                c4 = c5;
                jMax2 = Math.min(jMax2, jArr2[c4]);
                int i16 = bVar4.f39033k - 1;
                jMax = Math.max(jMax, bVar4.b(i16) + jArr2[i16]);
            } else {
                c4 = c5;
            }
            i14++;
            c5 = c4;
            bVarArr2 = bVarArr2;
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j11 = this.f38659x.f39041d ? -9223372036854775807L : 0L;
            e2.c cVar2 = this.f38659x;
            boolean z10 = cVar2.f39041d;
            g1Var = new g1(j11, 0L, 0L, 0L, true, z10, z10, cVar2, k());
        } else {
            e2.c cVar3 = this.f38659x;
            if (cVar3.f39041d) {
                long j12 = cVar3.f39045h;
                if (j12 != C.TIME_UNSET && j12 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j12);
                }
                long j13 = jMax2;
                long j14 = jMax - j13;
                long jM = j14 - l1.y.M(this.f38650o);
                if (jM < 5000000) {
                    jM = Math.min(5000000L, j14 / 2);
                }
                g1Var = new g1(C.TIME_UNSET, j14, j13, jM, true, true, true, this.f38659x, k());
            } else {
                long j15 = cVar3.f39044g;
                if (j15 == C.TIME_UNSET) {
                    j15 = jMax - jMax2;
                }
                long j16 = j15;
                long j17 = jMax2;
                g1Var = new g1(C.TIME_UNSET, C.TIME_UNSET, j17 + j16, j16, j17, 0L, true, false, false, this.f38659x, k(), null);
            }
        }
        q(g1Var);
    }

    public final void y() {
        if (this.f38655t.b()) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f38645i;
        go.k.o(uri, "The uri must be set.");
        q qVar = new q(this.f38654s, new k(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f38652q);
        this.f38655t.e(qVar, this, this.f38649n.j(qVar.f43680c));
    }
}
