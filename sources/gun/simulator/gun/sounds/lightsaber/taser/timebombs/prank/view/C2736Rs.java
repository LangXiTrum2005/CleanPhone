package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.core.view.PointerIconCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2736Rs extends K9 {
    public static final /* synthetic */ int k0 = 0;
    public final N90 A;
    public final Bj0 B;
    public final Bj0 C;
    public final long D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public final P30 K;
    public D60 L;
    public HU M;
    public C3955lO N;
    public AudioTrack O;
    public Object P;
    public Surface Q;
    public SurfaceHolder R;
    public A80 S;
    public boolean T;
    public TextureView U;
    public final int V;
    public C4551s70 W;
    public final int X;
    public final Z6 Y;
    public final float Z;
    public boolean a0;
    public final C4941wd0 b;
    public C2469Hk b0;
    public final HU c;
    public final boolean c0;
    public final C4581sZ d = new C4581sZ(2);
    public boolean d0;
    public final Context e;
    public C2421Fo e0;
    public final LU f;
    public Ih0 f0;
    public final L9[] g;
    public C3955lO g0;
    public final AbstractC4129nM h;
    public DU h0;
    public final Qa0 i;
    public int i0;
    public final C2529Js j;
    public long j0;
    public final C2918Ys k;
    public final EI l;
    public final CopyOnWriteArraySet m;
    public final Ec0 n;
    public final ArrayList o;
    public final boolean p;
    public final InterfaceC3050b4 q;
    public final Looper r;
    public final F8 s;
    public final long t;
    public final long u;
    public final Oa0 v;
    public final SurfaceHolderCallbackC2658Os w;
    public final C2684Ps x;
    public final C4288p70 y;
    public final C3409f7 z;

    static {
        AbstractC2944Zs.a("goog.exo.exoplayer");
    }

    public C2736Rs(C2399Es c2399Es) {
        boolean z;
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i = Ug0.f3833a;
            AbstractC4038mJ.e();
            this.e = c2399Es.f3044a.getApplicationContext();
            this.q = (InterfaceC3050b4) c2399Es.h.apply(c2399Es.b);
            this.Y = c2399Es.j;
            this.V = c2399Es.k;
            this.a0 = false;
            this.D = c2399Es.r;
            SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = new SurfaceHolderCallbackC2658Os(this);
            this.w = surfaceHolderCallbackC2658Os;
            this.x = new C2684Ps();
            Handler handler = new Handler(c2399Es.i);
            L9[] l9ArrA = ((C2472Hn) c2399Es.c.get()).a(handler, surfaceHolderCallbackC2658Os, surfaceHolderCallbackC2658Os, surfaceHolderCallbackC2658Os, surfaceHolderCallbackC2658Os);
            this.g = l9ArrA;
            FW.s(l9ArrA.length > 0);
            this.h = (AbstractC4129nM) c2399Es.e.get();
            this.s = (F8) c2399Es.g.get();
            this.p = c2399Es.l;
            this.K = c2399Es.m;
            this.t = c2399Es.n;
            this.u = c2399Es.o;
            Looper looper = c2399Es.i;
            this.r = looper;
            Oa0 oa0 = c2399Es.b;
            this.v = oa0;
            this.f = this;
            this.l = new EI(looper, oa0, new C2529Js(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.L = new D60();
            this.b = new C4941wd0(new C5196zY[l9ArrA.length], new InterfaceC3299dt[l9ArrA.length], C5117yd0.b, null);
            this.n = new Ec0();
            C4581sZ c4581sZ = new C4581sZ(3);
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i2 = 0; i2 < 21; i2++) {
                c4581sZ.a(iArr[i2]);
            }
            this.h.getClass();
            c4581sZ.a(29);
            C3125bv c3125bvB = c4581sZ.b();
            this.c = new HU(c3125bvB);
            C4581sZ c4581sZ2 = new C4581sZ(3);
            for (int i3 = 0; i3 < c3125bvB.f4194a.size(); i3++) {
                c4581sZ2.a(c3125bvB.a(i3));
            }
            c4581sZ2.a(4);
            c4581sZ2.a(10);
            this.M = new HU(c4581sZ2.b());
            this.i = this.v.a(this.r, null);
            C2529Js c2529Js = new C2529Js(this);
            this.j = c2529Js;
            this.h0 = DU.g(this.b);
            ((C4167nm) this.q).O(this.f, this.r);
            int i4 = Ug0.f3833a;
            this.k = new C2918Ys(this.g, this.h, this.b, (C4696tn) c2399Es.f.get(), this.s, this.E, this.F, this.q, this.K, c2399Es.p, c2399Es.q, false, this.r, this.v, c2529Js, i4 < 31 ? new WU() : AbstractC2606Ms.a(this.e, this, c2399Es.s));
            this.Z = 1.0f;
            this.E = 0;
            C3955lO c3955lO = C3955lO.I;
            this.N = c3955lO;
            this.g0 = c3955lO;
            int iGenerateAudioSessionId = -1;
            this.i0 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.O;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.O.release();
                    this.O = null;
                }
                if (this.O == null) {
                    this.O = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.X = this.O.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.X = iGenerateAudioSessionId;
            }
            this.b0 = C2469Hk.c;
            this.c0 = true;
            InterfaceC3050b4 interfaceC3050b4 = this.q;
            interfaceC3050b4.getClass();
            this.l.a(interfaceC3050b4);
            F8 f8 = this.s;
            Handler handler2 = new Handler(this.r);
            InterfaceC3050b4 interfaceC3050b5 = this.q;
            C2419Fm c2419Fm = (C2419Fm) f8;
            c2419Fm.getClass();
            interfaceC3050b5.getClass();
            NN nn = c2419Fm.b;
            nn.getClass();
            nn.w(interfaceC3050b5);
            ((CopyOnWriteArrayList) nn.b).add(new E8(handler2, interfaceC3050b5));
            this.m.add(this.w);
            C4288p70 c4288p70 = new C4288p70(c2399Es.f3044a, handler, this.w);
            this.y = c4288p70;
            c4288p70.i(false);
            C3409f7 c3409f7 = new C3409f7(c2399Es.f3044a, handler, this.w);
            this.z = c3409f7;
            c3409f7.c();
            N90 n90 = new N90(c2399Es.f3044a, handler, this.w);
            this.A = n90;
            n90.b(Ug0.B(this.Y.c));
            Bj0 bj0 = new Bj0(c2399Es.f3044a, 0);
            this.B = bj0;
            bj0.a();
            Bj0 bj1 = new Bj0(c2399Es.f3044a, 1);
            this.C = bj1;
            bj1.a();
            this.e0 = k(n90);
            this.f0 = Ih0.e;
            this.W = C4551s70.c;
            AbstractC4129nM abstractC4129nM = this.h;
            Z6 z6 = this.Y;
            C3557go c3557go = (C3557go) abstractC4129nM;
            synchronized (c3557go.c) {
                z = !c3557go.i.equals(z6);
                c3557go.i = z6;
            }
            if (z) {
                c3557go.g();
            }
            H(1, 10, Integer.valueOf(this.X));
            H(2, 10, Integer.valueOf(this.X));
            H(1, 3, this.Y);
            H(2, 4, Integer.valueOf(this.V));
            H(2, 5, 0);
            H(1, 9, Boolean.valueOf(this.a0));
            H(2, 7, this.x);
            H(6, 8, this.x);
            this.d.d();
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    public static C2421Fo k(N90 n90) {
        n90.getClass();
        int i = Ug0.f3833a;
        AudioManager audioManager = n90.d;
        return new C2421Fo(0, i >= 28 ? audioManager.getStreamMinVolume(n90.f) : 0, audioManager.getStreamMaxVolume(n90.f));
    }

    public static long x(DU du) {
        Fc0 fc0 = new Fc0();
        Ec0 ec0 = new Ec0();
        du.f2971a.h(du.b.f4977a, ec0);
        long j = du.c;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return ec0.e + j;
        }
        return du.f2971a.n(ec0.c, fc0, 0L).m;
    }

    public static boolean y(DU du) {
        return du.e == 3 && du.l && du.m == 0;
    }

    public final DU A(DU du, Gc0 gc0, Pair pair) {
        List list;
        FW.h(gc0.q() || pair != null);
        Gc0 gc1 = du.f2971a;
        DU duF = du.f(gc0);
        if (gc0.q()) {
            C5186zO c5186zO = DU.s;
            long jL = Ug0.L(this.j0);
            DU duA = duF.b(c5186zO, jL, jL, jL, 0L, C4062md0.d, this.b, C3965lY.e).a(c5186zO);
            duA.p = duA.r;
            return duA;
        }
        Object obj = duF.b.f4977a;
        int i = Ug0.f3833a;
        boolean z = !obj.equals(pair.first);
        C5186zO c5186zO2 = z ? new C5186zO(pair.first) : duF.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jL2 = Ug0.L(m());
        if (!gc1.q()) {
            jL2 -= gc1.h(obj, this.n).e;
        }
        if (z || jLongValue < jL2) {
            FW.s(!c5186zO2.a());
            C4062md0 c4062md0 = z ? C4062md0.d : duF.h;
            C4941wd0 c4941wd0 = z ? this.b : duF.i;
            if (z) {
                C5086yC c5086yC = AC.b;
                list = C3965lY.e;
            } else {
                list = duF.j;
            }
            DU duA2 = duF.b(c5186zO2, jLongValue, jLongValue, jLongValue, 0L, c4062md0, c4941wd0, list).a(c5186zO2);
            duA2.p = jLongValue;
            return duA2;
        }
        if (jLongValue == jL2) {
            int iB = gc0.b(duF.k.f4977a);
            if (iB == -1 || gc0.g(iB, this.n, false).c != gc0.h(c5186zO2.f4977a, this.n).c) {
                gc0.h(c5186zO2.f4977a, this.n);
                long jA = c5186zO2.a() ? this.n.a(c5186zO2.b, c5186zO2.c) : this.n.d;
                duF = duF.b(c5186zO2, duF.r, duF.r, duF.d, jA - duF.r, duF.h, duF.i, duF.j).a(c5186zO2);
                duF.p = jA;
            }
        } else {
            FW.s(!c5186zO2.a());
            long jMax = Math.max(0L, duF.q - (jLongValue - jL2));
            long j = duF.p;
            if (duF.k.equals(duF.b)) {
                j = jLongValue + jMax;
            }
            duF = duF.b(c5186zO2, jLongValue, jLongValue, jLongValue, jMax, duF.h, duF.i, duF.j);
            duF.p = j;
        }
        return duF;
    }

    public final Pair B(Gc0 gc0, int i, long j) {
        if (gc0.q()) {
            this.i0 = i;
            if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j = 0;
            }
            this.j0 = j;
            return null;
        }
        if (i == -1 || i >= gc0.p()) {
            i = gc0.a(this.F);
            j = Ug0.W(gc0.n(i, this.f3304a, 0L).m);
        }
        return gc0.j(this.f3304a, this.n, i, Ug0.L(j));
    }

    public final void C(final int i, final int i2) {
        C4551s70 c4551s70 = this.W;
        if (i == c4551s70.f4963a && i2 == c4551s70.b) {
            return;
        }
        this.W = new C4551s70(i, i2);
        this.l.e(24, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ls
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
            public final void invoke(Object obj) {
                ((JU) obj).q(i, i2);
            }
        });
    }

    public final void D() {
        Q();
        boolean zV = v();
        int iE = this.z.e(2, zV);
        N(iE, (!zV || iE == 1) ? 1 : 2, zV);
        DU du = this.h0;
        if (du.e != 1) {
            return;
        }
        DU duD = du.d(null);
        DU duE = duD.e(duD.f2971a.q() ? 4 : 2);
        this.G++;
        Qa0 qa0 = this.k.h;
        qa0.getClass();
        Pa0 pa0B = Qa0.b();
        pa0B.f3557a = qa0.f3608a.obtainMessage(0);
        pa0B.b();
        O(duE, 1, 1, false, false, 5, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -1, false);
    }

    public final void E(C2388Eh c2388Eh) {
        Q();
        Q();
        List listSingletonList = Collections.singletonList(c2388Eh);
        Q();
        Q();
        u();
        r();
        this.G++;
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            this.L = this.L.c(0, size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            MO mo = new MO((G9) listSingletonList.get(i2), this.p);
            arrayList2.add(mo);
            arrayList.add(i2, new C2710Qs(mo.f3403a.o, mo.b));
        }
        this.L = this.L.b(0, arrayList2.size());
        C3171cV c3171cV = new C3171cV(arrayList, this.L);
        boolean zQ = c3171cV.q();
        int i3 = c3171cV.i;
        if (!zQ && -1 >= i3) {
            throw new C2542Kf();
        }
        int iA = c3171cV.a(this.F);
        DU duA = A(this.h0, c3171cV, B(c3171cV, iA, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        int i4 = duA.e;
        if (iA != -1 && i4 != 1) {
            i4 = (c3171cV.q() || iA >= i3) ? 4 : 2;
        }
        DU duE = duA.e(i4);
        this.k.h.a(17, new C2814Us(arrayList2, this.L, iA, Ug0.L(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET))).b();
        O(duE, 0, 1, false, (this.h0.b.f4977a.equals(duE.b.f4977a) || this.h0.f2971a.q()) ? false : true, 4, s(duE), -1, false);
        D();
    }

    public final void F(JU ju) {
        Q();
        ju.getClass();
        EI ei = this.l;
        ei.f();
        CopyOnWriteArraySet<DI> copyOnWriteArraySet = ei.d;
        for (DI di : copyOnWriteArraySet) {
            if (di.f2965a.equals(ju)) {
                di.d = true;
                if (di.c) {
                    di.c = false;
                    C3125bv c3125bvB = di.b.b();
                    ei.c.b(di.f2965a, c3125bvB);
                }
                copyOnWriteArraySet.remove(di);
            }
        }
    }

    public final void G() {
        A80 a80 = this.S;
        SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = this.w;
        if (a80 != null) {
            ZU zuL = l(this.x);
            FW.s(!zuL.g);
            zuL.d = 10000;
            FW.s(!zuL.g);
            zuL.e = null;
            zuL.c();
            this.S.f2804a.remove(surfaceHolderCallbackC2658Os);
            this.S = null;
        }
        TextureView textureView = this.U;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC2658Os) {
                AbstractC4038mJ.f();
            } else {
                this.U.setSurfaceTextureListener(null);
            }
            this.U = null;
        }
        SurfaceHolder surfaceHolder = this.R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC2658Os);
            this.R = null;
        }
    }

    public final void H(int i, int i2, Object obj) {
        for (L9 l9 : this.g) {
            if (l9.f3341a == i) {
                ZU zuL = l(l9);
                FW.s(!zuL.g);
                zuL.d = i2;
                FW.s(!zuL.g);
                zuL.e = obj;
                zuL.c();
            }
        }
    }

    public final void I(SurfaceHolder surfaceHolder) {
        this.T = false;
        this.R = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = this.R.getSurface();
        if (surface == null || !surface.isValid()) {
            C(0, 0);
        } else {
            Rect surfaceFrame = this.R.getSurfaceFrame();
            C(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void J(boolean z) {
        Q();
        int iE = this.z.e(w(), z);
        int i = 1;
        if (z && iE != 1) {
            i = 2;
        }
        N(iE, i, z);
    }

    public final void K(int i) {
        Q();
        if (this.E != i) {
            this.E = i;
            Qa0 qa0 = this.k.h;
            qa0.getClass();
            Pa0 pa0B = Qa0.b();
            pa0B.f3557a = qa0.f3608a.obtainMessage(11, i, 0);
            pa0B.b();
            C2555Ks c2555Ks = new C2555Ks(i);
            EI ei = this.l;
            ei.c(8, c2555Ks);
            M();
            ei.b();
        }
    }

    public final void L(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (L9 l9 : this.g) {
            if (l9.f3341a == 2) {
                ZU zuL = l(l9);
                FW.s(!zuL.g);
                zuL.d = 1;
                FW.s(true ^ zuL.g);
                zuL.e = obj;
                zuL.c();
                arrayList.add(zuL);
            }
        }
        Object obj2 = this.P;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ZU) it.next()).a(this.D);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            z = false;
            Object obj3 = this.P;
            Surface surface = this.Q;
            if (obj3 == surface) {
                surface.release();
                this.Q = null;
            }
        }
        this.P = obj;
        if (z) {
            C2321Bs c2321Bs = new C2321Bs(2, new C3034at(3), PointerIconCompat.TYPE_HELP);
            DU du = this.h0;
            DU duA = du.a(du.b);
            duA.p = duA.r;
            duA.q = 0L;
            DU duD = duA.e(1).d(c2321Bs);
            this.G++;
            Qa0 qa0 = this.k.h;
            qa0.getClass();
            Pa0 pa0B = Qa0.b();
            pa0B.f3557a = qa0.f3608a.obtainMessage(6);
            pa0B.b();
            O(duD, 0, 1, false, duD.f2971a.q() && !this.h0.f2971a.q(), 4, s(duD), -1, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    public final void M() {
        boolean z;
        boolean z2;
        HU hu = this.M;
        int i = Ug0.f3833a;
        C2736Rs c2736Rs = (C2736Rs) this.f;
        boolean z3 = c2736Rs.z();
        boolean zD = c2736Rs.d();
        Gc0 gc0T = c2736Rs.t();
        boolean z4 = false;
        if (gc0T.q()) {
            z = false;
        } else {
            int iP = c2736Rs.p();
            c2736Rs.Q();
            int i2 = c2736Rs.E;
            if (i2 == 1) {
                i2 = 0;
            }
            c2736Rs.Q();
            if (gc0T.l(iP, i2, c2736Rs.F) != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        Gc0 gc0T2 = c2736Rs.t();
        if (gc0T2.q()) {
            z2 = false;
        } else {
            int iP2 = c2736Rs.p();
            c2736Rs.Q();
            int i3 = c2736Rs.E;
            if (i3 == 1) {
                i3 = 0;
            }
            c2736Rs.Q();
            if (gc0T2.e(iP2, i3, c2736Rs.F) != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        boolean zC = c2736Rs.c();
        boolean zB = c2736Rs.b();
        boolean zQ = c2736Rs.t().q();
        GU gu = new GU();
        C3125bv c3125bv = this.c.f3173a;
        C4581sZ c4581sZ = gu.f3124a;
        c4581sZ.getClass();
        for (int i4 = 0; i4 < c3125bv.f4194a.size(); i4++) {
            c4581sZ.a(c3125bv.a(i4));
        }
        boolean z5 = !z3;
        gu.a(4, z5);
        gu.a(5, zD && !z3);
        gu.a(6, z && !z3);
        gu.a(7, !zQ && (z || !zC || zD) && !z3);
        gu.a(8, z2 && !z3);
        gu.a(9, !zQ && (z2 || (zC && zB)) && !z3);
        gu.a(10, z5);
        gu.a(11, zD && !z3);
        if (zD && !z3) {
            z4 = true;
        }
        gu.a(12, z4);
        HU hu2 = new HU(c4581sZ.b());
        this.M = hu2;
        if (hu2.equals(hu)) {
            return;
        }
        this.l.c(13, new C2529Js(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
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
    public final void N(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r3 = (!z || i == -1) ? 0 : 1;
        if (r3 != 0 && i != 1) {
            i3 = 1;
        }
        DU du = this.h0;
        if (du.l == r3 && du.m == i3) {
            return;
        }
        this.G++;
        DU duC = du.c(i3, r3);
        Qa0 qa0 = this.k.h;
        qa0.getClass();
        Pa0 pa0B = Qa0.b();
        pa0B.f3557a = qa0.f3608a.obtainMessage(1, r3, i3);
        pa0B.b();
        O(duC, 0, i2, false, false, 5, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -1, false);
    }

    public final void O(final DU du, final int i, final int i2, boolean z, boolean z2, int i3, long j, int i4, boolean z3) {
        Pair pair;
        int i5;
        C3693iO c3693iO;
        int i6;
        Object obj;
        C3693iO c3693iO2;
        Object obj2;
        int i7;
        long jX;
        long jX2;
        Object obj3;
        C3693iO c3693iO3;
        Object obj4;
        int i8;
        DU du2 = this.h0;
        this.h0 = du;
        boolean z4 = !du2.f2971a.equals(du.f2971a);
        Gc0 gc0 = du2.f2971a;
        Gc0 gc1 = du.f2971a;
        if (gc1.q() && gc0.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (gc1.q() != gc0.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C5186zO c5186zO = du2.b;
            Object obj5 = c5186zO.f4977a;
            Ec0 ec0 = this.n;
            int i9 = gc0.h(obj5, ec0).c;
            Fc0 fc0 = this.f3304a;
            Object obj6 = gc0.n(i9, fc0, 0L).f3074a;
            C5186zO c5186zO2 = du.b;
            if (!obj6.equals(gc1.n(gc1.h(c5186zO2.f4977a, ec0).c, fc0, 0L).f3074a)) {
                if (z2 && i3 == 0) {
                    i5 = 1;
                } else if (z2 && i3 == 1) {
                    i5 = 2;
                } else {
                    if (!z4) {
                        throw new IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            } else if (z2 && i3 == 0 && c5186zO.d < c5186zO2.d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z2 && i3 == 1 && z3) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        C3955lO c3955lOI = this.N;
        if (zBooleanValue) {
            c3693iO = du.f2971a.q() ? null : du.f2971a.n(du.f2971a.h(du.b.f4977a, this.n).c, this.f3304a, 0L).c;
            this.g0 = C3955lO.I;
        } else {
            c3693iO = null;
        }
        if (zBooleanValue || !du2.j.equals(du.j)) {
            C3867kO c3867kOA = this.g0.a();
            List list = du.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Metadata metadata = (Metadata) list.get(i10);
                for (int i11 = 0; i11 < metadata.f(); i11++) {
                    metadata.e(i11).a(c3867kOA);
                }
            }
            this.g0 = new C3955lO(c3867kOA);
            c3955lOI = i();
        }
        boolean z5 = !c3955lOI.equals(this.N);
        this.N = c3955lOI;
        boolean z6 = du2.l != du.l;
        boolean z7 = du2.e != du.e;
        if (z7 || z6) {
            P();
        }
        boolean z8 = du2.g != du.g;
        if (z4) {
            final int i12 = 0;
            this.l.c(0, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj7) {
                    int i13 = i12;
                    int i14 = i;
                    DU du3 = du;
                    JU ju = (JU) obj7;
                    switch (i13) {
                        case 0:
                            Gc0 gc2 = du3.f2971a;
                            ju.l(i14);
                            break;
                        default:
                            ju.v(i14, du3.l);
                            break;
                    }
                }
            });
        }
        if (z2) {
            Ec0 ec1 = new Ec0();
            if (du2.f2971a.q()) {
                i6 = i4;
                obj = null;
                c3693iO2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj7 = du2.b.f4977a;
                du2.f2971a.h(obj7, ec1);
                int i13 = ec1.c;
                int iB = du2.f2971a.b(obj7);
                obj2 = obj7;
                obj = du2.f2971a.n(i13, this.f3304a, 0L).f3074a;
                c3693iO2 = this.f3304a.c;
                i6 = i13;
                i7 = iB;
            }
            if (i3 == 0) {
                if (du2.b.a()) {
                    C5186zO c5186zO3 = du2.b;
                    jX = ec1.a(c5186zO3.b, c5186zO3.c);
                    jX2 = x(du2);
                } else {
                    jX = du2.b.e != -1 ? x(this.h0) : ec1.d + ec1.e;
                    jX2 = jX;
                }
            } else if (du2.b.a()) {
                jX = du2.r;
                jX2 = x(du2);
            } else {
                jX = ec1.e + du2.r;
                jX2 = jX;
            }
            long jW = Ug0.W(jX);
            long jW2 = Ug0.W(jX2);
            C5186zO c5186zO4 = du2.b;
            KU ku = new KU(obj, i6, c3693iO2, obj2, i7, jW, jW2, c5186zO4.b, c5186zO4.c);
            int iP = p();
            if (this.h0.f2971a.q()) {
                obj3 = null;
                c3693iO3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                DU du3 = this.h0;
                Object obj8 = du3.b.f4977a;
                du3.f2971a.h(obj8, this.n);
                int iB2 = this.h0.f2971a.b(obj8);
                Gc0 gc2 = this.h0.f2971a;
                Fc0 fc1 = this.f3304a;
                Object obj9 = gc2.n(iP, fc1, 0L).f3074a;
                i8 = iB2;
                c3693iO3 = fc1.c;
                obj3 = obj9;
                obj4 = obj8;
            }
            long jW3 = Ug0.W(j);
            long jW4 = this.h0.b.a() ? Ug0.W(x(this.h0)) : jW3;
            C5186zO c5186zO5 = this.h0.b;
            this.l.c(11, new C4771ug0(i3, ku, new KU(obj3, iP, c3693iO3, obj4, i8, jW3, jW4, c5186zO5.b, c5186zO5.c)));
        } else {
            z6 = z6;
            z5 = z5;
            z7 = z7;
            z8 = z8;
        }
        if (zBooleanValue) {
            this.l.c(1, new C2503Is(c3693iO, iIntValue));
        }
        final int i14 = 4;
        if (du2.f != du.f) {
            final int i15 = 3;
            this.l.c(10, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj10) {
                    int i16 = i15;
                    DU du4 = du;
                    JU ju = (JU) obj10;
                    switch (i16) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
            if (du.f != null) {
                this.l.c(10, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj10) {
                        int i16 = i14;
                        DU du4 = du;
                        JU ju = (JU) obj10;
                        switch (i16) {
                            case 0:
                                ju.b(du4.m);
                                break;
                            case 1:
                                ju.H(C2736Rs.y(du4));
                                break;
                            case 2:
                                ju.w(du4.n);
                                break;
                            case 3:
                                ju.A(du4.f);
                                break;
                            case 4:
                                ju.n(du4.f);
                                break;
                            case 5:
                                ju.F(du4.i.d);
                                break;
                            case 6:
                                boolean z9 = du4.g;
                                ju.getClass();
                                ju.t(du4.g);
                                break;
                            case 7:
                                ju.onPlayerStateChanged(du4.l, du4.e);
                                break;
                            default:
                                ju.g(du4.e);
                                break;
                        }
                    }
                });
            }
        }
        C4941wd0 c4941wd0 = du2.i;
        C4941wd0 c4941wd1 = du.i;
        final int i16 = 5;
        if (c4941wd0 != c4941wd1) {
            AbstractC4129nM abstractC4129nM = this.h;
            Object obj10 = c4941wd1.e;
            abstractC4129nM.getClass();
            this.l.c(2, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i17 = i16;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i17) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        int i17 = 12;
        if (z5) {
            this.l.c(14, new Md0(this.N, i17));
        }
        final int i18 = 6;
        if (z8) {
            this.l.c(3, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i19 = i18;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i19) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        final int i19 = 7;
        if (z7 || z6) {
            this.l.c(-1, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i110 = i19;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i110) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        if (z7) {
            final int i20 = 8;
            this.l.c(4, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i110 = i20;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i110) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i21 = 1;
            this.l.c(5, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i110 = i21;
                    int i111 = i2;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i110) {
                        case 0:
                            Gc0 gc3 = du4.f2971a;
                            ju.l(i111);
                            break;
                        default:
                            ju.v(i111, du4.l);
                            break;
                    }
                }
            });
        }
        if (du2.m != du.m) {
            final int i22 = 0;
            this.l.c(6, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i110 = i22;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i110) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        if (y(du2) != y(du)) {
            final int i23 = 1;
            this.l.c(7, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i110 = i23;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i110) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        if (!du2.n.equals(du.n)) {
            final int i24 = 2;
            this.l.c(12, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hs
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                public final void invoke(Object obj11) {
                    int i110 = i24;
                    DU du4 = du;
                    JU ju = (JU) obj11;
                    switch (i110) {
                        case 0:
                            ju.b(du4.m);
                            break;
                        case 1:
                            ju.H(C2736Rs.y(du4));
                            break;
                        case 2:
                            ju.w(du4.n);
                            break;
                        case 3:
                            ju.A(du4.f);
                            break;
                        case 4:
                            ju.n(du4.f);
                            break;
                        case 5:
                            ju.F(du4.i.d);
                            break;
                        case 6:
                            boolean z9 = du4.g;
                            ju.getClass();
                            ju.t(du4.g);
                            break;
                        case 7:
                            ju.onPlayerStateChanged(du4.l, du4.e);
                            break;
                        default:
                            ju.g(du4.e);
                            break;
                    }
                }
            });
        }
        if (z) {
            this.l.c(-1, new Nd0(21));
        }
        M();
        this.l.b();
        if (du2.o != du.o) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC2658Os) it.next()).f3526a.P();
            }
        }
    }

    public final void P() {
        int iW = w();
        Bj0 bj0 = this.C;
        Bj0 bj1 = this.B;
        if (iW != 1) {
            if (iW == 2 || iW == 3) {
                Q();
                bj1.b(v() && !this.h0.o);
                bj0.b(v());
                return;
            } else if (iW != 4) {
                throw new IllegalStateException();
            }
        }
        bj1.b(false);
        bj0.b(false);
    }

    public final void Q() {
        C4581sZ c4581sZ = this.d;
        synchronized (c4581sZ) {
            boolean z = false;
            while (!c4581sZ.f4984a) {
                try {
                    c4581sZ.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.r.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.r.getThread().getName();
            int i = Ug0.f3833a;
            Locale locale = Locale.US;
            String strN = AbstractC5044xl.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.c0) {
                throw new IllegalStateException(strN);
            }
            AbstractC4038mJ.g(strN, this.d0 ? null : new IllegalStateException());
            this.d0 = true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K9
    public final void e(int i, long j, boolean z) {
        Q();
        FW.h(i >= 0);
        C4167nm c4167nm = (C4167nm) this.q;
        if (!c4167nm.i) {
            C3403f4 c3403f4I = c4167nm.I();
            c4167nm.i = true;
            c4167nm.N(c3403f4I, -1, new C3815jm(c3403f4I, 0));
        }
        Gc0 gc0 = this.h0.f2971a;
        if (gc0.q() || i < gc0.p()) {
            this.G++;
            if (z()) {
                AbstractC4038mJ.f();
                C2840Vs c2840Vs = new C2840Vs(this.h0);
                c2840Vs.a(1);
                C2736Rs c2736Rs = this.j.f3286a;
                c2736Rs.i.c(new RunnableC3976le0(9, c2736Rs, c2840Vs));
                return;
            }
            int i2 = w() != 1 ? 2 : 1;
            int iP = p();
            DU duA = A(this.h0.e(i2), gc0, B(gc0, i, j));
            this.k.h.a(3, new C2892Xs(gc0, i, Ug0.L(j))).b();
            O(duA, 0, 1, true, true, 1, s(duA), iP, z);
        }
    }

    public final C3955lO i() {
        Gc0 gc0T = t();
        if (gc0T.q()) {
            return this.g0;
        }
        C3693iO c3693iO = gc0T.n(p(), this.f3304a, 0L).c;
        C3867kO c3867kOA = this.g0.a();
        C3955lO c3955lO = c3693iO.d;
        if (c3955lO != null) {
            CharSequence charSequence = c3955lO.f4644a;
            if (charSequence != null) {
                c3867kOA.f4596a = charSequence;
            }
            CharSequence charSequence2 = c3955lO.b;
            if (charSequence2 != null) {
                c3867kOA.b = charSequence2;
            }
            CharSequence charSequence3 = c3955lO.c;
            if (charSequence3 != null) {
                c3867kOA.c = charSequence3;
            }
            CharSequence charSequence4 = c3955lO.d;
            if (charSequence4 != null) {
                c3867kOA.d = charSequence4;
            }
            CharSequence charSequence5 = c3955lO.e;
            if (charSequence5 != null) {
                c3867kOA.e = charSequence5;
            }
            CharSequence charSequence6 = c3955lO.f;
            if (charSequence6 != null) {
                c3867kOA.f = charSequence6;
            }
            CharSequence charSequence7 = c3955lO.g;
            if (charSequence7 != null) {
                c3867kOA.g = charSequence7;
            }
            AbstractC4843vX abstractC4843vX = c3955lO.h;
            if (abstractC4843vX != null) {
                c3867kOA.h = abstractC4843vX;
            }
            AbstractC4843vX abstractC4843vX2 = c3955lO.i;
            if (abstractC4843vX2 != null) {
                c3867kOA.i = abstractC4843vX2;
            }
            byte[] bArr = c3955lO.j;
            if (bArr != null) {
                c3867kOA.j = (byte[]) bArr.clone();
                c3867kOA.k = c3955lO.k;
            }
            Uri uri = c3955lO.l;
            if (uri != null) {
                c3867kOA.l = uri;
            }
            Integer num = c3955lO.m;
            if (num != null) {
                c3867kOA.m = num;
            }
            Integer num2 = c3955lO.n;
            if (num2 != null) {
                c3867kOA.n = num2;
            }
            Integer num3 = c3955lO.o;
            if (num3 != null) {
                c3867kOA.o = num3;
            }
            Boolean bool = c3955lO.p;
            if (bool != null) {
                c3867kOA.p = bool;
            }
            Boolean bool2 = c3955lO.q;
            if (bool2 != null) {
                c3867kOA.q = bool2;
            }
            Integer num4 = c3955lO.r;
            if (num4 != null) {
                c3867kOA.r = num4;
            }
            Integer num5 = c3955lO.s;
            if (num5 != null) {
                c3867kOA.r = num5;
            }
            Integer num6 = c3955lO.t;
            if (num6 != null) {
                c3867kOA.s = num6;
            }
            Integer num7 = c3955lO.u;
            if (num7 != null) {
                c3867kOA.t = num7;
            }
            Integer num8 = c3955lO.v;
            if (num8 != null) {
                c3867kOA.u = num8;
            }
            Integer num9 = c3955lO.w;
            if (num9 != null) {
                c3867kOA.v = num9;
            }
            Integer num10 = c3955lO.x;
            if (num10 != null) {
                c3867kOA.w = num10;
            }
            CharSequence charSequence8 = c3955lO.y;
            if (charSequence8 != null) {
                c3867kOA.x = charSequence8;
            }
            CharSequence charSequence9 = c3955lO.z;
            if (charSequence9 != null) {
                c3867kOA.y = charSequence9;
            }
            CharSequence charSequence10 = c3955lO.A;
            if (charSequence10 != null) {
                c3867kOA.z = charSequence10;
            }
            Integer num11 = c3955lO.B;
            if (num11 != null) {
                c3867kOA.A = num11;
            }
            Integer num12 = c3955lO.C;
            if (num12 != null) {
                c3867kOA.B = num12;
            }
            CharSequence charSequence11 = c3955lO.D;
            if (charSequence11 != null) {
                c3867kOA.C = charSequence11;
            }
            CharSequence charSequence12 = c3955lO.E;
            if (charSequence12 != null) {
                c3867kOA.D = charSequence12;
            }
            CharSequence charSequence13 = c3955lO.F;
            if (charSequence13 != null) {
                c3867kOA.E = charSequence13;
            }
            Integer num13 = c3955lO.G;
            if (num13 != null) {
                c3867kOA.F = num13;
            }
            Bundle bundle = c3955lO.H;
            if (bundle != null) {
                c3867kOA.G = bundle;
            }
        }
        return new C3955lO(c3867kOA);
    }

    public final void j() {
        Q();
        G();
        L(null);
        C(0, 0);
    }

    public final ZU l(YU yu) {
        int iU = u();
        Gc0 gc0 = this.h0.f2971a;
        int i = iU == -1 ? 0 : iU;
        C2918Ys c2918Ys = this.k;
        return new ZU(c2918Ys, yu, gc0, i, this.v, c2918Ys.j);
    }

    public final long m() {
        Q();
        if (!z()) {
            return r();
        }
        DU du = this.h0;
        Gc0 gc0 = du.f2971a;
        Object obj = du.b.f4977a;
        Ec0 ec0 = this.n;
        gc0.h(obj, ec0);
        DU du2 = this.h0;
        return du2.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? Ug0.W(du2.f2971a.n(p(), this.f3304a, 0L).m) : Ug0.W(ec0.e) + Ug0.W(this.h0.c);
    }

    public final int n() {
        Q();
        if (z()) {
            return this.h0.b.b;
        }
        return -1;
    }

    public final int o() {
        Q();
        if (z()) {
            return this.h0.b.c;
        }
        return -1;
    }

    public final int p() {
        Q();
        int iU = u();
        if (iU == -1) {
            return 0;
        }
        return iU;
    }

    public final int q() {
        Q();
        if (this.h0.f2971a.q()) {
            return 0;
        }
        DU du = this.h0;
        return du.f2971a.b(du.b.f4977a);
    }

    public final long r() {
        Q();
        return Ug0.W(s(this.h0));
    }

    public final long s(DU du) {
        if (du.f2971a.q()) {
            return Ug0.L(this.j0);
        }
        if (du.b.a()) {
            return du.r;
        }
        Gc0 gc0 = du.f2971a;
        C5186zO c5186zO = du.b;
        long j = du.r;
        Object obj = c5186zO.f4977a;
        Ec0 ec0 = this.n;
        gc0.h(obj, ec0);
        return j + ec0.e;
    }

    public final Gc0 t() {
        Q();
        return this.h0.f2971a;
    }

    public final int u() {
        if (this.h0.f2971a.q()) {
            return this.i0;
        }
        DU du = this.h0;
        return du.f2971a.h(du.b.f4977a, this.n).c;
    }

    public final boolean v() {
        Q();
        return this.h0.l;
    }

    public final int w() {
        Q();
        return this.h0.e;
    }

    public final boolean z() {
        Q();
        return this.h0.b.a();
    }
}
