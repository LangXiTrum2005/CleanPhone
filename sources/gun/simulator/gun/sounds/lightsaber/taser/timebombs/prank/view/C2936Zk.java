package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2936Zk extends G9 {
    public OI A;
    public Bd0 B;
    public C3124bu C;
    public Handler D;
    public C3164cO E;
    public Uri F;
    public final Uri G;
    public C2676Pk H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final C3693iO h;
    public final boolean i;
    public final InterfaceC4341pl j;
    public final C2497Im k;
    public final C4710tz l;
    public final InterfaceC3296dq m;
    public final G7 n;
    public final C3844k50 o;
    public final long p;
    public final DO q;
    public final LT r;
    public final C2910Yk s;
    public final Object t;
    public final SparseArray u;
    public final RunnableC2806Uk v;
    public final RunnableC2806Uk w;
    public final Wm0 x;
    public final PI y;
    public InterfaceC4429ql z;

    static {
        AbstractC2944Zs.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uk] */
    /* JADX WARN: Type inference failed for: r2v11, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uk] */
    public C2936Zk(C3693iO c3693iO, InterfaceC4341pl interfaceC4341pl, LT lt, C2497Im c2497Im, C4710tz c4710tz, InterfaceC3296dq interfaceC3296dq, G7 g7, long j) {
        this.h = c3693iO;
        this.E = c3693iO.c;
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        Uri uri = c3341eO.f4269a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.j = interfaceC4341pl;
        this.r = lt;
        this.k = c2497Im;
        this.m = interfaceC3296dq;
        this.n = g7;
        this.p = j;
        this.l = c4710tz;
        this.o = new C3844k50(5);
        final int i = 0;
        this.i = false;
        this.q = a(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new Wm0(this);
        this.N = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.L = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.s = new C2910Yk(this, i);
        this.y = new C2832Vk(this);
        this.v = new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uk
            public final /* synthetic */ C2936Zk b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                C2936Zk c2936Zk = this.b;
                switch (i2) {
                    case 0:
                        c2936Zk.y();
                        break;
                    default:
                        c2936Zk.x(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uk
            public final /* synthetic */ C2936Zk b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                C2936Zk c2936Zk = this.b;
                switch (i3) {
                    case 0:
                        c2936Zk.y();
                        break;
                    default:
                        c2936Zk.x(false);
                        break;
                }
            }
        };
    }

    public static boolean v(C3259dU c3259dU) {
        int i = 0;
        while (true) {
            List list = c3259dU.c;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((X2) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        int iIntValue = ((Integer) c5186zO.f4977a).intValue() - this.O;
        DO r13 = new DO(this.c.c, 0, c5186zO, this.H.a(iIntValue).b);
        C3031aq c3031aq = new C3031aq(this.d.c, 0, c5186zO);
        int i = this.O + iIntValue;
        C2676Pk c2676Pk = this.H;
        Bd0 bd0 = this.B;
        long j2 = this.L;
        WU wu = this.g;
        FW.t(wu);
        C2780Tk c2780Tk = new C2780Tk(i, c2676Pk, this.o, iIntValue, this.k, bd0, this.m, c3031aq, this.n, r13, j2, this.y, c2833Vl, this.l, this.x, wu);
        this.u.put(i, c2780Tk);
        return c2780Tk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() {
        this.y.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.B = bd0;
        InterfaceC3296dq interfaceC3296dq = this.m;
        interfaceC3296dq.prepare();
        Looper looperMyLooper = Looper.myLooper();
        WU wu = this.g;
        FW.t(wu);
        interfaceC3296dq.f(looperMyLooper, wu);
        if (this.i) {
            x(false);
            return;
        }
        this.z = this.j.createDataSource();
        this.A = new OI("DashMediaSource");
        this.D = Ug0.m(null);
        y();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        C2780Tk c2780Tk = (C2780Tk) interfaceC4395qO;
        UU uu = c2780Tk.m;
        uu.i = true;
        uu.d.removeCallbacksAndMessages(null);
        for (C2748Se c2748Se : c2780Tk.r) {
            c2748Se.m(c2780Tk);
        }
        c2780Tk.q = null;
        this.u.remove(c2780Tk.f3788a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        this.I = false;
        this.z = null;
        OI oi = this.A;
        if (oi != null) {
            oi.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.M = 0;
        this.N = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.O = 0;
        this.u.clear();
        C3844k50 c3844k50 = this.o;
        ((Map) c3844k50.b).clear();
        ((Map) c3844k50.c).clear();
        ((Map) c3844k50.d).clear();
        this.m.release();
    }

    public final void w() {
        boolean z;
        OI oi = this.A;
        C2832Vk c2832Vk = new C2832Vk(this);
        synchronized (AbstractC3147c80.b) {
            z = AbstractC3147c80.c;
        }
        if (z) {
            c2832Vk.a();
            return;
        }
        if (oi == null) {
            oi = new OI("SntpClient");
        }
        oi.f(new C2498In(), new C2910Yk(c2832Vk, 2), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x028c  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:156:0x0302  */
    /* JADX WARN: Code duplicated, block: B:239:0x04b5  */
    public final void x(boolean z) {
        C3259dU c3259dU;
        List list;
        boolean z2;
        long j;
        long j2;
        long j3;
        InterfaceC3021al interfaceC3021alB;
        long jMin;
        float f;
        float f2;
        C3076bO c3076bO;
        long j4;
        boolean z3 = false;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.u;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt >= this.O) {
                C2780Tk c2780Tk = (C2780Tk) sparseArray.valueAt(i);
                C2676Pk c2676Pk = this.H;
                int i2 = iKeyAt - this.O;
                c2780Tk.u = c2676Pk;
                c2780Tk.v = i2;
                UU uu = c2780Tk.m;
                uu.h = z3;
                uu.f = c2676Pk;
                Iterator it = uu.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < uu.f.h) {
                        it.remove();
                    }
                }
                C2748Se[] c2748SeArr = c2780Tk.r;
                if (c2748SeArr != null) {
                    for (C2748Se c2748Se : c2748SeArr) {
                        C2575Lm c2575Lm = (C2575Lm) ((InterfaceC2650Ok) c2748Se.e);
                        C2523Jm[] c2523JmArr = c2575Lm.h;
                        try {
                            c2575Lm.j = c2676Pk;
                            c2575Lm.k = i2;
                            long jC = c2676Pk.c(i2);
                            ArrayList arrayListA = c2575Lm.a();
                            for (int i3 = 0; i3 < c2523JmArr.length; i3++) {
                                c2523JmArr[i3] = c2523JmArr[i3].a(jC, (FY) arrayListA.get(c2575Lm.i.getIndexInTrackGroup(i3)));
                            }
                        } catch (C3529ga e) {
                            c2575Lm.l = e;
                        }
                    }
                    c2780Tk.q.o(c2780Tk);
                }
                c2780Tk.w = c2676Pk.a(i2).d;
                for (C3474fs c3474fs : c2780Tk.s) {
                    for (C3650hs c3650hs : c2780Tk.w) {
                        if (c3650hs.a().equals(c3474fs.e.a())) {
                            c3474fs.b(c3650hs, c2676Pk.d && i2 == c2676Pk.m.size() - 1);
                            break;
                        }
                    }
                }
            }
            i++;
            z3 = false;
        }
        C3259dU c3259dUA = this.H.a(0);
        int size = this.H.m.size() - 1;
        C3259dU c3259dUA2 = this.H.a(size);
        long jC2 = this.H.c(size);
        long jL = Ug0.L(Ug0.x(this.L));
        long jC3 = this.H.c(0);
        long jL2 = Ug0.L(c3259dUA.b);
        boolean zV = v(c3259dUA);
        long jMax = jL2;
        int i4 = 0;
        while (true) {
            List list2 = c3259dUA.c;
            c3259dU = c3259dUA;
            boolean z4 = zV;
            if (i4 >= list2.size()) {
                jL2 = jMax;
                break;
            }
            X2 x2 = (X2) list2.get(i4);
            List list3 = x2.c;
            int i5 = x2.b;
            boolean z5 = (i5 == 1 || i5 == 2) ? false : true;
            if ((!z4 || !z5) && !list3.isEmpty()) {
                InterfaceC3021al interfaceC3021alB2 = ((FY) list3.get(0)).b();
                if (interfaceC3021alB2 == null || interfaceC3021alB2.v(jC3, jL) == 0) {
                    break;
                } else {
                    jMax = Math.max(jMax, interfaceC3021alB2.getTimeUs(interfaceC3021alB2.e(jC3, jL)) + jL2);
                }
            }
            i4++;
            c3259dUA = c3259dU;
            zV = z4;
        }
        long jL3 = Ug0.L(c3259dUA2.b);
        boolean zV2 = v(c3259dUA2);
        long jMin2 = Long.MAX_VALUE;
        int i6 = 0;
        while (true) {
            list = c3259dUA2.c;
            if (i6 >= list.size()) {
                jL3 = jMin2;
                break;
            }
            X2 x3 = (X2) list.get(i6);
            List list4 = x3.c;
            int i7 = x3.b;
            C3259dU c3259dU2 = c3259dUA2;
            boolean z6 = (i7 == 1 || i7 == 2) ? false : true;
            if ((!zV2 || !z6) && !list4.isEmpty()) {
                InterfaceC3021al interfaceC3021alB3 = ((FY) list4.get(0)).b();
                if (interfaceC3021alB3 == null) {
                    jL3 += jC2;
                } else {
                    long jV = interfaceC3021alB3.v(jC2, jL);
                    if (jV != 0) {
                        long jE = (interfaceC3021alB3.e(jC2, jL) + jV) - 1;
                        long timeUs = interfaceC3021alB3.getTimeUs(jE) + jL3;
                        j4 = jC2;
                        jMin2 = Math.min(jMin2, interfaceC3021alB3.c(jE, j4) + timeUs);
                    }
                }
                break;
            }
            j4 = jC2;
            i6++;
            jC2 = j4;
            c3259dUA2 = c3259dU2;
            jL3 = jL3;
        }
        if (!this.H.d) {
            z2 = false;
            break;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= list.size()) {
                z2 = true;
                break;
            }
            InterfaceC3021al interfaceC3021alB4 = ((FY) ((X2) list.get(i8)).c.get(0)).b();
            if (interfaceC3021alB4 == null || interfaceC3021alB4.t()) {
                z2 = false;
                break;
            }
            i8++;
        }
        if (z2) {
            long j5 = this.H.f;
            if (j5 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jL2 = Math.max(jL2, jL3 - Ug0.L(j5));
            }
        }
        long j6 = jL3 - jL2;
        C2676Pk c2676Pk2 = this.H;
        if (c2676Pk2.d) {
            FW.s(c2676Pk2.f3569a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            long jL4 = (jL - Ug0.L(this.H.f3569a)) - jL2;
            long jW = Ug0.W(jL4);
            C3693iO c3693iO = this.h;
            long j7 = c3693iO.c.c;
            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jMin = Math.min(jW, j7);
            } else {
                C3076bO c3076bO2 = this.H.j;
                if (c3076bO2 != null) {
                    long j8 = c3076bO2.c;
                    if (j8 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        jMin = Math.min(jW, j8);
                    } else {
                        jMin = jW;
                    }
                } else {
                    jMin = jW;
                }
            }
            long jW2 = Ug0.W(jL4 - j6);
            if (jW2 < 0 && jMin > 0) {
                jW2 = 0;
            }
            j = jL2;
            long j9 = this.H.c;
            long jMin3 = j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? Math.min(jW2 + j9, jW) : jW2;
            C3164cO c3164cO = c3693iO.c;
            long j10 = c3164cO.b;
            if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jMin3 = Ug0.k(j10, jMin3, jW);
            } else {
                C3076bO c3076bO3 = this.H.j;
                if (c3076bO3 != null) {
                    long j11 = c3076bO3.b;
                    if (j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        jMin3 = Ug0.k(j11, jMin3, jW);
                    }
                }
            }
            long j12 = jMin3;
            long j13 = j12 > jMin ? j12 : jMin;
            long jK = this.E.f4220a;
            if (jK == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                C2676Pk c2676Pk3 = this.H;
                C3076bO c3076bO4 = c2676Pk3.j;
                if (c3076bO4 != null) {
                    long j14 = c3076bO4.f4168a;
                    if (j14 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        jK = j14;
                    } else {
                        jK = c2676Pk3.g;
                        if (jK == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            jK = this.p;
                        }
                    }
                } else {
                    jK = c2676Pk3.g;
                    if (jK == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        jK = this.p;
                    }
                }
            }
            if (jK < j12) {
                jK = j12;
            }
            if (jK > j13) {
                jK = Ug0.k(Ug0.W(jL4 - Math.min(5000000L, j6 / 2)), j12, j13);
            }
            long j15 = jK;
            float f3 = c3164cO.d;
            if (f3 == -3.4028235E38f) {
                C3076bO c3076bO5 = this.H.j;
                f3 = c3076bO5 != null ? c3076bO5.d : -3.4028235E38f;
            }
            float f4 = c3164cO.e;
            if (f4 == -3.4028235E38f) {
                C3076bO c3076bO6 = this.H.j;
                f4 = c3076bO6 != null ? c3076bO6.e : -3.4028235E38f;
            }
            if (f3 == -3.4028235E38f && f4 == -3.4028235E38f && ((c3076bO = this.H.j) == null || c3076bO.f4168a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET)) {
                f = 1.0f;
                f2 = 1.0f;
            } else {
                f = f3;
                f2 = f4;
            }
            this.E = new C3164cO(j15, j12, j13, f, f2);
            long jW3 = Ug0.W(j) + this.H.f3569a;
            long jL5 = jL4 - Ug0.L(this.E.f4220a);
            long jMin4 = Math.min(5000000L, j6 / 2);
            j3 = jL5 < jMin4 ? jMin4 : jL5;
            j2 = jW3;
        } else {
            j = jL2;
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long jL6 = j - Ug0.L(c3259dU.b);
        C2676Pk c2676Pk4 = this.H;
        p(new C2858Wk(c2676Pk4.f3569a, j2, this.L, this.O, jL6, j6, j3, c2676Pk4, this.h, c2676Pk4.d ? this.E : null));
        if (this.i) {
            return;
        }
        Handler handler = this.D;
        RunnableC2806Uk runnableC2806Uk = this.w;
        handler.removeCallbacks(runnableC2806Uk);
        if (z2) {
            Handler handler2 = this.D;
            C2676Pk c2676Pk5 = this.H;
            long jX = Ug0.x(this.L);
            int size2 = c2676Pk5.m.size() - 1;
            C3259dU c3259dUA3 = c2676Pk5.a(size2);
            long jL7 = Ug0.L(c3259dUA3.b);
            long jC4 = c2676Pk5.c(size2);
            long jL8 = Ug0.L(jX);
            long jL9 = Ug0.L(c2676Pk5.f3569a);
            long jL10 = Ug0.L(5000L);
            int i9 = 0;
            while (true) {
                List list5 = c3259dUA3.c;
                if (i9 >= list5.size()) {
                    break;
                }
                List list6 = ((X2) list5.get(i9)).c;
                if (!list6.isEmpty() && (interfaceC3021alB = ((FY) list6.get(0)).b()) != null) {
                    long jF = (interfaceC3021alB.f(jC4, jL8) + (jL9 + jL7)) - jL8;
                    if (jF < jL10 - 100000 || (jF > jL10 && jF < jL10 + 100000)) {
                        jL10 = jF;
                    }
                }
                i9++;
            }
            RoundingMode roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            long j16 = jL10 / 1000;
            long j17 = jL10 - (1000 * j16);
            if (j17 != 0) {
                int i10 = 1 | ((int) ((jL10 ^ 1000) >> 63));
                switch (BJ.f2865a[roundingMode.ordinal()]) {
                    case 1:
                        if (j17 != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        if (i10 < 0) {
                            j16 += (long) i10;
                        }
                        break;
                    case 4:
                        j16 += (long) i10;
                        break;
                    case 5:
                        if (i10 > 0) {
                            j16 += (long) i10;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j17);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 != 0 ? jAbs2 > 0 : !(roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (j16 & 1) == 0))) {
                            j16 += (long) i10;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler2.postDelayed(runnableC2806Uk, j16);
        }
        if (this.I) {
            y();
            return;
        }
        if (z) {
            C2676Pk c2676Pk6 = this.H;
            if (c2676Pk6.d) {
                long j18 = c2676Pk6.e;
                if (j18 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.D.postDelayed(this.v, Math.max(0L, (this.J + (j18 == 0 ? 5000L : j18)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void y() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        MT mt = new MT(this.z, uri, 4, this.r);
        this.A.f(mt, this.s, this.n.A(4));
        this.q.l(new FI(mt.b), mt.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }
}
