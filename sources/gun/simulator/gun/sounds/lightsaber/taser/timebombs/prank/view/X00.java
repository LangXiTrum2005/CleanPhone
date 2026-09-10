package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class X00 implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3951a;
    public final /* synthetic */ Y00 b;

    public X00(Y00 y00, int i) {
        this.b = y00;
        this.f3951a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        Y00 y00 = this.b;
        if (y00.q) {
            return -3;
        }
        W00 w00 = (W00) y00.e.get(this.f3951a);
        return w00.c.A(c3692iN, c2677Pl, i, w00.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        Y00 y00 = this.b;
        if (!y00.q) {
            W00 w00 = (W00) y00.e.get(this.f3951a);
            if (w00.c.v(w00.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() throws C3124bu {
        C3124bu c3124bu = this.b.l;
        if (c3124bu != null) {
            throw c3124bu;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        Y00 y00 = this.b;
        if (y00.q) {
            return -3;
        }
        W00 w00 = (W00) y00.e.get(this.f3951a);
        V20 v20 = w00.c;
        int iS = v20.s(j, w00.d);
        v20.G(iS);
        return iS;
    }
}
