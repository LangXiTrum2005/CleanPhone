package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4117nA implements InterfaceC4463r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5059xw f4733a;
    public boolean b;
    public final /* synthetic */ C4556sA c;

    public C4117nA(C4556sA c4556sA) {
        AbstractC2995aW.q(c4556sA, "this$0");
        this.c = c4556sA;
        this.f4733a = new C5059xw(c4556sA.d.timeout());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.d.A("0\r\n\r\n");
        C4556sA c4556sA = this.c;
        C5059xw c5059xw = this.f4733a;
        c4556sA.getClass();
        Ic0 ic0 = c5059xw.e;
        c5059xw.e = Ic0.d;
        ic0.a();
        ic0.b();
        this.c.e = 3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "source");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return;
        }
        C4556sA c4556sA = this.c;
        c4556sA.d.M(j);
        InterfaceC2434Gb interfaceC2434Gb = c4556sA.d;
        interfaceC2434Gb.A("\r\n");
        interfaceC2434Gb.d(c4848vb, j);
        interfaceC2434Gb.A("\r\n");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        this.c.d.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final Ic0 timeout() {
        return this.f4733a;
    }
}
