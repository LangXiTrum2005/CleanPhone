package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class DO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2968a;
    public final C5186zO b;
    public final CopyOnWriteArrayList c;
    public final long d;

    public DO(CopyOnWriteArrayList copyOnWriteArrayList, int i, C5186zO c5186zO, long j) {
        this.c = copyOnWriteArrayList;
        this.f2968a = i;
        this.b = c5186zO;
        this.d = j;
    }

    public final long a(long j) {
        long jW = Ug0.W(j);
        return jW == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : this.d + jW;
    }

    public final void b(int i, C4619sw c4619sw, int i2, Object obj, long j) {
        c(new C3779jO(1, i, c4619sw, i2, obj, a(j), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
    }

    public final void c(C3779jO c3779jO) {
        for (CO co : this.c) {
            Ug0.P(co.f2918a, new RunnableC4746uO(this, co.b, c3779jO, 4));
        }
    }

    public final void d(FI fi, int i, int i2, C4619sw c4619sw, int i3, Object obj, long j, long j2) {
        e(fi, new C3779jO(i, i2, c4619sw, i3, obj, a(j), a(j2)));
    }

    public final void e(FI fi, C3779jO c3779jO) {
        for (CO co : this.c) {
            Ug0.P(co.f2918a, new BO(this, co.b, fi, c3779jO, 1));
        }
    }

    public final void f(FI fi, int i) {
        g(fi, i, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    public final void g(FI fi, int i, int i2, C4619sw c4619sw, int i3, Object obj, long j, long j2) {
        h(fi, new C3779jO(i, i2, c4619sw, i3, obj, a(j), a(j2)));
    }

    public final void h(FI fi, C3779jO c3779jO) {
        for (CO co : this.c) {
            Ug0.P(co.f2918a, new BO(this, co.b, fi, c3779jO, 0));
        }
    }

    public final void i(FI fi, int i, int i2, C4619sw c4619sw, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        k(fi, new C3779jO(i, i2, c4619sw, i3, obj, a(j), a(j2)), iOException, z);
    }

    public final void j(FI fi, int i, IOException iOException, boolean z) {
        i(fi, i, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, iOException, z);
    }

    public final void k(FI fi, C3779jO c3779jO, IOException iOException, boolean z) {
        for (CO co : this.c) {
            Ug0.P(co.f2918a, new KO(this, co.b, fi, c3779jO, iOException, z, 1));
        }
    }

    public final void l(FI fi, int i, int i2, C4619sw c4619sw, int i3, Object obj, long j, long j2) {
        m(fi, new C3779jO(i, i2, c4619sw, i3, obj, a(j), a(j2)));
    }

    public final void m(FI fi, C3779jO c3779jO) {
        for (CO co : this.c) {
            Ug0.P(co.f2918a, new BO(this, co.b, fi, c3779jO, 2));
        }
    }

    public final void n(C3779jO c3779jO) {
        C5186zO c5186zO = this.b;
        c5186zO.getClass();
        for (CO co : this.c) {
            Ug0.P(co.f2918a, new RunnableC5099yP(this, co.b, c5186zO, c3779jO, 2));
        }
    }
}
