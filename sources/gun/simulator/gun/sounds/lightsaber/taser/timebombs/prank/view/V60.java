package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class V60 implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3860a;
    public boolean b;
    public final /* synthetic */ X60 c;

    public V60(X60 x60) {
        this.c = x60;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        b();
        X60 x60 = this.c;
        boolean z = x60.l;
        if (z && x60.m == null) {
            this.f3860a = 2;
        }
        int i2 = this.f3860a;
        if (i2 == 2) {
            c2677Pl.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c3692iN.c = x60.j;
            this.f3860a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        x60.m.getClass();
        c2677Pl.a(1);
        c2677Pl.f = 0L;
        if ((i & 4) == 0) {
            c2677Pl.g(x60.n);
            c2677Pl.d.put(x60.m, 0, x60.n);
        }
        if ((i & 1) == 0) {
            this.f3860a = 2;
        }
        return -4;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        X60 x60 = this.c;
        x60.e.b(AbstractC5011xP.i(x60.j.l), x60.j, 0, null, 0L);
        this.b = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        return this.c.l;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() throws IOException {
        X60 x60 = this.c;
        if (x60.k) {
            return;
        }
        x60.i.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        b();
        if (j <= 0 || this.f3860a == 2) {
            return 0;
        }
        this.f3860a = 2;
        return 1;
    }
}
