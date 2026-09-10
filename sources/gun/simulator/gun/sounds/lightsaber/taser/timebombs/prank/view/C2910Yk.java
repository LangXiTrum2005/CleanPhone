package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2910Yk implements JI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4037a;
    public final Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2910Yk(C2936Zk c2936Zk, int i) {
        this((Object) c2936Zk, 0);
        this.f4037a = i;
        int i2 = 1;
        if (i != 1) {
        } else {
            this((Object) c2936Zk, i2);
        }
    }

    public final void a(MT mt, long j, long j2) {
        int i = 1;
        switch (this.f4037a) {
            case 0:
                C2936Zk c2936Zk = (C2936Zk) this.b;
                c2936Zk.getClass();
                long j3 = mt.f3405a;
                Uri uri = mt.d.c;
                FI fi = new FI();
                c2936Zk.n.getClass();
                c2936Zk.q.f(fi, mt.c);
                C2676Pk c2676Pk = (C2676Pk) mt.f;
                C2676Pk c2676Pk2 = c2936Zk.H;
                int size = c2676Pk2 == null ? 0 : c2676Pk2.m.size();
                long j4 = c2676Pk.a(0).b;
                int i2 = 0;
                while (i2 < size && c2936Zk.H.a(i2).b < j4) {
                    i2++;
                }
                if (c2676Pk.d) {
                    if (size - i2 > c2676Pk.m.size()) {
                        AbstractC4038mJ.f();
                    } else {
                        long j5 = c2936Zk.N;
                        if (j5 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c2676Pk.h * 1000 > j5) {
                            c2936Zk.M = 0;
                        } else {
                            AbstractC4038mJ.f();
                        }
                    }
                    int i3 = c2936Zk.M;
                    c2936Zk.M = i3 + 1;
                    if (i3 < c2936Zk.n.A(mt.c)) {
                        c2936Zk.D.postDelayed(c2936Zk.v, Math.min((c2936Zk.M - 1) * 1000, 5000));
                        return;
                    } else {
                        c2936Zk.C = new C3124bu();
                        return;
                    }
                }
                c2936Zk.H = c2676Pk;
                c2936Zk.I = c2676Pk.d & c2936Zk.I;
                c2936Zk.J = j - j2;
                c2936Zk.K = j;
                synchronized (c2936Zk.t) {
                    try {
                        if (mt.b.f5150a == c2936Zk.F) {
                            Uri uri2 = c2936Zk.H.k;
                            if (uri2 == null) {
                                uri2 = mt.d.c;
                            }
                            c2936Zk.F = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (size != 0) {
                    c2936Zk.O += i2;
                    c2936Zk.x(true);
                    return;
                }
                C2676Pk c2676Pk3 = c2936Zk.H;
                if (!c2676Pk3.d) {
                    c2936Zk.x(true);
                    return;
                }
                Ig0 ig0 = c2676Pk3.i;
                if (ig0 == null) {
                    c2936Zk.w();
                    return;
                }
                String str = ig0.b;
                if (Ug0.a(str, "urn:mpeg:dash:utc:direct:2014") || Ug0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        c2936Zk.L = Ug0.O(ig0.c) - c2936Zk.K;
                        c2936Zk.x(true);
                        return;
                    } catch (KT e) {
                        AbstractC4038mJ.d("Failed to resolve time offset.", e);
                        c2936Zk.x(true);
                        return;
                    }
                }
                if (Ug0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || Ug0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    MT mt2 = new MT(c2936Zk.z, Uri.parse(ig0.c), 5, new C2884Xk());
                    c2936Zk.A.f(mt2, new C2910Yk(c2936Zk, i), 1);
                    c2936Zk.q.l(new FI(mt2.b), mt2.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                    return;
                } else if (Ug0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Ug0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    MT mt3 = new MT(c2936Zk.z, Uri.parse(ig0.c), 5, new C4710tz((AbstractC5044xl) null));
                    c2936Zk.A.f(mt3, new C2910Yk(c2936Zk, i), 1);
                    c2936Zk.q.l(new FI(mt3.b), mt3.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                    return;
                } else if (Ug0.a(str, "urn:mpeg:dash:utc:ntp:2014") || Ug0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    c2936Zk.w();
                    return;
                } else {
                    AbstractC4038mJ.d("Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                    c2936Zk.x(true);
                    return;
                }
            default:
                C2936Zk c2936Zk2 = (C2936Zk) this.b;
                c2936Zk2.getClass();
                long j6 = mt.f3405a;
                Uri uri3 = mt.d.c;
                FI fi2 = new FI();
                c2936Zk2.n.getClass();
                c2936Zk2.q.f(fi2, mt.c);
                c2936Zk2.L = ((Long) mt.f).longValue() - j;
                c2936Zk2.x(true);
                return;
        }
    }

    public final C2868Wu b(MT mt, IOException iOException, int i) {
        long jMin;
        int i2 = this.f4037a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                C2936Zk c2936Zk = (C2936Zk) obj;
                c2936Zk.getClass();
                long j = mt.f3405a;
                Uri uri = mt.d.c;
                FI fi = new FI();
                c2936Zk.n.getClass();
                if ((iOException instanceof KT) || (iOException instanceof FileNotFoundException) || (iOException instanceof OA) || (iOException instanceof NI)) {
                    jMin = -9223372036854775807L;
                } else {
                    int i3 = C4604sl.b;
                    Throwable cause = iOException;
                    while (true) {
                        if (cause == null) {
                            jMin = Math.min((i - 1) * 1000, 5000);
                        } else if ((cause instanceof C4604sl) && ((C4604sl) cause).f4995a == 2008) {
                            jMin = -9223372036854775807L;
                        } else {
                            cause = cause.getCause();
                        }
                    }
                }
                C2868Wu c2868WuB = jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? OI.f : OI.b(jMin, false);
                c2936Zk.q.j(fi, mt.c, iOException, true ^ c2868WuB.c());
                return c2868WuB;
            default:
                C2936Zk c2936Zk2 = (C2936Zk) obj;
                c2936Zk2.getClass();
                long j2 = mt.f3405a;
                Uri uri2 = mt.d.c;
                c2936Zk2.q.j(new FI(), mt.c, iOException, true);
                c2936Zk2.n.getClass();
                AbstractC4038mJ.d("Failed to resolve time offset.", iOException);
                c2936Zk2.x(true);
                return OI.e;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        boolean z;
        switch (this.f4037a) {
            case 0:
                a((MT) li, j, j2);
                return;
            case 1:
                a((MT) li, j, j2);
                return;
            default:
                InterfaceC3059b80 interfaceC3059b80 = (InterfaceC3059b80) this.b;
                if (interfaceC3059b80 != null) {
                    synchronized (AbstractC3147c80.b) {
                        z = AbstractC3147c80.c;
                        break;
                    }
                    if (z) {
                        ((C2832Vk) interfaceC3059b80).a();
                        return;
                    }
                    IOException iOException = new IOException(new ConcurrentModificationException());
                    C2936Zk c2936Zk = ((C2832Vk) interfaceC3059b80).f3889a;
                    c2936Zk.getClass();
                    AbstractC4038mJ.d("Failed to resolve time offset.", iOException);
                    c2936Zk.x(true);
                    return;
                }
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        Object obj = this.b;
        int i = this.f4037a;
        switch (i) {
            case 0:
                MT mt = (MT) li;
                switch (i) {
                    case 0:
                        C2936Zk c2936Zk = (C2936Zk) obj;
                        c2936Zk.getClass();
                        long j3 = mt.f3405a;
                        Uri uri = mt.d.c;
                        FI fi = new FI();
                        c2936Zk.n.getClass();
                        c2936Zk.q.d(fi, mt.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                        break;
                    default:
                        C2936Zk c2936Zk2 = (C2936Zk) obj;
                        c2936Zk2.getClass();
                        long j4 = mt.f3405a;
                        Uri uri2 = mt.d.c;
                        FI fi2 = new FI();
                        c2936Zk2.n.getClass();
                        c2936Zk2.q.d(fi2, mt.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                        break;
                }
                break;
            case 1:
                MT mt2 = (MT) li;
                switch (i) {
                    case 0:
                        C2936Zk c2936Zk3 = (C2936Zk) obj;
                        c2936Zk3.getClass();
                        long j5 = mt2.f3405a;
                        Uri uri3 = mt2.d.c;
                        FI fi3 = new FI();
                        c2936Zk3.n.getClass();
                        c2936Zk3.q.d(fi3, mt2.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                        break;
                    default:
                        C2936Zk c2936Zk4 = (C2936Zk) obj;
                        c2936Zk4.getClass();
                        long j6 = mt2.f3405a;
                        Uri uri4 = mt2.d.c;
                        FI fi4 = new FI();
                        c2936Zk4.n.getClass();
                        c2936Zk4.q.d(fi4, mt2.c, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                        break;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        switch (this.f4037a) {
            case 0:
                return b((MT) li, iOException, i);
            case 1:
                return b((MT) li, iOException, i);
            default:
                InterfaceC3059b80 interfaceC3059b80 = (InterfaceC3059b80) this.b;
                if (interfaceC3059b80 != null) {
                    C2936Zk c2936Zk = ((C2832Vk) interfaceC3059b80).f3889a;
                    c2936Zk.getClass();
                    AbstractC4038mJ.d("Failed to resolve time offset.", iOException);
                    c2936Zk.x(true);
                }
                return OI.e;
        }
    }

    public /* synthetic */ C2910Yk(Object obj, int i) {
        this.f4037a = i;
        this.b = obj;
    }
}
