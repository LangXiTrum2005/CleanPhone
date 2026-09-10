package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends mu1 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f19707e0 = 0;
    public final long A;
    public final kj1 B;
    public final com.google.android.gms.internal.consent_sdk.d C;
    public final qy1 D;
    public final iw0 E;
    public final iw0 F;
    public int G;
    public int H;
    public boolean I;
    public final vz1 J;
    public final wz1 K;
    public final gy1 L;
    public pd M;
    public f7 N;
    public Object O;
    public Surface P;
    public final int Q;
    public aq0 R;
    public final z80 S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public final int X;
    public boolean Y;
    public f7 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public nz1 f19708a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f19709b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f19710c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f19711c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pd f19712d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q42 f19713d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qf0 f19714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f19715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xz1 f19716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ux1[] f19717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ux1[] f19718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f19719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ys0 f19720k;
    public final wv0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wy1 f19721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mk0 f19722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet f19723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ug f19724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f19725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f19726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d02 f19727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Looper f19728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f19729u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s6 f19730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jy1 f19731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k0 f19732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hx0 f19733y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final n6 f19734z;

    static {
        z5.a("media3.exoplayer");
    }

    public ry1(fy1 fy1Var, xz1 xz1Var) {
        super(5);
        this.f19714e = new qf0();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = uu0.f20901a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.10.0] [");
            sb2.append(str);
            sb2.append(X3.j.f27836e);
            v71.r("ExoPlayerImpl", sb2.toString());
            Context context = fy1Var.f14576a;
            s6 s6Var = fy1Var.f14577b;
            Looper looper = fy1Var.f14583h;
            this.f19715f = context.getApplicationContext();
            this.f19727s = new d02(s6Var);
            this.X = fy1Var.f14584i;
            this.S = fy1Var.f14585j;
            this.Q = fy1Var.f14586k;
            this.U = false;
            this.A = fy1Var.f14590p;
            jy1 jy1Var = new jy1(this);
            this.f19731w = jy1Var;
            this.f19732x = new k0(1);
            Handler handler = new Handler(looper);
            z61 z61Var = fy1Var.f14578c;
            int i10 = fy1.f14575z;
            this.f19717h = ((b21) z61Var.f22523a).h(handler, jy1Var, jy1Var);
            this.f19718i = new ux1[2];
            int i11 = 0;
            while (true) {
                ux1[] ux1VarArr = this.f19718i;
                int length = ux1VarArr.length;
                if (i11 >= 2) {
                    break;
                }
                ux1 ux1Var = this.f19717h[i11];
                ux1VarArr[i11] = null;
                i11++;
            }
            this.f19719j = (m) fy1Var.f14580e.zza();
            fy1Var.f14579d.zza();
            this.f19729u = (x) fy1Var.f14582g.zza();
            this.f19726r = fy1Var.l;
            this.K = fy1Var.f14587m;
            this.J = fy1Var.f14588n;
            this.f19728t = looper;
            this.f19730v = s6Var;
            this.f19716g = xz1Var;
            int i12 = 10;
            this.f19722n = new mk0(new CopyOnWriteArraySet(), looper, looper.getThread(), s6Var, (xi0) new ey1(this, i12), true);
            this.f19723o = new CopyOnWriteArraySet();
            this.f19725q = new ArrayList();
            this.f19713d0 = new q42();
            this.L = gy1.f15000a;
            int length2 = this.f19717h.length;
            this.f19710c = new s(new tz1[2], new p[2], yo.f22329b, null);
            this.f19724p = new ug();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i13 = 0; i13 < 20; i13++) {
                int i14 = iArr[i13];
                ps1.c0(!false);
                sparseBooleanArray.append(i14, true);
            }
            this.f19719j.getClass();
            ps1.c0(!false);
            sparseBooleanArray.append(29, true);
            ps1.c0(!false);
            z02 z02Var = new z02(sparseBooleanArray);
            this.f19712d = new pd(z02Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i15 = 0; i15 < z02Var.f22445a.size(); i15++) {
                int iA = z02Var.a(i15);
                ps1.c0(!false);
                sparseBooleanArray2.append(iA, true);
            }
            ps1.c0(!false);
            sparseBooleanArray2.append(4, true);
            ps1.c0(!false);
            sparseBooleanArray2.append(10, true);
            ps1.c0(!false);
            this.M = new pd(new z02(sparseBooleanArray2));
            this.f19720k = this.f19730v.u(this.f19728t, null);
            wv0 wv0Var = new wv0(this, i12);
            this.l = wv0Var;
            this.f19708a0 = nz1.a(this.f19710c);
            this.f19727s.q(this.f19716g, this.f19728t);
            j02 j02Var = new j02(fy1Var.f14597w);
            wy1 wy1Var = new wy1(this.f19715f, this.f19717h, this.f19718i, this.f19719j, this.f19710c, (zy1) fy1Var.f14581f.zza(), this.f19729u, this.f19727s, this.K, fy1Var.f14599y, fy1Var.f14589o, fy1Var.f14598x, this.f19728t, this.f19730v, wv0Var, j02Var, this.L);
            Looper looper2 = wy1Var.f21634i;
            ys0 ys0Var = wy1Var.f21632g;
            this.f19721m = wy1Var;
            this.T = 1.0f;
            f7 f7Var = f7.B;
            this.N = f7Var;
            this.Z = f7Var;
            this.f19709b0 = -1;
            m91 m91Var = a90.f11940a;
            this.V = true;
            d02 d02Var = this.f19727s;
            d02Var.getClass();
            this.f19722n.g(d02Var);
            x xVar = this.f19729u;
            Handler handler2 = new Handler(this.f19728t);
            d02 d02Var2 = this.f19727s;
            z zVar = (z) xVar;
            zVar.getClass();
            d02Var2.getClass();
            vf vfVar = zVar.f22430c;
            CopyOnWriteArrayList<w> copyOnWriteArrayList = (CopyOnWriteArrayList) vfVar.f21157b;
            for (w wVar : copyOnWriteArrayList) {
                if (wVar.f21329b == d02Var2) {
                    wVar.f21330c = true;
                    copyOnWriteArrayList.remove(wVar);
                }
            }
            ((CopyOnWriteArrayList) vfVar.f21157b).add(new w(handler2, d02Var2));
            this.f19723o.add(this.f19731w);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 31) {
                this.f19730v.u(looper2, null).e(new hy1(this.f19715f, fy1Var.f14595u, this, j02Var));
            }
            kj1 kj1Var = new kj1(looper2, this.f19728t, this.f19730v, new z61(this));
            this.B = kj1Var;
            ry0 ry0Var = new ry0(this, 13);
            ys0 ys0Var2 = (ys0) kj1Var.f16463b;
            if (ys0Var2.f22362a.getLooper().getThread().isAlive()) {
                ys0Var2.e(ry0Var);
            }
            s6 s6Var2 = this.f19730v;
            jq jqVar = new jq(8);
            context.getApplicationContext();
            s6Var2.u(looper2, null);
            new q7.c(jqVar, s6Var2.u(looper, null));
            boolean z10 = (fy1Var.f14592r == Integer.MAX_VALUE || fy1Var.f14593s == Integer.MAX_VALUE) ? false : true;
            hx0 hx0Var = new hx0(context, looper2, this.f19730v);
            this.f19733y = hx0Var;
            if (hx0Var.f15418b != z10) {
                hx0Var.f15418b = z10;
                hx0Var.l(z10, hx0Var.f15419c);
            }
            s6 s6Var3 = this.f19730v;
            n6 n6Var = new n6(3);
            context.getApplicationContext();
            s6Var3.u(looper2, null);
            s6Var3.u(Looper.getMainLooper(), null);
            this.f19734z = n6Var;
            int i17 = yy1.f22413a;
            lt ltVar = lt.f17121d;
            this.R = aq0.f12492c;
            this.D = i16 >= 34 ? new qy1(this, context) : null;
            this.E = new iw0(this);
            this.F = new iw0(this);
            this.C = new com.google.android.gms.internal.consent_sdk.d(this, this.f19731w, this.f19730v, fy1Var.f14591q, fy1Var.f14592r, fy1Var.f14593s, fy1Var.f14594t);
            ys0Var.b(38, this.J).a();
            z80 z80Var = this.S;
            Handler handler3 = ys0Var.f22362a;
            ss0 ss0VarG = ys0.g();
            ss0VarG.f20047a = handler3.obtainMessage(31, 0, 0, z80Var);
            ss0VarG.a();
            m1(1, 3, this.S);
            m1(2, 4, Integer.valueOf(this.Q));
            m1(2, 5, 0);
            m1(1, 9, Boolean.valueOf(this.U));
            m1(6, 8, this.f19732x);
            m1(-1, 16, Integer.valueOf(this.X));
        } finally {
            this.f19714e.a();
        }
    }

    public static long g1(nz1 nz1Var) {
        ih ihVar = new ih();
        ug ugVar = new ug();
        ci ciVar = nz1Var.f18038a;
        ciVar.o(nz1Var.f18039b.f19359a, ugVar);
        long j10 = nz1Var.f18040c;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        ciVar.b(ugVar.f20772c, ihVar, 0L).getClass();
        return 0L;
    }

    public static nz1 i1(nz1 nz1Var, int i10) {
        nz1 nz1VarD = nz1Var.d(i10);
        return (i10 == 1 || i10 == 4) ? nz1VarD.f(false) : nz1VarD;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final void C0(int i10, long j10) {
        l0();
        if (i10 == -1) {
            return;
        }
        ps1.v(i10 >= 0);
        ci ciVar = this.f19708a0.f18038a;
        if (ciVar.g() || i10 < ciVar.a()) {
            d02 d02Var = this.f19727s;
            if (!d02Var.f13334i) {
                zz1 zz1VarG = d02Var.g();
                d02Var.f13334i = true;
                d02Var.f(zz1VarG, -1, new ey1((byte) 0, 19));
            }
            this.G++;
            if (V0()) {
                v71.y("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w(this.f19708a0, 1);
                wVar.f(1);
                ry1 ry1Var = (ry1) this.l.f21612b;
                ry1Var.f19720k.e(new gm0(21, ry1Var, wVar));
                return;
            }
            nz1 nz1VarD = this.f19708a0;
            int i11 = nz1VarD.f18042e;
            if (i11 == 3 || (i11 == 4 && !ciVar.g())) {
                nz1VarD = this.f19708a0.d(2);
            }
            int iR0 = R0();
            nz1 nz1VarH1 = h1(nz1VarD, ciVar, j1(ciVar, i10, j10));
            long jT = uu0.t(j10);
            wy1 wy1Var = this.f19721m;
            wy1Var.getClass();
            wy1Var.f21632g.b(3, new vy1(ciVar, i10, jT)).a();
            f1(nz1VarH1, 0, true, 1, e1(nz1VarH1), iR0);
        }
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final int J0() {
        l0();
        return this.f19708a0.f18042e;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final int K0() {
        l0();
        return this.f19708a0.f18050n;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final boolean L0() {
        l0();
        return this.f19708a0.l;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final void M0() {
        l0();
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final yo N0() {
        l0();
        return (yo) this.f19708a0.f18046i.f19745d;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final ci O0() {
        l0();
        return this.f19708a0.f18038a;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final int Q0() {
        l0();
        if (!this.f19708a0.f18038a.g()) {
            nz1 nz1Var = this.f19708a0;
            return nz1Var.f18038a.e(nz1Var.f18039b.f19359a);
        }
        int i10 = this.f19709b0;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final int R0() {
        l0();
        int iC1 = c1(this.f19708a0);
        if (iC1 == -1) {
            return 0;
        }
        return iC1;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final long T0() {
        l0();
        return uu0.s(e1(this.f19708a0));
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final long U0() {
        l0();
        return uu0.s(this.f19708a0.f18053q);
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final boolean V0() {
        l0();
        return this.f19708a0.f18039b.b();
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final int W0() {
        l0();
        if (V0()) {
            return this.f19708a0.f18039b.f19361c;
        }
        return -1;
    }

    public final void X0(float f10) {
        l0();
        String str = uu0.f20901a;
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f10, 1.0f));
        if (this.T == fMax) {
            return;
        }
        this.T = fMax;
        this.f19721m.f21632g.b(32, Float.valueOf(fMax)).a();
        ey1 ey1Var = new ey1(fMax);
        mk0 mk0Var = this.f19722n;
        mk0Var.i(22, ey1Var);
        mk0Var.j();
    }

    public final void Y0(a02 a02Var) {
        this.f19727s.f13331f.g(a02Var);
    }

    public final void Z0(r20 r20Var) {
        l0();
        this.f19727s.f13331f.h(r20Var);
    }

    public final void a1() {
        String str;
        boolean zC;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = uu0.f20901a;
        HashSet hashSet = z5.f22506a;
        synchronized (z5.class) {
            str = z5.f22507b;
        }
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(String.valueOf(hexString).length(), 34, String.valueOf(str2).length(), 3, String.valueOf(str).length()) + 1);
        d5.u.r(sb2, "Release ", hexString, " [AndroidXMedia3/1.10.0] [", str2);
        sb2.append("] [");
        sb2.append(str);
        sb2.append(X3.j.f27836e);
        v71.r("ExoPlayerImpl", sb2.toString());
        l0();
        this.f19733y.j(false);
        n6 n6Var = this.f19734z;
        if (n6Var.f17679b) {
            n6Var.f17679b = false;
        }
        qy1 qy1Var = this.D;
        if (qy1Var != null && Build.VERSION.SDK_INT >= 34) {
            qy1Var.a();
        }
        com.google.android.gms.internal.consent_sdk.d dVar = this.C;
        ((ys0) dVar.f22985e).f22362a.removeCallbacksAndMessages(null);
        ry1 ry1Var = (ry1) dVar.f22981a;
        kq0 kq0Var = (kq0) dVar.f22982b;
        ry1Var.l0();
        kq0Var.getClass();
        ry1Var.f19722n.h(kq0Var);
        wy1 wy1Var = this.f19721m;
        if (wy1Var.H || !wy1Var.f21634i.getThread().isAlive()) {
            zC = true;
        } else {
            wy1Var.H = true;
            qf0 qf0Var = new qf0();
            wy1Var.f21632g.b(7, qf0Var).a();
            zC = qf0Var.c(wy1Var.f21643s);
        }
        if (!zC) {
            mk0 mk0Var = this.f19722n;
            mk0Var.i(10, ey1.f14113d);
            mk0Var.j();
        }
        this.f19722n.k();
        this.f19720k.f22362a.removeCallbacksAndMessages(null);
        x xVar = this.f19729u;
        d02 d02Var = this.f19727s;
        CopyOnWriteArrayList<w> copyOnWriteArrayList = (CopyOnWriteArrayList) ((z) xVar).f22430c.f21157b;
        for (w wVar : copyOnWriteArrayList) {
            if (wVar.f21329b == d02Var) {
                wVar.f21330c = true;
                copyOnWriteArrayList.remove(wVar);
            }
        }
        this.f19708a0.getClass();
        nz1 nz1VarI1 = i1(this.f19708a0, 1);
        this.f19708a0 = nz1VarI1;
        nz1 nz1VarG = nz1VarI1.g(nz1VarI1.f18039b);
        this.f19708a0 = nz1VarG;
        nz1VarG.f18052p = nz1VarG.f18054r;
        this.f19708a0.f18053q = 0L;
        ys0 ys0Var = d02Var.f13333h;
        ys0Var.getClass();
        ys0Var.e(new ry0(d02Var, 16));
        Surface surface = this.P;
        if (surface != null) {
            surface.release();
            this.P = null;
        }
        m91 m91Var = a90.f11940a;
        this.Y = true;
        if (this.f19708a0.f18038a.g()) {
            return;
        }
        nz1 nz1Var = this.f19708a0;
        boolean z10 = nz1Var.f18038a.e(nz1Var.f18039b.f19359a) != -1;
        Locale locale = Locale.US;
        nz1 nz1Var2 = this.f19708a0;
        ps1.d0(String.format(locale, "periodUid %s not found in timeline %s with size %d", nz1Var2.f18039b.f19359a, nz1Var2.f18038a.getClass().getName(), Integer.valueOf(this.f19708a0.f18038a.a())), z10);
    }

    public final void b1(dy1 dy1Var) {
        nz1 nz1Var = this.f19708a0;
        nz1 nz1VarG = nz1Var.g(nz1Var.f18039b);
        nz1VarG.f18052p = nz1VarG.f18054r;
        nz1VarG.f18053q = 0L;
        nz1 nz1VarI1 = i1(nz1VarG, 1);
        if (dy1Var != null) {
            nz1VarI1 = nz1VarI1.e(dy1Var);
        }
        nz1 nz1Var2 = nz1VarI1;
        this.G++;
        Handler handler = this.f19721m.f21632g.f22362a;
        ss0 ss0VarG = ys0.g();
        ss0VarG.f20047a = handler.obtainMessage(6);
        ss0VarG.a();
        f1(nz1Var2, 0, false, 5, C.TIME_UNSET, -1);
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final int c() {
        l0();
        if (V0()) {
            return this.f19708a0.f18039b.f19360b;
        }
        return -1;
    }

    public final int c1(nz1 nz1Var) {
        ci ciVar = nz1Var.f18038a;
        return ciVar.g() ? this.f19709b0 : ciVar.o(nz1Var.f18039b.f19359a, this.f19724p).f20772c;
    }

    public final long d1(nz1 nz1Var) {
        long jS = uu0.s(0L);
        r32 r32Var = nz1Var.f18039b;
        if (!r32Var.b()) {
            return uu0.s(e1(nz1Var));
        }
        ci ciVar = nz1Var.f18038a;
        ciVar.o(r32Var.f19359a, this.f19724p);
        long j10 = nz1Var.f18040c;
        if (j10 != C.TIME_UNSET) {
            return uu0.s(j10) + jS;
        }
        ciVar.b(c1(nz1Var), (ih) this.f17550a, 0L).getClass();
        return jS;
    }

    public final long e1(nz1 nz1Var) {
        ci ciVar = nz1Var.f18038a;
        if (ciVar.g()) {
            return uu0.t(this.f19711c0);
        }
        long j10 = nz1Var.f18054r;
        r32 r32Var = nz1Var.f18039b;
        if (r32Var.b()) {
            return j10;
        }
        ciVar.o(r32Var.f19359a, this.f19724p);
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0201  */
    /* JADX WARN: Code duplicated, block: B:113:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0213  */
    /* JADX WARN: Code duplicated, block: B:122:0x0219  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0225  */
    /* JADX WARN: Code duplicated, block: B:131:0x022b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0231  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:140:0x023d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:0x0249  */
    /* JADX WARN: Code duplicated, block: B:149:0x0253  */
    /* JADX WARN: Code duplicated, block: B:153:0x026c  */
    /* JADX WARN: Code duplicated, block: B:154:0x026e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0276  */
    /* JADX WARN: Code duplicated, block: B:158:0x0278  */
    /* JADX WARN: Code duplicated, block: B:161:0x027e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0289  */
    /* JADX WARN: Code duplicated, block: B:169:0x0299  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:178:0x02be  */
    /* JADX WARN: Code duplicated, block: B:180:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:183:0x0302  */
    /* JADX WARN: Code duplicated, block: B:185:0x0312  */
    /* JADX WARN: Code duplicated, block: B:187:0x031a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0327  */
    /* JADX WARN: Code duplicated, block: B:190:0x032c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0334  */
    /* JADX WARN: Code duplicated, block: B:193:0x0337  */
    /* JADX WARN: Code duplicated, block: B:195:0x033f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0346  */
    /* JADX WARN: Code duplicated, block: B:199:0x0376  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:208:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:211:0x040f  */
    /* JADX WARN: Code duplicated, block: B:213:0x041c  */
    /* JADX WARN: Code duplicated, block: B:216:0x042b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0442  */
    /* JADX WARN: Code duplicated, block: B:219:0x0452  */
    /* JADX WARN: Code duplicated, block: B:221:0x0455  */
    /* JADX WARN: Code duplicated, block: B:222:0x0461  */
    /* JADX WARN: Code duplicated, block: B:225:0x0466  */
    /* JADX WARN: Code duplicated, block: B:228:0x0474  */
    /* JADX WARN: Code duplicated, block: B:235:0x048b  */
    /* JADX WARN: Code duplicated, block: B:238:0x049d  */
    /* JADX WARN: Code duplicated, block: B:241:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:244:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:250:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:253:0x0509  */
    /* JADX WARN: Code duplicated, block: B:254:0x050c  */
    /* JADX WARN: Code duplicated, block: B:256:0x051d  */
    /* JADX WARN: Code duplicated, block: B:257:0x051f  */
    /* JADX WARN: Code duplicated, block: B:260:0x052a  */
    /* JADX WARN: Code duplicated, block: B:261:0x052c  */
    /* JADX WARN: Code duplicated, block: B:263:0x053d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0548  */
    /* JADX WARN: Code duplicated, block: B:268:0x055e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0562  */
    /* JADX WARN: Code duplicated, block: B:273:0x056f  */
    /* JADX WARN: Code duplicated, block: B:276:0x0583  */
    /* JADX WARN: Code duplicated, block: B:280:0x059d A[LOOP:0: B:278:0x0595->B:280:0x059d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:284:0x05ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x05be  */
    /* JADX WARN: Code duplicated, block: B:294:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:296:0x05c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:304:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:306:0x05db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x05df  */
    /* JADX WARN: Code duplicated, block: B:310:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:312:0x05e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:320:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:322:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:324:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x0609  */
    /* JADX WARN: Code duplicated, block: B:328:0x060c  */
    /* JADX WARN: Code duplicated, block: B:330:0x0613 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:332:0x0617  */
    /* JADX WARN: Code duplicated, block: B:334:0x061a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0630  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167 A[LOOP:2: B:61:0x0160->B:63:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f1(final nz1 nz1Var, int i10, boolean z10, int i11, long j10, int i12) {
        int i13;
        int i14;
        boolean z11;
        Pair pair;
        boolean z12;
        boolean z13;
        int i15;
        boolean zBooleanValue;
        int iIntValue;
        f5 f5Var;
        o6 o6VarA;
        List list;
        int i16;
        boolean z14;
        s8 s8Var;
        int i17;
        v7[] v7VarArr;
        boolean z15;
        ci ciVarO0;
        o6 o6VarA2;
        f7 f7Var;
        f7 f7Var2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Integer num11;
        Integer num12;
        CharSequence charSequence9;
        CharSequence charSequence10;
        Integer num13;
        ca1 ca1Var;
        boolean zEquals;
        int i18;
        int i19;
        n6 n6Var;
        hx0 hx0Var;
        int iJ0;
        boolean zL0;
        boolean z16;
        dy1 dy1Var;
        dy1 dy1Var2;
        s sVar;
        s sVar2;
        int i20;
        final int i21;
        int i22;
        final int i23;
        pd pdVar;
        xz1 xz1Var;
        boolean zV0;
        ci ciVarO1;
        int i24;
        ci ciVarO2;
        int i25;
        int i26;
        int i27;
        ci ciVarO3;
        int iR0;
        int i28;
        ci ciVarO4;
        boolean z17;
        ci ciVarO5;
        boolean z18;
        boolean zG;
        t02 t02Var;
        z02 z02Var;
        int i29;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        pd pdVar2;
        mk0 mk0Var;
        ug ugVar;
        int i30;
        int i31;
        Object obj;
        f5 f5Var2;
        Object obj2;
        long jG1;
        long jG2;
        int iR1;
        int iQ0;
        int i32;
        Object obj3;
        f5 f5Var3;
        Object obj4;
        long jS;
        long jS2;
        r32 r32Var;
        int i33 = i11;
        nz1 nz1Var2 = this.f19708a0;
        this.f19708a0 = nz1Var;
        ci ciVar = nz1Var.f18038a;
        if (!ciVar.g()) {
            Object obj5 = nz1Var.f18039b.f19359a;
            ps1.d0(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, ciVar.getClass().getName(), Integer.valueOf(ciVar.a())), ciVar.e(obj5) != -1);
        }
        ci ciVar2 = nz1Var2.f18038a;
        boolean zEquals2 = ciVar2.equals(ciVar);
        if (!ciVar.g() || !ciVar2.g()) {
            if (ciVar.g() != ciVar2.g()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                r32 r32Var2 = nz1Var2.f18039b;
                Object obj6 = r32Var2.f19359a;
                i13 = 0;
                ug ugVar2 = this.f19724p;
                int i34 = ciVar2.o(obj6, ugVar2).f20772c;
                ih ihVar = (ih) this.f17550a;
                Object obj7 = ciVar2.b(i34, ihVar, 0L).f15744a;
                r32 r32Var3 = nz1Var.f18039b;
                if (obj7.equals(ciVar.b(ciVar.o(r32Var3.f19359a, ugVar2).f20772c, ihVar, 0L).f15744a)) {
                    if (z10) {
                        if (i33 != 0) {
                            i14 = i33;
                        } else if (r32Var2.f19362d < r32Var3.f19362d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i14 = 0;
                            z11 = true;
                        } else {
                            i14 = 0;
                        }
                        z11 = true;
                    } else {
                        i14 = i33;
                        z11 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (z10) {
                        if (i33 == 0) {
                            i33 = 0;
                            i15 = 1;
                            z13 = true;
                        } else {
                            z12 = true;
                            z13 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i15));
                        i14 = i33;
                        z11 = z13;
                    } else {
                        z12 = false;
                        z13 = false;
                    }
                    if (z12 && i33 == 1) {
                        i15 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i15 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i15));
                    i14 = i33;
                    z11 = z13;
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (ciVar.g()) {
                    f5Var = null;
                } else {
                    f5Var = ciVar.b(ciVar.o(nz1Var.f18039b.f19359a, this.f19724p).f20772c, (ih) this.f17550a, 0L).f15745b;
                }
                this.Z = f7.B;
            } else {
                f5Var = null;
            }
            if (zBooleanValue && nz1Var2.f18047j.equals(nz1Var.f18047j)) {
                z14 = z11;
            } else {
                o6VarA = this.Z.a();
                list = nz1Var.f18047j;
                i16 = i13;
                while (i16 < list.size()) {
                    s8Var = (s8) list.get(i16);
                    i17 = i13;
                    while (true) {
                        v7VarArr = s8Var.f19891a;
                        z15 = z11;
                        if (i17 < v7VarArr.length) {
                            v7VarArr[i17].a(o6VarA);
                            i17++;
                            z11 = z15;
                        }
                    }
                    i16++;
                    z11 = z15;
                }
                z14 = z11;
                this.Z = new f7(o6VarA);
            }
            ciVarO0 = O0();
            if (ciVarO0.g()) {
                f7Var2 = this.Z;
            } else {
                f5 f5Var4 = ciVarO0.b(R0(), (ih) this.f17550a, 0L).f15745b;
                o6VarA2 = this.Z.a();
                f7Var = f5Var4.f14216d;
                if (f7Var != null) {
                    charSequence = f7Var.f14272a;
                    if (charSequence != null) {
                        o6VarA2.f18151a = charSequence;
                    }
                    charSequence2 = f7Var.f14273b;
                    if (charSequence2 != null) {
                        o6VarA2.f18152b = charSequence2;
                    }
                    charSequence3 = f7Var.f14274c;
                    if (charSequence3 != null) {
                        o6VarA2.f18153c = charSequence3;
                    }
                    charSequence4 = f7Var.f14275d;
                    if (charSequence4 != null) {
                        o6VarA2.f18154d = charSequence4;
                    }
                    charSequence5 = f7Var.f14276e;
                    if (charSequence5 != null) {
                        o6VarA2.f18155e = charSequence5;
                    }
                    bArr = f7Var.f14277f;
                    if (bArr != null) {
                        Integer num14 = f7Var.f14278g;
                        o6VarA2.f18156f = (byte[]) bArr.clone();
                        o6VarA2.f18157g = num14;
                    }
                    num = f7Var.f14279h;
                    if (num != null) {
                        o6VarA2.f18158h = num;
                    }
                    num2 = f7Var.f14280i;
                    if (num2 != null) {
                        o6VarA2.f18159i = num2;
                    }
                    num3 = f7Var.f14281j;
                    if (num3 != null) {
                        o6VarA2.f18160j = num3;
                    }
                    bool = f7Var.f14282k;
                    if (bool != null) {
                        o6VarA2.f18161k = bool;
                    }
                    num4 = f7Var.l;
                    if (num4 != null) {
                        o6VarA2.l = num4;
                    }
                    num5 = f7Var.f14283m;
                    if (num5 != null) {
                        o6VarA2.l = num5;
                    }
                    num6 = f7Var.f14284n;
                    if (num6 != null) {
                        o6VarA2.f18162m = num6;
                    }
                    num7 = f7Var.f14285o;
                    if (num7 != null) {
                        o6VarA2.f18163n = num7;
                    }
                    num8 = f7Var.f14286p;
                    if (num8 != null) {
                        o6VarA2.f18164o = num8;
                    }
                    num9 = f7Var.f14287q;
                    if (num9 != null) {
                        o6VarA2.f18165p = num9;
                    }
                    num10 = f7Var.f14288r;
                    if (num10 != null) {
                        o6VarA2.f18166q = num10;
                    }
                    charSequence6 = f7Var.f14289s;
                    if (charSequence6 != null) {
                        o6VarA2.f18167r = charSequence6;
                    }
                    charSequence7 = f7Var.f14290t;
                    if (charSequence7 != null) {
                        o6VarA2.f18168s = charSequence7;
                    }
                    charSequence8 = f7Var.f14291u;
                    if (charSequence8 != null) {
                        o6VarA2.f18169t = charSequence8;
                    }
                    num11 = f7Var.f14292v;
                    if (num11 != null) {
                        o6VarA2.f18170u = num11;
                    }
                    num12 = f7Var.f14293w;
                    if (num12 != null) {
                        o6VarA2.f18171v = num12;
                    }
                    charSequence9 = f7Var.f14294x;
                    if (charSequence9 != null) {
                        o6VarA2.f18172w = charSequence9;
                    }
                    charSequence10 = f7Var.f14295y;
                    if (charSequence10 != null) {
                        o6VarA2.f18173x = charSequence10;
                    }
                    num13 = f7Var.f14296z;
                    if (num13 != null) {
                        o6VarA2.f18174y = num13;
                    }
                    ca1Var = f7Var.A;
                    if (!ca1Var.isEmpty()) {
                        o6VarA2.f18175z = ca1.y(ca1Var);
                    }
                }
                f7Var2 = new f7(o6VarA2);
            }
            zEquals = f7Var2.equals(this.N);
            this.N = f7Var2;
            if (nz1Var2.l != nz1Var.l) {
                i18 = 1;
            } else {
                i18 = i13;
            }
            if (nz1Var2.f18042e != nz1Var.f18042e) {
                i19 = 1;
            } else {
                i19 = i13;
            }
            if (i19 == 0 || i18 != 0) {
                n6Var = this.f19734z;
                hx0Var = this.f19733y;
                iJ0 = J0();
                if (iJ0 != 2 || iJ0 == 3) {
                    l0();
                    this.f19708a0.getClass();
                    hx0Var.j(L0());
                    zL0 = L0();
                    if (n6Var.f17679b != zL0) {
                        n6Var.f17679b = zL0;
                    }
                } else {
                    boolean z26 = i13;
                    hx0Var.j(z26);
                    if (n6Var.f17679b) {
                        n6Var.f17679b = z26;
                    }
                }
            }
            if (nz1Var2.f18044g != nz1Var.f18044g) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!zEquals2) {
                this.f19722n.i(0, new my1(nz1Var, i10));
            }
            if (z14) {
                ugVar = new ug();
                if (ciVar2.g()) {
                    i30 = i12;
                    i31 = i30;
                    obj = null;
                    f5Var2 = null;
                    obj2 = null;
                } else {
                    Object obj8 = nz1Var2.f18039b.f19359a;
                    ciVar2.o(obj8, ugVar);
                    int i35 = ugVar.f20772c;
                    int iE = ciVar2.e(obj8);
                    ih ihVar2 = (ih) this.f17550a;
                    obj = ciVar2.b(i35, ihVar2, 0L).f15744a;
                    f5Var2 = ihVar2.f15745b;
                    obj2 = obj8;
                    i30 = i35;
                    i31 = iE;
                }
                if (i14 == 0) {
                    r32Var = nz1Var2.f18039b;
                    if (r32Var.b()) {
                        jG1 = ugVar.b(r32Var.f19360b, r32Var.f19361c);
                        jG2 = g1(nz1Var2);
                    } else {
                        if (r32Var.f19363e != -1) {
                            jG1 = g1(this.f19708a0);
                        } else {
                            jG1 = ugVar.f20773d;
                        }
                        jG2 = jG1;
                    }
                } else if (nz1Var2.f18039b.b()) {
                    jG1 = nz1Var2.f18054r;
                    jG2 = g1(nz1Var2);
                } else {
                    jG1 = nz1Var2.f18054r;
                    jG2 = jG1;
                }
                String str = uu0.f20901a;
                r32 r32Var4 = nz1Var2.f18039b;
                jf jfVar = new jf(obj, i30, f5Var2, obj2, i31, uu0.s(jG1), uu0.s(jG2), r32Var4.f19360b, r32Var4.f19361c);
                iR1 = R0();
                iQ0 = Q0();
                if (this.f19708a0.f18038a.g()) {
                    i32 = iQ0;
                    obj3 = null;
                    f5Var3 = null;
                    obj4 = null;
                } else {
                    nz1 nz1Var3 = this.f19708a0;
                    Object obj9 = nz1Var3.f18039b.f19359a;
                    nz1Var3.f18038a.o(obj9, this.f19724p);
                    int iE2 = this.f19708a0.f18038a.e(obj9);
                    ci ciVar3 = this.f19708a0.f18038a;
                    ih ihVar3 = (ih) this.f17550a;
                    i32 = iE2;
                    obj3 = ciVar3.b(iR1, ihVar3, 0L).f15744a;
                    f5Var3 = ihVar3.f15745b;
                    obj4 = obj9;
                }
                jS = uu0.s(j10);
                if (this.f19708a0.f18039b.b()) {
                    jS2 = uu0.s(g1(this.f19708a0));
                } else {
                    jS2 = jS;
                }
                r32 r32Var5 = this.f19708a0.f18039b;
                jf jfVar2 = new jf(obj3, iR1, f5Var3, obj4, i32, jS, jS2, r32Var5.f19360b, r32Var5.f19361c);
                mk0 mk0Var2 = this.f19722n;
                pb pbVar = new pb();
                pbVar.f18582a = i14;
                pbVar.f18583b = jfVar;
                pbVar.f18584c = jfVar2;
                mk0Var2.i(11, pbVar);
            } else {
                i19 = i19;
                z16 = z16;
            }
            if (zBooleanValue) {
                this.f19722n.i(1, new ey1(f5Var, iIntValue));
            }
            dy1Var = nz1Var2.f18043f;
            dy1Var2 = nz1Var.f18043f;
            if (dy1Var != dy1Var2) {
                mk0Var = this.f19722n;
                final int i36 = 2;
                mk0Var.i(10, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj10) {
                        int i37 = i36;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj10;
                        switch (i37) {
                            case 0:
                                int i38 = ry1.f19707e0;
                                boolean z27 = nz1Var4.l;
                                oeVar.zzh();
                                break;
                            case 1:
                                int i39 = ry1.f19707e0;
                                nz1Var4.getClass();
                                oeVar.zzl();
                                break;
                            default:
                                int i40 = ry1.f19707e0;
                                oeVar.l(nz1Var4.f18043f);
                                break;
                        }
                    }
                });
                if (dy1Var2 != null) {
                    final int i37 = 0;
                    mk0Var.i(10, new li0() { // from class: com.google.android.gms.internal.ads.ky1
                        @Override // com.google.android.gms.internal.ads.li0
                        /* JADX INFO: renamed from: zza */
                        public final /* synthetic */ void mo161zza(Object obj10) {
                            int i38 = i37;
                            nz1 nz1Var4 = nz1Var;
                            oe oeVar = (oe) obj10;
                            switch (i38) {
                                case 0:
                                    int i39 = ry1.f19707e0;
                                    oeVar.m(nz1Var4.f18043f);
                                    break;
                                case 1:
                                    int i40 = ry1.f19707e0;
                                    oeVar.j(nz1Var4.f18042e);
                                    break;
                                default:
                                    int i41 = ry1.f19707e0;
                                    cc ccVar = nz1Var4.f18051o;
                                    oeVar.zzp();
                                    break;
                            }
                        }
                    });
                }
            }
            sVar = nz1Var2.f18046i;
            sVar2 = nz1Var.f18046i;
            if (sVar != sVar2) {
                m mVar = this.f19719j;
                Object obj10 = sVar2.f19746e;
                mVar.getClass();
                final int i38 = 0;
                this.f19722n.i(2, new li0() { // from class: com.google.android.gms.internal.ads.ly1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj11) {
                        int i39 = i38;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj11;
                        switch (i39) {
                            case 0:
                                int i40 = ry1.f19707e0;
                                Object obj12 = nz1Var4.f18046i.f19745d;
                                oeVar.zzd();
                                break;
                            default:
                                int i41 = ry1.f19707e0;
                                boolean z27 = nz1Var4.l;
                                oeVar.zzj();
                                break;
                        }
                    }
                });
            }
            if (zEquals) {
                i20 = 3;
            } else {
                i20 = 3;
                this.f19722n.i(14, new ey1(this.N, i20));
            }
            if (z16) {
                i21 = 0;
                this.f19722n.i(i20, new my1(nz1Var, 0, (byte) 0));
            } else {
                i21 = 0;
            }
            if (i19 == 0 || i18 != 0) {
                this.f19722n.i(-1, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj11) {
                        int i39 = i21;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj11;
                        switch (i39) {
                            case 0:
                                int i310 = ry1.f19707e0;
                                boolean z27 = nz1Var4.l;
                                oeVar.zzh();
                                break;
                            case 1:
                                int i311 = ry1.f19707e0;
                                nz1Var4.getClass();
                                oeVar.zzl();
                                break;
                            default:
                                int i40 = ry1.f19707e0;
                                oeVar.l(nz1Var4.f18043f);
                                break;
                        }
                    }
                });
            }
            i22 = 4;
            if (i19 != 0) {
                final int i39 = 1;
                this.f19722n.i(4, new li0() { // from class: com.google.android.gms.internal.ads.ky1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj11) {
                        int i310 = i39;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj11;
                        switch (i310) {
                            case 0:
                                int i311 = ry1.f19707e0;
                                oeVar.m(nz1Var4.f18043f);
                                break;
                            case 1:
                                int i40 = ry1.f19707e0;
                                oeVar.j(nz1Var4.f18042e);
                                break;
                            default:
                                int i41 = ry1.f19707e0;
                                cc ccVar = nz1Var4.f18051o;
                                oeVar.zzp();
                                break;
                        }
                    }
                });
            }
            if (i18 == 0 || nz1Var2.f18049m != nz1Var.f18049m) {
                i23 = 1;
                this.f19722n.i(5, new li0() { // from class: com.google.android.gms.internal.ads.ly1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj11) {
                        int i310 = i23;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj11;
                        switch (i310) {
                            case 0:
                                int i40 = ry1.f19707e0;
                                Object obj12 = nz1Var4.f18046i.f19745d;
                                oeVar.zzd();
                                break;
                            default:
                                int i41 = ry1.f19707e0;
                                boolean z27 = nz1Var4.l;
                                oeVar.zzj();
                                break;
                        }
                    }
                });
            } else {
                i23 = 1;
            }
            if (nz1Var2.f18050n != nz1Var.f18050n) {
                this.f19722n.i(6, new my1(nz1Var, i23, (byte) 0));
            }
            if (nz1Var2.i() != nz1Var.i()) {
                this.f19722n.i(7, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj11) {
                        int i310 = i23;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj11;
                        switch (i310) {
                            case 0:
                                int i311 = ry1.f19707e0;
                                boolean z27 = nz1Var4.l;
                                oeVar.zzh();
                                break;
                            case 1:
                                int i312 = ry1.f19707e0;
                                nz1Var4.getClass();
                                oeVar.zzl();
                                break;
                            default:
                                int i40 = ry1.f19707e0;
                                oeVar.l(nz1Var4.f18043f);
                                break;
                        }
                    }
                });
            }
            if (!nz1Var2.f18051o.equals(nz1Var.f18051o)) {
                final int i40 = 2;
                this.f19722n.i(12, new li0() { // from class: com.google.android.gms.internal.ads.ky1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj11) {
                        int i310 = i40;
                        nz1 nz1Var4 = nz1Var;
                        oe oeVar = (oe) obj11;
                        switch (i310) {
                            case 0:
                                int i311 = ry1.f19707e0;
                                oeVar.m(nz1Var4.f18043f);
                                break;
                            case 1:
                                int i41 = ry1.f19707e0;
                                oeVar.j(nz1Var4.f18042e);
                                break;
                            default:
                                int i42 = ry1.f19707e0;
                                cc ccVar = nz1Var4.f18051o;
                                oeVar.zzp();
                                break;
                        }
                    }
                });
            }
            pdVar = this.M;
            xz1Var = this.f19716g;
            pd pdVar3 = this.f19712d;
            String str2 = uu0.f20901a;
            zV0 = xz1Var.V0();
            ciVarO1 = xz1Var.O0();
            if (ciVarO1.g() && ciVarO1.b(xz1Var.R0(), (ih) xz1Var.f17550a, 0L).f15749f) {
                i24 = i23;
            } else {
                i24 = 0;
            }
            ciVarO2 = xz1Var.O0();
            if (ciVarO2.g()) {
                i27 = 0;
                i26 = -1;
            } else {
                int iR2 = xz1Var.R0();
                xz1Var.zzl();
                xz1Var.M0();
                i25 = ciVarO2.i(iR2);
                i26 = -1;
                if (i25 != -1) {
                    i27 = i23;
                } else {
                    i27 = 0;
                }
            }
            ciVarO3 = xz1Var.O0();
            if (ciVarO3.g()) {
                i28 = 0;
            } else {
                iR0 = xz1Var.R0();
                xz1Var.zzl();
                xz1Var.M0();
                if (ciVarO3.h(iR0, 0, false) != i26) {
                    i28 = i23;
                } else {
                    i28 = 0;
                }
            }
            ciVarO4 = xz1Var.O0();
            if (!ciVarO4.g()) {
                z17 = zV0;
                int i41 = ciVarO4.b(xz1Var.R0(), (ih) xz1Var.f17550a, 0L).b() ? i23 : 0;
                ciVarO5 = xz1Var.O0();
                if (ciVarO5.g() && ciVarO5.b(xz1Var.R0(), (ih) xz1Var.f17550a, 0L).f15750g) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zG = xz1Var.O0().g();
                t02Var = new t02(0);
                z02Var = pdVar3.f18587a;
                for (i29 = 0; i29 < z02Var.f22445a.size(); i29++) {
                    t02Var.c(z02Var.a(i29));
                }
                if (!z17) {
                    t02Var.c(4);
                }
                if (i24 != 0 || z17) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                if (z19) {
                    t02Var.c(5);
                }
                if (i27 != 0 || z17) {
                    z20 = false;
                } else {
                    z20 = true;
                }
                if (z20) {
                    t02Var.c(6);
                }
                if (!zG || ((i27 == 0 && i41 != 0 && i24 == 0) || z17)) {
                    z21 = false;
                } else {
                    z21 = true;
                }
                if (z21) {
                    t02Var.c(7);
                }
                if (i28 != 0 || z17) {
                    z22 = false;
                } else {
                    z22 = true;
                }
                if (z22) {
                    t02Var.c(8);
                }
                if (!zG || ((i28 == 0 && (i41 == 0 || !z18)) || z17)) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                if (z23) {
                    t02Var.c(9);
                }
                if (!z17) {
                    t02Var.c(10);
                }
                if (i24 != 0 || z17) {
                    z24 = false;
                } else {
                    z24 = true;
                }
                if (z24) {
                    t02Var.c(11);
                }
                if (i24 != 0 || z17) {
                    z25 = false;
                } else {
                    z25 = true;
                }
                if (z25) {
                    t02Var.c(12);
                }
                pdVar2 = new pd(t02Var.d());
                this.M = pdVar2;
                if (!pdVar2.equals(pdVar)) {
                    this.f19722n.i(13, new ey1(this, i22));
                }
                this.f19722n.j();
            }
            z17 = zV0;
            ciVarO5 = xz1Var.O0();
            if (ciVarO5.g()) {
                z18 = false;
            } else {
                z18 = false;
            }
            zG = xz1Var.O0().g();
            t02Var = new t02(0);
            z02Var = pdVar3.f18587a;
            while (i29 < z02Var.f22445a.size()) {
                t02Var.c(z02Var.a(i29));
            }
            if (!z17) {
                t02Var.c(4);
            }
            if (i24 != 0) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                t02Var.c(5);
            }
            if (i27 != 0) {
                z20 = false;
            } else {
                z20 = false;
            }
            if (z20) {
                t02Var.c(6);
            }
            if (zG) {
                z21 = false;
            } else {
                z21 = false;
            }
            if (z21) {
                t02Var.c(7);
            }
            if (i28 != 0) {
                z22 = false;
            } else {
                z22 = false;
            }
            if (z22) {
                t02Var.c(8);
            }
            if (zG) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z23) {
                t02Var.c(9);
            }
            if (!z17) {
                t02Var.c(10);
            }
            if (i24 != 0) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (z24) {
                t02Var.c(11);
            }
            if (i24 != 0) {
                z25 = false;
            } else {
                z25 = false;
            }
            if (z25) {
                t02Var.c(12);
            }
            pdVar2 = new pd(t02Var.d());
            this.M = pdVar2;
            if (!pdVar2.equals(pdVar)) {
                this.f19722n.i(13, new ey1(this, i22));
            }
            this.f19722n.j();
        }
        pair = new Pair(Boolean.FALSE, -1);
        i14 = i33;
        i13 = 0;
        z11 = z10;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (ciVar.g()) {
                f5Var = ciVar.b(ciVar.o(nz1Var.f18039b.f19359a, this.f19724p).f20772c, (ih) this.f17550a, 0L).f15745b;
            } else {
                f5Var = null;
            }
            this.Z = f7.B;
        } else {
            f5Var = null;
        }
        if (zBooleanValue) {
            o6VarA = this.Z.a();
            list = nz1Var.f18047j;
            i16 = i13;
            while (i16 < list.size()) {
                s8Var = (s8) list.get(i16);
                i17 = i13;
                while (true) {
                    v7VarArr = s8Var.f19891a;
                    z15 = z11;
                    if (i17 < v7VarArr.length) {
                        v7VarArr[i17].a(o6VarA);
                        i17++;
                        z11 = z15;
                    }
                }
                i16++;
                z11 = z15;
            }
            z14 = z11;
            this.Z = new f7(o6VarA);
        } else {
            o6VarA = this.Z.a();
            list = nz1Var.f18047j;
            i16 = i13;
            while (i16 < list.size()) {
                s8Var = (s8) list.get(i16);
                i17 = i13;
                while (true) {
                    v7VarArr = s8Var.f19891a;
                    z15 = z11;
                    if (i17 < v7VarArr.length) {
                        v7VarArr[i17].a(o6VarA);
                        i17++;
                        z11 = z15;
                    }
                }
                i16++;
                z11 = z15;
            }
            z14 = z11;
            this.Z = new f7(o6VarA);
        }
        ciVarO0 = O0();
        if (ciVarO0.g()) {
            f7Var2 = this.Z;
        } else {
            f5 f5Var5 = ciVarO0.b(R0(), (ih) this.f17550a, 0L).f15745b;
            o6VarA2 = this.Z.a();
            f7Var = f5Var5.f14216d;
            if (f7Var != null) {
                charSequence = f7Var.f14272a;
                if (charSequence != null) {
                    o6VarA2.f18151a = charSequence;
                }
                charSequence2 = f7Var.f14273b;
                if (charSequence2 != null) {
                    o6VarA2.f18152b = charSequence2;
                }
                charSequence3 = f7Var.f14274c;
                if (charSequence3 != null) {
                    o6VarA2.f18153c = charSequence3;
                }
                charSequence4 = f7Var.f14275d;
                if (charSequence4 != null) {
                    o6VarA2.f18154d = charSequence4;
                }
                charSequence5 = f7Var.f14276e;
                if (charSequence5 != null) {
                    o6VarA2.f18155e = charSequence5;
                }
                bArr = f7Var.f14277f;
                if (bArr != null) {
                    Integer num15 = f7Var.f14278g;
                    o6VarA2.f18156f = (byte[]) bArr.clone();
                    o6VarA2.f18157g = num15;
                }
                num = f7Var.f14279h;
                if (num != null) {
                    o6VarA2.f18158h = num;
                }
                num2 = f7Var.f14280i;
                if (num2 != null) {
                    o6VarA2.f18159i = num2;
                }
                num3 = f7Var.f14281j;
                if (num3 != null) {
                    o6VarA2.f18160j = num3;
                }
                bool = f7Var.f14282k;
                if (bool != null) {
                    o6VarA2.f18161k = bool;
                }
                num4 = f7Var.l;
                if (num4 != null) {
                    o6VarA2.l = num4;
                }
                num5 = f7Var.f14283m;
                if (num5 != null) {
                    o6VarA2.l = num5;
                }
                num6 = f7Var.f14284n;
                if (num6 != null) {
                    o6VarA2.f18162m = num6;
                }
                num7 = f7Var.f14285o;
                if (num7 != null) {
                    o6VarA2.f18163n = num7;
                }
                num8 = f7Var.f14286p;
                if (num8 != null) {
                    o6VarA2.f18164o = num8;
                }
                num9 = f7Var.f14287q;
                if (num9 != null) {
                    o6VarA2.f18165p = num9;
                }
                num10 = f7Var.f14288r;
                if (num10 != null) {
                    o6VarA2.f18166q = num10;
                }
                charSequence6 = f7Var.f14289s;
                if (charSequence6 != null) {
                    o6VarA2.f18167r = charSequence6;
                }
                charSequence7 = f7Var.f14290t;
                if (charSequence7 != null) {
                    o6VarA2.f18168s = charSequence7;
                }
                charSequence8 = f7Var.f14291u;
                if (charSequence8 != null) {
                    o6VarA2.f18169t = charSequence8;
                }
                num11 = f7Var.f14292v;
                if (num11 != null) {
                    o6VarA2.f18170u = num11;
                }
                num12 = f7Var.f14293w;
                if (num12 != null) {
                    o6VarA2.f18171v = num12;
                }
                charSequence9 = f7Var.f14294x;
                if (charSequence9 != null) {
                    o6VarA2.f18172w = charSequence9;
                }
                charSequence10 = f7Var.f14295y;
                if (charSequence10 != null) {
                    o6VarA2.f18173x = charSequence10;
                }
                num13 = f7Var.f14296z;
                if (num13 != null) {
                    o6VarA2.f18174y = num13;
                }
                ca1Var = f7Var.A;
                if (!ca1Var.isEmpty()) {
                    o6VarA2.f18175z = ca1.y(ca1Var);
                }
            }
            f7Var2 = new f7(o6VarA2);
        }
        zEquals = f7Var2.equals(this.N);
        this.N = f7Var2;
        if (nz1Var2.l != nz1Var.l) {
            i18 = 1;
        } else {
            i18 = i13;
        }
        if (nz1Var2.f18042e != nz1Var.f18042e) {
            i19 = 1;
        } else {
            i19 = i13;
        }
        if (i19 == 0) {
            n6Var = this.f19734z;
            hx0Var = this.f19733y;
            iJ0 = J0();
            if (iJ0 != 2) {
                l0();
                this.f19708a0.getClass();
                hx0Var.j(L0());
                zL0 = L0();
                if (n6Var.f17679b != zL0) {
                    n6Var.f17679b = zL0;
                }
            } else {
                l0();
                this.f19708a0.getClass();
                hx0Var.j(L0());
                zL0 = L0();
                if (n6Var.f17679b != zL0) {
                    n6Var.f17679b = zL0;
                }
            }
        } else {
            n6Var = this.f19734z;
            hx0Var = this.f19733y;
            iJ0 = J0();
            if (iJ0 != 2) {
                l0();
                this.f19708a0.getClass();
                hx0Var.j(L0());
                zL0 = L0();
                if (n6Var.f17679b != zL0) {
                    n6Var.f17679b = zL0;
                }
            } else {
                l0();
                this.f19708a0.getClass();
                hx0Var.j(L0());
                zL0 = L0();
                if (n6Var.f17679b != zL0) {
                    n6Var.f17679b = zL0;
                }
            }
        }
        if (nz1Var2.f18044g != nz1Var.f18044g) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!zEquals2) {
            this.f19722n.i(0, new my1(nz1Var, i10));
        }
        if (z14) {
            ugVar = new ug();
            if (ciVar2.g()) {
                Object obj11 = nz1Var2.f18039b.f19359a;
                ciVar2.o(obj11, ugVar);
                int i310 = ugVar.f20772c;
                int iE3 = ciVar2.e(obj11);
                ih ihVar4 = (ih) this.f17550a;
                obj = ciVar2.b(i310, ihVar4, 0L).f15744a;
                f5Var2 = ihVar4.f15745b;
                obj2 = obj11;
                i30 = i310;
                i31 = iE3;
            } else {
                i30 = i12;
                i31 = i30;
                obj = null;
                f5Var2 = null;
                obj2 = null;
            }
            if (i14 == 0) {
                r32Var = nz1Var2.f18039b;
                if (r32Var.b()) {
                    jG1 = ugVar.b(r32Var.f19360b, r32Var.f19361c);
                    jG2 = g1(nz1Var2);
                } else {
                    if (r32Var.f19363e != -1) {
                        jG1 = g1(this.f19708a0);
                    } else {
                        jG1 = ugVar.f20773d;
                    }
                    jG2 = jG1;
                }
            } else if (nz1Var2.f18039b.b()) {
                jG1 = nz1Var2.f18054r;
                jG2 = g1(nz1Var2);
            } else {
                jG1 = nz1Var2.f18054r;
                jG2 = jG1;
            }
            String str3 = uu0.f20901a;
            r32 r32Var6 = nz1Var2.f18039b;
            jf jfVar3 = new jf(obj, i30, f5Var2, obj2, i31, uu0.s(jG1), uu0.s(jG2), r32Var6.f19360b, r32Var6.f19361c);
            iR1 = R0();
            iQ0 = Q0();
            if (this.f19708a0.f18038a.g()) {
                nz1 nz1Var4 = this.f19708a0;
                Object obj12 = nz1Var4.f18039b.f19359a;
                nz1Var4.f18038a.o(obj12, this.f19724p);
                int iE4 = this.f19708a0.f18038a.e(obj12);
                ci ciVar4 = this.f19708a0.f18038a;
                ih ihVar5 = (ih) this.f17550a;
                i32 = iE4;
                obj3 = ciVar4.b(iR1, ihVar5, 0L).f15744a;
                f5Var3 = ihVar5.f15745b;
                obj4 = obj12;
            } else {
                i32 = iQ0;
                obj3 = null;
                f5Var3 = null;
                obj4 = null;
            }
            jS = uu0.s(j10);
            if (this.f19708a0.f18039b.b()) {
                jS2 = uu0.s(g1(this.f19708a0));
            } else {
                jS2 = jS;
            }
            r32 r32Var7 = this.f19708a0.f18039b;
            jf jfVar4 = new jf(obj3, iR1, f5Var3, obj4, i32, jS, jS2, r32Var7.f19360b, r32Var7.f19361c);
            mk0 mk0Var3 = this.f19722n;
            pb pbVar2 = new pb();
            pbVar2.f18582a = i14;
            pbVar2.f18583b = jfVar3;
            pbVar2.f18584c = jfVar4;
            mk0Var3.i(11, pbVar2);
        } else {
            i19 = i19;
            z16 = z16;
        }
        if (zBooleanValue) {
            this.f19722n.i(1, new ey1(f5Var, iIntValue));
        }
        dy1Var = nz1Var2.f18043f;
        dy1Var2 = nz1Var.f18043f;
        if (dy1Var != dy1Var2) {
            mk0Var = this.f19722n;
            final int i311 = 2;
            mk0Var.i(10, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj13) {
                    int i312 = i311;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj13;
                    switch (i312) {
                        case 0:
                            int i313 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzh();
                            break;
                        case 1:
                            int i314 = ry1.f19707e0;
                            nz1Var5.getClass();
                            oeVar.zzl();
                            break;
                        default:
                            int i42 = ry1.f19707e0;
                            oeVar.l(nz1Var5.f18043f);
                            break;
                    }
                }
            });
            if (dy1Var2 != null) {
                final int i312 = 0;
                mk0Var.i(10, new li0() { // from class: com.google.android.gms.internal.ads.ky1
                    @Override // com.google.android.gms.internal.ads.li0
                    /* JADX INFO: renamed from: zza */
                    public final /* synthetic */ void mo161zza(Object obj13) {
                        int i313 = i312;
                        nz1 nz1Var5 = nz1Var;
                        oe oeVar = (oe) obj13;
                        switch (i313) {
                            case 0:
                                int i314 = ry1.f19707e0;
                                oeVar.m(nz1Var5.f18043f);
                                break;
                            case 1:
                                int i42 = ry1.f19707e0;
                                oeVar.j(nz1Var5.f18042e);
                                break;
                            default:
                                int i43 = ry1.f19707e0;
                                cc ccVar = nz1Var5.f18051o;
                                oeVar.zzp();
                                break;
                        }
                    }
                });
            }
        }
        sVar = nz1Var2.f18046i;
        sVar2 = nz1Var.f18046i;
        if (sVar != sVar2) {
            m mVar2 = this.f19719j;
            Object obj13 = sVar2.f19746e;
            mVar2.getClass();
            final int i313 = 0;
            this.f19722n.i(2, new li0() { // from class: com.google.android.gms.internal.ads.ly1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i314 = i313;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i314) {
                        case 0:
                            int i42 = ry1.f19707e0;
                            Object obj15 = nz1Var5.f18046i.f19745d;
                            oeVar.zzd();
                            break;
                        default:
                            int i43 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzj();
                            break;
                    }
                }
            });
        }
        if (zEquals) {
            i20 = 3;
            this.f19722n.i(14, new ey1(this.N, i20));
        } else {
            i20 = 3;
        }
        if (z16) {
            i21 = 0;
            this.f19722n.i(i20, new my1(nz1Var, 0, (byte) 0));
        } else {
            i21 = 0;
        }
        if (i19 == 0) {
            this.f19722n.i(-1, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i314 = i21;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i314) {
                        case 0:
                            int i315 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzh();
                            break;
                        case 1:
                            int i316 = ry1.f19707e0;
                            nz1Var5.getClass();
                            oeVar.zzl();
                            break;
                        default:
                            int i42 = ry1.f19707e0;
                            oeVar.l(nz1Var5.f18043f);
                            break;
                    }
                }
            });
        } else {
            this.f19722n.i(-1, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i314 = i21;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i314) {
                        case 0:
                            int i315 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzh();
                            break;
                        case 1:
                            int i316 = ry1.f19707e0;
                            nz1Var5.getClass();
                            oeVar.zzl();
                            break;
                        default:
                            int i42 = ry1.f19707e0;
                            oeVar.l(nz1Var5.f18043f);
                            break;
                    }
                }
            });
        }
        i22 = 4;
        if (i19 != 0) {
            final int i314 = 1;
            this.f19722n.i(4, new li0() { // from class: com.google.android.gms.internal.ads.ky1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i315 = i314;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i315) {
                        case 0:
                            int i316 = ry1.f19707e0;
                            oeVar.m(nz1Var5.f18043f);
                            break;
                        case 1:
                            int i42 = ry1.f19707e0;
                            oeVar.j(nz1Var5.f18042e);
                            break;
                        default:
                            int i43 = ry1.f19707e0;
                            cc ccVar = nz1Var5.f18051o;
                            oeVar.zzp();
                            break;
                    }
                }
            });
        }
        if (i18 == 0) {
            i23 = 1;
            this.f19722n.i(5, new li0() { // from class: com.google.android.gms.internal.ads.ly1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i315 = i23;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i315) {
                        case 0:
                            int i42 = ry1.f19707e0;
                            Object obj15 = nz1Var5.f18046i.f19745d;
                            oeVar.zzd();
                            break;
                        default:
                            int i43 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzj();
                            break;
                    }
                }
            });
        } else {
            i23 = 1;
            this.f19722n.i(5, new li0() { // from class: com.google.android.gms.internal.ads.ly1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i315 = i23;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i315) {
                        case 0:
                            int i42 = ry1.f19707e0;
                            Object obj15 = nz1Var5.f18046i.f19745d;
                            oeVar.zzd();
                            break;
                        default:
                            int i43 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzj();
                            break;
                    }
                }
            });
        }
        if (nz1Var2.f18050n != nz1Var.f18050n) {
            this.f19722n.i(6, new my1(nz1Var, i23, (byte) 0));
        }
        if (nz1Var2.i() != nz1Var.i()) {
            this.f19722n.i(7, new li0() { // from class: com.google.android.gms.internal.ads.ny1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i315 = i23;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i315) {
                        case 0:
                            int i316 = ry1.f19707e0;
                            boolean z27 = nz1Var5.l;
                            oeVar.zzh();
                            break;
                        case 1:
                            int i317 = ry1.f19707e0;
                            nz1Var5.getClass();
                            oeVar.zzl();
                            break;
                        default:
                            int i42 = ry1.f19707e0;
                            oeVar.l(nz1Var5.f18043f);
                            break;
                    }
                }
            });
        }
        if (!nz1Var2.f18051o.equals(nz1Var.f18051o)) {
            final int i42 = 2;
            this.f19722n.i(12, new li0() { // from class: com.google.android.gms.internal.ads.ky1
                @Override // com.google.android.gms.internal.ads.li0
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ void mo161zza(Object obj14) {
                    int i315 = i42;
                    nz1 nz1Var5 = nz1Var;
                    oe oeVar = (oe) obj14;
                    switch (i315) {
                        case 0:
                            int i316 = ry1.f19707e0;
                            oeVar.m(nz1Var5.f18043f);
                            break;
                        case 1:
                            int i43 = ry1.f19707e0;
                            oeVar.j(nz1Var5.f18042e);
                            break;
                        default:
                            int i44 = ry1.f19707e0;
                            cc ccVar = nz1Var5.f18051o;
                            oeVar.zzp();
                            break;
                    }
                }
            });
        }
        pdVar = this.M;
        xz1Var = this.f19716g;
        pd pdVar4 = this.f19712d;
        String str4 = uu0.f20901a;
        zV0 = xz1Var.V0();
        ciVarO1 = xz1Var.O0();
        if (ciVarO1.g()) {
            i24 = 0;
        } else {
            i24 = 0;
        }
        ciVarO2 = xz1Var.O0();
        if (ciVarO2.g()) {
            i27 = 0;
            i26 = -1;
        } else {
            int iR3 = xz1Var.R0();
            xz1Var.zzl();
            xz1Var.M0();
            i25 = ciVarO2.i(iR3);
            i26 = -1;
            if (i25 != -1) {
                i27 = i23;
            } else {
                i27 = 0;
            }
        }
        ciVarO3 = xz1Var.O0();
        if (ciVarO3.g()) {
            i28 = 0;
        } else {
            iR0 = xz1Var.R0();
            xz1Var.zzl();
            xz1Var.M0();
            if (ciVarO3.h(iR0, 0, false) != i26) {
                i28 = i23;
            } else {
                i28 = 0;
            }
        }
        ciVarO4 = xz1Var.O0();
        if (!ciVarO4.g()) {
            z17 = zV0;
            if (ciVarO4.b(xz1Var.R0(), (ih) xz1Var.f17550a, 0L).b()) {
            }
            ciVarO5 = xz1Var.O0();
            if (ciVarO5.g()) {
                z18 = false;
            } else {
                z18 = false;
            }
            zG = xz1Var.O0().g();
            t02Var = new t02(0);
            z02Var = pdVar4.f18587a;
            while (i29 < z02Var.f22445a.size()) {
                t02Var.c(z02Var.a(i29));
            }
            if (!z17) {
                t02Var.c(4);
            }
            if (i24 != 0) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                t02Var.c(5);
            }
            if (i27 != 0) {
                z20 = false;
            } else {
                z20 = false;
            }
            if (z20) {
                t02Var.c(6);
            }
            if (zG) {
                z21 = false;
            } else {
                z21 = false;
            }
            if (z21) {
                t02Var.c(7);
            }
            if (i28 != 0) {
                z22 = false;
            } else {
                z22 = false;
            }
            if (z22) {
                t02Var.c(8);
            }
            if (zG) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z23) {
                t02Var.c(9);
            }
            if (!z17) {
                t02Var.c(10);
            }
            if (i24 != 0) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (z24) {
                t02Var.c(11);
            }
            if (i24 != 0) {
                z25 = false;
            } else {
                z25 = false;
            }
            if (z25) {
                t02Var.c(12);
            }
            pdVar2 = new pd(t02Var.d());
            this.M = pdVar2;
            if (!pdVar2.equals(pdVar)) {
                this.f19722n.i(13, new ey1(this, i22));
            }
            this.f19722n.j();
        }
        z17 = zV0;
        ciVarO5 = xz1Var.O0();
        if (ciVarO5.g()) {
            z18 = false;
        } else {
            z18 = false;
        }
        zG = xz1Var.O0().g();
        t02Var = new t02(0);
        z02Var = pdVar4.f18587a;
        while (i29 < z02Var.f22445a.size()) {
            t02Var.c(z02Var.a(i29));
        }
        if (!z17) {
            t02Var.c(4);
        }
        if (i24 != 0) {
            z19 = false;
        } else {
            z19 = false;
        }
        if (z19) {
            t02Var.c(5);
        }
        if (i27 != 0) {
            z20 = false;
        } else {
            z20 = false;
        }
        if (z20) {
            t02Var.c(6);
        }
        if (zG) {
            z21 = false;
        } else {
            z21 = false;
        }
        if (z21) {
            t02Var.c(7);
        }
        if (i28 != 0) {
            z22 = false;
        } else {
            z22 = false;
        }
        if (z22) {
            t02Var.c(8);
        }
        if (zG) {
            z23 = false;
        } else {
            z23 = false;
        }
        if (z23) {
            t02Var.c(9);
        }
        if (!z17) {
            t02Var.c(10);
        }
        if (i24 != 0) {
            z24 = false;
        } else {
            z24 = false;
        }
        if (z24) {
            t02Var.c(11);
        }
        if (i24 != 0) {
            z25 = false;
        } else {
            z25 = false;
        }
        if (z25) {
            t02Var.c(12);
        }
        pdVar2 = new pd(t02Var.d());
        this.M = pdVar2;
        if (!pdVar2.equals(pdVar)) {
            this.f19722n.i(13, new ey1(this, i22));
        }
        this.f19722n.j();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    public final nz1 h1(nz1 nz1Var, ci ciVar, Pair pair) {
        boolean z10;
        List list;
        ps1.v(ciVar.g() || pair != null);
        ci ciVar2 = nz1Var.f18038a;
        long jD1 = d1(nz1Var);
        nz1 nz1VarC = nz1Var.c(ciVar);
        if (ciVar.g()) {
            r32 r32Var = nz1.f18037t;
            long jT = uu0.t(this.f19711c0);
            nz1 nz1VarG = nz1VarC.b(r32Var, jT, jT, jT, 0L, v42.f21027d, this.f19710c, ya1.f22208e).g(r32Var);
            nz1VarG.f18052p = nz1VarG.f18054r;
            return nz1VarG;
        }
        r32 r32Var2 = nz1VarC.f18039b;
        Object obj = r32Var2.f19359a;
        String str = uu0.f20901a;
        boolean zEquals = obj.equals(pair.first);
        r32 r32Var3 = !zEquals ? new r32(pair.first, -1L) : r32Var2;
        long jLongValue = ((Long) pair.second).longValue();
        long jT2 = uu0.t(jD1);
        if (ciVar2.g()) {
            z10 = true;
        } else {
            ug ugVar = this.f19724p;
            ciVar2.o(obj, ugVar);
            if (zEquals && jT2 - jLongValue == 1) {
                ug ugVarO = ciVar2.o(obj, ugVar);
                z10 = true;
                if (jT2 == ugVarO.f20773d) {
                    jT2--;
                }
            } else {
                z10 = true;
            }
        }
        if (!zEquals || jLongValue < jT2) {
            ps1.c0(r32Var3.b() ^ z10);
            v42 v42Var = !zEquals ? v42.f21027d : nz1VarC.f18045h;
            s sVar = !zEquals ? this.f19710c : nz1VarC.f18046i;
            if (zEquals) {
                list = nz1VarC.f18047j;
            } else {
                aa1 aa1Var = ca1.f13122b;
                list = ya1.f22208e;
            }
            r32 r32Var4 = r32Var3;
            nz1 nz1VarG2 = nz1VarC.b(r32Var4, jLongValue, jLongValue, jLongValue, 0L, v42Var, sVar, list).g(r32Var4);
            nz1VarG2.f18052p = jLongValue;
            return nz1VarG2;
        }
        if (jLongValue != jT2) {
            ps1.c0(r32Var3.b() ^ z10);
            long jMax = Math.max(0L, nz1VarC.f18053q - (jLongValue - jT2));
            long j10 = nz1VarC.f18052p;
            if (nz1VarC.f18048k.equals(r32Var2)) {
                j10 = jLongValue + jMax;
            }
            nz1 nz1VarB = nz1VarC.b(r32Var3, jLongValue, jLongValue, jLongValue, jMax, nz1VarC.f18045h, nz1VarC.f18046i, nz1VarC.f18047j);
            nz1VarB.f18052p = j10;
            return nz1VarB;
        }
        int iE = ciVar.e(nz1VarC.f18048k.f19359a);
        if (iE != -1) {
            ug ugVar2 = this.f19724p;
            if (ciVar.d(iE, ugVar2, false).f20772c == ciVar.o(r32Var3.f19359a, ugVar2).f20772c) {
                return nz1VarC;
            }
        }
        Object obj2 = r32Var3.f19359a;
        ug ugVar3 = this.f19724p;
        ciVar.o(obj2, ugVar3);
        long jB = r32Var3.b() ? ugVar3.b(r32Var3.f19360b, r32Var3.f19361c) : ugVar3.f20773d;
        r32 r32Var5 = r32Var3;
        nz1 nz1VarG3 = nz1VarC.b(r32Var5, nz1VarC.f18054r, nz1VarC.f18054r, nz1VarC.f18041d, jB - nz1VarC.f18054r, nz1VarC.f18045h, nz1VarC.f18046i, nz1VarC.f18047j).g(r32Var5);
        nz1VarG3.f18052p = jB;
        return nz1VarG3;
    }

    public final Pair j1(ci ciVar, int i10, long j10) {
        if (ciVar.g()) {
            this.f19709b0 = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.f19711c0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= ciVar.a()) {
            i10 = ciVar.k(false);
            ciVar.b(i10, (ih) this.f17550a, 0L).getClass();
            j10 = uu0.s(0L);
        }
        return ciVar.m((ih) this.f17550a, this.f19724p, i10, uu0.t(j10));
    }

    public final void k1(Surface surface) {
        Object obj = this.O;
        boolean z10 = false;
        boolean zC = true;
        if (obj != null && obj != surface) {
            z10 = true;
        }
        long j10 = z10 ? this.A : -9223372036854775807L;
        wy1 wy1Var = this.f19721m;
        if (!wy1Var.H && wy1Var.f21634i.getThread().isAlive()) {
            qf0 qf0Var = new qf0();
            wy1Var.f21632g.b(30, new Pair(surface, qf0Var)).a();
            if (j10 != C.TIME_UNSET) {
                zC = qf0Var.c(j10);
            }
        }
        if (z10) {
            Object obj2 = this.O;
            Surface surface2 = this.P;
            if (obj2 == surface2) {
                surface2.release();
                this.P = null;
            }
        }
        this.O = surface;
        if (zC) {
            return;
        }
        b1(new dy1(2, new aa.b("Detaching surface timed out.", 8), 1003));
    }

    public final void l0() {
        this.f19714e.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f19728t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = uu0.f20901a;
            Locale locale = Locale.US;
            String strH = l1.d.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.V) {
                throw new IllegalStateException(strH);
            }
            v71.B("ExoPlayerImpl", strH, this.W ? null : new IllegalStateException());
            this.W = true;
        }
    }

    public final void l1(int i10, int i11) {
        aq0 aq0Var = this.R;
        if (i10 == aq0Var.f12493a && i11 == aq0Var.f12494b) {
            return;
        }
        this.R = new aq0(i10, i11);
        ey1 ey1Var = new ey1(i10, i11);
        mk0 mk0Var = this.f19722n;
        mk0Var.i(24, ey1Var);
        mk0Var.j();
        m1(2, 14, new aq0(i10, i11));
    }

    public final void m1(int i10, int i11, Object obj) {
        wy1 wy1Var;
        ux1[] ux1VarArr = this.f19717h;
        int length = ux1VarArr.length;
        int i12 = 0;
        while (true) {
            wy1Var = this.f19721m;
            if (i12 >= 2) {
                break;
            }
            ux1 ux1Var = ux1VarArr[i12];
            if (i10 == -1 || ux1Var.f20942b == i10) {
                c1(this.f19708a0);
                ci ciVar = this.f19708a0.f18038a;
                qz1 qz1Var = new qz1(wy1Var, ux1Var, wy1Var.f21634i);
                ps1.c0(!qz1Var.f19255f);
                qz1Var.f19252c = i11;
                ps1.c0(!qz1Var.f19255f);
                qz1Var.f19253d = obj;
                qz1Var.a();
            }
            i12++;
        }
        ux1[] ux1VarArr2 = this.f19718i;
        int length2 = ux1VarArr2.length;
        for (int i13 = 0; i13 < 2; i13++) {
            ux1 ux1Var2 = ux1VarArr2[i13];
            if (ux1Var2 != null && (i10 == -1 || ux1Var2.f20942b == i10)) {
                c1(this.f19708a0);
                ci ciVar2 = this.f19708a0.f18038a;
                qz1 qz1Var2 = new qz1(wy1Var, ux1Var2, wy1Var.f21634i);
                ps1.c0(!qz1Var2.f19255f);
                qz1Var2.f19252c = i11;
                ps1.c0(!qz1Var2.f19255f);
                qz1Var2.f19253d = obj;
                qz1Var2.a();
            }
        }
    }

    public final void n1(boolean z10) {
        l0();
        nz1 nz1Var = this.f19708a0;
        int i10 = nz1Var.f18050n;
        int i11 = 0;
        if (i10 == 1) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 1;
            }
        }
        if (nz1Var.l == z10 && i10 == i11 && nz1Var.f18049m == 1) {
            return;
        }
        this.G++;
        nz1 nz1VarH = nz1Var.h(1, i11, z10);
        int i12 = (i11 << 4) | 1;
        Handler handler = this.f19721m.f21632g.f22362a;
        ss0 ss0VarG = ys0.g();
        ss0VarG.f20047a = handler.obtainMessage(1, z10 ? 1 : 0, i12);
        ss0VarG.a();
        f1(nz1VarH, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final long o1() {
        l0();
        if (!V0()) {
            ci ciVarO0 = O0();
            return ciVarO0.g() ? C.TIME_UNSET : uu0.s(ciVarO0.b(R0(), (ih) this.f17550a, 0L).f15753j);
        }
        nz1 nz1Var = this.f19708a0;
        r32 r32Var = nz1Var.f18039b;
        ci ciVar = nz1Var.f18038a;
        Object obj = r32Var.f19359a;
        ug ugVar = this.f19724p;
        ciVar.o(obj, ugVar);
        return uu0.s(ugVar.b(r32Var.f19360b, r32Var.f19361c));
    }

    public final long p1() {
        l0();
        if (V0()) {
            nz1 nz1Var = this.f19708a0;
            return nz1Var.f18048k.equals(nz1Var.f18039b) ? uu0.s(this.f19708a0.f18052p) : o1();
        }
        l0();
        if (this.f19708a0.f18038a.g()) {
            return this.f19711c0;
        }
        nz1 nz1Var2 = this.f19708a0;
        long j10 = 0;
        if (nz1Var2.f18048k.f19362d != nz1Var2.f18039b.f19362d) {
            return uu0.s(nz1Var2.f18038a.b(R0(), (ih) this.f17550a, 0L).f15753j);
        }
        long j11 = nz1Var2.f18052p;
        if (this.f19708a0.f18048k.b()) {
            nz1 nz1Var3 = this.f19708a0;
            nz1Var3.f18038a.o(nz1Var3.f18048k.f19359a, this.f19724p).f20775f.a(this.f19708a0.f18048k.f19360b).getClass();
        } else {
            j10 = j11;
        }
        nz1 nz1Var4 = this.f19708a0;
        nz1Var4.f18038a.o(nz1Var4.f18048k.f19359a, this.f19724p);
        return uu0.s(j10);
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final long y0() {
        l0();
        return d1(this.f19708a0);
    }

    @Override // com.google.android.gms.internal.ads.mu1, com.google.android.gms.internal.ads.za0
    public final void zzl() {
        l0();
    }

    public final void zzo() {
        l0();
        b1(null);
        ya1 ya1Var = ya1.f22208e;
        long j10 = this.f19708a0.f18054r;
        new a90(ya1Var);
    }
}
