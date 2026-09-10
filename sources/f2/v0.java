package f2;

import android.net.Uri;
import android.os.Handler;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements a0, n2.m, j2.h, j2.k, a1 {
    public static final Map Q;
    public static final i1.p R;
    public zc.u A;
    public n2.t B;
    public long C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f40474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.h f40475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1.h f40476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ea.b0 f40477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f40478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f40479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0 f40480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9.e f40481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f40482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i1.p f40483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f40484k;
    public final j2.m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g9.k f40485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1.f f40486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f40487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f40488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f40489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f40490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a3.b f40491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r0[] f40492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b1[] f40493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u0[] f40494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f40495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f40496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f40497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f40498z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        Q = Collections.unmodifiableMap(map);
        i1.o oVar = new i1.o();
        oVar.f42589a = "icy";
        oVar.f42600m = i1.d0.n("application/x-icy");
        R = new i1.p(oVar);
    }

    public v0(Uri uri, n1.h hVar, g9.k kVar, u1.h hVar2, i0 i0Var, ea.b0 b0Var, i0 i0Var2, x0 x0Var, v9.e eVar, int i10, i1.p pVar, long j10, k2.a aVar) {
        this.f40474a = uri;
        this.f40475b = hVar;
        this.f40476c = hVar2;
        this.f40479f = i0Var;
        this.f40477d = b0Var;
        this.f40478e = i0Var2;
        this.f40480g = x0Var;
        this.f40481h = eVar;
        this.f40482i = i10;
        this.f40483j = pVar;
        this.l = aVar != null ? new j2.m(aVar) : new j2.m("ProgressiveMediaPeriod");
        this.f40485m = kVar;
        this.f40484k = j10;
        this.f40486n = new l1.f();
        this.f40487o = new o0(this, 1);
        this.f40488p = new o0(this, 2);
        this.f40489q = l1.y.q(null);
        this.f40494v = new u0[0];
        this.f40493u = new b1[0];
        this.f40492t = new r0[0];
        this.L = C.TIME_UNSET;
        this.E = 1;
    }

    @Override // f2.a0
    public final long a(long j10, p1.e1 e1Var) {
        i();
        if (!this.B.isSeekable()) {
            return 0L;
        }
        n2.s seekPoints = this.B.getSeekPoints(j10);
        return e1Var.a(j10, seekPoints.f46490a.f46493a, seekPoints.f46491b.f46493a);
    }

    @Override // j2.h
    public final void b(j2.j jVar, long j10, long j11, boolean z10) {
        s0 s0Var = (s0) jVar;
        n1.y yVar = s0Var.f40445b;
        u uVar = new u(s0Var.f40453j, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f40477d.getClass();
        this.f40478e.c(uVar, 1, -1, null, 0, null, s0Var.f40452i, this.C);
        if (z10) {
            return;
        }
        for (b1 b1Var : this.f40493u) {
            b1Var.E(false);
        }
        if (this.I > 0) {
            z zVar = this.f40490r;
            zVar.getClass();
            zVar.h(this);
        }
    }

    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        i2.r rVar;
        i();
        zc.u uVar = this.A;
        k1 k1Var = (k1) uVar.f54879b;
        boolean[] zArr3 = (boolean[]) uVar.f54881d;
        int i10 = this.I;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((t0) c1Var).f40461a;
                go.k.t(zArr3[i13]);
                this.I--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.F ? j10 == 0 || this.f40498z : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                go.k.t(rVar.length() == 1);
                go.k.t(rVar.getIndexInTrackGroup(0) == 0);
                int iB = k1Var.b(rVar.getTrackGroup());
                go.k.t(!zArr3[iB]);
                this.I++;
                zArr3[iB] = true;
                this.H = rVar.getSelectedFormat().f42649t | this.H;
                c1VarArr[i14] = new t0(this, iB);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.f40493u[iB];
                    z10 = (b1Var.t() == 0 || b1Var.G(j10, true)) ? false : true;
                }
            }
        }
        if (this.I == 0) {
            this.M = false;
            this.G = false;
            this.H = false;
            j2.m mVar = this.l;
            if (mVar.c()) {
                b1[] b1VarArr = this.f40493u;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].k();
                    i11++;
                }
                mVar.a();
            } else {
                this.O = false;
                for (b1 b1Var2 : this.f40493u) {
                    b1Var2.E(false);
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.F = true;
        return j10;
    }

    @Override // j2.h
    public final com.google.android.gms.internal.ads.a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        com.google.android.gms.internal.ads.a0 a0Var;
        n2.t tVar;
        s0 s0Var = (s0) jVar;
        n1.y yVar = s0Var.f40445b;
        u uVar = new u(s0Var.f40453j, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        String str = l1.y.f44830a;
        this.f40477d.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof i1.e0) || (cause instanceof FileNotFoundException) || (cause instanceof n1.r) || (cause instanceof j2.l) || ((cause instanceof n1.i) && ((n1.i) cause).f46362a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == C.TIME_UNSET) {
            a0Var = j2.m.f43673f;
        } else {
            int iK = k();
            int i11 = iK > this.N ? 1 : 0;
            if (this.J || !((tVar = this.B) == null || tVar.getDurationUs() == C.TIME_UNSET)) {
                this.N = iK;
            } else if (!this.f40496x || v()) {
                this.G = this.f40496x;
                this.K = 0L;
                this.N = 0;
                for (b1 b1Var : this.f40493u) {
                    b1Var.E(false);
                }
                s0Var.f40449f.f18888a = 0L;
                s0Var.f40452i = 0L;
                s0Var.f40451h = true;
                s0Var.l = false;
            } else {
                this.M = true;
                a0Var = j2.m.f43672e;
            }
            a0Var = new com.google.android.gms.internal.ads.a0(jMin, i11, false);
        }
        this.f40478e.f(uVar, 1, -1, null, 0, null, s0Var.f40452i, this.C, iOException, !a0Var.a());
        return a0Var;
    }

    @Override // f2.a0
    public final void e(z zVar, long j10) {
        this.f40490r = zVar;
        i1.p pVar = this.f40483j;
        if (pVar == null) {
            this.f40486n.c();
            t();
        } else {
            track(0, 3).b(pVar);
            s(new n2.r(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.L = j10;
        }
    }

    @Override // n2.m
    public final void endTracks() {
        this.f40495w = true;
        this.f40489q.post(this.f40487o);
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        if (this.O) {
            return false;
        }
        j2.m mVar = this.l;
        if (mVar.b() || this.M) {
            return false;
        }
        if ((this.f40496x || this.f40483j != null) && this.I == 0) {
            return false;
        }
        boolean zC = this.f40486n.c();
        if (mVar.c()) {
            return zC;
        }
        t();
        return true;
    }

    @Override // f2.a0
    public final void g(long j10) throws Throwable {
        if (this.f40498z) {
            return;
        }
        i();
        if (m()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.A.f54881d;
        int length = this.f40493u.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f40493u[i10].j(j10, zArr[i10]);
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        long jL;
        boolean z10;
        i();
        if (this.O || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.L;
        }
        if (this.f40497y) {
            int length = this.f40493u.length;
            jL = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zc.u uVar = this.A;
                if (((boolean[]) uVar.f54880c)[i10] && ((boolean[]) uVar.f54881d)[i10]) {
                    b1 b1Var = this.f40493u[i10];
                    synchronized (b1Var) {
                        z10 = b1Var.f40300w;
                    }
                    if (!z10) {
                        jL = Math.min(jL, this.f40493u[i10].q());
                    }
                }
            }
        } else {
            jL = Long.MAX_VALUE;
        }
        if (jL == Long.MAX_VALUE) {
            jL = l(false);
        }
        return jL == Long.MIN_VALUE ? this.K : jL;
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        i();
        return (k1) this.A.f54879b;
    }

    @Override // f2.a1
    public final void h() {
        this.f40489q.post(this.f40487o);
    }

    public final void i() {
        go.k.t(this.f40496x);
        this.A.getClass();
        this.B.getClass();
    }

    @Override // f2.e1
    public final boolean isLoading() {
        boolean z10;
        if (!this.l.c()) {
            return false;
        }
        l1.f fVar = this.f40486n;
        synchronized (fVar) {
            z10 = fVar.f44786b;
        }
        return z10;
    }

    @Override // j2.h
    public final void j(j2.j jVar, long j10, long j11) {
        s0 s0Var = (s0) jVar;
        if (this.C == C.TIME_UNSET && this.B != null) {
            long jL = l(true);
            long j12 = jL == Long.MIN_VALUE ? 0L : jL + Xa.f27908s;
            this.C = j12;
            this.f40480g.y(j12, this.B, this.D);
        }
        n1.y yVar = s0Var.f40445b;
        u uVar = new u(s0Var.f40453j, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f40477d.getClass();
        this.f40478e.e(uVar, 1, -1, null, 0, null, s0Var.f40452i, this.C);
        this.O = true;
        z zVar = this.f40490r;
        zVar.getClass();
        zVar.h(this);
    }

    public final int k() {
        int i10 = 0;
        for (b1 b1Var : this.f40493u) {
            i10 += b1Var.f40294q + b1Var.f40293p;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long l(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f40493u.length; i10++) {
            if (z10) {
                jMax = Math.max(jMax, this.f40493u[i10].q());
            } else {
                zc.u uVar = this.A;
                uVar.getClass();
                if (((boolean[]) uVar.f54881d)[i10]) {
                    jMax = Math.max(jMax, this.f40493u[i10].q());
                }
            }
        }
        return jMax;
    }

    public final boolean m() {
        return this.L != C.TIME_UNSET;
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() throws IOException {
        int iJ = this.f40477d.j(this.E);
        j2.m mVar = this.l;
        IOException iOException = mVar.f43676c;
        if (iOException != null) {
            throw iOException;
        }
        j2.i iVar = mVar.f43675b;
        if (iVar != null) {
            if (iJ == Integer.MIN_VALUE) {
                iJ = iVar.f43661a;
            }
            IOException iOException2 = iVar.f43665e;
            if (iOException2 != null && iVar.f43666f > iJ) {
                throw iOException2;
            }
        }
        if (this.O && !this.f40496x) {
            throw i1.e0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // j2.h
    public final void n(j2.j jVar, long j10, long j11, int i10) {
        s0 s0Var = (s0) jVar;
        n1.y yVar = s0Var.f40445b;
        this.f40478e.h(i10 == 0 ? new u(s0Var.f40453j, j10) : new u(s0Var.f40453j, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b), 1, -1, null, 0, null, s0Var.f40452i, this.C, i10);
    }

    public final void o() {
        long j10 = this.f40484k;
        if (this.P || this.f40496x || !this.f40495w || this.B == null) {
            return;
        }
        for (b1 b1Var : this.f40493u) {
            if (b1Var.w() == null) {
                return;
            }
        }
        l1.f fVar = this.f40486n;
        synchronized (fVar) {
            fVar.f44786b = false;
        }
        int length = this.f40493u.length;
        i1.q0[] q0VarArr = new i1.q0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            i1.p pVarW = this.f40493u[i10].w();
            pVarW.getClass();
            String str = pVarW.f42643n;
            boolean zI = i1.d0.i(str);
            boolean z10 = zI || i1.d0.m(str);
            zArr[i10] = z10;
            this.f40497y = z10 | this.f40497y;
            this.f40498z = j10 != C.TIME_UNSET && length == 1 && i1.d0.k(str);
            a3.b bVar = this.f40491s;
            if (bVar != null) {
                int i11 = bVar.f3372a;
                if (zI || this.f40494v[i10].f40466b) {
                    i1.c0 c0Var = pVarW.l;
                    i1.c0 c0Var2 = c0Var == null ? new i1.c0(bVar) : c0Var.a(bVar);
                    i1.o oVarA = pVarW.a();
                    oVarA.f42599k = c0Var2;
                    pVarW = new i1.p(oVarA);
                }
                if (zI && pVarW.f42638h == -1 && pVarW.f42639i == -1 && i11 != -1) {
                    i1.o oVarA2 = pVarW.a();
                    oVarA2.f42596h = i11;
                    pVarW = new i1.p(oVarA2);
                }
            }
            int iD = this.f40476c.d(pVarW);
            i1.o oVarA3 = pVarW.a();
            oVarA3.N = iD;
            i1.p pVar = new i1.p(oVarA3);
            q0VarArr[i10] = new i1.q0(Integer.toString(i10), pVar);
            this.H = pVar.f42649t | this.H;
        }
        this.A = new zc.u(new k1(q0VarArr), zArr);
        if (this.f40498z && this.C == C.TIME_UNSET) {
            this.C = j10;
            this.B = new p0(this, this.B);
        }
        this.f40480g.y(this.C, this.B, this.D);
        this.f40496x = true;
        z zVar = this.f40490r;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // j2.k
    public final void onLoaderReleased() {
        for (b1 b1Var : this.f40493u) {
            b1Var.D();
        }
        g9.k kVar = this.f40485m;
        n2.k kVar2 = (n2.k) kVar.f41771c;
        if (kVar2 != null) {
            kVar2.release();
            kVar.f41771c = null;
        }
        kVar.f41772d = null;
    }

    public final void p(int i10) {
        i();
        zc.u uVar = this.A;
        boolean[] zArr = (boolean[]) uVar.f54882e;
        if (zArr[i10]) {
            return;
        }
        i1.p pVar = ((k1) uVar.f54879b).a(i10).f42662d[0];
        this.f40478e.b(i1.d0.h(pVar.f42643n), pVar, 0, null, this.K);
        zArr[i10] = true;
    }

    public final void q(int i10) {
        i();
        if (this.M) {
            if ((!this.f40497y || ((boolean[]) this.A.f54880c)[i10]) && !this.f40493u[i10].x(false)) {
                this.L = 0L;
                this.M = false;
                this.G = true;
                this.K = 0L;
                this.N = 0;
                for (b1 b1Var : this.f40493u) {
                    b1Var.E(false);
                }
                z zVar = this.f40490r;
                zVar.getClass();
                zVar.h(this);
            }
        }
    }

    public final n2.a0 r(u0 u0Var) {
        int length = this.f40493u.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (u0Var.equals(this.f40494v[i10])) {
                return this.f40493u[i10];
            }
        }
        if (this.f40495w) {
            l1.a.s("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.f40465a + ") after finishing tracks.");
            return new n2.j();
        }
        u1.h hVar = this.f40476c;
        hVar.getClass();
        b1 b1Var = new b1(this.f40481h, hVar, this.f40479f);
        r0 r0Var = new r0(b1Var);
        b1Var.f40284f = this;
        int i11 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.f40494v, i11);
        u0VarArr[length] = u0Var;
        this.f40494v = u0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.f40493u, i11);
        b1VarArr[length] = b1Var;
        this.f40493u = b1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.f40492t, i11);
        r0VarArr[length] = r0Var;
        this.f40492t = r0VarArr;
        return r0Var;
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        if (this.H) {
            this.H = false;
            return this.K;
        }
        if (!this.G) {
            return C.TIME_UNSET;
        }
        if (!this.O && k() <= this.N) {
            return C.TIME_UNSET;
        }
        this.G = false;
        return this.K;
    }

    public final void s(n2.t tVar) {
        this.B = this.f40491s == null ? tVar : new n2.o(C.TIME_UNSET);
        this.C = tVar.getDurationUs();
        boolean z10 = !this.J && tVar.getDurationUs() == C.TIME_UNSET;
        this.D = z10;
        this.E = z10 ? 7 : 1;
        if (this.f40496x) {
            this.f40480g.y(this.C, tVar, z10);
        } else {
            o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[LOOP:1: B:44:0x0092->B:45:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[LOOP:2: B:49:0x00a7->B:50:0x00a9, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x008f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00a0, please report this as an issue */
    @Override // f2.a0
    public final long seekToUs(long j10) {
        int i10;
        i();
        boolean[] zArr = (boolean[]) this.A.f54880c;
        if (!this.B.isSeekable()) {
            j10 = 0;
        }
        this.G = false;
        boolean z10 = true;
        boolean z11 = this.K == j10;
        this.K = j10;
        if (m()) {
            this.L = j10;
            return j10;
        }
        int i11 = this.E;
        j2.m mVar = this.l;
        if (i11 == 7 || !(this.O || mVar.c())) {
            this.M = false;
            this.L = j10;
            this.O = false;
            this.H = false;
            if (mVar.c()) {
                for (b1 b1Var : this.f40493u) {
                    b1Var.k();
                }
                mVar.a();
                return j10;
            }
            mVar.f43676c = null;
            for (b1 b1Var2 : this.f40493u) {
                b1Var2.E(false);
            }
        } else {
            int length = this.f40493u.length;
            for (int i12 = 0; i12 < length; i12++) {
                b1 b1Var3 = this.f40493u[i12];
                if (this.f40492t[i12].f40442d.get() == q0.f40435a && (b1Var3.t() != 0 || !z11)) {
                    if (!(this.f40498z ? b1Var3.F(b1Var3.f40294q) : b1Var3.G(j10, this.O)) && (zArr[i12] || !this.f40497y)) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10) {
                this.M = false;
                this.L = j10;
                this.O = false;
                this.H = false;
                if (mVar.c()) {
                    while (i < r0) {
                        b1Var.k();
                    }
                    mVar.a();
                    return j10;
                }
                mVar.f43676c = null;
                while (i10 < r0) {
                    b1Var2.E(false);
                }
            }
        }
        return j10;
    }

    public final void t() {
        s0 s0Var = new s0(this, this.f40474a, this.f40475b, this.f40485m, this, this.f40486n);
        if (this.f40496x) {
            go.k.t(m());
            long j10 = this.C;
            if (j10 != C.TIME_UNSET && this.L > j10) {
                this.O = true;
                this.L = C.TIME_UNSET;
                return;
            }
            n2.t tVar = this.B;
            tVar.getClass();
            long j11 = tVar.getSeekPoints(this.L).f46490a.f46494b;
            long j12 = this.L;
            s0Var.f40449f.f18888a = j11;
            s0Var.f40452i = j12;
            s0Var.f40451h = true;
            s0Var.l = false;
            for (b1 b1Var : this.f40493u) {
                b1Var.f40297t = this.L;
            }
            this.L = C.TIME_UNSET;
        }
        this.N = k();
        this.l.e(s0Var, this, this.f40477d.j(this.E));
    }

    @Override // n2.m
    public final n2.a0 track(int i10, int i11) {
        return r(new u0(i10, false));
    }

    @Override // n2.m
    public final void u(n2.t tVar) {
        this.f40489q.post(new com.unity3d.services.ads.operation.show.b(16, this, tVar));
    }

    public final boolean v() {
        return this.G || m();
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
    }
}
