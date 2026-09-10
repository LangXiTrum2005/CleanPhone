package p1;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.az1;
import com.google.android.gms.internal.ads.fz1;
import com.google.android.gms.internal.ads.lo0;
import com.google.android.gms.internal.ads.sr0;
import com.google.android.gms.internal.ads.sy;
import com.google.android.gms.internal.ads.uz1;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import f2.f1;
import f2.k1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Handler.Callback, f2.z, x0, l2.p {
    public static final long g0 = l1.y.Z(Xa.f27908s);
    public final boolean A;
    public e1 B;
    public boolean D;
    public boolean E;
    public g0 F;
    public int G;
    public w0 H;
    public androidx.recyclerview.widget.w I;
    public boolean J;
    public boolean L;
    public boolean M;
    public boolean O;
    public int P;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public g0 V;
    public long W;
    public long X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz1[] f48042a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public h f48043a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f48044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f48046c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public j f48047c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2.u f48048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2.v f48050e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f48051e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0 f48052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2.d f48054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.w f48055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h9.k f48056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Looper f48057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i1.o0 f48058k;
    public final i1.n0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f48059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sr0 f48060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f48061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1.u f48062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f48063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fz1 f48064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lo0 f48065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f48066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f48067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q1.j f48068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q1.f f48069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l1.w f48070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f48071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final sy f48072z;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f48049d0 = C.TIME_UNSET;
    public boolean Q = false;
    public boolean K = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f48053f0 = 1.0f;
    public d1 C = d1.f47995b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f48045b0 = C.TIME_UNSET;
    public long N = C.TIME_UNSET;

    public h0(Context context, a[] aVarArr, a[] aVarArr2, i2.u uVar, i2.v vVar, j0 j0Var, j2.d dVar, int i10, q1.f fVar, e1 e1Var, d dVar2, long j10, Looper looper, l1.u uVar2, n nVar, q1.j jVar, j jVar2, final l2.p pVar, boolean z10) {
        Looper looper2;
        this.f48063q = nVar;
        this.f48048d = uVar;
        this.f48050e = vVar;
        this.f48052f = j0Var;
        this.f48054g = dVar;
        this.P = i10;
        boolean z11 = false;
        this.B = e1Var;
        this.f48066t = dVar2;
        this.f48067u = j10;
        this.f48062p = uVar2;
        this.f48068v = jVar;
        this.f48047c0 = jVar2;
        this.f48069w = fVar;
        this.A = z10;
        this.f48059m = ((f) j0Var).f48022n;
        i1.m0 m0Var = i1.p0.f42656a;
        w0 w0VarK = w0.k(vVar);
        this.H = w0VarK;
        this.I = new androidx.recyclerview.widget.w(w0VarK, 2);
        this.f48044b = new a[aVarArr.length];
        this.f48046c = new boolean[aVarArr.length];
        i2.p pVar2 = (i2.p) uVar;
        pVar2.getClass();
        this.f48042a = new uz1[aVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            aVar.f47909e = i11;
            aVar.f47910f = jVar;
            aVar.f47911g = uVar2;
            this.f48044b[i11] = aVar;
            a aVar2 = this.f48044b[i11];
            synchronized (aVar2.f47905a) {
                aVar2.f47921r = pVar2;
            }
            a aVar3 = aVarArr2[i11];
            if (aVar3 != null) {
                aVar3.f47909e = i11;
                aVar3.f47910f = jVar;
                aVar3.f47911g = uVar2;
                z12 = true;
            }
            this.f48042a[i11] = new uz1(i11, aVarArr[i11], aVar3);
        }
        this.f48071y = z12;
        this.f48060n = new sr0(this, uVar2);
        this.f48061o = new ArrayList();
        this.f48058k = new i1.o0();
        this.l = new i1.n0();
        go.k.t(uVar.f42835a == null);
        uVar.f42835a = this;
        uVar.f42836b = dVar;
        this.Z = true;
        l1.w wVarA = uVar2.a(looper, null);
        this.f48070x = wVarA;
        this.f48064r = new fz1(fVar, wVarA, new k3.j(this, 17), jVar2);
        this.f48065s = new lo0(this, fVar, wVarA, jVar);
        h9.k kVar = new h9.k(6);
        this.f48056i = kVar;
        synchronized (kVar.f42287b) {
            try {
                if (((Looper) kVar.f42288c) == null) {
                    if (kVar.f42286a == 0 && ((HandlerThread) kVar.f42289d) == null) {
                        z11 = true;
                    }
                    go.k.t(z11);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    kVar.f42289d = handlerThread;
                    handlerThread.start();
                    kVar.f42288c = ((HandlerThread) kVar.f42289d).getLooper();
                }
                kVar.f42286a++;
                looper2 = (Looper) kVar.f42288c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f48057j = looper2;
        l1.w wVarA2 = uVar2.a(looper2, this);
        this.f48055h = wVarA2;
        this.f48072z = new sy(context, looper2, this);
        wVarA2.a(35, new l2.p() { // from class: p1.c0
            @Override // l2.p
            public final void a(long j11, long j12, i1.p pVar3, MediaFormat mediaFormat) {
                h0 h0Var = this.f47976a;
                h0Var.getClass();
                pVar.a(j11, j12, pVar3, mediaFormat);
                h0Var.a(j11, j12, pVar3, mediaFormat);
            }
        }).b();
    }

    public static Pair S(i1.p0 p0Var, g0 g0Var, boolean z10, int i10, boolean z11, i1.o0 o0Var, i1.n0 n0Var) {
        int iT;
        i1.p0 p0Var2 = g0Var.f48032a;
        if (p0Var.p()) {
            return null;
        }
        i1.p0 p0Var3 = p0Var2.p() ? p0Var : p0Var2;
        try {
            Pair pairI = p0Var3.i(o0Var, n0Var, g0Var.f48033b, g0Var.f48034c);
            if (!p0Var.equals(p0Var3)) {
                if (p0Var.b(pairI.first) == -1) {
                    if (!z10 || (iT = T(o0Var, n0Var, i10, z11, pairI.first, p0Var3, p0Var)) == -1) {
                        return null;
                    }
                    return p0Var.i(o0Var, n0Var, iT, C.TIME_UNSET);
                }
                if (p0Var3.g(pairI.first, n0Var).f42587f && p0Var3.m(n0Var.f42584c, o0Var, 0L).f42628n == p0Var3.b(pairI.first)) {
                    return p0Var.i(o0Var, n0Var, p0Var.g(pairI.first, n0Var).f42584c, g0Var.f48034c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(i1.o0 o0Var, i1.n0 n0Var, int i10, boolean z10, Object obj, i1.p0 p0Var, i1.p0 p0Var2) {
        i1.p0 p0Var3 = p0Var;
        Object obj2 = p0Var3.m(p0Var3.g(obj, n0Var).f42584c, o0Var, 0L).f42616a;
        for (int i11 = 0; i11 < p0Var2.o(); i11++) {
            if (p0Var2.m(i11, o0Var, 0L).f42616a.equals(obj2)) {
                return i11;
            }
        }
        int iB = p0Var3.b(obj);
        int iH = p0Var3.h();
        int iB2 = -1;
        int i12 = 0;
        while (i12 < iH && iB2 == -1) {
            i1.p0 p0Var4 = p0Var3;
            int iD = p0Var4.d(iB, n0Var, o0Var, i10, z10);
            if (iD == -1) {
                break;
            }
            iB2 = p0Var2.b(p0Var4.l(iD));
            i12++;
            p0Var3 = p0Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return p0Var2.f(iB2, n0Var, false).f42584c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f2.a0, f2.e1, java.lang.Object] */
    public static boolean z(m0 m0Var) {
        if (m0Var != null) {
            try {
                ?? r2 = m0Var.f48110a;
                if (m0Var.f48114e) {
                    for (f2.c1 c1Var : m0Var.f48112c) {
                        if (c1Var != null) {
                            c1Var.maybeThrowError();
                        }
                    }
                } else {
                    r2.maybeThrowPrepareError();
                }
                if ((!m0Var.f48114e ? 0L : r2.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i10, f2.c0 c0Var) {
        fz1 fz1Var = this.f48064r;
        m0 m0Var = (m0) fz1Var.f14619o;
        if (m0Var != null && m0Var.f48116g.f48126a.equals(c0Var)) {
            uz1 uz1Var = this.f48042a[i10];
            m0 m0Var2 = (m0) fz1Var.f14619o;
            int i11 = uz1Var.f20971d;
            boolean z10 = (i11 == 2 || i11 == 4) && uz1Var.d(m0Var2) == ((a) uz1Var.f20972e);
            boolean z11 = uz1Var.f20971d == 3 && uz1Var.d(m0Var2) == ((a) uz1Var.f20973f);
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Type inference failed for: r2v21, types: [f2.a0, java.lang.Object] */
    public final void A0() {
        i1.g0 playbackParameters;
        long j10;
        float f10;
        m0 m0Var = (m0) this.f48064r.f14617m;
        if (m0Var == null) {
            return;
        }
        long discontinuity = m0Var.f48114e ? m0Var.f48110a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            if (!m0Var.g()) {
                this.f48064r.n(m0Var);
                u(false);
                C();
            }
            Q(discontinuity, true);
            if (discontinuity != this.H.f48196s) {
                w0 w0Var = this.H;
                this.H = y(w0Var.f48180b, discontinuity, w0Var.f48181c, discontinuity, true, 5);
            }
        } else {
            sr0 sr0Var = this.f48060n;
            boolean z10 = m0Var != ((m0) this.f48064r.f14618n);
            ea.z0 z0Var = (ea.z0) sr0Var.f20039c;
            a aVar = (a) sr0Var.f20041e;
            if (aVar == null || aVar.j() || ((z10 && ((a) sr0Var.f20041e).f47912h != 2) || (!((a) sr0Var.f20041e).l() && (z10 || ((a) sr0Var.f20041e).i())))) {
                sr0Var.f20037a = true;
                if (sr0Var.f20038b) {
                    z0Var.d();
                }
            } else {
                l0 l0Var = (l0) sr0Var.f20042f;
                l0Var.getClass();
                long positionUs = l0Var.getPositionUs();
                if (!sr0Var.f20037a) {
                    z0Var.c(positionUs);
                    playbackParameters = l0Var.getPlaybackParameters();
                    if (!playbackParameters.equals((i1.g0) z0Var.f39935e)) {
                        z0Var.a(playbackParameters);
                        ((h0) sr0Var.f20040d).f48055h.a(16, playbackParameters).b();
                    }
                } else if (positionUs >= z0Var.getPositionUs()) {
                    sr0Var.f20037a = false;
                    if (sr0Var.f20038b) {
                        z0Var.d();
                    }
                    z0Var.c(positionUs);
                    playbackParameters = l0Var.getPlaybackParameters();
                    if (!playbackParameters.equals((i1.g0) z0Var.f39935e)) {
                        z0Var.a(playbackParameters);
                        ((h0) sr0Var.f20040d).f48055h.a(16, playbackParameters).b();
                    }
                } else if (z0Var.f39931a) {
                    z0Var.c(z0Var.getPositionUs());
                    z0Var.f39931a = false;
                }
            }
            long positionUs2 = sr0Var.getPositionUs();
            this.W = positionUs2;
            long j11 = positionUs2 - m0Var.f48124p;
            long j12 = this.H.f48196s;
            if (!this.f48061o.isEmpty() && !this.H.f48180b.b()) {
                if (this.Z) {
                    this.Z = false;
                }
                w0 w0Var2 = this.H;
                w0Var2.f48179a.b(w0Var2.f48180b.f40307a);
                int iMin = Math.min(this.Y, this.f48061o.size());
                if (iMin > 0 && this.f48061o.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f48061o.size() && this.f48061o.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.Y = iMin;
            }
            if (this.f48060n.b()) {
                boolean z11 = !this.I.f4946d;
                w0 w0Var3 = this.H;
                this.H = y(w0Var3.f48180b, j11, w0Var3.f48181c, j11, z11, 6);
            } else {
                w0 w0Var4 = this.H;
                w0Var4.f48196s = j11;
                w0Var4.f48197t = SystemClock.elapsedRealtime();
            }
        }
        this.H.f48194q = ((m0) this.f48064r.f14620p).d();
        w0 w0Var5 = this.H;
        w0Var5.f48195r = p(w0Var5.f48194q);
        w0 w0Var6 = this.H;
        if (w0Var6.l && w0Var6.f48183e == 3 && r0(w0Var6.f48179a, w0Var6.f48180b)) {
            w0 w0Var7 = this.H;
            float f11 = 1.0f;
            if (w0Var7.f48192o.f42544a == 1.0f) {
                d dVar = this.f48066t;
                long jM = m(w0Var7.f48179a, w0Var7.f48180b.f40307a, w0Var7.f48196s);
                long j13 = this.H.f48195r;
                if (dVar.f47983c != C.TIME_UNSET) {
                    long j14 = jM - j13;
                    long j15 = dVar.f47992m;
                    if (j15 == C.TIME_UNSET) {
                        dVar.f47992m = j14;
                        dVar.f47993n = 0L;
                    } else {
                        long jMax = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        dVar.f47992m = jMax;
                        dVar.f47993n = (long) ((9.999871E-4f * Math.abs(j14 - jMax)) + (dVar.f47993n * 0.999f));
                    }
                    if (dVar.l != C.TIME_UNSET) {
                        j10 = 1000;
                        if (SystemClock.elapsedRealtime() - dVar.l < 1000) {
                            f11 = dVar.f47991k;
                        }
                    } else {
                        j10 = 1000;
                    }
                    dVar.l = SystemClock.elapsedRealtime();
                    long j16 = (dVar.f47993n * 3) + dVar.f47992m;
                    if (dVar.f47988h > j16) {
                        float fM = l1.y.M(j10);
                        f10 = 1.0E-7f;
                        long[] jArr = {j16, dVar.f47985e, dVar.f47988h - (((long) ((dVar.f47991k - 1.0f) * fM)) + ((long) ((dVar.f47989i - 1.0f) * fM)))};
                        long j17 = jArr[0];
                        for (int i10 = 1; i10 < 3; i10++) {
                            long j18 = jArr[i10];
                            if (j18 > j17) {
                                j17 = j18;
                            }
                        }
                        dVar.f47988h = j17;
                    } else {
                        f10 = 1.0E-7f;
                        long jK = l1.y.k(jM - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dVar.f47991k - 1.0f) / 1.0E-7f)), dVar.f47988h, j16);
                        dVar.f47988h = jK;
                        long j19 = dVar.f47987g;
                        if (j19 != C.TIME_UNSET && jK > j19) {
                            dVar.f47988h = j19;
                        }
                    }
                    long j20 = jM - dVar.f47988h;
                    if (Math.abs(j20) < dVar.f47981a) {
                        dVar.f47991k = 1.0f;
                    } else {
                        dVar.f47991k = l1.y.i((f10 * j20) + 1.0f, dVar.f47990j, dVar.f47989i);
                    }
                    f11 = dVar.f47991k;
                }
                if (this.f48060n.getPlaybackParameters().f42544a != f11) {
                    i1.g0 g0Var = new i1.g0(f11, this.H.f48192o.f42545b);
                    this.f48055h.d(16);
                    this.f48060n.a(g0Var);
                    x(this.H.f48192o, this.f48060n.getPlaybackParameters().f42544a, false, false);
                }
            }
        }
    }

    public final boolean B() {
        m0 m0Var = (m0) this.f48064r.f14617m;
        long j10 = m0Var.f48116g.f48130e;
        if (m0Var.f48114e) {
            return j10 == C.TIME_UNSET || this.H.f48196s < j10 || !q0();
        }
        return false;
    }

    public final void B0(i1.p0 p0Var, f2.c0 c0Var, i1.p0 p0Var2, f2.c0 c0Var2, long j10, boolean z10) {
        boolean zR0 = r0(p0Var, c0Var);
        Object obj = c0Var.f40307a;
        if (!zR0) {
            i1.g0 g0Var = c0Var.b() ? i1.g0.f42543d : this.H.f48192o;
            sr0 sr0Var = this.f48060n;
            if (sr0Var.getPlaybackParameters().equals(g0Var)) {
                return;
            }
            this.f48055h.d(16);
            sr0Var.a(g0Var);
            x(this.H.f48192o, g0Var.f42544a, false, false);
            return;
        }
        i1.n0 n0Var = this.l;
        int i10 = p0Var.g(obj, n0Var).f42584c;
        i1.o0 o0Var = this.f48058k;
        p0Var.n(i10, o0Var);
        i1.u uVar = o0Var.f42625j;
        d dVar = this.f48066t;
        dVar.getClass();
        dVar.f47983c = l1.y.M(uVar.f42694a);
        dVar.f47986f = l1.y.M(uVar.f42695b);
        dVar.f47987g = l1.y.M(uVar.f42696c);
        float f10 = uVar.f42697d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        dVar.f47990j = f10;
        float f11 = uVar.f42698e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        dVar.f47989i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            dVar.f47983c = C.TIME_UNSET;
        }
        dVar.a();
        if (j10 != C.TIME_UNSET) {
            dVar.f47984d = m(p0Var, obj, j10);
            dVar.a();
            return;
        }
        if (!Objects.equals(!p0Var2.p() ? p0Var2.m(p0Var2.g(c0Var2.f40307a, n0Var).f42584c, o0Var, 0L).f42616a : null, o0Var.f42616a) || z10) {
            dVar.f47984d = C.TIME_UNSET;
            dVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [f2.e1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [f2.e1, java.lang.Object] */
    public final void C() {
        boolean zB;
        if (z((m0) this.f48064r.f14620p)) {
            m0 m0Var = (m0) this.f48064r.f14620p;
            long jP = p(!m0Var.f48114e ? 0L : m0Var.f48110a.getNextLoadPositionUs());
            Object obj = this.f48064r.f14617m;
            long j10 = r0(this.H.f48179a, m0Var.f48116g.f48126a) ? this.f48066t.f47988h : -9223372036854775807L;
            q1.j jVar = this.f48068v;
            i1.p0 p0Var = this.H.f48179a;
            f2.c0 c0Var = m0Var.f48116g.f48126a;
            float f10 = this.f48060n.getPlaybackParameters().f42544a;
            boolean z10 = this.H.l;
            i0 i0Var = new i0(jVar, p0Var, c0Var, jP, f10, this.M, j10);
            zB = ((f) this.f48052f).b(i0Var);
            m0 m0Var2 = (m0) this.f48064r.f14617m;
            if (!zB && m0Var2.f48114e && jP < 500000 && this.f48059m > 0) {
                m0Var2.f48110a.g(this.H.f48196s);
                zB = ((f) this.f48052f).b(i0Var);
            }
        } else {
            zB = false;
        }
        this.O = zB;
        if (zB) {
            m0 m0Var3 = (m0) this.f48064r.f14620p;
            m0Var3.getClass();
            az1 az1Var = new az1();
            az1Var.f12554a = this.W - m0Var3.f48124p;
            float f11 = this.f48060n.getPlaybackParameters().f42544a;
            go.k.i(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 == -3.4028235E38f);
            az1Var.f12555b = f11;
            long j11 = this.N;
            go.k.i(j11 >= 0 || j11 == C.TIME_UNSET);
            az1Var.f12556c = j11;
            k0 k0Var = new k0(az1Var);
            go.k.t(m0Var3.f48121m == null);
            m0Var3.f48110a.f(k0Var);
        }
        v0();
    }

    public final void C0(boolean z10, boolean z11) {
        long jElapsedRealtime;
        this.M = z10;
        if (!z10 || z11) {
            jElapsedRealtime = C.TIME_UNSET;
        } else {
            this.f48062p.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.N = jElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f2.a0, f2.e1, java.lang.Object] */
    public final void D() {
        fz1 fz1Var = this.f48064r;
        fz1Var.k();
        m0 m0Var = (m0) fz1Var.f14621q;
        if (m0Var != null) {
            ?? r2 = m0Var.f48110a;
            if ((!m0Var.f48113d || m0Var.f48114e) && !r2.isLoading()) {
                i1.p0 p0Var = this.H.f48179a;
                if (m0Var.f48114e) {
                    r2.getBufferedPositionUs();
                }
                Iterator it = ((f) this.f48052f).f48024p.values().iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).f47998b) {
                        return;
                    }
                }
                if (!m0Var.f48113d) {
                    long j10 = m0Var.f48116g.f48127b;
                    m0Var.f48113d = true;
                    r2.e(this, j10);
                    return;
                }
                az1 az1Var = new az1();
                az1Var.f12554a = this.W - m0Var.f48124p;
                float f10 = this.f48060n.getPlaybackParameters().f42544a;
                go.k.i(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 == -3.4028235E38f);
                az1Var.f12555b = f10;
                long j11 = this.N;
                go.k.i(j11 >= 0 || j11 == C.TIME_UNSET);
                az1Var.f12556c = j11;
                k0 k0Var = new k0(az1Var);
                go.k.t(m0Var.f48121m == null);
                r2.f(k0Var);
            }
        }
    }

    public final void E() {
        androidx.recyclerview.widget.w wVar = this.I;
        w0 w0Var = this.H;
        boolean z10 = wVar.f4944b | (((w0) wVar.f4948f) != w0Var);
        wVar.f4944b = z10;
        wVar.f4948f = w0Var;
        if (z10) {
            b0 b0Var = this.f48063q.f48125a;
            b0Var.f47944j.c(new l2.u(10, b0Var, wVar));
            this.I = new androidx.recyclerview.widget.w(this.H, 2);
        }
    }

    public final void F(int i10) {
        uz1 uz1Var = this.f48042a[i10];
        try {
            m0 m0Var = (m0) this.f48064r.f14617m;
            m0Var.getClass();
            a aVarD = uz1Var.d(m0Var);
            aVarD.getClass();
            f2.c1 c1Var = aVarD.f47913i;
            c1Var.getClass();
            c1Var.maybeThrowError();
        } catch (IOException | RuntimeException e10) {
            int i11 = ((a) uz1Var.f20972e).f47906b;
            if (i11 != 3 && i11 != 5) {
                throw e10;
            }
            i2.v vVar = ((m0) this.f48064r.f14617m).f48123o;
            l1.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + i1.p.c(vVar.f42839c[i10].getSelectedFormat()), e10);
            i2.v vVar2 = new i2.v((c1[]) vVar.f42838b.clone(), (i2.r[]) vVar.f42839c.clone(), vVar.f42840d, vVar.f42841e);
            vVar2.f42838b[i10] = null;
            vVar2.f42839c[i10] = null;
            g(i10);
            m0 m0Var2 = (m0) this.f48064r.f14617m;
            m0Var2.a(vVar2, this.H.f48196s, false, new boolean[m0Var2.f48119j.length]);
        }
    }

    public final void G(int i10, boolean z10) {
        boolean[] zArr = this.f48046c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f48070x.c(new com.applovin.impl.adview.o(this, i10, z10));
        }
    }

    public final void H() throws Throwable {
        v(this.f48065s.b(), true);
    }

    public final void I() {
        this.I.d(1);
        throw null;
    }

    public final void J() {
        this.I.d(1);
        O(false, false, false, true);
        f fVar = (f) this.f48052f;
        ConcurrentHashMap concurrentHashMap = fVar.f48024p;
        long id2 = Thread.currentThread().getId();
        long j10 = fVar.f48025q;
        go.k.s("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        fVar.f48025q = id2;
        q1.j jVar = this.f48068v;
        e eVar = (e) concurrentHashMap.get(jVar);
        if (eVar == null) {
            e eVar2 = new e();
            eVar2.f47997a = 1;
            concurrentHashMap.put(jVar, eVar2);
        } else {
            eVar.f47997a++;
        }
        e eVar3 = (e) concurrentHashMap.get(jVar);
        eVar3.getClass();
        Integer num = (Integer) fVar.f48023o.get(jVar.f48580a);
        int iIntValue = (num == null || num.intValue() == -1) ? fVar.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        eVar3.f47999c = iIntValue;
        eVar3.f47998b = false;
        m0(this.H.f48179a.p() ? 4 : 2);
        w0 w0Var = this.H;
        boolean z10 = w0Var.l;
        z0(this.f48072z.d(w0Var.f48183e, z10), w0Var.f48191n, w0Var.f48190m, z10);
        j2.g gVar = (j2.g) this.f48054g;
        gVar.getClass();
        lo0 lo0Var = this.f48065s;
        ArrayList arrayList = (ArrayList) lo0Var.f17082c;
        go.k.t(!lo0Var.f17080a);
        lo0Var.l = gVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            v0 v0Var = (v0) arrayList.get(i10);
            lo0Var.f(v0Var);
            ((HashSet) lo0Var.f17087h).add(v0Var);
        }
        lo0Var.f17080a = true;
        this.f48055h.e(2);
    }

    public final void K(l1.f fVar) {
        h9.k kVar = this.f48056i;
        l1.w wVar = this.f48055h;
        try {
            O(true, false, true, false);
            L();
            j0 j0Var = this.f48052f;
            q1.j jVar = this.f48068v;
            f fVar2 = (f) j0Var;
            ConcurrentHashMap concurrentHashMap = fVar2.f48024p;
            e eVar = (e) concurrentHashMap.get(jVar);
            if (eVar != null) {
                int i10 = eVar.f47997a - 1;
                eVar.f47997a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(jVar);
                    fVar2.c();
                }
            }
            if (fVar2.f48024p.isEmpty()) {
                fVar2.f48025q = -1L;
            }
            sy syVar = this.f48072z;
            syVar.f20076f = null;
            syVar.a();
            syVar.c(0);
            this.f48048d.a();
            m0(1);
        } finally {
            wVar.f44825a.removeCallbacksAndMessages(null);
            kVar.d();
            fVar.c();
        }
    }

    public final void L() {
        for (int i10 = 0; i10 < this.f48042a.length; i10++) {
            a aVar = this.f48044b[i10];
            synchronized (aVar.f47905a) {
                aVar.f47921r = null;
            }
            uz1 uz1Var = this.f48042a[i10];
            a aVar2 = (a) uz1Var.f20972e;
            go.k.t(aVar2.f47912h == 0);
            aVar2.p();
            uz1Var.f20968a = false;
            a aVar3 = (a) uz1Var.f20973f;
            if (aVar3 != null) {
                go.k.t(aVar3.f47912h == 0);
                aVar3.p();
                uz1Var.f20969b = false;
            }
        }
    }

    public final void M(int i10, int i11, f1 f1Var) throws Throwable {
        this.I.d(1);
        lo0 lo0Var = this.f48065s;
        lo0Var.getClass();
        go.k.i(i10 >= 0 && i10 <= i11 && i11 <= ((ArrayList) lo0Var.f17082c).size());
        lo0Var.f17090k = f1Var;
        lo0Var.h(i10, i11);
        v(lo0Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void N() {
        int i10;
        int i11;
        float f10 = this.f48060n.getPlaybackParameters().f42544a;
        fz1 fz1Var = this.f48064r;
        m0 m0Var = (m0) fz1Var.f14617m;
        m0 m0Var2 = (m0) fz1Var.f14618n;
        i2.v vVar = null;
        m0 m0Var3 = m0Var;
        boolean z10 = true;
        while (m0Var3 != null && m0Var3.f48114e) {
            w0 w0Var = this.H;
            i2.v vVarJ = m0Var3.j(f10, w0Var.f48179a, w0Var.l);
            i2.v vVar2 = m0Var3 == ((m0) this.f48064r.f14617m) ? vVarJ : vVar;
            i2.v vVar3 = m0Var3.f48123o;
            i2.r[] rVarArr = vVarJ.f42839c;
            if (vVar3 != null && vVar3.f42839c.length == rVarArr.length) {
                int i12 = 0;
                while (true) {
                    if (i12 >= rVarArr.length) {
                        if (m0Var3 == m0Var2) {
                            z10 = false;
                        }
                        m0Var3 = m0Var3.f48121m;
                        vVar = vVar2;
                    } else if (vVarJ.a(vVar3, i12)) {
                        i12++;
                    }
                }
            }
            if (!z10) {
                i10 = 4;
                this.f48064r.n(m0Var3);
                if (m0Var3.f48114e) {
                    long jMax = Math.max(m0Var3.f48116g.f48127b, this.W - m0Var3.f48124p);
                    if (this.f48071y && d() && ((m0) this.f48064r.f14619o) == m0Var3) {
                        f();
                    }
                    i11 = 4;
                    m0Var3.a(vVarJ, jMax, false, new boolean[m0Var3.f48119j.length]);
                }
                u(true);
                if (this.H.f48183e != i11) {
                    C();
                    A0();
                    this.f48055h.e(2);
                    return;
                }
                return;
            }
            fz1 fz1Var2 = this.f48064r;
            m0 m0Var4 = (m0) fz1Var2.f14617m;
            boolean z11 = (fz1Var2.n(m0Var4) & 1) != 0;
            boolean[] zArr = new boolean[this.f48042a.length];
            vVar2.getClass();
            long jA = m0Var4.a(vVar2, this.H.f48196s, z11, zArr);
            w0 w0Var2 = this.H;
            boolean z12 = (w0Var2.f48183e == 4 || jA == w0Var2.f48196s) ? false : true;
            w0 w0Var3 = this.H;
            i10 = 4;
            this.H = y(w0Var3.f48180b, jA, w0Var3.f48181c, w0Var3.f48182d, z12, 5);
            if (z12) {
                Q(jA, true);
            }
            f();
            boolean[] zArr2 = new boolean[this.f48042a.length];
            int i13 = 0;
            while (true) {
                uz1[] uz1VarArr = this.f48042a;
                if (i13 >= uz1VarArr.length) {
                    break;
                }
                int iC = uz1VarArr[i13].c();
                zArr2[i13] = this.f48042a[i13].g();
                uz1 uz1Var = this.f48042a[i13];
                f2.c1 c1Var = m0Var4.f48112c[i13];
                sr0 sr0Var = this.f48060n;
                long j10 = this.W;
                boolean z13 = zArr[i13];
                a aVar = (a) uz1Var.f20972e;
                if (uz1.h(aVar)) {
                    if (c1Var != aVar.f47913i) {
                        uz1Var.a(aVar, sr0Var);
                    } else if (z13) {
                        aVar.y(j10, false, true);
                    }
                }
                a aVar2 = (a) uz1Var.f20973f;
                if (aVar2 != null && uz1.h(aVar2)) {
                    if (c1Var != aVar2.f47913i) {
                        uz1Var.a(aVar2, sr0Var);
                    } else if (z13) {
                        aVar2.y(j10, false, true);
                    }
                }
                if (iC - this.f48042a[i13].c() > 0) {
                    G(i13, false);
                }
                this.U -= iC - this.f48042a[i13].c();
                i13++;
            }
            l(zArr2, this.W);
            m0Var4.f48117h = true;
            i11 = i10;
            u(true);
            if (this.H.f48183e != i11) {
                C();
                A0();
                this.f48055h.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x018a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198 A[LOOP:3: B:78:0x0190->B:80:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c2  */
    public final void O(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        long j11;
        long j12;
        boolean z14;
        i1.p0 b1Var;
        f2.c0 c0Var;
        w0 w0Var;
        h hVar;
        k1 k1Var;
        i2.v vVar;
        List list;
        fz1 fz1Var;
        int i10;
        this.f48055h.d(2);
        this.E = false;
        if (this.F != null) {
            this.I.d(1);
            this.F = null;
        }
        this.f48043a0 = null;
        C0(false, true);
        sr0 sr0Var = this.f48060n;
        sr0Var.f20038b = false;
        ea.z0 z0Var = (ea.z0) sr0Var.f20039c;
        if (z0Var.f39931a) {
            z0Var.c(z0Var.getPositionUs());
            z0Var.f39931a = false;
        }
        this.W = 1000000000000L;
        for (int i11 = 0; i11 < this.f48042a.length; i11++) {
            try {
                g(i11);
            } catch (RuntimeException | h e10) {
                l1.a.f("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        this.f48049d0 = C.TIME_UNSET;
        if (z10) {
            for (uz1 uz1Var : this.f48042a) {
                try {
                    uz1Var.k();
                } catch (RuntimeException e11) {
                    l1.a.f("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.U = 0;
        w0 w0Var2 = this.H;
        f2.c0 c0Var2 = w0Var2.f48180b;
        long j13 = w0Var2.f48196s;
        if (this.H.f48180b.b()) {
            j10 = this.H.f48181c;
        } else {
            w0 w0Var3 = this.H;
            i1.n0 n0Var = this.l;
            f2.c0 c0Var3 = w0Var3.f48180b;
            i1.p0 p0Var = w0Var3.f48179a;
            if (p0Var.p() || p0Var.g(c0Var3.f40307a, n0Var).f42587f) {
                j10 = this.H.f48181c;
            } else {
                j10 = this.H.f48196s;
            }
        }
        if (z11) {
            this.V = null;
            Pair pairO = o(this.H.f48179a);
            c0Var2 = (f2.c0) pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            z14 = c0Var2.equals(this.H.f48180b) ? false : true;
            j11 = jLongValue;
            j12 = -9223372036854775807L;
        } else {
            j11 = j13;
            j12 = j10;
            z14 = false;
        }
        this.f48064r.b();
        this.O = false;
        i1.p0 p0Var2 = this.H.f48179a;
        if (z12 && (p0Var2 instanceof b1)) {
            b1 b1Var2 = (b1) p0Var2;
            f1 f1Var = (f1) this.f48065s.f17090k;
            i1.p0[] p0VarArr = b1Var2.f47968h;
            i1.p0[] p0VarArr2 = new i1.p0[p0VarArr.length];
            for (int i12 = 0; i12 < p0VarArr.length; i12++) {
                p0VarArr2[i12] = new a1(p0VarArr[i12]);
            }
            b1Var = new b1(p0VarArr2, b1Var2.f47969i, f1Var);
            if (c0Var2.f40308b != -1) {
                b1Var.g(c0Var2.f40307a, this.l);
                int i13 = this.l.f42584c;
                i1.o0 o0Var = this.f48058k;
                b1Var.m(i13, o0Var, 0L);
                if (o0Var.a()) {
                    c0Var = new f2.c0(c0Var2.f40307a, c0Var2.f40310d);
                }
            }
            w0Var = this.H;
            int i14 = w0Var.f48183e;
            if (z13) {
                hVar = null;
            } else {
                hVar = w0Var.f48184f;
            }
            if (z14) {
                k1Var = k1.f40385d;
            } else {
                k1Var = w0Var.f48186h;
            }
            k1 k1Var2 = k1Var;
            if (z14) {
                vVar = this.f48050e;
            } else {
                vVar = w0Var.f48187i;
            }
            i2.v vVar2 = vVar;
            if (z14) {
                oa.f0 f0Var = oa.j0.f47265b;
                list = n1.f47281e;
            } else {
                list = w0Var.f48188j;
            }
            this.H = new w0(b1Var, c0Var, j12, j11, i14, hVar, false, k1Var2, vVar2, list, c0Var, w0Var.l, w0Var.f48190m, w0Var.f48191n, w0Var.f48192o, j11, 0L, j11, 0L, false);
            if (z12) {
                fz1Var = this.f48064r;
                if (!fz1Var.f14612g.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i10 = 0; i10 < fz1Var.f14612g.size(); i10++) {
                        ((m0) fz1Var.f14612g.get(i10)).i();
                    }
                    fz1Var.f14612g = arrayList;
                    fz1Var.f14621q = null;
                    fz1Var.k();
                }
                lo0 lo0Var = this.f48065s;
                HashMap map = (HashMap) lo0Var.f17086g;
                for (u0 u0Var : map.values()) {
                    try {
                        u0Var.f48167a.s(u0Var.f48168b);
                    } catch (RuntimeException e12) {
                        l1.a.f("MediaSourceList", "Failed to release child source.", e12);
                    }
                    f2.a aVar = u0Var.f48167a;
                    t0 t0Var = u0Var.f48169c;
                    aVar.v(t0Var);
                    u0Var.f48167a.u(t0Var);
                }
                map.clear();
                ((HashSet) lo0Var.f17087h).clear();
                lo0Var.f17080a = false;
            }
        }
        b1Var = p0Var2;
        c0Var = c0Var2;
        w0Var = this.H;
        int i15 = w0Var.f48183e;
        if (z13) {
            hVar = null;
        } else {
            hVar = w0Var.f48184f;
        }
        if (z14) {
            k1Var = k1.f40385d;
        } else {
            k1Var = w0Var.f48186h;
        }
        k1 k1Var3 = k1Var;
        if (z14) {
            vVar = this.f48050e;
        } else {
            vVar = w0Var.f48187i;
        }
        i2.v vVar3 = vVar;
        if (z14) {
            oa.f0 f0Var2 = oa.j0.f47265b;
            list = n1.f47281e;
        } else {
            list = w0Var.f48188j;
        }
        this.H = new w0(b1Var, c0Var, j12, j11, i15, hVar, false, k1Var3, vVar3, list, c0Var, w0Var.l, w0Var.f48190m, w0Var.f48191n, w0Var.f48192o, j11, 0L, j11, 0L, false);
        if (z12) {
            fz1Var = this.f48064r;
            if (!fz1Var.f14612g.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i10 < fz1Var.f14612g.size()) {
                    ((m0) fz1Var.f14612g.get(i10)).i();
                }
                fz1Var.f14612g = arrayList2;
                fz1Var.f14621q = null;
                fz1Var.k();
            }
            lo0 lo0Var2 = this.f48065s;
            HashMap map2 = (HashMap) lo0Var2.f17086g;
            while (r4.hasNext()) {
                u0Var.f48167a.s(u0Var.f48168b);
                f2.a aVar2 = u0Var.f48167a;
                t0 t0Var2 = u0Var.f48169c;
                aVar2.v(t0Var2);
                u0Var.f48167a.u(t0Var2);
            }
            map2.clear();
            ((HashSet) lo0Var2.f17087h).clear();
            lo0Var2.f17080a = false;
        }
    }

    public final void P() {
        m0 m0Var = (m0) this.f48064r.f14617m;
        this.L = m0Var != null && m0Var.f48116g.f48134i && this.K;
    }

    public final void Q(long j10, boolean z10) {
        fz1 fz1Var = this.f48064r;
        m0 m0Var = (m0) fz1Var.f14617m;
        long j11 = j10 + (m0Var == null ? 1000000000000L : m0Var.f48124p);
        this.W = j11;
        ((ea.z0) this.f48060n.f20039c).c(j11);
        for (uz1 uz1Var : this.f48042a) {
            long j12 = this.W;
            a aVarD = uz1Var.d(m0Var);
            if (aVarD != null) {
                aVarD.y(j12, false, z10);
            }
        }
        for (m0 m0Var2 = (m0) fz1Var.f14617m; m0Var2 != null; m0Var2 = m0Var2.f48121m) {
            for (i2.r rVar : m0Var2.f48123o.f42839c) {
                if (rVar != null) {
                    rVar.e();
                }
            }
        }
    }

    public final void R(i1.p0 p0Var, i1.p0 p0Var2) {
        if (p0Var.p() && p0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.f48061o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            defpackage.e.z(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j10) {
        boolean z10 = this.D;
        long jMin = 1000;
        long j11 = g0;
        if (z10) {
            this.C.getClass();
            jMin = this.H.f48183e != 3 ? j11 : 1000L;
            for (uz1 uz1Var : this.f48042a) {
                long j12 = this.W;
                long j13 = this.X;
                a aVar = (a) uz1Var.f20973f;
                a aVar2 = (a) uz1Var.f20972e;
                long jF = uz1.h(aVar2) ? aVar2.f(j12, j13) : Long.MAX_VALUE;
                if (aVar != null && aVar.f47912h != 0) {
                    jF = Math.min(jF, aVar.f(j12, j13));
                }
                jMin = Math.min(jMin, l1.y.Z(jF));
            }
            if (this.H.m()) {
                m0 m0Var = (m0) this.f48064r.f14617m;
                m0 m0Var2 = m0Var != null ? m0Var.f48121m : null;
                if (m0Var2 != null) {
                    if ((l1.y.M(jMin) * this.H.f48192o.f42544a) + this.W >= m0Var2.e()) {
                        jMin = Math.min(jMin, j11);
                    }
                }
            }
        } else if (this.H.f48183e != 3 || q0()) {
            jMin = j11;
        }
        this.f48055h.f44825a.sendEmptyMessageAtTime(2, j10 + jMin);
    }

    public final void V(boolean z10) {
        f2.c0 c0Var = ((m0) this.f48064r.f14617m).f48116g.f48126a;
        long jX = X(c0Var, this.H.f48196s, true, false);
        if (jX != this.H.f48196s) {
            w0 w0Var = this.H;
            this.H = y(c0Var, jX, w0Var.f48181c, w0Var.f48182d, z10, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [f2.a0, java.lang.Object] */
    public final void W(g0 g0Var) throws Throwable {
        long jLongValue;
        long jMax;
        f2.c0 c0VarP;
        long j10;
        boolean z10;
        long j11;
        long j12;
        long jA;
        boolean z11;
        f2.c0 c0Var;
        long j13;
        long j14;
        w0 w0Var;
        int i10;
        int i11;
        long j15;
        h0 h0Var = this;
        if (h0Var.E) {
            if (h0Var.F != null) {
                h0Var.G++;
                h0Var.I.d(1);
            }
            h0Var.F = g0Var;
            return;
        }
        h0Var.I.d(1);
        Pair pairS = S(h0Var.H.f48179a, g0Var, true, h0Var.P, h0Var.Q, h0Var.f48058k, h0Var.l);
        if (pairS == null) {
            Pair pairO = h0Var.o(h0Var.H.f48179a);
            c0VarP = (f2.c0) pairO.first;
            jLongValue = ((Long) pairO.second).longValue();
            z10 = !h0Var.H.f48179a.p();
            j10 = 0;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairS.first;
            jLongValue = ((Long) pairS.second).longValue();
            jMax = g0Var.f48034c == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
            c0VarP = h0Var.f48064r.p(h0Var.H.f48179a, obj, jLongValue);
            if (c0VarP.b()) {
                h0Var.H.f48179a.g(c0VarP.f40307a, h0Var.l);
                if (h0Var.l.e(c0VarP.f40308b) == c0VarP.f40309c) {
                    h0Var.l.f42588g.getClass();
                }
                h0Var.l.f42588g.a(c0VarP.f40308b).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
                j10 = 0;
            } else {
                j10 = 0;
                if (g0Var.f48034c != C.TIME_UNSET) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        try {
            try {
                if (!h0Var.H.f48179a.p()) {
                    if (pairS == null) {
                        if (h0Var.H.f48183e != 1) {
                            h0Var.m0(4);
                        }
                        h0Var.O(false, true, false, true);
                    } else {
                        if (c0VarP.equals(h0Var.H.f48180b)) {
                            try {
                                m0 m0Var = (m0) h0Var.f48064r.f14617m;
                                if (m0Var == null || !m0Var.f48114e || jLongValue == j10) {
                                    jA = jLongValue;
                                } else {
                                    ?? r0 = m0Var.f48110a;
                                    long j16 = h0Var.f48058k.f42627m;
                                    if (h0Var.D && j16 != C.TIME_UNSET) {
                                        h0Var.C.getClass();
                                    }
                                    jA = r0.a(jLongValue, h0Var.B);
                                }
                                if (l1.y.Z(jA) == l1.y.Z(h0Var.H.f48196s) && ((i10 = (w0Var = h0Var.H).f48183e) == 2 || i10 == 3)) {
                                    j14 = w0Var.f48196s;
                                    z10 = z10;
                                    c0Var = c0VarP;
                                    i11 = 2;
                                    j15 = j14;
                                    j13 = jMax;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z10 = z10;
                                c0VarP = c0VarP;
                                j12 = jLongValue;
                                j11 = jMax;
                                h0Var.H = h0Var.y(c0VarP, j12, j11, j12, z10, 2);
                                throw th;
                            }
                        } else {
                            jA = jLongValue;
                        }
                        try {
                            if (!h0Var.D) {
                                z11 = true;
                                break;
                            }
                            try {
                                uz1[] uz1VarArr = h0Var.f48042a;
                                int length = uz1VarArr.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        z11 = true;
                                        break;
                                    }
                                    uz1 uz1Var = uz1VarArr[i12];
                                    if (uz1Var.g() && ((a) uz1Var.f20972e).f47906b == 2) {
                                        z11 = true;
                                        h0Var.E = true;
                                        break;
                                    }
                                    i12++;
                                    h0Var.H = h0Var.y(c0VarP, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j12 = jLongValue;
                                j11 = jMax;
                            }
                            boolean z12 = h0Var.H.f48183e == 4 ? z11 : false;
                            try {
                                fz1 fz1Var = h0Var.f48064r;
                                long jX = h0Var.X(c0VarP, jA, ((m0) fz1Var.f14617m) != ((m0) fz1Var.f14618n) ? z11 : false, z12);
                                z10 |= jLongValue != jX ? z11 : false;
                                try {
                                    w0 w0Var2 = h0Var.H;
                                    f2.c0 c0Var2 = c0VarP;
                                    try {
                                        i1.p0 p0Var = w0Var2.f48179a;
                                        long j17 = jMax;
                                        try {
                                            h0Var.B0(p0Var, c0Var2, p0Var, w0Var2.f48180b, j17, true);
                                            c0Var = c0Var2;
                                            j13 = j17;
                                            j14 = jX;
                                            i11 = 2;
                                            j15 = j14;
                                            h0Var = this;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c0VarP = c0Var2;
                                            j11 = j17;
                                            j12 = jX;
                                            h0Var.H = h0Var.y(c0VarP, j12, j11, j12, z10, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c0VarP = c0Var2;
                                        j11 = jMax;
                                        j12 = jX;
                                        h0Var.H = h0Var.y(c0VarP, j12, j11, j12, z10, 2);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                j11 = jMax;
                                j12 = jLongValue;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    h0Var.H = h0Var.y(c0Var, j14, j13, j15, z10, i11);
                }
                h0Var.V = g0Var;
                z10 = z10;
                c0Var = c0VarP;
                j14 = jLongValue;
                j13 = jMax;
                i11 = 2;
                j15 = j14;
                h0Var = this;
                h0Var.H = h0Var.y(c0Var, j14, j13, j15, z10, i11);
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            z10 = z10;
            c0VarP = c0VarP;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Type inference failed for: r10v13, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [f2.a0, java.lang.Object] */
    public final long X(f2.c0 c0Var, long j10, boolean z10, boolean z11) {
        fz1 fz1Var;
        u0();
        boolean z12 = true;
        C0(false, true);
        if (z11 || this.H.f48183e == 3) {
            m0(2);
        }
        m0 m0Var = (m0) this.f48064r.f14617m;
        m0 m0Var2 = m0Var;
        while (m0Var2 != null && !c0Var.equals(m0Var2.f48116g.f48126a)) {
            m0Var2 = m0Var2.f48121m;
        }
        if (z10 || m0Var != m0Var2 || (m0Var2 != null && m0Var2.f48124p + j10 < 0)) {
            for (int i10 = 0; i10 < this.f48042a.length; i10++) {
                g(i10);
            }
            this.f48049d0 = C.TIME_UNSET;
            if (m0Var2 != null) {
                while (true) {
                    fz1Var = this.f48064r;
                    if (((m0) fz1Var.f14617m) == m0Var2) {
                        break;
                    }
                    fz1Var.a();
                }
                fz1Var.n(m0Var2);
                m0Var2.f48124p = 1000000000000L;
                l(new boolean[this.f48042a.length], ((m0) this.f48064r.f14618n).e());
                m0Var2.f48117h = true;
            }
        }
        f();
        if (m0Var2 != null) {
            this.f48064r.n(m0Var2);
            if (!m0Var2.f48114e) {
                m0Var2.f48116g = m0Var2.f48116g.b(j10);
            } else if (m0Var2.f48115f) {
                if (this.D) {
                    this.C.getClass();
                    if (this.H.f48179a.p() || !m0Var2.f48116g.f48126a.equals(this.H.f48180b)) {
                        j10 = m0Var2.f48110a.seekToUs(j10);
                        m0Var2.f48110a.g(j10 - this.f48059m);
                    } else {
                        long j11 = m0Var2.f48124p + j10;
                        boolean z13 = true;
                        for (uz1 uz1Var : this.f48042a) {
                            if (uz1Var.g()) {
                                a aVarD = uz1Var.d(m0Var2);
                                z13 &= aVarD != null && aVarD.C(j11);
                            }
                        }
                        if (z13) {
                            ?? r10 = m0Var2.f48110a;
                            long j12 = this.H.f48196s;
                            e1 e1Var = e1.f48005c;
                            if (r10.a(j12, e1Var) == m0Var2.f48110a.a(j10, e1Var)) {
                                z12 = false;
                            } else {
                                j10 = m0Var2.f48110a.seekToUs(j10);
                                m0Var2.f48110a.g(j10 - this.f48059m);
                            }
                        } else {
                            j10 = m0Var2.f48110a.seekToUs(j10);
                            m0Var2.f48110a.g(j10 - this.f48059m);
                        }
                    }
                } else {
                    j10 = m0Var2.f48110a.seekToUs(j10);
                    m0Var2.f48110a.g(j10 - this.f48059m);
                }
            }
            Q(j10, z12);
            C();
        } else {
            this.f48064r.b();
            Q(j10, true);
        }
        u(false);
        this.f48055h.e(2);
        return j10;
    }

    public final void Y(z0 z0Var) {
        z0Var.getClass();
        l1.w wVar = this.f48055h;
        if (z0Var.f48207e != this.f48057j) {
            wVar.a(15, z0Var).b();
            return;
        }
        synchronized (z0Var) {
        }
        try {
            z0Var.f48203a.handleMessage(z0Var.f48205c, z0Var.f48206d);
            z0Var.a(true);
            int i10 = this.H.f48183e;
            if (i10 == 3 || i10 == 2) {
                wVar.e(2);
            }
        } catch (Throwable th2) {
            z0Var.a(true);
            throw th2;
        }
    }

    public final void Z(z0 z0Var) {
        Looper looper = z0Var.f48207e;
        if (looper.getThread().isAlive()) {
            this.f48062p.a(looper, null).c(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, z0Var));
        } else {
            l1.a.s("TAG", "Trying to send message on a dead thread.");
            z0Var.a(false);
        }
    }

    @Override // l2.p
    public final void a(long j10, long j11, i1.p pVar, MediaFormat mediaFormat) {
        if (this.E) {
            l1.w wVar = this.f48055h;
            wVar.getClass();
            l1.v vVarB = l1.w.b();
            vVarB.f44823a = wVar.f44825a.obtainMessage(37);
            vVarB.b();
        }
    }

    public final void a0(i1.e eVar, boolean z10) {
        i2.p pVar = (i2.p) this.f48048d;
        if (!pVar.f42825i.equals(eVar)) {
            pVar.f42825i = eVar;
            pVar.e();
        }
        if (!z10) {
            eVar = null;
        }
        sy syVar = this.f48072z;
        if (!Objects.equals((i1.e) syVar.f20077g, eVar)) {
            syVar.f20077g = eVar;
            int i10 = eVar == null ? 0 : 1;
            syVar.f20073c = i10;
            go.k.h("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 == 1 || i10 == 0);
        }
        w0 w0Var = this.H;
        boolean z11 = w0Var.l;
        z0(syVar.d(w0Var.f48183e, z11), w0Var.f48191n, w0Var.f48190m, z11);
    }

    public final void b(e0 e0Var, int i10) throws Throwable {
        this.I.d(1);
        lo0 lo0Var = this.f48065s;
        if (i10 == -1) {
            i10 = ((ArrayList) lo0Var.f17082c).size();
        }
        v(lo0Var.a(i10, e0Var.f48001a, e0Var.f48002b), false);
    }

    public final void b0(boolean z10, l1.f fVar) {
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (uz1 uz1Var : this.f48042a) {
                    uz1Var.k();
                }
            }
        }
        if (fVar != null) {
            fVar.c();
        }
    }

    public final void c() {
        for (uz1 uz1Var : this.f48042a) {
            d1 d1Var = this.D ? this.C : null;
            ((a) uz1Var.f20972e).handleMessage(18, d1Var);
            a aVar = (a) uz1Var.f20973f;
            if (aVar != null) {
                aVar.handleMessage(18, d1Var);
            }
        }
    }

    public final void c0(e0 e0Var) throws Throwable {
        this.I.d(1);
        int i10 = e0Var.f48003c;
        f1 f1Var = e0Var.f48002b;
        ArrayList arrayList = e0Var.f48001a;
        if (i10 != -1) {
            this.V = new g0(new b1(arrayList, f1Var), e0Var.f48003c, e0Var.f48004d);
        }
        lo0 lo0Var = this.f48065s;
        ArrayList arrayList2 = (ArrayList) lo0Var.f17082c;
        lo0Var.h(0, arrayList2.size());
        v(lo0Var.a(arrayList2.size(), arrayList, f1Var), false);
    }

    public final boolean d() {
        if (!this.f48071y) {
            return false;
        }
        for (uz1 uz1Var : this.f48042a) {
            if (uz1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        this.K = z10;
        P();
        if (this.L) {
            fz1 fz1Var = this.f48064r;
            if (((m0) fz1Var.f14618n) != ((m0) fz1Var.f14617m)) {
                V(true);
                u(false);
            }
        }
    }

    public final void e() {
        N();
        V(true);
    }

    public final void e0(i1.g0 g0Var) {
        this.f48055h.d(16);
        sr0 sr0Var = this.f48060n;
        sr0Var.a(g0Var);
        i1.g0 playbackParameters = sr0Var.getPlaybackParameters();
        x(playbackParameters, playbackParameters.f42544a, true, true);
    }

    public final void f() {
        a aVar;
        if (this.f48071y && d()) {
            for (uz1 uz1Var : this.f48042a) {
                int iC = uz1Var.c();
                if (uz1Var.f()) {
                    int i10 = uz1Var.f20971d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        aVar = (a) uz1Var.f20972e;
                    } else {
                        aVar = (a) uz1Var.f20973f;
                        aVar.getClass();
                    }
                    uz1Var.a(aVar, this.f48060n);
                    uz1Var.i(z10);
                    uz1Var.f20971d = i11;
                }
                this.U -= iC - uz1Var.c();
            }
            this.f48049d0 = C.TIME_UNSET;
        }
    }

    public final void f0(j jVar) {
        this.f48047c0 = jVar;
        i1.p0 p0Var = this.H.f48179a;
        fz1 fz1Var = this.f48064r;
        fz1Var.getClass();
        jVar.getClass();
        if (fz1Var.f14612g.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fz1Var.f14612g.size(); i10++) {
            ((m0) fz1Var.f14612g.get(i10)).i();
        }
        fz1Var.f14612g = arrayList;
        fz1Var.f14621q = null;
        fz1Var.k();
    }

    public final void g(int i10) {
        uz1[] uz1VarArr = this.f48042a;
        int iC = uz1VarArr[i10].c();
        uz1 uz1Var = uz1VarArr[i10];
        a aVar = (a) uz1Var.f20972e;
        sr0 sr0Var = this.f48060n;
        uz1Var.a(aVar, sr0Var);
        a aVar2 = (a) uz1Var.f20973f;
        if (aVar2 != null) {
            boolean z10 = (aVar2.f47912h == 0 || uz1Var.f20971d == 3) ? false : true;
            uz1Var.a(aVar2, sr0Var);
            uz1Var.i(false);
            if (z10) {
                a aVar3 = (a) uz1Var.f20972e;
                aVar2.getClass();
                aVar2.handleMessage(17, aVar3);
            }
        }
        uz1Var.f20971d = 0;
        G(i10, false);
        this.U -= iC;
    }

    public final void g0(int i10) {
        this.P = i10;
        i1.p0 p0Var = this.H.f48179a;
        fz1 fz1Var = this.f48064r;
        fz1Var.f14607b = i10;
        int iR = fz1Var.r(p0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            f();
        }
        u(false);
    }

    @Override // f2.d1
    public final void h(f2.e1 e1Var) {
        this.f48055h.a(9, (f2.a0) e1Var).b();
    }

    public final void h0(boolean z10) throws Throwable {
        if (!z10) {
            g0 g0Var = this.F;
            l1.w wVar = this.f48055h;
            if (g0Var != null && this.E && !wVar.f44825a.hasMessages(37)) {
                this.G++;
            }
            int i10 = this.G;
            if (i10 > 0) {
                this.f48070x.c(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, i10));
            }
            this.G = 0;
            this.E = false;
            wVar.d(37);
            g0 g0Var2 = this.F;
            if (g0Var2 != null) {
                W(g0Var2);
                this.F = null;
                this.E = false;
            }
        }
        this.D = z10;
        c();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        m0 m0Var;
        f2.c0 c0Var;
        m0 m0Var2;
        int i11;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    this.I.d(1);
                    z0(this.f48072z.d(this.H.f48183e, z10), i13 >> 4, i13 & 15, z10);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((g0) message.obj);
                    break;
                case 4:
                    e0((i1.g0) message.obj);
                    break;
                case 5:
                    j0((e1) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((l1.f) message.obj);
                    return true;
                case 8:
                    w((f2.a0) message.obj);
                    break;
                case 9:
                    s((f2.a0) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (l1.f) message.obj);
                    break;
                case 14:
                    Y((z0) message.obj);
                    break;
                case 15:
                    Z((z0) message.obj);
                    break;
                case 16:
                    i1.g0 g0Var = (i1.g0) message.obj;
                    x(g0Var, g0Var.f42544a, true, false);
                    break;
                case 17:
                    c0((e0) message.obj);
                    break;
                case 18:
                    b((e0) message.obj, message.arg1);
                    break;
                case 19:
                    defpackage.e.z(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (f1) message.obj);
                    break;
                case 21:
                    l0((f1) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    N();
                    V(true);
                    break;
                case 27:
                    x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    f0((j) message.obj);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    J();
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (l1.f) pair.second);
                    break;
                case 31:
                    a0((i1.e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    n0((l2.p) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.E = false;
                    g0 g0Var2 = this.F;
                    if (g0Var2 != null) {
                        W(g0Var2);
                        this.F = null;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    i0((d1) message.obj);
                    break;
            }
        } catch (f2.b e10) {
            t(1002, e10);
        } catch (i1.e0 e11) {
            boolean z11 = e11.f42534a;
            int i14 = e11.f42535b;
            if (i14 == 1) {
                i11 = z11 ? IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED : 3003;
            } else {
                if (i14 == 4) {
                    i11 = z11 ? 3002 : IronSourceError.ERROR_REWARD_VALIDATION_FAILED;
                }
                t(i12, e11);
            }
            i12 = i11;
            t(i12, e11);
        } catch (n1.i e12) {
            t(e12.f46362a, e12);
        } catch (IOException e13) {
            t(2000, e13);
        } catch (RuntimeException e14) {
            h hVar = new h(2, e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1000);
            l1.a.f("ExoPlayerImplInternal", "Playback error", hVar);
            t0(true, false);
            this.H = this.H.f(hVar);
        } catch (h e15) {
            e = e15;
            int i15 = e.f48035c;
            fz1 fz1Var = this.f48064r;
            if (i15 == 1 && (m0Var2 = (m0) fz1Var.f14618n) != null && e.f48040h == null) {
                e = e.a(m0Var2.f48116g.f48126a);
            }
            int i16 = e.f48035c;
            l1.w wVar = this.f48055h;
            if (i16 == 1 && (c0Var = e.f48040h) != null && A(e.f48037e, c0Var)) {
                this.f48051e0 = true;
                f();
                m0 m0VarG = fz1Var.g();
                m0 m0Var3 = (m0) fz1Var.f14617m;
                if (m0Var3 != m0VarG) {
                    while (m0Var3 != null) {
                        m0 m0Var4 = m0Var3.f48121m;
                        if (m0Var4 == m0VarG) {
                            break;
                        }
                        m0Var3 = m0Var4;
                    }
                }
                fz1Var.n(m0Var3);
                if (this.H.f48183e != 4) {
                    C();
                    wVar.e(2);
                }
            } else {
                h hVar2 = this.f48043a0;
                if (hVar2 != null) {
                    hVar2.addSuppressed(e);
                    e = this.f48043a0;
                }
                if (e.f48035c == 1 && ((m0) fz1Var.f14617m) != ((m0) fz1Var.f14618n)) {
                    while (true) {
                        m0Var = (m0) fz1Var.f14617m;
                        if (m0Var == ((m0) fz1Var.f14618n)) {
                            break;
                        }
                        fz1Var.a();
                    }
                    go.k.p(m0Var);
                    E();
                    n0 n0Var = m0Var.f48116g;
                    f2.c0 c0Var2 = n0Var.f48126a;
                    long j10 = n0Var.f48127b;
                    this.H = y(c0Var2, j10, n0Var.f48128c, j10, true, 0);
                }
                if (e.f48041i && (this.f48043a0 == null || (i10 = e.f42536a) == 5004 || i10 == 5003)) {
                    l1.a.t("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f48043a0 == null) {
                        this.f48043a0 = e;
                    }
                    l1.v vVarA = wVar.a(25, e);
                    Handler handler = wVar.f44825a;
                    Message message2 = vVarA.f44823a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    vVarA.a();
                } else {
                    l1.a.f("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.H = this.H.f(e);
                }
            }
        } catch (u1.c e16) {
            t(e16.f51658a, e16);
        }
        E();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0255  */
    /* JADX WARN: Code duplicated, block: B:155:0x0262  */
    /* JADX WARN: Code duplicated, block: B:189:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:192:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:195:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:201:0x0304  */
    /* JADX WARN: Code duplicated, block: B:208:0x0321  */
    /* JADX WARN: Code duplicated, block: B:210:0x0324  */
    /* JADX WARN: Code duplicated, block: B:211:0x032c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0337  */
    /* JADX WARN: Code duplicated, block: B:214:0x0343  */
    /* JADX WARN: Code duplicated, block: B:218:0x035b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0364  */
    /* JADX WARN: Code duplicated, block: B:224:0x0369  */
    /* JADX WARN: Code duplicated, block: B:228:0x0370  */
    /* JADX WARN: Code duplicated, block: B:231:0x0377  */
    /* JADX WARN: Code duplicated, block: B:234:0x0382  */
    /* JADX WARN: Code duplicated, block: B:247:0x039d  */
    /* JADX WARN: Code duplicated, block: B:256:0x02fe A[EDGE_INSN: B:256:0x02fe->B:199:0x02fe BREAK  A[LOOP:1: B:190:0x02e6->B:198:0x02fb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Type inference failed for: r4v1, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [f2.a0, java.lang.Object] */
    public final void i() {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        boolean zB;
        int i10;
        boolean z14;
        boolean z15;
        w0 w0Var;
        int i11;
        int i12;
        uz1[] uz1VarArr;
        w0 w0Var2;
        boolean z16;
        this.f48062p.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f48055h.d(2);
        if (!this.A) {
            y0();
        }
        int i13 = this.H.f48183e;
        if (i13 == 1 || i13 == 4) {
            return;
        }
        if (this.A) {
            y0();
        }
        m0 m0Var = (m0) this.f48064r.f14617m;
        if (m0Var == null) {
            U(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        A0();
        if (m0Var.f48114e) {
            this.f48062p.getClass();
            this.X = l1.y.M(SystemClock.elapsedRealtime());
            m0Var.f48110a.g(this.H.f48196s - this.f48059m);
            z10 = true;
            z11 = true;
            int i14 = 0;
            while (true) {
                uz1[] uz1VarArr2 = this.f48042a;
                if (i14 >= uz1VarArr2.length) {
                    break;
                }
                uz1 uz1Var = uz1VarArr2[i14];
                if (uz1Var.c() == 0) {
                    G(i14, false);
                } else {
                    long j11 = this.W;
                    long j12 = this.X;
                    a aVar = (a) uz1Var.f20973f;
                    a aVar2 = (a) uz1Var.f20972e;
                    if (uz1.h(aVar2)) {
                        aVar2.w(j11, j12);
                    }
                    if (aVar != null && aVar.f47912h != 0) {
                        aVar.w(j11, j12);
                    }
                    if (z10) {
                        a aVar3 = (a) uz1Var.f20973f;
                        a aVar4 = (a) uz1Var.f20972e;
                        boolean zJ = uz1.h(aVar4) ? aVar4.j() : true;
                        if (aVar3 != null && aVar3.f47912h != 0) {
                            zJ &= aVar3.j();
                        }
                        if (zJ) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    a aVarD = uz1Var.d(m0Var);
                    boolean z17 = aVarD == null || aVarD.i() || aVarD.l() || aVarD.j();
                    G(i14, z17);
                    z11 = z11 && z17;
                    if (!z17) {
                        F(i14);
                    }
                }
                i14++;
            }
        } else {
            m0Var.f48110a.maybeThrowPrepareError();
            z10 = true;
            z11 = true;
        }
        long j13 = m0Var.f48116g.f48130e;
        boolean z18 = z10 && m0Var.f48114e && (j13 == C.TIME_UNSET || j13 <= this.H.f48196s);
        if (z18 && this.L) {
            this.L = false;
            int i15 = this.H.f48191n;
            this.I.d(0);
            z0(this.f48072z.d(this.H.f48183e, false), i15, 5, false);
        }
        if (!z18 || !m0Var.f48116g.f48135j) {
            w0 w0Var3 = this.H;
            if (w0Var3.f48183e == 2) {
                fz1 fz1Var = this.f48064r;
                if (this.U != 0) {
                    if (!z11) {
                        zB = false;
                    } else if (w0Var3.f48185g) {
                        m0 m0Var2 = (m0) fz1Var.f14617m;
                        long j14 = r0(w0Var3.f48179a, m0Var2.f48116g.f48126a) ? this.f48066t.f47988h : -9223372036854775807L;
                        m0 m0Var3 = (m0) fz1Var.f14620p;
                        boolean z19 = m0Var3.g() && m0Var3.f48116g.f48135j;
                        boolean z20 = m0Var3.f48116g.f48126a.b() && !m0Var3.f48114e;
                        if (z19 || z20) {
                            j10 = -9223372036854775807L;
                        } else {
                            long jP = p(m0Var3.d());
                            j0 j0Var = this.f48052f;
                            q1.j jVar = this.f48068v;
                            j10 = -9223372036854775807L;
                            i1.p0 p0Var = this.H.f48179a;
                            f2.c0 c0Var = m0Var2.f48116g.f48126a;
                            float f10 = this.f48060n.getPlaybackParameters().f42544a;
                            boolean z21 = this.H.l;
                            boolean z22 = this.M;
                            f fVar = (f) j0Var;
                            fVar.getClass();
                            long j15 = j14;
                            i1.v vVar = p0Var.m(p0Var.g(c0Var.f40307a, fVar.f48011b).f42584c, fVar.f48010a, 0L).f42618c.f42714b;
                            if (vVar == null) {
                                z13 = false;
                            } else {
                                String scheme = vVar.f42704a.getScheme();
                                if (TextUtils.isEmpty(scheme) || f.f48009r.contains(scheme)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            long jD = l1.y.D(jP, f10);
                            long jMin = z22 ? z13 ? fVar.f48020k : fVar.f48019j : z13 ? fVar.f48018i : fVar.f48017h;
                            if (j15 != C.TIME_UNSET) {
                                jMin = Math.min(j15 / 2, jMin);
                            }
                            if (jMin > 0 && jD < jMin) {
                                if (!(z13 ? fVar.f48021m : false)) {
                                    e eVar = (e) fVar.f48024p.get(jVar);
                                    eVar.getClass();
                                    synchronized (eVar) {
                                        i10 = eVar.f48000d;
                                    }
                                    int i16 = i10 * fVar.f48012c.f43634b;
                                    e eVar2 = (e) fVar.f48024p.get(jVar);
                                    eVar2.getClass();
                                    if (i16 >= eVar2.f47999c) {
                                    }
                                }
                                zB = false;
                            }
                        }
                        zB = true;
                    } else {
                        j10 = -9223372036854775807L;
                        zB = true;
                    }
                    if (zB) {
                        m0(3);
                        this.f48043a0 = null;
                        if (q0()) {
                            C0(false, false);
                            sr0 sr0Var = this.f48060n;
                            z12 = true;
                            sr0Var.f20038b = true;
                            ((ea.z0) sr0Var.f20039c).d();
                            s0();
                        }
                    }
                    if (this.H.f48183e == 2) {
                        i12 = 0;
                        while (true) {
                            uz1VarArr = this.f48042a;
                            if (i12 < uz1VarArr.length) {
                                break;
                            }
                            if (uz1VarArr[i12].d(m0Var) != null) {
                                z16 = z12;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                F(i12);
                            }
                            i12++;
                        }
                        w0Var2 = this.H;
                        if (w0Var2.f48185g && w0Var2.f48195r < 500000 && z((m0) this.f48064r.f14620p) && q0()) {
                            z14 = z12;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        this.f48045b0 = C.TIME_UNSET;
                    } else if (this.f48045b0 == C.TIME_UNSET) {
                        this.f48062p.getClass();
                        this.f48045b0 = SystemClock.elapsedRealtime();
                    } else {
                        this.f48062p.getClass();
                        if (SystemClock.elapsedRealtime() - this.f48045b0 >= 4000) {
                            throw new l1.t(0, 4000);
                        }
                    }
                    if (q0() || this.H.f48183e != 3) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (this.T || !this.S || !z15) {
                        z12 = false;
                    }
                    w0Var = this.H;
                    if (w0Var.f48193p != z12) {
                        this.H = w0Var.i(z12);
                    }
                    this.S = false;
                    if (!z12 && (i11 = this.H.f48183e) != 4 && (z15 || i11 == 2 || (i11 == 3 && this.U != 0))) {
                        U(jUptimeMillis);
                    }
                    Trace.endSection();
                }
                zB = B();
                j10 = -9223372036854775807L;
                if (zB) {
                    m0(3);
                    this.f48043a0 = null;
                    if (q0()) {
                        C0(false, false);
                        sr0 sr0Var2 = this.f48060n;
                        z12 = true;
                        sr0Var2.f20038b = true;
                        ((ea.z0) sr0Var2.f20039c).d();
                        s0();
                    }
                }
                if (this.H.f48183e == 2) {
                    i12 = 0;
                    while (true) {
                        uz1VarArr = this.f48042a;
                        if (i12 < uz1VarArr.length) {
                            break;
                            break;
                        }
                        if (uz1VarArr[i12].d(m0Var) != null) {
                            z16 = z12;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            F(i12);
                        }
                        i12++;
                    }
                    w0Var2 = this.H;
                    if (w0Var2.f48185g) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (!z14) {
                    this.f48045b0 = C.TIME_UNSET;
                } else if (this.f48045b0 == C.TIME_UNSET) {
                    this.f48062p.getClass();
                    this.f48045b0 = SystemClock.elapsedRealtime();
                } else {
                    this.f48062p.getClass();
                    if (SystemClock.elapsedRealtime() - this.f48045b0 >= 4000) {
                        throw new l1.t(0, 4000);
                    }
                }
                if (q0()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (this.T) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                w0Var = this.H;
                if (w0Var.f48193p != z12) {
                    this.H = w0Var.i(z12);
                }
                this.S = false;
                if (!z12) {
                    U(jUptimeMillis);
                }
                Trace.endSection();
            }
            j10 = -9223372036854775807L;
            z12 = true;
            if (this.H.f48183e == 3 && (this.U != 0 ? !z11 : !B())) {
                C0(q0(), false);
                m0(2);
                if (this.M) {
                    for (m0 m0Var4 = (m0) this.f48064r.f14617m; m0Var4 != null; m0Var4 = m0Var4.f48121m) {
                        for (i2.r rVar : m0Var4.f48123o.f42839c) {
                            if (rVar != null) {
                                rVar.h();
                            }
                        }
                    }
                    d dVar = this.f48066t;
                    long j16 = dVar.f47988h;
                    if (j16 != j10) {
                        long j17 = j16 + dVar.f47982b;
                        dVar.f47988h = j17;
                        long j18 = dVar.f47987g;
                        if (j18 != j10 && j17 > j18) {
                            dVar.f47988h = j18;
                        }
                        dVar.l = j10;
                    }
                }
                u0();
            }
            if (this.H.f48183e == 2) {
                i12 = 0;
                while (true) {
                    uz1VarArr = this.f48042a;
                    if (i12 < uz1VarArr.length) {
                        break;
                        break;
                    }
                    if (uz1VarArr[i12].d(m0Var) != null) {
                        z16 = z12;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        F(i12);
                    }
                    i12++;
                }
                w0Var2 = this.H;
                if (w0Var2.f48185g) {
                    z14 = false;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                this.f48045b0 = C.TIME_UNSET;
            } else if (this.f48045b0 == C.TIME_UNSET) {
                this.f48062p.getClass();
                this.f48045b0 = SystemClock.elapsedRealtime();
            } else {
                this.f48062p.getClass();
                if (SystemClock.elapsedRealtime() - this.f48045b0 >= 4000) {
                    throw new l1.t(0, 4000);
                }
            }
            if (q0()) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (this.T) {
                z12 = false;
            } else {
                z12 = false;
            }
            w0Var = this.H;
            if (w0Var.f48193p != z12) {
                this.H = w0Var.i(z12);
            }
            this.S = false;
            if (!z12) {
                U(jUptimeMillis);
            }
            Trace.endSection();
        }
        m0(4);
        u0();
        z12 = true;
        if (this.H.f48183e == 2) {
            i12 = 0;
            while (true) {
                uz1VarArr = this.f48042a;
                if (i12 < uz1VarArr.length) {
                    break;
                    break;
                }
                if (uz1VarArr[i12].d(m0Var) != null) {
                    z16 = z12;
                } else {
                    z16 = false;
                }
                if (z16) {
                    F(i12);
                }
                i12++;
            }
            w0Var2 = this.H;
            if (w0Var2.f48185g) {
                z14 = false;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (!z14) {
            this.f48045b0 = C.TIME_UNSET;
        } else if (this.f48045b0 == C.TIME_UNSET) {
            this.f48062p.getClass();
            this.f48045b0 = SystemClock.elapsedRealtime();
        } else {
            this.f48062p.getClass();
            if (SystemClock.elapsedRealtime() - this.f48045b0 >= 4000) {
                throw new l1.t(0, 4000);
            }
        }
        if (q0()) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (this.T) {
            z12 = false;
        } else {
            z12 = false;
        }
        w0Var = this.H;
        if (w0Var.f48193p != z12) {
            this.H = w0Var.i(z12);
        }
        this.S = false;
        if (!z12) {
            U(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void i0(d1 d1Var) {
        this.C = d1Var;
        c();
    }

    @Override // f2.z
    public final void j(f2.a0 a0Var) {
        this.f48055h.a(8, a0Var).b();
    }

    public final void j0(e1 e1Var) {
        this.B = e1Var;
    }

    public final void k(m0 m0Var, int i10, boolean z10, long j10) {
        uz1 uz1Var = this.f48042a[i10];
        boolean zG = uz1Var.g();
        a aVar = (a) uz1Var.f20972e;
        if (zG) {
            return;
        }
        boolean z11 = m0Var == ((m0) this.f48064r.f14617m);
        i2.v vVar = m0Var.f48123o;
        c1 c1Var = vVar.f42838b[i10];
        i2.r rVar = vVar.f42839c[i10];
        boolean z12 = q0() && this.H.f48183e == 3;
        boolean z13 = !z10 && z12;
        this.U++;
        f2.c1 c1Var2 = m0Var.f48112c[i10];
        long j11 = m0Var.f48124p;
        f2.c0 c0Var = m0Var.f48116g.f48126a;
        a aVar2 = (a) uz1Var.f20973f;
        int length = rVar != null ? rVar.length() : 0;
        i1.p[] pVarArr = new i1.p[length];
        for (int i11 = 0; i11 < length; i11++) {
            rVar.getClass();
            pVarArr[i11] = rVar.getFormat(i11);
        }
        int i12 = uz1Var.f20971d;
        sr0 sr0Var = this.f48060n;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            uz1Var.f20968a = true;
            go.k.t(aVar.f47912h == 0);
            aVar.f47908d = c1Var;
            aVar.f47920q = c0Var;
            aVar.f47912h = 1;
            aVar.n(z13, z11);
            aVar.x(pVarArr, c1Var2, j10, j11, c0Var);
            aVar.y(j10, z13, true);
            sr0Var.d(aVar);
        } else {
            uz1Var.f20969b = true;
            aVar2.getClass();
            go.k.t(aVar2.f47912h == 0);
            aVar2.f47908d = c1Var;
            aVar2.f47920q = c0Var;
            aVar2.f47912h = 1;
            aVar2.n(z13, z11);
            aVar2.x(pVarArr, c1Var2, j10, j11, c0Var);
            aVar2.y(j10, z13, true);
            sr0Var.d(aVar2);
        }
        d0 d0Var = new d0(this);
        a aVarD = uz1Var.d(m0Var);
        aVarD.getClass();
        aVarD.handleMessage(11, d0Var);
        if (z12 && z11) {
            uz1Var.m();
        }
    }

    public final void k0(boolean z10) {
        this.Q = z10;
        i1.p0 p0Var = this.H.f48179a;
        fz1 fz1Var = this.f48064r;
        fz1Var.f14608c = z10;
        int iR = fz1Var.r(p0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            f();
        }
        u(false);
    }

    public final void l(boolean[] zArr, long j10) {
        uz1[] uz1VarArr;
        h0 h0Var;
        long j11;
        m0 m0Var = (m0) this.f48064r.f14618n;
        i2.v vVar = m0Var.f48123o;
        int i10 = 0;
        while (true) {
            uz1VarArr = this.f48042a;
            if (i10 >= uz1VarArr.length) {
                break;
            }
            if (!vVar.b(i10)) {
                uz1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < uz1VarArr.length) {
            if (vVar.b(i11) && uz1VarArr[i11].d(m0Var) == null) {
                h0Var = this;
                j11 = j10;
                h0Var.k(m0Var, i11, zArr[i11], j11);
            } else {
                h0Var = this;
                j11 = j10;
            }
            i11++;
            this = h0Var;
            j10 = j11;
        }
    }

    public final void l0(f1 f1Var) throws Throwable {
        this.I.d(1);
        lo0 lo0Var = this.f48065s;
        int size = ((ArrayList) lo0Var.f17082c).size();
        if (f1Var.f40337b.length != size) {
            f1Var = new f1(new Random(f1Var.f40336a.nextLong())).a(size);
        }
        lo0Var.f17090k = f1Var;
        v(lo0Var.b(), false);
    }

    public final long m(i1.p0 p0Var, Object obj, long j10) {
        i1.n0 n0Var = this.l;
        int i10 = p0Var.g(obj, n0Var).f42584c;
        i1.o0 o0Var = this.f48058k;
        p0Var.n(i10, o0Var);
        return (o0Var.f42621f != C.TIME_UNSET && o0Var.a() && o0Var.f42624i) ? l1.y.M(l1.y.B(o0Var.f42622g) - o0Var.f42621f) - (j10 + n0Var.f42586e) : C.TIME_UNSET;
    }

    public final void m0(int i10) {
        w0 w0Var = this.H;
        if (w0Var.f48183e != i10) {
            if (i10 != 2) {
                this.f48045b0 = C.TIME_UNSET;
            }
            if (i10 != 3 && w0Var.f48193p) {
                this.H = w0Var.i(false);
            }
            this.H = this.H.h(i10);
        }
    }

    public final long n(m0 m0Var) {
        if (m0Var == null) {
            return 0L;
        }
        long jMax = m0Var.f48124p;
        if (!m0Var.f48114e) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            uz1[] uz1VarArr = this.f48042a;
            if (i10 >= uz1VarArr.length) {
                return jMax;
            }
            if (uz1VarArr[i10].d(m0Var) != null) {
                a aVarD = uz1VarArr[i10].d(m0Var);
                Objects.requireNonNull(aVarD);
                long j10 = aVarD.f47916m;
                if (j10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j10, jMax);
            }
            i10++;
        }
    }

    public final void n0(l2.p pVar) {
        for (uz1 uz1Var : this.f48042a) {
            a aVar = (a) uz1Var.f20972e;
            int i10 = aVar.f47906b;
            if (i10 == 2 || i10 == 4) {
                aVar.handleMessage(7, pVar);
                a aVar2 = (a) uz1Var.f20973f;
                if (aVar2 != null) {
                    aVar2.handleMessage(7, pVar);
                }
            }
        }
    }

    public final Pair o(i1.p0 p0Var) {
        long j10 = 0;
        if (p0Var.p()) {
            return Pair.create(w0.f48178u, 0L);
        }
        int iA = p0Var.a(this.Q);
        Pair pairI = p0Var.i(this.f48058k, this.l, iA, C.TIME_UNSET);
        f2.c0 c0VarP = this.f48064r.p(p0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (c0VarP.b()) {
            Object obj = c0VarP.f40307a;
            i1.n0 n0Var = this.l;
            p0Var.g(obj, n0Var);
            if (c0VarP.f40309c == n0Var.e(c0VarP.f40308b)) {
                n0Var.f42588g.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(c0VarP, Long.valueOf(j10));
    }

    public final void o0(Object obj, l1.f fVar) {
        for (uz1 uz1Var : this.f48042a) {
            a aVar = (a) uz1Var.f20972e;
            if (aVar.f47906b == 2) {
                int i10 = uz1Var.f20971d;
                if (i10 == 4 || i10 == 1) {
                    a aVar2 = (a) uz1Var.f20973f;
                    aVar2.getClass();
                    aVar2.handleMessage(1, obj);
                } else {
                    aVar.handleMessage(1, obj);
                }
            }
        }
        int i11 = this.H.f48183e;
        if (i11 == 3 || i11 == 2) {
            this.f48055h.e(2);
        }
        if (fVar != null) {
            fVar.c();
        }
    }

    public final long p(long j10) {
        m0 m0Var = (m0) this.f48064r.f14620p;
        if (m0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.W - m0Var.f48124p));
    }

    public final void p0(float f10) {
        this.f48053f0 = f10;
        float f11 = f10 * this.f48072z.f20074d;
        for (uz1 uz1Var : this.f48042a) {
            a aVar = (a) uz1Var.f20972e;
            if (aVar.f47906b == 1) {
                aVar.handleMessage(2, Float.valueOf(f11));
                a aVar2 = (a) uz1Var.f20973f;
                if (aVar2 != null) {
                    aVar2.handleMessage(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void q(int i10) {
        w0 w0Var = this.H;
        z0(i10, w0Var.f48191n, w0Var.f48190m, w0Var.l);
    }

    public final boolean q0() {
        w0 w0Var = this.H;
        return w0Var.l && w0Var.f48191n == 0;
    }

    public final void r() {
        p0(this.f48053f0);
    }

    public final boolean r0(i1.p0 p0Var, f2.c0 c0Var) {
        if (c0Var.b() || p0Var.p()) {
            return false;
        }
        int i10 = p0Var.g(c0Var.f40307a, this.l).f42584c;
        i1.o0 o0Var = this.f48058k;
        p0Var.n(i10, o0Var);
        return o0Var.a() && o0Var.f42624i && o0Var.f42621f != C.TIME_UNSET;
    }

    public final void s(f2.a0 a0Var) {
        fz1 fz1Var = this.f48064r;
        m0 m0Var = (m0) fz1Var.f14620p;
        if (m0Var != null && m0Var.f48110a == a0Var) {
            fz1Var.m(this.W);
            C();
            return;
        }
        m0 m0Var2 = (m0) fz1Var.f14621q;
        if (m0Var2 == null || m0Var2.f48110a != a0Var) {
            return;
        }
        D();
    }

    public final void s0() {
        m0 m0Var = (m0) this.f48064r.f14617m;
        if (m0Var == null) {
            return;
        }
        i2.v vVar = m0Var.f48123o;
        int i10 = 0;
        while (true) {
            uz1[] uz1VarArr = this.f48042a;
            if (i10 >= uz1VarArr.length) {
                return;
            }
            if (vVar.b(i10)) {
                uz1VarArr[i10].m();
            }
            i10++;
        }
    }

    public final void t(int i10, IOException iOException) {
        h hVar = new h(0, iOException, i10);
        m0 m0Var = (m0) this.f48064r.f14617m;
        if (m0Var != null) {
            hVar = hVar.a(m0Var.f48116g.f48126a);
        }
        l1.a.f("ExoPlayerImplInternal", "Playback error", hVar);
        t0(false, false);
        this.H = this.H.f(hVar);
    }

    public final void t0(boolean z10, boolean z11) {
        O(z10 || !this.R, false, true, false);
        this.I.d(z11 ? 1 : 0);
        f fVar = (f) this.f48052f;
        ConcurrentHashMap concurrentHashMap = fVar.f48024p;
        q1.j jVar = this.f48068v;
        e eVar = (e) concurrentHashMap.get(jVar);
        if (eVar != null) {
            int i10 = eVar.f47997a - 1;
            eVar.f47997a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(jVar);
                fVar.c();
            }
        }
        this.f48072z.d(1, this.H.l);
        m0(1);
    }

    public final void u(boolean z10) {
        m0 m0Var = (m0) this.f48064r.f14620p;
        f2.c0 c0Var = m0Var == null ? this.H.f48180b : m0Var.f48116g.f48126a;
        boolean zEquals = this.H.f48189k.equals(c0Var);
        if (!zEquals) {
            this.H = this.H.c(c0Var);
        }
        w0 w0Var = this.H;
        w0Var.f48194q = m0Var == null ? w0Var.f48196s : m0Var.d();
        w0 w0Var2 = this.H;
        w0Var2.f48195r = p(w0Var2.f48194q);
        if ((!zEquals || z10) && m0Var != null && m0Var.f48114e) {
            w0(m0Var.f48116g.f48126a, m0Var.f48123o);
        }
    }

    public final void u0() {
        sr0 sr0Var = this.f48060n;
        sr0Var.f20038b = false;
        ea.z0 z0Var = (ea.z0) sr0Var.f20039c;
        if (z0Var.f39931a) {
            z0Var.c(z0Var.getPositionUs());
            z0Var.f39931a = false;
        }
        for (uz1 uz1Var : this.f48042a) {
            a aVar = (a) uz1Var.f20973f;
            a aVar2 = (a) uz1Var.f20972e;
            if (uz1.h(aVar2)) {
                uz1.b(aVar2);
            }
            if (aVar != null && aVar.f47912h != 0) {
                uz1.b(aVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:228:0x03da  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x040e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0411  */
    /* JADX WARN: Code duplicated, block: B:244:0x0413  */
    /* JADX WARN: Code duplicated, block: B:247:0x041f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0425  */
    /* JADX WARN: Code duplicated, block: B:253:0x0446  */
    /* JADX WARN: Code duplicated, block: B:260:0x046a  */
    /* JADX WARN: Code duplicated, block: B:261:0x046c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0477  */
    /* JADX WARN: Code duplicated, block: B:266:0x047f  */
    /* JADX WARN: Code duplicated, block: B:268:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x049e  */
    /* JADX WARN: Code duplicated, block: B:276:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:277:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:280:0x04af  */
    /* JADX WARN: Code duplicated, block: B:282:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [i1.p0] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v7, types: [long] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [p1.g0] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15, types: [long] */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8, types: [long] */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [i1.p0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [p1.w0] */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.fz1] */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.google.android.gms.internal.ads.fz1] */
    /* JADX WARN: Type inference failed for: r43v0, types: [p1.h0] */
    /* JADX WARN: Type inference failed for: r5v34, types: [long] */
    /* JADX WARN: Type inference failed for: r5v46, types: [long] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [long] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [long] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23, types: [i1.p0] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v(i1.p0 p0Var, boolean z10) throws Throwable {
        f2.c0 c0Var;
        int i10;
        long j10;
        i1.p0 p0Var2;
        i1.o0 o0Var;
        int iA;
        long jK;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        long j12;
        long jLongValue;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long jMin;
        long j18;
        f0 f0Var;
        int i11;
        boolean z15;
        long jLongValue2;
        boolean z16;
        boolean z17;
        boolean z18;
        long j19;
        float f10;
        ?? r22;
        ?? r20;
        ?? r11;
        f2.c0 c0Var2;
        ?? r23;
        ?? r12;
        ?? r21;
        float f11;
        long j20;
        f2.c0 c0Var3;
        Object obj;
        ?? r10;
        long j21;
        ?? r13;
        boolean z19;
        char c4;
        float f12;
        ?? r24;
        ?? r25;
        ?? r14;
        ?? r15;
        i1.p0 p0Var3;
        m0 m0Var;
        float f13;
        ?? r26;
        boolean z20;
        g0 g0Var;
        long j22;
        f2.c0 c0Var4;
        Object obj2;
        boolean z21;
        long j23;
        ?? r16;
        float f14;
        ?? r27;
        w0 w0Var = this.H;
        g0 g0Var2 = this.V;
        fz1 fz1Var = this.f48064r;
        int i12 = this.P;
        boolean z22 = this.Q;
        i1.o0 o0Var2 = this.f48058k;
        i1.n0 n0Var = this.l;
        if (p0Var.p()) {
            f2.c0 c0Var5 = w0.f48178u;
            r20 = 0;
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            p0Var2 = p0Var;
            f0Var = new f0(c0Var5, 0L, C.TIME_UNSET, false, true, false);
            r22 = 0;
        } else {
            f2.c0 c0Var6 = w0Var.f48180b;
            Object obj3 = c0Var6.f40307a;
            i1.p0 p0Var4 = w0Var.f48179a;
            boolean zP = p0Var4.p();
            boolean z23 = zP || p0Var4.g(c0Var6.f40307a, n0Var).f42587f;
            long j24 = (w0Var.f48180b.b() || z23) ? w0Var.f48181c : w0Var.f48196s;
            if (g0Var2 != null) {
                c0Var = c0Var6;
                i10 = -1;
                j10 = 1;
                p0Var2 = p0Var;
                Pair pairS = S(p0Var2, g0Var2, true, i12, z22, o0Var2, n0Var);
                if (pairS == null) {
                    iA = p0Var2.a(z22);
                    j19 = j24;
                    z18 = true;
                    z16 = false;
                    z17 = false;
                } else {
                    if (g0Var2.f48034c == C.TIME_UNSET) {
                        iA = p0Var2.g(pairS.first, n0Var).f42584c;
                        jLongValue2 = j24;
                        z15 = false;
                    } else {
                        obj3 = pairS.first;
                        iA = -1;
                        z15 = true;
                        jLongValue2 = ((Long) pairS.second).longValue();
                    }
                    z16 = w0Var.f48183e == 4;
                    z17 = z15;
                    z18 = false;
                    j19 = jLongValue2;
                }
                z12 = z18;
                z11 = z16;
                z13 = z17;
                long j25 = j19;
                o0Var = o0Var2;
                j11 = j25;
            } else {
                c0Var = c0Var6;
                i10 = -1;
                j10 = 1;
                p0Var2 = p0Var;
                if (w0Var.f48179a.p()) {
                    iA = p0Var2.a(z22);
                    o0Var = o0Var2;
                } else if (p0Var2.b(obj3) == -1) {
                    int iT = T(o0Var2, n0Var, i12, z22, obj3, w0Var.f48179a, p0Var2);
                    o0Var = o0Var2;
                    if (iT == -1) {
                        p0Var2 = p0Var2;
                        n0Var = n0Var;
                        iA2 = p0Var2.a(z22);
                        z14 = true;
                    } else {
                        p0Var2 = p0Var2;
                        n0Var = n0Var;
                        iA2 = iT;
                        z14 = false;
                    }
                    z12 = z14;
                    obj3 = obj3;
                    iA = iA2;
                    j12 = j24;
                    z11 = false;
                    z13 = false;
                    j11 = j12;
                } else {
                    o0Var = o0Var2;
                    if (j24 == C.TIME_UNSET) {
                        int i13 = p0Var2.g(obj3, n0Var).f42584c;
                        obj3 = obj3;
                        iA = i13;
                    } else if (z23) {
                        w0Var.f48179a.g(c0Var.f40307a, n0Var);
                        if (w0Var.f48179a.m(n0Var.f42584c, o0Var, 0L).f42628n == w0Var.f48179a.b(c0Var.f40307a)) {
                            Pair pairI = p0Var2.i(o0Var, n0Var, p0Var2.g(obj3, n0Var).f42584c, j24 + n0Var.f42586e);
                            obj3 = pairI.first;
                            jK = ((Long) pairI.second).longValue();
                        } else if (p0Var2.g(obj3, n0Var).f42585d != C.TIME_UNSET) {
                            obj3 = obj3;
                            jK = l1.y.k(j24, 0L, n0Var.f42585d - 1);
                        } else {
                            obj3 = obj3;
                            jK = j24;
                        }
                        j11 = jK;
                        iA = -1;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        obj3 = obj3;
                        iA = -1;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        j12 = j24;
                        z13 = false;
                        j11 = j12;
                    }
                }
                z11 = false;
                z12 = false;
                j12 = j24;
                z13 = false;
                j11 = j12;
            }
            if (iA != i10) {
                Pair pairI2 = p0Var2.i(o0Var, n0Var, iA, C.TIME_UNSET);
                obj3 = pairI2.first;
                j13 = -9223372036854775807L;
                jLongValue = ((Long) pairI2.second).longValue();
            } else {
                jLongValue = j11;
                j13 = j11;
            }
            f2.c0 c0VarP = fz1Var.p(p0Var2, obj3, jLongValue);
            int i14 = c0VarP.f40311e;
            boolean z24 = i14 == i10 || ((i11 = c0Var.f40311e) != i10 && i14 >= i11);
            boolean zEquals = c0Var.f40307a.equals(obj3);
            boolean z25 = zEquals && !c0Var.b() && !c0VarP.b() && z24;
            i1.n0 n0VarG = p0Var2.g(obj3, n0Var);
            if (z23 || j24 != j13) {
                j14 = j13;
            } else {
                Object obj4 = c0Var.f40307a;
                int i15 = c0Var.f40308b;
                long j26 = j13;
                if (obj4.equals(c0VarP.f40307a)) {
                    if (c0Var.b()) {
                        j14 = j26;
                        n0VarG.g(i15);
                    }
                    j14 = j26;
                    j14 = j26;
                    if (c0VarP.b()) {
                        n0VarG.g(c0VarP.f40308b);
                        j14 = j26;
                    }
                }
            }
            f2.c0 c0Var7 = !z25 ? c0VarP : c0Var;
            if (!c0Var7.b()) {
                if (zEquals && c0Var.b()) {
                    i1.a aVarA = p0Var2.g(obj3, n0Var).f42588g.a(c0Var.f40308b);
                    aVarA.getClass();
                    long j27 = w0Var.f48181c;
                    j15 = 0;
                    j15 = 0;
                    j18 = 0;
                    j15 = 0;
                    if (j27 == C.TIME_UNSET || 0 > j27) {
                        int i16 = aVarA.f42490a;
                        int i17 = c0Var.f40309c;
                        if (i16 > i17 && aVarA.f42494e[i17] == 2) {
                            long j28 = p0Var2.g(obj3, n0Var).f42585d;
                            if (j28 != C.TIME_UNSET) {
                                jMin = jLongValue;
                                jMin = Math.min(j28 - j10, jLongValue);
                            }
                            jMin = jLongValue;
                            long j29 = jMin;
                            j17 = j29;
                            j16 = j29;
                        }
                    }
                } else {
                    j15 = 0;
                }
                j16 = jLongValue;
                j17 = j14;
                j18 = j15;
            } else if (c0Var7.equals(c0Var)) {
                j16 = w0Var.f48196s;
                j17 = j14;
                j18 = 0;
            } else {
                p0Var2.g(c0Var7.f40307a, n0Var);
                if (c0Var7.f40309c == n0Var.e(c0Var7.f40308b)) {
                    n0Var.f42588g.getClass();
                }
                j17 = j14;
                j18 = 0;
                j16 = 0;
            }
            f0Var = new f0(c0Var7, j16, j17, z11, z12, z13);
            r20 = zP;
            r22 = j18;
            f10 = j24;
        }
        f2.c0 c0Var8 = f0Var.f48026a;
        ?? r17 = f0Var.f48028c;
        boolean z26 = f0Var.f48029d;
        long jX = f0Var.f48027b;
        boolean z27 = (this.H.f48180b.equals(c0Var8) && jX == this.H.f48196s) ? false : true;
        try {
            if (f0Var.f48030e) {
                try {
                    z19 = true;
                    if (this.H.f48183e != 1) {
                        c4 = 4;
                        try {
                            m0(4);
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = p0Var2;
                            c0Var2 = c0Var8;
                            r21 = z19;
                            f11 = c4;
                            r23 = r17;
                            r12 = 0;
                        }
                    } else {
                        c4 = 4;
                    }
                    O(false, false, false, true);
                } catch (Throwable th3) {
                    th = th3;
                    z19 = true;
                    c4 = 4;
                    r11 = p0Var2;
                    c0Var2 = c0Var8;
                    r21 = z19;
                    f11 = c4;
                    r23 = r17;
                    r12 = 0;
                }
            } else {
                z19 = true;
                c4 = 4;
            }
            uz1[] uz1VarArr = this.f48042a;
            int length = uz1VarArr.length;
            ?? r18 = 0;
            while (r18 < length) {
                try {
                    uz1 uz1Var = uz1VarArr[r18];
                    a aVar = (a) uz1Var.f20972e;
                    if (!Objects.equals(aVar.f47919p, p0Var2)) {
                        aVar.f47919p = p0Var2;
                        aVar.u();
                    }
                    a aVar2 = (a) uz1Var.f20973f;
                    if (aVar2 != null && !Objects.equals(aVar2.f47919p, p0Var2)) {
                        aVar2.f47919p = p0Var2;
                        aVar2.u();
                    }
                    r18++;
                } catch (Throwable th4) {
                    th = th4;
                    r11 = p0Var2;
                    c0Var2 = c0Var8;
                    f11 = c4;
                    r23 = r17;
                    r12 = 0;
                    r21 = 1;
                }
            }
            try {
                if (z27) {
                    r18 = p0Var2;
                    f10 = c4;
                    r22 = r17;
                    g0Var = null;
                    g0Var = null;
                    r14 = 0;
                    r17 = 0;
                    z20 = true;
                    z20 = true;
                    r25 = 1;
                    r20 = 1;
                    if (r18.p()) {
                        r27 = r22;
                        f14 = f10;
                        r27 = r22;
                        f14 = f10;
                        c0Var2 = c0Var8;
                        r26 = r27;
                        f13 = f14;
                    } else {
                        r27 = r22;
                        f14 = f10;
                        try {
                            for (m0 m0Var2 = (m0) this.f48064r.f14617m; m0Var2 != null; m0Var2 = m0Var2.f48121m) {
                                if (m0Var2.f48116g.f48126a.equals(c0Var8)) {
                                    m0Var2.f48116g = this.f48064r.h(r18, m0Var2.f48116g);
                                    m0Var2.k();
                                }
                            }
                            fz1 fz1Var2 = this.f48064r;
                            c0Var2 = c0Var8;
                            try {
                                jX = X(c0Var2, jX, ((m0) fz1Var2.f14617m) != ((m0) fz1Var2.f14618n), z26);
                                r26 = r22;
                                f13 = f10;
                            } catch (Throwable th5) {
                                th = th5;
                                jX = jX;
                                r15 = r18;
                                r24 = r22;
                                f12 = f10;
                                r11 = r15;
                                r12 = r14;
                                r21 = r25;
                                r23 = r24;
                                f11 = f12;
                                w0 w0Var2 = this.H;
                                i1.p0 p0Var5 = w0Var2.f48179a;
                                f2.c0 c0Var9 = w0Var2.f48180b;
                                if (f0Var.f48031f) {
                                    j20 = jX;
                                } else {
                                    j20 = -9223372036854775807L;
                                }
                                c0Var3 = c0Var2;
                                B0(r11, c0Var3, p0Var5, c0Var9, j20, false);
                                if (z27) {
                                    w0 w0Var3 = this.H;
                                    obj = w0Var3.f48180b.f40307a;
                                    i1.p0 p0Var6 = w0Var3.f48179a;
                                    if (z27) {
                                        r10 = 0;
                                    } else {
                                        r10 = 0;
                                    }
                                    if (r10 != 0) {
                                        j21 = jX;
                                    } else {
                                        j21 = this.H.f48182d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r13 = f11;
                                    } else {
                                        r13 = 3;
                                    }
                                    this.H = y(c0Var3, jX, r23, j21, r10, r13);
                                } else {
                                    w0 w0Var4 = this.H;
                                    obj = w0Var4.f48180b.f40307a;
                                    i1.p0 p0Var7 = w0Var4.f48179a;
                                    if (z27) {
                                        r10 = 0;
                                    } else {
                                        r10 = 0;
                                    }
                                    if (r10 != 0) {
                                        j21 = jX;
                                    } else {
                                        j21 = this.H.f48182d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r13 = f11;
                                    } else {
                                        r13 = 3;
                                    }
                                    this.H = y(c0Var3, jX, r23, j21, r10, r13);
                                }
                                P();
                                R(r11, this.H.f48179a);
                                this.H = this.H.j(r11);
                                if (!r11.p()) {
                                    this.V = r12;
                                }
                                u(false);
                                this.f48055h.e(2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c0Var2 = c0Var8;
                            r15 = r18;
                            r14 = r17;
                            r25 = r20;
                            r24 = r22;
                            f12 = f10;
                            r11 = r15;
                            r12 = r14;
                            r21 = r25;
                            r23 = r24;
                            f11 = f12;
                            w0 w0Var5 = this.H;
                            i1.p0 p0Var8 = w0Var5.f48179a;
                            f2.c0 c0Var10 = w0Var5.f48180b;
                            if (f0Var.f48031f) {
                                j20 = jX;
                            } else {
                                j20 = -9223372036854775807L;
                            }
                            c0Var3 = c0Var2;
                            B0(r11, c0Var3, p0Var8, c0Var10, j20, false);
                            if (z27) {
                                w0 w0Var6 = this.H;
                                obj = w0Var6.f48180b.f40307a;
                                i1.p0 p0Var9 = w0Var6.f48179a;
                                if (z27) {
                                    r10 = 0;
                                } else {
                                    r10 = 0;
                                }
                                if (r10 != 0) {
                                    j21 = jX;
                                } else {
                                    j21 = this.H.f48182d;
                                }
                                if (r11.b(obj) == -1) {
                                    r13 = f11;
                                } else {
                                    r13 = 3;
                                }
                                this.H = y(c0Var3, jX, r23, j21, r10, r13);
                            } else {
                                w0 w0Var7 = this.H;
                                obj = w0Var7.f48180b.f40307a;
                                i1.p0 p0Var10 = w0Var7.f48179a;
                                if (z27) {
                                    r10 = 0;
                                } else {
                                    r10 = 0;
                                }
                                if (r10 != 0) {
                                    j21 = jX;
                                } else {
                                    j21 = this.H.f48182d;
                                }
                                if (r11.b(obj) == -1) {
                                    r13 = f11;
                                } else {
                                    r13 = 3;
                                }
                                this.H = y(c0Var3, jX, r23, j21, r10, r13);
                            }
                            P();
                            R(r11, this.H.f48179a);
                            this.H = this.H.j(r11);
                            if (!r11.p()) {
                                this.V = r12;
                            }
                            u(false);
                            this.f48055h.e(2);
                            throw th;
                        }
                    }
                    w0 w0Var8 = this.H;
                    i1.p0 p0Var11 = w0Var8.f48179a;
                    f2.c0 c0Var11 = w0Var8.f48180b;
                    if (f0Var.f48031f) {
                        j22 = jX;
                    } else {
                        j22 = -9223372036854775807L;
                    }
                    c0Var4 = c0Var2;
                    B0(p0Var, c0Var4, p0Var11, c0Var11, j22, false);
                    if (z27) {
                        w0 w0Var9 = this.H;
                        obj2 = w0Var9.f48180b.f40307a;
                        i1.p0 p0Var12 = w0Var9.f48179a;
                        if (z27) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            j23 = jX;
                        } else {
                            j23 = this.H.f48182d;
                        }
                        if (p0Var.b(obj2) == -1) {
                            r16 = f13;
                        } else {
                            r16 = 3;
                        }
                        this.H = y(c0Var4, jX, r26, j23, z21, r16);
                    } else {
                        w0 w0Var10 = this.H;
                        obj2 = w0Var10.f48180b.f40307a;
                        i1.p0 p0Var13 = w0Var10.f48179a;
                        if (z27) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            j23 = jX;
                        } else {
                            j23 = this.H.f48182d;
                        }
                        if (p0Var.b(obj2) == -1) {
                            r16 = f13;
                        } else {
                            r16 = 3;
                        }
                        this.H = y(c0Var4, jX, r26, j23, z21, r16);
                    }
                    P();
                    R(p0Var, this.H.f48179a);
                    this.H = this.H.j(p0Var);
                    if (!p0Var.p()) {
                        this.V = g0Var;
                    }
                    u(false);
                    this.f48055h.e(2);
                    return;
                }
                try {
                    try {
                        m0 m0Var3 = (m0) this.f48064r.f14618n;
                        ?? N = m0Var3 == null ? r22 : n(m0Var3);
                        ?? N2 = (!d() || (m0Var = (m0) this.f48064r.f14619o) == null) ? r22 : n(m0Var);
                        try {
                            char c5 = c4;
                            try {
                                f10 = c5;
                                r22 = r17;
                                r17 = 0;
                                g0Var = null;
                                g0Var = null;
                                g0Var = null;
                                r20 = 1;
                                z20 = true;
                                z20 = true;
                                z20 = true;
                                try {
                                    int iS = this.f48064r.s(p0Var, this.W, N, N2);
                                    if ((iS & 1) != 0) {
                                        V(false);
                                        r27 = r22;
                                        f14 = f10;
                                    } else if ((iS & 2) != 0) {
                                        r27 = r22;
                                        f14 = f10;
                                        f();
                                        r27 = r22;
                                        f14 = f10;
                                    }
                                    r27 = r22;
                                    f14 = f10;
                                    r27 = r22;
                                    f14 = f10;
                                    c0Var2 = c0Var8;
                                    r26 = r27;
                                    f13 = f14;
                                    w0 w0Var11 = this.H;
                                    i1.p0 p0Var14 = w0Var11.f48179a;
                                    f2.c0 c0Var12 = w0Var11.f48180b;
                                    if (f0Var.f48031f) {
                                        j22 = jX;
                                    } else {
                                        j22 = -9223372036854775807L;
                                    }
                                    c0Var4 = c0Var2;
                                    B0(p0Var, c0Var4, p0Var14, c0Var12, j22, false);
                                    if (z27 || r26 != this.H.f48181c) {
                                        w0 w0Var12 = this.H;
                                        obj2 = w0Var12.f48180b.f40307a;
                                        i1.p0 p0Var15 = w0Var12.f48179a;
                                        if (z27 || !z10 || p0Var15.p() || p0Var15.g(obj2, this.l).f42587f) {
                                            z21 = false;
                                        } else {
                                            z21 = z20;
                                        }
                                        if (z21) {
                                            j23 = jX;
                                        } else {
                                            j23 = this.H.f48182d;
                                        }
                                        if (p0Var.b(obj2) == -1) {
                                            r16 = f13;
                                        } else {
                                            r16 = 3;
                                        }
                                        this.H = y(c0Var4, jX, r26, j23, z21, r16);
                                    }
                                    P();
                                    R(p0Var, this.H.f48179a);
                                    this.H = this.H.j(p0Var);
                                    if (!p0Var.p()) {
                                        this.V = g0Var;
                                    }
                                    u(false);
                                    this.f48055h.e(2);
                                    return;
                                } catch (Throwable th7) {
                                    th = th7;
                                    r18 = p0Var;
                                    c0Var2 = c0Var8;
                                    r15 = r18;
                                    r14 = r17;
                                    r25 = r20;
                                    r24 = r22;
                                    f12 = f10;
                                    r11 = r15;
                                    r12 = r14;
                                    r21 = r25;
                                    r23 = r24;
                                    f11 = f12;
                                    w0 w0Var13 = this.H;
                                    i1.p0 p0Var16 = w0Var13.f48179a;
                                    f2.c0 c0Var13 = w0Var13.f48180b;
                                    if (f0Var.f48031f) {
                                        j20 = jX;
                                    } else {
                                        j20 = -9223372036854775807L;
                                    }
                                    c0Var3 = c0Var2;
                                    B0(r11, c0Var3, p0Var16, c0Var13, j20, false);
                                    if (z27) {
                                        w0 w0Var14 = this.H;
                                        obj = w0Var14.f48180b.f40307a;
                                        i1.p0 p0Var17 = w0Var14.f48179a;
                                        if (z27) {
                                            r10 = 0;
                                        } else {
                                            r10 = 0;
                                        }
                                        if (r10 != 0) {
                                            j21 = jX;
                                        } else {
                                            j21 = this.H.f48182d;
                                        }
                                        if (r11.b(obj) == -1) {
                                            r13 = f11;
                                        } else {
                                            r13 = 3;
                                        }
                                        this.H = y(c0Var3, jX, r23, j21, r10, r13);
                                    } else {
                                        w0 w0Var15 = this.H;
                                        obj = w0Var15.f48180b.f40307a;
                                        i1.p0 p0Var18 = w0Var15.f48179a;
                                        if (z27) {
                                            r10 = 0;
                                        } else {
                                            r10 = 0;
                                        }
                                        if (r10 != 0) {
                                            j21 = jX;
                                        } else {
                                            j21 = this.H.f48182d;
                                        }
                                        if (r11.b(obj) == -1) {
                                            r13 = f11;
                                        } else {
                                            r13 = 3;
                                        }
                                        this.H = y(c0Var3, jX, r23, j21, r10, r13);
                                    }
                                    P();
                                    R(r11, this.H.f48179a);
                                    this.H = this.H.j(r11);
                                    if (!r11.p()) {
                                        this.V = r12;
                                    }
                                    u(false);
                                    this.f48055h.e(2);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                r18 = p0Var;
                                f10 = c5;
                                r22 = r17;
                                r17 = 0;
                                r20 = 1;
                                c0Var2 = c0Var8;
                                r15 = r18;
                                r14 = r17;
                                r25 = r20;
                                r24 = r22;
                                f12 = f10;
                                r11 = r15;
                                r12 = r14;
                                r21 = r25;
                                r23 = r24;
                                f11 = f12;
                                w0 w0Var16 = this.H;
                                i1.p0 p0Var19 = w0Var16.f48179a;
                                f2.c0 c0Var14 = w0Var16.f48180b;
                                if (f0Var.f48031f) {
                                    j20 = jX;
                                } else {
                                    j20 = -9223372036854775807L;
                                }
                                c0Var3 = c0Var2;
                                B0(r11, c0Var3, p0Var19, c0Var14, j20, false);
                                if (z27) {
                                    w0 w0Var17 = this.H;
                                    obj = w0Var17.f48180b.f40307a;
                                    i1.p0 p0Var110 = w0Var17.f48179a;
                                    if (z27) {
                                        r10 = 0;
                                    } else {
                                        r10 = 0;
                                    }
                                    if (r10 != 0) {
                                        j21 = jX;
                                    } else {
                                        j21 = this.H.f48182d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r13 = f11;
                                    } else {
                                        r13 = 3;
                                    }
                                    this.H = y(c0Var3, jX, r23, j21, r10, r13);
                                } else {
                                    w0 w0Var18 = this.H;
                                    obj = w0Var18.f48180b.f40307a;
                                    i1.p0 p0Var111 = w0Var18.f48179a;
                                    if (z27) {
                                        r10 = 0;
                                    } else {
                                        r10 = 0;
                                    }
                                    if (r10 != 0) {
                                        j21 = jX;
                                    } else {
                                        j21 = this.H.f48182d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r13 = f11;
                                    } else {
                                        r13 = 3;
                                    }
                                    this.H = y(c0Var3, jX, r23, j21, r10, r13);
                                }
                                P();
                                R(r11, this.H.f48179a);
                                this.H = this.H.j(r11);
                                if (!r11.p()) {
                                    this.V = r12;
                                }
                                u(false);
                                this.f48055h.e(2);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            p0Var3 = p0Var;
                            f10 = c4;
                            r18 = p0Var3;
                            r22 = r17;
                            r17 = 0;
                            r20 = 1;
                            c0Var2 = c0Var8;
                            r15 = r18;
                            r14 = r17;
                            r25 = r20;
                            r24 = r22;
                            f12 = f10;
                            r11 = r15;
                            r12 = r14;
                            r21 = r25;
                            r23 = r24;
                            f11 = f12;
                            w0 w0Var19 = this.H;
                            i1.p0 p0Var112 = w0Var19.f48179a;
                            f2.c0 c0Var15 = w0Var19.f48180b;
                            if (f0Var.f48031f) {
                                j20 = jX;
                            } else {
                                j20 = -9223372036854775807L;
                            }
                            c0Var3 = c0Var2;
                            B0(r11, c0Var3, p0Var112, c0Var15, j20, false);
                            if (z27) {
                                w0 w0Var110 = this.H;
                                obj = w0Var110.f48180b.f40307a;
                                i1.p0 p0Var113 = w0Var110.f48179a;
                                if (z27) {
                                    r10 = 0;
                                } else {
                                    r10 = 0;
                                }
                                if (r10 != 0) {
                                    j21 = jX;
                                } else {
                                    j21 = this.H.f48182d;
                                }
                                if (r11.b(obj) == -1) {
                                    r13 = f11;
                                } else {
                                    r13 = 3;
                                }
                                this.H = y(c0Var3, jX, r23, j21, r10, r13);
                            } else {
                                w0 w0Var111 = this.H;
                                obj = w0Var111.f48180b.f40307a;
                                i1.p0 p0Var114 = w0Var111.f48179a;
                                if (z27) {
                                    r10 = 0;
                                } else {
                                    r10 = 0;
                                }
                                if (r10 != 0) {
                                    j21 = jX;
                                } else {
                                    j21 = this.H.f48182d;
                                }
                                if (r11.b(obj) == -1) {
                                    r13 = f11;
                                } else {
                                    r13 = 3;
                                }
                                this.H = y(c0Var3, jX, r23, j21, r10, r13);
                            }
                            P();
                            R(r11, this.H.f48179a);
                            this.H = this.H.j(r11);
                            if (!r11.p()) {
                                this.V = r12;
                            }
                            u(false);
                            this.f48055h.e(2);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        r18 = p0Var2;
                        f10 = c4;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    p0Var3 = p0Var2;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            r11 = p0Var2;
            c0Var2 = c0Var8;
            r23 = r17;
            r12 = 0;
            r21 = 1;
            f11 = 5.6E-45f;
        }
        w0 w0Var112 = this.H;
        i1.p0 p0Var115 = w0Var112.f48179a;
        f2.c0 c0Var16 = w0Var112.f48180b;
        if (f0Var.f48031f) {
            j20 = jX;
        } else {
            j20 = -9223372036854775807L;
        }
        c0Var3 = c0Var2;
        B0(r11, c0Var3, p0Var115, c0Var16, j20, false);
        if (z27 || r23 != this.H.f48181c) {
            w0 w0Var113 = this.H;
            obj = w0Var113.f48180b.f40307a;
            i1.p0 p0Var116 = w0Var113.f48179a;
            if (z27 || !z10 || p0Var116.p() || p0Var116.g(obj, this.l).f42587f) {
                r10 = 0;
            } else {
                r10 = r21;
            }
            if (r10 != 0) {
                j21 = jX;
            } else {
                j21 = this.H.f48182d;
            }
            if (r11.b(obj) == -1) {
                r13 = f11;
            } else {
                r13 = 3;
            }
            this.H = y(c0Var3, jX, r23, j21, r10, r13);
        }
        P();
        R(r11, this.H.f48179a);
        this.H = this.H.j(r11);
        if (!r11.p()) {
            this.V = r12;
        }
        u(false);
        this.f48055h.e(2);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [f2.e1, java.lang.Object] */
    public final void v0() {
        m0 m0Var = (m0) this.f48064r.f14620p;
        boolean z10 = this.O || (m0Var != null && m0Var.f48110a.isLoading());
        w0 w0Var = this.H;
        if (z10 != w0Var.f48185g) {
            this.H = w0Var.b(z10);
        }
    }

    public final void w(f2.a0 a0Var) {
        m0 m0Var;
        h0 h0Var;
        fz1 fz1Var = this.f48064r;
        m0 m0Var2 = (m0) fz1Var.f14620p;
        sr0 sr0Var = this.f48060n;
        if (m0Var2 != null && m0Var2.f48110a == a0Var) {
            m0Var2.getClass();
            if (!m0Var2.f48114e) {
                float f10 = sr0Var.getPlaybackParameters().f42544a;
                w0 w0Var = this.H;
                m0Var2.f(f10, w0Var.f48179a, w0Var.l);
            }
            w0(m0Var2.f48116g.f48126a, m0Var2.f48123o);
            if (m0Var2 == ((m0) fz1Var.f14617m)) {
                Q(m0Var2.f48116g.f48127b, true);
                l(new boolean[this.f48042a.length], ((m0) fz1Var.f14618n).e());
                m0Var2.f48117h = true;
                w0 w0Var2 = this.H;
                f2.c0 c0Var = w0Var2.f48180b;
                long j10 = m0Var2.f48116g.f48127b;
                h0Var = this;
                h0Var.H = y(c0Var, j10, w0Var2.f48181c, j10, false, 5);
            } else {
                h0Var = this;
            }
            h0Var.C();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= fz1Var.f14612g.size()) {
                m0Var = null;
                break;
            }
            m0Var = (m0) fz1Var.f14612g.get(i10);
            if (m0Var.f48110a == a0Var) {
                break;
            } else {
                i10++;
            }
        }
        if (m0Var != null) {
            go.k.t(!m0Var.f48114e);
            float f11 = sr0Var.getPlaybackParameters().f42544a;
            w0 w0Var3 = this.H;
            m0Var.f(f11, w0Var3.f48179a, w0Var3.l);
            m0 m0Var3 = (m0) fz1Var.f14621q;
            if (m0Var3 == null || m0Var3.f48110a != a0Var) {
                return;
            }
            D();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    public final void w0(f2.c0 c0Var, i2.v vVar) {
        boolean z10;
        m0 m0Var = (m0) this.f48064r.f14620p;
        m0Var.getClass();
        p(m0Var.d());
        if (r0(this.H.f48179a, m0Var.f48116g.f48126a)) {
            long j10 = this.f48066t.f47988h;
        }
        i1.p0 p0Var = this.H.f48179a;
        float f10 = this.f48060n.getPlaybackParameters().f42544a;
        boolean z11 = this.H.l;
        i2.r[] rVarArr = vVar.f42839c;
        f fVar = (f) this.f48052f;
        fVar.getClass();
        oa.o0 o0Var = fVar.f48023o;
        q1.j jVar = this.f48068v;
        Integer num = (Integer) o0Var.get(jVar.f48580a);
        int iIntValue = (num == null || num.intValue() == -1) ? fVar.l : num.intValue();
        e eVar = (e) fVar.f48024p.get(jVar);
        eVar.getClass();
        if (iIntValue == -1) {
            i1.v vVar2 = p0Var.m(p0Var.g(c0Var.f40307a, fVar.f48011b).f42584c, fVar.f48010a, 0L).f42618c.f42714b;
            if (vVar2 == null) {
                z10 = false;
            } else {
                String scheme = vVar2.f42704a.getScheme();
                if (TextUtils.isEmpty(scheme) || f.f48009r.contains(scheme)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            int length = rVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 < length) {
                    i2.r rVar = rVarArr[i10];
                    if (rVar != null) {
                        switch (rVar.getTrackGroup().f42661c) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = z10 ? 19660800 : 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            case 4:
                                i12 = 26214400;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iIntValue = l1.y.j(i11, C.DEFAULT_VIDEO_BUFFER_SIZE, 210239488);
                }
            }
        }
        eVar.f47999c = iIntValue;
        fVar.c();
    }

    public final void x(i1.g0 g0Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.I.d(1);
            }
            this.H = this.H.g(g0Var);
        }
        float f11 = g0Var.f42544a;
        m0 m0Var = (m0) this.f48064r.f14617m;
        while (true) {
            i10 = 0;
            if (m0Var == null) {
                break;
            }
            i2.r[] rVarArr = m0Var.f48123o.f42839c;
            int length = rVarArr.length;
            while (i10 < length) {
                i2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.onPlaybackSpeed(f11);
                }
                i10++;
            }
            m0Var = m0Var.f48121m;
        }
        uz1[] uz1VarArr = this.f48042a;
        int length2 = uz1VarArr.length;
        while (i10 < length2) {
            uz1 uz1Var = uz1VarArr[i10];
            float f12 = g0Var.f42544a;
            ((a) uz1Var.f20972e).z(f10, f12);
            a aVar = (a) uz1Var.f20973f;
            if (aVar != null) {
                aVar.z(f10, f12);
            }
            i10++;
        }
    }

    public final void x0(int i10, int i11, List list) throws Throwable {
        this.I.d(1);
        lo0 lo0Var = this.f48065s;
        lo0Var.getClass();
        ArrayList arrayList = (ArrayList) lo0Var.f17082c;
        go.k.i(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        go.k.i(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((v0) arrayList.get(i12)).f48171a.w((i1.y) list.get(i12 - i10));
        }
        v(lo0Var.b(), false);
    }

    public final w0 y(f2.c0 c0Var, long j10, long j11, long j12, boolean z10, int i10) {
        n1 n1VarG;
        boolean z11;
        this.Z = (!this.Z && j10 == this.H.f48196s && c0Var.equals(this.H.f48180b)) ? false : true;
        P();
        w0 w0Var = this.H;
        k1 k1Var = w0Var.f48186h;
        i2.v vVar = w0Var.f48187i;
        List list = w0Var.f48188j;
        if (this.f48065s.f17080a) {
            m0 m0Var = (m0) this.f48064r.f14617m;
            k1Var = m0Var == null ? k1.f40385d : m0Var.f48122n;
            vVar = m0Var == null ? this.f48050e : m0Var.f48123o;
            i2.r[] rVarArr = vVar.f42839c;
            oa.e0 e0Var = new oa.e0(4);
            boolean z12 = false;
            for (i2.r rVar : rVarArr) {
                if (rVar != null) {
                    i1.c0 c0Var2 = rVar.getFormat(0).l;
                    if (c0Var2 == null) {
                        e0Var.b(new i1.c0(new i1.b0[0]));
                    } else {
                        e0Var.b(c0Var2);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                n1VarG = e0Var.g();
            } else {
                oa.f0 f0Var = oa.j0.f47265b;
                n1VarG = n1.f47281e;
            }
            list = n1VarG;
            if (m0Var != null) {
                n0 n0Var = m0Var.f48116g;
                if (n0Var.f48128c != j11) {
                    m0Var.f48116g = n0Var.a(j11);
                }
            }
            uz1[] uz1VarArr = this.f48042a;
            fz1 fz1Var = this.f48064r;
            m0 m0Var2 = (m0) fz1Var.f14617m;
            if (m0Var2 == ((m0) fz1Var.f14618n) && m0Var2 != null) {
                i2.v vVar2 = m0Var2.f48123o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= uz1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (vVar2.b(i11)) {
                        if (((a) uz1VarArr[i11].f20972e).f47906b != 1) {
                            z11 = false;
                            break;
                        }
                        if (vVar2.f42838b[i11].f47979a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.T) {
                    this.T = z14;
                    if (!z14 && this.H.f48193p) {
                        this.f48055h.e(2);
                    }
                }
            }
        } else if (!c0Var.equals(w0Var.f48180b)) {
            k1Var = k1.f40385d;
            vVar = this.f48050e;
            list = n1.f47281e;
        }
        i2.v vVar3 = vVar;
        List list2 = list;
        k1 k1Var2 = k1Var;
        if (z10) {
            androidx.recyclerview.widget.w wVar = this.I;
            if (!wVar.f4946d || wVar.f4947e == 5) {
                wVar.f4944b = true;
                wVar.f4946d = true;
                wVar.f4947e = i10;
            } else {
                go.k.i(i10 == 5);
            }
        }
        w0 w0Var2 = this.H;
        return w0Var2.d(c0Var, j10, j11, j12, p(w0Var2.f48194q), k1Var2, vVar3, list2);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:206:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:231:0x041a  */
    /* JADX WARN: Code duplicated, block: B:244:0x043c  */
    /* JADX WARN: Code duplicated, block: B:324:0x0575  */
    /* JADX WARN: Type inference failed for: r1v52, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [f2.a0, java.lang.Object] */
    public final void y0() {
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        boolean z10;
        boolean z11;
        i2.v vVar;
        m0 m0Var4;
        m0 m0Var5;
        m0 m0Var6;
        i2.v vVar2;
        int length;
        int i10;
        a aVar;
        boolean zB;
        a aVar2;
        byte b10;
        int i11;
        int i12;
        m0 m0Var7;
        m0 m0Var8;
        boolean z12;
        int i13;
        if (this.H.f48179a.p() || !this.f48065s.f17080a) {
            return;
        }
        this.f48064r.m(this.W);
        fz1 fz1Var = this.f48064r;
        m0 m0Var9 = (m0) fz1Var.f14620p;
        long j10 = C.TIME_UNSET;
        if (m0Var9 == null || (!m0Var9.f48116g.f48135j && m0Var9.g() && ((m0) fz1Var.f14620p).f48116g.f48130e != C.TIME_UNSET && fz1Var.f14609d < 100)) {
            fz1 fz1Var2 = this.f48064r;
            long j11 = this.W;
            w0 w0Var = this.H;
            m0 m0Var10 = (m0) fz1Var2.f14620p;
            n0 n0VarD = m0Var10 == null ? fz1Var2.d(w0Var.f48179a, w0Var.f48180b, w0Var.f48181c, w0Var.f48196s) : fz1Var2.c(w0Var.f48179a, m0Var10, j11);
            if (n0VarD != null) {
                fz1 fz1Var3 = this.f48064r;
                m0 m0Var11 = (m0) fz1Var3.f14620p;
                long j12 = m0Var11 == null ? 1000000000000L : (m0Var11.f48124p + m0Var11.f48116g.f48130e) - n0VarD.f48127b;
                int i14 = 0;
                while (true) {
                    if (i14 >= fz1Var3.f14612g.size()) {
                        m0Var = null;
                        break;
                    }
                    n0 n0Var = ((m0) fz1Var3.f14612g.get(i14)).f48116g;
                    long j13 = n0Var.f48130e;
                    long j14 = n0VarD.f48130e;
                    if ((j13 == C.TIME_UNSET || j13 == j14) && n0Var.f48127b == n0VarD.f48127b && n0Var.f48126a.equals(n0VarD.f48126a)) {
                        m0Var = (m0) fz1Var3.f14612g.remove(i14);
                        break;
                    }
                    i14++;
                }
                if (m0Var == null) {
                    h0 h0Var = (h0) ((k3.j) fz1Var3.l).f44293b;
                    a[] aVarArr = h0Var.f48044b;
                    i2.u uVar = h0Var.f48048d;
                    j0 j0Var = h0Var.f48052f;
                    q1.j jVar = h0Var.f48068v;
                    f fVar = (f) j0Var;
                    fVar.getClass();
                    v9.e eVar = new v9.e(fVar, jVar);
                    lo0 lo0Var = h0Var.f48065s;
                    i2.v vVar3 = h0Var.f48050e;
                    h0Var.f48047c0.getClass();
                    m0Var = new m0(aVarArr, j12, uVar, eVar, lo0Var, n0VarD, vVar3);
                } else {
                    m0Var.f48116g = n0VarD;
                    m0Var.f48124p = j12;
                }
                m0 m0Var12 = (m0) fz1Var3.f14620p;
                if (m0Var12 == null) {
                    fz1Var3.f14617m = m0Var;
                    fz1Var3.f14618n = m0Var;
                    fz1Var3.f14619o = m0Var;
                } else if (m0Var != m0Var12.f48121m) {
                    m0Var12.b();
                    m0Var12.f48121m = m0Var;
                    m0Var12.c();
                }
                fz1Var3.f14610e = null;
                fz1Var3.f14620p = m0Var;
                fz1Var3.f14609d++;
                fz1Var3.l();
                if (!m0Var.f48113d) {
                    long j15 = n0VarD.f48127b;
                    m0Var.f48113d = true;
                    m0Var.f48110a.e(this, j15);
                } else if (m0Var.f48114e) {
                    this.f48055h.a(8, m0Var.f48110a).b();
                }
                if (((m0) this.f48064r.f14617m) == m0Var) {
                    Q(n0VarD.f48127b, true);
                }
                u(false);
            } else {
                j10 = -9223372036854775807L;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.O) {
            this.O = z((m0) this.f48064r.f14620p);
            v0();
        } else {
            C();
        }
        fz1 fz1Var4 = this.f48064r;
        if (!this.L && this.f48071y && !this.f48051e0 && !d() && (m0Var7 = (m0) fz1Var4.f14619o) != null && m0Var7 == ((m0) fz1Var4.f14618n) && (m0Var8 = m0Var7.f48121m) != null && (z12 = m0Var8.f48114e)) {
            go.k.t(z12);
            if (((long) ((m0Var8.e() - this.W) / this.f48060n.getPlaybackParameters().f42544a)) <= 10000000) {
                m0 m0Var13 = (m0) fz1Var4.f14619o;
                m0Var13.getClass();
                fz1Var4.f14619o = m0Var13.f48121m;
                fz1Var4.l();
                ((m0) fz1Var4.f14619o).getClass();
                uz1[] uz1VarArr = this.f48042a;
                m0 m0Var14 = (m0) fz1Var4.f14619o;
                if (m0Var14 != null) {
                    i2.v vVar4 = m0Var14.f48123o;
                    for (int i15 = 0; i15 < uz1VarArr.length; i15++) {
                        if (vVar4.b(i15)) {
                            uz1 uz1Var = uz1VarArr[i15];
                            if (((a) uz1Var.f20973f) != null && !uz1Var.f()) {
                                uz1 uz1Var2 = uz1VarArr[i15];
                                go.k.t(!uz1Var2.f());
                                if (uz1.h((a) uz1Var2.f20972e)) {
                                    i13 = 3;
                                } else {
                                    a aVar3 = (a) uz1Var2.f20973f;
                                    i13 = (aVar3 == null || aVar3.f47912h == 0) ? 2 : 4;
                                }
                                uz1Var2.f20971d = i13;
                                k(m0Var14, i15, false, m0Var14.e());
                            }
                        }
                    }
                    if (d()) {
                        this.f48049d0 = m0Var14.f48110a.readDiscontinuity();
                        if (!m0Var14.g()) {
                            fz1Var4.n(m0Var14);
                            u(false);
                            C();
                        }
                    }
                }
            }
        }
        boolean z13 = this.f48071y;
        uz1[] uz1VarArr2 = this.f48042a;
        fz1 fz1Var5 = this.f48064r;
        m0 m0Var15 = (m0) fz1Var5.f14618n;
        if (m0Var15 != null) {
            if (m0Var15.f48121m == null || this.L) {
                if (m0Var15.f48116g.f48135j || this.L) {
                    for (uz1 uz1Var3 : uz1VarArr2) {
                        if (uz1Var3.d(m0Var15) != null) {
                            a aVarD = uz1Var3.d(m0Var15);
                            aVarD.getClass();
                            if (aVarD.i()) {
                                long j16 = m0Var15.f48116g.f48130e;
                                long j17 = (j16 == C.TIME_UNSET || j16 == Long.MIN_VALUE) ? -9223372036854775807L : j16 + m0Var15.f48124p;
                                a aVarD2 = uz1Var3.d(m0Var15);
                                aVarD2.getClass();
                                uz1.l(aVarD2, j17);
                            }
                        }
                    }
                }
            } else if (m0Var15.f48114e) {
                int i16 = 0;
                while (true) {
                    if (i16 >= uz1VarArr2.length) {
                        if (!d() || ((m0) fz1Var5.f14619o) != ((m0) fz1Var5.f14618n)) {
                            m0 m0Var16 = m0Var15.f48121m;
                            if (!m0Var16.f48114e && this.W < m0Var16.e()) {
                                break;
                            }
                            m0 m0Var17 = m0Var15.f48121m;
                            boolean z14 = m0Var17.f48114e;
                            if (!z14) {
                                vVar = m0Var15.f48123o;
                                m0Var4 = (m0) fz1Var5.f14619o;
                                m0Var5 = (m0) fz1Var5.f14618n;
                                if (m0Var4 == m0Var5) {
                                    m0Var5.getClass();
                                    fz1Var5.f14619o = m0Var5.f48121m;
                                }
                                m0 m0Var18 = (m0) fz1Var5.f14618n;
                                m0Var18.getClass();
                                fz1Var5.f14618n = m0Var18.f48121m;
                                fz1Var5.l();
                                m0Var6 = (m0) fz1Var5.f14618n;
                                m0Var6.getClass();
                                vVar2 = m0Var6.f48123o;
                                i1.p0 p0Var = this.H.f48179a;
                                B0(p0Var, m0Var6.f48116g.f48126a, p0Var, m0Var15.f48116g.f48126a, C.TIME_UNSET, false);
                                if (m0Var6.f48114e) {
                                    length = uz1VarArr2.length;
                                    for (i10 = 0; i10 < length; i10++) {
                                        uz1 uz1Var4 = uz1VarArr2[i10];
                                        long jE = m0Var6.e();
                                        aVar = (a) uz1Var4.f20972e;
                                        int i17 = uz1Var4.f20970c;
                                        zB = vVar.b(i17);
                                        boolean zB2 = vVar2.b(i17);
                                        aVar2 = (a) uz1Var4.f20973f;
                                        if (aVar2 != null) {
                                            aVar2 = aVar;
                                        } else {
                                            aVar2 = aVar;
                                        }
                                        if (zB) {
                                            b10 = -2;
                                        } else {
                                            b10 = -2;
                                        }
                                    }
                                    break;
                                    break;
                                }
                                length = uz1VarArr2.length;
                                while (i10 < length) {
                                    uz1 uz1Var5 = uz1VarArr2[i10];
                                    long jE2 = m0Var6.e();
                                    aVar = (a) uz1Var5.f20972e;
                                    int i18 = uz1Var5.f20970c;
                                    zB = vVar.b(i18);
                                    boolean zB3 = vVar2.b(i18);
                                    aVar2 = (a) uz1Var5.f20973f;
                                    if (aVar2 != null) {
                                        aVar2 = aVar;
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    if (zB) {
                                        b10 = -2;
                                    } else {
                                        b10 = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            go.k.t(z14);
                            if (((long) ((m0Var17.e() - this.W) / this.f48060n.getPlaybackParameters().f42544a)) > 10000000) {
                                break;
                            }
                            vVar = m0Var15.f48123o;
                            m0Var4 = (m0) fz1Var5.f14619o;
                            m0Var5 = (m0) fz1Var5.f14618n;
                            if (m0Var4 == m0Var5) {
                                m0Var5.getClass();
                                fz1Var5.f14619o = m0Var5.f48121m;
                            }
                            m0 m0Var19 = (m0) fz1Var5.f14618n;
                            m0Var19.getClass();
                            fz1Var5.f14618n = m0Var19.f48121m;
                            fz1Var5.l();
                            m0Var6 = (m0) fz1Var5.f14618n;
                            m0Var6.getClass();
                            vVar2 = m0Var6.f48123o;
                            i1.p0 p0Var2 = this.H.f48179a;
                            B0(p0Var2, m0Var6.f48116g.f48126a, p0Var2, m0Var15.f48116g.f48126a, C.TIME_UNSET, false);
                            if (m0Var6.f48114e && ((z13 && this.f48049d0 != j10) || m0Var6.f48110a.readDiscontinuity() != j10)) {
                                this.f48049d0 = j10;
                                boolean z15 = z13 && !this.f48051e0;
                                if (z15) {
                                    for (int i19 = 0; i19 < uz1VarArr2.length; i19++) {
                                        boolean zB4 = vVar2.b(i19);
                                        i2.r[] rVarArr = vVar2.f42839c;
                                        if (zB4 && ((a) uz1VarArr2[i19].f20972e).f47906b != -2 && !i1.d0.a(rVarArr[i19].getSelectedFormat().f42643n, rVarArr[i19].getSelectedFormat().f42641k) && !uz1VarArr2[i19].f()) {
                                            z15 = false;
                                            break;
                                        }
                                    }
                                }
                                if (!z15) {
                                    long jE3 = m0Var6.e();
                                    for (uz1 uz1Var6 : uz1VarArr2) {
                                        a aVar4 = (a) uz1Var6.f20973f;
                                        a aVar5 = (a) uz1Var6.f20972e;
                                        if (uz1.h(aVar5) && (i12 = uz1Var6.f20971d) != 4 && i12 != 2) {
                                            uz1.l(aVar5, jE3);
                                        }
                                        if (aVar4 != null) {
                                            if ((aVar4.f47912h != 0) && uz1Var6.f20971d != 3) {
                                                uz1.l(aVar4, jE3);
                                            }
                                        }
                                    }
                                    if (!m0Var6.g()) {
                                        fz1Var5.n(m0Var6);
                                        u(false);
                                        C();
                                        break;
                                    }
                                    break;
                                }
                                length = uz1VarArr2.length;
                                while (i10 < length) {
                                    uz1 uz1Var7 = uz1VarArr2[i10];
                                    long jE4 = m0Var6.e();
                                    aVar = (a) uz1Var7.f20972e;
                                    int i110 = uz1Var7.f20970c;
                                    zB = vVar.b(i110);
                                    boolean zB5 = vVar2.b(i110);
                                    aVar2 = (a) uz1Var7.f20973f;
                                    if (aVar2 != null) {
                                        aVar2 = aVar;
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    if (zB) {
                                        b10 = -2;
                                    } else {
                                        b10 = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            length = uz1VarArr2.length;
                            while (i10 < length) {
                                uz1 uz1Var8 = uz1VarArr2[i10];
                                long jE5 = m0Var6.e();
                                aVar = (a) uz1Var8.f20972e;
                                int i111 = uz1Var8.f20970c;
                                zB = vVar.b(i111);
                                boolean zB6 = vVar2.b(i111);
                                aVar2 = (a) uz1Var8.f20973f;
                                if (aVar2 != null || (i11 = uz1Var8.f20971d) == 3 || (i11 == 0 && uz1.h(aVar))) {
                                    aVar2 = aVar;
                                }
                                if (zB || aVar2.f47917n) {
                                    b10 = -2;
                                } else {
                                    int i20 = aVar.f47906b;
                                    b10 = -2;
                                    boolean z16 = i20 == -2;
                                    c1 c1Var = vVar.f42838b[i111];
                                    c1 c1Var2 = vVar2.f42838b[i111];
                                    if (!zB6 || !Objects.equals(c1Var2, c1Var) || z16 || uz1Var8.f()) {
                                        uz1.l(aVar2, jE5);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                    uz1 uz1Var9 = uz1VarArr2[i16];
                    if (!uz1Var9.e(m0Var15, (a) uz1Var9.f20972e) || !uz1Var9.e(m0Var15, (a) uz1Var9.f20973f)) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
        }
        fz1 fz1Var6 = this.f48064r;
        m0 m0Var20 = (m0) fz1Var6.f14618n;
        if (m0Var20 != null && ((m0) fz1Var6.f14617m) != m0Var20 && !m0Var20.f48117h) {
            uz1[] uz1VarArr3 = this.f48042a;
            i2.v vVar5 = m0Var20.f48123o;
            boolean z17 = true;
            for (int i21 = 0; i21 < uz1VarArr3.length; i21++) {
                int iC = uz1VarArr3[i21].c();
                uz1 uz1Var10 = uz1VarArr3[i21];
                sr0 sr0Var = this.f48060n;
                int iJ = uz1Var10.j((a) uz1Var10.f20972e, m0Var20, vVar5, sr0Var);
                int iJ2 = uz1Var10.j((a) uz1Var10.f20973f, m0Var20, vVar5, sr0Var);
                if (iJ == 1) {
                    iJ = iJ2;
                }
                if ((iJ & 2) != 0 && (z11 = this.T) && z11) {
                    this.T = false;
                    if (this.H.f48193p) {
                        this.f48055h.e(2);
                    }
                }
                this.U -= iC - uz1VarArr3[i21].c();
                z17 &= (iJ & 1) != 0;
            }
            if (z17) {
                for (int i22 = 0; i22 < uz1VarArr3.length; i22++) {
                    if (vVar5.b(i22)) {
                        if (!(uz1VarArr3[i22].d(m0Var20) != null)) {
                            k(m0Var20, i22, false, m0Var20.e());
                        }
                    }
                }
            }
            if (z17) {
                ((m0) fz1Var6.f14618n).f48117h = true;
            }
        }
        uz1[] uz1VarArr4 = this.f48042a;
        fz1 fz1Var7 = this.f48064r;
        boolean z18 = false;
        while (q0() && !this.L && (m0Var2 = (m0) fz1Var7.f14617m) != null && (m0Var3 = m0Var2.f48121m) != null && this.W >= m0Var3.e() && m0Var3.f48117h) {
            if (z18) {
                E();
            }
            this.f48051e0 = false;
            m0 m0VarA = fz1Var7.a();
            m0VarA.getClass();
            if (this.H.f48180b.f40307a.equals(m0VarA.f48116g.f48126a.f40307a)) {
                f2.c0 c0Var = this.H.f48180b;
                if (c0Var.f40308b == -1) {
                    f2.c0 c0Var2 = m0VarA.f48116g.f48126a;
                    if (c0Var2.f40308b != -1 || c0Var.f40311e == c0Var2.f40311e) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            n0 n0Var2 = m0VarA.f48116g;
            boolean z19 = z10;
            f2.c0 c0Var3 = n0Var2.f48126a;
            long j18 = n0Var2.f48127b;
            this.H = y(c0Var3, j18, n0Var2.f48128c, j18, !z19, 0);
            P();
            A0();
            if (d() && m0VarA == ((m0) fz1Var7.f14619o)) {
                for (uz1 uz1Var11 : uz1VarArr4) {
                    int i23 = uz1Var11.f20971d;
                    if (i23 == 3 || i23 == 4) {
                        boolean z20 = i23 == 4;
                        a aVar6 = (a) uz1Var11.f20972e;
                        a aVar7 = (a) uz1Var11.f20973f;
                        if (z20) {
                            aVar7.getClass();
                            aVar7.handleMessage(17, aVar6);
                        } else {
                            aVar7.getClass();
                            aVar6.handleMessage(17, aVar7);
                        }
                        uz1Var11.f20971d = uz1Var11.f20971d == 4 ? 0 : 1;
                    } else if (i23 == 2) {
                        uz1Var11.f20971d = 0;
                    }
                }
            }
            if (this.H.f48183e == 3) {
                s0();
            }
            i2.v vVar6 = ((m0) fz1Var7.f14617m).f48123o;
            for (int i24 = 0; i24 < uz1VarArr4.length; i24++) {
                if (vVar6.b(i24)) {
                    uz1 uz1Var12 = uz1VarArr4[i24];
                    a aVar8 = (a) uz1Var12.f20973f;
                    a aVar9 = (a) uz1Var12.f20972e;
                    if (uz1.h(aVar9)) {
                        aVar9.e();
                    } else if (aVar8 != null) {
                        if (aVar8.f47912h != 0) {
                            aVar8.e();
                        }
                    }
                }
            }
            z18 = true;
        }
        this.f48047c0.getClass();
    }

    public final void z0(int i10, int i11, int i12, boolean z10) {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.D;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        w0 w0Var = this.H;
        if (w0Var.l == z11 && w0Var.f48191n == i11 && w0Var.f48190m == i12) {
            return;
        }
        this.H = w0Var.e(i12, i11, z11);
        C0(false, false);
        fz1 fz1Var = this.f48064r;
        for (m0 m0Var = (m0) fz1Var.f14617m; m0Var != null; m0Var = m0Var.f48121m) {
            for (i2.r rVar : m0Var.f48123o.f42839c) {
                if (rVar != null) {
                    rVar.g(z11);
                }
            }
        }
        if (!q0()) {
            u0();
            A0();
            w0 w0Var2 = this.H;
            if (w0Var2.f48193p) {
                this.H = w0Var2.i(false);
            }
            fz1Var.m(this.W);
            return;
        }
        int i13 = this.H.f48183e;
        l1.w wVar = this.f48055h;
        if (i13 != 3) {
            if (i13 == 2) {
                wVar.e(2);
            }
        } else {
            sr0 sr0Var = this.f48060n;
            sr0Var.f20038b = true;
            ((ea.z0) sr0Var.f20039c).d();
            s0();
            wVar.e(2);
        }
    }
}
