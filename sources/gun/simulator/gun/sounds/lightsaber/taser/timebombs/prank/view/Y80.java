package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class Y80 extends G9 implements JI {
    public static final /* synthetic */ int A = 0;
    public final boolean h;
    public final Uri i;
    public final C3693iO j;
    public final InterfaceC4341pl k;
    public final C2497Im l;
    public final C4710tz m;
    public final InterfaceC3296dq n;
    public final G7 o;
    public final long p;
    public final DO q;
    public final LT r;
    public final ArrayList s;
    public InterfaceC4429ql t;
    public OI u;
    public PI v;
    public Bd0 w;
    public long x;
    public R80 y;
    public Handler z;

    static {
        AbstractC2944Zs.a("goog.exo.smoothstreaming");
    }

    public Y80(C3693iO c3693iO, InterfaceC4341pl interfaceC4341pl, LT lt, C2497Im c2497Im, C4710tz c4710tz, InterfaceC3296dq interfaceC3296dq, G7 g7, long j) {
        this.j = c3693iO;
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        this.y = null;
        Uri uri = Uri.EMPTY;
        Uri uriWithAppendedPath = c3341eO.f4269a;
        if (uriWithAppendedPath.equals(uri)) {
            uriWithAppendedPath = null;
        } else {
            int i = Ug0.f3833a;
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = Ug0.h.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.i = uriWithAppendedPath;
        this.k = interfaceC4341pl;
        this.r = lt;
        this.l = c2497Im;
        this.m = c4710tz;
        this.n = interfaceC3296dq;
        this.o = g7;
        this.p = j;
        this.q = a(null);
        this.h = false;
        this.s = new ArrayList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        DO doA = a(c5186zO);
        C3031aq c3031aq = new C3031aq(this.d.c, 0, c5186zO);
        R80 r80 = this.y;
        Bd0 bd0 = this.w;
        PI pi = this.v;
        X80 x80 = new X80(r80, this.l, bd0, this.m, this.n, c3031aq, this.o, doA, pi, c2833Vl);
        this.s.add(x80);
        return x80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        this.o.getClass();
        this.q.f(fi, mt.c);
        this.y = (R80) mt.f;
        this.x = j - j2;
        v();
        if (this.y.d) {
            this.z.postDelayed(new RunnableC2928Zc(this, 12), Math.max(0L, (this.x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        this.o.getClass();
        this.q.d(fi, mt.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        long jMin;
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        this.o.getClass();
        if (!(iOException instanceof KT) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof OA) && !(iOException instanceof NI)) {
            int i2 = C4604sl.b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof C4604sl) && ((C4604sl) cause).f4995a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        C2868Wu c2868WuB = jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? OI.f : OI.b(jMin, false);
        this.q.j(fi, mt.c, iOException, !c2868WuB.c());
        return c2868WuB;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() {
        this.v.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.w = bd0;
        InterfaceC3296dq interfaceC3296dq = this.n;
        interfaceC3296dq.prepare();
        Looper looperMyLooper = Looper.myLooper();
        WU wu = this.g;
        FW.t(wu);
        interfaceC3296dq.f(looperMyLooper, wu);
        if (this.h) {
            this.v = new C2498In(2);
            v();
            return;
        }
        this.t = this.k.createDataSource();
        OI oi = new OI("SsMediaSource");
        this.u = oi;
        this.v = oi;
        this.z = Ug0.m(null);
        w();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        X80 x80 = (X80) interfaceC4395qO;
        for (C2748Se c2748Se : x80.m) {
            c2748Se.m(null);
        }
        x80.k = null;
        this.s.remove(interfaceC4395qO);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        this.y = this.h ? this.y : null;
        this.t = null;
        this.x = 0L;
        OI oi = this.u;
        if (oi != null) {
            oi.e(null);
            this.u = null;
        }
        Handler handler = this.z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.z = null;
        }
        this.n.release();
    }

    public final void v() {
        S60 s60;
        C2748Se[] c2748SeArr;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                break;
            }
            X80 x80 = (X80) arrayList.get(i);
            R80 r80 = this.y;
            x80.l = r80;
            C2748Se[] c2748SeArr2 = x80.m;
            int length = c2748SeArr2.length;
            int i2 = 0;
            while (i2 < length) {
                C2705Qn c2705Qn = (C2705Qn) c2748SeArr2[i2].e;
                Q80[] q80Arr = c2705Qn.f.f;
                int i3 = c2705Qn.b;
                Q80 q80 = q80Arr[i3];
                int i4 = q80.k;
                Q80 q81 = r80.f[i3];
                if (i4 == 0 || q81.k == 0) {
                    c2748SeArr = c2748SeArr2;
                    c2705Qn.g += i4;
                } else {
                    int i5 = i4 - 1;
                    long[] jArr = q80.o;
                    long jB = q80.b(i5) + jArr[i5];
                    c2748SeArr = c2748SeArr2;
                    long j = q81.o[0];
                    if (jB <= j) {
                        c2705Qn.g += i4;
                    } else {
                        c2705Qn.g = Ug0.f(jArr, j, true) + c2705Qn.g;
                    }
                }
                c2705Qn.f = r80;
                i2++;
                c2748SeArr2 = c2748SeArr;
            }
            x80.k.o(x80);
            i++;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (Q80 q82 : this.y.f) {
            if (q82.k > 0) {
                long[] jArr2 = q82.o;
                jMax2 = Math.min(jMax2, jArr2[0]);
                int i6 = q82.k - 1;
                jMax = Math.max(jMax, q82.b(i6) + jArr2[i6]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j2 = this.y.d ? -9223372036854775807L : 0L;
            R80 r81 = this.y;
            boolean z = r81.d;
            s60 = new S60(j2, 0L, 0L, 0L, true, z, z, r81, this.j);
        } else {
            R80 r82 = this.y;
            if (r82.d) {
                long j3 = r82.h;
                if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j3 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j3);
                }
                long j4 = jMax2;
                long j5 = jMax - j4;
                long jL = j5 - Ug0.L(this.p);
                if (jL < 5000000) {
                    jL = Math.min(5000000L, j5 / 2);
                }
                s60 = new S60(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j5, j4, jL, true, true, true, this.y, this.j);
            } else {
                long j6 = r82.g;
                long j7 = j6 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j6 : jMax - jMax2;
                s60 = new S60(jMax2 + j7, j7, jMax2, 0L, true, false, false, this.y, this.j);
            }
        }
        p(s60);
    }

    public final void w() {
        if (this.u.c()) {
            return;
        }
        MT mt = new MT(this.t, this.i, 4, this.r);
        OI oi = this.u;
        G7 g7 = this.o;
        int i = mt.c;
        oi.f(mt, this, g7.A(i));
        this.q.l(new FI(mt.b), i, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }
}
