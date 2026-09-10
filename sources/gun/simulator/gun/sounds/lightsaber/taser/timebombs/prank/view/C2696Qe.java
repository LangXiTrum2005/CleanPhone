package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2696Qe implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2748Se f3611a;
    public final V20 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ C2748Se e;

    public C2696Qe(C2748Se c2748Se, C2748Se c2748Se2, V20 v20, int i) {
        this.e = c2748Se;
        this.f3611a = c2748Se2;
        this.b = v20;
        this.c = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        C2748Se c2748Se = this.e;
        if (c2748Se.i()) {
            return -3;
        }
        D9 d9 = c2748Se.v;
        V20 v20 = this.b;
        if (d9 != null && d9.c(this.c + 1) <= v20.q()) {
            return -3;
        }
        b();
        return v20.A(c3692iN, c2677Pl, i, c2748Se.w);
    }

    public final void b() {
        if (this.d) {
            return;
        }
        C2748Se c2748Se = this.e;
        DO r1 = c2748Se.g;
        int[] iArr = c2748Se.b;
        int i = this.c;
        r1.b(iArr[i], c2748Se.c[i], 0, null, c2748Se.t);
        this.d = true;
    }

    public final void c() {
        C2748Se c2748Se = this.e;
        boolean[] zArr = c2748Se.d;
        int i = this.c;
        FW.s(zArr[i]);
        c2748Se.d[i] = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        C2748Se c2748Se = this.e;
        return !c2748Se.i() && this.b.v(c2748Se.w);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        C2748Se c2748Se = this.e;
        if (c2748Se.i()) {
            return 0;
        }
        boolean z = c2748Se.w;
        V20 v20 = this.b;
        int iS = v20.s(j, z);
        D9 d9 = c2748Se.v;
        if (d9 != null) {
            iS = Math.min(iS, d9.c(this.c + 1) - v20.q());
        }
        v20.G(iS);
        if (iS > 0) {
            b();
        }
        return iS;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() {
    }
}
