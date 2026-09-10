package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4029mA implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5059xw f4686a;
    public boolean b;
    public final /* synthetic */ C4556sA c;

    public AbstractC4029mA(C4556sA c4556sA) {
        AbstractC2995aW.q(c4556sA, "this$0");
        this.c = c4556sA;
        this.f4686a = new C5059xw(c4556sA.c.timeout());
    }

    public final void h() {
        C4556sA c4556sA = this.c;
        int i = c4556sA.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(c4556sA.e), "state: "));
        }
        C5059xw c5059xw = this.f4686a;
        Ic0 ic0 = c5059xw.e;
        c5059xw.e = Ic0.d;
        ic0.a();
        ic0.b();
        c4556sA.e = 6;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public long read(C4848vb c4848vb, long j) {
        C4556sA c4556sA = this.c;
        AbstractC2995aW.q(c4848vb, "sink");
        try {
            return c4556sA.c.read(c4848vb, j);
        } catch (IOException e) {
            c4556sA.b.l();
            h();
            throw e;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.f4686a;
    }
}
