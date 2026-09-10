package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DU {
    public static final C5186zO s = new C5186zO(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gc0 f2971a;
    public final C5186zO b;
    public final long c;
    public final long d;
    public final int e;
    public final C2321Bs f;
    public final boolean g;
    public final C4062md0 h;
    public final C4941wd0 i;
    public final List j;
    public final C5186zO k;
    public final boolean l;
    public final int m;
    public final EU n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public DU(Gc0 gc0, C5186zO c5186zO, long j, long j2, int i, C2321Bs c2321Bs, boolean z, C4062md0 c4062md0, C4941wd0 c4941wd0, List list, C5186zO c5186zO2, boolean z2, int i2, EU eu, long j3, long j4, long j5, boolean z3) {
        this.f2971a = gc0;
        this.b = c5186zO;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = c2321Bs;
        this.g = z;
        this.h = c4062md0;
        this.i = c4941wd0;
        this.j = list;
        this.k = c5186zO2;
        this.l = z2;
        this.m = i2;
        this.n = eu;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.o = z3;
    }

    public static DU g(C4941wd0 c4941wd0) {
        Dc0 dc0 = Gc0.f3128a;
        C5186zO c5186zO = s;
        return new DU(dc0, c5186zO, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0L, 1, null, false, C4062md0.d, c4941wd0, C3965lY.e, c5186zO, false, 0, EU.d, 0L, 0L, 0L, false);
    }

    public final DU a(C5186zO c5186zO) {
        return new DU(this.f2971a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, c5186zO, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final DU b(C5186zO c5186zO, long j, long j2, long j3, long j4, C4062md0 c4062md0, C4941wd0 c4941wd0, List list) {
        return new DU(this.f2971a, c5186zO, j2, j3, this.e, this.f, this.g, c4062md0, c4941wd0, list, this.k, this.l, this.m, this.n, this.p, j4, j, this.o);
    }

    public final DU c(int i, boolean z) {
        return new DU(this.f2971a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.o);
    }

    public final DU d(C2321Bs c2321Bs) {
        return new DU(this.f2971a, this.b, this.c, this.d, this.e, c2321Bs, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final DU e(int i) {
        return new DU(this.f2971a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final DU f(Gc0 gc0) {
        return new DU(gc0, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }
}
