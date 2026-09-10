package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2918Ys implements Handler.Callback, InterfaceC4307pO, InterfaceC4853vd0, NO, InterfaceC4960wn, XU {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public C2892Xs J;
    public long K;
    public int L;
    public boolean M;
    public C2321Bs N;
    public long O = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L9[] f4046a;
    public final Set b;
    public final L9[] c;
    public final AbstractC4129nM d;
    public final C4941wd0 e;
    public final C4696tn f;
    public final F8 g;
    public final Qa0 h;
    public final HandlerThread i;
    public final Looper j;
    public final Fc0 k;
    public final Ec0 l;
    public final long m;
    public final C5048xn n;
    public final ArrayList o;
    public final InterfaceC2412Ff p;
    public final C2529Js q;
    public final C4834vO r;
    public final OO s;
    public final C4608sn t;
    public final long u;
    public P30 v;
    public DU w;
    public C2840Vs x;
    public boolean y;
    public boolean z;

    public C2918Ys(L9[] l9Arr, AbstractC4129nM abstractC4129nM, C4941wd0 c4941wd0, C4696tn c4696tn, F8 f8, int i, boolean z, InterfaceC3050b4 interfaceC3050b4, P30 p30, C4608sn c4608sn, long j, boolean z2, Looper looper, InterfaceC2412Ff interfaceC2412Ff, C2529Js c2529Js, WU wu) {
        this.q = c2529Js;
        this.f4046a = l9Arr;
        this.d = abstractC4129nM;
        this.e = c4941wd0;
        this.f = c4696tn;
        this.g = f8;
        this.D = i;
        this.E = z;
        this.v = p30;
        this.t = c4608sn;
        this.u = j;
        this.z = z2;
        this.p = interfaceC2412Ff;
        this.m = c4696tn.g;
        DU duG = DU.g(c4941wd0);
        this.w = duG;
        this.x = new C2840Vs(duG);
        this.c = new L9[l9Arr.length];
        for (int i2 = 0; i2 < l9Arr.length; i2++) {
            L9 l9 = l9Arr[i2];
            l9.d = i2;
            l9.e = wu;
            this.c[i2] = l9;
        }
        this.n = new C5048xn(this, interfaceC2412Ff);
        this.o = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.k = new Fc0();
        this.l = new Ec0();
        abstractC4129nM.f4739a = this;
        abstractC4129nM.b = f8;
        this.M = true;
        Oa0 oa0 = (Oa0) interfaceC2412Ff;
        Qa0 qa0A = oa0.a(looper, null);
        this.r = new C4834vO(interfaceC3050b4, qa0A);
        this.s = new OO(this, interfaceC3050b4, qa0A, wu);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.j = looper2;
        this.h = oa0.a(looper2, this);
    }

    public static Pair G(Gc0 gc0, C2892Xs c2892Xs, boolean z, int i, boolean z2, Fc0 fc0, Ec0 ec0) {
        Object objH;
        Gc0 gc1 = c2892Xs.f3997a;
        if (gc0.q()) {
            return null;
        }
        Gc0 gc2 = gc1.q() ? gc0 : gc1;
        try {
            Pair pairJ = gc2.j(fc0, ec0, c2892Xs.b, c2892Xs.c);
            if (gc0.equals(gc2)) {
                return pairJ;
            }
            if (gc0.b(pairJ.first) != -1) {
                return (gc2.h(pairJ.first, ec0).f && gc2.n(ec0.c, fc0, 0L).o == gc2.b(pairJ.first)) ? gc0.j(fc0, ec0, gc0.h(pairJ.first, ec0).c, c2892Xs.c) : pairJ;
            }
            if (z && (objH = H(fc0, ec0, i, z2, pairJ.first, gc2, gc0)) != null) {
                return gc0.j(fc0, ec0, gc0.h(objH, ec0).c, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object H(Fc0 fc0, Ec0 ec0, int i, boolean z, Object obj, Gc0 gc0, Gc0 gc1) {
        int iB = gc0.b(obj);
        int i2 = gc0.i();
        int iD = iB;
        int iB2 = -1;
        for (int i3 = 0; i3 < i2 && iB2 == -1; i3++) {
            iD = gc0.d(iD, ec0, fc0, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = gc1.b(gc0.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return gc1.m(iB2);
    }

    public static void M(L9 l9, long j) {
        l9.k = true;
        if (l9 instanceof Yb0) {
            Yb0 yb0 = (Yb0) l9;
            FW.s(yb0.k);
            yb0.A = j;
        }
    }

    public static void b(ZU zu) {
        synchronized (zu) {
        }
        try {
            zu.f4072a.handleMessage(zu.d, zu.e);
        } finally {
            zu.b(true);
        }
    }

    public static boolean r(L9 l9) {
        return l9.f != 0;
    }

    public final void A(int i, int i2, D60 d60) throws Throwable {
        this.x.a(1);
        OO oo = this.s;
        oo.getClass();
        FW.h(i >= 0 && i <= i2 && i2 <= oo.b.size());
        oo.j = d60;
        oo.g(i, i2);
        k(oo.b(), false);
    }

    public final void B() throws C2321Bs {
        float f = this.n.getPlaybackParameters().f3024a;
        C4834vO c4834vO = this.r;
        C4482rO c4482rO = c4834vO.h;
        C4482rO c4482rO2 = c4834vO.i;
        boolean z = true;
        for (C4482rO c4482rO3 = c4482rO; c4482rO3 != null && c4482rO3.d; c4482rO3 = c4482rO3.l) {
            C4941wd0 c4941wd0G = c4482rO3.g(f, this.w.f2971a);
            C4941wd0 c4941wd0 = c4482rO3.n;
            if (c4941wd0 != null) {
                int length = c4941wd0.c.length;
                InterfaceC3299dt[] interfaceC3299dtArr = c4941wd0G.c;
                if (length == interfaceC3299dtArr.length) {
                    int i = 0;
                    while (true) {
                        if (i >= interfaceC3299dtArr.length) {
                            if (c4482rO3 == c4482rO2) {
                                z = false;
                            }
                        } else if (c4941wd0G.a(c4941wd0, i)) {
                            i++;
                        }
                    }
                }
            }
            if (z) {
                C4834vO c4834vO2 = this.r;
                C4482rO c4482rO4 = c4834vO2.h;
                boolean zK = c4834vO2.k(c4482rO4);
                boolean[] zArr = new boolean[this.f4046a.length];
                long jA = c4482rO4.a(c4941wd0G, this.w.r, zK, zArr);
                DU du = this.w;
                boolean z2 = (du.e == 4 || jA == du.r) ? false : true;
                DU du2 = this.w;
                this.w = n(du2.b, jA, du2.c, du2.d, z2, 5);
                if (z2) {
                    E(jA);
                }
                boolean[] zArr2 = new boolean[this.f4046a.length];
                int i2 = 0;
                while (true) {
                    L9[] l9Arr = this.f4046a;
                    if (i2 >= l9Arr.length) {
                        break;
                    }
                    L9 l9 = l9Arr[i2];
                    boolean zR = r(l9);
                    zArr2[i2] = zR;
                    W20 w20 = c4482rO4.c[i2];
                    if (zR) {
                        if (w20 != l9.g) {
                            c(l9);
                        } else if (zArr[i2]) {
                            long j = this.K;
                            l9.k = false;
                            l9.j = j;
                            l9.k(j, false);
                        }
                    }
                    i2++;
                }
                e(zArr2);
            } else {
                this.r.k(c4482rO3);
                if (c4482rO3.d) {
                    c4482rO3.a(c4941wd0G, Math.max(c4482rO3.f.b, this.K - c4482rO3.o), false, new boolean[c4482rO3.i.length]);
                }
            }
            j(true);
            if (this.w.e != 4) {
                t();
                e0();
                this.h.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[PHI: r4 r5 r7
  0x00c2: PHI (r4v4 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zO) = 
  (r4v3 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zO)
  (r4v10 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zO)
 binds: [B:34:0x0095, B:36:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:34:0x0095, B:36:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r7v2 long) = (r7v1 long), (r7v7 long) binds: [B:34:0x0095, B:36:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    public final void C(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        C5186zO c5186zO;
        long j2;
        boolean z5;
        List list;
        this.h.f3608a.removeMessages(2);
        this.N = null;
        this.B = false;
        C5048xn c5048xn = this.n;
        c5048xn.f = false;
        C3764j90 c3764j90 = c5048xn.f5245a;
        if (c3764j90.b) {
            c3764j90.b(c3764j90.getPositionUs());
            c3764j90.b = false;
        }
        this.K = 1000000000000L;
        for (L9 l9 : this.f4046a) {
            try {
                c(l9);
            } catch (C2321Bs | RuntimeException e) {
                AbstractC4038mJ.d("Disable failed.", e);
            }
        }
        if (z) {
            for (L9 l10 : this.f4046a) {
                if (this.b.remove(l10)) {
                    try {
                        l10.s();
                    } catch (RuntimeException e2) {
                        AbstractC4038mJ.d("Reset failed.", e2);
                    }
                }
            }
        }
        this.I = 0;
        DU du = this.w;
        C5186zO c5186zO2 = du.b;
        long jLongValue = du.r;
        if (this.w.b.a()) {
            j = this.w.c;
        } else {
            DU du2 = this.w;
            Ec0 ec0 = this.l;
            C5186zO c5186zO3 = du2.b;
            Gc0 gc0 = du2.f2971a;
            if (gc0.q() || gc0.h(c5186zO3.f4977a, ec0).f) {
                j = this.w.c;
            } else {
                j = this.w.r;
            }
        }
        if (z2) {
            this.J = null;
            Pair pairG = g(this.w.f2971a);
            c5186zO2 = (C5186zO) pairG.first;
            jLongValue = ((Long) pairG.second).longValue();
            boolean zEquals = c5186zO2.equals(this.w.b);
            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (zEquals) {
                c5186zO = c5186zO2;
                j2 = jLongValue;
                z5 = false;
            } else {
                z5 = true;
                c5186zO = c5186zO2;
                j2 = jLongValue;
            }
        } else {
            c5186zO = c5186zO2;
            j2 = jLongValue;
            z5 = false;
        }
        this.r.b();
        this.C = false;
        DU du3 = this.w;
        Gc0 gc1 = du3.f2971a;
        int i = du3.e;
        C2321Bs c2321Bs = z4 ? null : du3.f;
        C4062md0 c4062md0 = z5 ? C4062md0.d : du3.h;
        C4941wd0 c4941wd0 = z5 ? this.e : du3.i;
        if (z5) {
            C5086yC c5086yC = AC.b;
            list = C3965lY.e;
        } else {
            list = du3.j;
        }
        this.w = new DU(gc1, c5186zO, j, j2, i, c2321Bs, false, c4062md0, c4941wd0, list, c5186zO, du3.l, du3.m, du3.n, j2, 0L, j2, false);
        if (z3) {
            OO oo = this.s;
            HashMap map = oo.f;
            for (LO lo : map.values()) {
                try {
                    lo.f3352a.r(lo.b);
                } catch (RuntimeException e3) {
                    AbstractC4038mJ.d("Failed to release child source.", e3);
                }
                G9 g9 = lo.f3352a;
                C3692iN c3692iN = lo.c;
                g9.u(c3692iN);
                lo.f3352a.t(c3692iN);
            }
            map.clear();
            oo.g.clear();
            oo.k = false;
        }
    }

    public final void D() {
        C4482rO c4482rO = this.r.h;
        this.A = c4482rO != null && c4482rO.f.h && this.z;
    }

    public final void E(long j) {
        C4482rO c4482rO = this.r.h;
        long j2 = j + (c4482rO == null ? 1000000000000L : c4482rO.o);
        this.K = j2;
        this.n.f5245a.b(j2);
        for (L9 l9 : this.f4046a) {
            if (r(l9)) {
                long j3 = this.K;
                l9.k = false;
                l9.j = j3;
                l9.k(j3, false);
            }
        }
        for (C4482rO c4482rO2 = r0.h; c4482rO2 != null; c4482rO2 = c4482rO2.l) {
            for (InterfaceC3299dt interfaceC3299dt : c4482rO2.n.c) {
                if (interfaceC3299dt != null) {
                    interfaceC3299dt.e();
                }
            }
        }
    }

    public final void F(Gc0 gc0, Gc0 gc1) {
        if (gc0.q() && gc1.q()) {
            return;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC3950lJ.z(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z) throws C2321Bs {
        C5186zO c5186zO = this.r.h.f.f5033a;
        long jK = K(c5186zO, this.w.r, true, false);
        if (jK != this.w.r) {
            DU du = this.w;
            this.w = n(c5186zO, jK, du.c, du.d, z, 5);
        }
    }

    public final void J(C2892Xs c2892Xs) throws Throwable {
        long j;
        long j2;
        boolean z;
        C5186zO c5186zO;
        long j3;
        long j4;
        long j5;
        DU du;
        int i;
        this.x.a(1);
        Pair pairG = G(this.w.f2971a, c2892Xs, true, this.D, this.E, this.k, this.l);
        if (pairG == null) {
            Pair pairG2 = g(this.w.f2971a);
            c5186zO = (C5186zO) pairG2.first;
            long jLongValue = ((Long) pairG2.second).longValue();
            z = !this.w.f2971a.q();
            j2 = jLongValue;
            j = -9223372036854775807L;
        } else {
            Object obj = pairG.first;
            long jLongValue2 = ((Long) pairG.second).longValue();
            j = c2892Xs.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : jLongValue2;
            C5186zO c5186zOM = this.r.m(this.w.f2971a, obj, jLongValue2);
            if (c5186zOM.a()) {
                this.w.f2971a.h(c5186zOM.f4977a, this.l);
                j2 = this.l.f(c5186zOM.b) == c5186zOM.c ? this.l.g.c : 0L;
                z = true;
            } else {
                j2 = jLongValue2;
                z = c2892Xs.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            c5186zO = c5186zOM;
        }
        try {
            if (!this.w.f2971a.q()) {
                if (pairG == null) {
                    if (this.w.e != 1) {
                        W(4);
                    }
                    C(false, true, false, true);
                } else {
                    if (c5186zO.equals(this.w.b)) {
                        C4482rO c4482rO = this.r.h;
                        long jB = (c4482rO == null || !c4482rO.d || j2 == 0) ? j2 : c4482rO.f4928a.b(j2, this.v);
                        if (Ug0.W(jB) == Ug0.W(this.w.r) && ((i = (du = this.w).e) == 2 || i == 3)) {
                            long j6 = du.r;
                            this.w = n(c5186zO, j6, j, j6, z, 2);
                            return;
                        }
                        j4 = jB;
                    } else {
                        j4 = j2;
                    }
                    boolean z2 = this.w.e == 4;
                    C4834vO c4834vO = this.r;
                    long jK = K(c5186zO, j4, c4834vO.h != c4834vO.i, z2);
                    boolean z3 = (j2 != jK) | z;
                    try {
                        DU du2 = this.w;
                        Gc0 gc0 = du2.f2971a;
                        f0(gc0, c5186zO, gc0, du2.b, j);
                        z = z3;
                        j5 = jK;
                    } catch (Throwable th) {
                        th = th;
                        z = z3;
                        j3 = jK;
                        this.w = n(c5186zO, j3, j, j3, z, 2);
                        throw th;
                    }
                }
                this.w = n(c5186zO, j5, j, j5, z, 2);
            }
            this.J = c2892Xs;
            j5 = j2;
            this.w = n(c5186zO, j5, j, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j2;
        }
    }

    public final long K(C5186zO c5186zO, long j, boolean z, boolean z2) throws C2321Bs {
        b0();
        this.B = false;
        if (z2 || this.w.e == 3) {
            W(2);
        }
        C4834vO c4834vO = this.r;
        C4482rO c4482rO = c4834vO.h;
        C4482rO c4482rO2 = c4482rO;
        while (c4482rO2 != null && !c5186zO.equals(c4482rO2.f.f5033a)) {
            c4482rO2 = c4482rO2.l;
        }
        if (z || c4482rO != c4482rO2 || (c4482rO2 != null && c4482rO2.o + j < 0)) {
            L9[] l9Arr = this.f4046a;
            for (L9 l9 : l9Arr) {
                c(l9);
            }
            if (c4482rO2 != null) {
                while (c4834vO.h != c4482rO2) {
                    c4834vO.a();
                }
                c4834vO.k(c4482rO2);
                c4482rO2.o = 1000000000000L;
                e(new boolean[l9Arr.length]);
            }
        }
        if (c4482rO2 != null) {
            c4834vO.k(c4482rO2);
            if (!c4482rO2.d) {
                c4482rO2.f = c4482rO2.f.b(j);
            } else if (c4482rO2.e) {
                InterfaceC4395qO interfaceC4395qO = c4482rO2.f4928a;
                j = interfaceC4395qO.seekToUs(j);
                interfaceC4395qO.q(j - this.m);
            }
            E(j);
            t();
        } else {
            c4834vO.b();
            E(j);
        }
        j(false);
        this.h.d(2);
        return j;
    }

    public final void L(ZU zu) {
        Looper looper = zu.f;
        if (looper.getThread().isAlive()) {
            ((Oa0) this.p).a(looper, null).c(new RunnableC3976le0(10, this, zu));
        } else {
            AbstractC4038mJ.f();
            zu.b(false);
        }
    }

    public final void N(boolean z, AtomicBoolean atomicBoolean) {
        if (this.F != z) {
            this.F = z;
            if (!z) {
                for (L9 l9 : this.f4046a) {
                    if (!r(l9) && this.b.remove(l9)) {
                        l9.s();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(C2814Us c2814Us) throws Throwable {
        this.x.a(1);
        int i = c2814Us.c;
        D60 d60 = c2814Us.b;
        List list = c2814Us.f3847a;
        if (i != -1) {
            this.J = new C2892Xs(new C3171cV(list, d60), c2814Us.c, c2814Us.d);
        }
        OO oo = this.s;
        ArrayList arrayList = oo.b;
        oo.g(0, arrayList.size());
        k(oo.a(arrayList.size(), list, d60), false);
    }

    public final void P(boolean z) {
        if (z == this.H) {
            return;
        }
        this.H = z;
        if (z || !this.w.o) {
            return;
        }
        this.h.d(2);
    }

    public final void Q(boolean z) throws C2321Bs {
        this.z = z;
        D();
        if (this.A) {
            C4834vO c4834vO = this.r;
            if (c4834vO.i != c4834vO.h) {
                I(true);
                j(false);
            }
        }
    }

    public final void R(int i, int i2, boolean z, boolean z2) {
        this.x.a(z2 ? 1 : 0);
        C2840Vs c2840Vs = this.x;
        c2840Vs.f3897a = true;
        c2840Vs.f = true;
        c2840Vs.g = i2;
        this.w = this.w.c(i, z);
        this.B = false;
        for (C4482rO c4482rO = this.r.h; c4482rO != null; c4482rO = c4482rO.l) {
            for (InterfaceC3299dt interfaceC3299dt : c4482rO.n.c) {
                if (interfaceC3299dt != null) {
                    interfaceC3299dt.f(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.w.e;
        Qa0 qa0 = this.h;
        if (i3 == 3) {
            Z();
            qa0.d(2);
        } else if (i3 == 2) {
            qa0.d(2);
        }
    }

    public final void S(EU eu) {
        this.h.f3608a.removeMessages(16);
        C5048xn c5048xn = this.n;
        c5048xn.a(eu);
        EU playbackParameters = c5048xn.getPlaybackParameters();
        m(playbackParameters, playbackParameters.f3024a, true, true);
    }

    public final void T(int i) throws C2321Bs {
        this.D = i;
        Gc0 gc0 = this.w.f2971a;
        C4834vO c4834vO = this.r;
        c4834vO.f = i;
        if (!c4834vO.n(gc0)) {
            I(true);
        }
        j(false);
    }

    public final void U(boolean z) throws C2321Bs {
        this.E = z;
        Gc0 gc0 = this.w.f2971a;
        C4834vO c4834vO = this.r;
        c4834vO.g = z;
        if (!c4834vO.n(gc0)) {
            I(true);
        }
        j(false);
    }

    public final void V(D60 d60) throws Throwable {
        this.x.a(1);
        OO oo = this.s;
        int size = oo.b.size();
        if (d60.b.length != size) {
            d60 = d60.a().b(0, size);
        }
        oo.j = d60;
        k(oo.b(), false);
    }

    public final void W(int i) {
        DU du = this.w;
        if (du.e != i) {
            if (i != 2) {
                this.O = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            this.w = du.e(i);
        }
    }

    public final boolean X() {
        DU du = this.w;
        return du.l && du.m == 0;
    }

    public final boolean Y(Gc0 gc0, C5186zO c5186zO) {
        if (c5186zO.a() || gc0.q()) {
            return false;
        }
        int i = gc0.h(c5186zO.f4977a, this.l).c;
        Fc0 fc0 = this.k;
        gc0.o(i, fc0);
        return fc0.a() && fc0.i && fc0.f != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public final void Z() {
        this.B = false;
        C5048xn c5048xn = this.n;
        c5048xn.f = true;
        c5048xn.f5245a.c();
        for (L9 l9 : this.f4046a) {
            if (r(l9)) {
                FW.s(l9.f == 1);
                l9.f = 2;
                l9.m();
            }
        }
    }

    public final void a(C2814Us c2814Us, int i) throws Throwable {
        this.x.a(1);
        OO oo = this.s;
        if (i == -1) {
            i = oo.b.size();
        }
        k(oo.a(i, c2814Us.f3847a, c2814Us.b), false);
    }

    public final void a0(boolean z, boolean z2) {
        C(z || !this.F, false, true, false);
        this.x.a(z2 ? 1 : 0);
        this.f.b(true);
        W(1);
    }

    public final void b0() {
        int i;
        C5048xn c5048xn = this.n;
        c5048xn.f = false;
        C3764j90 c3764j90 = c5048xn.f5245a;
        if (c3764j90.b) {
            c3764j90.b(c3764j90.getPositionUs());
            c3764j90.b = false;
        }
        for (L9 l9 : this.f4046a) {
            if (r(l9) && (i = l9.f) == 2) {
                FW.s(i == 2);
                l9.f = 1;
                l9.n();
            }
        }
    }

    public final void c(L9 l9) {
        if (r(l9)) {
            C5048xn c5048xn = this.n;
            if (l9 == c5048xn.c) {
                c5048xn.d = null;
                c5048xn.c = null;
                c5048xn.e = true;
            }
            int i = l9.f;
            if (i == 2) {
                FW.s(i == 2);
                l9.f = 1;
                l9.n();
            }
            FW.s(l9.f == 1);
            l9.b.m();
            l9.f = 0;
            l9.g = null;
            l9.h = null;
            l9.k = false;
            l9.i();
            this.I--;
        }
    }

    public final void c0() {
        C4482rO c4482rO = this.r.j;
        boolean z = this.C || (c4482rO != null && c4482rO.f4928a.isLoading());
        DU du = this.w;
        if (z != du.g) {
            this.w = new DU(du.f2971a, du.b, du.c, du.d, du.e, du.f, z, du.h, du.i, du.j, du.k, du.l, du.m, du.n, du.p, du.q, du.r, du.o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0353  */
    /* JADX WARN: Code duplicated, block: B:283:0x046e  */
    /* JADX WARN: Code duplicated, block: B:285:0x0475  */
    /* JADX WARN: Code duplicated, block: B:287:0x0479  */
    /* JADX WARN: Code duplicated, block: B:289:0x047f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0484 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x0488  */
    /* JADX WARN: Code duplicated, block: B:296:0x048d  */
    /* JADX WARN: Code duplicated, block: B:298:0x049d  */
    /* JADX WARN: Code duplicated, block: B:299:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:302:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:309:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:312:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:315:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:317:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0546  */
    /* JADX WARN: Code duplicated, block: B:349:0x054a  */
    /* JADX WARN: Code duplicated, block: B:352:0x0553  */
    /* JADX WARN: Code duplicated, block: B:360:0x056e  */
    /* JADX WARN: Code duplicated, block: B:362:0x0574  */
    /* JADX WARN: Code duplicated, block: B:364:0x057c  */
    /* JADX WARN: Code duplicated, block: B:366:0x0580  */
    /* JADX WARN: Code duplicated, block: B:372:0x0597  */
    /* JADX WARN: Code duplicated, block: B:374:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:381:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:384:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:386:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:388:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:389:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:405:0x0629  */
    /* JADX WARN: Code duplicated, block: B:411:0x063f  */
    /* JADX WARN: Code duplicated, block: B:418:0x064c  */
    /* JADX WARN: Code duplicated, block: B:421:0x0653  */
    /* JADX WARN: Code duplicated, block: B:430:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:483:0x05de A[EDGE_INSN: B:483:0x05de->B:391:0x05de BREAK  A[LOOP:8: B:382:0x05b5->B:390:0x05d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x05d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x047d, code lost:
    
        if (s() != false) goto L289;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:362:0x0574, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2321Bs {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2918Ys.d():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(C4941wd0 c4941wd0) {
        InterfaceC3299dt[] interfaceC3299dtArr = c4941wd0.c;
        C4696tn c4696tn = this.f;
        int iMax = c4696tn.f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                L9[] l9Arr = this.f4046a;
                int length = l9Arr.length;
                int i3 = com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i < length) {
                    if (interfaceC3299dtArr[i] != null) {
                        switch (l9Arr[i].f3341a) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE, i2);
                }
            }
        }
        c4696tn.h = iMax;
        c4696tn.f5051a.a(iMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    public final void e(boolean[] zArr) throws C2321Bs {
        L9[] l9Arr;
        Set set;
        C4834vO c4834vO;
        C4482rO c4482rO;
        int i;
        L9[] l9Arr2;
        InterfaceC4042mN interfaceC4042mN;
        C4834vO c4834vO2 = this.r;
        C4482rO c4482rO2 = c4834vO2.i;
        C4941wd0 c4941wd0 = c4482rO2.n;
        int i2 = 0;
        while (true) {
            l9Arr = this.f4046a;
            int length = l9Arr.length;
            set = this.b;
            if (i2 >= length) {
                break;
            }
            if (!c4941wd0.b(i2) && set.remove(l9Arr[i2])) {
                l9Arr[i2].s();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < l9Arr.length) {
            if (c4941wd0.b(i3)) {
                boolean z = zArr[i3];
                L9 l9 = l9Arr[i3];
                if (r(l9)) {
                    c4834vO = c4834vO2;
                    c4482rO = c4482rO2;
                    i = i3;
                    l9Arr2 = l9Arr;
                } else {
                    C4482rO c4482rO3 = c4834vO2.i;
                    boolean z2 = c4482rO3 == c4834vO2.h;
                    C4941wd0 c4941wd1 = c4482rO3.n;
                    C5196zY c5196zY = c4941wd1.b[i3];
                    InterfaceC3299dt interfaceC3299dt = c4941wd1.c[i3];
                    int length2 = interfaceC3299dt != null ? interfaceC3299dt.length() : 0;
                    C4619sw[] c4619swArr = new C4619sw[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        c4619swArr[i4] = interfaceC3299dt.getFormat(i4);
                    }
                    boolean z3 = X() && this.w.e == 3;
                    boolean z4 = !z && z3;
                    this.I++;
                    set.add(l9);
                    W20 w20 = c4482rO3.c[i3];
                    c4834vO = c4834vO2;
                    c4482rO = c4482rO2;
                    long j = this.K;
                    long jE = c4482rO3.e();
                    i = i3;
                    l9Arr2 = l9Arr;
                    long j2 = c4482rO3.o;
                    FW.s(l9.f == 0);
                    l9.c = c5196zY;
                    l9.f = 1;
                    l9.j(z4, z2);
                    l9.r(c4619swArr, w20, jE, j2);
                    l9.k = false;
                    l9.j = j;
                    l9.k(j, z4);
                    l9.handleMessage(11, new C2788Ts(this));
                    C5048xn c5048xn = this.n;
                    c5048xn.getClass();
                    InterfaceC4042mN interfaceC4042mND = l9.d();
                    if (interfaceC4042mND != null && interfaceC4042mND != (interfaceC4042mN = c5048xn.d)) {
                        if (interfaceC4042mN != null) {
                            throw new C2321Bs(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c5048xn.d = interfaceC4042mND;
                        c5048xn.c = l9;
                        ((C4481rN) interfaceC4042mND).a(c5048xn.f5245a.e);
                    }
                    if (z3) {
                        FW.s(l9.f == 1);
                        l9.f = 2;
                        l9.m();
                    }
                }
            } else {
                c4834vO = c4834vO2;
                c4482rO = c4482rO2;
                i = i3;
                l9Arr2 = l9Arr;
            }
            i3 = i + 1;
            c4834vO2 = c4834vO;
            c4482rO2 = c4482rO;
            l9Arr = l9Arr2;
        }
        c4482rO2.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    public final void e0() {
        EU playbackParameters;
        C4482rO c4482rO = this.r.h;
        if (c4482rO == null) {
            return;
        }
        long discontinuity = c4482rO.d ? c4482rO.f4928a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            E(discontinuity);
            if (discontinuity != this.w.r) {
                DU du = this.w;
                this.w = n(du.b, discontinuity, du.c, discontinuity, true, 5);
            }
        } else {
            C5048xn c5048xn = this.n;
            boolean z = c4482rO != this.r.i;
            L9 l9 = c5048xn.c;
            C3764j90 c3764j90 = c5048xn.f5245a;
            if (l9 == null || l9.g() || (!c5048xn.c.h() && (z || c5048xn.c.f()))) {
                c5048xn.e = true;
                if (c5048xn.f) {
                    c3764j90.c();
                }
            } else {
                InterfaceC4042mN interfaceC4042mN = c5048xn.d;
                interfaceC4042mN.getClass();
                long positionUs = interfaceC4042mN.getPositionUs();
                if (!c5048xn.e) {
                    c3764j90.b(positionUs);
                    playbackParameters = interfaceC4042mN.getPlaybackParameters();
                    if (!playbackParameters.equals(c3764j90.e)) {
                        c3764j90.a(playbackParameters);
                        ((C2918Ys) c5048xn.b).h.a(16, playbackParameters).b();
                    }
                } else if (positionUs >= c3764j90.getPositionUs()) {
                    c5048xn.e = false;
                    if (c5048xn.f) {
                        c3764j90.c();
                    }
                    c3764j90.b(positionUs);
                    playbackParameters = interfaceC4042mN.getPlaybackParameters();
                    if (!playbackParameters.equals(c3764j90.e)) {
                        c3764j90.a(playbackParameters);
                        ((C2918Ys) c5048xn.b).h.a(16, playbackParameters).b();
                    }
                } else if (c3764j90.b) {
                    c3764j90.b(c3764j90.getPositionUs());
                    c3764j90.b = false;
                }
            }
            long positionUs2 = c5048xn.getPositionUs();
            this.K = positionUs2;
            long j = positionUs2 - c4482rO.o;
            long j2 = this.w.r;
            if (!this.o.isEmpty() && !this.w.b.a()) {
                if (this.M) {
                    this.M = false;
                }
                DU du2 = this.w;
                du2.f2971a.b(du2.b.f4977a);
                int iMin = Math.min(this.L, this.o.size());
                if (iMin > 0) {
                    AbstractC3950lJ.z(this.o.get(iMin - 1));
                }
                if (iMin < this.o.size()) {
                    AbstractC3950lJ.z(this.o.get(iMin));
                }
                this.L = iMin;
            }
            this.w.r = j;
        }
        this.w.p = this.r.j.d();
        DU du3 = this.w;
        long j3 = du3.p;
        C4482rO c4482rO2 = this.r.j;
        du3.q = c4482rO2 == null ? 0L : Math.max(0L, j3 - (this.K - c4482rO2.o));
        DU du4 = this.w;
        if (du4.l && du4.e == 3 && Y(du4.f2971a, du4.b)) {
            DU du5 = this.w;
            float f = 1.0f;
            if (du5.n.f3024a == 1.0f) {
                C4608sn c4608sn = this.t;
                long jF = f(du5.f2971a, du5.b.f4977a, du5.r);
                long j4 = this.w.p;
                C4482rO c4482rO3 = this.r.j;
                long jMax = c4482rO3 == null ? 0L : Math.max(0L, j4 - (this.K - c4482rO3.o));
                if (c4608sn.d != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    long j5 = jF - jMax;
                    long j6 = c4608sn.n;
                    if (j6 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        c4608sn.n = j5;
                        c4608sn.o = 0L;
                    } else {
                        float f2 = c4608sn.c;
                        float f3 = 1.0f - f2;
                        long jMax2 = Math.max(j5, (long) ((j5 * f3) + (j6 * f2)));
                        c4608sn.n = jMax2;
                        c4608sn.o = (long) ((f3 * Math.abs(j5 - jMax2)) + (f2 * c4608sn.o));
                    }
                    if (c4608sn.m == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || SystemClock.elapsedRealtime() - c4608sn.m >= 1000) {
                        c4608sn.m = SystemClock.elapsedRealtime();
                        long j7 = (c4608sn.o * 3) + c4608sn.n;
                        if (c4608sn.i > j7) {
                            float fL = Ug0.L(1000L);
                            long[] jArr = {j7, c4608sn.f, c4608sn.i - (((long) ((c4608sn.l - 1.0f) * fL)) + ((long) ((c4608sn.j - 1.0f) * fL)))};
                            long j8 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j9 = jArr[i];
                                if (j9 > j8) {
                                    j8 = j9;
                                }
                            }
                            c4608sn.i = j8;
                        } else {
                            long jK = Ug0.k(jF - ((long) (Math.max(0.0f, c4608sn.l - 1.0f) / 1.0E-7f)), c4608sn.i, j7);
                            c4608sn.i = jK;
                            long j10 = c4608sn.h;
                            if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jK > j10) {
                                c4608sn.i = j10;
                            }
                        }
                        long j11 = jF - c4608sn.i;
                        if (Math.abs(j11) < c4608sn.f4998a) {
                            c4608sn.l = 1.0f;
                        } else {
                            c4608sn.l = Ug0.i((1.0E-7f * j11) + 1.0f, c4608sn.k, c4608sn.j);
                        }
                        f = c4608sn.l;
                    } else {
                        f = c4608sn.l;
                    }
                }
                if (this.n.getPlaybackParameters().f3024a != f) {
                    EU eu = new EU(f, this.w.n.b);
                    this.h.f3608a.removeMessages(16);
                    this.n.a(eu);
                    m(this.w.n, this.n.getPlaybackParameters().f3024a, false, false);
                }
            }
        }
    }

    public final long f(Gc0 gc0, Object obj, long j) {
        Ec0 ec0 = this.l;
        int i = gc0.h(obj, ec0).c;
        Fc0 fc0 = this.k;
        gc0.o(i, fc0);
        return (fc0.f != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && fc0.a() && fc0.i) ? Ug0.L(Ug0.x(fc0.g) - fc0.f) - (j + ec0.e) : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public final void f0(Gc0 gc0, C5186zO c5186zO, Gc0 gc1, C5186zO c5186zO2, long j) {
        if (!Y(gc0, c5186zO)) {
            EU eu = c5186zO.a() ? EU.d : this.w.n;
            C5048xn c5048xn = this.n;
            if (c5048xn.getPlaybackParameters().equals(eu)) {
                return;
            }
            this.h.f3608a.removeMessages(16);
            c5048xn.a(eu);
            m(this.w.n, eu.f3024a, false, false);
            return;
        }
        Object obj = c5186zO.f4977a;
        Ec0 ec0 = this.l;
        int i = gc0.h(obj, ec0).c;
        Fc0 fc0 = this.k;
        gc0.o(i, fc0);
        C3164cO c3164cO = fc0.k;
        int i2 = Ug0.f3833a;
        C4608sn c4608sn = this.t;
        c4608sn.getClass();
        c4608sn.d = Ug0.L(c3164cO.f4220a);
        c4608sn.g = Ug0.L(c3164cO.b);
        c4608sn.h = Ug0.L(c3164cO.c);
        float f = c3164cO.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c4608sn.k = f;
        float f2 = c3164cO.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        c4608sn.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c4608sn.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        c4608sn.a();
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            c4608sn.e = f(gc0, obj, j);
            c4608sn.a();
            return;
        }
        if (Ug0.a(!gc1.q() ? gc1.n(gc1.h(c5186zO2.f4977a, ec0).c, fc0, 0L).f3074a : null, fc0.f3074a)) {
            return;
        }
        c4608sn.e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c4608sn.a();
    }

    public final Pair g(Gc0 gc0) {
        if (gc0.q()) {
            return Pair.create(DU.s, 0L);
        }
        Pair pairJ = gc0.j(this.k, this.l, gc0.a(this.E), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        C5186zO c5186zOM = this.r.m(gc0, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (c5186zOM.a()) {
            Object obj = c5186zOM.f4977a;
            Ec0 ec0 = this.l;
            gc0.h(obj, ec0);
            jLongValue = c5186zOM.c == ec0.f(c5186zOM.b) ? ec0.g.c : 0L;
        }
        return Pair.create(c5186zOM, Long.valueOf(jLongValue));
    }

    public final synchronized void g0(C2762Ss c2762Ss, long j) {
        ((Oa0) this.p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c2762Ss.get()).booleanValue() && j > 0) {
            try {
                this.p.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            ((Oa0) this.p).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void h(InterfaceC4395qO interfaceC4395qO) {
        C4482rO c4482rO = this.r.j;
        if (c4482rO == null || c4482rO.f4928a != interfaceC4395qO) {
            return;
        }
        long j = this.K;
        if (c4482rO != null) {
            FW.s(c4482rO.l == null);
            if (c4482rO.d) {
                c4482rO.f4928a.reevaluateBuffer(j - c4482rO.o);
            }
        }
        t();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        C4482rO c4482rO;
        Qa0 qa0 = this.h;
        int i = 1000;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((C2892Xs) message.obj);
                    break;
                case 4:
                    S((EU) message.obj);
                    break;
                case 5:
                    this.v = (P30) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    l((InterfaceC4395qO) message.obj);
                    break;
                case 9:
                    h((InterfaceC4395qO) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    ZU zu = (ZU) message.obj;
                    zu.getClass();
                    if (zu.f != this.j) {
                        qa0.a(15, zu).b();
                    } else {
                        b(zu);
                        int i2 = this.w.e;
                        if (i2 == 3 || i2 == 2) {
                            qa0.d(2);
                        }
                    }
                    break;
                case 15:
                    L((ZU) message.obj);
                    break;
                case 16:
                    EU eu = (EU) message.obj;
                    m(eu, eu.f3024a, true, false);
                    break;
                case 17:
                    O((C2814Us) message.obj);
                    break;
                case 18:
                    a((C2814Us) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC3950lJ.z(message.obj);
                    w();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (D60) message.obj);
                    break;
                case 21:
                    V((D60) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                    P(message.arg1 == 1);
                    break;
                case 25:
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (C2321Bs e) {
            e = e;
            if (e.h == 1 && (c4482rO = this.r.i) != null) {
                e = e.a(c4482rO.f.f5033a);
            }
            if (e.n && this.N == null) {
                AbstractC4038mJ.g("Recoverable renderer error", e);
                this.N = e;
                Pa0 pa0A = qa0.a(25, e);
                qa0.getClass();
                Message message2 = pa0A.f3557a;
                message2.getClass();
                qa0.f3608a.sendMessageAtFrontOfQueue(message2);
                pa0A.a();
            } else {
                C2321Bs c2321Bs = this.N;
                if (c2321Bs != null) {
                    c2321Bs.addSuppressed(e);
                    e = this.N;
                }
                AbstractC4038mJ.d("Playback error", e);
                a0(true, false);
                this.w = this.w.d(e);
            }
        } catch (KT e2) {
            boolean z = e2.f3315a;
            int i3 = e2.b;
            if (i3 == 1) {
                i = z ? 3001 : 3003;
            } else if (i3 == 4) {
                i = z ? B30.BANNER_AUTO_REDIRECT_VALUE : 3004;
            }
            i(e2, i);
        } catch (C2863Wp e3) {
            i(e3, e3.f3943a);
        } catch (C3529ga e4) {
            i(e4, 1002);
        } catch (C4604sl e5) {
            i(e5, e5.f4995a);
        } catch (IOException e6) {
            i(e6, 2000);
        } catch (RuntimeException e7) {
            C2321Bs c2321Bs2 = new C2321Bs(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC4038mJ.d("Playback error", c2321Bs2);
            a0(true, false);
            this.w = this.w.d(c2321Bs2);
        }
        u();
        return true;
    }

    public final void i(IOException iOException, int i) {
        C2321Bs c2321Bs = new C2321Bs(0, iOException, i);
        C4482rO c4482rO = this.r.h;
        if (c4482rO != null) {
            c2321Bs = c2321Bs.a(c4482rO.f.f5033a);
        }
        AbstractC4038mJ.d("Playback error", c2321Bs);
        a0(false, false);
        this.w = this.w.d(c2321Bs);
    }

    public final void j(boolean z) {
        C4482rO c4482rO = this.r.j;
        C5186zO c5186zO = c4482rO == null ? this.w.b : c4482rO.f.f5033a;
        boolean z2 = !this.w.k.equals(c5186zO);
        if (z2) {
            this.w = this.w.a(c5186zO);
        }
        DU du = this.w;
        du.p = c4482rO == null ? du.r : c4482rO.d();
        DU du2 = this.w;
        long j = du2.p;
        C4482rO c4482rO2 = this.r.j;
        du2.q = c4482rO2 != null ? Math.max(0L, j - (this.K - c4482rO2.o)) : 0L;
        if ((z2 || z) && c4482rO != null && c4482rO.d) {
            d0(c4482rO.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x02e8 A[Catch: all -> 0x02ed, TryCatch #4 {all -> 0x02ed, blocks: (B:165:0x02e2, B:167:0x02e8, B:172:0x02f4, B:174:0x02ff, B:176:0x0305, B:178:0x030f, B:179:0x031c, B:180:0x031f, B:184:0x032a), top: B:250:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:217:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:224:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:226:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:235:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:239:0x0428  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0201  */
    public final void k(Gc0 gc0, boolean z) throws Throwable {
        C5186zO c5186zO;
        int i;
        int i2;
        long j;
        int iA;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        long j2;
        boolean z6;
        long j3;
        C2866Ws c2866Ws;
        int i3;
        int iA3;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        long j4;
        boolean z11;
        boolean z12;
        long jK;
        long j5;
        long j6;
        DU du = this.w;
        C2892Xs c2892Xs = this.J;
        C4834vO c4834vO = this.r;
        int i4 = this.D;
        boolean z13 = this.E;
        Fc0 fc0 = this.k;
        Ec0 ec0 = this.l;
        if (gc0.q()) {
            c2866Ws = new C2866Ws(DU.s, 0L, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false, true, false);
            j = 0;
        } else {
            C5186zO c5186zO2 = du.b;
            Object obj = c5186zO2.f4977a;
            Gc0 gc1 = du.f2971a;
            boolean z14 = gc1.q() || gc1.h(c5186zO2.f4977a, ec0).f;
            long jLongValue = (du.b.a() || z14) ? du.c : du.r;
            if (c2892Xs != null) {
                i = 4;
                Pair pairG = G(gc0, c2892Xs, true, i4, z13, fc0, ec0);
                if (pairG == null) {
                    iA3 = gc0.a(z13);
                    jLongValue = jLongValue;
                    z9 = false;
                    z8 = false;
                    z10 = true;
                } else {
                    if (c2892Xs.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        iA3 = gc0.h(pairG.first, ec0).c;
                        jLongValue = jLongValue;
                        z7 = false;
                    } else {
                        obj = pairG.first;
                        jLongValue = ((Long) pairG.second).longValue();
                        iA3 = -1;
                        z7 = true;
                    }
                    z8 = du.e == 4;
                    z9 = z7;
                    z10 = false;
                }
                z4 = z9;
                z2 = z8;
                z3 = z10;
                c5186zO = c5186zO2;
                i2 = -1;
                j = 0;
                iA = iA3;
            } else {
                c5186zO = c5186zO2;
                i = 4;
                if (du.f2971a.q()) {
                    iA = gc0.a(z13);
                    i2 = -1;
                } else {
                    i2 = -1;
                    if (gc0.b(obj) == -1) {
                        Object objH = H(fc0, ec0, i4, z13, obj, du.f2971a, gc0);
                        if (objH == null) {
                            iA2 = gc0.a(z13);
                            z5 = true;
                        } else {
                            iA2 = gc0.h(objH, ec0).c;
                            z5 = false;
                        }
                        iA = iA2;
                        z3 = z5;
                        jLongValue = jLongValue;
                        c5186zO = c5186zO;
                        j = 0;
                        z2 = false;
                        z4 = false;
                    } else if (jLongValue == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        iA = gc0.h(obj, ec0).c;
                    } else if (z14) {
                        c5186zO = c5186zO;
                        du.f2971a.h(c5186zO.f4977a, ec0);
                        j = 0;
                        if (du.f2971a.n(ec0.c, fc0, 0L).o == du.f2971a.b(c5186zO.f4977a)) {
                            Pair pairJ = gc0.j(fc0, ec0, gc0.h(obj, ec0).c, jLongValue + ec0.e);
                            obj = pairJ.first;
                            jLongValue = ((Long) pairJ.second).longValue();
                        } else {
                            jLongValue = jLongValue;
                        }
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        c5186zO = c5186zO;
                        j = 0;
                        jLongValue = jLongValue;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                j = 0;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iA != i2) {
                Pair pairJ2 = gc0.j(fc0, ec0, iA, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                obj = pairJ2.first;
                jLongValue = ((Long) pairJ2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j2 = jLongValue;
            }
            C5186zO c5186zOM = c4834vO.m(gc0, obj, jLongValue);
            int i5 = c5186zOM.e;
            boolean z15 = c5186zO.f4977a.equals(obj) && !c5186zO.a() && !c5186zOM.a() && (i5 == i2 || ((i3 = c5186zO.e) != i2 && i5 >= i3));
            Ec0 ec0H = gc0.h(obj, ec0);
            if (z14 || jLongValue != j2 || !c5186zO.f4977a.equals(c5186zOM.f4977a)) {
                z6 = false;
            } else if (c5186zO.a()) {
                int i6 = c5186zO.b;
                if (ec0H.h(i6)) {
                    int i7 = c5186zO.c;
                    if (ec0H.e(i6, i7) == i || ec0H.e(i6, i7) == 2) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } else if (c5186zOM.a() || !ec0H.h(c5186zOM.b)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else {
                if (c5186zOM.a()) {
                }
                z6 = false;
            }
            if (z15 || z6) {
                c5186zOM = c5186zO;
            }
            if (!c5186zOM.a()) {
                j3 = jLongValue;
            } else if (c5186zOM.equals(c5186zO)) {
                j3 = du.r;
            } else {
                gc0.h(c5186zOM.f4977a, ec0);
                j3 = c5186zOM.c == ec0.f(c5186zOM.b) ? ec0.g.c : j;
            }
            c2866Ws = new C2866Ws(c5186zOM, j3, j2, z2, z3, z4);
        }
        C5186zO c5186zO3 = c2866Ws.f3944a;
        long j7 = c2866Ws.c;
        boolean z16 = c2866Ws.d;
        long j8 = c2866Ws.b;
        char c = 4;
        boolean z17 = (this.w.b.equals(c5186zO3) && j8 == this.w.r) ? false : true;
        try {
            if (c2866Ws.e) {
                try {
                    if (this.w.e != 1) {
                        W(4);
                    }
                    C(false, false, false, true);
                } catch (Throwable th) {
                    th = th;
                    j = j7;
                    c = 0;
                    j7 = j8;
                    DU du2 = this.w;
                    Gc0 gc2 = du2.f2971a;
                    C5186zO c5186zO4 = du2.b;
                    if (c2866Ws.f) {
                        j4 = j7;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    f0(gc0, c5186zO3, gc2, c5186zO4, j4);
                    if (z17) {
                        DU du3 = this.w;
                        Object obj2 = du3.b.f4977a;
                        Gc0 gc3 = du3.f2971a;
                        if (z17) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        this.w = n(c5186zO3, j7, j, this.w.d, z11, gc0.b(obj2) == -1 ? 4 : 3);
                    } else {
                        DU du4 = this.w;
                        Object obj3 = du4.b.f4977a;
                        Gc0 gc4 = du4.f2971a;
                        if (z17) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        this.w = n(c5186zO3, j7, j, this.w.d, z11, gc0.b(obj3) == -1 ? 4 : 3);
                    }
                    D();
                    F(gc0, this.w.f2971a);
                    this.w = this.w.f(gc0);
                    if (!gc0.q()) {
                        this.J = c;
                    }
                    j(false);
                    throw th;
                }
            }
            try {
                if (z17) {
                    j = j7;
                    z12 = false;
                    jK = j8;
                    if (!gc0.q()) {
                        for (C4482rO c4482rO = this.r.h; c4482rO != null; c4482rO = c4482rO.l) {
                            if (c4482rO.f.f5033a.equals(c5186zO3)) {
                                c4482rO.f = this.r.g(gc0, c4482rO.f);
                                c4482rO.h();
                            }
                        }
                        C4834vO c4834vO2 = this.r;
                        jK = K(c5186zO3, jK, c4834vO2.h != c4834vO2.i, z16);
                    }
                } else {
                    C4834vO c4834vO3 = this.r;
                    long j9 = this.K;
                    C4482rO c4482rO2 = c4834vO3.i;
                    if (c4482rO2 == null) {
                        j5 = j8;
                        j6 = j;
                    } else {
                        j5 = j8;
                        try {
                            long jMax = c4482rO2.o;
                            if (c4482rO2.d) {
                                int i8 = 0;
                                while (true) {
                                    L9[] l9Arr = this.f4046a;
                                    if (i8 >= l9Arr.length) {
                                        j = j7;
                                        j6 = jMax;
                                        break;
                                    }
                                    if (r(l9Arr[i8])) {
                                        L9 l9 = l9Arr[i8];
                                        j = j7;
                                        try {
                                            if (l9.g == c4482rO2.c[i8]) {
                                                long j10 = l9.j;
                                                j6 = Long.MIN_VALUE;
                                                if (j10 == Long.MIN_VALUE) {
                                                    break;
                                                } else {
                                                    jMax = Math.max(j10, jMax);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j7 = j5;
                                            c = 0;
                                            DU du5 = this.w;
                                            Gc0 gc5 = du5.f2971a;
                                            C5186zO c5186zO5 = du5.b;
                                            if (c2866Ws.f) {
                                                j4 = j7;
                                            } else {
                                                j4 = -9223372036854775807L;
                                            }
                                            f0(gc0, c5186zO3, gc5, c5186zO5, j4);
                                            if (z17 || j != this.w.c) {
                                                DU du6 = this.w;
                                                Object obj4 = du6.b.f4977a;
                                                Gc0 gc6 = du6.f2971a;
                                                if (z17 || !z || gc6.q() || gc6.h(obj4, this.l).f) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                this.w = n(c5186zO3, j7, j, this.w.d, z11, gc0.b(obj4) == -1 ? 4 : 3);
                                            }
                                            D();
                                            F(gc0, this.w.f2971a);
                                            this.w = this.w.f(gc0);
                                            if (!gc0.q()) {
                                                this.J = c;
                                            }
                                            j(false);
                                            throw th;
                                        }
                                    } else {
                                        j = j7;
                                    }
                                    i8++;
                                    j7 = j;
                                }
                            } else {
                                j6 = jMax;
                            }
                            jK = j5;
                            z12 = false;
                            if (!c4834vO3.o(gc0, j9, j6)) {
                                I(false);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j = j7;
                        }
                    }
                    j = j7;
                    jK = j5;
                    z12 = false;
                    if (!c4834vO3.o(gc0, j9, j6)) {
                        I(false);
                    }
                }
                DU du7 = this.w;
                f0(gc0, c5186zO3, du7.f2971a, du7.b, c2866Ws.f ? jK : -9223372036854775807L);
                if (z17 || j != this.w.c) {
                    DU du8 = this.w;
                    Object obj5 = du8.b.f4977a;
                    Gc0 gc7 = du8.f2971a;
                    this.w = n(c5186zO3, jK, j, this.w.d, z17 && z && !gc7.q() && !gc7.h(obj5, this.l).f, gc0.b(obj5) == -1 ? 4 : 3);
                }
                D();
                F(gc0, this.w.f2971a);
                this.w = this.w.f(gc0);
                if (!gc0.q()) {
                    this.J = z12;
                }
                j(false);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void l(InterfaceC4395qO interfaceC4395qO) throws C2321Bs {
        C4834vO c4834vO = this.r;
        C4482rO c4482rO = c4834vO.j;
        if (c4482rO == null || c4482rO.f4928a != interfaceC4395qO) {
            return;
        }
        float f = this.n.getPlaybackParameters().f3024a;
        Gc0 gc0 = this.w.f2971a;
        c4482rO.d = true;
        c4482rO.m = c4482rO.f4928a.getTrackGroups();
        C4941wd0 c4941wd0G = c4482rO.g(f, gc0);
        C4658tO c4658tO = c4482rO.f;
        long jMax = c4658tO.b;
        long j = c4658tO.e;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = c4482rO.a(c4941wd0G, jMax, false, new boolean[c4482rO.i.length]);
        long j2 = c4482rO.o;
        C4658tO c4658tO2 = c4482rO.f;
        c4482rO.o = (c4658tO2.b - jA) + j2;
        c4482rO.f = c4658tO2.b(jA);
        d0(c4482rO.n);
        if (c4482rO == c4834vO.h) {
            E(c4482rO.f.b);
            e(new boolean[this.f4046a.length]);
            DU du = this.w;
            C5186zO c5186zO = du.b;
            long j3 = c4482rO.f.b;
            this.w = n(c5186zO, j3, du.c, j3, false, 5);
        }
        t();
    }

    public final void m(EU eu, float f, boolean z, boolean z2) {
        int i;
        C2918Ys c2918Ys = this;
        if (z) {
            if (z2) {
                c2918Ys.x.a(1);
            }
            DU du = c2918Ys.w;
            c2918Ys = this;
            c2918Ys.w = new DU(du.f2971a, du.b, du.c, du.d, du.e, du.f, du.g, du.h, du.i, du.j, du.k, du.l, du.m, eu, du.p, du.q, du.r, du.o);
        }
        float f2 = eu.f3024a;
        C4482rO c4482rO = c2918Ys.r.h;
        while (true) {
            i = 0;
            if (c4482rO == null) {
                break;
            }
            InterfaceC3299dt[] interfaceC3299dtArr = c4482rO.n.c;
            int length = interfaceC3299dtArr.length;
            while (i < length) {
                InterfaceC3299dt interfaceC3299dt = interfaceC3299dtArr[i];
                if (interfaceC3299dt != null) {
                    interfaceC3299dt.onPlaybackSpeed(f2);
                }
                i++;
            }
            c4482rO = c4482rO.l;
        }
        L9[] l9Arr = c2918Ys.f4046a;
        int length2 = l9Arr.length;
        while (i < length2) {
            L9 l9 = l9Arr[i];
            if (l9 != null) {
                l9.t(f, eu.f3024a);
            }
            i++;
        }
    }

    public final DU n(C5186zO c5186zO, long j, long j2, long j3, boolean z, int i) {
        C4062md0 c4062md0;
        C4941wd0 c4941wd0;
        List list;
        C3965lY c3965lYJ0;
        this.M = (!this.M && j == this.w.r && c5186zO.equals(this.w.b)) ? false : true;
        D();
        DU du = this.w;
        C4062md0 c4062md1 = du.h;
        C4941wd0 c4941wd1 = du.i;
        List list2 = du.j;
        if (this.s.k) {
            C4482rO c4482rO = this.r.h;
            C4062md0 c4062md2 = c4482rO == null ? C4062md0.d : c4482rO.m;
            C4941wd0 c4941wd2 = c4482rO == null ? this.e : c4482rO.n;
            InterfaceC3299dt[] interfaceC3299dtArr = c4941wd2.c;
            C4998xC c4998xC = new C4998xC();
            boolean z2 = false;
            for (InterfaceC3299dt interfaceC3299dt : interfaceC3299dtArr) {
                if (interfaceC3299dt != null) {
                    Metadata metadata = interfaceC3299dt.getFormat(0).j;
                    if (metadata == null) {
                        c4998xC.H0(new Metadata(new Metadata.Entry[0]));
                    } else {
                        c4998xC.H0(metadata);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                c3965lYJ0 = c4998xC.J0();
            } else {
                C5086yC c5086yC = AC.b;
                c3965lYJ0 = C3965lY.e;
            }
            if (c4482rO != null) {
                C4658tO c4658tO = c4482rO.f;
                if (c4658tO.c != j2) {
                    c4482rO.f = c4658tO.a(j2);
                }
            }
            list = c3965lYJ0;
            c4062md0 = c4062md2;
            c4941wd0 = c4941wd2;
        } else if (c5186zO.equals(du.b)) {
            c4062md0 = c4062md1;
            c4941wd0 = c4941wd1;
            list = list2;
        } else {
            c4062md0 = C4062md0.d;
            c4941wd0 = this.e;
            list = C3965lY.e;
        }
        if (z) {
            C2840Vs c2840Vs = this.x;
            if (!c2840Vs.d || c2840Vs.e == 5) {
                c2840Vs.f3897a = true;
                c2840Vs.d = true;
                c2840Vs.e = i;
            } else {
                FW.h(i == 5);
            }
        }
        DU du2 = this.w;
        long j4 = du2.p;
        C4482rO c4482rO2 = this.r.j;
        return du2.b(c5186zO, j, j2, j3, c4482rO2 == null ? 0L : Math.max(0L, j4 - (this.K - c4482rO2.o)), c4062md0, c4941wd0, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        this.h.a(9, (InterfaceC4395qO) interfaceC4985x40).b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4307pO
    public final void p(InterfaceC4395qO interfaceC4395qO) {
        this.h.a(8, interfaceC4395qO).b();
    }

    public final boolean q() {
        C4482rO c4482rO = this.r.j;
        if (c4482rO == null) {
            return false;
        }
        return (!c4482rO.d ? 0L : c4482rO.f4928a.getNextLoadPositionUs()) != Long.MIN_VALUE;
    }

    public final boolean s() {
        C4482rO c4482rO = this.r.h;
        long j = c4482rO.f.e;
        return c4482rO.d && (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || this.w.r < j || !X());
    }

    public final void t() {
        boolean zC;
        if (q()) {
            C4482rO c4482rO = this.r.j;
            long nextLoadPositionUs = !c4482rO.d ? 0L : c4482rO.f4928a.getNextLoadPositionUs();
            C4482rO c4482rO2 = this.r.j;
            long jMax = c4482rO2 == null ? 0L : Math.max(0L, nextLoadPositionUs - (this.K - c4482rO2.o));
            if (c4482rO != this.r.h) {
                long j = c4482rO.f.b;
            }
            zC = this.f.c(jMax, this.n.getPlaybackParameters().f3024a);
            if (!zC && jMax < 500000 && this.m > 0) {
                this.r.h.f4928a.q(this.w.r);
                zC = this.f.c(jMax, this.n.getPlaybackParameters().f3024a);
            }
        } else {
            zC = false;
        }
        this.C = zC;
        if (zC) {
            C4482rO c4482rO3 = this.r.j;
            long j2 = this.K;
            FW.s(c4482rO3.l == null);
            c4482rO3.f4928a.continueLoading(j2 - c4482rO3.o);
        }
        c0();
    }

    public final void u() {
        C2840Vs c2840Vs = this.x;
        DU du = this.w;
        boolean z = c2840Vs.f3897a | (c2840Vs.b != du);
        c2840Vs.f3897a = z;
        c2840Vs.b = du;
        if (z) {
            C2736Rs c2736Rs = this.q.f3286a;
            c2736Rs.i.c(new RunnableC3976le0(9, c2736Rs, c2840Vs));
            this.x = new C2840Vs(this.w);
        }
    }

    public final void v() throws Throwable {
        k(this.s.b(), true);
    }

    public final void w() {
        this.x.a(1);
        throw null;
    }

    public final void x() {
        this.x.a(1);
        int i = 0;
        C(false, false, false, true);
        this.f.b(false);
        W(this.w.f2971a.q() ? 4 : 2);
        C2419Fm c2419Fm = (C2419Fm) this.g;
        c2419Fm.getClass();
        OO oo = this.s;
        FW.s(!oo.k);
        oo.l = c2419Fm;
        while (true) {
            ArrayList arrayList = oo.b;
            if (i >= arrayList.size()) {
                oo.k = true;
                this.h.d(2);
                return;
            } else {
                MO mo = (MO) arrayList.get(i);
                oo.e(mo);
                oo.g.add(mo);
                i++;
            }
        }
    }

    public final synchronized boolean y() {
        if (!this.y && this.j.getThread().isAlive()) {
            this.h.d(7);
            g0(new C2762Ss(this, 0), this.u);
            return this.y;
        }
        return true;
    }

    public final void z() {
        C(true, false, true, false);
        this.f.b(true);
        W(1);
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.y = true;
            notifyAll();
        }
    }
}
