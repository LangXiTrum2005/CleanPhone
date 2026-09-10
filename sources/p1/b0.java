package p1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.o6;
import com.google.android.gms.internal.ads.t02;
import com.google.android.gms.internal.ads.z40;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.f1;
import f2.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import m0.s1;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends al.b implements k {
    public final mb.b A;
    public final long B;
    public final kj1 C;
    public final z40 D;
    public final a0 E;
    public final m5.k F;
    public final m5.k G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public final d1 L;
    public final e1 M;
    public f1 N;
    public final j O;
    public i1.h0 P;
    public i1.a0 Q;
    public i1.p R;
    public Object S;
    public Surface T;
    public SurfaceHolder U;
    public boolean V;
    public final int W;
    public l1.r X;
    public i1.e Y;
    public float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f47928a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.v f47929b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f47930b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1.h0 f47931c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f47932c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.f f47933d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f47934d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f47935e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f47936e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f47937f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public i1.z0 f47938f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a[] f47939g;
    public i1.a0 g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a[] f47940h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public w0 f47941h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i2.u f47942i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f47943i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.w f47944j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f47945j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f47946k;
    public final h0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mk0 f47947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f47948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i1.n0 f47949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f47950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f47951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f2.b0 f47952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q1.f f47953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Looper f47954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j2.d f47955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l1.u f47956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f47957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f47958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final bc.s f47959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final hx0 f47960z;

    static {
        i1.z.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [al.b, java.lang.Object, p1.b0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7, types: [p1.b0] */
    public b0(i iVar) throws Throwable {
        b0 b0Var;
        Handler.Callback callback;
        b0 b0Var2;
        ?? bVar = new al.b(3);
        bVar.f47933d = new l1.f();
        try {
            l1.a.j("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(bVar)) + " [AndroidXMedia3/1.9.2] [" + l1.y.f44830a + X3.j.f27836e);
            Context context = iVar.f48073a;
            Looper looper = iVar.f48079g;
            l1.u uVar = iVar.f48074b;
            bVar.f47935e = context.getApplicationContext();
            bVar.f47953s = new q1.f(uVar);
            bVar.f47934d0 = iVar.f48080h;
            bVar.Y = iVar.f48081i;
            bVar.W = iVar.f48082j;
            bVar.f47928a0 = false;
            bVar.B = iVar.f48087p;
            v vVar = new v(bVar);
            bVar.f47957w = vVar;
            bVar.f47958x = new w();
            a[] aVarArrH = ((s1) iVar.f48075c.get()).h(new Handler(looper), vVar, vVar, vVar, vVar);
            bVar.f47939g = aVarArrH;
            go.k.t(aVarArrH.length > 0);
            bVar.f47940h = new a[aVarArrH.length];
            int i10 = 0;
            while (true) {
                a[] aVarArr = bVar.f47940h;
                if (i10 >= aVarArr.length) {
                    break;
                }
                int i11 = bVar.f47939g[i10].f47906b;
                aVarArr[i10] = null;
                i10++;
                b0Var.f47933d.c();
                throw th;
            }
            bVar.f47942i = (i2.u) iVar.f48077e.get();
            bVar.f47952r = (f2.b0) iVar.f48076d.get();
            bVar.f47955u = (j2.d) iVar.f48078f.get();
            bVar.f47951q = iVar.f48083k;
            bVar.M = iVar.l;
            bVar.L = iVar.f48084m;
            bVar.f47954t = looper;
            bVar.f47956v = uVar;
            bVar.f47937f = bVar;
            bVar.f47947m = new mk0(new CopyOnWriteArraySet(), looper, looper.getThread(), uVar, (l1.l) new ni.g((b0) bVar), true);
            bVar.f47948n = new CopyOnWriteArraySet();
            bVar.f47950p = new ArrayList();
            bVar.N = new f1();
            bVar.O = j.f48101a;
            a[] aVarArr2 = bVar.f47939g;
            bVar.f47929b = new i2.v(new c1[aVarArr2.length], new i2.r[aVarArr2.length], i1.v0.f42709b, null);
            bVar.f47949o = new i1.n0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i12 = 0; i12 < 20; i12++) {
                int i13 = iArr[i12];
                go.k.t(!false);
                sparseBooleanArray.append(i13, true);
            }
            bVar.f47942i.getClass();
            go.k.t(!false);
            sparseBooleanArray.append(29, true);
            go.k.t(!false);
            i1.n nVar = new i1.n(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = nVar.f42581a;
            bVar.f47931c = new i1.h0(nVar);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i14 = 0; i14 < sparseBooleanArray2.size(); i14++) {
                go.k.m(i14, sparseBooleanArray2.size());
                int iKeyAt = sparseBooleanArray2.keyAt(i14);
                go.k.t(!false);
                sparseBooleanArray3.append(iKeyAt, true);
            }
            go.k.t(!false);
            sparseBooleanArray3.append(4, true);
            go.k.t(!false);
            sparseBooleanArray3.append(10, true);
            go.k.t(!false);
            bVar.P = new i1.h0(new i1.n(sparseBooleanArray3));
            bVar.f47944j = bVar.f47956v.a(bVar.f47954t, null);
            n nVar2 = new n(bVar);
            bVar.f47946k = nVar2;
            bVar.f47941h0 = w0.k(bVar.f47929b);
            bVar.f47953s.J(bVar.f47937f, bVar.f47954t);
            q1.j jVar = new q1.j(iVar.f48094w);
            h0 h0Var = new h0(bVar.f47935e, bVar.f47939g, bVar.f47940h, bVar.f47942i, bVar.f47929b, new f(), bVar.f47955u, bVar.H, bVar.f47953s, bVar.M, iVar.f48085n, iVar.f48086o, bVar.f47954t, bVar.f47956v, nVar2, jVar, bVar.O, bVar.f47958x, iVar.f48095x);
            l1.w wVar = h0Var.f48055h;
            bVar.l = h0Var;
            Looper looper2 = h0Var.f48057j;
            bVar.Z = 1.0f;
            bVar.H = 0;
            i1.a0 a0Var = i1.a0.B;
            bVar.Q = a0Var;
            bVar.g0 = a0Var;
            bVar.f47943i0 = -1;
            oa.p pVar = k1.c.f44242b;
            bVar.f47930b0 = true;
            q1.f fVar = bVar.f47953s;
            mk0 mk0Var = bVar.f47947m;
            fVar.getClass();
            mk0Var.a(fVar);
            j2.d dVar = bVar.f47955u;
            Handler handler = new Handler(bVar.f47954t);
            q1.f fVar2 = bVar.f47953s;
            j2.g gVar = (j2.g) dVar;
            gVar.getClass();
            fVar2.getClass();
            am.e eVar = gVar.f43649c;
            eVar.getClass();
            CopyOnWriteArrayList<j2.c> copyOnWriteArrayList = (CopyOnWriteArrayList) eVar.f3698b;
            for (j2.c cVar : copyOnWriteArrayList) {
                if (cVar.f43631b == fVar2) {
                    cVar.f43632c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new j2.c(handler, fVar2));
            bVar.f47948n.add(bVar.f47957w);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 31) {
                Context context2 = bVar.f47935e;
                boolean z10 = iVar.f48092u;
                l1.w wVarA = bVar.f47956v.a(h0Var.f48057j, null);
                try {
                    callback = null;
                    try {
                        b0Var2 = this;
                        wVarA.c(new com.applovin.impl.sdk.v(context2, z10, this, jVar, 8));
                    } catch (Throwable th2) {
                        th = th2;
                        b0Var = this;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    b0Var = this;
                }
            } else {
                callback = null;
                b0Var2 = bVar;
            }
            b0 b0Var3 = b0Var2;
            try {
                kj1 kj1Var = new kj1(0, looper2, b0Var2.f47954t, b0Var2.f47956v, new n(b0Var2));
                b0Var3.C = kj1Var;
                kj1Var.q(new com.mbridge.msdk.config.component.info.provider.subprovider.f(b0Var3, 27));
                Handler.Callback callback2 = callback;
                bc.s sVar = new bc.s(iVar.f48073a, looper2, iVar.f48079g, b0Var3.f47957w, b0Var3.f47956v);
                b0Var3.f47959y = sVar;
                sVar.c();
                boolean z11 = (iVar.f48088q == Integer.MAX_VALUE || iVar.f48089r == Integer.MAX_VALUE || iVar.f48090s == Integer.MAX_VALUE || iVar.f48091t == Integer.MAX_VALUE) ? false : true;
                hx0 hx0Var = new hx0(context, looper2, b0Var3.f47956v);
                b0Var3.f47960z = hx0Var;
                if (hx0Var.f15418b != z11) {
                    hx0Var.f15418b = z11;
                    hx0Var.g(z11, hx0Var.f15419c);
                }
                l1.u uVar2 = b0Var3.f47956v;
                mb.b bVar2 = new mb.b();
                new j2.n(context.getApplicationContext());
                uVar2.a(looper2, callback2);
                uVar2.a(Looper.getMainLooper(), callback2);
                b0Var3.A = bVar2;
                int i16 = i1.j.f42556c;
                b0Var3.f47938f0 = i1.z0.f42722d;
                b0Var3.X = l1.r.f44816c;
                b0Var3.E = i15 >= 34 ? new a0(b0Var3, context) : callback2;
                b0Var3.F = new m5.k(7);
                b0Var3.G = new m5.k(7);
                bVar = b0Var3;
                bVar.D = new z40(bVar, b0Var3.f47957w, b0Var3.f47956v, iVar.f48088q, iVar.f48089r, iVar.f48090s, iVar.f48091t);
                wVar.a(38, bVar.L).b();
                i1.e eVar2 = bVar.Y;
                wVar.getClass();
                l1.v vVarB = l1.w.b();
                vVarB.f44823a = wVar.f44825a.obtainMessage(31, 0, 0, eVar2);
                vVarB.b();
                bVar.d1(r13, 3, bVar.Y);
                bVar.d1(2, 4, Integer.valueOf(bVar.W));
                bVar.d1(2, 5, 0);
                bVar.d1(r13, 9, Boolean.valueOf(bVar.f47928a0));
                bVar.d1(6, 8, bVar.f47958x);
                bVar.d1(-1, 16, Integer.valueOf(bVar.f47934d0));
                bVar.f47933d.c();
            } catch (Throwable th4) {
                th = th4;
                b0Var = b0Var3;
            }
        } catch (Throwable th5) {
            th = th5;
            b0Var = bVar;
        }
    }

    public static long V0(w0 w0Var) {
        i1.o0 o0Var = new i1.o0();
        i1.n0 n0Var = new i1.n0();
        w0Var.f48179a.g(w0Var.f48180b.f40307a, n0Var);
        long j10 = w0Var.f48181c;
        return j10 == C.TIME_UNSET ? w0Var.f48179a.m(n0Var.f42584c, o0Var, 0L).l : n0Var.f42586e + j10;
    }

    public static w0 X0(w0 w0Var, int i10) {
        w0 w0VarH = w0Var.h(i10);
        return (i10 == 1 || i10 == 4) ? w0VarH.b(false) : w0VarH;
    }

    @Override // al.b
    public final void E0(int i10, long j10) {
        l1();
        if (i10 == -1) {
            return;
        }
        go.k.i(i10 >= 0);
        i1.p0 p0Var = this.f47941h0.f48179a;
        if (p0Var.p() || i10 < p0Var.o()) {
            q1.f fVar = this.f47953s;
            if (!fVar.f48537i) {
                q1.a aVarD = fVar.D();
                fVar.f48537i = true;
                fVar.I(aVarD, -1, new ni.g(24));
            }
            this.I++;
            if (W0()) {
                l1.a.s("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w(this.f47941h0, 2);
                wVar.d(1);
                b0 b0Var = this.f47946k.f48125a;
                b0Var.f47944j.c(new l2.u(10, b0Var, wVar));
                return;
            }
            w0 w0VarH = this.f47941h0;
            int i11 = w0VarH.f48183e;
            if (i11 == 3 || (i11 == 4 && !p0Var.p())) {
                w0VarH = this.f47941h0.h(2);
            }
            int iM0 = M0();
            w0 w0VarY0 = Y0(w0VarH, p0Var, Z0(p0Var, i10, j10));
            this.l.f48055h.a(3, new g0(p0Var, i10, l1.y.M(j10))).b();
            j1(w0VarY0, 0, true, 1, P0(w0VarY0), iM0);
        }
    }

    public final i1.a0 H0() {
        i1.p0 p0VarQ0 = Q0();
        if (p0VarQ0.p()) {
            return this.g0;
        }
        i1.y yVar = p0VarQ0.m(M0(), (i1.o0) this.f3623a, 0L).f42618c;
        o6 o6VarA = this.g0.a();
        i1.a0 a0Var = yVar.f42716d;
        if (a0Var != null) {
            oa.j0 j0Var = a0Var.A;
            byte[] bArr = a0Var.f42503f;
            CharSequence charSequence = a0Var.f42498a;
            if (charSequence != null) {
                o6VarA.f18151a = charSequence;
            }
            CharSequence charSequence2 = a0Var.f42499b;
            if (charSequence2 != null) {
                o6VarA.f18152b = charSequence2;
            }
            CharSequence charSequence3 = a0Var.f42500c;
            if (charSequence3 != null) {
                o6VarA.f18153c = charSequence3;
            }
            CharSequence charSequence4 = a0Var.f42501d;
            if (charSequence4 != null) {
                o6VarA.f18154d = charSequence4;
            }
            CharSequence charSequence5 = a0Var.f42502e;
            if (charSequence5 != null) {
                o6VarA.f18155e = charSequence5;
            }
            if (bArr != null) {
                Integer num = a0Var.f42504g;
                o6VarA.f18156f = bArr == null ? null : (byte[]) bArr.clone();
                o6VarA.f18157g = num;
            }
            Integer num2 = a0Var.f42505h;
            if (num2 != null) {
                o6VarA.f18158h = num2;
            }
            Integer num3 = a0Var.f42506i;
            if (num3 != null) {
                o6VarA.f18159i = num3;
            }
            Integer num4 = a0Var.f42507j;
            if (num4 != null) {
                o6VarA.f18160j = num4;
            }
            Boolean bool = a0Var.f42508k;
            if (bool != null) {
                o6VarA.f18161k = bool;
            }
            Integer num5 = a0Var.l;
            if (num5 != null) {
                o6VarA.l = num5;
            }
            Integer num6 = a0Var.f42509m;
            if (num6 != null) {
                o6VarA.l = num6;
            }
            Integer num7 = a0Var.f42510n;
            if (num7 != null) {
                o6VarA.f18162m = num7;
            }
            Integer num8 = a0Var.f42511o;
            if (num8 != null) {
                o6VarA.f18163n = num8;
            }
            Integer num9 = a0Var.f42512p;
            if (num9 != null) {
                o6VarA.f18164o = num9;
            }
            Integer num10 = a0Var.f42513q;
            if (num10 != null) {
                o6VarA.f18165p = num10;
            }
            Integer num11 = a0Var.f42514r;
            if (num11 != null) {
                o6VarA.f18166q = num11;
            }
            CharSequence charSequence6 = a0Var.f42515s;
            if (charSequence6 != null) {
                o6VarA.f18167r = charSequence6;
            }
            CharSequence charSequence7 = a0Var.f42516t;
            if (charSequence7 != null) {
                o6VarA.f18168s = charSequence7;
            }
            CharSequence charSequence8 = a0Var.f42517u;
            if (charSequence8 != null) {
                o6VarA.f18169t = charSequence8;
            }
            Integer num12 = a0Var.f42518v;
            if (num12 != null) {
                o6VarA.f18170u = num12;
            }
            Integer num13 = a0Var.f42519w;
            if (num13 != null) {
                o6VarA.f18171v = num13;
            }
            CharSequence charSequence9 = a0Var.f42520x;
            if (charSequence9 != null) {
                o6VarA.f18172w = charSequence9;
            }
            CharSequence charSequence10 = a0Var.f42521y;
            if (charSequence10 != null) {
                o6VarA.f18173x = charSequence10;
            }
            Integer num14 = a0Var.f42522z;
            if (num14 != null) {
                o6VarA.f18174y = num14;
            }
            if (!j0Var.isEmpty()) {
                o6VarA.f18175z = oa.j0.x(j0Var);
            }
        }
        return new i1.a0(o6VarA);
    }

    public final long I0() {
        l1();
        if (W0()) {
            w0 w0Var = this.f47941h0;
            return w0Var.f48189k.equals(w0Var.f48180b) ? l1.y.Z(this.f47941h0.f48194q) : S0();
        }
        l1();
        if (this.f47941h0.f48179a.p()) {
            return this.f47945j0;
        }
        w0 w0Var2 = this.f47941h0;
        long j10 = 0;
        if (w0Var2.f48189k.f40310d != w0Var2.f48180b.f40310d) {
            return l1.y.Z(w0Var2.f48179a.m(M0(), (i1.o0) this.f3623a, 0L).f42627m);
        }
        long j11 = w0Var2.f48194q;
        if (this.f47941h0.f48189k.b()) {
            w0 w0Var3 = this.f47941h0;
            w0Var3.f48179a.g(w0Var3.f48189k.f40307a, this.f47949o).d(this.f47941h0.f48189k.f40308b);
        } else {
            j10 = j11;
        }
        w0 w0Var4 = this.f47941h0;
        i1.p0 p0Var = w0Var4.f48179a;
        Object obj = w0Var4.f48189k.f40307a;
        i1.n0 n0Var = this.f47949o;
        p0Var.g(obj, n0Var);
        return l1.y.Z(j10 + n0Var.f42586e);
    }

    public final long J0(w0 w0Var) {
        f2.c0 c0Var = w0Var.f48180b;
        long j10 = w0Var.f48181c;
        i1.p0 p0Var = w0Var.f48179a;
        if (!c0Var.b()) {
            return l1.y.Z(P0(w0Var));
        }
        Object obj = w0Var.f48180b.f40307a;
        i1.n0 n0Var = this.f47949o;
        p0Var.g(obj, n0Var);
        if (j10 == C.TIME_UNSET) {
            return l1.y.Z(p0Var.m(R0(w0Var), (i1.o0) this.f3623a, 0L).l);
        }
        return l1.y.Z(j10) + l1.y.Z(n0Var.f42586e);
    }

    public final int K0() {
        l1();
        if (W0()) {
            return this.f47941h0.f48180b.f40308b;
        }
        return -1;
    }

    public final int L0() {
        l1();
        if (W0()) {
            return this.f47941h0.f48180b.f40309c;
        }
        return -1;
    }

    public final int M0() {
        l1();
        int iR0 = R0(this.f47941h0);
        if (iR0 == -1) {
            return 0;
        }
        return iR0;
    }

    public final int N0() {
        l1();
        if (!this.f47941h0.f48179a.p()) {
            w0 w0Var = this.f47941h0;
            return w0Var.f48179a.b(w0Var.f48180b.f40307a);
        }
        int i10 = this.f47943i0;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final long O0() {
        l1();
        return l1.y.Z(P0(this.f47941h0));
    }

    public final long P0(w0 w0Var) {
        if (w0Var.f48179a.p()) {
            return l1.y.M(this.f47945j0);
        }
        long jL = w0Var.f48193p ? w0Var.l() : w0Var.f48196s;
        if (w0Var.f48180b.b()) {
            return jL;
        }
        i1.p0 p0Var = w0Var.f48179a;
        Object obj = w0Var.f48180b.f40307a;
        i1.n0 n0Var = this.f47949o;
        p0Var.g(obj, n0Var);
        return jL + n0Var.f42586e;
    }

    public final i1.p0 Q0() {
        l1();
        return this.f47941h0.f48179a;
    }

    public final int R0(w0 w0Var) {
        return w0Var.f48179a.p() ? this.f47943i0 : w0Var.f48179a.g(w0Var.f48180b.f40307a, this.f47949o).f42584c;
    }

    public final long S0() {
        l1();
        if (!W0()) {
            i1.p0 p0VarQ0 = Q0();
            return p0VarQ0.p() ? C.TIME_UNSET : l1.y.Z(p0VarQ0.m(M0(), (i1.o0) this.f3623a, 0L).f42627m);
        }
        w0 w0Var = this.f47941h0;
        f2.c0 c0Var = w0Var.f48180b;
        i1.p0 p0Var = w0Var.f48179a;
        Object obj = c0Var.f40307a;
        i1.n0 n0Var = this.f47949o;
        p0Var.g(obj, n0Var);
        return l1.y.Z(n0Var.a(c0Var.f40308b, c0Var.f40309c));
    }

    public final boolean T0() {
        l1();
        return this.f47941h0.l;
    }

    public final int U0() {
        l1();
        return this.f47941h0.f48183e;
    }

    public final boolean W0() {
        l1();
        return this.f47941h0.f48180b.b();
    }

    public final w0 Y0(w0 w0Var, i1.p0 p0Var, Pair pair) {
        List list;
        go.k.i(p0Var.p() || pair != null);
        i1.p0 p0Var2 = w0Var.f48179a;
        long jJ0 = J0(w0Var);
        w0 w0VarJ = w0Var.j(p0Var);
        if (p0Var.p()) {
            f2.c0 c0Var = w0.f48178u;
            long jM = l1.y.M(this.f47945j0);
            w0 w0VarC = w0VarJ.d(c0Var, jM, jM, jM, 0L, k1.f40385d, this.f47929b, n1.f47281e).c(c0Var);
            w0VarC.f48194q = w0VarC.f48196s;
            return w0VarC;
        }
        Object obj = w0VarJ.f48180b.f40307a;
        boolean zEquals = obj.equals(pair.first);
        f2.c0 c0Var2 = !zEquals ? new f2.c0(pair.first) : w0VarJ.f48180b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM2 = l1.y.M(jJ0);
        if (!p0Var2.p()) {
            jM2 -= p0Var2.g(obj, this.f47949o).f42586e;
            if (zEquals && jM2 - jLongValue == 1 && jM2 == p0Var2.g(obj, this.f47949o).f42585d) {
                jM2--;
            }
        }
        if (!zEquals || jLongValue < jM2) {
            f2.c0 c0Var3 = c0Var2;
            go.k.t(!c0Var3.b());
            k1 k1Var = !zEquals ? k1.f40385d : w0VarJ.f48186h;
            i2.v vVar = !zEquals ? this.f47929b : w0VarJ.f48187i;
            if (zEquals) {
                list = w0VarJ.f48188j;
            } else {
                oa.f0 f0Var = oa.j0.f47265b;
                list = n1.f47281e;
            }
            w0 w0VarC2 = w0VarJ.d(c0Var3, jLongValue, jLongValue, jLongValue, 0L, k1Var, vVar, list).c(c0Var3);
            w0VarC2.f48194q = jLongValue;
            return w0VarC2;
        }
        if (jLongValue != jM2) {
            f2.c0 c0Var4 = c0Var2;
            go.k.t(!c0Var4.b());
            long jMax = Math.max(0L, w0VarJ.f48195r - (jLongValue - jM2));
            long j10 = w0VarJ.f48194q;
            if (w0VarJ.f48189k.equals(w0VarJ.f48180b)) {
                j10 = jLongValue + jMax;
            }
            w0 w0VarD = w0VarJ.d(c0Var4, jLongValue, jLongValue, jLongValue, jMax, w0VarJ.f48186h, w0VarJ.f48187i, w0VarJ.f48188j);
            w0VarD.f48194q = j10;
            return w0VarD;
        }
        int iB = p0Var.b(w0VarJ.f48189k.f40307a);
        if (iB != -1 && p0Var.f(iB, this.f47949o, false).f42584c == p0Var.g(c0Var2.f40307a, this.f47949o).f42584c) {
            return w0VarJ;
        }
        p0Var.g(c0Var2.f40307a, this.f47949o);
        long jA = c0Var2.b() ? this.f47949o.a(c0Var2.f40308b, c0Var2.f40309c) : this.f47949o.f42585d;
        f2.c0 c0Var5 = c0Var2;
        w0 w0VarC3 = w0VarJ.d(c0Var5, w0VarJ.f48196s, w0VarJ.f48196s, w0VarJ.f48182d, jA - w0VarJ.f48196s, w0VarJ.f48186h, w0VarJ.f48187i, w0VarJ.f48188j).c(c0Var5);
        w0VarC3.f48194q = jA;
        return w0VarC3;
    }

    public final Pair Z0(i1.p0 p0Var, int i10, long j10) {
        if (p0Var.p()) {
            this.f47943i0 = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.f47945j0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= p0Var.o()) {
            i10 = p0Var.a(false);
            j10 = l1.y.Z(p0Var.m(i10, (i1.o0) this.f3623a, 0L).l);
        }
        return p0Var.i((i1.o0) this.f3623a, this.f47949o, i10, l1.y.M(j10));
    }

    public final void a1(final int i10, final int i11) {
        l1.r rVar = this.X;
        if (i10 == rVar.f44817a && i11 == rVar.f44818b) {
            return;
        }
        this.X = new l1.r(i10, i11);
        this.f47947m.e(24, new l1.k() { // from class: p1.m
            @Override // l1.k
            public final void invoke(Object obj) {
                ((i1.i0) obj).q(i10, i11);
            }
        });
        d1(2, 14, new l1.r(i10, i11));
    }

    public final void b1() {
        l1();
        w0 w0Var = this.f47941h0;
        if (w0Var.f48183e != 1) {
            return;
        }
        w0 w0VarF = w0Var.f(null);
        w0 w0VarX0 = X0(w0VarF, w0VarF.f48179a.p() ? 4 : 2);
        this.I++;
        l1.w wVar = this.l.f48055h;
        wVar.getClass();
        l1.v vVarB = l1.w.b();
        vVarB.f44823a = wVar.f44825a.obtainMessage(29);
        vVarB.b();
        j1(w0VarX0, 1, false, 5, C.TIME_UNSET, -1);
    }

    public final void c1() {
        SurfaceHolder surfaceHolder = this.U;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f47957w);
            this.U = null;
        }
    }

    public final void d1(int i10, int i11, Object obj) {
        h0 h0Var;
        a[] aVarArr = this.f47939g;
        int length = aVarArr.length;
        int i12 = 0;
        while (true) {
            h0Var = this.l;
            if (i12 >= length) {
                break;
            }
            a aVar = aVarArr[i12];
            if (i10 == -1 || aVar.f47906b == i10) {
                int iR0 = R0(this.f47941h0);
                i1.p0 p0Var = this.f47941h0.f48179a;
                if (iR0 == -1) {
                    iR0 = 0;
                }
                z0 z0Var = new z0(h0Var, aVar, p0Var, iR0, h0Var.f48057j);
                go.k.t(!z0Var.f48208f);
                z0Var.f48205c = i11;
                go.k.t(!z0Var.f48208f);
                z0Var.f48206d = obj;
                z0Var.b();
            }
            i12++;
        }
        for (a aVar2 : this.f47940h) {
            if (aVar2 != null && (i10 == -1 || aVar2.f47906b == i10)) {
                int iR1 = R0(this.f47941h0);
                i1.p0 p0Var2 = this.f47941h0.f48179a;
                if (iR1 == -1) {
                    iR1 = 0;
                }
                z0 z0Var2 = new z0(h0Var, aVar2, p0Var2, iR1, h0Var.f48057j);
                go.k.t(!z0Var2.f48208f);
                z0Var2.f48205c = i11;
                go.k.t(!z0Var2.f48208f);
                z0Var2.f48206d = obj;
                z0Var2.b();
            }
        }
    }

    public final void e1(Surface surface) {
        Object obj = this.S;
        boolean zB = true;
        boolean z10 = (obj == null || obj == surface) ? false : true;
        long j10 = z10 ? this.B : -9223372036854775807L;
        h0 h0Var = this.l;
        if (!h0Var.J && h0Var.f48057j.getThread().isAlive()) {
            l1.f fVar = new l1.f(h0Var.f48062p);
            h0Var.f48055h.a(30, new Pair(surface, fVar)).b();
            if (j10 != C.TIME_UNSET) {
                zB = fVar.b(j10);
            }
        }
        if (z10) {
            Object obj2 = this.S;
            Surface surface2 = this.T;
            if (obj2 == surface2) {
                surface2.release();
                this.T = null;
            }
        }
        this.S = surface;
        if (zB) {
            return;
        }
        g1(new h(2, new aa.b("Detaching surface timed out.", 17), 1003));
    }

    public final void f1(Surface surface) {
        l1();
        c1();
        e1(surface);
        int i10 = surface == null ? 0 : -1;
        a1(i10, i10);
    }

    public final void g1(h hVar) {
        w0 w0Var = this.f47941h0;
        w0 w0VarC = w0Var.c(w0Var.f48180b);
        w0VarC.f48194q = w0VarC.f48196s;
        w0VarC.f48195r = 0L;
        w0 w0VarF = X0(w0VarC, 1).f(hVar);
        this.I++;
        l1.w wVar = this.l.f48055h;
        wVar.getClass();
        l1.v vVarB = l1.w.b();
        vVarB.f44823a = wVar.f44825a.obtainMessage(6);
        vVarB.b();
        j1(w0VarF, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void h1() {
        int iK;
        int iE;
        i1.h0 h0Var = this.P;
        String str = l1.y.f44830a;
        b0 b0Var = this.f47937f;
        boolean zW0 = b0Var.W0();
        i1.o0 o0Var = (i1.o0) b0Var.f3623a;
        i1.p0 p0VarQ0 = b0Var.Q0();
        boolean z10 = !p0VarQ0.p() && p0VarQ0.m(b0Var.M0(), o0Var, 0L).f42623h;
        i1.p0 p0VarQ1 = b0Var.Q0();
        if (p0VarQ1.p()) {
            iK = -1;
        } else {
            int iM0 = b0Var.M0();
            b0Var.l1();
            int i10 = b0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            b0Var.l1();
            iK = p0VarQ1.k(iM0, i10);
        }
        boolean z11 = iK != -1;
        i1.p0 p0VarQ2 = b0Var.Q0();
        if (p0VarQ2.p()) {
            iE = -1;
        } else {
            int iM1 = b0Var.M0();
            b0Var.l1();
            int i11 = b0Var.H;
            if (i11 == 1) {
                i11 = 0;
            }
            b0Var.l1();
            iE = p0VarQ2.e(iM1, i11, false);
        }
        boolean z12 = iE != -1;
        i1.p0 p0VarQ3 = b0Var.Q0();
        boolean z13 = !p0VarQ3.p() && p0VarQ3.m(b0Var.M0(), o0Var, 0L).a();
        i1.p0 p0VarQ4 = b0Var.Q0();
        boolean z14 = !p0VarQ4.p() && p0VarQ4.m(b0Var.M0(), o0Var, 0L).f42624i;
        boolean zP = b0Var.Q0().p();
        am.e eVar = new am.e(9);
        t02 t02Var = (t02) eVar.f3698b;
        SparseBooleanArray sparseBooleanArray = this.f47931c.f42555a.f42581a;
        t02Var.getClass();
        for (int i12 = 0; i12 < sparseBooleanArray.size(); i12++) {
            go.k.m(i12, sparseBooleanArray.size());
            t02Var.a(sparseBooleanArray.keyAt(i12));
        }
        boolean z15 = !zW0;
        eVar.g(4, z15);
        eVar.g(5, z10 && !zW0);
        eVar.g(6, z11 && !zW0);
        eVar.g(7, !zP && (z11 || !z13 || z10) && !zW0);
        eVar.g(8, z12 && !zW0);
        eVar.g(9, !zP && (z12 || (z13 && z14)) && !zW0);
        eVar.g(10, z15);
        eVar.g(11, z10 && !zW0);
        eVar.g(12, z10 && !zW0);
        i1.h0 h0Var2 = new i1.h0(t02Var.b());
        this.P = h0Var2;
        if (h0Var2.equals(h0Var)) {
            return;
        }
        this.f47947m.c(13, new n(this));
    }

    public final void i1(int i10, boolean z10) {
        w0 w0VarA = this.f47941h0;
        int i11 = w0VarA.f48191n;
        int i12 = (i11 != 1 || z10) ? 0 : 1;
        if (w0VarA.l == z10 && i11 == i12 && w0VarA.f48190m == i10) {
            return;
        }
        this.I++;
        if (w0VarA.f48193p) {
            w0VarA = w0VarA.a();
        }
        w0 w0VarE = w0VarA.e(i10, i12, z10);
        l1.w wVar = this.l.f48055h;
        wVar.getClass();
        l1.v vVarB = l1.w.b();
        vVarB.f44823a = wVar.f44825a.obtainMessage(1, z10 ? 1 : 0, i10 | (i12 << 4));
        vVarB.b();
        j1(w0VarE, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void j1(final w0 w0Var, final int i10, boolean z10, int i11, long j10, int i12) {
        Pair pair;
        int i13;
        final i1.y yVar;
        int i14;
        int i15;
        Object obj;
        i1.y yVar2;
        Object obj2;
        long j11;
        long j12;
        long jV0;
        long jV1;
        Object obj3;
        i1.y yVar3;
        Object obj4;
        w0 w0Var2 = this.f47941h0;
        this.f47941h0 = w0Var;
        boolean zEquals = w0Var2.f48179a.equals(w0Var.f48179a);
        i1.o0 o0Var = (i1.o0) this.f3623a;
        i1.n0 n0Var = this.f47949o;
        i1.p0 p0Var = w0Var2.f48179a;
        f2.c0 c0Var = w0Var2.f48180b;
        i1.p0 p0Var2 = w0Var.f48179a;
        f2.c0 c0Var2 = w0Var.f48180b;
        if (p0Var2.p() && p0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (p0Var2.p() != p0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (p0Var.m(p0Var.g(c0Var.f40307a, n0Var).f42584c, o0Var, 0L).f42616a.equals(p0Var2.m(p0Var2.g(c0Var2.f40307a, n0Var).f42584c, o0Var, 0L).f42616a)) {
            pair = (z10 && i11 == 0 && c0Var.f40310d < c0Var2.f40310d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            yVar = w0Var.f48179a.p() ? null : w0Var.f48179a.m(w0Var.f48179a.g(w0Var.f48180b.f40307a, this.f47949o).f42584c, (i1.o0) this.f3623a, 0L).f42618c;
            this.g0 = i1.a0.B;
        } else {
            yVar = null;
        }
        if (zBooleanValue || !w0Var2.f48188j.equals(w0Var.f48188j)) {
            o6 o6VarA = this.g0.a();
            List list = w0Var.f48188j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i1.c0 c0Var3 = (i1.c0) list.get(i16);
                int i17 = 0;
                while (true) {
                    i1.b0[] b0VarArr = c0Var3.f42527a;
                    if (i17 < b0VarArr.length) {
                        b0VarArr[i17].b(o6VarA);
                        i17++;
                    }
                }
            }
            this.g0 = new i1.a0(o6VarA);
        }
        i1.a0 a0VarH0 = H0();
        boolean zEquals2 = a0VarH0.equals(this.Q);
        this.Q = a0VarH0;
        boolean z11 = w0Var2.l != w0Var.l;
        boolean z12 = w0Var2.f48183e != w0Var.f48183e;
        if (z12 || z11) {
            k1();
        }
        boolean z13 = w0Var2.f48185g != w0Var.f48185g;
        if (!zEquals) {
            final int i18 = 0;
            this.f47947m.c(0, new l1.k() { // from class: p1.o
                @Override // l1.k
                public final void invoke(Object obj5) {
                    switch (i18) {
                        case 0:
                            i1.p0 p0Var3 = ((w0) w0Var).f48179a;
                            ((i1.i0) obj5).j(i10);
                            break;
                        default:
                            ((i1.i0) obj5).x((i1.y) w0Var, i10);
                            break;
                    }
                }
            });
        }
        if (z10) {
            i1.n0 n0Var2 = new i1.n0();
            if (w0Var2.f48179a.p()) {
                i14 = i12;
                i15 = i14;
                obj = null;
                yVar2 = null;
                obj2 = null;
            } else {
                Object obj5 = w0Var2.f48180b.f40307a;
                w0Var2.f48179a.g(obj5, n0Var2);
                int i19 = n0Var2.f42584c;
                int iB = w0Var2.f48179a.b(obj5);
                obj = w0Var2.f48179a.m(i19, (i1.o0) this.f3623a, 0L).f42616a;
                yVar2 = ((i1.o0) this.f3623a).f42618c;
                obj2 = obj5;
                i14 = i19;
                i15 = iB;
            }
            if (i11 == 0) {
                if (w0Var2.f48180b.b()) {
                    f2.c0 c0Var4 = w0Var2.f48180b;
                    jV0 = n0Var2.a(c0Var4.f40308b, c0Var4.f40309c);
                    jV1 = V0(w0Var2);
                } else {
                    if (w0Var2.f48180b.f40311e != -1) {
                        jV0 = V0(this.f47941h0);
                    } else {
                        j11 = n0Var2.f42586e;
                        j12 = n0Var2.f42585d;
                        jV0 = j11 + j12;
                    }
                    jV1 = jV0;
                }
            } else if (w0Var2.f48180b.b()) {
                jV0 = w0Var2.f48196s;
                jV1 = V0(w0Var2);
            } else {
                j11 = n0Var2.f42586e;
                j12 = w0Var2.f48196s;
                jV0 = j11 + j12;
                jV1 = jV0;
            }
            long jZ = l1.y.Z(jV0);
            long jZ2 = l1.y.Z(jV1);
            f2.c0 c0Var5 = w0Var2.f48180b;
            i1.j0 j0Var = new i1.j0(obj, i14, yVar2, obj2, i15, jZ, jZ2, c0Var5.f40308b, c0Var5.f40309c);
            i1.o0 o0Var2 = (i1.o0) this.f3623a;
            int iM0 = M0();
            int iN0 = N0();
            if (this.f47941h0.f48179a.p()) {
                obj3 = null;
                yVar3 = null;
                obj4 = null;
            } else {
                w0 w0Var3 = this.f47941h0;
                Object obj6 = w0Var3.f48180b.f40307a;
                w0Var3.f48179a.g(obj6, this.f47949o);
                iN0 = this.f47941h0.f48179a.b(obj6);
                Object obj7 = this.f47941h0.f48179a.m(iM0, o0Var2, 0L).f42616a;
                yVar3 = o0Var2.f42618c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i20 = iN0;
            long jZ3 = l1.y.Z(j10);
            long jZ4 = this.f47941h0.f48180b.b() ? l1.y.Z(V0(this.f47941h0)) : jZ3;
            f2.c0 c0Var6 = this.f47941h0.f48180b;
            this.f47947m.c(11, new r(i11, j0Var, new i1.j0(obj3, iM0, yVar3, obj4, i20, jZ3, jZ4, c0Var6.f40308b, c0Var6.f40309c)));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z12 = z12;
        }
        if (zBooleanValue) {
            final int i21 = 1;
            this.f47947m.c(1, new l1.k() { // from class: p1.o
                @Override // l1.k
                public final void invoke(Object obj8) {
                    switch (i21) {
                        case 0:
                            i1.p0 p0Var3 = ((w0) yVar).f48179a;
                            ((i1.i0) obj8).j(iIntValue);
                            break;
                        default:
                            ((i1.i0) obj8).x((i1.y) yVar, iIntValue);
                            break;
                    }
                }
            });
        }
        if (w0Var2.f48184f != w0Var.f48184f) {
            final int i22 = 8;
            this.f47947m.c(10, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj8) {
                    i1.i0 i0Var = (i1.i0) obj8;
                    switch (i22) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
            if (w0Var.f48184f != null) {
                final int i23 = 9;
                this.f47947m.c(10, new l1.k() { // from class: p1.l
                    @Override // l1.k
                    public final void invoke(Object obj8) {
                        i1.i0 i0Var = (i1.i0) obj8;
                        switch (i23) {
                            case 0:
                                i0Var.w(w0Var.f48187i.f42840d);
                                break;
                            case 1:
                                w0 w0Var4 = w0Var;
                                boolean z14 = w0Var4.f48185g;
                                i0Var.getClass();
                                i0Var.r(w0Var4.f48185g);
                                break;
                            case 2:
                                w0 w0Var5 = w0Var;
                                i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                                break;
                            case 3:
                                i0Var.i(w0Var.f48183e);
                                break;
                            case 4:
                                w0 w0Var6 = w0Var;
                                i0Var.s(w0Var6.f48190m, w0Var6.l);
                                break;
                            case 5:
                                i0Var.b(w0Var.f48191n);
                                break;
                            case 6:
                                i0Var.C(w0Var.m());
                                break;
                            case 7:
                                i0Var.h(w0Var.f48192o);
                                break;
                            case 8:
                                i0Var.u(w0Var.f48184f);
                                break;
                            default:
                                i0Var.p(w0Var.f48184f);
                                break;
                        }
                    }
                });
            }
        }
        i2.v vVar = w0Var2.f48187i;
        i2.v vVar2 = w0Var.f48187i;
        if (vVar != vVar2) {
            i2.u uVar = this.f47942i;
            Object obj8 = vVar2.f42841e;
            uVar.getClass();
            final int i24 = 0;
            this.f47947m.c(2, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i24) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f47947m.c(14, new k3.j(this.Q, 12));
        }
        if (z13) {
            final int i25 = 1;
            this.f47947m.c(3, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i25) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (z12 || z11) {
            final int i26 = 2;
            this.f47947m.c(-1, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i26) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (z12) {
            final int i27 = 3;
            this.f47947m.c(4, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i27) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (z11 || w0Var2.f48190m != w0Var.f48190m) {
            final int i28 = 4;
            this.f47947m.c(5, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i28) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (w0Var2.f48191n != w0Var.f48191n) {
            final int i29 = 5;
            this.f47947m.c(6, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i29) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (w0Var2.m() != w0Var.m()) {
            final int i30 = 6;
            this.f47947m.c(7, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i30) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        if (!w0Var2.f48192o.equals(w0Var.f48192o)) {
            final int i31 = 7;
            this.f47947m.c(12, new l1.k() { // from class: p1.l
                @Override // l1.k
                public final void invoke(Object obj9) {
                    i1.i0 i0Var = (i1.i0) obj9;
                    switch (i31) {
                        case 0:
                            i0Var.w(w0Var.f48187i.f42840d);
                            break;
                        case 1:
                            w0 w0Var4 = w0Var;
                            boolean z14 = w0Var4.f48185g;
                            i0Var.getClass();
                            i0Var.r(w0Var4.f48185g);
                            break;
                        case 2:
                            w0 w0Var5 = w0Var;
                            i0Var.onPlayerStateChanged(w0Var5.l, w0Var5.f48183e);
                            break;
                        case 3:
                            i0Var.i(w0Var.f48183e);
                            break;
                        case 4:
                            w0 w0Var6 = w0Var;
                            i0Var.s(w0Var6.f48190m, w0Var6.l);
                            break;
                        case 5:
                            i0Var.b(w0Var.f48191n);
                            break;
                        case 6:
                            i0Var.C(w0Var.m());
                            break;
                        case 7:
                            i0Var.h(w0Var.f48192o);
                            break;
                        case 8:
                            i0Var.u(w0Var.f48184f);
                            break;
                        default:
                            i0Var.p(w0Var.f48184f);
                            break;
                    }
                }
            });
        }
        h1();
        this.f47947m.b();
        if (w0Var2.f48193p != w0Var.f48193p) {
            Iterator it = this.f47948n.iterator();
            while (it.hasNext()) {
                ((v) it.next()).f48170a.k1();
            }
        }
    }

    public final void k1() {
        int iU0 = U0();
        mb.b bVar = this.A;
        hx0 hx0Var = this.f47960z;
        boolean z10 = false;
        if (iU0 != 1) {
            if (iU0 == 2 || iU0 == 3) {
                l1();
                boolean z11 = this.f47941h0.f48193p;
                if (T0() && !z11) {
                    z10 = true;
                }
                hx0Var.h(z10);
                bVar.b(T0());
                return;
            }
            if (iU0 != 4) {
                throw new IllegalStateException();
            }
        }
        hx0Var.h(false);
        bVar.b(false);
    }

    public final void l1() {
        this.f47933d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f47954t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = l1.y.f44830a;
            Locale locale = Locale.US;
            String strH = l1.d.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f47930b0) {
                throw new IllegalStateException(strH);
            }
            l1.a.t("ExoPlayerImpl", strH, this.f47932c0 ? null : new IllegalStateException());
            this.f47932c0 = true;
        }
    }
}
